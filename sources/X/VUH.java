package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public class VUH extends VUJ {
    public final /* synthetic */ VUG LJZI;

    @Override // android.widget.HorizontalScrollView
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (!this.LJZI.LLFZ) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    @Override // X.VUJ, android.widget.HorizontalScrollView
    public final void fling(int i) {
        VUG vug = this.LJZI;
        if (vug.LLIIIL == 1) {
            vug.LJ(2);
        }
        VUP vup = this.LJZI.LJZL;
        if (vup != null) {
            vup.LIZLLL();
        }
        if (!this.LJZI.LLIIII) {
            super.fling(i);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                OverScroller overScroller = (OverScroller) declaredField.get(this);
                if (overScroller != null) {
                    if (getChildCount() <= 0) {
                        return;
                    }
                    int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
                    overScroller.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, getChildAt(0).getWidth() - width), 0, 0, width / 2, 0);
                    postInvalidateOnAnimation();
                    return;
                }
                throw new Exception("failed to get mScroller in HorizontalScrollView");
            }
            throw new Exception("can not find mScroller field in HorizontalScrollView");
        } catch (Throwable th) {
            LLog.LIZLLL(3, "AndroidScrollView", th.getMessage());
            super.fling(i);
        }
    }

    @Override // X.VUJ, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJZI.LJLLLLLL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.VUJ, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        VUG vug = this.LJZI;
        if (!vug.LJLLLLLL) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            z = true;
        } else {
            z = false;
        }
        vug.LLIIIILZ = z;
        if (motionEvent.getAction() == 1) {
            VUG vug2 = this.LJZI;
            vug2.LJLZ = false;
            vug2.LLIIIILZ = false;
            vug2.LJLL.LJJIIZ();
        } else if (motionEvent.getAction() == 0) {
            VUG vug3 = this.LJZI;
            vug3.LJLZ = true;
            vug3.LJLL.LJJIIJZLJL(vug3.LLIIIL);
        } else if (motionEvent.getAction() == 3) {
            this.LJZI.LLIIIILZ = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.VUJ, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        VUP vup;
        boolean dispatchNestedPreFling = super.dispatchNestedPreFling(f, f2);
        if (dispatchNestedPreFling && (vup = this.LJZI.LJZL) != null) {
            vup.LIZ(4);
        }
        return dispatchNestedPreFling;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VUH(VUG vug, Context context, UIScrollView uIScrollView) {
        super(context, uIScrollView);
        this.LJZI = vug;
    }

    @Override // X.VUJ, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        VUP vup;
        boolean dispatchNestedFling = super.dispatchNestedFling(f, f2, z);
        if (dispatchNestedFling && (vup = this.LJZI.LJZL) != null) {
            vup.LIZ(4);
        }
        return dispatchNestedFling;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        VUG vug = this.LJZI;
        if (i == vug.LJLLLL) {
            return;
        }
        vug.LJLLLL = getScrollX();
        VUG vug2 = this.LJZI;
        if (vug2.LLIIIL == 0) {
            vug2.LJI();
        }
        this.LJZI.LJZL.onScrollChanged(i, i2, i3, i4);
        VUG vug3 = this.LJZI;
        if (!vug3.LJLZ && !vug3.LLFII) {
            vug3.LJLL.LJJIIZ();
        }
    }

    @Override // X.VUJ
    public final boolean LIZ(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        VUP vup;
        boolean LIZ = super.LIZ(i, i2, i3, iArr, iArr2);
        if (LIZ && (vup = this.LJZI.LJZL) != null) {
            vup.LIZ(4);
        }
        return LIZ;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int scrollX = getScrollX();
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LJZI.LJLLLLLL) {
            return;
        }
        if (getChildCount() > 0) {
            i5 = getChildAt(0).getMeasuredWidth();
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5 - (((i3 - i) - getPaddingLeft()) - getPaddingRight()));
        if (this.LJZI.LLII) {
            if (C16310kV.LIZLLL(this) == 1) {
                i6 = max;
            } else {
                i6 = 0;
            }
            setScrollX(i6);
            VUG vug = this.LJZI;
            vug.LLII = false;
            vug.LJLLLL = getScrollX();
        } else if (C16310kV.LIZLLL(this) == 1) {
            if (!C16330kX.LIZJ(this)) {
                VUG vug2 = this.LJZI;
                if (vug2.LLIFFJFJJ == max) {
                    setScrollX(vug2.LJLLLL);
                    this.LJZI.LJLLLL = getScrollX();
                }
            }
            int i7 = this.LJZI.LLIFFJFJJ;
            if (i7 != max && i7 >= 0) {
                setScrollX(C78609UtB.LJJIIZ((max - i7) + scrollX, 0, max));
            }
            this.LJZI.LJLLLL = getScrollX();
        }
        this.LJZI.LLIFFJFJJ = max;
        int i8 = this.LJZ.LJFF;
        if (this.LJLJI && i8 > 0 && i8 != getScrollX()) {
            this.LJZI.LJFF(i8, getScrollY(), false);
        }
    }

    @Override // X.VUJ
    public final boolean LIZIZ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        VUP vup;
        boolean LIZIZ = super.LIZIZ(i, i2, i3, i4, iArr, i5);
        if (LIZIZ && (vup = this.LJZI.LJZL) != null) {
            vup.LIZ(4);
        }
        return LIZIZ;
    }
}
