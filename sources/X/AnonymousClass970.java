package X;

import Y.AUListenerS59S0000000_4;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.970, reason: invalid class name */
/* loaded from: classes5.dex */
public class AnonymousClass970 extends LinearLayout {
    public boolean LJLIL;

    public final void LIZ() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", childAt.getAlpha(), 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            ofFloat.addUpdateListener(new AUListenerS59S0000000_4(0));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    LIZ();
                }
            } else {
                LIZ();
            }
        } else {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i), "alpha", 1.0f, 0.5f);
                ofFloat.setDuration(100L);
                ofFloat.start();
                ofFloat.addUpdateListener(new AUListenerS59S0000000_4(1));
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIntercept(boolean z) {
        this.LJLIL = z;
    }

    public AnonymousClass970(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
