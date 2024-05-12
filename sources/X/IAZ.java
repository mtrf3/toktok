package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IAZ extends ScrollView {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    public final void LIZ(int i) {
        super.scrollTo(0, i);
    }

    @Override // android.widget.ScrollView
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (this.LJLIL) {
            return 0;
        }
        return super.computeScrollDeltaToGetChildRectOnScreen(rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLILLLLZI) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setForbidScroll(boolean z) {
        this.LJLILLLLZI = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.LJLILLLLZI) {
            return;
        }
        super.scrollTo(i, i2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f, float f2, boolean z) {
        o.LJIIIZ(target, "target");
        if (!this.LJLILLLLZI && super.onNestedFling(target, f, f2, z)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View target, int i, int i2, int i3, int i4) {
        o.LJIIIZ(target, "target");
        if (this.LJLILLLLZI) {
            return;
        }
        super.onNestedScroll(target, i, i2, i3, i4);
    }
}
