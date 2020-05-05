/*
 * Copyright 2019 liaochong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.liaochong.myexcel.core;

import com.github.liaochong.myexcel.core.constant.AllConverter;
import com.github.liaochong.myexcel.core.constant.CsvConverter;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liaochong
 * @version 1.0
 */
public class ConvertContext {
    /**
     * {@link com.github.liaochong.myexcel.core.annotation.ExcelModel} setting
     */
    private Configuration configuration = new Configuration();

    /**
     * {@link com.github.liaochong.myexcel.core.annotation.ExcelColumn} mapping
     */
    private Map<Field, ExcelColumnMapping> excelColumnMappingMap = new HashMap<>();
    /**
     * csv or excel
     */
    private Class converterType;

    private boolean isConvertCsv;

    private Map<Field, List<Field>> fieldOwnership;

    public ConvertContext(boolean isConvertCsv) {
        this(isConvertCsv, null);
    }

    public ConvertContext(boolean isConvertCsv, Map<Field, List<Field>> fieldOwnership) {
        this.isConvertCsv = isConvertCsv;
        this.fieldOwnership = fieldOwnership;
        this.converterType = isConvertCsv ? CsvConverter.class : AllConverter.class;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Map<Field, ExcelColumnMapping> getExcelColumnMappingMap() {
        return excelColumnMappingMap;
    }

    public void setExcelColumnMappingMap(Map<Field, ExcelColumnMapping> excelColumnMappingMap) {
        this.excelColumnMappingMap = excelColumnMappingMap;
    }

    public Class getConverterType() {
        return converterType;
    }

    public void setConverterType(Class converterType) {
        this.converterType = converterType;
    }

    public boolean isConvertCsv() {
        return isConvertCsv;
    }

    public void setConvertCsv(boolean convertCsv) {
        isConvertCsv = convertCsv;
    }

    public Map<Field, List<Field>> getFieldOwnership() {
        return fieldOwnership;
    }

    public void setFieldOwnership(Map<Field, List<Field>> fieldOwnership) {
        this.fieldOwnership = fieldOwnership;
    }
}
