/*
 * Copyright (c)
 * 11 Feb 2021 01:20
 * Created by Mission Link
 */

package com.missionlink;

public enum LicenceCode {
    DEFAULT_USER("DEFAULT", "does_not_matter"),
    PRO_USER("PRO", "pro1"),
    EXPERT_USER("EXPERT", "exp1");

    private String name;
    private String licenceValue;

    LicenceCode(String name, String licenceValue) {
        this.name = name;
        this.licenceValue = licenceValue;
    }

    public String getName() {
        return name;
    }

    public String getLicenceValue() {
        return licenceValue;
    }
}
