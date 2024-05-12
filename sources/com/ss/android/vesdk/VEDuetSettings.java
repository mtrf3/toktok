package com.ss.android.vesdk;

import X.EnumC29271BeF;
import X.EnumC62342cY;

/* loaded from: classes8.dex */
public final class VEDuetSettings {
    public boolean enableV2;
    public float mAlpha;
    public String mDuetAudioPath;
    public String mDuetVideoPath;
    public boolean mIsFitMode;
    public float mXInPercent;
    public float mYInPercent;
    public EnumC29271BeF mPlayMode = EnumC29271BeF.ATTACH;
    public EnumC62342cY mDuetLayout = EnumC62342cY.VEDuetLayoutHorizontal;

    public String toString() {
        return "{\"mDuetVideoPath\":\"" + this.mDuetVideoPath + "\",\"mDuetAudioPath\":\"" + this.mDuetAudioPath + "\",\"mXInPercent\":" + this.mXInPercent + ",\"mYInPercent\":" + this.mYInPercent + ",\"mAlpha\":" + this.mAlpha + ",\"mIsFitMode\":" + this.mIsFitMode + ",\"enableV2\":" + this.enableV2 + ",\"DuetLayout\":" + this.mDuetLayout.ordinal() + '}';
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public String getDuetAudioPath() {
        return this.mDuetAudioPath;
    }

    public EnumC62342cY getDuetLayout() {
        return this.mDuetLayout;
    }

    public String getDuetVideoPath() {
        return this.mDuetVideoPath;
    }

    public boolean getEnableV2() {
        return this.enableV2;
    }

    public boolean getIsFitMode() {
        return this.mIsFitMode;
    }

    public EnumC29271BeF getPlayMode() {
        return this.mPlayMode;
    }

    public float getXInPercent() {
        return this.mXInPercent;
    }

    public float getYInPercent() {
        return this.mYInPercent;
    }

    public void setDuetLayout(EnumC62342cY enumC62342cY) {
        this.mDuetLayout = enumC62342cY;
    }

    public void setEnableV2(boolean z) {
        this.enableV2 = z;
    }

    public void setPlayMode(EnumC29271BeF enumC29271BeF) {
        this.mPlayMode = enumC29271BeF;
    }

    public VEDuetSettings(String str, String str2, float f, float f2, float f3, boolean z) {
        this.mDuetVideoPath = str;
        this.mDuetAudioPath = str2;
        this.mXInPercent = f;
        this.mYInPercent = f2;
        this.mAlpha = f3;
        this.mIsFitMode = z;
    }
}
