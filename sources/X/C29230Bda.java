package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

/* renamed from: X.Bda, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29230Bda extends VWJ {
    public boolean LJLJI;
    public Boolean LJLJJI;
    public MotionEvent LJLJJL;

    private InterfaceC29231Bdb getParentViewPager() {
        ViewParent viewParent = this;
        while (viewParent != null && !(viewParent instanceof InterfaceC29231Bdb)) {
            viewParent = viewParent.getParent();
        }
        return (InterfaceC29231Bdb) viewParent;
    }

    public final void LJ() {
        Boolean bool;
        if (this.LJLJI) {
            return;
        }
        C0NB.LIZIZ("BannerViewPager", "enableParent");
        this.LJLJI = true;
        InterfaceC29231Bdb parentViewPager = getParentViewPager();
        if (parentViewPager != null && (bool = this.LJLJJI) != null) {
            bool.booleanValue();
            parentViewPager.LIZ();
            this.LJLJJI = null;
        }
    }

    public final void LIZLLL() {
        if (getChildCount() <= 1 || !this.LJLJI) {
            return;
        }
        C0NB.LIZIZ("BannerViewPager", "disableParent");
        this.LJLJI = false;
        InterfaceC29231Bdb parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            if (this.LJLJJI == null) {
                this.LJLJJI = Boolean.valueOf(parentViewPager.LIZIZ());
            }
            parentViewPager.LIZ();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            LIZLLL();
        } else if (motionEvent.getAction() == 2) {
            if (onInterceptTouchEvent) {
                LIZLLL();
            }
        } else {
            LJ();
        }
        this.LJLJJL = motionEvent;
        return onInterceptTouchEvent;
    }

    @Override // X.VWJ, androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(C0C3 c0c3) {
        super.setOnPageChangeListener(c0c3);
    }

    public C29230Bda(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
