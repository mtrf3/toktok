package X;

import Y.AUListenerS90S0100000_1;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.jvm.internal.o;

/* renamed from: X.N7y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58854N7y {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static ValueAnimator LIZ(RelationButton view, int i, int i2) {
        o.LJIIIZ(view, "view");
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new AUListenerS90S0100000_1(view, 64));
        ofInt.setDuration(300);
        ofInt.setTarget(view);
        return ofInt;
    }

    public static void LIZIZ(View view, Integer num, Integer num2) {
        if (view != null && num != null) {
            num.intValue();
            if (num2 != null) {
                num2.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(num.intValue());
                C59894Nf0.LIZJ(view, gradientDrawable, num.intValue(), num2.intValue(), 300);
            }
        }
    }

    public static void LIZJ(RelationButton relationButton, int i, boolean z) {
        if (relationButton == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = relationButton.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i2 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
        if (z) {
            if (i2 < 0) {
                LIZ(relationButton, i2, i).start();
            }
        } else {
            if (i2 < 0) {
                return;
            }
            LIZ(relationButton, i2, i).start();
        }
    }
}
