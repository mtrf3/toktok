package X;

import Y.AUListenerS79S0300000_13;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UL7 extends AnimationInfo {
    public ValueAnimator LIZ;
    public ValueAnimator LIZIZ;
    public final int LIZJ;
    public final /* synthetic */ UL8 LIZLLL;

    public final ValueAnimator LIZ(ConstraintProperty constraintProperty) {
        ValueAnimator valueAnimator = new ValueAnimator();
        UL8 ul8 = this.LIZLLL;
        ConstraintProperty constraintPropertyById = ul8.getConstraintPropertyById(R.id.bkr);
        valueAnimator.setDuration(ul8.getAnimationDuration());
        valueAnimator.addUpdateListener(new AUListenerS79S0300000_13(constraintPropertyById, constraintProperty, this, 4));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        int i;
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (this.LIZIZ == null) {
            this.LIZIZ = LIZ(constraintProperty);
        }
        ValueAnimator valueAnimator = this.LIZIZ;
        if (valueAnimator != null) {
            int[] iArr = new int[2];
            ConstraintProperty constraintPropertyById = this.LIZLLL.getConstraintPropertyById(R.id.bkr);
            if (constraintPropertyById != null) {
                i = constraintPropertyById.margin(4);
            } else {
                i = 0;
            }
            iArr[0] = i;
            iArr[1] = 0;
            valueAnimator.setIntValues(iArr);
            return valueAnimator;
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        int i;
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (this.LIZ == null) {
            this.LIZ = LIZ(constraintProperty);
        }
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            UL8 ul8 = this.LIZLLL;
            int[] iArr = new int[2];
            ConstraintProperty constraintPropertyById = ul8.getConstraintPropertyById(R.id.bkr);
            if (constraintPropertyById != null) {
                i = constraintPropertyById.margin(4);
            } else {
                i = 0;
            }
            iArr[0] = i;
            iArr[1] = ul8.LJI + ul8.LIZLLL;
            valueAnimator.setIntValues(iArr);
            return valueAnimator;
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationEnd(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.onHideAnimationEnd(constraintProperty);
        ConstraintProperty constraintPropertyById = this.LIZLLL.getConstraintPropertyById(R.id.bkr);
        if (constraintPropertyById != null) {
            constraintPropertyById.margin(4, 0);
            constraintPropertyById.apply();
        }
        constraintProperty.alpha(0.0f);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationEnd(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.onShowAnimationEnd(constraintProperty);
        ConstraintProperty constraintPropertyById = this.LIZLLL.getConstraintPropertyById(R.id.bkr);
        if (constraintPropertyById != null) {
            constraintPropertyById.margin(4, this.LIZJ);
            constraintPropertyById.apply();
        }
        constraintProperty.alpha(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UL7(UL8 ul8, int i) {
        super(i, ul8);
        this.LIZLLL = ul8;
        this.LIZJ = ul8.LJIILLIIL;
    }
}
