package X;

import Y.IDAListenerS39S0200000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Ca9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31565Ca9 implements InterfaceC31578CaM {
    public final /* synthetic */ C31563Ca7 LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C76732zl LIZJ;
    public final /* synthetic */ C29800Bmm LIZLLL;

    @Override // X.InterfaceC31578CaM
    public final void LIZ() {
        int i;
        this.LIZ.LJLJJI.setVisibility(8);
        this.LIZ.LJLLLLLL.setVisibility(8);
        this.LIZ.LJLJJL.setVisibility(0);
        C47121t6 c47121t6 = this.LIZ.LJLJJL;
        Locale locale = Locale.US;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.k_7);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_alp_bar_levelup_1)");
        String LLLZI = C16880lQ.LLLZI(locale, LJIILJJIL, Arrays.copyOf(new Object[]{Integer.valueOf(this.LIZIZ)}, 1));
        o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
        c47121t6.setText(LLLZI);
        C31563Ca7 c31563Ca7 = this.LIZ;
        C31564Ca8 c31564Ca8 = new C31564Ca8(this.LIZIZ, this.LIZLLL, c31563Ca7, this.LIZJ);
        c31563Ca7.getClass();
        if (C15380j0.LJIIZILJ()) {
            i = 1;
        } else {
            i = -1;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        float f = i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c31563Ca7.LJLJJL, (Property<C47121t6, Float>) ViewGroup.TRANSLATION_X, C15380j0.LIZ(45.0f) * f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(\n            upg…            0F,\n        )");
        ofFloat.setDuration(c31563Ca7.LJLLL);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c31563Ca7.LJLJJL, (Property<C47121t6, Float>) ViewGroup.ALPHA, 0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(\n            upg…            1F,\n        )");
        ofFloat2.setDuration(c31563Ca7.LJLLL);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c31563Ca7.LJLJJL, (Property<C47121t6, Float>) ViewGroup.TRANSLATION_X, 0.0f, C15380j0.LIZ(45.0f) * f);
        o.LJIIIIZZ(ofFloat3, "ofFloat(\n            upg… * orientation,\n        )");
        ofFloat3.setDuration(c31563Ca7.LJLLL);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c31563Ca7.LJLJJL, (Property<C47121t6, Float>) ViewGroup.ALPHA, 1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat4, "ofFloat(\n            upg…            0F,\n        )");
        ofFloat4.setDuration(c31563Ca7.LJLLL);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c31563Ca7.LJLJJL, (Property<C47121t6, Float>) ViewGroup.ALPHA, 1.0f, 1.0f);
        o.LJIIIIZZ(ofFloat5, "ofFloat(\n            upg…            1F,\n        )");
        ofFloat5.setDuration(c31563Ca7.LJLLLL);
        animatorSet.play(ofFloat).with(ofFloat2).before(ofFloat5);
        animatorSet2.play(ofFloat3).with(ofFloat4);
        animatorSet.addListener(new IDAListenerS39S0200000_5(c31564Ca8, animatorSet2, 5));
        animatorSet2.addListener(new IDAListenerS74S0100000_5(c31564Ca8, 42));
        animatorSet.start();
    }

    public C31565Ca9(int i, C29800Bmm c29800Bmm, C31563Ca7 c31563Ca7, C76732zl c76732zl) {
        this.LIZ = c31563Ca7;
        this.LIZIZ = i;
        this.LIZJ = c76732zl;
        this.LIZLLL = c29800Bmm;
    }
}
