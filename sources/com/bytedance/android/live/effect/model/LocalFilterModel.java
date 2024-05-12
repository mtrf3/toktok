package com.bytedance.android.live.effect.model;

/* loaded from: classes.dex */
public class LocalFilterModel {
    public int coverResId;
    public String filterFilePath;
    public String id;
    public String name;

    public LocalFilterModel() {
    }

    public int getCoverResId() {
        return this.coverResId;
    }

    public String getFilterFilePath() {
        return this.filterFilePath;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setCoverResId(int i) {
        this.coverResId = i;
    }

    public void setFilterFilePath(String str) {
        this.filterFilePath = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public LocalFilterModel(String str, int i, String str2, String str3) {
        this.id = str;
        this.coverResId = i;
        this.name = str2;
        this.filterFilePath = str3;
    }
}
