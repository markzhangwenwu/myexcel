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
package com.github.liaochong.myexcel.core.pojo;

import com.github.liaochong.myexcel.core.annotation.ExcelColumn;
import com.github.liaochong.myexcel.core.annotation.ExcelModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liaochong
 * @version 1.0
 */
@ExcelModel(sheetName = "人员信息")
public class CsvPeople {

    @ExcelColumn(title = "姓名", index = 0)
    private String name;

    @ExcelColumn(title = "年龄", index = 1)
    private Integer age;

    @ExcelColumn(title = "是否会跳舞", index = 2, mapping = "true:是,false:否")
    private boolean dance;

    @ExcelColumn(title = "金钱", format = "#,000.00", index = 3)
    private BigDecimal money;

    @ExcelColumn(title = "金钱", format = "yyyy-MM-dd HH:mm:ss", index = 4)
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isDance() {
        return dance;
    }

    public void setDance(boolean dance) {
        this.dance = dance;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
