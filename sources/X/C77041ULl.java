package X;

import Y.ALAdapterS10S0100000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFollowGuideCardAbsolutePositioningSetting;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ULl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77041ULl extends AnimationInfo {
    public final ULA LIZ;

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (LiveFollowGuideCardAbsolutePositioningSetting.INSTANCE.getValue()) {
            View findViewById = this.LIZ.getContainer().findViewById(R.id.dkc);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, C15380j0.LJFF(R.dimen.agt));
            ofInt.setDuration(this.LIZ.getAnimationDuration());
            ofInt.addUpdateListener(new AUListenerS100S0100000_13(findViewById, 10));
            return ofInt;
        }
        CVQ cvq = (CVQ) this.LIZ.getContainer().findViewById(R.id.krk);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(C15380j0.LJFF(R.dimen.adn) + C15380j0.LJFF(R.dimen.agt), 0);
        ofInt2.setDuration(this.LIZ.getAnimationDuration());
        ofInt2.addUpdateListener(new AUListenerS100S0100000_13(cvq, 11));
        return ofInt2;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (LiveFollowGuideCardAbsolutePositioningSetting.INSTANCE.getValue()) {
            View findViewById = this.LIZ.getContainer().findViewById(R.id.dkc);
            ValueAnimator ofInt = ValueAnimator.ofInt(C15380j0.LJFF(R.dimen.agt), 0);
            ofInt.setDuration(this.LIZ.getAnimationDuration());
            ofInt.addListener(new ALAdapterS10S0100000_13(findViewById, 5));
            ofInt.addUpdateListener(new AUListenerS100S0100000_13(findViewById, 12));
            return ofInt;
        }
        CVQ cvq = (CVQ) this.LIZ.getContainer().findViewById(R.id.krk);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, C15380j0.LJFF(R.dimen.adn) + C15380j0.LJFF(R.dimen.agt));
        ofInt2.setDuration(this.LIZ.getAnimationDuration());
        ofInt2.addUpdateListener(new AUListenerS100S0100000_13(cvq, 13));
        return ofInt2;
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
    public C77041ULl(int i, ULA portraitLayeredElementContext) {
        super(i, portraitLayeredElementContext);
        o.LJIIIZ(portraitLayeredElementContext, "portraitLayeredElementContext");
        this.LIZ = portraitLayeredElementContext;
    }
}
