package com.bytedance.android.livesdk.container.behavior;

import X.C06C;
import X.C06F;
import X.C45621qg;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;

/* loaded from: classes6.dex */
public class ContainerBottomSheetBehavior<V extends View> extends LiveBottomSheetBehavior<V> {
    public boolean LJJJJI;

    public ContainerBottomSheetBehavior() {
    }

    public static <V extends View> ContainerBottomSheetBehavior<V> LJII(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C06F) {
            C06C c06c = ((C06F) layoutParams).LIZ;
            if (c06c instanceof ContainerBottomSheetBehavior) {
                return (ContainerBottomSheetBehavior) c06c;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public ContainerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static boolean LJI(int i, int i2, View view) {
        int i3;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && (i3 = i2 + scrollY) >= childAt.getTop() && i3 < childAt.getBottom() && LJI(i4 - childAt.getLeft(), i3 - childAt.getTop(), childAt)) {
                    return true;
                }
            }
        }
        if (view.canScrollHorizontally(-1) || view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior, X.C06C
    public final boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        if (!this.LJJJJI) {
            return super.onInterceptTouchEvent(c45621qg, v, motionEvent);
        }
        if (LJI((int) motionEvent.getX(), (int) motionEvent.getY(), v)) {
            return false;
        }
        return super.onInterceptTouchEvent(c45621qg, v, motionEvent);
    }
}
