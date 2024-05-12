package X;

import com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings;
import defpackage.i0;
import defpackage.m0;

/* renamed from: X.Hh8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44738Hh8 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends Object>> {
    public static final C44738Hh8 LJLIL = new C44738Hh8();

    public C44738Hh8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends Object> invoke() {
        float LIZ;
        String LIZ2;
        OSZ[] oszArr = new OSZ[40];
        oszArr[0] = new OSZ("video_size_index", Integer.valueOf(C44742HhC.LIZ()));
        oszArr[1] = new OSZ("now_video_size_index", Integer.valueOf(C44742HhC.LIZIZ()));
        oszArr[2] = new OSZ("ve_camera_preview_size", C44744HhE.LIZ());
        Object LIZ3 = C44772Hhg.LIZ();
        if (LIZ3 == null) {
            LIZ3 = C61878OQg.INSTANCE;
        }
        oszArr[3] = new OSZ("video_size_category", LIZ3);
        oszArr[4] = new OSZ("video_bitrate", Float.valueOf(C44748HhI.LIZ()));
        if (C79234V7u.LJIIIIZZ(true)) {
            LIZ = InterfaceC44798Hi6.LJFF.sourceBitrateFactor();
        } else {
            LIZ = C44748HhI.LIZ();
        }
        oszArr[5] = new OSZ("now_video_bitrate", Float.valueOf(LIZ));
        oszArr[6] = new OSZ("upload_video_size_index", Integer.valueOf(C44757HhR.LIZ()));
        oszArr[7] = new OSZ("upload_video_size_category", C44773Hhh.LIZ());
        oszArr[8] = new OSZ("import_compile_external_settings", C44752HhM.LIZ());
        oszArr[9] = new OSZ("enable_1080p_photo_to_video", Boolean.valueOf(C44756HhQ.LIZ()));
        oszArr[10] = new OSZ("tool_photo_to_video_resolution_strategy", Integer.valueOf(C44759HhT.LIZ()));
        oszArr[11] = new OSZ("story_canvas_enable_1080p", Boolean.valueOf(C44762HhW.LIZ()));
        oszArr[12] = new OSZ("canvas_enable_dynamic_resolution", Boolean.valueOf(C44761HhV.LIZ()));
        oszArr[13] = new OSZ("enable_high_quality_video", Boolean.valueOf(C44674Hg6.LIZ()));
        oszArr[14] = new OSZ("enable_default_open_hd_video_switch", Boolean.valueOf(C44749HhJ.LIZ()));
        oszArr[15] = new OSZ("compile_video_size_index", Integer.valueOf(C44743HhD.LIZ()));
        oszArr[16] = new OSZ("now_compile_video_size_index", Integer.valueOf(C44743HhD.LIZIZ(true)));
        oszArr[17] = new OSZ("high_quality_compile_video_size_index", Integer.valueOf(C44747HhH.LIZ()));
        oszArr[18] = new OSZ("ve_synthesis_settings", C44754HhO.LIZ());
        if (C79234V7u.LJIIIIZZ(true)) {
            LIZ2 = InterfaceC44798Hi6.LJFF.compileExternalSetting();
        } else {
            LIZ2 = C44754HhO.LIZ();
        }
        oszArr[19] = new OSZ("now_ve_synthesis_settings", LIZ2);
        oszArr[20] = new OSZ("high_quality_ve_synthesis_settings", C44753HhN.LIZ());
        oszArr[21] = new OSZ("bitrate_of_recode_threshold", Integer.valueOf(C44751HhL.LIZ()));
        oszArr[22] = new OSZ("high_quality_bitrate_of_recode_threshold", Integer.valueOf(C44750HhK.LIZ()));
        oszArr[23] = new OSZ("enable_upload_speed_control_ve_encode_settings", m0.LIZIZ(31744, "enable_upload_speed_control_ve_encode_settings", true, false));
        UploadSpeedEncodeSettings[] LIZ4 = C44793Hi1.LIZ();
        if (LIZ4 == null) {
            LIZ4 = new UploadSpeedEncodeSettings[0];
        }
        oszArr[24] = new OSZ("ve_encode_settings_by_upload_speed", LIZ4);
        oszArr[25] = new OSZ("smart_compile_model_v2", C44597Her.LIZ());
        oszArr[26] = new OSZ("smart_compile_model", C44596Heq.LIZ());
        oszArr[27] = new OSZ("compile_probe_config_v3", C44792Hi0.LIZ());
        oszArr[28] = new OSZ("compile_probe_config", C47959Irz.LIZLLL(31744, "compile_probe_config", "", true));
        oszArr[29] = new OSZ("avtools_enable_hd_record_resolution", Boolean.valueOf(C44746HhG.LIZ()));
        oszArr[30] = new OSZ("enable_record_upload_speed_control_ve_encode_settings", Boolean.valueOf(C44778Hhm.LIZ()));
        Object LJ = i0.LJ(true, "record_ve_encode_settings_by_upload_speed", 31744, UploadSpeedEncodeSettings[].class, null);
        if (LJ == null) {
            LJ = C44793Hi1.LIZ();
        }
        oszArr[31] = new OSZ("record_ve_encode_settings_by_upload_speed", LJ);
        oszArr[32] = new OSZ("avtools_enable_hd_import_resolution", Boolean.valueOf(C44745HhF.LIZ()));
        oszArr[33] = new OSZ("enable_import_upload_speed_control_ve_encode_settings", Boolean.valueOf(C44779Hhn.LIZ()));
        Object LJ2 = i0.LJ(true, "import_ve_encode_settings_by_upload_speed", 31744, UploadSpeedEncodeSettings[].class, null);
        if (LJ2 == null) {
            LJ2 = C44793Hi1.LIZ();
        }
        oszArr[34] = new OSZ("import_ve_encode_settings_by_upload_speed", LJ2);
        oszArr[35] = new OSZ("mv_enable_binding_hd_switch", Boolean.valueOf(C44758HhS.LIZ()));
        oszArr[36] = new OSZ("avtools_720p_mv_photo_ve_synthesis_settings", C44568HeO.LIZ());
        oszArr[37] = new OSZ("avtools_1080p_mv_photo_ve_synthesis_settings", C44755HhP.LIZ());
        oszArr[38] = new OSZ("creative_canvas_ve_encode_settings", H7S.LIZ());
        oszArr[39] = new OSZ("creative_template_ve_encode_settings", H7T.LIZ());
        return C113554cx.LJJL(oszArr);
    }
}
