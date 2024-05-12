package com.ss.android.vesdk;

import X.C16880lQ;
import X.C65429Pm5;
import X.P4Q;
import X.P78;
import X.V0N;
import X.X1D;
import Y.IDCreatorS51S0000000_7;
import Y.IDCreatorS54S0000000_11;
import Y.IDCreatorS56S0000000_14;
import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VideoInvisibleWatermarkSettings;
import defpackage.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class VEVideoEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoEncodeSettings> CREATOR = new IDCreatorS57S0000000_15(12);
    public int HwBps;
    public boolean banExtraDataLoop;
    public ENCODE_BITRATE_MODE bitrateMode;
    public int bps;
    public COMPILE_TYPE compileType;
    public boolean enableAvInterLeave;
    public boolean enableByteVCRemuxVideo;
    public boolean enableHdr10BitEncode;
    public boolean enableHwBufferEncode;
    public boolean enableInterLeave;
    public boolean enableRemuxVideo;
    public int enableRemuxVideoBitrate;
    public int enableRemuxVideoFPS;
    public boolean enableRemuxVideoForRotation;
    public boolean enableRemuxVideoForShoot;
    public int enableRemuxVideoRes;
    public int encodeProfile;
    public int encodeStandard;
    public String externalSettingsJsonStr;
    public int fps;
    public int frameRate;
    public int gopSize;
    public boolean hasBFrame;
    public int iFrameInterval;
    public boolean ignoreJsonBitrate;
    public float image_compile_quality;
    public boolean isSupportHWEncoder;
    public int keyFrameDuration;
    public String mComment;
    public boolean mCompileSoftInfo;
    public String mDescription;
    public boolean mEnableInvisibleWatermark;
    public VEVideoEncodeFitMode mFitMode;
    public int[] mKeyFramePoints;
    public VEVideoEncodeMirrorMode mMirrorMode;
    public boolean mOptRemuxWithCopy;
    public boolean mReEncodeOpt;
    public boolean mRecordingMp4;
    public int mResolutionAlign;
    public int mTransitionFrameCount;
    public int mTransitionKeyFrameMode;
    public int mTransitionKeyFrameVersion;
    public boolean mTransitionKeyframeEnable;
    public VEVideoCompileEncodeSettings mVideoCompileEncodeSetting;
    public VideoInvisibleWatermarkSettings mVideoInvisibleWatermarkSettings;
    public int mVideoTrc;
    public VEVideoCompileEncodeSettings mVideoWatermarkCompileEncodeSetting;
    public VEWatermarkParam mWatermarkParam;
    public int maxCacheDuration;
    public int mvStillFramesPublishFps;
    public int mvStillFramesWatermarkFps;
    public VESize outputSize;
    public int publishFps;
    public int resizeMode;
    public float resizeX;
    public float resizeY;
    public int rotate;
    public float speed;
    public int swByteVC1Crf;
    public int swCRF;
    public double swFHDCrfRatio;
    public double swHFpsOffset;
    public long swMaxrate;
    public int swPreset;
    public int swQP;
    public double swQPOffset;
    public double swSDCrfRatio;
    public boolean useSoftwareDecode;
    public VESize watermarkSize;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (X.C65429Pm5.LJFF("ve_enable_compile_buffer_hw_encode", false) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initFromVEConfigCenter() {
        /*
            r5 = this;
            boolean r0 = r5.enableHwBufferEncode
            r4 = 1
            if (r0 != 0) goto Le
            java.lang.String r0 = "ve_enable_compile_buffer_hw_encode"
            r1 = 0
            boolean r0 = X.C65429Pm5.LJFF(r0, r1)
            if (r0 == 0) goto Lf
        Le:
            r1 = 1
        Lf:
            r5.enableHwBufferEncode = r1
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r3 = "KEY_ENABLE_BUFFER_HW_COMPILE: "
            r1.append(r3)
            boolean r0 = r5.enableHwBufferEncode
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r2 = "VEVideoEncodeSettings"
            X.P4Q.LJFF(r2, r0)
            r5.banExtraDataLoop = r4
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "AB isBanExtraDataLoop: "
            r1.append(r0)
            boolean r0 = r5.banExtraDataLoop
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LJFF(r2, r0)
            com.ss.android.vesdk.VEConfigCenter r1 = com.ss.android.vesdk.VEConfigCenter.getInstance()
            java.lang.String r0 = "remux_video_res"
            com.ss.android.vesdk.VEConfigCenter$ValuePkt r1 = r1.getValue(r0)
            if (r1 == 0) goto L7e
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r1.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            r5.enableRemuxVideoRes = r1
            java.lang.String r0 = "remuxVideoRes = "
            X.Q4K.LJ(r0, r1, r2)
        L6a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r3)
            boolean r0 = r5.enableHwBufferEncode
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LJFF(r2, r0)
            return
        L7e:
            java.lang.String r0 = "No remux video resolution config"
            X.P4Q.LJFF(r2, r0)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.initFromVEConfigCenter():void");
    }

    public int getBitrateValue() {
        int i = P78.LIZ[this.bitrateMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return getBps();
                    }
                    throw new IllegalStateException("CompileTime BUG by SDK. Unhandled ENCODE_BITRATE_MODE enum value.");
                }
                return getSwQP();
            }
            return getSwCRF();
        }
        return getBps();
    }

    public Float getImageCompileQuality() {
        return Float.valueOf(this.image_compile_quality);
    }

    public boolean isSupportHwEnc() {
        if (C65429Pm5.LJFF("ve_enable_titan_sw_encode", false)) {
            return false;
        }
        return this.isSupportHWEncoder;
    }

    public VEVideoEncodeSettings() {
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1Crf = 22;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.hasBFrame = false;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.image_compile_quality = 100.0f;
        VESize vESize = this.outputSize;
        vESize.width = 576;
        vESize.height = 1024;
        VESize vESize2 = this.watermarkSize;
        vESize2.width = -1;
        vESize2.height = -1;
        this.fps = -1;
        this.bps = 4194304;
        this.isSupportHWEncoder = true;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVideoEncodeSettings{compileType=");
        LIZ.append(this.compileType);
        LIZ.append(", rotate=");
        LIZ.append(this.rotate);
        LIZ.append(", resizeMode=");
        LIZ.append(this.resizeMode);
        LIZ.append(", resizeX=");
        LIZ.append(this.resizeX);
        LIZ.append(", resizeY=");
        LIZ.append(this.resizeY);
        LIZ.append(", speed=");
        LIZ.append(this.speed);
        LIZ.append(", outputSize=");
        LIZ.append(this.outputSize);
        LIZ.append(", watermarkSize=");
        LIZ.append(this.watermarkSize);
        LIZ.append(", bitrateMode=");
        LIZ.append(this.bitrateMode);
        LIZ.append(", bps=");
        LIZ.append(this.bps);
        LIZ.append(", swCRF=");
        LIZ.append(this.swCRF);
        LIZ.append(", swQPOffset=");
        LIZ.append(this.swQPOffset);
        LIZ.append(", swHFpsOffset=");
        LIZ.append(this.swHFpsOffset);
        LIZ.append(", swByteVC1Crf=");
        LIZ.append(this.swByteVC1Crf);
        LIZ.append(", swSDCrfRatio=");
        LIZ.append(this.swSDCrfRatio);
        LIZ.append(", swFHDCrfRatio=");
        LIZ.append(this.swFHDCrfRatio);
        LIZ.append(", swQP=");
        LIZ.append(this.swQP);
        LIZ.append(", fps=");
        LIZ.append(this.fps);
        LIZ.append(", publishFps=");
        LIZ.append(this.publishFps);
        LIZ.append(", mvStillFramesPublishFps=");
        LIZ.append(this.mvStillFramesPublishFps);
        LIZ.append(", mvStillFramesWatermarkFps=");
        LIZ.append(this.mvStillFramesWatermarkFps);
        LIZ.append(", gopSize=");
        LIZ.append(this.gopSize);
        LIZ.append(", swPreset=");
        LIZ.append(this.swPreset);
        LIZ.append(", encodeStandard=");
        LIZ.append(this.encodeStandard);
        LIZ.append(", encodeProfile=");
        LIZ.append(this.encodeProfile);
        LIZ.append(", swMaxrate=");
        LIZ.append(this.swMaxrate);
        LIZ.append(", isSupportHWEncoder=");
        LIZ.append(this.isSupportHWEncoder);
        LIZ.append(", enableHwBufferEncode=");
        LIZ.append(this.enableHwBufferEncode);
        LIZ.append(", enableRemuxVideo=");
        LIZ.append(this.enableRemuxVideo);
        LIZ.append(", enableRemuxVideoForRotation=");
        LIZ.append(this.enableRemuxVideoForRotation);
        LIZ.append(", enableRemuxVideoForShoot=");
        LIZ.append(this.enableRemuxVideoForShoot);
        LIZ.append(", enableByteVCRemuxVideo=");
        LIZ.append(this.enableByteVCRemuxVideo);
        LIZ.append(", enableInterLeave=");
        LIZ.append(this.enableInterLeave);
        LIZ.append(", enableAvInterLeave=");
        LIZ.append(this.enableAvInterLeave);
        LIZ.append(", enableHdr10BitEncode=");
        LIZ.append(this.enableHdr10BitEncode);
        LIZ.append(", hasBFrame=");
        LIZ.append(this.hasBFrame);
        LIZ.append(", mWatermarkParam=");
        LIZ.append(this.mWatermarkParam);
        LIZ.append(", mVideoWatermarkCompileEncodeSetting=");
        LIZ.append(this.mVideoWatermarkCompileEncodeSetting);
        LIZ.append(", mEnableInvisibleWatermark=");
        LIZ.append(this.mEnableInvisibleWatermark);
        LIZ.append(", mVideoInvisibleWatermarkSettings=");
        LIZ.append(this.mVideoInvisibleWatermarkSettings);
        LIZ.append(", mVideoCompileEncodeSetting=");
        LIZ.append(this.mVideoCompileEncodeSetting);
        LIZ.append(", mOptRemuxWithCopy=");
        LIZ.append(this.mOptRemuxWithCopy);
        LIZ.append(", mReEncodeOpt=");
        LIZ.append(this.mReEncodeOpt);
        LIZ.append(", mDescripiton=");
        LIZ.append(this.mDescription);
        LIZ.append(", mComment=");
        LIZ.append(this.mComment);
        LIZ.append(", mFitMode=");
        LIZ.append(this.mFitMode);
        LIZ.append(", videoTrc=");
        return b0.LIZJ(LIZ, this.mVideoTrc, '}', LIZ);
    }

    public boolean IsIgnoreJsonBitrate() {
        return this.ignoreJsonBitrate;
    }

    public ENCODE_BITRATE_MODE getBitrateMode() {
        return this.bitrateMode;
    }

    public int getBps() {
        return this.bps;
    }

    public String getComment() {
        return this.mComment;
    }

    public COMPILE_TYPE getCompileType() {
        return this.compileType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public boolean getEnableInvisibleWatermark() {
        return this.mEnableInvisibleWatermark;
    }

    public int getEnableRemuxVideoBitrate() {
        return this.enableRemuxVideoBitrate;
    }

    public int getEnableRemuxVideoRes() {
        return this.enableRemuxVideoRes;
    }

    public int getEncodeProfile() {
        return this.encodeProfile;
    }

    public int getEncodeStandard() {
        return this.encodeStandard;
    }

    public String getExternalSettingsJsonStr() {
        return this.externalSettingsJsonStr;
    }

    public VEVideoEncodeFitMode getFitMode() {
        return this.mFitMode;
    }

    public int getFps() {
        return this.fps;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getGopSize() {
        return this.gopSize;
    }

    public int getHwBps() {
        return this.HwBps;
    }

    public int getIFrameInterval() {
        return this.iFrameInterval;
    }

    public int getKeyFrameDuration() {
        return this.keyFrameDuration;
    }

    public int[] getKeyFramePoints() {
        return this.mKeyFramePoints;
    }

    public int getMVStillFramesPublishFps() {
        return this.mvStillFramesPublishFps;
    }

    public int getMVStillFramesWatermarkFps() {
        return this.mvStillFramesWatermarkFps;
    }

    public int getMaxCacheDuration() {
        return this.maxCacheDuration;
    }

    public VEVideoEncodeMirrorMode getMirrorMode() {
        return this.mMirrorMode;
    }

    public int getPublishFps() {
        return this.publishFps;
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public float getResizeX() {
        return this.resizeX;
    }

    public float getResizeY() {
        return this.resizeY;
    }

    public int getResolutionAlignment() {
        return this.mResolutionAlign;
    }

    public int getRotate() {
        return this.rotate;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int getSwCRF() {
        return this.swCRF;
    }

    public long getSwMaxRate() {
        return this.swMaxrate;
    }

    public int getSwPreset() {
        return this.swPreset;
    }

    public int getSwQP() {
        return this.swQP;
    }

    public boolean getUseSoftwareDecode() {
        return this.useSoftwareDecode;
    }

    public VEVideoCompileEncodeSettings getVideoCompileEncodeSetting() {
        return this.mVideoCompileEncodeSetting;
    }

    public VideoInvisibleWatermarkSettings getVideoInvisibleWatermarkSettings() {
        return this.mVideoInvisibleWatermarkSettings;
    }

    public VESize getVideoRes() {
        return this.outputSize;
    }

    public VEVideoCompileEncodeSettings getWatermarkCompileEncodeSetting() {
        return this.mVideoWatermarkCompileEncodeSetting;
    }

    public VEWatermarkParam getWatermarkParam() {
        return this.mWatermarkParam;
    }

    public VESize getWatermarkVideoRes() {
        return this.watermarkSize;
    }

    public boolean isBanExtraDataLoop() {
        return this.banExtraDataLoop;
    }

    public boolean isCompileSoftInfo() {
        return this.mCompileSoftInfo;
    }

    public boolean isEnableAvInterLeave() {
        return this.enableAvInterLeave;
    }

    public boolean isEnableByteVCRemuxVideo() {
        return this.enableByteVCRemuxVideo;
    }

    public boolean isEnableHdr10BitEncode() {
        return this.enableHdr10BitEncode;
    }

    public boolean isEnableHwBufferEncode() {
        return this.enableHwBufferEncode;
    }

    public boolean isEnableInterLeave() {
        return this.enableInterLeave;
    }

    public boolean isEnableRemuxVideo() {
        return this.enableRemuxVideo;
    }

    public boolean isEnableRemuxVideoForRotation() {
        return this.enableRemuxVideoForRotation;
    }

    public boolean isEnableRemuxVideoForShoot() {
        return this.enableRemuxVideoForShoot;
    }

    public int isEnableRemuxVideoRes() {
        return this.enableRemuxVideoRes;
    }

    public boolean isHasBFrame() {
        return this.hasBFrame;
    }

    public boolean isOptRemuxWithCopy() {
        return this.mOptRemuxWithCopy;
    }

    public boolean isReEncodeOpt() {
        return this.mReEncodeOpt;
    }

    public boolean isRecordingMp4() {
        return this.mRecordingMp4;
    }

    /* loaded from: classes15.dex */
    public enum COMPILE_TYPE implements Parcelable {
        COMPILE_TYPE_MP4,
        COMPILE_TYPE_GIF,
        COMPILE_TYPE_HIGH_GIF,
        COMPILE_TYPE_TRANSPARENT_GIF,
        COMPILE_TYPE_JPEG,
        COMPILE_TYPE_PNG,
        COMPILE_TYPE_WEBP;

        public static final Parcelable.Creator<COMPILE_TYPE> CREATOR = new IDCreatorS56S0000000_14(26);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static COMPILE_TYPE valueOf(String str) {
            return (COMPILE_TYPE) V0N.LJJJ(COMPILE_TYPE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes12.dex */
    public enum ENCODE_BITRATE_MODE implements Parcelable {
        ENCODE_BITRATE_ABR,
        ENCODE_BITRATE_CRF,
        ENCODE_BITRATE_QP,
        ENCODE_BITRATE_VBR;

        public static final ENCODE_BITRATE_MODE[] values = values();
        public static final Parcelable.Creator<ENCODE_BITRATE_MODE> CREATOR = new IDCreatorS54S0000000_11(66);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ENCODE_BITRATE_MODE fromInteger(int i) {
            return values[i];
        }

        public static ENCODE_BITRATE_MODE valueOf(String str) {
            return (ENCODE_BITRATE_MODE) V0N.LJJJ(ENCODE_BITRATE_MODE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes16.dex */
    public enum ENCODE_PRESET implements Parcelable {
        ENCODE_LEVEL_ULTRAFAST,
        ENCODE_LEVEL_SUPERFAST,
        ENCODE_LEVEL_VERYFAST,
        ENCODE_LEVEL_FASTER,
        ENCODE_LEVEL_FAST,
        ENCODE_LEVEL_MEDIUM,
        ENCODE_LEVEL_SLOW,
        ENCODE_LEVEL_SLOWER,
        ENCODE_LEVEL_VERYSLOW,
        ENCODE_LEVEL_PLACEBO;

        public static final Parcelable.Creator<ENCODE_PRESET> CREATOR = new IDCreatorS51S0000000_7(26);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ENCODE_PRESET valueOf(String str) {
            return (ENCODE_PRESET) V0N.LJJJ(ENCODE_PRESET.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes16.dex */
    public enum ENCODE_PROFILE implements Parcelable {
        ENCODE_PROFILE_UNKNOWN,
        ENCODE_PROFILE_BASELINE,
        ENCODE_PROFILE_MAIN,
        ENCODE_PROFILE_HIGH;

        public static final Parcelable.Creator<ENCODE_PROFILE> CREATOR = new IDCreatorS57S0000000_15(10);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ENCODE_PROFILE valueOf(String str) {
            return (ENCODE_PROFILE) V0N.LJJJ(ENCODE_PROFILE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes12.dex */
    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_H264,
        ENCODE_STANDARD_ByteVC1,
        ENCODE_STANDARD_MPEG4;

        public static final Parcelable.Creator<ENCODE_STANDARD> CREATOR = new IDCreatorS54S0000000_11(67);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ENCODE_STANDARD valueOf(String str) {
            return (ENCODE_STANDARD) V0N.LJJJ(ENCODE_STANDARD.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes16.dex */
    public enum VEVideoEncodeFitMode implements Parcelable {
        NONE,
        CENTER_INSIDE,
        CENTER_CROP;

        public static final Parcelable.Creator<VEVideoEncodeFitMode> CREATOR = new IDCreatorS57S0000000_15(11);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static VEVideoEncodeFitMode valueOf(String str) {
            return (VEVideoEncodeFitMode) V0N.LJJJ(VEVideoEncodeFitMode.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes15.dex */
    public enum VEVideoEncodeMirrorMode implements Parcelable {
        NO_MIRROR,
        X_MIRROR,
        Y_MIRROR;

        public static final Parcelable.Creator<VEVideoEncodeMirrorMode> CREATOR = new IDCreatorS56S0000000_14(27);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static VEVideoEncodeMirrorMode valueOf(String str) {
            return (VEVideoEncodeMirrorMode) V0N.LJJJ(VEVideoEncodeMirrorMode.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public VEVideoEncodeSettings(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1Crf = 22;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.hasBFrame = false;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.image_compile_quality = 100.0f;
        this.compileType = (COMPILE_TYPE) parcel.readParcelable(COMPILE_TYPE.class.getClassLoader());
        this.rotate = parcel.readInt();
        this.resizeMode = parcel.readInt();
        this.resizeX = parcel.readFloat();
        this.resizeY = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.outputSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.watermarkSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.bitrateMode = (ENCODE_BITRATE_MODE) parcel.readParcelable(ENCODE_BITRATE_MODE.class.getClassLoader());
        this.bps = parcel.readInt();
        this.fps = parcel.readInt();
        this.publishFps = parcel.readInt();
        this.mvStillFramesPublishFps = parcel.readInt();
        this.mvStillFramesWatermarkFps = parcel.readInt();
        this.swCRF = parcel.readInt();
        this.swQPOffset = parcel.readDouble();
        this.swHFpsOffset = parcel.readDouble();
        this.swByteVC1Crf = parcel.readInt();
        this.swSDCrfRatio = parcel.readDouble();
        this.swFHDCrfRatio = parcel.readDouble();
        this.swQP = parcel.readInt();
        this.gopSize = parcel.readInt();
        this.swPreset = parcel.readInt();
        this.encodeStandard = parcel.readInt();
        this.encodeProfile = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSupportHWEncoder = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.enableRemuxVideo = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.enableRemuxVideoForRotation = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.enableRemuxVideoForShoot = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.enableInterLeave = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enableAvInterLeave = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.enableHdr10BitEncode = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.hasBFrame = z8;
        this.swMaxrate = parcel.readLong();
        this.mWatermarkParam = (VEWatermarkParam) parcel.readParcelable(VEWatermarkParam.class.getClassLoader());
        this.mVideoWatermarkCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mEnableInvisibleWatermark = z9;
        this.mVideoInvisibleWatermarkSettings = (VideoInvisibleWatermarkSettings) parcel.readParcelable(VideoInvisibleWatermarkSettings.class.getClassLoader());
        this.mVideoCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.externalSettingsJsonStr = parcel.readString();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mOptRemuxWithCopy = z10;
        this.mDescription = parcel.readString();
        this.mComment = parcel.readString();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mCompileSoftInfo = z11;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.mRecordingMp4 = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.enableHwBufferEncode = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.mReEncodeOpt = z14;
        this.mResolutionAlign = parcel.readInt();
        this.banExtraDataLoop = parcel.readByte() != 0;
        this.mFitMode = (VEVideoEncodeFitMode) parcel.readParcelable(VEVideoEncodeFitMode.class.getClassLoader());
        this.mMirrorMode = (VEVideoEncodeMirrorMode) parcel.readParcelable(VEVideoEncodeMirrorMode.class.getClassLoader());
        this.frameRate = parcel.readInt();
        this.iFrameInterval = parcel.readInt();
        this.mVideoTrc = parcel.readInt();
    }

    public void adjustVideoCompileEncodeSetting(int i) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = this.mVideoCompileEncodeSetting;
            if (vEVideoCompileEncodeSettings != null) {
                this.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings;
            }
            if (!this.outputSize.isValid()) {
                return;
            }
            VESize vESize = this.watermarkSize;
            VESize vESize2 = this.outputSize;
            vESize.width = vESize2.width;
            vESize.height = vESize2.height;
            return;
        }
        VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings2 = this.mVideoWatermarkCompileEncodeSetting;
        if (vEVideoCompileEncodeSettings2 != null) {
            this.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings2;
        }
        if (!this.watermarkSize.isValid()) {
            return;
        }
        VESize vESize3 = this.outputSize;
        VESize vESize4 = this.watermarkSize;
        vESize3.width = vESize4.width;
        vESize3.height = vESize4.height;
    }

    public void setBps(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR;
        this.bps = i;
    }

    public void setCompileType(COMPILE_TYPE compile_type) {
        this.compileType = compile_type;
    }

    public void setEnableAvInterLeave(boolean z) {
        this.enableAvInterLeave = z;
    }

    public void setEnableHdr10BitEncode(boolean z) {
        this.enableHdr10BitEncode = z;
    }

    public void setEnableInterLeave(boolean z) {
        this.enableInterLeave = z;
    }

    public void setEnableRemuxVideo(boolean z) {
        this.enableRemuxVideo = z;
    }

    public void setEnableRemuxVideoBitrate(int i) {
        this.enableRemuxVideoBitrate = i;
    }

    public void setEnableRemuxVideoFPS(int i) {
        this.enableRemuxVideoFPS = i;
    }

    public void setEnableRemuxVideoForRotation(boolean z) {
        this.enableRemuxVideoForRotation = z;
    }

    public void setEnableRemuxVideoForShoot(boolean z) {
        this.enableRemuxVideoForShoot = z;
    }

    public void setEnableRemuxVideoRes(int i) {
        this.enableRemuxVideoRes = i;
    }

    public void setEncodeProfile(ENCODE_PROFILE encode_profile) {
        this.encodeProfile = encode_profile.ordinal();
    }

    public void setFitMode(VEVideoEncodeFitMode vEVideoEncodeFitMode) {
        this.mFitMode = vEVideoEncodeFitMode;
    }

    public void setFps(int i) {
        this.fps = i;
        this.publishFps = -1;
    }

    public void setGopSize(int i) {
        this.gopSize = i;
    }

    public void setHwBps(int i) {
        this.HwBps = i;
    }

    public void setIgnoreJsonBitrate(boolean z) {
        this.ignoreJsonBitrate = z;
    }

    public void setImageCompileQuality(float f) {
        this.image_compile_quality = f;
    }

    public void setMVStillFramesPublishFps(int i) {
        this.mvStillFramesPublishFps = i;
    }

    public void setMVStillFramesWatermarkFps(int i) {
        this.mvStillFramesWatermarkFps = i;
    }

    public void setQP(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
        this.swQP = i;
    }

    public void setResizeMode(int i) {
        this.resizeMode = i;
    }

    public void setResizeX(float f) {
        this.resizeX = f;
    }

    public void setResizeY(float f) {
        this.resizeY = f;
    }

    public void setRotate(int i) {
        this.rotate = i;
    }

    public void setSWCRF(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        this.swCRF = i;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setSupportHwEnc(boolean z) {
        this.isSupportHWEncoder = z;
    }

    public void setSwPreset(ENCODE_PRESET encode_preset) {
        this.swPreset = encode_preset.ordinal();
    }

    public void setUseSoftwareDecode(boolean z) {
        this.useSoftwareDecode = z;
    }

    public boolean setVideoHwEnc(boolean z) {
        VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = this.mVideoCompileEncodeSetting;
        if (vEVideoCompileEncodeSettings.isSupportHWEncoder) {
            vEVideoCompileEncodeSettings.useHWEncoder = z;
        } else {
            vEVideoCompileEncodeSettings.useHWEncoder = false;
        }
        return vEVideoCompileEncodeSettings.useHWEncoder;
    }

    public boolean setVideoInvisibleWatermarkSettings(VideoInvisibleWatermarkSettings videoInvisibleWatermarkSettings) {
        boolean z;
        this.mVideoInvisibleWatermarkSettings = videoInvisibleWatermarkSettings;
        if (videoInvisibleWatermarkSettings != null) {
            z = true;
        } else {
            z = false;
        }
        this.mEnableInvisibleWatermark = z;
        return true;
    }

    public void setVideoSWOptCrf(int i) {
        this.mVideoCompileEncodeSetting.mSWEncodeSetting.mCrf = i;
    }

    public void setVideoTrc(int i) {
        this.mVideoTrc = i;
    }

    public boolean setWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam != null) {
            if (vEWatermarkParam.getEntities() != null) {
                this.mWatermarkParam = vEWatermarkParam;
                return true;
            }
            return false;
        }
        this.mWatermarkParam = null;
        return true;
    }

    public /* synthetic */ VEVideoEncodeSettings(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15) {
        this();
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z) {
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1Crf = 22;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.hasBFrame = false;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.image_compile_quality = 100.0f;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public void setEnableRemuxVideo(boolean z, boolean z2) {
        this.enableRemuxVideo = z;
        this.enableRemuxVideoForRotation = z2;
    }

    public void setFps(int i, int i2) {
        if (i2 > 0 && i2 < i) {
            this.fps = i;
            this.publishFps = i2;
        } else {
            this.fps = i;
            this.publishFps = -1;
        }
    }

    public void setVideoBitrate(ENCODE_BITRATE_MODE encode_bitrate_mode, int i) {
        this.bitrateMode = encode_bitrate_mode;
        int i2 = P78.LIZ[encode_bitrate_mode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        this.bps = i;
                        return;
                    }
                    throw new IllegalStateException("CompileTime BUG by sdk. Unhandled bitrateMode");
                }
                this.swQP = i;
                return;
            }
            this.swCRF = i;
            return;
        }
        this.bps = i;
    }

    public void setVideoRes(int i, int i2) {
        VESize vESize = this.outputSize;
        vESize.width = i;
        vESize.height = i2;
    }

    public void setWatermarkVideoRes(int i, int i2) {
        VESize vESize = this.watermarkSize;
        vESize.width = i;
        vESize.height = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.compileType, i);
        parcel.writeInt(this.rotate);
        parcel.writeInt(this.resizeMode);
        parcel.writeFloat(this.resizeX);
        parcel.writeFloat(this.resizeY);
        parcel.writeFloat(this.speed);
        parcel.writeParcelable(this.outputSize, i);
        parcel.writeParcelable(this.watermarkSize, i);
        parcel.writeParcelable(this.bitrateMode, i);
        parcel.writeInt(this.bps);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.publishFps);
        parcel.writeInt(this.mvStillFramesPublishFps);
        parcel.writeInt(this.mvStillFramesWatermarkFps);
        parcel.writeInt(this.swCRF);
        parcel.writeDouble(this.swQPOffset);
        parcel.writeDouble(this.swHFpsOffset);
        parcel.writeInt(this.swByteVC1Crf);
        parcel.writeDouble(this.swSDCrfRatio);
        parcel.writeDouble(this.swFHDCrfRatio);
        parcel.writeInt(this.swQP);
        parcel.writeInt(this.gopSize);
        parcel.writeInt(this.swPreset);
        parcel.writeInt(this.encodeStandard);
        parcel.writeInt(this.encodeProfile);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableRemuxVideo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableRemuxVideoForRotation ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableRemuxVideoForShoot ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableInterLeave ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableAvInterLeave ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableHdr10BitEncode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasBFrame ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.swMaxrate);
        parcel.writeParcelable(this.mWatermarkParam, i);
        parcel.writeParcelable(this.mVideoWatermarkCompileEncodeSetting, i);
        parcel.writeByte(this.mEnableInvisibleWatermark ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mVideoInvisibleWatermarkSettings, i);
        parcel.writeParcelable(this.mVideoCompileEncodeSetting, i);
        parcel.writeString(this.externalSettingsJsonStr);
        parcel.writeByte(this.mOptRemuxWithCopy ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mComment);
        parcel.writeByte(this.mCompileSoftInfo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mRecordingMp4 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableHwBufferEncode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mReEncodeOpt ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mResolutionAlign);
        parcel.writeByte(this.banExtraDataLoop ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mFitMode, i);
        parcel.writeParcelable(this.mMirrorMode, i);
        parcel.writeInt(this.frameRate);
        parcel.writeInt(this.iFrameInterval);
        parcel.writeInt(this.mVideoTrc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        if (((float) r1) > r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        r3 = (float) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0109, code lost:
    
        if (((float) r1) < r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C87290YNq setVideoHWoptBitrate(com.ss.android.vesdk.VESize r21, X.C87285YNl r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.setVideoHWoptBitrate(com.ss.android.vesdk.VESize, X.YNl, java.lang.String):X.YNq");
    }

    public float setVideoHWoptBitrate(int i, float f, boolean z) {
        long j;
        float f2;
        float f3 = f;
        float f4 = 0.0f;
        if (f3 < 0.0f) {
            P4Q.LIZJ("VEVideoEncodeSettings", "compileProbe HW setVideoHWoptBitrate optBitrate error");
            return -1.0f;
        }
        VESize vESize = this.outputSize;
        int min = Math.min(vESize.width, vESize.height);
        int abs = Math.abs(i - min);
        if (i > 572 && ((i < 580 || (i > 716 && i < 724)) && abs > 8)) {
            P4Q.LIZJ("VEVideoEncodeSettings", "compileProbe 576P || 720P: output resolution is not as expected");
            return -1.0f;
        }
        if (i > 1076 && i < 1089) {
            if (z) {
                if (abs > 8) {
                    P4Q.LIZJ("VEVideoEncodeSettings", "compileProbe 1080P_HD: output resolution is not as expected");
                    return -1.0f;
                }
            } else if (abs < 8) {
                P4Q.LIZJ("VEVideoEncodeSettings", "compileProbe 1080P: output resolution is not as expected");
                return -1.0f;
            }
        }
        if (min > 716) {
            if (min < 724) {
                f2 = (float) (this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate / 1000);
                f4 = f3 - f2;
                this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = f3 * 1000.0f;
                return f4;
            }
        } else {
            if (min > 572) {
                if (min < 580) {
                    if (!z) {
                        VEVideoHWEncodeSettings vEVideoHWEncodeSettings = this.mVideoCompileEncodeSetting.mHWEncodeSetting;
                        f3 = (float) (f3 / vEVideoHWEncodeSettings.mSd_bitrate_ratio);
                        j = vEVideoHWEncodeSettings.mBitrate;
                        f2 = ((float) j) / 1000.0f;
                        f4 = f3 - f2;
                        this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = f3 * 1000.0f;
                        return f4;
                    }
                    f3 = ((float) this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate) / 1000.0f;
                    this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = f3 * 1000.0f;
                    return f4;
                }
            }
            P4Q.LIZJ("VEVideoEncodeSettings", "compileProbe output resolution error");
            return -1.0f;
        }
        if (min > 1076 && min < 1089) {
            VEVideoHWEncodeSettings vEVideoHWEncodeSettings2 = this.mVideoCompileEncodeSetting.mHWEncodeSetting;
            f3 = (float) (f3 / vEVideoHWEncodeSettings2.mFullHd_bitrate_ratio);
            j = vEVideoHWEncodeSettings2.mBitrate;
            f2 = ((float) j) / 1000.0f;
            f4 = f3 - f2;
            this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = f3 * 1000.0f;
            return f4;
        }
        P4Q.LIZJ("VEVideoEncodeSettings", "compileProbe output resolution error");
        return -1.0f;
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2) {
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1Crf = 22;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.hasBFrame = false;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.image_compile_quality = 100.0f;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    private float[] bitrateRangeSettingsJsonStr(String str, boolean z, float f, int i) {
        JSONArray jSONArray;
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONArray = new JSONArray();
            if (716 < i && i < 724) {
                jSONArray = z ? jSONObject.optJSONArray("720P_HD") : f == 7000.0f ? jSONObject.optJSONArray("720P_Base_7Mb") : jSONObject.optJSONArray("720P");
            } else if (1076 < i && i < 1089) {
                jSONArray = jSONObject.optJSONArray("1080P");
            } else if (572 < i && i < 580) {
                jSONArray = f == 7000.0f ? jSONObject.optJSONArray("576P_Base_7Mb") : jSONObject.optJSONArray("576P");
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bitrateRange json str parse error : ");
            LIZ.append(e.getLocalizedMessage());
            P4Q.LIZJ("VEVideoEncodeSettings", X1D.LIZIZ(LIZ));
        }
        if (jSONArray == null) {
            P4Q.LIZJ("VEVideoEncodeSettings", "bitrateRange json parse failed");
            return null;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            fArr[i2] = (float) JSONArrayProtectorUtils.getDouble(jSONArray, i2);
        }
        return fArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r11 > r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        if (r11 < r9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C45021Hlh getHwAdaptiveBitrate(int r25, X.C87285YNl r26, float r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.getHwAdaptiveBitrate(int, X.YNl, float, java.lang.String, java.lang.String):X.Hlh");
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1Crf = 22;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.image_compile_quality = 100.0f;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.bps = i3;
        this.swPreset = i4;
        this.hasBFrame = z2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (((r6 * 0.2307d) - (r23 * 100.0f)) >= (-2761.0d)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (((r6 * 0.6d) - (r23 * 10.0f)) >= (-230.0d)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012e, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r22 < 300.0f) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        if (((r3 * 0.11d) - r5) >= (-3100.0d)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012c, code lost:
    
        if (((r3 * 0.2d) - r5) >= (-4000.0d)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
    
        if (((r3 * 0.76d) - r5) > (-3780.0d)) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float get_adaptive_encode_bitrate(int r17, int r18, int r19, int r20, int r21, float r22, float r23, float[] r24, float r25) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.get_adaptive_encode_bitrate(int, int, int, int, int, float, float, float[], float):float");
    }
}
