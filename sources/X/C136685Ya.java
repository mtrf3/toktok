package X;

import Y.ALAdapterS0S0200100_2;
import Y.ALAdapterS1S0100000_2;
import Y.ALAdapterS1S0200000_2;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: X.5Ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136685Ya {
    public static void LIZ(View view) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new ALAdapterS1S0200000_2(view, 13));
        ofFloat.start();
    }

    public static void LIZIZ(long j, ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new ALAdapterS0S0200100_2(j, aLAdapterS1S0100000_2, view, 1));
        ofFloat.start();
    }
}
