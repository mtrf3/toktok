package X;

import Y.AUListenerS0S0303000_8;
import Y.AUListenerS39S0110000_8;
import Y.IDAListenerS3S0110000_8;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import kotlin.jvm.internal.AqS158S0100000_8;

/* renamed from: X.JAy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48740JAy {
    public final TuxTextView LIZ;
    public final TuxTextView LIZIZ;
    public final View LIZJ;
    public final LinearLayout LIZLLL;
    public final LinearLayout LJ;
    public final InterfaceC65784Pro<Float> LJFF;
    public CountDownTimer LJI;
    public boolean LJII;
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(DJY.LJLIL);

    public final void LIZLLL() {
        ViewGroup.LayoutParams layoutParams;
        this.LJII = false;
        CountDownTimer countDownTimer = this.LJI;
        if (countDownTimer != null && countDownTimer.isRunning()) {
            CountDownTimer countDownTimer2 = this.LJI;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            TuxTextView tuxTextView = this.LIZIZ;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            View view = this.LIZJ;
            if (view == null || (layoutParams = view.getLayoutParams()) == null) {
                return;
            }
            layoutParams.width = -2;
        }
    }

    public final void LIZ(boolean z) {
        float f;
        View view = this.LIZJ;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            view2.setAlpha(f);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS39S0110000_8(this, z, 0));
        ofFloat.addListener(new IDAListenerS3S0110000_8(this, z, 1));
        ofFloat.start();
    }

    public final void LIZIZ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        float f;
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.LIZLLL;
        if (linearLayout2 != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            linearLayout2.setAlpha(f);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new AUListenerS39S0110000_8(this, z, 1));
        ofFloat.addListener(new JB0(z, this, interfaceC65784Pro));
        ofFloat.start();
    }

    public final void LIZJ(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        View view2;
        int i;
        if (view == null || (view2 = this.LIZJ) == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(150L);
        int width = view.getWidth();
        int width2 = view2.getWidth();
        float floatValue = this.LJFF.invoke().floatValue();
        if (floatValue == 1.0f || floatValue == 2.0f) {
            i = C17N.LJIILL(58.0d);
        } else if (floatValue == 0.5f || floatValue == 1.5f) {
            i = C17N.LJIILL(67.0d);
        } else {
            i = 0;
        }
        ofFloat.addUpdateListener(new AUListenerS0S0303000_8(this, view, width, width2, view2, i, 0));
        ofFloat.addListener(new C48741JAz(interfaceC65784Pro, view, this));
        ofFloat.start();
    }

    public C48740JAy(TuxTextView tuxTextView, TuxTextView tuxTextView2, View view, LinearLayout linearLayout, LinearLayout linearLayout2, AqS158S0100000_8 aqS158S0100000_8) {
        this.LIZ = tuxTextView;
        this.LIZIZ = tuxTextView2;
        this.LIZJ = view;
        this.LIZLLL = linearLayout;
        this.LJ = linearLayout2;
        this.LJFF = aqS158S0100000_8;
    }
}
