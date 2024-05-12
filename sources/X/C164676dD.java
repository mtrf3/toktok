package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6dD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164676dD extends FrameLayout {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;
    public final C62822Ol8 LJLJLJ;

    private final View getChild() {
        return (View) this.LJLJLJ.getValue();
    }

    private final RecyclerView getRv() {
        return (RecyclerView) this.LJLJJLL.getValue();
    }

    public final C0CM getParentViewPager() {
        return (C0CM) this.LJLJJL.getValue();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e) {
        boolean z;
        o.LJIIIZ(e, "e");
        C0CM parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            int action = e.getAction() & e.getActionMasked();
            if (action != 1 && action != 3) {
                if (action == 0 || !this.LJLJL) {
                    int rawX = (int) e.getRawX();
                    int rawY = (int) e.getRawY();
                    if (e.getAction() == 0) {
                        this.LJLJI = e.getX();
                        this.LJLJJI = e.getY();
                        this.LJLJL = false;
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else if (e.getAction() == 2) {
                        float x = e.getX() - this.LJLJI;
                        float y = e.getY() - this.LJLJJI;
                        float abs = Math.abs(x);
                        float abs2 = Math.abs(y);
                        if (orientation == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (abs2 < this.LJLIL && abs > this.LJLILLLLZI && abs * 0.5d > abs2 && !LIZIZ(x, orientation, rawX, rawY, getChild())) {
                                this.LJLJL = true;
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (abs < this.LJLIL && abs2 > this.LJLILLLLZI && abs2 * 0.5d > abs && !LIZIZ(y, orientation, rawX, rawY, getChild())) {
                            this.LJLJL = true;
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
            } else {
                this.LJLJL = false;
            }
        }
        RecyclerView rv = getRv();
        if (rv != null) {
            if (this.LJLJL && rv.onInterceptTouchEvent(e)) {
                return true;
            }
            return false;
        }
        return super.onInterceptTouchEvent(e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164676dD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LJLILLLLZI = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 667));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS103S0101000_2(this, 1, 8));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 666));
    }

    public static boolean LIZ(float f, int i, View view) {
        int i2 = -((int) Math.signum(f));
        if (i != 0) {
            if (i == 1) {
                if (view != null) {
                    return view.canScrollVertically(i2);
                }
            } else {
                throw new IllegalArgumentException("orientation is not found");
            }
        } else if (view != null) {
            return view.canScrollHorizontally(i2);
        }
        return false;
    }

    public static boolean LIZIZ(float f, int i, int i2, int i3, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i4;
        int measuredHeight = view.getMeasuredHeight() + i5;
        if (i5 > i3 || i3 > measuredHeight || i4 > i2 || i2 > measuredWidth) {
            return false;
        }
        if (LIZ(f, i, view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (LIZ(f, i, childAt) || LIZIZ(f, i, i2, i3, childAt)) {
                    return true;
                }
            }
        }
        return LIZ(f, i, view);
    }
}
