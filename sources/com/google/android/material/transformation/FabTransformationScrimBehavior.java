package com.google.android.material.transformation;

import X.C45621qg;
import X.C78939UyV;
import X.C80247VeV;
import X.C80370VgU;
import X.C80474ViA;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final C80247VeV LIZJ;
    public final C80247VeV LIZLLL;

    public FabTransformationScrimBehavior() {
        this.LIZJ = new C80247VeV(75L);
        this.LIZLLL = new C80247VeV(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZJ = new C80247VeV(75L);
        this.LIZLLL = new C80247VeV(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, X.C06C
    public final boolean layoutDependsOn(C45621qg c45621qg, View view, View view2) {
        return view2 instanceof C80474ViA;
    }

    @Override // X.C06C
    public final boolean onTouchEvent(C45621qg c45621qg, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(c45621qg, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet LIZIZ(View view, View view2, boolean z, boolean z2) {
        C80247VeV c80247VeV;
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z) {
            c80247VeV = this.LIZJ;
        } else {
            c80247VeV = this.LIZLLL;
        }
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c80247VeV.LIZ(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C78939UyV.LJJJJI(animatorSet, arrayList);
        animatorSet.addListener(new C80370VgU(z, view2));
        return animatorSet;
    }
}
