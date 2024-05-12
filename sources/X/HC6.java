package X;

import Y.ACallableS56S0300000_7;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HC6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C145995oB c145995oB, NowsShootModel nowsShootModel) {
        String str;
        NowsExtra nowsExtra = nowsShootModel.nowsExtra;
        c145995oB.LJI("dual_camera_support", CardStruct.IStatusCode.DEFAULT);
        if (nowsExtra.isDualCamera) {
            str = nowsExtra.shootOrder;
        } else if (o.LJ(nowsExtra.shootOrder, "back_first")) {
            str = "back_only";
        } else {
            str = "front_only";
        }
        c145995oB.LJI("shoot_order", str);
        c145995oB.LJI("dual_type", nowsShootModel.nowsExtra.dualType);
        c145995oB.LJI("zoom_status", nowsShootModel.nowsExtra.zoomStatus);
        c145995oB.LIZ(nowsShootModel.nowsExtra.countDownStart, "count_down_start");
        c145995oB.LIZ(nowsShootModel.nowsExtra.recordTimeLag, "record_time_lag");
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, C145995oB c145995oB) {
        CreativeModel creativeModel;
        NowsShootModel nowsShootModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (nowsShootModel = creativeModel.nowsShootModel) != null) {
            c145995oB.LJI("dual_type", nowsShootModel.nowsExtra.dualType);
            c145995oB.LJI("multi_camera_mode", nowsShootModel.multiCameraMode);
        }
    }

    public static void LJFF(String str, boolean z) {
        String str2;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("action_type", str);
        c145995oB.LJI("shoot_tab_name", C60903NvH.LJIIJJI().LJJIII().getNowUIService().getTabName());
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c145995oB.LJI("switch_status", str2);
        c145995oB.LIZ(0, "dual_camera_support");
        GXR.LIZ("dual_camera_switch", c145995oB.LIZ);
    }

    public static void LIZLLL(C145995oB c145995oB, InterfaceC83865Wvl interfaceC83865Wvl, NowsShootActivityArg nowsShootActivityArg) {
        c145995oB.LJI("shoot_way", nowsShootActivityArg.getShootWay());
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("shoot_enter_from", nowsShootActivityArg.getEnterFrom());
        c145995oB.LIZJ(Float.valueOf(interfaceC83865Wvl.Y8()), "fps");
        c145995oB.LIZJ(Float.valueOf(interfaceC83865Wvl.e9()), "write_fps");
        c145995oB.LIZ(interfaceC83865Wvl.C8(), "lag_count");
    }

    public static void LJI(InterfaceC83865Wvl mediaController, NowsShootActivityArg enterShootParam, boolean z) {
        String str;
        o.LJIIIZ(mediaController, "mediaController");
        o.LJIIIZ(enterShootParam, "enterShootParam");
        C145995oB c145995oB = new C145995oB();
        LIZLLL(c145995oB, mediaController, enterShootParam);
        if (z) {
            str = "1";
        } else {
            str = "2";
        }
        c145995oB.LJI("multi_camera_mode", str);
        c145995oB.LJI("multi_camera_window", "1");
        java.util.Map<String, String> map = c145995oB.LIZ;
        o.LJIIIIZZ(map, "newBuilder.builder()");
        C42318GjC.LIZIZ("tool_performance_video_record", map);
    }

    public static void LJIIIIZZ(String str, String shootWay, boolean z) {
        String str2;
        o.LJIIIZ(shootWay, "shootWay");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_post_page");
        c145995oB.LJI("shoot_way", shootWay);
        c145995oB.LJI("action_type", "click");
        c145995oB.LIZLLL("to_status", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_private", str2);
        GXR.LIZ("now_privacy_setting_pop_up", c145995oB.LIZ);
    }

    public static void LIZ(C145995oB c145995oB, NowsShootActivityArg nowsShootActivityArg, boolean z, NowsShootModel nowsShootModel) {
        String str;
        c145995oB.LIZLLL("shoot_enter_from", nowsShootActivityArg.getEnterFrom());
        c145995oB.LIZLLL("shoot_way", nowsShootActivityArg.getShootWay());
        c145995oB.LIZLLL("is_first_start", C79004UzY.LJJJJLL(nowsShootModel.isFirstStart));
        String str2 = "1";
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LIZLLL("is_front_camera", str);
        if (z) {
            if (!nowsShootModel.nowsExtra.isDualCamera) {
                str2 = "4";
            }
        } else if (nowsShootModel.nowsExtra.isDualCamera) {
            str2 = "2";
        } else {
            str2 = "5";
        }
        c145995oB.LIZLLL("multi_camera_mode", str2);
        c145995oB.LIZLLL("enter_from", "video_shoot_page");
        if (o.LJ(nowsShootActivityArg.getShootWay(), "direct_shoot")) {
            c145995oB.LIZLLL("shoot_tab_name", "now");
        }
    }

    public static void LJ(NowsShootModel nowsShootModel, String shootWay, String shootEnterMethod, String shootEnterFrom) {
        o.LJIIIZ(nowsShootModel, "nowsShootModel");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(shootEnterMethod, "shootEnterMethod");
        o.LJIIIZ(shootEnterFrom, "shootEnterFrom");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", shootWay);
        c145995oB.LJI("shoot_entrance", "now");
        c145995oB.LJI("enter_from", "video_post_page");
        c145995oB.LJI("shoot_page", "now_shoot_page");
        c145995oB.LJI("shoot_enter_from", shootEnterFrom);
        c145995oB.LJI("shoot_enter_method", shootEnterMethod);
        LIZIZ(c145995oB, nowsShootModel);
        GXR.LIZ("click_retake", c145995oB.LIZ);
    }

    public static void LJII(C147135q1 firstFrameData, NowsShootActivityArg enterShootParam, NowsShootModel nowsShootModel, Integer num) {
        o.LJIIIZ(firstFrameData, "firstFrameData");
        o.LJIIIZ(enterShootParam, "enterShootParam");
        long j = firstFrameData.LJLIL;
        long j2 = firstFrameData.LJLJI;
        long j3 = j - j2;
        long j4 = firstFrameData.LJLILLLLZI - j2;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_enter_from", enterShootParam.getEnterFrom());
        c145995oB.LJI("shoot_way", enterShootParam.getShootWay());
        c145995oB.LJI("is_first_start", C79004UzY.LJJJJLL(nowsShootModel.isFirstStart));
        c145995oB.LIZIZ(j3, "first_frame_duration");
        c145995oB.LIZIZ(j4, "first_ui_frame_duration");
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("dual_type", nowsShootModel.nowsExtra.dualType);
        c145995oB.LJI("multi_camera_mode", nowsShootModel.multiCameraMode);
        c145995oB.LIZJ(num, "creation_duration");
        if (o.LJ(enterShootParam.getShootWay(), "direct_shoot")) {
            c145995oB.LIZLLL("shoot_tab_name", "now");
        }
        java.util.Map<String, String> map = c145995oB.LIZ;
        o.LJIIIIZZ(map, "newBuilder.builder()");
        C42318GjC.LIZIZ("tool_performance_edit_first_frame", map);
    }

    public static void LJIIIZ(CreativeInfo creativeInfo, NowsShootModel nowsShootModel, NowsShootActivityArg enterShootParam, String enterFromEffectPanel) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(nowsShootModel, "nowsShootModel");
        o.LJIIIZ(enterShootParam, "enterShootParam");
        o.LJIIIZ(enterFromEffectPanel, "enterFromEffectPanel");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", enterShootParam.getShootWay());
        c145995oB.LJI("shoot_tab_name", C60903NvH.LJIIJJI().LJJIII().getNowUIService().getTabName());
        c145995oB.LJI("shoot_entrance", "now");
        c145995oB.LJI("shoot_page", "now_shoot_page");
        c145995oB.LJI("enter_from", enterFromEffectPanel);
        if (enterShootParam.isBlueVUser()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_blue_v_user", str);
        c145995oB.LJI("content_source", "shoot");
        c145995oB.LJI("creation_id", creativeInfo.getCreationId());
        c145995oB.LJI("shoot_enter_from", enterShootParam.getEnterFrom());
        c145995oB.LJI("shoot_enter_method", enterShootParam.getEnterMethod());
        c145995oB.LJI("now_card_type", enterShootParam.getNowCardType());
        c145995oB.LJI("now_type", enterShootParam.getNowType());
        c145995oB.LJI("enter_position", enterShootParam.getEnterPosition());
        c145995oB.LJI("shoot_now_enter_position", enterShootParam.getEnterPosition());
        c145995oB.LJI("now_blur_shoot_position", enterShootParam.getShootPosition());
        if (nowsShootModel.type == 0) {
            str2 = "click";
        } else {
            str2 = "press";
        }
        c145995oB.LJI("record_type", str2);
        LIZIZ(c145995oB, nowsShootModel);
        c145995oB.LJI("internet_status", C79004UzY.LJJJJLL(C163626bW.LIZJ()));
        c145995oB.LJI("light_status", nowsShootModel.lightStatus);
        c145995oB.LIZ(enterShootParam.isNewPage(), "is_new_page");
        if (enterShootParam.isNewPage() != 0) {
            c145995oB.LIZLLL("previous_page", enterShootParam.getPreviousPage());
            c145995oB.LIZLLL("now_tab_enter_method", enterShootParam.getNowTabEnterMethod());
        }
        c145995oB.LIZ(C78841Uwv.LJ(C47636Imm.LIZ()), "earphone_state");
        if (C60903NvH.LJIIJJI().LJJIL().getAICaptionSwitch(false)) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        c145995oB.LJI("auto_meme_mode", str3);
        GXR.LIZ("record_video", c145995oB.LIZ);
    }

    public static void LJIIL(NowsShootActivityArg enterShootParam, boolean z, NowsShootModel shootModel, long j) {
        String str;
        o.LJIIIZ(enterShootParam, "enterShootParam");
        o.LJIIIZ(shootModel, "shootModel");
        long j2 = j - shootModel.switchCameraStartTime;
        C145995oB LIZ2 = UFE.LIZ(j2, "first_frame_duration");
        LIZ2.LIZIZ(j2, "first_ui_frame_duration");
        LIZ2.LJI("shoot_way", enterShootParam.getShootWay());
        LIZ2.LJI("enter_from", "video_shoot_page");
        LIZ2.LJI("shoot_enter_from", enterShootParam.getEnterFrom());
        LIZ2.LJI("is_first_start", C79004UzY.LJJJJLL(shootModel.isFirstStart));
        LIZ2.LJI("is_front_camera", C79004UzY.LJJJJLL(z));
        LIZ2.LJI("multi_camera_mode", shootModel.multiCameraMode);
        if (z) {
            str = "2";
        } else {
            str = "1";
        }
        LIZ2.LJI("is_switch_camera", str);
        LIZ2.LJI("first_content_type", shootModel.firstContentType);
        java.util.Map<String, String> map = LIZ2.LIZ;
        o.LJIIIIZZ(map, "newBuilder.builder()");
        C42318GjC.LIZIZ("tool_performance_record_first_frame", map);
    }

    public static void LJIIJ(NowsShootActivityArg enterShootParam, InterfaceC83865Wvl mediaController, boolean z, NowsShootModel shootModel, boolean z2) {
        String str;
        String str2;
        o.LJIIIZ(enterShootParam, "enterShootParam");
        o.LJIIIZ(mediaController, "mediaController");
        o.LJIIIZ(shootModel, "shootModel");
        String str3 = "2";
        if (!z2) {
            if (z) {
                if (shootModel.nowsExtra.isDualCamera) {
                    str2 = "1";
                } else {
                    str2 = "4";
                }
            } else if (shootModel.nowsExtra.isDualCamera) {
                str2 = "2";
            } else {
                str2 = "5";
            }
            shootModel.multiCameraMode = str2;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", enterShootParam.getShootWay());
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("shoot_enter_from", enterShootParam.getEnterFrom());
        c145995oB.LIZJ(Float.valueOf(mediaController.X8()), "fps");
        c145995oB.LIZ(mediaController.D8(), "lag_count");
        c145995oB.LIZ(mediaController.B8(), "serious_lag_count");
        c145995oB.LJI("multi_camera_mode", shootModel.multiCameraMode);
        if (shootModel.nowsExtra.isDualCamera) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("multi_camera_window", str);
        NowsExtra nowsExtra = shootModel.nowsExtra;
        if (nowsExtra.isDualCamera && z2) {
            if (!o.LJ(nowsExtra.shootOrder, "back_first")) {
                str3 = "1";
            }
            c145995oB.LIZLLL("is_switch_camera", str3);
        }
        java.util.Map<String, String> map = c145995oB.LIZ;
        o.LJIIIIZZ(map, "newBuilder.builder()");
        C42318GjC.LIZIZ("tool_performance_video_preview", map);
    }

    public static void LJIIJJI(NowsShootActivityArg enterShootParam, HK7 firstFrameData, NowsShootModel nowsShootModel, boolean z, C82622Wbi diContainer, InterfaceC82086WJm cameraApiComponent) {
        long j;
        o.LJIIIZ(enterShootParam, "enterShootParam");
        o.LJIIIZ(firstFrameData, "firstFrameData");
        o.LJIIIZ(nowsShootModel, "nowsShootModel");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        long j2 = firstFrameData.LJLJI;
        long j3 = firstFrameData.LJLIL;
        Long startNowsRecordTime = enterShootParam.getStartNowsRecordTime();
        if (startNowsRecordTime != null) {
            j = startNowsRecordTime.longValue();
        } else {
            j = 0;
        }
        long j4 = j2 - j;
        long j5 = j3 - j;
        C145995oB c145995oB = new C145995oB();
        LIZ(c145995oB, enterShootParam, z, nowsShootModel);
        c145995oB.LIZIZ(j5, "first_frame_duration");
        c145995oB.LIZIZ(j4, "first_ui_frame_duration");
        if (HC7.LIZ()) {
            C10K.LIZJ(new ACallableS56S0300000_7(new C43910HLe(diContainer, cameraApiComponent), c145995oB, new AqS157S0100000_7(c145995oB, 150), 16));
            return;
        }
        java.util.Map<String, String> map = c145995oB.LIZ;
        o.LJIIIIZZ(map, "newBuilder.builder()");
        C42318GjC.LIZIZ("tool_performance_record_first_frame", map);
    }
}
