package com.ss.android.vesdk.filterparam;

/* loaded from: classes2.dex */
public class HslParam {
    public int colorType;
    public int[] hslValue = {0, 0, 0};

    public int getColorType() {
        return this.colorType;
    }

    public int[] getHslValue() {
        return this.hslValue;
    }

    public void setColorType(int i) {
        this.colorType = i;
    }

    public void setHsl(int[] iArr) {
        this.hslValue = iArr;
    }
}
