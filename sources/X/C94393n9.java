package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;

/* renamed from: X.3n9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94393n9 extends C62048OWu {
    public boolean LJLILLLLZI;
    public boolean LJLJI;

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LJLJI && super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLILLLLZI && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLILLLLZI && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void setCanScrollHorizontally$im_base_release(boolean z) {
        this.LJLJI = z;
    }

    public final void setScrollEnabled$im_base_release(boolean z) {
        this.LJLILLLLZI = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94393n9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = true;
        this.LJLJI = true;
        setOverScrollMode(2);
    }
}
