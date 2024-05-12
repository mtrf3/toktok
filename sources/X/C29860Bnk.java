package X;

import android.transition.Transition;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideBottomCardWidget;

/* renamed from: X.Bnk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29860Bnk implements Transition.TransitionListener {
    public final /* synthetic */ FollowGuideBottomCardWidget LIZ;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    public C29860Bnk(FollowGuideBottomCardWidget followGuideBottomCardWidget) {
        this.LIZ = followGuideBottomCardWidget;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        super/*com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget*/.animateHide();
    }
}
