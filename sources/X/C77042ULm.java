package X;

import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS2S0101000_13;
import Y.AUListenerS100S0100000_13;
import Y.AUListenerS73S0101000_13;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ULm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77042ULm extends AnimationInfo {
    public final ULA LIZ;

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        View findViewById = this.LIZ.getContainer().findViewById(R.id.dkb);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.LIZ.getAnimationDuration());
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(findViewById, 9));
        ofFloat.addListener(new ALAdapterS10S0100000_13(findViewById, 4));
        return ofFloat;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        View findViewById = this.LIZ.getContainer().findViewById(R.id.dkb);
        int LJFF = C15380j0.LJFF(R.dimen.ac7);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.LIZ.getAnimationDuration());
        ofFloat.addUpdateListener(new AUListenerS73S0101000_13(LJFF, findViewById, 0));
        ofFloat.addListener(new ALAdapterS2S0101000_13(findViewById, LJFF, 1));
        return ofFloat;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationEnd(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        constraintProperty.visibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationStart(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        constraintProperty.visibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77042ULm(int i, ULA portraitLayeredElementContext) {
        super(i, portraitLayeredElementContext);
        o.LJIIIZ(portraitLayeredElementContext, "portraitLayeredElementContext");
        this.LIZ = portraitLayeredElementContext;
    }
}
