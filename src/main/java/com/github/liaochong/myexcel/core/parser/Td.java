/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.liaochong.myexcel.core.parser;

import com.github.liaochong.myexcel.utils.TdUtil;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

/**
 * @author liaochong
 * @version 1.0
 */
public class Td {
    /**
     * 所在行
     */
    private int row;
    /**
     * 所在列
     */
    private int col;
    /**
     * 跨行数
     */
    private int rowSpan;
    /**
     * 跨列数
     */
    private int colSpan;
    /**
     * 内容
     */
    private String content;
    /**
     * 内容类型
     */
    private ContentTypeEnum tdContentType = ContentTypeEnum.STRING;
    /**
     * 是否为th
     */
    private boolean th;
    /**
     * 单元格样式
     */
    private Map<String, String> style = Collections.emptyMap();
    /**
     * 公式
     */
    private boolean formula;
    /**
     * 链接
     */
    private String link;
    /**
     * 文件
     */
    private File file;
    /**
     * 格式化
     */
    private String format;

    /**
     * 时间是常用对象，特殊化
     */
    private Date date;

    private LocalDate localDate;

    private LocalDateTime localDateTime;

    public Td(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setRowSpan(int rowSpan) {
        if (rowSpan < 2) {
            return;
        }
        this.rowSpan = rowSpan;
    }

    public void setColSpan(int colSpan) {
        if (colSpan < 2) {
            return;
        }
        this.colSpan = colSpan;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRowSpan() {
        return rowSpan;
    }

    public int getColSpan() {
        return colSpan;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ContentTypeEnum getTdContentType() {
        return tdContentType;
    }

    public void setTdContentType(ContentTypeEnum tdContentType) {
        this.tdContentType = tdContentType;
    }

    public boolean isTh() {
        return th;
    }

    public void setTh(boolean th) {
        this.th = th;
    }

    public Map<String, String> getStyle() {
        return style;
    }

    public void setStyle(Map<String, String> style) {
        this.style = style;
    }

    public boolean isFormula() {
        return formula;
    }

    public void setFormula(boolean formula) {
        this.formula = formula;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getRowBound() {
        return TdUtil.get(this::getRowSpan, this::getRow);
    }

    public int getColBound() {
        return TdUtil.get(this::getColSpan, this::getCol);
    }
}
