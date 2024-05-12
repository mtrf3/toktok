package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.972, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass972 {
    public final ConstraintLayout LIZ;
    public final ValueAnimator LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public AnonymousClass972(ConstraintLayout constraintLayout, TuxTextView tuxTextView) {
        this.LIZ = constraintLayout;
        int width = tuxTextView.getWidth();
        Integer num = 16;
        o.LJIIIZ(num, "<this>");
        int applyDimension = width + ((int) TypedValue.applyDimension(1, num.floatValue(), Resources.getSystem().getDisplayMetrics()));
        this.LIZIZ = ValueAnimator.ofFloat(0.0f, applyDimension * 1.0f);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        this.LIZJ = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        this.LIZLLL = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() + applyDimension;
    }
}
