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

import com.github.liaochong.myexcel.core.constant.Constants;
import com.github.liaochong.myexcel.core.strategy.WidthStrategy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liaochong
 * @version 1.0
 */
public class Configuration {
    /**
     * The name of the sheet to be built
     */
    private String sheetName;
    /**
     * The type of workbook to be built
     */
    private WorkbookType workbookType = WorkbookType.SXLSX;
    /**
     * 宽度策略
     */
    private WidthStrategy widthStrategy;
    /**
     * 是否排除父类字段
     */
    private boolean excludeParent = false;
    /**
     * 是否导出所有字段，否，则只导出含{@link com.github.liaochong.myexcel.core.annotation.ExcelColumn}注解字段
     */
    private boolean includeAllField = true;
    /**
     * 当对应字段的值为null时所需要替换的默认值
     */
    private String defaultValue;
    /**
     * 是否自动换行
     */
    private boolean wrapText = true;
    /**
     * 多级标题所需的分离标志
     */
    private String titleSeparator = Constants.ARROW;
    /**
     * 是否忽略静态字段
     */
    private boolean ignoreStaticFields = true;
    /**
     * 标题行高度
     */
    private int titleRowHeight;
    /**
     * 内容行高度
     */
    private int rowHeight;
    /**
     * 全局样式
     */
    private Set<String> style = new HashSet<>();
    /**
     * 是否使用字段名称作为标题，当{@link com.github.liaochong.myexcel.core.annotation.ExcelColumn}设定了title，则覆盖
     */
    private boolean useFieldNameAsTitle = false;
    /**
     * LocalDate类型数据全局格式化
     */
    private String dateFormat = "yyyy-MM-dd";
    /**
     * Date、LocalDateTime类型数据全局格式化
     */
    private String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
    /**
     * 数值类全局格式化
     */
    private String decimalFormat = "";

    private boolean computeAutoWidth;

    public void setWidthStrategy(WidthStrategy widthStrategy) {
        this.widthStrategy = widthStrategy;
        this.computeAutoWidth = WidthStrategy.isComputeAutoWidth(widthStrategy);
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public WorkbookType getWorkbookType() {
        return workbookType;
    }

    public void setWorkbookType(WorkbookType workbookType) {
        this.workbookType = workbookType;
    }

    public WidthStrategy getWidthStrategy() {
        return widthStrategy;
    }

    public boolean isExcludeParent() {
        return excludeParent;
    }

    public void setExcludeParent(boolean excludeParent) {
        this.excludeParent = excludeParent;
    }

    public boolean isIncludeAllField() {
        return includeAllField;
    }

    public void setIncludeAllField(boolean includeAllField) {
        this.includeAllField = includeAllField;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean isWrapText() {
        return wrapText;
    }

    public void setWrapText(boolean wrapText) {
        this.wrapText = wrapText;
    }

    public String getTitleSeparator() {
        return titleSeparator;
    }

    public void setTitleSeparator(String titleSeparator) {
        this.titleSeparator = titleSeparator;
    }

    public boolean isIgnoreStaticFields() {
        return ignoreStaticFields;
    }

    public void setIgnoreStaticFields(boolean ignoreStaticFields) {
        this.ignoreStaticFields = ignoreStaticFields;
    }

    public int getTitleRowHeight() {
        return titleRowHeight;
    }

    public void setTitleRowHeight(int titleRowHeight) {
        this.titleRowHeight = titleRowHeight;
    }

    public int getRowHeight() {
        return rowHeight;
    }

    public void setRowHeight(int rowHeight) {
        this.rowHeight = rowHeight;
    }

    public Set<String> getStyle() {
        return style;
    }

    public void setStyle(Set<String> style) {
        this.style = style;
    }

    public boolean isUseFieldNameAsTitle() {
        return useFieldNameAsTitle;
    }

    public void setUseFieldNameAsTitle(boolean useFieldNameAsTitle) {
        this.useFieldNameAsTitle = useFieldNameAsTitle;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    public void setDateTimeFormat(String dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }

    public String getDecimalFormat() {
        return decimalFormat;
    }

    public void setDecimalFormat(String decimalFormat) {
        this.decimalFormat = decimalFormat;
    }

    public boolean isComputeAutoWidth() {
        return computeAutoWidth;
    }

    public void setComputeAutoWidth(boolean computeAutoWidth) {
        this.computeAutoWidth = computeAutoWidth;
    }
}
