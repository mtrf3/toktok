package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.WYe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82468WYe {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        if (C52461KiP.LIZIZ()) {
            return "record_return";
        }
        if (C52461KiP.LIZLLL()) {
            return "vad_return";
        }
        if (C52461KiP.LIZJ()) {
            return "sample_preview";
        }
        return "";
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        FMX.LJIIL("click_voice_effect_entrance", LJIIIZ(shortVideoContext).LIZ);
    }

    public static C145995oB LJIIIZ(ShortVideoContext shortVideoContext) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("content_source", shortVideoContext.LIZLLL().getContentSource());
        c145995oB.LJI("content_type", shortVideoContext.LIZLLL().getContentType());
        return c145995oB;
    }

    public static void LJI(ShortVideoContext shortVideoContext, Effect effect) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(effect, "effect");
        C145995oB LJIIIZ = LJIIIZ(shortVideoContext);
        LJIIIZ.LIZLLL("effect_id", effect.getEffect_id());
        LJIIIZ.LIZLLL("effect_name", effect.getName());
        LJIIIZ.LIZLLL("voice_play_type", LIZ());
        FMX.LJIIL("voice_effect_preview_play_start", LJIIIZ.LIZ);
    }

    public static void LJII(ShortVideoContext shortVideoContext, Effect effect) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(effect, "effect");
        C145995oB LJIIIZ = LJIIIZ(shortVideoContext);
        LJIIIZ.LIZLLL("effect_id", effect.getEffect_id());
        LJIIIZ.LIZLLL("effect_name", effect.getName());
        FMX.LJIIL("voice_effect_preview_record_start", LJIIIZ.LIZ);
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, String str, Effect effect) {
        int i;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(effect, "effect");
        C145995oB LJIIIZ = LJIIIZ(shortVideoContext);
        LJIIIZ.LIZLLL("enter_method", str);
        LJIIIZ.LIZLLL("effect_id", effect.getEffect_id());
        LJIIIZ.LIZLLL("effect_name", effect.getName());
        if (OUP.LJJJLZIJ(effect).length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        LJIIIZ.LIZ(i, "is_voice_effect");
        FMX.LJIIL("voice_effect_panel_close", LJIIIZ.LIZ);
    }

    public static void LIZLLL(ShortVideoContext shortVideoContext, String str, String str2) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        C145995oB LJIIIZ = LJIIIZ(shortVideoContext);
        LJIIIZ.LIZLLL("to_status", str);
        LJIIIZ.LIZLLL("enter_method", str2);
        FMX.LJIIL("voice_effect_panel_trans", LJIIIZ.LIZ);
    }

    public static void LJFF(ShortVideoContext shortVideoContext, Effect effect, boolean z) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(effect, "effect");
        C145995oB LJIIIZ = LJIIIZ(shortVideoContext);
        LJIIIZ.LIZLLL("effect_id", effect.getEffect_id());
        LJIIIZ.LIZLLL("effect_name", effect.getName());
        LJIIIZ.LIZLLL("shoot_entrance", shortVideoContext.LIZLLL().getStoryShootEntrance());
        LJIIIZ.LIZ(z ? 1 : 0, "is_play");
        LJIIIZ.LIZLLL("voice_play_type", LIZ());
        FMX.LJIIL("voice_effect_preview_play_interrupt", LJIIIZ.LIZ);
    }

    public static void LJ(ShortVideoContext shortVideoContext, Effect effect, long j, boolean z) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(effect, "effect");
        C145995oB LJIIIZ = LJIIIZ(shortVideoContext);
        LJIIIZ.LIZLLL("effect_id", effect.getEffect_id());
        LJIIIZ.LIZLLL("effect_name", effect.getName());
        LJIIIZ.LIZIZ(j, "duration");
        LJIIIZ.LIZ(z ? 1 : 0, "is_finish");
        LJIIIZ.LIZLLL("voice_play_type", LIZ());
        FMX.LJIIL("voice_effect_preview_play_end", LJIIIZ.LIZ);
    }

    public static void LJIIIIZZ(ShortVideoContext shortVideoContext, Effect effect, boolean z, boolean z2) {
        String str;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(effect, "effect");
        C145995oB LJIIIZ = LJIIIZ(shortVideoContext);
        LJIIIZ.LIZLLL("effect_id", effect.getEffect_id());
        LJIIIZ.LIZLLL("effect_name", effect.getName());
        LJIIIZ.LIZLLL("shoot_entrance", shortVideoContext.LIZLLL().getStoryShootEntrance());
        LJIIIZ.LIZLLL("to_status", "add");
        if (z) {
            str = "default_selection";
        } else {
            str = "user_selection";
        }
        LJIIIZ.LIZLLL("select_type", str);
        LJIIIZ.LIZ(z2 ? 1 : 0, "is_prop_on");
        FMX.LJIIL("select_voice_effect", LJIIIZ.LIZ);
    }
}
