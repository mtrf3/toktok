package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.mediacodec.TEAvcEncoder;
import com.ss.android.ugc.aweme.creative.compileConfig.ab.SmartSynthesisUploadSettings;
import com.ss.android.ugc.aweme.creative.model.publish.SmartCodecMobDataModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.ugc.gamora.editor.smartsynthesis.SmartSynthesisModelPath;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import defpackage.e1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HIP {
    public static final /* synthetic */ int LIZ = 0;

    public static SmartSynthesisUploadSettings LIZJ() {
        return (SmartSynthesisUploadSettings) HIU.LIZIZ.getValue();
    }

    public static String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        SmartCodecMobDataModel smartCodecMobDataModel;
        String str;
        if (videoPublishEditModel == null || (smartCodecMobDataModel = videoPublishEditModel.creativeModel.commonMobModel.smartCodecMobDataModel) == null || (str = smartCodecMobDataModel.notUseSmartCodecReason) == null) {
            return "unknown";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(VideoPublishEditModel editModel, VEVideoEncodeSettings vEVideoEncodeSettings) {
        OSZ osz;
        double d;
        String str;
        String str2;
        o.LJIIIZ(editModel, "editModel");
        editModel.creativeModel.commonMobModel.smartCodecMobDataModel.isUseSmartCodec = false;
        if (!e1.LIZ(31744, "studio_enable_smart_synthesis", true, false)) {
            SmartCodecMobDataModel smartCodecMobDataModel = editModel.creativeModel.commonMobModel.smartCodecMobDataModel;
            smartCodecMobDataModel.isUseSmartCodec = false;
            smartCodecMobDataModel.notUseSmartCodecReason = "not_hit_experiment";
            HIQ.LIZIZ("SmartSynthesisSetting -> disable smart Synthesis");
            return;
        }
        UploadSpeedInfo uploadSpeedInfo = editModel.uploadSpeedInfo;
        o.LJIIIIZZ(uploadSpeedInfo, "editModel.uploadSpeedInfo");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("test speed: curSpeed=");
        LIZ2.append(uploadSpeedInfo.getSpeed());
        HIQ.LIZIZ(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("speed settings: max=(");
        LIZ3.append(LIZJ().maxSpeed);
        LIZ3.append(", min=");
        LIZ3.append(LIZJ().minSpeed);
        HIQ.LIZIZ(X1D.LIZIZ(LIZ3));
        if (LIZJ().maxSpeed <= 0 || LIZJ().minSpeed <= 0) {
            HIQ.LIZIZ("speed settings invalid");
            osz = new OSZ(0, "speed_setting_invalid");
        } else if (uploadSpeedInfo.getSpeed() <= 0) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("get speed info error: ");
            LIZ4.append(uploadSpeedInfo.getSpeed());
            HIQ.LIZIZ(X1D.LIZIZ(LIZ4));
            osz = new OSZ(0, "speed_not_found");
        } else if (uploadSpeedInfo.getSpeed() >= LIZJ().maxSpeed) {
            HIQ.LIZIZ("not use smart codec, >= max");
            osz = new OSZ(0, "not_meet_speed");
        } else if (uploadSpeedInfo.getSpeed() <= LIZJ().minSpeed) {
            HIQ.LIZIZ("use smart codec but delta vmaf");
            osz = new OSZ(2, "");
        } else {
            HIQ.LIZIZ("use smart codec");
            osz = new OSZ(1, "");
        }
        int intValue = ((Number) osz.getFirst()).intValue();
        String str3 = (String) osz.getSecond();
        if (intValue == 0) {
            SmartCodecMobDataModel smartCodecMobDataModel2 = editModel.creativeModel.commonMobModel.smartCodecMobDataModel;
            smartCodecMobDataModel2.getClass();
            o.LJIIIZ(str3, "<set-?>");
            smartCodecMobDataModel2.notUseSmartCodecReason = str3;
            return;
        }
        if (intValue == 2) {
            d = LIZJ().deltaVmaf;
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if (vEVideoEncodeSettings.getEncodeStandard() == 0) {
            VESize videoRes = vEVideoEncodeSettings.getVideoRes();
            o.LJIIIIZZ(videoRes, "setting.videoRes");
            String valueOf = String.valueOf(Math.min(videoRes.width, videoRes.height));
            String valueOf2 = String.valueOf(Math.max(videoRes.width, videoRes.height));
            int indexOf = HIQ.LIZIZ.indexOf(valueOf);
            if (indexOf < 0 || !o.LJ(ListProtector.get(HIQ.LIZJ, indexOf), valueOf2)) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("resolution (");
                LIZ5.append(videoRes.width);
                LIZ5.append('x');
                LIZ5.append(videoRes.height);
                LIZ5.append(") do not support smartSetting");
                HIQ.LIZIZ(X1D.LIZIZ(LIZ5));
            } else if (!HIQ.LIZ()) {
                HIQ.LIZIZ("SmartSynthesisModelFetcher -> getPathList smart compile model is invalid return");
            } else {
                C5H3 c5h3 = HIQ.LIZ;
                SmartSynthesisModelPath smartSynthesisModelPath = (SmartSynthesisModelPath) c5h3.getValue();
                if (smartSynthesisModelPath == null || (str = smartSynthesisModelPath.smartcodec) == null) {
                    str = "";
                }
                String LJJJJZ = ujb.o.LJJJJZ(str, "${resolution}", valueOf, false);
                SmartSynthesisModelPath smartSynthesisModelPath2 = (SmartSynthesisModelPath) c5h3.getValue();
                if (smartSynthesisModelPath2 == null || (str2 = smartSynthesisModelPath2.statics) == null) {
                    str2 = "";
                }
                String LJJJJZ2 = ujb.o.LJJJJZ(str2, "${resolution}", valueOf, false);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("isValid: videoSmartPath:");
                LinkedHashMap linkedHashMap = (LinkedHashMap) HIQ.LIZLLL;
                LIZ6.append((String) linkedHashMap.get(LJJJJZ));
                LIZ6.append(" \nvideoStaticPath: ");
                LIZ6.append((String) linkedHashMap.get(LJJJJZ2));
                HIQ.LIZIZ(X1D.LIZIZ(LIZ6));
                List LJJIJLIJ = ORY.LJJIJLIJ(new String[]{linkedHashMap.get(LJJJJZ), linkedHashMap.get(LJJJJZ2)});
                if (((ArrayList) LJJIJLIJ).size() == 2 && LJJIJLIJ != null && !LJJIJLIJ.isEmpty()) {
                    SmartCodecMobDataModel smartCodecMobDataModel3 = editModel.creativeModel.commonMobModel.smartCodecMobDataModel;
                    smartCodecMobDataModel3.isUseSmartCodec = true;
                    smartCodecMobDataModel3.notUseSmartCodecReason = "";
                    TEAvcEncoder.setSmartCodecPath(LJJIJLIJ, (float) d);
                    return;
                }
            }
            SmartCodecMobDataModel smartCodecMobDataModel4 = editModel.creativeModel.commonMobModel.smartCodecMobDataModel;
            smartCodecMobDataModel4.getClass();
            smartCodecMobDataModel4.notUseSmartCodecReason = "no_model_not_found";
            TEAvcEncoder.setSmartCodecPath(null);
            HIQ.LIZIZ("do not support smartSetting");
            return;
        }
        SmartCodecMobDataModel smartCodecMobDataModel5 = editModel.creativeModel.commonMobModel.smartCodecMobDataModel;
        smartCodecMobDataModel5.getClass();
        smartCodecMobDataModel5.notUseSmartCodecReason = "encode_not_h264";
        TEAvcEncoder.setSmartCodecPath(null);
        HIQ.LIZIZ("do not support smartSetting");
    }
}
