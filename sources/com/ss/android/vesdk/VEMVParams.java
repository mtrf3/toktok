package com.ss.android.vesdk;

import X.C0JT;
import X.Q89;
import X.V0N;
import X.X1D;
import defpackage.b0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes16.dex */
public class VEMVParams {
    public float backVolume;
    public String bgmPath;
    public int bgmTrimIn;
    public int bgmTrimOut;
    public VESize customRenderRes;
    public String[] extraParams;
    public VESize imageResizeRatio;
    public List<VESize> imgSizes;
    public boolean isSingleVideo;
    public int[] karaokeAudioDurations;
    public String[] karaokeAudioPaths;
    public float[] karaokeAudioSpeeds;
    public int[] mvDuration;
    public String mvPath;
    public float originalVolume;
    public int resFillMode;
    public MVResolution resMV;
    public String[] resourcesFilePaths;
    public String[] resourcesTypes;

    public VEMVParams() {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.bgmTrimIn = -1;
        this.bgmTrimOut = -1;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEMVParams{mvPath='");
        Q89.LIZIZ(LIZ, this.mvPath, '\'', ", resourcesFilePaths=");
        LIZ.append(Arrays.toString(this.resourcesFilePaths));
        LIZ.append(", resourcesTypes=");
        LIZ.append(Arrays.toString(this.resourcesTypes));
        LIZ.append(", isSingleVideo=");
        LIZ.append(this.isSingleVideo);
        LIZ.append(", mvDuration=");
        C0JT.LIZLLL(this.mvDuration, LIZ, ", bgmPath='");
        Q89.LIZIZ(LIZ, this.bgmPath, '\'', ", bgmTrimIn=");
        LIZ.append(this.bgmTrimIn);
        LIZ.append(", bgmTrimOut=");
        LIZ.append(this.bgmTrimOut);
        LIZ.append(", imgSizes=");
        LIZ.append(this.imgSizes);
        LIZ.append(", backVolume=");
        LIZ.append(this.backVolume);
        LIZ.append(", originalVolume=");
        LIZ.append(this.originalVolume);
        LIZ.append(", resMV=");
        LIZ.append(this.resMV);
        LIZ.append(", karaokeAudioPaths=");
        LIZ.append(Arrays.toString(this.karaokeAudioPaths));
        LIZ.append(", karaokeAudioDurations=");
        C0JT.LIZLLL(this.karaokeAudioDurations, LIZ, ", karaokeAudioSpeeds=");
        LIZ.append(Arrays.toString(this.karaokeAudioSpeeds));
        LIZ.append(", customRenderRes=");
        LIZ.append(this.customRenderRes);
        LIZ.append(", imageResizeRatio=");
        LIZ.append(this.imageResizeRatio);
        LIZ.append(", imageResFillMode=");
        return b0.LIZJ(LIZ, this.resFillMode, '}', LIZ);
    }

    /* loaded from: classes3.dex */
    public enum MVResolution {
        RES_RANDOM,
        RES_720P,
        RES_1080P,
        RES_2K,
        RES_720P_REVERSE,
        RES_FROM_TEMPLATE,
        RES_CUSTOM;

        public static MVResolution valueOf(String str) {
            return (MVResolution) V0N.LJJJ(MVResolution.class, str);
        }
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.resMV = MVResolution.RES_RANDOM;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, MVResolution mVResolution) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.resMV = mVResolution;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.bgmPath = str2;
        this.bgmTrimIn = i;
        this.bgmTrimOut = i2;
        this.resMV = MVResolution.RES_RANDOM;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, int[] iArr, String[] strArr3, int[] iArr2, float[] fArr) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        if (!strArr2[0].equals("video") || iArr != null) {
            this.mvPath = str;
            this.resourcesFilePaths = strArr;
            this.resourcesTypes = strArr2;
            this.mvDuration = iArr;
            this.karaokeAudioPaths = strArr3;
            this.karaokeAudioDurations = iArr2;
            this.karaokeAudioSpeeds = fArr;
            this.resMV = MVResolution.RES_RANDOM;
            this.isSingleVideo = false;
            return;
        }
        throw new VEException(-100, "Invalid params in karaoke mv mode!");
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, String str2, int i, int i2, boolean z, int[] iArr) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.bgmPath = str2;
        this.bgmTrimIn = i;
        this.bgmTrimOut = i2;
        this.resMV = MVResolution.RES_RANDOM;
        this.isSingleVideo = z;
        this.mvDuration = iArr;
    }
}
