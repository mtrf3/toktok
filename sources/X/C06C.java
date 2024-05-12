package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.06C, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C06C<V extends View> {
    public boolean getInsetDodgeRect(C45621qg c45621qg, V v, Rect rect) {
        return false;
    }

    public int getScrimColor(C45621qg c45621qg, V v) {
        return -16777216;
    }

    public float getScrimOpacity(C45621qg c45621qg, V v) {
        return 0.0f;
    }

    public boolean layoutDependsOn(C45621qg c45621qg, V v, View view) {
        return false;
    }

    public C16800lI onApplyWindowInsets(C45621qg c45621qg, V v, C16800lI c16800lI) {
        return c16800lI;
    }

    public void onAttachedToLayoutParams(C06F c06f) {
    }

    public boolean onDependentViewChanged(C45621qg c45621qg, V v, View view) {
        return false;
    }

    public void onDependentViewRemoved(C45621qg c45621qg, V v, View view) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        return false;
    }

    public boolean onMeasureChild(C45621qg c45621qg, V v, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onNestedFling(C45621qg c45621qg, V v, View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(C45621qg c45621qg, V v, View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(C45621qg c45621qg, V v, View view, int i, int i2, int i3, int i4) {
    }

    public void onNestedScrollAccepted(C45621qg c45621qg, V v, View view, View view2, int i) {
    }

    public boolean onRequestChildRectangleOnScreen(C45621qg c45621qg, V v, Rect rect, boolean z) {
        return false;
    }

    public void onRestoreInstanceState(C45621qg c45621qg, V v, Parcelable parcelable) {
    }

    public boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i) {
        return false;
    }

    public void onStopNestedScroll(C45621qg c45621qg, V v, View view) {
    }

    public boolean onTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        return false;
    }

    public C06C() {
    }

    public static Object getTag(View view) {
        return ((C06F) view.getLayoutParams()).LJIIZILJ;
    }

    public C06C(Context context, AttributeSet attributeSet) {
    }

    public static void setTag(View view, Object obj) {
        ((C06F) view.getLayoutParams()).LJIIZILJ = obj;
    }

    public boolean blocksInteractionBelow(C45621qg c45621qg, V v) {
        if (getScrimOpacity(c45621qg, v) > 0.0f) {
            return true;
        }
        return false;
    }

    public Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public void onStopNestedScroll(C45621qg c45621qg, V v, View view, int i) {
        if (i == 0) {
            onStopNestedScroll(c45621qg, v, view);
        }
    }

    public void onNestedScrollAccepted(C45621qg c45621qg, V v, View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(c45621qg, v, view, view2, i);
        }
    }

    public boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(c45621qg, v, view, view2, i);
        }
        return false;
    }

    public void onNestedPreScroll(C45621qg c45621qg, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(c45621qg, v, view, i, i2, iArr);
        }
    }

    public void onNestedScroll(C45621qg c45621qg, V v, View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(c45621qg, v, view, i, i2, i3, i4);
        }
    }

    public void onNestedScroll(C45621qg c45621qg, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        onNestedScroll(c45621qg, v, view, i, i2, i3, i4, i5);
    }
}
