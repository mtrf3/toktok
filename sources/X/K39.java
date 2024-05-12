package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K39 extends FrameLayout {
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

    private final KOV getParentPowerViewPager() {
        return (KOV) this.LJLJJLL.getValue();
    }

    public final C0CM getParentViewPager() {
        return (C0CM) this.LJLJJL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K39(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LJLILLLLZI = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 449));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 448));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 447));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e) {
        C0CM parentViewPager;
        boolean z;
        float y;
        float f;
        float x;
        float f2;
        o.LJIIIZ(e, "e");
        KOV parentPowerViewPager = getParentPowerViewPager();
        if ((parentPowerViewPager == null || parentPowerViewPager.LJLLL) && (parentViewPager = getParentViewPager()) != null) {
            int orientation = parentViewPager.getOrientation();
            int action = e.getAction() & e.getActionMasked();
            if (action != 1 && action != 3) {
                if (action != 0 && this.LJLJL) {
                    return true;
                }
                int rawX = (int) e.getRawX();
                int rawY = (int) e.getRawY();
                if (e.getAction() == 0) {
                    this.LJLJI = e.getX();
                    this.LJLJJI = e.getY();
                    this.LJLJL = false;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return false;
                }
                if (e.getAction() == 2) {
                    if (orientation == 0) {
                        z = true;
                        y = e.getX();
                        f = this.LJLJI;
                    } else {
                        z = false;
                        y = e.getY();
                        f = this.LJLJJI;
                    }
                    float f3 = y - f;
                    if (z) {
                        x = e.getY();
                        f2 = this.LJLJJI;
                    } else {
                        x = e.getX();
                        f2 = this.LJLJI;
                    }
                    float abs = Math.abs(f3);
                    float abs2 = Math.abs(x - f2);
                    if (abs2 > this.LJLIL) {
                        if (abs2 > abs * 0.5d) {
                            C0CM parentViewPager2 = getParentViewPager();
                            if (parentViewPager2 != null) {
                                parentViewPager2.setUserInputEnabled(false);
                            }
                            getParent().requestDisallowInterceptTouchEvent(false);
                            return false;
                        }
                    } else if (abs > this.LJLILLLLZI && !LIZ(f3, orientation, rawX, rawY, getChild()) && abs * 0.5d > abs2) {
                        this.LJLJL = true;
                        C0CM parentViewPager3 = getParentViewPager();
                        if (parentViewPager3 != null) {
                            parentViewPager3.setUserInputEnabled(true);
                        }
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(e);
            }
            this.LJLJL = false;
            C0CM parentViewPager4 = getParentViewPager();
            if (parentViewPager4 != null) {
                parentViewPager4.setUserInputEnabled(true);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        KOV parentPowerViewPager = getParentPowerViewPager();
        if (parentPowerViewPager != null && !parentPowerViewPager.LJLLL) {
            return false;
        }
        if (e.getAction() == 0) {
            this.LJLJL = false;
            C0CM parentViewPager = getParentViewPager();
            if (parentViewPager != null) {
                parentViewPager.setUserInputEnabled(true);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        return super.onTouchEvent(e);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (!z) {
            super.requestDisallowInterceptTouchEvent(false);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            super.requestDisallowInterceptTouchEvent(true);
        }
    }

    public static boolean LIZ(float f, int i, int i2, int i3, View view) {
        boolean canScrollHorizontally;
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
        int i6 = -((int) Math.signum(f));
        if (i != 0) {
            if (i == 1) {
                canScrollHorizontally = view.canScrollVertically(i6);
            } else {
                throw new IllegalArgumentException("orientation is not found");
            }
        } else {
            canScrollHorizontally = view.canScrollHorizontally(i6);
        }
        if (canScrollHorizontally) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                if (LIZ(f, i, i2, i3, viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
        }
        return false;
    }
}
