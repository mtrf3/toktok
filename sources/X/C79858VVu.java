package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.VVu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79858VVu extends C79860VVw {
    public boolean LJLJLLL;

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final boolean getMPagerChangeAnimation() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79858VVu(Context context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLJLLL = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getMAllowHorizontalGesture()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getActionMasked())) != null && valueOf.intValue() == 1) {
            super.performClick();
        }
        if (getMAllowHorizontalGesture()) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC79857VVt mInterceptTouchEventListener = getMInterceptTouchEventListener();
        if (mInterceptTouchEventListener != null) {
            mInterceptTouchEventListener.LIZ(false);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && this.LJLJL) {
            i = TB3.LIZ(adapter, i, -1);
        }
        super.setCurrentItem(i, this.LJLJLLL);
    }

    public final void setMPagerChangeAnimation(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && this.LJLJL) {
            i = TB3.LIZ(adapter, i, -1);
        }
        super.setCurrentItem(i, z);
    }
}
