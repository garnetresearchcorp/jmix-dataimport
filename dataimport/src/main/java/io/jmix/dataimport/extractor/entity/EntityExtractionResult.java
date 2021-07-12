/*
 * Copyright 2021 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.jmix.dataimport.extractor.entity;

import io.jmix.dataimport.extractor.data.ImportedDataItem;

import java.util.ArrayList;
import java.util.List;

public class EntityExtractionResult {
    protected ImportedDataItem importedDataItem;
    protected Object entity;

    public EntityExtractionResult(Object entity, ImportedDataItem importedDataItem) {
        this.importedDataItem = importedDataItem;
        this.entity = entity;
    }

    public Object getEntity() {
        return entity;
    }

    public EntityExtractionResult setEntity(Object entity) {
        this.entity = entity;
        return this;
    }
    public ImportedDataItem getImportedDataItem() {
        return importedDataItem;
    }

    public EntityExtractionResult setImportedDataItem(ImportedDataItem importedDataItem) {
        this.importedDataItem = importedDataItem;
        return this;
    }
}
