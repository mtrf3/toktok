package com.google.android.material.transformation;

import X.C06420Na;
import X.C06F;
import X.C1PH;
import X.C45621qg;
import X.C80247VeV;
import X.C80380Vge;
import X.C80474ViA;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;

/* loaded from: classes15.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect LIZJ;
    public final RectF LIZLLL;
    public final RectF LJ;
    public final int[] LJFF;
    public float LJI;
    public float LJII;

    public abstract C80380Vge LJII(Context context, boolean z);

    public FabTransformationBehavior() {
        this.LIZJ = new Rect();
        this.LIZLLL = new RectF();
        this.LJ = new RectF();
        this.LJFF = new int[2];
    }

    @Override // X.C06C
    public final void onAttachedToLayoutParams(C06F c06f) {
        if (c06f.LJII == 0) {
            c06f.LJII = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZJ = new Rect();
        this.LIZLLL = new RectF();
        this.LJ = new RectF();
        this.LJFF = new int[2];
    }

    public final void LJI(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.LJFF);
        rectF.offsetTo(r2[0], r2[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public static float LJFF(C80380Vge c80380Vge, C80247VeV c80247VeV, float f) {
        long j = c80247VeV.LIZ;
        long j2 = c80247VeV.LIZIZ;
        C80247VeV LIZJ = c80380Vge.LIZ.LIZJ("expansion");
        return C06420Na.LIZIZ(0.0f, f, c80247VeV.LIZIZ().getInterpolation(((float) (((LIZJ.LIZ + LIZJ.LIZIZ) + 17) - j)) / ((float) j2)), f);
    }

    public final float LIZLLL(View view, View view2, C1PH c1ph) {
        RectF rectF = this.LIZLLL;
        RectF rectF2 = this.LJ;
        LJI(view, rectF);
        rectF.offset(this.LJI, this.LJII);
        LJI(view2, rectF2);
        c1ph.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float LJ(View view, View view2, C1PH c1ph) {
        RectF rectF = this.LIZLLL;
        RectF rectF2 = this.LJ;
        LJI(view, rectF);
        rectF.offset(this.LJI, this.LJII);
        LJI(view2, rectF2);
        c1ph.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, X.C06C
    public final boolean layoutDependsOn(C45621qg c45621qg, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof C80474ViA)) {
                return false;
            }
            int expandedComponentIdHint = ((C80474ViA) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public static Pair LIZJ(float f, float f2, boolean z, C80380Vge c80380Vge) {
        C80247VeV LIZJ;
        C80247VeV LIZJ2;
        if (f == 0.0f || f2 == 0.0f) {
            LIZJ = c80380Vge.LIZ.LIZJ("translationXLinear");
            LIZJ2 = c80380Vge.LIZ.LIZJ("translationYLinear");
        } else if (!z ? f2 <= 0.0f : f2 >= 0.0f) {
            LIZJ = c80380Vge.LIZ.LIZJ("translationXCurveDownwards");
            LIZJ2 = c80380Vge.LIZ.LIZJ("translationYCurveDownwards");
        } else {
            LIZJ = c80380Vge.LIZ.LIZJ("translationXCurveUpwards");
            LIZJ2 = c80380Vge.LIZ.LIZJ("translationYCurveUpwards");
        }
        return new Pair(LIZJ, LIZJ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0109, code lost:
    
        if (r1 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
    
        if ((r9 instanceof android.view.ViewGroup) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018e, code lost:
    
        if (r9 != null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet LIZIZ(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.LIZIZ(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }
}
