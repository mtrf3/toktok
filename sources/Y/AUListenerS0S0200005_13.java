package Y;

import X.C264612c;
import X.C29306Beo;
import X.C78140Ulc;
import X.EnumC78141Uld;
import X.X1D;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.common.utility.Logger;

/* loaded from: classes14.dex */
public class AUListenerS0S0200005_13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f2;
    public float f3;
    public float f4;
    public float f5;
    public float f6;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS0S0200005_13 aUListenerS0S0200005_13, ValueAnimator valueAnimator) {
        Float f;
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((View) aUListenerS0S0200005_13.l0).setY(aUListenerS0S0200005_13.f3 + (floatValue - aUListenerS0S0200005_13.f2));
        float abs = (Math.abs(floatValue - aUListenerS0S0200005_13.f3) * aUListenerS0S0200005_13.f5) + aUListenerS0S0200005_13.f4;
        ((View) aUListenerS0S0200005_13.l0).setScaleX(abs);
        ((View) aUListenerS0S0200005_13.l0).setScaleY(abs);
        ((C78140Ulc) aUListenerS0S0200005_13.l1).setCurrentInnerStatus(EnumC78141Uld.SCROLLING);
        boolean z = true;
        float f2 = 1;
        float abs2 = (((C78140Ulc) aUListenerS0S0200005_13.l1).LLFF - Math.abs(((View) aUListenerS0S0200005_13.l0).getY())) - (((f2 - ((View) aUListenerS0S0200005_13.l0).getScaleY()) * ((C78140Ulc) aUListenerS0S0200005_13.l1).getRealScreenHeight()) / 2);
        ((C78140Ulc) aUListenerS0S0200005_13.l1).getSurveyContentContainer().setY(abs2);
        if (Math.abs(abs2 - ((C78140Ulc) aUListenerS0S0200005_13.l1).LLFF) < ((C78140Ulc) aUListenerS0S0200005_13.l1).getAlphaCompleteDistance()) {
            float min = Math.min(f2 - (Math.abs(abs2 - ((C78140Ulc) aUListenerS0S0200005_13.l1).LLFF) / ((C78140Ulc) aUListenerS0S0200005_13.l1).getAlphaCompleteDistance()), 1.0f) + aUListenerS0S0200005_13.f6;
            View view = ((C78140Ulc) aUListenerS0S0200005_13.l1).LJLIL;
            if (view != null) {
                view.setAlpha(min);
            }
            View view2 = ((C78140Ulc) aUListenerS0S0200005_13.l1).LJLIL;
            if (view2 != null) {
                C29306Beo.LJJLJLI(view2);
            }
        }
        View view3 = ((C78140Ulc) aUListenerS0S0200005_13.l1).LJLIL;
        if (view3 == null || view3.getAlpha() <= 0.0f) {
            z = false;
        }
        C29306Beo.LJJLIIIJJI(view3, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scaleImage down anim() ----- scaleX = ");
        LIZ.append(((View) aUListenerS0S0200005_13.l0).getScaleX());
        LIZ.append(" ,  scaleY = ");
        LIZ.append(((View) aUListenerS0S0200005_13.l0).getScaleY());
        LIZ.append(", y=");
        LIZ.append(((View) aUListenerS0S0200005_13.l0).getY());
        LIZ.append(" \n container y= ");
        LIZ.append(abs2);
        LIZ.append("interaction?.alpha=");
        View view4 = ((C78140Ulc) aUListenerS0S0200005_13.l1).LJLIL;
        if (view4 != null) {
            f = Float.valueOf(view4.getAlpha());
        } else {
            f = null;
        }
        LIZ.append(f);
        Logger.i("Survey_LYP", X1D.LIZIZ(LIZ));
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0200005_13 aUListenerS0S0200005_13, ValueAnimator valueAnimator) {
        Float f;
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        float f2 = floatValue - aUListenerS0S0200005_13.f2;
        float abs = aUListenerS0S0200005_13.f3 - (Math.abs(floatValue - aUListenerS0S0200005_13.f4) * aUListenerS0S0200005_13.f5);
        boolean z = true;
        float abs2 = (((C78140Ulc) aUListenerS0S0200005_13.l0).LLFF - Math.abs(((View) aUListenerS0S0200005_13.l1).getY())) - (((1 - ((View) aUListenerS0S0200005_13.l1).getScaleY()) * ((C78140Ulc) aUListenerS0S0200005_13.l0).getRealScreenHeight()) / 2);
        ((View) aUListenerS0S0200005_13.l1).setY(aUListenerS0S0200005_13.f4 + f2);
        ((View) aUListenerS0S0200005_13.l1).setScaleX(abs);
        ((View) aUListenerS0S0200005_13.l1).setScaleY(abs);
        ((C78140Ulc) aUListenerS0S0200005_13.l0).setCurrentInnerStatus(EnumC78141Uld.SCROLLING);
        ((C78140Ulc) aUListenerS0S0200005_13.l0).getSurveyContentContainer().setY(abs2);
        if (Math.abs(abs2 - ((C78140Ulc) aUListenerS0S0200005_13.l0).LLFF) < ((C78140Ulc) aUListenerS0S0200005_13.l0).getAlphaCompleteDistance()) {
            float min = aUListenerS0S0200005_13.f6 - Math.min(Math.abs(abs2 - ((C78140Ulc) aUListenerS0S0200005_13.l0).LLFF) / ((C78140Ulc) aUListenerS0S0200005_13.l0).getAlphaCompleteDistance(), 1.0f);
            View view = ((C78140Ulc) aUListenerS0S0200005_13.l0).LJLIL;
            if (view != null) {
                view.setAlpha(min);
            }
            View view2 = ((C78140Ulc) aUListenerS0S0200005_13.l0).LJLIL;
            if (view2 != null) {
                C29306Beo.LJJLJLI(view2);
            }
        }
        View view3 = ((C78140Ulc) aUListenerS0S0200005_13.l0).LJLIL;
        if (view3 == null || view3.getAlpha() <= 0.0f) {
            z = false;
        }
        C29306Beo.LJJLIIIJJI(view3, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scale targetView up anim() ----- scaleX = ");
        LIZ.append(((View) aUListenerS0S0200005_13.l1).getScaleX());
        LIZ.append(" ,  scaleY = ");
        LIZ.append(((View) aUListenerS0S0200005_13.l1).getScaleY());
        LIZ.append(", y=");
        LIZ.append(((View) aUListenerS0S0200005_13.l1).getY());
        LIZ.append(" \n container y= ");
        LIZ.append(abs2);
        LIZ.append("interaction?.alpha=");
        View view4 = ((C78140Ulc) aUListenerS0S0200005_13.l0).LJLIL;
        if (view4 != null) {
            f = Float.valueOf(view4.getAlpha());
        } else {
            f = null;
        }
        LIZ.append(f);
        Logger.i("Survey_LYP", X1D.LIZIZ(LIZ));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS0S0200005_13(float r2, float r3, float r4, float r5, float r6, android.view.View r7, X.C78140Ulc r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            switch(r9) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.f2 = r2
            r0.f3 = r3
            r0.f4 = r4
            r0.f5 = r5
            r0.l0 = r8
            r0.l1 = r7
            r0.f6 = r6
        L14:
            r0.<init>()
            return
        L18:
            r0 = r1
            r0.f2 = r2
            r0.l0 = r7
            r0.f3 = r3
            r0.f4 = r4
            r0.f5 = r5
            r0.l1 = r8
            r0.f6 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS0S0200005_13.<init>(float, float, float, float, float, android.view.View, X.Ulc, int):void");
    }
}
