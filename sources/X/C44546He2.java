package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.He2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44546He2 {
    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (LJFF(videoPublishEditModel) && LJ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(Object obj) {
        if (!(obj instanceof VideoPublishEditModel)) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (!C78685UuP.LJJJJL(videoPublishEditModel.uploadSpeedInfo.getSpeed()) || !C78596Usy.LJJJI(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        int i;
        if (videoPublishEditModel == null) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublisherMobHelper: isHighQualityVideo -> enable_photo_to_1080p = ");
        LIZ.append(C47261Igj.LJIJI());
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        if (videoPublishEditModel.isPhotoMvMode && C47261Igj.LJIJI()) {
            return true;
        }
        AbstractC143185je LIZIZ = C47192Ifc.LIZIZ(videoPublishEditModel);
        int LIZ2 = LIZIZ.LIZ(false);
        int LJFF = LIZIZ.LJFF(false);
        Math.max(LIZ2, LJFF);
        int min = Math.min(LIZ2, LJFF);
        int[] LIZJ = C44739Hh9.LIZJ(C44743HhD.LIZIZ(H7R.LJJJJI(videoPublishEditModel)));
        if (LIZJ != null) {
            Math.max(LIZJ[0], LIZJ[1]);
            i = Math.min(LIZJ[0], LIZJ[1]);
        } else {
            i = 720;
        }
        if (min <= i && C43495H5f.LIZ(videoPublishEditModel.videoPath()) <= C44751HhL.LIZ()) {
            return false;
        }
        return true;
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C145995oB c145995oB) {
        CompileProbeResult compileProbeResult = videoPublishEditModel.getCompileProbeResult();
        if (compileProbeResult != null) {
            c145995oB.LIZ(compileProbeResult.getStatus().getVeCode(), "pre_code");
            c145995oB.LIZ(compileProbeResult.getStatus().getToolsCode(), "pre_tools_code");
            CompileProbeResult.ResultData data = compileProbeResult.getData();
            if (data != null) {
                c145995oB.LIZ(data.getCrf(), "pre_crf");
                c145995oB.LIZJ(Float.valueOf(data.getVideoBitrate()), "pre_bitrate");
                c145995oB.LIZ(data.getDurationMs(), "pre_duration");
                c145995oB.LIZJ(Float.valueOf(data.getOptBitrateFromVE().getMinOptBitrate()), "min_optBitrate");
                c145995oB.LIZJ(Float.valueOf(data.getOptBitrateFromVE().getOptBitrate()), "optBitrate");
                c145995oB.LIZJ(Float.valueOf(data.getOptBitrateFromVE().getMinOptBitrateHD()), "min_optBitrate_HD");
                c145995oB.LIZJ(Float.valueOf(data.getOptBitrateFromVE().getOptBitrateHD()), "optBitrate_HD");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0.getStatus().getState() != com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State.SUCCESS) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, X.C145995oB r4) {
        /*
            com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r0 = r3.uploadSpeedInfo
            if (r0 == 0) goto L38
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r0 = r3.getCompileProbeResult()
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r0 = r3.getCompileProbeResult()
            kotlin.jvm.internal.o.LJI(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus r0 = r0.getStatus()
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State r1 = r0.getState()
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State r0 = com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State.SUCCESS
            if (r1 == r0) goto L22
        L1d:
            com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r0 = r3.uploadSpeedInfo
            com.google.android.play.core.appupdate.u.LJIIJJI(r0)
        L22:
            com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r0 = r3.uploadSpeedInfo
            long r1 = r0.getSpeed()
            java.lang.String r0 = "upload_probe_speed"
            r4.LIZIZ(r1, r0)
            com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r0 = r3.uploadSpeedInfo
            int r1 = r0.getUsedCompilerSettingGroup()
            java.lang.String r0 = "used_compiler_setting_group"
            r4.LIZ(r1, r0)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44546He2.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.5oB):void");
    }

    public static final VEVideoEncodeSettings LIZJ(VideoPublishEditModel source, SynthetiseResult synthetiseResult, VEWatermarkParam vEWatermarkParam, InterfaceC153045zY vEEditor, String publishId) {
        AbstractC44552He8 c44607Hf1;
        boolean z;
        List<AbstractC44565HeL> LIZIZ;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(vEEditor, "vEEditor");
        o.LJIIIZ(publishId, "publishId");
        C44549He5 strategiesResult = source.getStrategiesResult();
        o.LJI(strategiesResult);
        C44530Hdm c44530Hdm = new C44530Hdm(C78685UuP.LJJJJL(source.uploadSpeedInfo.getSpeed()));
        String LIZ = C44296Ha0.LIZ();
        o.LJIIIIZZ(LIZ, "REGION_SERVICE.region");
        C44172HVg.LJIILL.getClass();
        C44539Hdv c44539Hdv = new C44539Hdv(source, strategiesResult, c44530Hdm, vEEditor, vEWatermarkParam, C44528Hdk.LJLIL, new C44541Hdx(LIZ, C47497IkX.LIZJ()));
        if (C79004UzY.LJJIIZI(c44539Hdv.LIZ.canvasVideoData)) {
            c44607Hf1 = new C44603Hex(c44539Hdv);
        } else {
            VideoPublishEditModel videoPublishEditModel = c44539Hdv.LIZ;
            if (videoPublishEditModel.isPhotoMvMode) {
                c44607Hf1 = new C44606Hf0(c44539Hdv);
            } else if (videoPublishEditModel.isMvThemeVideoType()) {
                c44607Hf1 = new C44608Hf2(c44539Hdv);
            } else if (c44539Hdv.LIZ.isUploadVideo()) {
                c44607Hf1 = new C44605Hez(c44539Hdv);
            } else {
                c44607Hf1 = new C44607Hf1(c44539Hdv);
            }
        }
        C44650Hfi<VEVideoEncodeConfigParams> LJIIZILJ = C78685UuP.LJIIZILJ();
        LJIIZILJ.LIZIZ(C44578HeY.LIZ, new AqS173S0100000_7(c44607Hf1, 430));
        LJIIZILJ.LIZIZ(C44577HeX.LIZ, new AqS173S0100000_7(c44607Hf1, 431));
        LJIIZILJ.LIZIZ(C44576HeW.LIZ, new AqS173S0100000_7(c44607Hf1, 432));
        LJIIZILJ.LIZIZ(C44574HeU.LIZ, new AqS173S0100000_7(c44607Hf1, 433));
        LJIIZILJ.LIZIZ(C44582Hec.LIZ, new AqS173S0100000_7(c44607Hf1, 434));
        LJIIZILJ.LIZIZ(C44579HeZ.LIZ, new AqS173S0100000_7(c44607Hf1, 435));
        LJIIZILJ.LIZIZ(C44572HeS.LIZ, new AqS173S0100000_7(c44607Hf1, 436));
        LJIIZILJ.LIZIZ(C44580Hea.LIZ, new AqS173S0100000_7(c44607Hf1, 437));
        LJIIZILJ.LIZIZ(C44575HeV.LIZ, new AqS173S0100000_7(c44607Hf1, 438));
        LJIIZILJ.LIZIZ(C44573HeT.LIZ, new AqS173S0100000_7(c44607Hf1, 428));
        LJIIZILJ.LIZIZ(C44581Heb.LIZ, new AqS173S0100000_7(c44607Hf1, 429));
        c44607Hf1.LIZIZ(LJIIZILJ);
        VEVideoEncodeSettings LIZ2 = c44607Hf1.LIZ(LJIIZILJ);
        c44607Hf1.LIZ.LIZ.isSyntheticHardEncode = LIZ2.getVideoCompileEncodeSetting().useHWEncoder;
        List<AbstractC44565HeL> LIZIZ2 = c44607Hf1.LIZ.LIZIZ.LIZIZ();
        if (LIZIZ2 == null || LIZIZ2.isEmpty() || !(ORZ.LJLLJ(LIZIZ2) instanceof C44569HeP) || c44607Hf1.LIZ.LIZLLL.LLJI(LIZ2) || LIZIZ2.size() < 2) {
            z = false;
        } else {
            z = true;
        }
        if (z && LIZIZ2 != null) {
            ListProtector.remove(LIZIZ2, 0);
            C5Z5.LIZIZ("reset smart external settings");
            LIZ2 = c44607Hf1.LIZ(LJIIZILJ);
        }
        C44549He5 strategiesResult2 = source.getStrategiesResult();
        if (strategiesResult2 != null && (LIZIZ = strategiesResult2.LIZIZ()) != null && !LIZIZ.isEmpty()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", source.getCreationId());
            c145995oB.LJI("publish_id", publishId);
            c145995oB.LJI("compile_label", ((AbstractC44565HeL) ListProtector.get(LIZIZ, 0)).getLabel());
            FMX.LJIIL("smart_compile_result", c145995oB.LIZ);
        }
        C60903NvH.LJIIJJI().LJJIIJ();
        return LIZ2;
    }
}
