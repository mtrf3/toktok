package X;

import Y.IDAListenerS74S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPostRechargeSoundEffectSetting;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.CqC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32560CqC extends C78983UzD {
    public final /* synthetic */ C32553Cq5 LJZL;
    public final /* synthetic */ int LL;

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
        C0NB.LJIIIZ("Recharge Anim Debug", "Animation Started");
        if (LiveGiftPostRechargeSoundEffectSetting.INSTANCE.enable()) {
            if (C78254UnS.LJFF == 0) {
                C78254UnS.LIZ();
            }
            C78254UnS.LIZ.play(C78254UnS.LJFF, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 drawable) {
        o.LJIIIZ(drawable, "drawable");
        C32553Cq5 c32553Cq5 = this.LJZL;
        int i = this.LL;
        c32553Cq5.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('+');
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        TextView textView = c32553Cq5.LJLLLL;
        if (textView != null) {
            textView.setText(LIZIZ);
        }
        TextView textView2 = c32553Cq5.LJLLLL;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(c32553Cq5.LJLLLL, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(400L);
        o.LJIIIIZZ(duration, "ofFloat(addNumberAnim, V…N_400.toLong(),\n        )");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(c32553Cq5.LJLLLL, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(350L);
        o.LJIIIIZZ(duration2, "ofFloat(addNumberAnim, V…N_350.toLong(),\n        )");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration);
        animatorSet.play(duration2).after(700L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(c32553Cq5.LJLLLL, (Property<TextView, Float>) View.TRANSLATION_Y, 0.0f, -35.0f).setDuration(300L);
        o.LJIIIIZZ(duration3, "ofFloat(addNumberAnim, V…0.toLong(),\n            )");
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(c32553Cq5.LJLLLL, (Property<TextView, Float>) View.TRANSLATION_Y, -35.0f, -40.0f).setDuration(700L);
        o.LJIIIIZZ(duration4, "ofFloat(addNumberAnim, V…0.toLong(),\n            )");
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(duration3);
        animatorSet2.play(duration4).after(300L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(animatorSet, animatorSet2);
        animatorSet3.addListener(new IDAListenerS74S0100000_5(c32553Cq5, 0));
        animatorSet3.start();
        C0NB.LJIIIZ("Recharge Anim Debug", "Animation Ended");
    }

    public C32560CqC(C32553Cq5 c32553Cq5, int i) {
        this.LJZL = c32553Cq5;
        this.LL = i;
    }
}
