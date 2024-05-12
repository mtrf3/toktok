package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Hdi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44526Hdi {
    public static final /* synthetic */ int LIZ = 0;

    public static int[] LIZIZ(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        int[] LIZLLL = LIZLLL(editModel);
        C78857UxB.LJIILLIIL(editModel, new Integer[]{Integer.valueOf(LIZLLL[0]), Integer.valueOf(LIZLLL[1])}, C44527Hdj.LJLIL, null);
        return new int[]{editModel.getWatermarkVideoResolution().getWidth(), editModel.getWatermarkVideoResolution().getHeight()};
    }

    public static final int[] LIZJ(VideoPublishEditModel source) {
        o.LJIIIZ(source, "source");
        return new C44559HeF(new C44537Hdt(source, new C44549He5(0), new C44530Hdm(C78685UuP.LJJJJL(source.uploadSpeedInfo.getSpeed())))).LIZ();
    }

    public static final int[] LIZLLL(VideoPublishEditModel source) {
        o.LJIIIZ(source, "source");
        int[] LIZJ = LIZJ(source);
        if (LIZJ[0] <= 0 || LIZJ[1] <= 0) {
            return new int[]{source.videoWidth(), source.videoHeight()};
        }
        return LIZJ;
    }

    public static final boolean LJFF(VideoPublishEditModel source) {
        o.LJIIIZ(source, "source");
        return new C44551He7(new C44537Hdt(source, new C44549He5(0), new C44530Hdm(C78685UuP.LJJJJL(source.uploadSpeedInfo.getSpeed())))).LIZ().booleanValue();
    }

    public static final VEVideoEncodeSettings LIZ(int i, int i2) {
        VEVideoEncodeSettings.ENCODE_PRESET encode_preset;
        C87278YNe c87278YNe = new C87278YNe(3);
        c87278YNe.LIZIZ.gopSize = Q7K.LIZIZ("synthetic_video_gop", 35);
        c87278YNe.LJIIJ(i, i2);
        boolean LIZ2 = GAD.LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("VEWatermarkParamBuilder VEVideoEncodeSettings hardEncode:");
        LIZ3.append(LIZ2);
        H7B.LIZ(X1D.LIZIZ(LIZ3));
        if (LIZ2) {
            c87278YNe.LIZIZ.isSupportHWEncoder = true;
            c87278YNe.LJIIIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, (int) (C44677Hg9.LIZ() * 4.0f * 1000.0f * 1000.0f));
        } else {
            c87278YNe.LIZIZ.isSupportHWEncoder = false;
            VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
            int LIZIZ = Q7K.LIZIZ("synthetic_video_quality", 18);
            if (LIZIZ < 1 || LIZIZ > 51) {
                LIZIZ = 15;
            }
            c87278YNe.LJIIIZ(encode_bitrate_mode, LIZIZ);
        }
        int LIZIZ2 = Q7K.LIZIZ("synthetic_video_preset", 0);
        VEVideoEncodeSettings.ENCODE_PRESET[] values = VEVideoEncodeSettings.ENCODE_PRESET.values();
        if (LIZIZ2 >= 0 && LIZIZ2 < values.length && (encode_preset = values[LIZIZ2]) != null) {
            c87278YNe.LIZIZ.swPreset = encode_preset.ordinal();
        }
        long LIZIZ3 = J9A.LIZIZ("synthetic_video_maxrate", 15000000L);
        VEVideoEncodeSettings vEVideoEncodeSettings = c87278YNe.LIZIZ;
        vEVideoEncodeSettings.swMaxrate = LIZIZ3;
        vEVideoEncodeSettings.enableRemuxVideo = false;
        vEVideoEncodeSettings.resizeMode = 1;
        VEVideoEncodeSettings LIZ4 = c87278YNe.LIZ();
        o.LJIIIIZZ(LIZ4, "settingsBuilder.build()");
        return LIZ4;
    }

    public static final boolean LJ(VideoPublishEditModel editModel, VEWatermarkParam vEWatermarkParam) {
        o.LJIIIZ(editModel, "editModel");
        AVUploadSaveModel saveModel = editModel.getSaveModel();
        if (saveModel != null && saveModel.isSaveWithCaption() && vEWatermarkParam != null && editModel.hasSubtitle() && editModel.creativeModel.inlineCaptionModel == null) {
            return true;
        }
        return false;
    }
}
