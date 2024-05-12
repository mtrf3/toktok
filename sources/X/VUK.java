package X;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import android.widget.ScrollView;

/* loaded from: classes15.dex */
public final class VUK {
    public final boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final View LIZLLL;
    public int LJ;
    public int LJFF;
    public final C16690l7 LJI;

    public final void LIZ() {
        int scrollX = this.LIZLLL.getScrollX();
        int scrollY = this.LIZLLL.getScrollY();
        if (!this.LIZ) {
            View view = this.LIZLLL;
            if (view instanceof VUJ) {
                VUJ vuj = (VUJ) view;
                if (this.LIZIZ) {
                    vuj.LIZLLL(this.LJFF, scrollY);
                    this.LIZIZ = false;
                    return;
                } else {
                    if (!this.LIZJ) {
                        return;
                    }
                    vuj.LIZLLL(this.LJFF, scrollY);
                    this.LIZJ = false;
                    return;
                }
            }
            return;
        }
        View view2 = this.LIZLLL;
        if (!(view2 instanceof VUI)) {
            return;
        }
        VUI vui = (VUI) view2;
        if (this.LIZIZ) {
            vui.LIZJ(scrollX, this.LJFF);
            this.LIZIZ = false;
        } else {
            if (!this.LIZJ) {
                return;
            }
            vui.LIZJ(scrollX, this.LJFF);
            this.LIZJ = false;
        }
    }

    public final boolean LIZIZ() {
        OverScroller vScroller;
        OverScroller hScroller;
        if (!this.LIZ) {
            View view = this.LIZLLL;
            if ((view instanceof VUJ) && (hScroller = ((VUJ) view).getHScroller()) != null && !hScroller.isFinished()) {
                return true;
            }
            return false;
        }
        View view2 = this.LIZLLL;
        if ((view2 instanceof VUI) && (vScroller = ((VUI) view2).getVScroller()) != null && !vScroller.isFinished()) {
            return true;
        }
        return false;
    }

    public final void LJ(int i) {
        int scrollX = this.LIZLLL.getScrollX();
        int scrollY = this.LIZLLL.getScrollY();
        if (1 == i) {
            return;
        }
        if (!this.LIZ) {
            View view = this.LIZLLL;
            if (view instanceof VUJ) {
                VUJ vuj = (VUJ) view;
                int i2 = this.LJFF;
                if (scrollX != i2) {
                    vuj.LIZLLL(i2, scrollY);
                }
                vuj.LJIIIIZZ(i);
                return;
            }
            return;
        }
        View view2 = this.LIZLLL;
        if (!(view2 instanceof VUI)) {
            return;
        }
        VUI vui = (VUI) view2;
        int i3 = this.LJFF;
        if (scrollY != i3) {
            vui.LIZJ(scrollX, i3);
        }
        vui.LJIIIIZZ(i);
    }

    public VUK(View view, boolean z, C16690l7 c16690l7) {
        this.LIZLLL = view;
        this.LIZ = z;
        this.LJI = c16690l7;
    }

    public final void LIZJ(View view, int i, int i2, int[] iArr, int i3) {
        if (1 == i3) {
            return;
        }
        int scrollX = this.LIZLLL.getScrollX();
        int scrollY = this.LIZLLL.getScrollY();
        if (!this.LIZ) {
            View view2 = this.LIZLLL;
            if (view2 instanceof VUJ) {
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view2;
                int i4 = this.LJ;
                int i5 = this.LJFF;
                if (!view.canScrollHorizontally(-1) && i < 0) {
                    if (scrollX + i < 0) {
                        horizontalScrollView.scrollTo(0, scrollY);
                    } else {
                        horizontalScrollView.requestDisallowInterceptTouchEvent(true);
                        horizontalScrollView.scrollBy(i, 0);
                    }
                    iArr[0] = i;
                } else if (scrollX < i5 && i > 0) {
                    horizontalScrollView.requestDisallowInterceptTouchEvent(true);
                    if (scrollX + i > i5) {
                        horizontalScrollView.scrollBy(i5 - scrollX, 0);
                    } else {
                        horizontalScrollView.scrollBy(i, 0);
                    }
                    iArr[0] = i;
                }
                if (!view.canScrollHorizontally(1) && i > 0) {
                    if (scrollX + i > i4) {
                        horizontalScrollView.scrollTo(i4, scrollY);
                    } else {
                        horizontalScrollView.requestDisallowInterceptTouchEvent(true);
                        horizontalScrollView.scrollBy(i, 0);
                    }
                    iArr[0] = i;
                    return;
                }
                if (i5 >= scrollX || scrollX > i4 || i >= 0) {
                    return;
                }
                horizontalScrollView.requestDisallowInterceptTouchEvent(true);
                if (scrollX + i < i5) {
                    horizontalScrollView.scrollBy(i5 - scrollX, 0);
                } else {
                    horizontalScrollView.scrollBy(i, 0);
                }
                iArr[0] = i;
                return;
            }
            return;
        }
        View view3 = this.LIZLLL;
        if (!(view3 instanceof VUI)) {
            return;
        }
        ScrollView scrollView = (ScrollView) view3;
        int i6 = this.LJ;
        int i7 = this.LJFF;
        if (!view.canScrollVertically(-1) && i2 < 0) {
            if (scrollY + i2 < 0) {
                scrollView.scrollTo(scrollX, 0);
            } else {
                scrollView.requestDisallowInterceptTouchEvent(true);
                scrollView.scrollBy(0, i2);
            }
            iArr[1] = i2;
        } else if (scrollY < i7 && i2 > 0) {
            scrollView.requestDisallowInterceptTouchEvent(true);
            if (scrollY + i2 > i7) {
                scrollView.scrollBy(0, i7 - scrollY);
            } else {
                scrollView.scrollBy(0, i2);
            }
            iArr[1] = i2;
        }
        if (!view.canScrollVertically(1) && i2 > 0) {
            if (scrollY + i2 > i6) {
                scrollView.scrollTo(scrollX, i6);
            } else {
                scrollView.requestDisallowInterceptTouchEvent(true);
                scrollView.scrollBy(0, i2);
            }
            iArr[1] = i2;
            return;
        }
        if (i7 >= scrollY || scrollY > i6 || i2 >= 0) {
            return;
        }
        scrollView.requestDisallowInterceptTouchEvent(true);
        if (scrollY + i2 < i7) {
            scrollView.scrollBy(0, i7 - scrollY);
        } else {
            scrollView.scrollBy(0, i2);
        }
        iArr[1] = i2;
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5) {
        VUI vui;
        OverScroller vScroller;
        VUJ vuj;
        OverScroller hScroller;
        if (i5 == 0) {
            return;
        }
        int scrollX = this.LIZLLL.getScrollX();
        int scrollY = this.LIZLLL.getScrollY();
        if (!this.LIZ) {
            View view = this.LIZLLL;
            if (!(view instanceof VUJ) || (hScroller = (vuj = (VUJ) view).getHScroller()) == null) {
                return;
            }
            int i6 = this.LJ;
            int i7 = this.LJFF;
            if (!this.LIZIZ) {
                if (i < 0 && i3 < 0) {
                    vuj.LIZLLL(0, scrollY);
                    this.LIZIZ = true;
                }
            } else if (scrollX == 0 && hScroller.isFinished()) {
                vuj.LIZLLL(i7, scrollY);
                this.LIZIZ = false;
            }
            if (!this.LIZJ) {
                if (i > 0 && i3 > 0) {
                    vuj.LIZLLL(i6, scrollY);
                    this.LIZJ = true;
                    return;
                }
                return;
            }
            if (scrollX != i6 || !hScroller.isFinished()) {
                return;
            }
            vuj.LIZLLL(i7, scrollY);
            this.LIZJ = false;
            return;
        }
        View view2 = this.LIZLLL;
        if (!(view2 instanceof VUI) || (vScroller = (vui = (VUI) view2).getVScroller()) == null) {
            return;
        }
        int i8 = this.LJ;
        int i9 = this.LJFF;
        if (!this.LIZIZ) {
            if (i2 < 0 && i4 < 0) {
                vui.LIZJ(scrollX, 0);
                this.LIZIZ = true;
            }
        } else if (scrollY == 0 && vScroller.isFinished()) {
            vui.LIZJ(scrollX, i9);
            this.LIZIZ = false;
        }
        if (!this.LIZJ) {
            if (i2 > 0 && i4 > 0) {
                vui.LIZJ(scrollX, i8);
                this.LIZJ = true;
                return;
            }
            return;
        }
        if (scrollY == i8 && vScroller.isFinished()) {
            vui.LIZJ(scrollX, i9);
            this.LIZJ = false;
        }
    }
}
