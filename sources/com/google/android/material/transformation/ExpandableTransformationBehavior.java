package com.google.android.material.transformation;

import Y.ALAdapterS11S0100000_14;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes15.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet LIZIZ;

    public abstract AnimatorSet LIZIZ(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void LIZ(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.LIZIZ;
        if (animatorSet != null) {
            z3 = true;
            animatorSet.cancel();
        } else {
            z3 = false;
        }
        AnimatorSet LIZIZ = LIZIZ(view, view2, z, z3);
        this.LIZIZ = LIZIZ;
        LIZIZ.addListener(new ALAdapterS11S0100000_14(this, 27));
        this.LIZIZ.start();
        if (!z2) {
            this.LIZIZ.end();
        }
    }
}
