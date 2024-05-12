package com.ss.android.medialib.model;

/* loaded from: classes8.dex */
public class EffectFileInfo {
    public String path;
    public int type;

    public String getPath() {
        return this.path;
    }

    public int getType() {
        return this.type;
    }

    public EffectFileInfo(int i, String str) {
        this.type = i;
        this.path = str;
    }
}
