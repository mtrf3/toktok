package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;

/* renamed from: X.49a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047049a extends C45631qh {
    public float LLIFFJFJJ;
    public float LLII;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(rawX - this.LLIFFJFJJ) + 0.0f >= Math.abs(rawY - this.LLII) + 0.0f) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.LLIFFJFJJ = rawX;
                this.LLII = rawY;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1047049a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLIFFJFJJ = -1.0f;
        this.LLII = -1.0f;
    }
}
