package com.ss.ugc.effectplatform.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public class CheckUpdateVersionModel {
    public String cursor;
    public String sorting_position;
    public String version;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckUpdateVersionModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public String getCursor() {
        return this.cursor;
    }

    public String getSorting_position() {
        return this.sorting_position;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCursor(String str) {
        this.cursor = str;
    }

    public void setSorting_position(String str) {
        this.sorting_position = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public CheckUpdateVersionModel(String str, String str2, String str3) {
        this.version = str;
        this.cursor = str2;
        this.sorting_position = str3;
    }

    public /* synthetic */ CheckUpdateVersionModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
