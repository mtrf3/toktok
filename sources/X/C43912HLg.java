package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.beauty.MBeautyStateInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.HLg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43912HLg {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, String scene, int i, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, java.util.Map<String, String> map) {
        o.LJIIIZ(scene, "scene");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", str2);
        c145995oB.LJI("shoot_way", str3);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(scene);
        LIZ2.append("_page");
        c145995oB.LJI("scene_name", X1D.LIZIZ(LIZ2));
        c145995oB.LIZ(i, "finish_count");
        c145995oB.LIZIZ(j2, "app_memory_end");
        c145995oB.LIZIZ(j, "app_memory_start");
        c145995oB.LIZIZ(j - j2, "app_memory_change");
        c145995oB.LIZIZ(j3, "available_memory_start");
        c145995oB.LIZIZ(j4, "available_memory_end");
        c145995oB.LIZIZ(j3 - j4, "available_memory_change");
        c145995oB.LIZIZ(j5, "used_memory_start");
        c145995oB.LIZIZ(j6, "used_memory_end");
        c145995oB.LIZIZ(j5 - j6, "used_memory_change");
        if (map != null) {
            c145995oB.LJFF(map);
        }
        GXR.LIZ(str, c145995oB.LIZ);
    }

    public static final void LIZIZ(ShortVideoContext shortVideoContext, InterfaceC83865Wvl mediaController, InterfaceC83727WtX effectController, FaceStickerBean faceStickerBean, Integer num, ComposerBeautyBuriedInfo composerBeautyBuriedInfo, MBeautyStateInfo mBeautyStateInfo, int i, String str, String str2, long j, InterfaceC88471Ynr<? super String, ? super java.util.Map<String, String>, C76800UCe> uploadEvent) {
        String str3;
        Object obj;
        String str4;
        String valueOf;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(mediaController, "mediaController");
        o.LJIIIZ(effectController, "effectController");
        o.LJIIIZ(uploadEvent, "uploadEvent");
        C145995oB c145995oB = new C145995oB();
        long j2 = 0;
        if (j > 0) {
            j2 = System.currentTimeMillis() - j;
        }
        c145995oB.LJI("next_action", str);
        String str5 = null;
        if (faceStickerBean != null) {
            str5 = faceStickerBean.getId();
        }
        if (str5 == null) {
            str5 = "";
        }
        c145995oB.LJI("effect_id", str5);
        if (faceStickerBean == null || (str3 = faceStickerBean.getRecId()) == null) {
            str3 = "";
        }
        c145995oB.LJI("effect_rec_id", str3);
        if (faceStickerBean == null) {
            obj = "";
        } else {
            obj = Long.valueOf(faceStickerBean.getStickerId());
        }
        c145995oB.LIZJ(obj, "effect_sticker_id");
        c145995oB.LIZ(C44228HXk.LIZIZ(composerBeautyBuriedInfo, mBeautyStateInfo), "beauty_status");
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("resolution", C44739Hh9.LJIIIIZZ());
        c145995oB.LJI("camera", g0.LJIILLIIL(String.valueOf(i)));
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LIZJ(Float.valueOf(mediaController.X8()), "fps");
        c145995oB.LIZ(mediaController.D8(), "lag_count");
        c145995oB.LIZ(mediaController.E8(), "lag_max");
        c145995oB.LIZ(mediaController.z8(), "lag_total_duration");
        c145995oB.LIZ(mediaController.B8(), "serious_lag_count");
        c145995oB.LIZ(C44228HXk.LIZJ(), "beautify_used");
        c145995oB.LJI("beautify_info", C44228HXk.LJII(composerBeautyBuriedInfo));
        c145995oB.LIZ(C44228HXk.LJIIIIZZ(composerBeautyBuriedInfo), "is_composer");
        if (faceStickerBean == null || (str4 = faceStickerBean.getResourceID()) == null) {
            str4 = "";
        }
        c145995oB.LJI("resource_id", str4);
        c145995oB.LJI("music_id", str2);
        c145995oB.LIZJ(Float.valueOf(mediaController.F8()), "n_camera_frame_interval");
        c145995oB.LIZIZ(j2, "duration");
        if (num == null) {
            c145995oB.LIZLLL("filter_id", "");
        } else {
            int intValue = num.intValue();
            if (intValue == 0) {
                valueOf = "-1";
            } else {
                valueOf = String.valueOf(intValue);
            }
            c145995oB.LIZLLL("filter_id", valueOf);
        }
        C44989HlB.LIZ(c145995oB);
        C78939UyV.LIZLLL(c145995oB, effectController);
        java.util.Map<String, String> map = c145995oB.LIZ;
        o.LJIIIIZZ(map, "builder.builder()");
        uploadEvent.invoke("tool_performance_video_preview", map);
    }
}
