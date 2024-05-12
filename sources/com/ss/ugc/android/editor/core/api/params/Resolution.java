package com.ss.ugc.android.editor.core.api.params;

import X.X1D;

/* loaded from: classes9.dex */
public final class Resolution {
    public int height;
    public String name = "";
    public float ratio;
    public int resolution;
    public int width;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("name:");
        LIZ.append(this.name);
        LIZ.append(" resolution:");
        LIZ.append(this.resolution);
        LIZ.append(" ratio:");
        LIZ.append(this.ratio);
        LIZ.append(" width:");
        LIZ.append(this.width);
        LIZ.append(" height:");
        LIZ.append(this.height);
        return X1D.LIZIZ(LIZ);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getName() {
        return this.name;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final int getResolution() {
        return this.resolution;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    public final void setResolution(int i) {
        this.resolution = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public Resolution(int i, float f) {
        this.resolution = i;
        this.ratio = f;
        this.width = (i / 16) * 16;
        this.height = (((int) (i / f)) / 16) * 16;
    }
}
