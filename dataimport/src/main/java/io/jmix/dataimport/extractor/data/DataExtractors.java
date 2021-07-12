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

package io.jmix.dataimport.extractor.data;

import io.jmix.dataimport.extractor.data.impl.CsvDataExtractor;
import io.jmix.dataimport.extractor.data.impl.ExcelDataExtractor;
import io.jmix.dataimport.extractor.data.impl.JsonDataExtractor;
import io.jmix.dataimport.extractor.data.impl.XmlDataExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("datimp_DataExtractors")
public class DataExtractors {
    @Autowired
    protected ApplicationContext applicationContext;

    public DataExtractor getExtractor(String fileExtension) {
        switch (fileExtension) {
            case "csv":
                return applicationContext.getBean(CsvDataExtractor.class);
            case "xlsx":
                return applicationContext.getBean(ExcelDataExtractor.class);
            case "json":
                return applicationContext.getBean(JsonDataExtractor.class);
            case "xml":
                return applicationContext.getBean(XmlDataExtractor.class);
            default:
                throw new IllegalArgumentException(String.format("File extension [%s] is not supported for import", fileExtension));
        }
    }
}
