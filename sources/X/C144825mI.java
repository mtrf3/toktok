package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.5mI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144825mI {
    public static ValueAnimator LIZ;
    public static ValueAnimator LIZIZ;
    public static ValueAnimator LIZJ;
    public static ValueAnimator LIZLLL;

    public static void LIZ(final View view, final C1547165j c1547165j, final float f, Context context, long j, Integer num, Integer num2, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, int i) {
        final int i2;
        final int marginStart;
        final boolean z2 = z;
        long j2 = j;
        final InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        if ((i & 16) != 0) {
            j2 = 150;
        }
        final InterfaceC65784Pro interfaceC65784Pro2 = null;
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            num2 = null;
        }
        if ((i & 128) != 0) {
            z2 = false;
        }
        if ((i & 256) != 0) {
            interfaceC88472Yns2 = null;
        }
        if ((i & 512) == 0) {
            interfaceC65784Pro2 = interfaceC65784Pro;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j2);
        final int i3 = view.getLayoutParams().width;
        final int LIZ2 = (int) C74275TDb.LIZ(4.0f);
        if (num != null) {
            i2 = num.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        if (num2 != null) {
            marginStart = num2.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
        }
        ViewGroup.LayoutParams layoutParams3 = c1547165j.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        final int i4 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
        ViewGroup.LayoutParams layoutParams4 = c1547165j.getLayoutParams();
        o.LJII(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        final int marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5mH
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                int i5 = i3;
                float LIZIZ2 = C06420Na.LIZIZ(f, i5, floatValue, i5);
                View view2 = view;
                int i6 = (int) LIZIZ2;
                int i7 = (int) (LIZIZ2 / 0.75f);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(i6, i7);
                boolean z3 = z2;
                int i8 = i2;
                int i9 = marginStart;
                if (z3) {
                    i8 = (int) (i8 * floatValue);
                }
                layoutParams5.topMargin = i8;
                if (z3) {
                    i9 = (int) (i9 * floatValue);
                }
                layoutParams5.setMarginStart(i9);
                view2.setLayoutParams(layoutParams5);
                View view3 = c1547165j;
                int i10 = LIZ2;
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(i6 + i10, i7 + i10);
                int i11 = i4;
                int i12 = marginStart2;
                layoutParams6.topMargin = i11;
                layoutParams6.setMarginStart(i12);
                view3.setLayoutParams(layoutParams6);
                InterfaceC88472Yns<Float, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns2;
                if (interfaceC88472Yns3 != null) {
                    interfaceC88472Yns3.invoke(Float.valueOf(floatValue));
                }
            }
        });
        if (interfaceC65784Pro2 != null) {
            final int i5 = i2;
            final int i6 = marginStart;
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.5il
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    super.onAnimationEnd(animation);
                    View view2 = view;
                    float f2 = f;
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) f2, (int) (f2 / 0.75f));
                    int i7 = i5;
                    int i8 = i6;
                    layoutParams5.topMargin = i7;
                    layoutParams5.setMarginStart(i8);
                    view2.setLayoutParams(layoutParams5);
                    View view3 = c1547165j;
                    float f3 = f;
                    int i9 = LIZ2;
                    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(((int) f3) + i9, ((int) (f3 / 0.75f)) + i9);
                    int i10 = i4;
                    int i11 = marginStart2;
                    layoutParams6.topMargin = i10;
                    layoutParams6.setMarginStart(i11);
                    view3.setLayoutParams(layoutParams6);
                    interfaceC65784Pro2.invoke();
                }
            });
        }
        ofFloat.start();
        LIZIZ = ofFloat;
    }
}
