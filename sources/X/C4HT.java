package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4HT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4HT extends FrameLayout {
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        View view;
        View childAt;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i < childCount) {
                if (getChildAt(i) instanceof C0CM) {
                    View childAt2 = getChildAt(i);
                    if (childAt2 != null) {
                        viewGroup = (ViewGroup) childAt2;
                        if (viewGroup != null) {
                            view = viewGroup.getChildAt(0);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
                    }
                } else {
                    i++;
                }
            } else {
                viewGroup = null;
                break;
            }
        }
        view = null;
        if (!(view instanceof RecyclerView)) {
            view = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        if (viewGroup2 != null) {
            int childCount2 = viewGroup2.getChildCount();
            boolean z = false;
            for (int i2 = 0; i2 < childCount2; i2++) {
                View view2 = viewGroup2.getChildAt(i2);
                o.LJIIIIZZ(view2, "view");
                if (motionEvent != null) {
                    Integer valueOf = Integer.valueOf((int) motionEvent.getRawX());
                    Integer valueOf2 = Integer.valueOf((int) motionEvent.getRawY());
                    if (valueOf != null && valueOf2 != null) {
                        int[] iArr = new int[2];
                        view2.getLocationOnScreen(iArr);
                        int i3 = iArr[0];
                        int i4 = iArr[1];
                        int measuredWidth = view2.getMeasuredWidth() + i3;
                        int measuredHeight = view2.getMeasuredHeight() + i4;
                        int intValue = valueOf2.intValue();
                        if (i4 <= intValue && measuredHeight >= intValue && valueOf.intValue() >= i3 && valueOf.intValue() <= measuredWidth) {
                            view2.onTouchEvent(motionEvent);
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
        }
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            return childAt.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4HT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }
}
