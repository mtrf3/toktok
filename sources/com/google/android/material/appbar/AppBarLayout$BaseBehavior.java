package com.google.android.material.appbar;

import X.AbstractC80210Vdu;
import X.AnonymousClass036;
import X.C06C;
import X.C06F;
import X.C16300kU;
import X.C17720mm;
import X.C45621qg;
import X.C78609UtB;
import X.C80209Vdt;
import X.C80211Vdv;
import X.C80212Vdw;
import X.C80213Vdx;
import X.C80217Ve1;
import X.C80218Ve2;
import X.C80237VeL;
import X.InterfaceC16600ky;
import X.VTW;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.customview.view.AbsSavedState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o3.h0;

/* loaded from: classes15.dex */
public class AppBarLayout$BaseBehavior<T extends C80217Ve1> extends HeaderBehavior<T> {
    public WeakReference<View> lastNestedScrollingChildRef;
    public int lastStartedType;
    public ValueAnimator offsetAnimator;
    public int offsetDelta;
    public int offsetToChildIndexOnLayout;
    public boolean offsetToChildIndexOnLayoutIsMinHeight;
    public float offsetToChildIndexOnLayoutPerc;
    public VTW onDragCallback;

    public static boolean checkFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public boolean isOffsetAnimatorRunning() {
        ValueAnimator valueAnimator = this.offsetAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public AppBarLayout$BaseBehavior() {
        this.offsetToChildIndexOnLayout = -1;
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset() + this.offsetDelta;
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80213Vdx();
        public int LJLIL;
        public float LJLILLLLZI;
        public boolean LJLJI;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.LJLIL = parcel.readInt();
            this.LJLILLLLZI = parcel.readFloat();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJI = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LJLIL);
            parcel.writeFloat(this.LJLILLLLZI);
            parcel.writeByte(this.LJLJI ? (byte) 1 : (byte) 0);
        }
    }

    private View findFirstScrollingChild(C45621qg c45621qg) {
        int childCount = c45621qg.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c45621qg.getChildAt(i);
            if ((childAt instanceof InterfaceC16600ky) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public boolean canDragView(T t) {
        VTW vtw = this.onDragCallback;
        if (vtw != null) {
            return vtw.LIZ(t);
        }
        WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
        if (weakReference == null) {
            return true;
        }
        View view = weakReference.get();
        if (view != null && view.isShown() && !view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public void setDragCallback(VTW vtw) {
        this.onDragCallback = vtw;
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public int getMaxDragOffset(T t) {
        return -t.getDownNestedScrollRange();
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public int getScrollRangeForDragFling(T t) {
        return t.getTotalScrollRange();
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.offsetToChildIndexOnLayout = -1;
    }

    public static View getAppBarChildOnOffset(C80217Ve1 c80217Ve1, int i) {
        int abs = Math.abs(i);
        int childCount = c80217Ve1.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c80217Ve1.getChildAt(i2);
            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private int getChildIndexOnOffset(T t, int i) {
        int childCount = t.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = t.getChildAt(i2);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            C80218Ve2 c80218Ve2 = (C80218Ve2) childAt.getLayoutParams();
            if (checkFlag(c80218Ve2.LIZ, 32)) {
                top -= ((LinearLayout.LayoutParams) c80218Ve2).topMargin;
                bottom += ((LinearLayout.LayoutParams) c80218Ve2).bottomMargin;
            }
            int i3 = -i;
            if (top <= i3 && bottom >= i3) {
                return i2;
            }
        }
        return -1;
    }

    private int interpolateOffset(T t, int i) {
        int abs = Math.abs(i);
        int childCount = t.getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = t.getChildAt(i3);
            C80218Ve2 c80218Ve2 = (C80218Ve2) childAt.getLayoutParams();
            Interpolator interpolator = c80218Ve2.LIZIZ;
            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                if (interpolator != null) {
                    int i4 = c80218Ve2.LIZ;
                    if ((i4 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c80218Ve2).topMargin + ((LinearLayout.LayoutParams) c80218Ve2).bottomMargin;
                        if ((i4 & 2) != 0) {
                            i2 -= C16300kU.LIZLLL(childAt);
                        }
                    }
                    if (C16300kU.LIZIZ(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(i);
                    }
                }
            } else {
                i3++;
            }
        }
        return i;
    }

    private boolean shouldJumpElevationState(C45621qg c45621qg, T t) {
        ArrayList<View> orDefault = c45621qg.LJLILLLLZI.LIZIZ.getOrDefault(t, null);
        ((ArrayList) c45621qg.LJLJJI).clear();
        if (orDefault != null) {
            ((ArrayList) c45621qg.LJLJJI).addAll(orDefault);
        }
        ArrayList arrayList = (ArrayList) c45621qg.LJLJJI;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C06C c06c = ((C06F) ((View) ListProtector.get(arrayList, i)).getLayoutParams()).LIZ;
            if (c06c instanceof AppBarLayout$ScrollingViewBehavior) {
                if (((AbstractC80210Vdu) c06c).LIZLLL == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private void snapToChildIfNeeded(C45621qg c45621qg, T t) {
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        int childIndexOnOffset = getChildIndexOnOffset(t, topBottomOffsetForScrollingSibling);
        if (childIndexOnOffset >= 0) {
            View childAt = t.getChildAt(childIndexOnOffset);
            C80218Ve2 c80218Ve2 = (C80218Ve2) childAt.getLayoutParams();
            int i = c80218Ve2.LIZ;
            if ((i & 17) == 17) {
                int i2 = -childAt.getTop();
                int i3 = -childAt.getBottom();
                if (childIndexOnOffset == t.getChildCount() - 1) {
                    i3 += t.getTopInset();
                }
                if (checkFlag(i, 2)) {
                    i3 += C16300kU.LIZLLL(childAt);
                } else if (checkFlag(i, 5)) {
                    int LIZLLL = C16300kU.LIZLLL(childAt) + i3;
                    if (topBottomOffsetForScrollingSibling < LIZLLL) {
                        i2 = LIZLLL;
                    } else {
                        i3 = LIZLLL;
                    }
                }
                if (checkFlag(i, 32)) {
                    i2 += ((LinearLayout.LayoutParams) c80218Ve2).topMargin;
                    i3 -= ((LinearLayout.LayoutParams) c80218Ve2).bottomMargin;
                }
                if (topBottomOffsetForScrollingSibling < (i3 + i2) / 2) {
                    i2 = i3;
                }
                animateOffsetTo(c45621qg, t, C78609UtB.LJJIIZ(i2, -t.getTotalScrollRange(), 0), 0.0f);
            }
        }
    }

    private void updateAccessibilityActions(C45621qg c45621qg, T t) {
        h0.LJIILL(C17720mm.LJIIIZ.LIZ(), c45621qg);
        h0.LJIIJ(0, c45621qg);
        h0.LJIILL(C17720mm.LJIIJ.LIZ(), c45621qg);
        h0.LJIIJ(0, c45621qg);
        View findFirstScrollingChild = findFirstScrollingChild(c45621qg);
        if (findFirstScrollingChild == null || t.getTotalScrollRange() == 0 || !(((C06F) findFirstScrollingChild.getLayoutParams()).LIZ instanceof AppBarLayout$ScrollingViewBehavior)) {
            return;
        }
        addAccessibilityScrollActions(c45621qg, t, findFirstScrollingChild);
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public void onFlingFinished(C45621qg c45621qg, T t) {
        snapToChildIfNeeded(c45621qg, t);
        if (t.LJLLI) {
            t.LJ(t.LJFF(findFirstScrollingChild(c45621qg)));
        }
    }

    @Override // X.C06C
    public Parcelable onSaveInstanceState(C45621qg c45621qg, T t) {
        Parcelable onSaveInstanceState = super.onSaveInstanceState(c45621qg, (C45621qg) t);
        int topAndBottomOffset = getTopAndBottomOffset();
        int childCount = t.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = t.getChildAt(i);
            int bottom = childAt.getBottom() + topAndBottomOffset;
            if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                SavedState savedState = new SavedState(onSaveInstanceState);
                savedState.LJLIL = i;
                if (bottom == t.getTopInset() + C16300kU.LIZLLL(childAt)) {
                    z = true;
                }
                savedState.LJLJI = z;
                savedState.LJLILLLLZI = bottom / childAt.getHeight();
                return savedState;
            }
        }
        return onSaveInstanceState;
    }

    private void addAccessibilityScrollActions(C45621qg c45621qg, T t, View view) {
        if (getTopBottomOffsetForScrollingSibling() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
            addActionToExpand(c45621qg, t, C17720mm.LJIIIZ, false);
        }
        if (getTopBottomOffsetForScrollingSibling() != 0) {
            if (view.canScrollVertically(-1)) {
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    h0.LJIILLIIL(c45621qg, C17720mm.LJIIJ, null, new C80211Vdv(this, c45621qg, t, view, i));
                    return;
                }
                return;
            }
            addActionToExpand(c45621qg, t, C17720mm.LJIIJ, true);
        }
    }

    private boolean canScrollChildren(C45621qg c45621qg, T t, View view) {
        if (t.getTotalScrollRange() != 0 && c45621qg.getHeight() - view.getHeight() <= t.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // X.C80214Vdy, X.C06C
    public boolean onLayoutChild(C45621qg c45621qg, T t, int i) {
        boolean z;
        int LIZ;
        boolean onLayoutChild = super.onLayoutChild(c45621qg, (C45621qg) t, i);
        int pendingAction = t.getPendingAction();
        int i2 = this.offsetToChildIndexOnLayout;
        if (i2 >= 0 && (pendingAction & 8) == 0) {
            View childAt = t.getChildAt(i2);
            int i3 = -childAt.getBottom();
            if (this.offsetToChildIndexOnLayoutIsMinHeight) {
                LIZ = t.getTopInset() + C16300kU.LIZLLL(childAt) + i3;
            } else {
                LIZ = AnonymousClass036.LIZ(childAt.getHeight(), this.offsetToChildIndexOnLayoutPerc, i3);
            }
            setHeaderTopBottomOffset(c45621qg, t, LIZ);
        } else if (pendingAction != 0) {
            if ((pendingAction & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((pendingAction & 2) != 0) {
                int i4 = -t.getUpNestedPreScrollRange();
                if (z) {
                    animateOffsetTo(c45621qg, t, i4, 0.0f);
                } else {
                    setHeaderTopBottomOffset(c45621qg, t, i4);
                }
            } else if ((pendingAction & 1) != 0) {
                if (z) {
                    animateOffsetTo(c45621qg, t, 0, 0.0f);
                } else {
                    setHeaderTopBottomOffset(c45621qg, t, 0);
                }
            }
        }
        t.LJLJJLL = 0;
        this.offsetToChildIndexOnLayout = -1;
        setTopAndBottomOffset(C78609UtB.LJJIIZ(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
        updateAppBarLayoutDrawableState(c45621qg, t, getTopAndBottomOffset(), 0, true);
        t.LIZJ(getTopAndBottomOffset());
        updateAccessibilityActions(c45621qg, t);
        return onLayoutChild;
    }

    @Override // X.C06C
    public void onRestoreInstanceState(C45621qg c45621qg, T t, Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(c45621qg, (C45621qg) t, savedState.mSuperState);
            this.offsetToChildIndexOnLayout = savedState.LJLIL;
            this.offsetToChildIndexOnLayoutPerc = savedState.LJLILLLLZI;
            this.offsetToChildIndexOnLayoutIsMinHeight = savedState.LJLJI;
            return;
        }
        super.onRestoreInstanceState(c45621qg, (C45621qg) t, parcelable);
        this.offsetToChildIndexOnLayout = -1;
    }

    private void addActionToExpand(C45621qg c45621qg, T t, C17720mm c17720mm, boolean z) {
        h0.LJIILLIIL(c45621qg, c17720mm, null, new C80212Vdw(t, z));
    }

    private void animateOffsetTo(C45621qg c45621qg, T t, int i, float f) {
        int height;
        int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
        float abs2 = Math.abs(f);
        if (abs2 > 0.0f) {
            height = Math.round((abs / abs2) * 1000.0f) * 3;
        } else {
            height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
        }
        animateOffsetWithDuration(c45621qg, t, i, height);
    }

    private void animateOffsetWithDuration(C45621qg c45621qg, T t, int i, int i2) {
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        if (topBottomOffsetForScrollingSibling == i) {
            ValueAnimator valueAnimator = this.offsetAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.offsetAnimator.cancel();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.offsetAnimator;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.offsetAnimator = valueAnimator3;
            valueAnimator3.setInterpolator(C80237VeL.LJ);
            this.offsetAnimator.addUpdateListener(new C80209Vdt(this, c45621qg, t));
        } else {
            valueAnimator2.cancel();
        }
        this.offsetAnimator.setDuration(Math.min(i2, 600));
        this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i);
        this.offsetAnimator.start();
    }

    @Override // X.C06C
    public void onStopNestedScroll(C45621qg c45621qg, T t, View view, int i) {
        if (this.lastStartedType == 0 || i == 1) {
            snapToChildIfNeeded(c45621qg, t);
            if (t.LJLLI) {
                t.LJ(t.LJFF(view));
            }
        }
        this.lastNestedScrollingChildRef = new WeakReference<>(view);
    }

    private void updateAppBarLayoutDrawableState(C45621qg c45621qg, T t, int i, int i2, boolean z) {
        View appBarChildOnOffset = getAppBarChildOnOffset(t, i);
        if (appBarChildOnOffset != null) {
            int i3 = ((C80218Ve2) appBarChildOnOffset.getLayoutParams()).LIZ;
            boolean z2 = false;
            if ((i3 & 1) != 0) {
                int LIZLLL = C16300kU.LIZLLL(appBarChildOnOffset);
                if (i2 <= 0 || (i3 & 12) == 0 ? !((i3 & 2) == 0 || (-i) < (appBarChildOnOffset.getBottom() - LIZLLL) - t.getTopInset()) : (-i) >= (appBarChildOnOffset.getBottom() - LIZLLL) - t.getTopInset()) {
                    z2 = true;
                }
            }
            if (t.LJLLI) {
                z2 = t.LJFF(findFirstScrollingChild(c45621qg));
            }
            boolean LJ = t.LJ(z2);
            if (z || (LJ && shouldJumpElevationState(c45621qg, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public int setHeaderTopBottomOffset(C45621qg c45621qg, T t, int i, int i2, int i3) {
        int i4;
        int i5;
        ArrayList<View> orDefault;
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        int i6 = 0;
        if (i2 != 0 && topBottomOffsetForScrollingSibling >= i2 && topBottomOffsetForScrollingSibling <= i3) {
            int LJJIIZ = C78609UtB.LJJIIZ(i, i2, i3);
            if (topBottomOffsetForScrollingSibling != LJJIIZ) {
                if (t.LJLJJL) {
                    i4 = interpolateOffset(t, LJJIIZ);
                } else {
                    i4 = LJJIIZ;
                }
                boolean topAndBottomOffset = setTopAndBottomOffset(i4);
                int i7 = topBottomOffsetForScrollingSibling - LJJIIZ;
                this.offsetDelta = LJJIIZ - i4;
                if (!topAndBottomOffset && t.LJLJJL && (orDefault = c45621qg.LJLILLLLZI.LIZIZ.getOrDefault(t, null)) != null && !orDefault.isEmpty()) {
                    while (i6 < orDefault.size()) {
                        View view = (View) ListProtector.get(orDefault, i6);
                        C06C c06c = ((C06F) view.getLayoutParams()).LIZ;
                        if (c06c != null) {
                            c06c.onDependentViewChanged(c45621qg, view, t);
                        }
                        i6++;
                    }
                }
                t.LIZJ(getTopAndBottomOffset());
                if (LJJIIZ < topBottomOffsetForScrollingSibling) {
                    i5 = -1;
                } else {
                    i5 = 1;
                }
                updateAppBarLayoutDrawableState(c45621qg, t, LJJIIZ, i5, false);
                i6 = i7;
            }
        } else {
            this.offsetDelta = 0;
        }
        updateAccessibilityActions(c45621qg, t);
        return i6;
    }

    @Override // X.C06C
    public boolean onMeasureChild(C45621qg c45621qg, T t, int i, int i2, int i3, int i4) {
        if (((ViewGroup.MarginLayoutParams) t.getLayoutParams()).height == -2) {
            c45621qg.LJIIJJI(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }
        return super.onMeasureChild(c45621qg, (C45621qg) t, i, i2, i3, i4);
    }

    @Override // X.C06C
    public boolean onStartNestedScroll(C45621qg c45621qg, T t, View view, View view2, int i, int i2) {
        boolean z;
        if ((i & 2) != 0 && (t.LJLLI || canScrollChildren(c45621qg, t, view))) {
            z = true;
            ValueAnimator valueAnimator = this.offsetAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } else {
            z = false;
        }
        this.lastNestedScrollingChildRef = null;
        this.lastStartedType = i2;
        return z;
    }

    @Override // X.C06C
    public void onNestedPreScroll(C45621qg c45621qg, T t, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        if (i2 != 0) {
            if (i2 < 0) {
                i4 = -t.getTotalScrollRange();
                i5 = t.getDownNestedPreScrollRange() + i4;
            } else {
                i4 = -t.getUpNestedPreScrollRange();
                i5 = 0;
            }
            if (i4 != i5) {
                iArr[1] = scroll(c45621qg, t, i2, i4, i5);
            }
        }
        if (t.LJLLI) {
            t.LJ(t.LJFF(view));
        }
    }

    @Override // X.C06C
    public void onNestedScroll(C45621qg c45621qg, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 < 0) {
            iArr[1] = scroll(c45621qg, t, i4, -t.getDownNestedScrollRange(), 0);
        } else {
            if (i4 != 0) {
                return;
            }
            updateAccessibilityActions(c45621qg, t);
        }
    }
}
