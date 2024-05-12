package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView$SavedState;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import o3.h0;

/* renamed from: X.1qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C45631qh extends FrameLayout implements InterfaceC43251mr, InterfaceC33971Uz, InterfaceC16140kE {
    public static final C28551Ad LLFZ = new C16120kC() { // from class: X.1Ad
        @Override // X.C16120kC
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            C45631qh c45631qh = (C45631qh) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (c45631qh.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(c45631qh.getScrollX());
            accessibilityEvent.setScrollY(c45631qh.getScrollY());
            C17790mt.LIZJ(accessibilityEvent, c45631qh.getScrollX());
            C17790mt.LIZLLL(accessibilityEvent, c45631qh.getScrollRange());
        }

        @Override // X.C16120kC
        public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, c17760mq);
            C45631qh c45631qh = (C45631qh) view;
            c17760mq.LJIILJJIL(ScrollView.class.getName());
            if (c45631qh.isEnabled() && (scrollRange = c45631qh.getScrollRange()) > 0) {
                c17760mq.LJJII(true);
                if (c45631qh.getScrollY() > 0) {
                    c17760mq.LIZIZ(C17720mm.LJIIJ);
                    c17760mq.LIZIZ(C17720mm.LJIILJJIL);
                }
                if (c45631qh.getScrollY() < scrollRange) {
                    c17760mq.LIZIZ(C17720mm.LJIIIZ);
                    c17760mq.LIZIZ(C17720mm.LJIILLIIL);
                }
            }
        }

        @Override // X.C16120kC
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            C45631qh c45631qh = (C45631qh) view;
            if (!c45631qh.isEnabled()) {
                return false;
            }
            int height = c45631qh.getHeight();
            Rect rect = new Rect();
            if (c45631qh.getMatrix().isIdentity() && c45631qh.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i != 8192 && i != 16908344) {
                    if (i != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(c45631qh.getScrollY() - ((height - c45631qh.getPaddingBottom()) - c45631qh.getPaddingTop()), 0);
                    if (max == c45631qh.getScrollY()) {
                        return false;
                    }
                    c45631qh.LJIILLIIL(0 - c45631qh.getScrollX(), max - c45631qh.getScrollY(), true);
                    return true;
                }
            }
            int min = Math.min(c45631qh.getScrollY() + ((height - c45631qh.getPaddingBottom()) - c45631qh.getPaddingTop()), c45631qh.getScrollRange());
            if (min == c45631qh.getScrollY()) {
                return false;
            }
            c45631qh.LJIILLIIL(0 - c45631qh.getScrollX(), min - c45631qh.getScrollY(), true);
            return true;
        }
    };
    public static final int[] LLI = {R.attr.fillViewport};
    public long LJLIL;
    public final Rect LJLILLLLZI;
    public OverScroller LJLJI;
    public final EdgeEffect LJLJJI;
    public final EdgeEffect LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public View LJLJLLL;
    public boolean LJLL;
    public VelocityTracker LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public final int[] LJZ;
    public final int[] LJZI;
    public int LJZL;
    public int LL;
    public NestedScrollView$SavedState LLD;
    public final C16690l7 LLF;
    public final C16610kz LLFF;
    public float LLFFF;
    public C07G LLFII;

    public C45631qh() {
        throw null;
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.View, X.InterfaceC16140kE
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.LJLJL = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        LJIIIIZZ(0);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.LLFFF == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.LLFFF = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.LLFFF;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LJLJI.isFinished()) {
            return;
        }
        this.LJLJI.computeScrollOffset();
        int currY = this.LJLJI.getCurrY();
        int i = currY - this.LL;
        this.LL = currY;
        int[] iArr = this.LJZI;
        iArr[1] = 0;
        this.LLFF.LIZJ(0, i, 1, iArr, null);
        int i2 = i - this.LJZI[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            LJIIJJI(i2, getScrollX(), scrollY, scrollRange);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.LJZI;
            iArr2[1] = 0;
            this.LLFF.LJII(0, scrollY2, 0, i3, this.LJZ, 1, iArr2);
            int i4 = i3 - this.LJZI[1];
            if (i4 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i4 < 0) {
                        if (this.LJLJJI.isFinished()) {
                            this.LJLJJI.onAbsorb((int) this.LJLJI.getCurrVelocity());
                        }
                    } else if (this.LJLJJL.isFinished()) {
                        this.LJLJJL.onAbsorb((int) this.LJLJI.getCurrVelocity());
                    }
                }
                this.LJLJI.abortAnimation();
                LJIIIIZZ(1);
            }
        }
        if (!this.LJLJI.isFinished()) {
            C16300kU.LJIIJ(this);
        } else {
            LJIIIIZZ(1);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LLF;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLFF.LJIIIZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLFF.LIZLLL;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY <= max) {
            return bottom;
        }
        return bottom + (scrollY - max);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJLJ = false;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        NestedScrollView$SavedState nestedScrollView$SavedState = new NestedScrollView$SavedState(super.onSaveInstanceState());
        nestedScrollView$SavedState.scrollPosition = getScrollY();
        return nestedScrollView$SavedState;
    }

    private void LJIIJ(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LJLZ) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LJLJJLL = (int) motionEvent.getY(i);
            this.LJLZ = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LJLLI;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean LIZ(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && LJII(maxScrollAmount, getHeight(), findNextFocus)) {
            findNextFocus.getDrawingRect(this.LJLILLLLZI);
            offsetDescendantRectToMyCoords(findNextFocus, this.LJLILLLLZI);
            LIZJ(LIZIZ(this.LJLILLLLZI));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            LIZJ(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!LJII(0, getHeight(), findFocus))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int LIZIZ(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i5 >= i) {
            return 0;
        }
        if (rect.height() > height) {
            i2 = 0 - (i - rect.bottom);
        } else {
            i2 = 0 - (scrollY - rect.top);
        }
        return Math.max(i2, -getScrollY());
    }

    public final void LIZJ(int i) {
        if (i != 0) {
            if (this.LJLLJ) {
                LJIILIIL(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(android.view.KeyEvent r8) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45631qh.LIZLLL(android.view.KeyEvent):boolean");
    }

    public void LJ(int i) {
        if (getChildCount() > 0) {
            this.LJLJI.fling(getScrollX(), getScrollY(), 0, i, 0, 0, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE, 0, 0);
            LJIIZILJ(2, 1);
            this.LL = getScrollY();
            C16300kU.LJIIJ(this);
        }
    }

    public final boolean LJFF(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.LJLILLLLZI;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.LJLILLLLZI.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.LJLILLLLZI;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.LJLILLLLZI;
        return LJIIL(i, rect3.top, rect3.bottom);
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        this.LLFF.LJIIL(i);
    }

    public final boolean LJIJ(MotionEvent motionEvent) {
        boolean z;
        if (C07Q.LIZJ(this.LJLJJI) != 0.0f) {
            C07Q.LJFF(this.LJLJJI, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (C07Q.LIZJ(this.LJLJJL) != 0.0f) {
            C07Q.LJFF(this.LJLJJL, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || LIZLLL(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.LJLJJI.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C07F.LIZ(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (C07F.LIZ(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.LJLJJI.setSize(width, height);
            if (this.LJLJJI.draw(canvas)) {
                C16300kU.LJIIJ(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.LJLJJL.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C07F.LIZ(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = 0 + getPaddingLeft();
            }
            if (C07F.LIZ(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.LJLJJL.setSize(width2, height2);
            if (this.LJLJJL.draw(canvas)) {
                C16300kU.LJIIJ(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r2 = r9.getAction()
            r0 = 8
            r1 = 0
            if (r2 != r0) goto Lae
            boolean r0 = r8.LJLL
            if (r0 != 0) goto Lae
            r0 = 2
            boolean r0 = X.C79156V4u.LJI(r9, r0)
            r3 = 0
            if (r0 == 0) goto L9d
            r0 = 9
            float r2 = r9.getAxisValue(r0)
        L1b:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto Lae
            float r0 = r8.getVerticalScrollFactorCompat()
            float r2 = r2 * r0
            int r0 = (int) r2
            int r6 = r8.getScrollRange()
            int r4 = r8.getScrollY()
            int r7 = r4 - r0
            r3 = 1
            r5 = 1056964608(0x3f000000, float:0.5)
            r2 = 8194(0x2002, float:1.1482E-41)
            if (r7 >= 0) goto L6a
            int r0 = r8.getOverScrollMode()
            if (r0 == 0) goto L44
            if (r0 != r3) goto L99
            int r0 = r8.getScrollRange()
            if (r0 <= 0) goto L99
        L44:
            boolean r0 = X.C79156V4u.LJI(r9, r2)
            if (r0 != 0) goto L99
            android.widget.EdgeEffect r6 = r8.LJLJJI
            float r0 = (float) r7
            float r2 = -r0
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            X.C07Q.LJFF(r6, r2, r5)
            android.widget.EdgeEffect r0 = r8.LJLJJI
            r0.onRelease()
            r8.invalidate()
            r0 = 1
        L60:
            if (r1 == r4) goto Lad
            int r0 = r8.getScrollX()
            super.scrollTo(r0, r1)
            return r3
        L6a:
            if (r7 <= r6) goto L9a
            int r0 = r8.getOverScrollMode()
            if (r0 == 0) goto L7a
            if (r0 != r3) goto L96
            int r0 = r8.getScrollRange()
            if (r0 <= 0) goto L96
        L7a:
            boolean r0 = X.C79156V4u.LJI(r9, r2)
            if (r0 != 0) goto L96
            android.widget.EdgeEffect r2 = r8.LJLJJL
            int r7 = r7 - r6
            float r1 = (float) r7
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.C07Q.LJFF(r2, r1, r5)
            android.widget.EdgeEffect r0 = r8.LJLJJL
            r0.onRelease()
            r8.invalidate()
            r1 = 1
        L96:
            r0 = r1
            r1 = r6
            goto L60
        L99:
            r7 = 0
        L9a:
            r1 = r7
            r0 = 0
            goto L60
        L9d:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = X.C79156V4u.LJI(r9, r0)
            if (r0 == 0) goto Lae
            r0 = 26
            float r2 = r9.getAxisValue(r0)
            goto L1b
        Lad:
            return r0
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45631qh.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.LJLL) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            LJIIJ(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.LJLZ;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.LJLJJLL) > this.LJLLL && (2 & getNestedScrollAxes()) == 0) {
                            this.LJLL = true;
                            this.LJLJJLL = y;
                            if (this.LJLLI == null) {
                                this.LJLLI = VelocityTracker.obtain();
                            }
                            this.LJLLI.addMovement(motionEvent);
                            this.LJZL = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
            }
            this.LJLL = false;
            this.LJLZ = -1;
            VelocityTracker velocityTracker = this.LJLLI;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJLLI = null;
            }
            if (this.LJLJI.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C16300kU.LJIIJ(this);
            }
            LJIIIIZZ(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.LJLJJLL = y2;
                    this.LJLZ = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.LJLLI;
                    if (velocityTracker2 == null) {
                        this.LJLLI = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.LJLLI.addMovement(motionEvent);
                    this.LJLJI.computeScrollOffset();
                    if (!LJIJ(motionEvent) && this.LJLJI.isFinished()) {
                        z = false;
                    }
                    this.LJLL = z;
                    LJIIZILJ(2, 0);
                }
            }
            if (!LJIJ(motionEvent) && this.LJLJI.isFinished()) {
                z = false;
            }
            this.LJLL = z;
            VelocityTracker velocityTracker3 = this.LJLLI;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.LJLLI = null;
            }
        }
        return this.LJLL;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof NestedScrollView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NestedScrollView$SavedState nestedScrollView$SavedState = (NestedScrollView$SavedState) parcelable;
        super.onRestoreInstanceState(nestedScrollView$SavedState.getSuperState());
        this.LLD = nestedScrollView$SavedState;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        LJIILJJIL(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45631qh.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.LJLLI) != null) {
            velocityTracker.recycle();
            this.LJLLI = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.LJLLILLLL) {
            this.LJLLILLLL = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLFF.LJIIJ(z);
    }

    public void setOnScrollChangeListener(C07G c07g) {
        this.LLFII = c07g;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.LJLLJ = z;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return LJIIZILJ(i, 0);
    }

    public C45631qh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.b22);
    }

    public static boolean LJI(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && LJI((View) parent, view2)) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(int i, int i2) {
        LJIILLIIL(0, i2, false);
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View view) {
        this.LLF.LIZIZ(i);
        LJIIIIZZ(i);
    }

    public final boolean LJIIZILJ(int i, int i2) {
        return this.LLFF.LJIIJJI(i, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLFF.LIZIZ(f, f2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LJLLILLLL && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (true ^ LJII(0, getHeight(), findNextFocusFromRect))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.LJLJL) {
            view2.getDrawingRect(this.LJLILLLLZI);
            offsetDescendantRectToMyCoords(view2, this.LJLILLLLZI);
            int LIZIZ = LIZIZ(this.LJLILLLLZI);
            if (LIZIZ != 0) {
                scrollBy(0, LIZIZ);
            }
        } else {
            this.LJLJLLL = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public C45631qh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.LJLILLLLZI = new Rect();
        this.LJLJL = true;
        this.LJLJLJ = false;
        this.LJLJLLL = null;
        this.LJLL = false;
        this.LJLLJ = true;
        this.LJLZ = -1;
        this.LJZ = new int[2];
        this.LJZI = new int[2];
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = C07P.LIZ(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.LJLJJI = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = C07P.LIZ(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.LJLJJL = edgeEffect2;
        this.LJLJI = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LJLLL = viewConfiguration.getScaledTouchSlop();
        this.LJLLLL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLLLLLL = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LLI, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.LLF = new C16690l7();
        this.LLFF = new C16610kz(this);
        setNestedScrollingEnabled(true);
        h0.LJIJI(this, LLFZ);
    }

    public final boolean LJII(int i, int i2, View view) {
        view.getDrawingRect(this.LJLILLLLZI);
        offsetDescendantRectToMyCoords(view, this.LJLILLLLZI);
        if (this.LJLILLLLZI.bottom + i >= getScrollY() && this.LJLILLLLZI.top - i <= getScrollY() + i2) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.LLFF.LJ(0, scrollY2, 0, i - scrollY2, i2, iArr);
    }

    public final boolean LJIIL(int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) ListProtector.get(focusables, i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                if (i2 < top && bottom < i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view == null) {
                    view = view2;
                    z5 = z3;
                } else {
                    if (!z ? bottom <= view.getBottom() : top >= view.getTop()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z5) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 >= scrollY && i3 <= i5) {
            z2 = false;
        } else {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            LIZJ(i4);
            z2 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    public final void LJIILLIIL(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.LJLIL > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.LJLJI.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, LiveCoverMinSizeSetting.DEFAULT);
            if (z) {
                LJIIZILJ(2, 1);
            } else {
                LJIIIIZZ(1);
            }
            this.LL = getScrollY();
            C16300kU.LJIIJ(this);
        } else {
            if (!this.LJLJI.isFinished()) {
                this.LJLJI.abortAnimation();
                LJIIIIZZ(1);
            }
            scrollBy(i, i2);
        }
        this.LJLIL = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLFF.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        LJIILL(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return LJJLIIJ(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int LIZIZ = LIZIZ(rect);
        if (LIZIZ != 0) {
            if (z) {
                scrollBy(0, LIZIZ);
                return true;
            }
            LJIILIIL(0, LIZIZ);
            return true;
        }
        return false;
    }

    public final boolean LJIIJJI(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 > 0 || i2 < 0) {
            z = true;
            i2 = 0;
        } else {
            z = false;
        }
        if (i5 > i4) {
            i5 = i4;
        } else if (i5 < 0) {
            i5 = 0;
        } else {
            z2 = false;
            onOverScrolled(i2, i5, z, z2);
            if (z && !z2) {
                return false;
            }
        }
        z2 = true;
        if (!this.LLFF.LJIIIZ(1)) {
            this.LJLJI.springBack(0, i5, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i2, i5, z, z2);
        return z ? true : true;
    }

    @Override // X.C1V0
    public final void LJIILL(View view, View view2, int i, int i2) {
        this.LLF.LIZ(i, i2);
        LJIIZILJ(2, i2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.LLFF.LIZJ(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!z) {
            dispatchNestedFling(0.0f, f2, true);
            LJ((int) f2);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        LJJIIJ(view, i, i2, iArr, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C07G c07g = this.LLFII;
        if (c07g != null) {
            c07g.LIZ(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !LJII(0, i4, findFocus)) {
            return;
        }
        findFocus.getDrawingRect(this.LJLILLLLZI);
        offsetDescendantRectToMyCoords(findFocus, this.LJLILLLLZI);
        LIZJ(LIZIZ(this.LJLILLLLZI));
    }

    @Override // X.C1V0
    public void LJJIIJ(View view, int i, int i2, int[] iArr, int i3) {
        this.LLFF.LIZJ(i, i2, i3, iArr, null);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LLFF.LJFF(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r3 != r1) goto L20;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            r3 = 0
            r4.LJLJL = r3
            android.view.View r0 = r4.LJLJLLL
            if (r0 == 0) goto L27
            boolean r0 = LJI(r0, r4)
            if (r0 == 0) goto L27
            android.view.View r1 = r4.LJLJLLL
            android.graphics.Rect r0 = r4.LJLILLLLZI
            r1.getDrawingRect(r0)
            android.graphics.Rect r0 = r4.LJLILLLLZI
            r4.offsetDescendantRectToMyCoords(r1, r0)
            android.graphics.Rect r0 = r4.LJLILLLLZI
            int r0 = r4.LIZIZ(r0)
            if (r0 == 0) goto L27
            r4.scrollBy(r3, r0)
        L27:
            r2 = 0
            r4.LJLJLLL = r2
            boolean r0 = r4.LJLJLJ
            if (r0 != 0) goto L73
            androidx.core.widget.NestedScrollView$SavedState r0 = r4.LLD
            if (r0 == 0) goto L3f
            int r1 = r4.getScrollX()
            androidx.core.widget.NestedScrollView$SavedState r0 = r4.LLD
            int r0 = r0.scrollPosition
            r4.scrollTo(r1, r0)
            r4.LLD = r2
        L3f:
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L8d
            android.view.View r0 = r4.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r0.getMeasuredHeight()
            int r0 = r1.topMargin
            int r2 = r2 + r0
            int r0 = r1.bottomMargin
            int r2 = r2 + r0
        L59:
            int r9 = r9 - r7
            int r0 = r4.getPaddingTop()
            int r9 = r9 - r0
            int r0 = r4.getPaddingBottom()
            int r9 = r9 - r0
            int r1 = r4.getScrollY()
            if (r9 >= r2) goto L88
            if (r1 >= 0) goto L82
        L6c:
            int r0 = r4.getScrollX()
            r4.scrollTo(r0, r3)
        L73:
            int r1 = r4.getScrollX()
            int r0 = r4.getScrollY()
            r4.scrollTo(r1, r0)
            r0 = 1
            r4.LJLJLJ = r0
            return
        L82:
            int r0 = r9 + r1
            if (r0 <= r2) goto L8b
            int r3 = r2 - r9
        L88:
            if (r3 == r1) goto L73
            goto L6c
        L8b:
            r3 = r1
            goto L88
        L8d:
            r2 = 0
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45631qh.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        LJIIIZ(i4, 0, null);
    }

    @Override // X.C1V0
    public final void LJJ(View view, int i, int i2, int i3, int i4, int i5) {
        LJIIIZ(i4, i5, null);
    }

    @Override // X.InterfaceC43251mr
    public final void LJJIJIL(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LJIIIZ(i4, i5, iArr);
    }
}
