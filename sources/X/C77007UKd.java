package X;

import Y.AUListenerS100S0100000_13;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UKd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77007UKd extends AnimationInfo {
    public final C5H3 LIZ;
    public final /* synthetic */ ULA LIZIZ;

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        o.LJIIIZ(constraintProperty, "constraintProperty");
        ((ValueAnimator) this.LIZ.getValue()).removeAllUpdateListeners();
        int height = getLayeredElementContext().getContainer().getHeight() - constraintProperty.getView().getBottom();
        ViewGroup.LayoutParams layoutParams = constraintProperty.getView().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        int height2 = (height - constraintProperty.getView().getHeight()) - i;
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, 0, 4, height);
        constraintProperty.apply();
        ((ValueAnimator) this.LIZ.getValue()).setIntValues(height, height2);
        ((ValueAnimator) this.LIZ.getValue()).addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 0));
        return (Animator) this.LIZ.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationEnd(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.onHideAnimationEnd(constraintProperty);
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, R.id.eqe, 3, this.LIZIZ.LIZLLL);
        constraintProperty.apply();
        constraintProperty.alpha(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77007UKd(int i, ULA ula) {
        super(i, ula);
        this.LIZIZ = ula;
        this.LIZ = C78996UzQ.LJJIJIIJI(C77008UKe.LJLIL);
    }
}
