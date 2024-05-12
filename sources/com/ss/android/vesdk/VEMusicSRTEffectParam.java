package com.ss.android.vesdk;

import X.C87323YOx;
import X.InterfaceC87324YOy;
import X.InterfaceC87325YOz;

/* loaded from: classes16.dex */
public class VEMusicSRTEffectParam {
    public boolean mAddMask;
    public String mEffectResourcePath;
    public int mFontFaceIndex;
    public String mFontTTFPath;
    public InterfaceC87325YOz mGetMusicProgressInvoker;
    public int mMaskColor;
    public boolean mParamUpdated;
    public C87323YOx[] mSrtData;

    private boolean getParamUpdated() {
        if (!this.mParamUpdated) {
            return false;
        }
        this.mParamUpdated = false;
        return true;
    }

    public float getMusicProgress() {
        InterfaceC87325YOz interfaceC87325YOz = this.mGetMusicProgressInvoker;
        if (interfaceC87325YOz != null) {
            return interfaceC87325YOz.LIZ();
        }
        return 0.0f;
    }

    public int[][] getSrtData() {
        int[][] iArr = new int[this.mSrtData.length];
        for (int i = 0; i < this.mSrtData.length; i++) {
            iArr[i] = convertDataToUnicode32(null);
        }
        return iArr;
    }

    public VEMusicSRTEffectParam() {
        this.mMaskColor = 1291845632;
    }

    public boolean getAddMask() {
        return this.mAddMask;
    }

    public String getEffectResPath() {
        return this.mEffectResourcePath;
    }

    public int getFontFaceIndex() {
        return this.mFontFaceIndex;
    }

    public String getFontTTFPath() {
        return this.mFontTTFPath;
    }

    public int getMaskColor() {
        return this.mMaskColor;
    }

    private int[] convertDataToUnicode32(C87323YOx c87323YOx) {
        throw null;
    }

    public void setAddMask(boolean z) {
        this.mAddMask = z;
        this.mParamUpdated = true;
    }

    public void setMaskColor(int i) {
        this.mMaskColor = i;
        this.mParamUpdated = true;
    }

    public VEMusicSRTEffectParam(C87323YOx[] c87323YOxArr, String str, String str2, int i, InterfaceC87325YOz interfaceC87325YOz) {
        this.mMaskColor = 1291845632;
        this.mSrtData = c87323YOxArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = interfaceC87325YOz;
        this.mParamUpdated = true;
    }

    public void updateEffectResPath(C87323YOx[] c87323YOxArr, String str, String str2, int i, InterfaceC87325YOz interfaceC87325YOz) {
        this.mSrtData = c87323YOxArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = interfaceC87325YOz;
        this.mParamUpdated = true;
    }

    public VEMusicBitmapParam generateBitmap(String str, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        InterfaceC87325YOz interfaceC87325YOz = this.mGetMusicProgressInvoker;
        if (interfaceC87325YOz != null && (interfaceC87325YOz instanceof InterfaceC87324YOy)) {
            return ((InterfaceC87324YOy) interfaceC87325YOz).LIZIZ();
        }
        return null;
    }

    public VEMusicBitmapParam generateBitmapUnicode(int[] iArr, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmap(new String(iArr, 0, iArr.length), i, i2, i3, f, i4, i5, i6);
    }
}
