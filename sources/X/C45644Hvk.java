package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Hvk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45644Hvk extends ViewPager {
    public boolean LJLIL;
    public float LJLILLLLZI;
    public InterfaceC45643Hvj LJLJI;
    public final float LJLJJI;

    public final boolean getCanScroll() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LJLILLLLZI = motionEvent.getX();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        InterfaceC45643Hvj interfaceC45643Hvj;
        if (!this.LJLIL) {
            return false;
        }
        if (motionEvent != null) {
            float x = motionEvent.getX();
            Integer valueOf = Integer.valueOf(motionEvent.getAction());
            if (valueOf != null) {
                if (valueOf.intValue() == 2) {
                    if (this.LJLILLLLZI == -1.0f) {
                        this.LJLILLLLZI = x;
                    }
                } else if (valueOf.intValue() == 1) {
                    PagerAdapter adapter = getAdapter();
                    if (adapter != null) {
                        i = adapter.getCount();
                    } else {
                        i = 0;
                    }
                    if (getCurrentItem() == 0 && x - this.LJLILLLLZI > this.LJLJJI) {
                        InterfaceC45643Hvj interfaceC45643Hvj2 = this.LJLJI;
                        if (interfaceC45643Hvj2 != null) {
                            interfaceC45643Hvj2.LIZ(true);
                        }
                    } else if (getCurrentItem() == i - 1 && this.LJLILLLLZI - x > this.LJLJJI && (interfaceC45643Hvj = this.LJLJI) != null) {
                        interfaceC45643Hvj.LIZ(false);
                    }
                }
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final void setCanScroll(boolean z) {
        this.LJLIL = z;
    }

    public final void setGestureCallback(InterfaceC45643Hvj callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJI = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45644Hvk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = true;
        this.LJLILLLLZI = -1.0f;
        this.LJLJJI = C170576mj.LIZ(context, 10.0f);
    }
}
