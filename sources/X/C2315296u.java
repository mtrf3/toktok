package X;

import Y.AUListenerS93S0100000_4;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.96u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2315296u {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, int i, int i2, boolean z) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i3 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
        if (z) {
            if (i3 < 0) {
                LIZIZ(view, i3, i, i2).start();
            }
        } else {
            if (i3 < 0) {
                return;
            }
            LIZIZ(view, i3, i, i2).start();
        }
    }

    public static ValueAnimator LIZIZ(View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new AUListenerS93S0100000_4(view, 26));
        ofInt.setDuration(i3);
        ofInt.setTarget(view);
        return ofInt;
    }
}
