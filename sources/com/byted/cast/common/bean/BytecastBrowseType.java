package com.byted.cast.common.bean;

import X.V0N;

/* loaded from: classes29.dex */
public enum BytecastBrowseType {
    ALL("all"),
    SELECTED("selected");

    public String value;

    public String getValue() {
        return this.value;
    }

    public static BytecastBrowseType valueOf(String str) {
        return (BytecastBrowseType) V0N.LJJJ(BytecastBrowseType.class, str);
    }

    BytecastBrowseType(String str) {
        this.value = str;
    }
}
