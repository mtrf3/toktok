package com.benchmark.settings;

/* loaded from: classes19.dex */
public class BXDecodeSettings {
    public String decodeFile;
    public String decodeFrameSaveDir = "";
    public int dstHeight;
    public int dstWidth;
    public boolean isDebug;
    public boolean isDecodeToSurface;
    public boolean useVC1;

    public int getDstHeight() {
        return this.dstHeight;
    }

    public int getDstWidth() {
        return this.dstWidth;
    }

    public boolean isDecodeToSurface() {
        return this.isDecodeToSurface;
    }

    public boolean isUseVC1() {
        return this.useVC1;
    }

    public BXDecodeSettings(boolean z, int i, int i2, String str) {
        this.isDecodeToSurface = z;
        this.dstWidth = i;
        this.dstHeight = i2;
        this.decodeFile = str;
    }
}
