package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.36y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C786836y extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedAdSurveyMaskLayout---dispatchTouchEvent---action=");
        Integer num = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.LJLIL = (int) motionEvent.getX();
                this.LJLILLLLZI = (int) motionEvent.getY();
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if (valueOf.intValue() == 2) {
                if (Math.abs(motionEvent.getX() - this.LJLIL) > Math.abs(motionEvent.getY() - this.LJLILLLLZI)) {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    return true;
                }
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedAdSurveyMaskLayout---onTouchEvent---action=");
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C786836y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
