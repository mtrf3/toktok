package com.ss.android.ugc.aweme.creative.compileConfig;

import X.C07250Qf;
import X.C44850Hiw;
import X.C44851Hix;
import X.C44852Hiy;
import X.C44853Hiz;
import X.C44854Hj0;
import X.C44855Hj1;
import X.C44856Hj2;
import X.C44857Hj3;
import X.C44858Hj4;
import X.C44859Hj5;
import X.C44860Hj6;
import X.C44861Hj7;
import X.C44862Hj8;
import X.C44863Hj9;
import X.C44864HjA;
import X.C44865HjB;
import X.C44866HjC;
import X.C44867HjD;
import X.C44868HjE;
import X.C44869HjF;
import X.C44870HjG;
import X.C44871HjH;
import X.C44872HjI;
import X.C44873HjJ;
import X.C44874HjK;
import X.C44875HjL;
import X.C44876HjM;
import X.C65351Pkp;
import X.C65352Pkq;
import X.InterfaceC214508bO;
import X.InterfaceC74236TBo;
import X.TBV;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VEVideoEncodeConfigParams extends BaseCompileConfigParams {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public final InterfaceC214508bO bitrateMode$delegate;
    public final InterfaceC214508bO enableAvInterLeave$delegate;
    public final InterfaceC214508bO enableHdr10bitEncode$delegate;
    public final InterfaceC214508bO enableRemuxVideo$delegate;
    public final InterfaceC214508bO enableRemuxVideoForRotation$delegate;
    public final InterfaceC214508bO enableRemuxVideoForShoot$delegate;
    public final InterfaceC214508bO encodeProfile$delegate;
    public final InterfaceC214508bO encodeStandard$delegate;
    public final InterfaceC214508bO externalSettingsJsonStr$delegate;
    public final InterfaceC214508bO fps$delegate;
    public final InterfaceC214508bO gopSize$delegate;
    public final InterfaceC214508bO isSupportHWEncoder$delegate;
    public final InterfaceC214508bO lowPublishFps$delegate;
    public final InterfaceC214508bO lowWatermarkFps$delegate;
    public final InterfaceC214508bO publishFps$delegate;
    public final InterfaceC214508bO resizeX$delegate;
    public final InterfaceC214508bO resizeY$delegate;
    public final InterfaceC214508bO swMaxRate$delegate;
    public final InterfaceC214508bO swPreset$delegate;
    public final InterfaceC214508bO videoBitrate$delegate;
    public final InterfaceC214508bO videoHWOptBitrateEnableHD$delegate;
    public final InterfaceC214508bO videoHWOptBitrateInLength$delegate;
    public final InterfaceC214508bO videoHWOptBitrateOptBitrate$delegate;
    public final InterfaceC214508bO watermarkParam$delegate;
    public final InterfaceC214508bO watermarkSize$delegate;
    public final InterfaceC214508bO outputSize$delegate = new C44855Hj1(new CompileConfigResolution(0, 0, null, null, 15, null), this);
    public final InterfaceC214508bO resizeMode$delegate = new C44869HjF(2, this);

    static {
        TBV tbv = new TBV(VEVideoEncodeConfigParams.class, "outputSize", "getOutputSize()Lcom/ss/android/ugc/aweme/creative/compileConfig/CompileConfigResolution;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbv, C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "resizeMode", "getResizeMode()I", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "resizeX", "getResizeX()F", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "resizeY", "getResizeY()F", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "enableRemuxVideo", "getEnableRemuxVideo()Z", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "enableRemuxVideoForRotation", "getEnableRemuxVideoForRotation()Z", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "enableRemuxVideoForShoot", "getEnableRemuxVideoForShoot()Z", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "isSupportHWEncoder", "isSupportHWEncoder()Z", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "bitrateMode", "getBitrateMode()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_BITRATE_MODE;", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "videoBitrate", "getVideoBitrate()I", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "encodeProfile", "getEncodeProfile()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_PROFILE;", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "swMaxRate", "getSwMaxRate()J", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "swPreset", "getSwPreset()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_PRESET;", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "enableAvInterLeave", "getEnableAvInterLeave()Z", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "externalSettingsJsonStr", "getExternalSettingsJsonStr()Ljava/lang/String;", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "videoHWOptBitrateInLength", "getVideoHWOptBitrateInLength()I", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "videoHWOptBitrateOptBitrate", "getVideoHWOptBitrateOptBitrate()F", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "videoHWOptBitrateEnableHD", "getVideoHWOptBitrateEnableHD()Z", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "fps", "getFps()I", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "publishFps", "getPublishFps()I", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "gopSize", "getGopSize()I", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "watermarkSize", "getWatermarkSize()Lcom/ss/android/ugc/aweme/creative/compileConfig/CompileConfigResolution;", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "watermarkParam", "getWatermarkParam()Lcom/ss/android/vesdk/VEWatermarkParam;", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "lowPublishFps", "getLowPublishFps()I", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "lowWatermarkFps", "getLowWatermarkFps()I", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "enableHdr10bitEncode", "getEnableHdr10bitEncode()Z", 0, c65351Pkp), C07250Qf.LIZIZ(VEVideoEncodeConfigParams.class, "encodeStandard", "getEncodeStandard()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_STANDARD;", 0, c65351Pkp)};
    }

    public final VEVideoEncodeSettings.ENCODE_BITRATE_MODE getBitrateMode() {
        return (VEVideoEncodeSettings.ENCODE_BITRATE_MODE) this.bitrateMode$delegate.LIZ(this, $$delegatedProperties[8]);
    }

    public final boolean getEnableAvInterLeave() {
        return ((Boolean) this.enableAvInterLeave$delegate.LIZ(this, $$delegatedProperties[13])).booleanValue();
    }

    public final boolean getEnableHdr10bitEncode() {
        return ((Boolean) this.enableHdr10bitEncode$delegate.LIZ(this, $$delegatedProperties[25])).booleanValue();
    }

    public final boolean getEnableRemuxVideo() {
        return ((Boolean) this.enableRemuxVideo$delegate.LIZ(this, $$delegatedProperties[4])).booleanValue();
    }

    public final boolean getEnableRemuxVideoForRotation() {
        return ((Boolean) this.enableRemuxVideoForRotation$delegate.LIZ(this, $$delegatedProperties[5])).booleanValue();
    }

    public final boolean getEnableRemuxVideoForShoot() {
        return ((Boolean) this.enableRemuxVideoForShoot$delegate.LIZ(this, $$delegatedProperties[6])).booleanValue();
    }

    public final VEVideoEncodeSettings.ENCODE_PROFILE getEncodeProfile() {
        return (VEVideoEncodeSettings.ENCODE_PROFILE) this.encodeProfile$delegate.LIZ(this, $$delegatedProperties[10]);
    }

    public final VEVideoEncodeSettings.ENCODE_STANDARD getEncodeStandard() {
        return (VEVideoEncodeSettings.ENCODE_STANDARD) this.encodeStandard$delegate.LIZ(this, $$delegatedProperties[26]);
    }

    public final String getExternalSettingsJsonStr() {
        return (String) this.externalSettingsJsonStr$delegate.LIZ(this, $$delegatedProperties[14]);
    }

    public final int getFps() {
        return ((Number) this.fps$delegate.LIZ(this, $$delegatedProperties[18])).intValue();
    }

    public final int getGopSize() {
        return ((Number) this.gopSize$delegate.LIZ(this, $$delegatedProperties[20])).intValue();
    }

    public final int getLowPublishFps() {
        return ((Number) this.lowPublishFps$delegate.LIZ(this, $$delegatedProperties[23])).intValue();
    }

    public final int getLowWatermarkFps() {
        return ((Number) this.lowWatermarkFps$delegate.LIZ(this, $$delegatedProperties[24])).intValue();
    }

    public final CompileConfigResolution getOutputSize() {
        return (CompileConfigResolution) this.outputSize$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    public final int getPublishFps() {
        return ((Number) this.publishFps$delegate.LIZ(this, $$delegatedProperties[19])).intValue();
    }

    public final int getResizeMode() {
        return ((Number) this.resizeMode$delegate.LIZ(this, $$delegatedProperties[1])).intValue();
    }

    public final float getResizeX() {
        return ((Number) this.resizeX$delegate.LIZ(this, $$delegatedProperties[2])).floatValue();
    }

    public final float getResizeY() {
        return ((Number) this.resizeY$delegate.LIZ(this, $$delegatedProperties[3])).floatValue();
    }

    public final long getSwMaxRate() {
        return ((Number) this.swMaxRate$delegate.LIZ(this, $$delegatedProperties[11])).longValue();
    }

    public final VEVideoEncodeSettings.ENCODE_PRESET getSwPreset() {
        return (VEVideoEncodeSettings.ENCODE_PRESET) this.swPreset$delegate.LIZ(this, $$delegatedProperties[12]);
    }

    public final int getVideoBitrate() {
        return ((Number) this.videoBitrate$delegate.LIZ(this, $$delegatedProperties[9])).intValue();
    }

    public final boolean getVideoHWOptBitrateEnableHD() {
        return ((Boolean) this.videoHWOptBitrateEnableHD$delegate.LIZ(this, $$delegatedProperties[17])).booleanValue();
    }

    public final int getVideoHWOptBitrateInLength() {
        return ((Number) this.videoHWOptBitrateInLength$delegate.LIZ(this, $$delegatedProperties[15])).intValue();
    }

    public final float getVideoHWOptBitrateOptBitrate() {
        return ((Number) this.videoHWOptBitrateOptBitrate$delegate.LIZ(this, $$delegatedProperties[16])).floatValue();
    }

    public final VEWatermarkParam getWatermarkParam() {
        return (VEWatermarkParam) this.watermarkParam$delegate.LIZ(this, $$delegatedProperties[22]);
    }

    public final CompileConfigResolution getWatermarkSize() {
        return (CompileConfigResolution) this.watermarkSize$delegate.LIZ(this, $$delegatedProperties[21]);
    }

    public final boolean isSupportHWEncoder() {
        return ((Boolean) this.isSupportHWEncoder$delegate.LIZ(this, $$delegatedProperties[7])).booleanValue();
    }

    public VEVideoEncodeConfigParams() {
        Float valueOf = Float.valueOf(0.0f);
        this.resizeX$delegate = new C44859Hj5(valueOf, this);
        this.resizeY$delegate = new C44860Hj6(valueOf, this);
        Boolean bool = Boolean.FALSE;
        this.enableRemuxVideo$delegate = new C44873HjJ(bool, this);
        this.enableRemuxVideoForRotation$delegate = new C44874HjK(bool, this);
        this.enableRemuxVideoForShoot$delegate = new C44875HjL(bool, this);
        this.isSupportHWEncoder$delegate = new C44876HjM(bool, this);
        this.bitrateMode$delegate = new C44850Hiw(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, this);
        this.videoBitrate$delegate = new C44862Hj8(4194304, this);
        this.encodeProfile$delegate = new C44851Hix(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN, this);
        this.swMaxRate$delegate = new C44852Hiy(15000000L, this);
        this.swPreset$delegate = new C44853Hiz(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST, this);
        this.enableAvInterLeave$delegate = new C44870HjG(bool, this);
        this.externalSettingsJsonStr$delegate = new C44861Hj7(this);
        this.videoHWOptBitrateInLength$delegate = new C44863Hj9(0, this);
        this.videoHWOptBitrateOptBitrate$delegate = new C44854Hj0(Float.valueOf(-1.0f), this);
        this.videoHWOptBitrateEnableHD$delegate = new C44871HjH(bool, this);
        this.fps$delegate = new C44864HjA(-1, this);
        this.publishFps$delegate = new C44865HjB(-1, this);
        this.gopSize$delegate = new C44866HjC(60, this);
        this.watermarkSize$delegate = new C44856Hj2(new CompileConfigResolution(-1, -1, null, null, 12, null), this);
        this.watermarkParam$delegate = new C44857Hj3(this);
        this.lowPublishFps$delegate = new C44867HjD(-1, this);
        this.lowWatermarkFps$delegate = new C44868HjE(-1, this);
        this.enableHdr10bitEncode$delegate = new C44872HjI(bool, this);
        this.encodeStandard$delegate = new C44858Hj4(this);
    }

    public final void setBitrateMode(VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode) {
        o.LJIIIZ(encode_bitrate_mode, "<set-?>");
        this.bitrateMode$delegate.LIZIZ($$delegatedProperties[8], this, encode_bitrate_mode);
    }

    public final void setEnableAvInterLeave(boolean z) {
        this.enableAvInterLeave$delegate.LIZIZ($$delegatedProperties[13], this, Boolean.valueOf(z));
    }

    public final void setEnableHdr10bitEncode(boolean z) {
        this.enableHdr10bitEncode$delegate.LIZIZ($$delegatedProperties[25], this, Boolean.valueOf(z));
    }

    public final void setEnableRemuxVideo(boolean z) {
        this.enableRemuxVideo$delegate.LIZIZ($$delegatedProperties[4], this, Boolean.valueOf(z));
    }

    public final void setEnableRemuxVideoForRotation(boolean z) {
        this.enableRemuxVideoForRotation$delegate.LIZIZ($$delegatedProperties[5], this, Boolean.valueOf(z));
    }

    public final void setEnableRemuxVideoForShoot(boolean z) {
        this.enableRemuxVideoForShoot$delegate.LIZIZ($$delegatedProperties[6], this, Boolean.valueOf(z));
    }

    public final void setEncodeProfile(VEVideoEncodeSettings.ENCODE_PROFILE encode_profile) {
        o.LJIIIZ(encode_profile, "<set-?>");
        this.encodeProfile$delegate.LIZIZ($$delegatedProperties[10], this, encode_profile);
    }

    public final void setEncodeStandard(VEVideoEncodeSettings.ENCODE_STANDARD encode_standard) {
        this.encodeStandard$delegate.LIZIZ($$delegatedProperties[26], this, encode_standard);
    }

    public final void setExternalSettingsJsonStr(String str) {
        this.externalSettingsJsonStr$delegate.LIZIZ($$delegatedProperties[14], this, str);
    }

    public final void setFps(int i) {
        this.fps$delegate.LIZIZ($$delegatedProperties[18], this, Integer.valueOf(i));
    }

    public final void setGopSize(int i) {
        this.gopSize$delegate.LIZIZ($$delegatedProperties[20], this, Integer.valueOf(i));
    }

    public final void setLowPublishFps(int i) {
        this.lowPublishFps$delegate.LIZIZ($$delegatedProperties[23], this, Integer.valueOf(i));
    }

    public final void setLowWatermarkFps(int i) {
        this.lowWatermarkFps$delegate.LIZIZ($$delegatedProperties[24], this, Integer.valueOf(i));
    }

    public final void setOutputSize(CompileConfigResolution compileConfigResolution) {
        o.LJIIIZ(compileConfigResolution, "<set-?>");
        this.outputSize$delegate.LIZIZ($$delegatedProperties[0], this, compileConfigResolution);
    }

    public final void setPublishFps(int i) {
        this.publishFps$delegate.LIZIZ($$delegatedProperties[19], this, Integer.valueOf(i));
    }

    public final void setResizeMode(int i) {
        this.resizeMode$delegate.LIZIZ($$delegatedProperties[1], this, Integer.valueOf(i));
    }

    public final void setResizeX(float f) {
        this.resizeX$delegate.LIZIZ($$delegatedProperties[2], this, Float.valueOf(f));
    }

    public final void setResizeY(float f) {
        this.resizeY$delegate.LIZIZ($$delegatedProperties[3], this, Float.valueOf(f));
    }

    public final void setSupportHWEncoder(boolean z) {
        this.isSupportHWEncoder$delegate.LIZIZ($$delegatedProperties[7], this, Boolean.valueOf(z));
    }

    public final void setSwMaxRate(long j) {
        this.swMaxRate$delegate.LIZIZ($$delegatedProperties[11], this, Long.valueOf(j));
    }

    public final void setSwPreset(VEVideoEncodeSettings.ENCODE_PRESET encode_preset) {
        o.LJIIIZ(encode_preset, "<set-?>");
        this.swPreset$delegate.LIZIZ($$delegatedProperties[12], this, encode_preset);
    }

    public final void setVideoBitrate(int i) {
        this.videoBitrate$delegate.LIZIZ($$delegatedProperties[9], this, Integer.valueOf(i));
    }

    public final void setVideoHWOptBitrateEnableHD(boolean z) {
        this.videoHWOptBitrateEnableHD$delegate.LIZIZ($$delegatedProperties[17], this, Boolean.valueOf(z));
    }

    public final void setVideoHWOptBitrateInLength(int i) {
        this.videoHWOptBitrateInLength$delegate.LIZIZ($$delegatedProperties[15], this, Integer.valueOf(i));
    }

    public final void setVideoHWOptBitrateOptBitrate(float f) {
        this.videoHWOptBitrateOptBitrate$delegate.LIZIZ($$delegatedProperties[16], this, Float.valueOf(f));
    }

    public final void setWatermarkParam(VEWatermarkParam vEWatermarkParam) {
        this.watermarkParam$delegate.LIZIZ($$delegatedProperties[22], this, vEWatermarkParam);
    }

    public final void setWatermarkSize(CompileConfigResolution compileConfigResolution) {
        o.LJIIIZ(compileConfigResolution, "<set-?>");
        this.watermarkSize$delegate.LIZIZ($$delegatedProperties[21], this, compileConfigResolution);
    }
}
