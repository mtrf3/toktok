package X;

import Y.ACListenerS25S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.performance.GoLiveMemoryLeakOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Byx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30555Byx {
    public static AnimatorSet LIZ;
    public static AnimatorSet LIZIZ;
    public static AnimatorSet LIZJ;
    public static AnimatorSet LIZLLL;
    public static AnimatorSet LJ;
    public static AnimatorSet LJFF;
    public static C15540jG LJI = new C15540jG();

    public static void LIZIZ() {
        if (GoLiveMemoryLeakOptSetting.INSTANCE.enable()) {
            LJI = null;
        }
        LIZ = null;
        LIZIZ = null;
        LIZJ = null;
        LIZLLL = null;
        LJ = null;
        LJFF = null;
    }

    public static void LIZ(C0N0 view, DataChannel dataChannel) {
        String str;
        o.LJIIIZ(view, "view");
        LIZ = new AnimatorSet();
        LIZIZ = new AnimatorSet();
        LIZJ = new AnimatorSet();
        LIZLLL = new AnimatorSet();
        LJ = new AnimatorSet();
        LJFF = new AnimatorSet();
        view.findViewById(R.id.dje).setVisibility(0);
        view.findViewById(R.id.dje).setAlpha(1.0f);
        view.findViewById(R.id.djf).setAlpha(0.0f);
        view.findViewById(R.id.d2_).setAlpha(0.0f);
        view.findViewById(R.id.dje).setClickable(true);
        C15540jG c15540jG = LJI;
        if (c15540jG != null) {
            C47061t0 c47061t0 = (C47061t0) view.findViewById(R.id.e0u);
            o.LJIIIIZZ(c47061t0, "view.guide_hand");
            c15540jG.LIZ = c47061t0;
            c15540jG.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1");
            c15540jG.LJFF = true;
            c15540jG.LJ = new C30556Byy(view);
        }
        C15540jG c15540jG2 = LJI;
        if (c15540jG2 != null) {
            c15540jG2.LIZJ = "ttlive_focus_guide_hand.webp";
        }
        C15490jB.LJI(c15540jG2);
        ((C47121t6) view.findViewById(R.id.e1a)).LJJIJIL(R.style.a3z);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view.findViewById(R.id.e0u), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
        o.LJIIIIZZ(duration, "ofFloat(view.guide_hand,…on(FADE_IN_ANIM_DURATION)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view.findViewById(R.id.dje), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(500L);
        o.LJIIIIZZ(duration2, "ofFloat(view.focus_and_c…n(FADE_OUT_ANIM_DURATION)");
        duration2.setStartDelay(1000L);
        AnimatorSet animatorSet = LIZ;
        if (animatorSet != null) {
            animatorSet.playSequentially(duration, duration2);
        }
        AnimatorSet animatorSet2 = LIZ;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
        ObjectAnimator LIZ2 = C0F0.LIZ((C47121t6) view.findViewById(R.id.e1a), View.ALPHA, new float[]{0.0f, 1.0f}, 300L, "ofFloat(view.guide_text,…on(FADE_IN_ANIM_DURATION)");
        AnimatorSet animatorSet3 = LIZIZ;
        if (animatorSet3 != null) {
            animatorSet3.play(LIZ2);
        }
        AnimatorSet animatorSet4 = LIZIZ;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view.findViewById(R.id.djf), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
        o.LJIIIIZZ(duration3, "ofFloat(view.focus_circl…on(FADE_IN_ANIM_DURATION)");
        AnimatorSet animatorSet5 = LIZJ;
        if (animatorSet5 != null) {
            animatorSet5.setStartDelay(800L);
        }
        AnimatorSet animatorSet6 = LIZJ;
        if (animatorSet6 != null) {
            animatorSet6.play(duration3);
        }
        AnimatorSet animatorSet7 = LIZJ;
        if (animatorSet7 != null) {
            animatorSet7.start();
        }
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view.findViewById(R.id.d2_), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
        o.LJIIIIZZ(duration4, "ofFloat(view.exposure_su…on(FADE_IN_ANIM_DURATION)");
        AnimatorSet animatorSet8 = LIZLLL;
        if (animatorSet8 != null) {
            animatorSet8.setStartDelay(800L);
        }
        AnimatorSet animatorSet9 = LIZLLL;
        if (animatorSet9 != null) {
            animatorSet9.play(duration4);
        }
        AnimatorSet animatorSet10 = LIZLLL;
        if (animatorSet10 != null) {
            animatorSet10.start();
        }
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view.findViewById(R.id.djf), (Property<View, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(300L);
        o.LJIIIIZZ(duration5, "ofFloat(view.focus_circl…on(FADE_IN_ANIM_DURATION)");
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view.findViewById(R.id.djf), (Property<View, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(300L);
        o.LJIIIIZZ(duration6, "ofFloat(view.focus_circl…on(FADE_IN_ANIM_DURATION)");
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view.findViewById(R.id.d2_), (Property<View, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(300L);
        o.LJIIIIZZ(duration7, "ofFloat(view.exposure_su…on(FADE_IN_ANIM_DURATION)");
        ObjectAnimator duration8 = ObjectAnimator.ofFloat(view.findViewById(R.id.d2_), (Property<View, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(300L);
        o.LJIIIIZZ(duration8, "ofFloat(view.exposure_su…on(FADE_IN_ANIM_DURATION)");
        AnimatorSet animatorSet11 = new AnimatorSet();
        animatorSet11.setStartDelay(800L);
        animatorSet11.playTogether(duration5, duration6, duration7, duration8);
        animatorSet11.start();
        AnimatorSet animatorSet12 = LIZ;
        if (animatorSet12 != null) {
            animatorSet12.addListener(new IDAListenerS74S0100000_5(view, 1));
        }
        ObjectAnimator duration9 = ObjectAnimator.ofFloat(view.findViewById(R.id.e0u), (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -30.0f).setDuration(300L);
        o.LJIIIIZZ(duration9, "ofFloat(view.guide_hand,…on(FADE_IN_ANIM_DURATION)");
        AnimatorSet animatorSet13 = LJ;
        if (animatorSet13 != null) {
            animatorSet13.play(duration9);
        }
        AnimatorSet animatorSet14 = LJ;
        if (animatorSet14 != null) {
            animatorSet14.start();
        }
        ObjectAnimator LIZ3 = C0F0.LIZ((C47121t6) view.findViewById(R.id.e1a), View.TRANSLATION_Y, new float[]{0.0f, -30.0f}, 300L, "ofFloat(view.guide_text,…on(FADE_IN_ANIM_DURATION)");
        AnimatorSet animatorSet15 = LJFF;
        if (animatorSet15 != null) {
            animatorSet15.play(LIZ3);
        }
        AnimatorSet animatorSet16 = LJFF;
        if (animatorSet16 != null) {
            animatorSet16.start();
        }
        view.findViewById(R.id.dje).setClickable(true);
        C16880lQ.LJIL((ConstraintLayout) view.findViewById(R.id.dje), new ACListenerS25S0100000_5(view, 16));
        BZI LIZ4 = C28787BRn.LIZ("livesdk_live_focus_exposure_guide");
        LIZ4.LJIILLIIL(dataChannel);
        LIZ4.LJIJJ(0, "is_dual_camera");
        Integer LIZIZ2 = InterfaceC30442Bx8.LJIIIZ.LIZIZ();
        if (LIZIZ2 == null || LIZIZ2.intValue() != 1) {
            str = "back";
        } else {
            str = "front";
        }
        LIZ4.LJIJJ(str, "camera_type");
        LIZ4.LJIJJ(0, "detected_exp");
        LIZ4.LJJIIJZLJL();
    }
}
