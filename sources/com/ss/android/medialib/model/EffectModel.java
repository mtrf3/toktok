package com.ss.android.medialib.model;

/* loaded from: classes8.dex */
public class EffectModel {
    public int end;
    public int index;
    public int start;

    public EffectModel() {
    }

    public int getEnd() {
        return this.end;
    }

    public int getIndex() {
        return this.index;
    }

    public int getStart() {
        return this.start;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public EffectModel(int i, int i2, int i3) {
        this.index = i;
        this.start = i2;
        this.end = i3;
    }
}
