package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.YNe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C87278YNe {
    public final int LIZ;
    public final VEVideoEncodeSettings LIZIZ;
    public final java.util.Map<VEVideoEncodeSettings.ENCODE_STANDARD, Integer> LIZJ;

    public final VEVideoEncodeSettings LIZ() {
        boolean z;
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
        java.util.Map<VEVideoEncodeSettings.ENCODE_STANDARD, Integer> map = this.LIZJ;
        VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1;
        if (((HashMap) map).containsKey(encode_standard)) {
            Integer num = (Integer) ((HashMap) this.LIZJ).get(encode_standard);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hw_bytevc1 objMaxPixelCount= ");
            LIZ.append(num);
            LIZ.append(" settings.encodeStandard= ");
            C01R.LIZJ(LIZ, vEVideoEncodeSettings.encodeStandard, LIZ, "VEVideoEncodeSettings");
            if (vEVideoEncodeSettings.encodeStandard == encode_standard.ordinal() && num != null) {
                VESize vESize = this.LIZIZ.outputSize;
                if (vESize.width * vESize.height > num.intValue()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("hw_bytevc1 change encode standard outputsize= ");
                    LIZ2.append(this.LIZIZ.outputSize.width);
                    LIZ2.append(" x ");
                    C01R.LIZJ(LIZ2, this.LIZIZ.outputSize.height, LIZ2, "VEVideoEncodeSettings");
                    vEVideoEncodeSettings.encodeStandard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
                }
            }
        }
        if (!TextUtils.isEmpty(this.LIZIZ.externalSettingsJsonStr)) {
            String str = this.LIZIZ.externalSettingsJsonStr;
            try {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ServerExternalSettingsJsonStr = ");
                LIZ3.append(str);
                P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ3));
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "compile");
                boolean optBoolean = jSONObject.optBoolean("bytevc_remux_enable", false);
                VEVideoEncodeSettings vEVideoEncodeSettings2 = this.LIZIZ;
                if (!optBoolean && !vEVideoEncodeSettings2.enableByteVCRemuxVideo) {
                    z = false;
                    vEVideoEncodeSettings2.enableByteVCRemuxVideo = z;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("parseExternalSettingsJsonStr enableByteVCRemuxVideo= ");
                    LIZ4.append(this.LIZIZ.enableByteVCRemuxVideo);
                    LIZ4.append(" bytevcRemuxEnable= ");
                    LIZ4.append(optBoolean);
                    LIZ4.append(" VEConfig_Enable= ");
                    LIZ4.append(VEConfigCenter.getInstance().getValue("vesdk_use_bytevcremux_in_publish", false));
                    P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ4));
                    this.LIZIZ.mTransitionKeyframeEnable = jSONObject.optBoolean("transition_keyframe_enable", false);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("parseExternalSettingsJsonStr keyframe mTransitionKeyframeEnable=");
                    LIZ5.append(this.LIZIZ.mTransitionKeyframeEnable);
                    P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ5));
                    VERuntime.getInstance().enableTransitionKeyframe(this.LIZIZ.mTransitionKeyframeEnable);
                    this.LIZIZ.mTransitionKeyFrameVersion = jSONObject.optInt("transition_keyframe_version", -1);
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("parseExternalSettingsJsonStr keyframe mTransitionKeyFrameVersion=");
                    LIZ6.append(this.LIZIZ.mTransitionKeyFrameVersion);
                    P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ6));
                    VERuntime.getInstance().setTransitionKeyFrameVersion(this.LIZIZ.mTransitionKeyFrameVersion);
                    this.LIZIZ.mTransitionKeyFrameMode = jSONObject.optInt("transition_keyframe_mode", 0);
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("parseExternalSettingsJsonStr keyframe mTransitionKeyframeMode=");
                    LIZ7.append(this.LIZIZ.mTransitionKeyFrameMode);
                    P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ7));
                    VERuntime.getInstance().setTransitionKeyFrameMode(this.LIZIZ.mTransitionKeyFrameMode);
                    this.LIZIZ.mTransitionFrameCount = jSONObject.optInt("transition_frame_count", 1);
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("parseExternalSettingsJsonStr mTransitionFrameCount=");
                    LIZ8.append(this.LIZIZ.mTransitionFrameCount);
                    P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ8));
                    VERuntime.getInstance().setTransitionFrameCount(this.LIZIZ.mTransitionFrameCount);
                    this.LIZIZ.mVideoCompileEncodeSetting = LIZLLL(jSONObject2);
                    this.LIZIZ.mVideoWatermarkCompileEncodeSetting = LIZLLL(JSONObjectProtectorUtils.getJSONObject(jSONObject, "watermark_compile"));
                }
                z = true;
                vEVideoEncodeSettings2.enableByteVCRemuxVideo = z;
                StringBuilder LIZ42 = X1D.LIZ();
                LIZ42.append("parseExternalSettingsJsonStr enableByteVCRemuxVideo= ");
                LIZ42.append(this.LIZIZ.enableByteVCRemuxVideo);
                LIZ42.append(" bytevcRemuxEnable= ");
                LIZ42.append(optBoolean);
                LIZ42.append(" VEConfig_Enable= ");
                LIZ42.append(VEConfigCenter.getInstance().getValue("vesdk_use_bytevcremux_in_publish", false));
                P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ42));
                this.LIZIZ.mTransitionKeyframeEnable = jSONObject.optBoolean("transition_keyframe_enable", false);
                StringBuilder LIZ52 = X1D.LIZ();
                LIZ52.append("parseExternalSettingsJsonStr keyframe mTransitionKeyframeEnable=");
                LIZ52.append(this.LIZIZ.mTransitionKeyframeEnable);
                P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ52));
                VERuntime.getInstance().enableTransitionKeyframe(this.LIZIZ.mTransitionKeyframeEnable);
                this.LIZIZ.mTransitionKeyFrameVersion = jSONObject.optInt("transition_keyframe_version", -1);
                StringBuilder LIZ62 = X1D.LIZ();
                LIZ62.append("parseExternalSettingsJsonStr keyframe mTransitionKeyFrameVersion=");
                LIZ62.append(this.LIZIZ.mTransitionKeyFrameVersion);
                P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ62));
                VERuntime.getInstance().setTransitionKeyFrameVersion(this.LIZIZ.mTransitionKeyFrameVersion);
                this.LIZIZ.mTransitionKeyFrameMode = jSONObject.optInt("transition_keyframe_mode", 0);
                StringBuilder LIZ72 = X1D.LIZ();
                LIZ72.append("parseExternalSettingsJsonStr keyframe mTransitionKeyframeMode=");
                LIZ72.append(this.LIZIZ.mTransitionKeyFrameMode);
                P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ72));
                VERuntime.getInstance().setTransitionKeyFrameMode(this.LIZIZ.mTransitionKeyFrameMode);
                this.LIZIZ.mTransitionFrameCount = jSONObject.optInt("transition_frame_count", 1);
                StringBuilder LIZ82 = X1D.LIZ();
                LIZ82.append("parseExternalSettingsJsonStr mTransitionFrameCount=");
                LIZ82.append(this.LIZIZ.mTransitionFrameCount);
                P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ82));
                VERuntime.getInstance().setTransitionFrameCount(this.LIZIZ.mTransitionFrameCount);
                this.LIZIZ.mVideoCompileEncodeSetting = LIZLLL(jSONObject2);
                this.LIZIZ.mVideoWatermarkCompileEncodeSetting = LIZLLL(JSONObjectProtectorUtils.getJSONObject(jSONObject, "watermark_compile"));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("external json str parse error : ");
                LIZ9.append(e.getLocalizedMessage());
                P4Q.LIZJ("VEVideoEncodeSettings", X1D.LIZIZ(LIZ9));
            }
        } else {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            VEVideoEncodeSettings vEVideoEncodeSettings3 = this.LIZIZ;
            boolean z2 = vEVideoEncodeSettings3.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.isSupportHWEncoder = z2;
            vEVideoCompileEncodeSettings.useHWEncoder = z2;
            vEVideoCompileEncodeSettings.enableHwBufferEncode = vEVideoEncodeSettings3.enableHwBufferEncode;
            if (z2) {
                VEVideoHWEncodeSettings vEVideoHWEncodeSettings = vEVideoCompileEncodeSettings.mHWEncodeSetting;
                vEVideoHWEncodeSettings.mBitrate = vEVideoEncodeSettings3.bps;
                vEVideoHWEncodeSettings.mProfile = vEVideoEncodeSettings3.encodeProfile;
                vEVideoHWEncodeSettings.mGop = vEVideoEncodeSettings3.gopSize;
                vEVideoHWEncodeSettings.mCodecType = vEVideoEncodeSettings3.encodeStandard;
            } else {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = vEVideoEncodeSettings3.bitrateMode.ordinal();
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                VEVideoEncodeSettings vEVideoEncodeSettings4 = this.LIZIZ;
                vEVideoSWEncodeSettings.mBps = vEVideoEncodeSettings4.bps;
                vEVideoSWEncodeSettings.mCrf = vEVideoEncodeSettings4.swCRF;
                vEVideoSWEncodeSettings.mQPOffset = vEVideoEncodeSettings4.swQPOffset;
                vEVideoSWEncodeSettings.mHFpsOffset = vEVideoEncodeSettings4.swHFpsOffset;
                vEVideoSWEncodeSettings.mByteVC1Crf = vEVideoEncodeSettings4.swByteVC1Crf;
                vEVideoSWEncodeSettings.mSDCrfRatio = vEVideoEncodeSettings4.swSDCrfRatio;
                vEVideoSWEncodeSettings.mFHDCrfRatio = vEVideoEncodeSettings4.swFHDCrfRatio;
                vEVideoSWEncodeSettings.mMaxRate = vEVideoEncodeSettings4.swMaxrate;
                vEVideoSWEncodeSettings.mPreset = vEVideoEncodeSettings4.swPreset;
                vEVideoSWEncodeSettings.mProfile = vEVideoEncodeSettings4.encodeProfile;
                vEVideoSWEncodeSettings.mGop = vEVideoEncodeSettings4.gopSize;
            }
            VEVideoEncodeSettings vEVideoEncodeSettings5 = this.LIZIZ;
            vEVideoEncodeSettings5.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            vEVideoEncodeSettings5.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings;
        }
        int value = VEConfigCenter.getInstance().getValue("ve_recorder_encode_gop_size", 0);
        if (this.LIZ == 1 && value > 0) {
            this.LIZIZ.gopSize = value;
        }
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append("exportVideoEncodeSettings = ");
        LIZ10.append(this.LIZIZ);
        P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ10));
        StringBuilder LIZ11 = X1D.LIZ();
        LIZ11.append("exportVideoEncodeSettings.compile = ");
        LIZ11.append(this.LIZIZ.mVideoCompileEncodeSetting);
        P4Q.LJFF("VEVideoEncodeSettings", X1D.LIZIZ(LIZ11));
        return this.LIZIZ;
    }

    public final void LIZIZ() {
        this.LIZIZ.encodeStandard = VEConfigCenter.getInstance().getValue("ve_compile_codec_type", 0);
        if (!C65429Pm5.LJFF("veabtest_aboffline_performance", false)) {
            this.LIZJ.put(VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1, Integer.valueOf(VEConfigCenter.getInstance().getValue("ve_compile_hw_bytevc1_max_pixel_count", 8294400)));
        }
        this.LIZIZ.enableByteVCRemuxVideo = C65429Pm5.LJFF("vesdk_use_bytevcremux_in_publish", false);
    }

    public C87278YNe(int i) {
        this.LIZJ = new HashMap();
        this.LIZ = i;
        this.LIZIZ = new VEVideoEncodeSettings();
        LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x024d A[Catch: JSONException -> 0x036d, TryCatch #0 {JSONException -> 0x036d, blocks: (B:3:0x001f, B:6:0x002c, B:8:0x0037, B:10:0x003d, B:11:0x0048, B:12:0x004c, B:14:0x0058, B:23:0x0072, B:25:0x0080, B:27:0x0092, B:29:0x0097, B:31:0x00aa, B:32:0x00ac, B:33:0x00b0, B:34:0x0160, B:36:0x016e, B:38:0x0180, B:40:0x0185, B:42:0x0198, B:43:0x019a, B:44:0x019f, B:45:0x00c2, B:47:0x00d0, B:49:0x00e2, B:51:0x00e6, B:53:0x00f9, B:54:0x00fb, B:55:0x00ff, B:56:0x0111, B:58:0x011f, B:60:0x0131, B:62:0x0136, B:64:0x0149, B:65:0x014b, B:66:0x014e, B:67:0x019c, B:70:0x01b6, B:72:0x01c6, B:74:0x01cc, B:75:0x01e2, B:77:0x01f0, B:79:0x01f5, B:81:0x0201, B:82:0x0203, B:83:0x033c, B:84:0x0205, B:86:0x020f, B:88:0x0214, B:90:0x0220, B:91:0x0222, B:92:0x0332, B:93:0x0224, B:95:0x022e, B:97:0x0233, B:99:0x023f, B:100:0x0241, B:101:0x0328, B:102:0x0243, B:104:0x024d, B:106:0x0252, B:108:0x025e, B:109:0x0260, B:110:0x031e, B:111:0x0262, B:113:0x026e, B:115:0x0273, B:117:0x0281, B:118:0x0283, B:119:0x0312, B:120:0x0285, B:122:0x0291, B:124:0x0296, B:126:0x02a4, B:127:0x02a6, B:128:0x0307, B:129:0x02a8, B:131:0x02b4, B:133:0x02b9, B:135:0x02c7, B:136:0x02c9, B:137:0x02fc, B:138:0x02cb, B:140:0x02d7, B:142:0x02dc, B:144:0x02ea, B:145:0x02ec, B:146:0x02f1, B:147:0x02ee, B:150:0x034b, B:152:0x0356, B:154:0x035c, B:155:0x036a, B:159:0x035f, B:160:0x0362, B:161:0x01cf, B:162:0x01d2, B:163:0x004a, B:164:0x0040), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026e A[Catch: JSONException -> 0x036d, TryCatch #0 {JSONException -> 0x036d, blocks: (B:3:0x001f, B:6:0x002c, B:8:0x0037, B:10:0x003d, B:11:0x0048, B:12:0x004c, B:14:0x0058, B:23:0x0072, B:25:0x0080, B:27:0x0092, B:29:0x0097, B:31:0x00aa, B:32:0x00ac, B:33:0x00b0, B:34:0x0160, B:36:0x016e, B:38:0x0180, B:40:0x0185, B:42:0x0198, B:43:0x019a, B:44:0x019f, B:45:0x00c2, B:47:0x00d0, B:49:0x00e2, B:51:0x00e6, B:53:0x00f9, B:54:0x00fb, B:55:0x00ff, B:56:0x0111, B:58:0x011f, B:60:0x0131, B:62:0x0136, B:64:0x0149, B:65:0x014b, B:66:0x014e, B:67:0x019c, B:70:0x01b6, B:72:0x01c6, B:74:0x01cc, B:75:0x01e2, B:77:0x01f0, B:79:0x01f5, B:81:0x0201, B:82:0x0203, B:83:0x033c, B:84:0x0205, B:86:0x020f, B:88:0x0214, B:90:0x0220, B:91:0x0222, B:92:0x0332, B:93:0x0224, B:95:0x022e, B:97:0x0233, B:99:0x023f, B:100:0x0241, B:101:0x0328, B:102:0x0243, B:104:0x024d, B:106:0x0252, B:108:0x025e, B:109:0x0260, B:110:0x031e, B:111:0x0262, B:113:0x026e, B:115:0x0273, B:117:0x0281, B:118:0x0283, B:119:0x0312, B:120:0x0285, B:122:0x0291, B:124:0x0296, B:126:0x02a4, B:127:0x02a6, B:128:0x0307, B:129:0x02a8, B:131:0x02b4, B:133:0x02b9, B:135:0x02c7, B:136:0x02c9, B:137:0x02fc, B:138:0x02cb, B:140:0x02d7, B:142:0x02dc, B:144:0x02ea, B:145:0x02ec, B:146:0x02f1, B:147:0x02ee, B:150:0x034b, B:152:0x0356, B:154:0x035c, B:155:0x036a, B:159:0x035f, B:160:0x0362, B:161:0x01cf, B:162:0x01d2, B:163:0x004a, B:164:0x0040), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0291 A[Catch: JSONException -> 0x036d, TryCatch #0 {JSONException -> 0x036d, blocks: (B:3:0x001f, B:6:0x002c, B:8:0x0037, B:10:0x003d, B:11:0x0048, B:12:0x004c, B:14:0x0058, B:23:0x0072, B:25:0x0080, B:27:0x0092, B:29:0x0097, B:31:0x00aa, B:32:0x00ac, B:33:0x00b0, B:34:0x0160, B:36:0x016e, B:38:0x0180, B:40:0x0185, B:42:0x0198, B:43:0x019a, B:44:0x019f, B:45:0x00c2, B:47:0x00d0, B:49:0x00e2, B:51:0x00e6, B:53:0x00f9, B:54:0x00fb, B:55:0x00ff, B:56:0x0111, B:58:0x011f, B:60:0x0131, B:62:0x0136, B:64:0x0149, B:65:0x014b, B:66:0x014e, B:67:0x019c, B:70:0x01b6, B:72:0x01c6, B:74:0x01cc, B:75:0x01e2, B:77:0x01f0, B:79:0x01f5, B:81:0x0201, B:82:0x0203, B:83:0x033c, B:84:0x0205, B:86:0x020f, B:88:0x0214, B:90:0x0220, B:91:0x0222, B:92:0x0332, B:93:0x0224, B:95:0x022e, B:97:0x0233, B:99:0x023f, B:100:0x0241, B:101:0x0328, B:102:0x0243, B:104:0x024d, B:106:0x0252, B:108:0x025e, B:109:0x0260, B:110:0x031e, B:111:0x0262, B:113:0x026e, B:115:0x0273, B:117:0x0281, B:118:0x0283, B:119:0x0312, B:120:0x0285, B:122:0x0291, B:124:0x0296, B:126:0x02a4, B:127:0x02a6, B:128:0x0307, B:129:0x02a8, B:131:0x02b4, B:133:0x02b9, B:135:0x02c7, B:136:0x02c9, B:137:0x02fc, B:138:0x02cb, B:140:0x02d7, B:142:0x02dc, B:144:0x02ea, B:145:0x02ec, B:146:0x02f1, B:147:0x02ee, B:150:0x034b, B:152:0x0356, B:154:0x035c, B:155:0x036a, B:159:0x035f, B:160:0x0362, B:161:0x01cf, B:162:0x01d2, B:163:0x004a, B:164:0x0040), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b4 A[Catch: JSONException -> 0x036d, TryCatch #0 {JSONException -> 0x036d, blocks: (B:3:0x001f, B:6:0x002c, B:8:0x0037, B:10:0x003d, B:11:0x0048, B:12:0x004c, B:14:0x0058, B:23:0x0072, B:25:0x0080, B:27:0x0092, B:29:0x0097, B:31:0x00aa, B:32:0x00ac, B:33:0x00b0, B:34:0x0160, B:36:0x016e, B:38:0x0180, B:40:0x0185, B:42:0x0198, B:43:0x019a, B:44:0x019f, B:45:0x00c2, B:47:0x00d0, B:49:0x00e2, B:51:0x00e6, B:53:0x00f9, B:54:0x00fb, B:55:0x00ff, B:56:0x0111, B:58:0x011f, B:60:0x0131, B:62:0x0136, B:64:0x0149, B:65:0x014b, B:66:0x014e, B:67:0x019c, B:70:0x01b6, B:72:0x01c6, B:74:0x01cc, B:75:0x01e2, B:77:0x01f0, B:79:0x01f5, B:81:0x0201, B:82:0x0203, B:83:0x033c, B:84:0x0205, B:86:0x020f, B:88:0x0214, B:90:0x0220, B:91:0x0222, B:92:0x0332, B:93:0x0224, B:95:0x022e, B:97:0x0233, B:99:0x023f, B:100:0x0241, B:101:0x0328, B:102:0x0243, B:104:0x024d, B:106:0x0252, B:108:0x025e, B:109:0x0260, B:110:0x031e, B:111:0x0262, B:113:0x026e, B:115:0x0273, B:117:0x0281, B:118:0x0283, B:119:0x0312, B:120:0x0285, B:122:0x0291, B:124:0x0296, B:126:0x02a4, B:127:0x02a6, B:128:0x0307, B:129:0x02a8, B:131:0x02b4, B:133:0x02b9, B:135:0x02c7, B:136:0x02c9, B:137:0x02fc, B:138:0x02cb, B:140:0x02d7, B:142:0x02dc, B:144:0x02ea, B:145:0x02ec, B:146:0x02f1, B:147:0x02ee, B:150:0x034b, B:152:0x0356, B:154:0x035c, B:155:0x036a, B:159:0x035f, B:160:0x0362, B:161:0x01cf, B:162:0x01d2, B:163:0x004a, B:164:0x0040), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d7 A[Catch: JSONException -> 0x036d, TryCatch #0 {JSONException -> 0x036d, blocks: (B:3:0x001f, B:6:0x002c, B:8:0x0037, B:10:0x003d, B:11:0x0048, B:12:0x004c, B:14:0x0058, B:23:0x0072, B:25:0x0080, B:27:0x0092, B:29:0x0097, B:31:0x00aa, B:32:0x00ac, B:33:0x00b0, B:34:0x0160, B:36:0x016e, B:38:0x0180, B:40:0x0185, B:42:0x0198, B:43:0x019a, B:44:0x019f, B:45:0x00c2, B:47:0x00d0, B:49:0x00e2, B:51:0x00e6, B:53:0x00f9, B:54:0x00fb, B:55:0x00ff, B:56:0x0111, B:58:0x011f, B:60:0x0131, B:62:0x0136, B:64:0x0149, B:65:0x014b, B:66:0x014e, B:67:0x019c, B:70:0x01b6, B:72:0x01c6, B:74:0x01cc, B:75:0x01e2, B:77:0x01f0, B:79:0x01f5, B:81:0x0201, B:82:0x0203, B:83:0x033c, B:84:0x0205, B:86:0x020f, B:88:0x0214, B:90:0x0220, B:91:0x0222, B:92:0x0332, B:93:0x0224, B:95:0x022e, B:97:0x0233, B:99:0x023f, B:100:0x0241, B:101:0x0328, B:102:0x0243, B:104:0x024d, B:106:0x0252, B:108:0x025e, B:109:0x0260, B:110:0x031e, B:111:0x0262, B:113:0x026e, B:115:0x0273, B:117:0x0281, B:118:0x0283, B:119:0x0312, B:120:0x0285, B:122:0x0291, B:124:0x0296, B:126:0x02a4, B:127:0x02a6, B:128:0x0307, B:129:0x02a8, B:131:0x02b4, B:133:0x02b9, B:135:0x02c7, B:136:0x02c9, B:137:0x02fc, B:138:0x02cb, B:140:0x02d7, B:142:0x02dc, B:144:0x02ea, B:145:0x02ec, B:146:0x02f1, B:147:0x02ee, B:150:0x034b, B:152:0x0356, B:154:0x035c, B:155:0x036a, B:159:0x035f, B:160:0x0362, B:161:0x01cf, B:162:0x01d2, B:163:0x004a, B:164:0x0040), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: JSONException -> 0x036d, TryCatch #0 {JSONException -> 0x036d, blocks: (B:3:0x001f, B:6:0x002c, B:8:0x0037, B:10:0x003d, B:11:0x0048, B:12:0x004c, B:14:0x0058, B:23:0x0072, B:25:0x0080, B:27:0x0092, B:29:0x0097, B:31:0x00aa, B:32:0x00ac, B:33:0x00b0, B:34:0x0160, B:36:0x016e, B:38:0x0180, B:40:0x0185, B:42:0x0198, B:43:0x019a, B:44:0x019f, B:45:0x00c2, B:47:0x00d0, B:49:0x00e2, B:51:0x00e6, B:53:0x00f9, B:54:0x00fb, B:55:0x00ff, B:56:0x0111, B:58:0x011f, B:60:0x0131, B:62:0x0136, B:64:0x0149, B:65:0x014b, B:66:0x014e, B:67:0x019c, B:70:0x01b6, B:72:0x01c6, B:74:0x01cc, B:75:0x01e2, B:77:0x01f0, B:79:0x01f5, B:81:0x0201, B:82:0x0203, B:83:0x033c, B:84:0x0205, B:86:0x020f, B:88:0x0214, B:90:0x0220, B:91:0x0222, B:92:0x0332, B:93:0x0224, B:95:0x022e, B:97:0x0233, B:99:0x023f, B:100:0x0241, B:101:0x0328, B:102:0x0243, B:104:0x024d, B:106:0x0252, B:108:0x025e, B:109:0x0260, B:110:0x031e, B:111:0x0262, B:113:0x026e, B:115:0x0273, B:117:0x0281, B:118:0x0283, B:119:0x0312, B:120:0x0285, B:122:0x0291, B:124:0x0296, B:126:0x02a4, B:127:0x02a6, B:128:0x0307, B:129:0x02a8, B:131:0x02b4, B:133:0x02b9, B:135:0x02c7, B:136:0x02c9, B:137:0x02fc, B:138:0x02cb, B:140:0x02d7, B:142:0x02dc, B:144:0x02ea, B:145:0x02ec, B:146:0x02f1, B:147:0x02ee, B:150:0x034b, B:152:0x0356, B:154:0x035c, B:155:0x036a, B:159:0x035f, B:160:0x0362, B:161:0x01cf, B:162:0x01d2, B:163:0x004a, B:164:0x0040), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0 A[Catch: JSONException -> 0x036d, TryCatch #0 {JSONException -> 0x036d, blocks: (B:3:0x001f, B:6:0x002c, B:8:0x0037, B:10:0x003d, B:11:0x0048, B:12:0x004c, B:14:0x0058, B:23:0x0072, B:25:0x0080, B:27:0x0092, B:29:0x0097, B:31:0x00aa, B:32:0x00ac, B:33:0x00b0, B:34:0x0160, B:36:0x016e, B:38:0x0180, B:40:0x0185, B:42:0x0198, B:43:0x019a, B:44:0x019f, B:45:0x00c2, B:47:0x00d0, B:49:0x00e2, B:51:0x00e6, B:53:0x00f9, B:54:0x00fb, B:55:0x00ff, B:56:0x0111, B:58:0x011f, B:60:0x0131, B:62:0x0136, B:64:0x0149, B:65:0x014b, B:66:0x014e, B:67:0x019c, B:70:0x01b6, B:72:0x01c6, B:74:0x01cc, B:75:0x01e2, B:77:0x01f0, B:79:0x01f5, B:81:0x0201, B:82:0x0203, B:83:0x033c, B:84:0x0205, B:86:0x020f, B:88:0x0214, B:90:0x0220, B:91:0x0222, B:92:0x0332, B:93:0x0224, B:95:0x022e, B:97:0x0233, B:99:0x023f, B:100:0x0241, B:101:0x0328, B:102:0x0243, B:104:0x024d, B:106:0x0252, B:108:0x025e, B:109:0x0260, B:110:0x031e, B:111:0x0262, B:113:0x026e, B:115:0x0273, B:117:0x0281, B:118:0x0283, B:119:0x0312, B:120:0x0285, B:122:0x0291, B:124:0x0296, B:126:0x02a4, B:127:0x02a6, B:128:0x0307, B:129:0x02a8, B:131:0x02b4, B:133:0x02b9, B:135:0x02c7, B:136:0x02c9, B:137:0x02fc, B:138:0x02cb, B:140:0x02d7, B:142:0x02dc, B:144:0x02ea, B:145:0x02ec, B:146:0x02f1, B:147:0x02ee, B:150:0x034b, B:152:0x0356, B:154:0x035c, B:155:0x036a, B:159:0x035f, B:160:0x0362, B:161:0x01cf, B:162:0x01d2, B:163:0x004a, B:164:0x0040), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020f A[Catch: JSONException -> 0x036d, TryCatch #0 {JSONException -> 0x036d, blocks: (B:3:0x001f, B:6:0x002c, B:8:0x0037, B:10:0x003d, B:11:0x0048, B:12:0x004c, B:14:0x0058, B:23:0x0072, B:25:0x0080, B:27:0x0092, B:29:0x0097, B:31:0x00aa, B:32:0x00ac, B:33:0x00b0, B:34:0x0160, B:36:0x016e, B:38:0x0180, B:40:0x0185, B:42:0x0198, B:43:0x019a, B:44:0x019f, B:45:0x00c2, B:47:0x00d0, B:49:0x00e2, B:51:0x00e6, B:53:0x00f9, B:54:0x00fb, B:55:0x00ff, B:56:0x0111, B:58:0x011f, B:60:0x0131, B:62:0x0136, B:64:0x0149, B:65:0x014b, B:66:0x014e, B:67:0x019c, B:70:0x01b6, B:72:0x01c6, B:74:0x01cc, B:75:0x01e2, B:77:0x01f0, B:79:0x01f5, B:81:0x0201, B:82:0x0203, B:83:0x033c, B:84:0x0205, B:86:0x020f, B:88:0x0214, B:90:0x0220, B:91:0x0222, B:92:0x0332, B:93:0x0224, B:95:0x022e, B:97:0x0233, B:99:0x023f, B:100:0x0241, B:101:0x0328, B:102:0x0243, B:104:0x024d, B:106:0x0252, B:108:0x025e, B:109:0x0260, B:110:0x031e, B:111:0x0262, B:113:0x026e, B:115:0x0273, B:117:0x0281, B:118:0x0283, B:119:0x0312, B:120:0x0285, B:122:0x0291, B:124:0x0296, B:126:0x02a4, B:127:0x02a6, B:128:0x0307, B:129:0x02a8, B:131:0x02b4, B:133:0x02b9, B:135:0x02c7, B:136:0x02c9, B:137:0x02fc, B:138:0x02cb, B:140:0x02d7, B:142:0x02dc, B:144:0x02ea, B:145:0x02ec, B:146:0x02f1, B:147:0x02ee, B:150:0x034b, B:152:0x0356, B:154:0x035c, B:155:0x036a, B:159:0x035f, B:160:0x0362, B:161:0x01cf, B:162:0x01d2, B:163:0x004a, B:164:0x0040), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022e A[Catch: JSONException -> 0x036d, TryCatch #0 {JSONException -> 0x036d, blocks: (B:3:0x001f, B:6:0x002c, B:8:0x0037, B:10:0x003d, B:11:0x0048, B:12:0x004c, B:14:0x0058, B:23:0x0072, B:25:0x0080, B:27:0x0092, B:29:0x0097, B:31:0x00aa, B:32:0x00ac, B:33:0x00b0, B:34:0x0160, B:36:0x016e, B:38:0x0180, B:40:0x0185, B:42:0x0198, B:43:0x019a, B:44:0x019f, B:45:0x00c2, B:47:0x00d0, B:49:0x00e2, B:51:0x00e6, B:53:0x00f9, B:54:0x00fb, B:55:0x00ff, B:56:0x0111, B:58:0x011f, B:60:0x0131, B:62:0x0136, B:64:0x0149, B:65:0x014b, B:66:0x014e, B:67:0x019c, B:70:0x01b6, B:72:0x01c6, B:74:0x01cc, B:75:0x01e2, B:77:0x01f0, B:79:0x01f5, B:81:0x0201, B:82:0x0203, B:83:0x033c, B:84:0x0205, B:86:0x020f, B:88:0x0214, B:90:0x0220, B:91:0x0222, B:92:0x0332, B:93:0x0224, B:95:0x022e, B:97:0x0233, B:99:0x023f, B:100:0x0241, B:101:0x0328, B:102:0x0243, B:104:0x024d, B:106:0x0252, B:108:0x025e, B:109:0x0260, B:110:0x031e, B:111:0x0262, B:113:0x026e, B:115:0x0273, B:117:0x0281, B:118:0x0283, B:119:0x0312, B:120:0x0285, B:122:0x0291, B:124:0x0296, B:126:0x02a4, B:127:0x02a6, B:128:0x0307, B:129:0x02a8, B:131:0x02b4, B:133:0x02b9, B:135:0x02c7, B:136:0x02c9, B:137:0x02fc, B:138:0x02cb, B:140:0x02d7, B:142:0x02dc, B:144:0x02ea, B:145:0x02ec, B:146:0x02f1, B:147:0x02ee, B:150:0x034b, B:152:0x0356, B:154:0x035c, B:155:0x036a, B:159:0x035f, B:160:0x0362, B:161:0x01cf, B:162:0x01d2, B:163:0x004a, B:164:0x0040), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.vesdk.settings.VEVideoHWEncodeSettings LIZJ(org.json.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87278YNe.LIZJ(org.json.JSONObject):com.ss.android.vesdk.settings.VEVideoHWEncodeSettings");
    }

    public final VEVideoCompileEncodeSettings LIZLLL(JSONObject jSONObject) {
        int i;
        long j;
        int i2;
        int ordinal;
        int i3;
        VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
        try {
            VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
            vEVideoCompileEncodeSettings.isSupportHWEncoder = vEVideoEncodeSettings.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.enableHwBufferEncode = vEVideoEncodeSettings.enableHwBufferEncode;
            String string = JSONObjectProtectorUtils.getString(jSONObject, "encode_mode");
            if ("unknown".equals(string) && this.LIZ == 2) {
                vEVideoCompileEncodeSettings.useHWEncoder = this.LIZIZ.isSupportHWEncoder;
            } else {
                vEVideoCompileEncodeSettings.useHWEncoder = "hw".equals(string);
            }
            VEVideoHWEncodeSettings LIZJ = LIZJ(jSONObject);
            vEVideoCompileEncodeSettings.mHWEncodeSetting = LIZJ;
            LIZJ.mCodecType = this.LIZIZ.encodeStandard;
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ == 2 && JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "crf") == -1) {
                VEVideoEncodeSettings vEVideoEncodeSettings2 = this.LIZIZ;
                if (vEVideoEncodeSettings2.isSupportHWEncoder) {
                    i = vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf;
                } else {
                    i = vEVideoEncodeSettings2.swCRF;
                }
            } else {
                i = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "crf");
            }
            vEVideoSWEncodeSettings.mCrf = i;
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("qpoffset")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "qpoffset");
            }
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mHFpsOffset = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("hfpsoffset")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mHFpsOffset = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "hfpsoffset");
            }
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("bytevc1_crf")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mByteVC1Crf = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "bytevc1_crf");
            }
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mSDCrfRatio = 1.0d;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("sd_crf_ratio")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mSDCrfRatio = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "sd_crf_ratio");
            }
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mFHDCrfRatio = 1.0d;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("fhd_crf_ratio")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mFHDCrfRatio = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "fhd_crf_ratio");
            }
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings2 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ == 2 && JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "maxrate") == -1) {
                VEVideoEncodeSettings vEVideoEncodeSettings3 = this.LIZIZ;
                if (vEVideoEncodeSettings3.isSupportHWEncoder) {
                    j = vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate;
                } else {
                    j = vEVideoEncodeSettings3.swMaxrate;
                }
            } else {
                j = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "maxrate");
            }
            vEVideoSWEncodeSettings2.mMaxRate = j;
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings3 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ == 2 && JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "preset") == -1) {
                VEVideoEncodeSettings vEVideoEncodeSettings4 = this.LIZIZ;
                if (vEVideoEncodeSettings4.isSupportHWEncoder) {
                    i2 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset;
                } else {
                    i2 = vEVideoEncodeSettings4.swPreset;
                }
            } else {
                i2 = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "preset");
            }
            vEVideoSWEncodeSettings3.mPreset = i2;
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings4 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ == 2 && "unknown".equals(JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "profile"))) {
                VEVideoEncodeSettings vEVideoEncodeSettings5 = this.LIZIZ;
                if (vEVideoEncodeSettings5.isSupportHWEncoder) {
                    ordinal = vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile;
                } else {
                    ordinal = vEVideoEncodeSettings5.encodeProfile;
                }
            } else {
                ordinal = VEVideoEncodeProfile.valueOfString(JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "profile")).ordinal();
            }
            vEVideoSWEncodeSettings4.mProfile = ordinal;
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings5 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ == 2 && JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "gop") == -1) {
                VEVideoEncodeSettings vEVideoEncodeSettings6 = this.LIZIZ;
                if (vEVideoEncodeSettings6.isSupportHWEncoder) {
                    i3 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop;
                } else {
                    i3 = vEVideoEncodeSettings6.gopSize;
                }
            } else {
                i3 = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "gop");
            }
            vEVideoSWEncodeSettings5.mGop = i3;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parseJsonToSetting : external json str parse error : ");
            LIZ.append(e.getLocalizedMessage());
            P4Q.LIZJ("VEVideoEncodeSettings", X1D.LIZIZ(LIZ));
        }
        return vEVideoCompileEncodeSettings;
    }

    public final void LJFF(VEVideoEncodeSettings.ENCODE_PRESET encode_preset) {
        this.LIZIZ.swPreset = encode_preset.ordinal();
    }

    public final void LJI(VEVideoEncodeSettings.ENCODE_PROFILE encode_profile) {
        this.LIZIZ.encodeProfile = encode_profile.ordinal();
    }

    public final void LJII(int i) {
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
        vEVideoEncodeSettings.fps = i;
        vEVideoEncodeSettings.publishFps = -1;
    }

    public final void LJIIIIZZ(int i) {
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
        vEVideoEncodeSettings.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        vEVideoEncodeSettings.swCRF = i;
    }

    public C87278YNe(VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.LIZJ = new HashMap();
        this.LIZ = 1;
        this.LIZIZ = vEVideoEncodeSettings;
        LIZIZ();
    }

    public final void LJ(boolean z, boolean z2) {
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
        vEVideoEncodeSettings.enableRemuxVideo = z;
        vEVideoEncodeSettings.enableRemuxVideoForRotation = z2;
    }

    public final void LJIIIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode, int i) {
        this.LIZIZ.bitrateMode = encode_bitrate_mode;
        int i2 = P78.LIZ[encode_bitrate_mode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        this.LIZIZ.bps = i;
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("CompileTime BUG. Unhandled enum value ");
                    LIZ.append(encode_bitrate_mode.toString());
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
                this.LIZIZ.swQP = i;
                return;
            }
            this.LIZIZ.swCRF = i;
            return;
        }
        this.LIZIZ.bps = i;
    }

    public final void LJIIJ(int i, int i2) {
        VESize vESize = this.LIZIZ.outputSize;
        vESize.width = i;
        vESize.height = i2;
    }
}
