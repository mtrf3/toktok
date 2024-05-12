package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Ug6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77798Ug6 extends C80261Vej {
    public int LJLIL;
    public boolean LJLILLLLZI;

    public final int getMaxScrollXOffset() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && valueOf.intValue() == 2 && this.LJLILLLLZI && (getScrollX() >= this.LJLIL || getScrollX() <= 0)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setMaxScrollXOffset(int i) {
        this.LJLIL = i;
    }

    public final void setNewGesture(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setNewGestureEnable(boolean z) {
        this.LJLILLLLZI = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77798Ug6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIJ(context, "context");
        this.LJLIL = Integer.MAX_VALUE;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            o.LJFF(childAt, "getChildAt(0)");
            this.LJLIL = childAt.getWidth() - getWidth();
        }
    }
}
