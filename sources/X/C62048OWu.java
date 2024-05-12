package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import defpackage.a1;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.OWu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62048OWu extends ViewPager {
    public final Field LJLIL;

    private final View getCurrentView() {
        ViewPager.LayoutParams layoutParams;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = super.getChildAt(i);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            if ((layoutParams2 instanceof ViewPager.LayoutParams) && (layoutParams = (ViewPager.LayoutParams) layoutParams2) != null) {
                int i2 = this.LJLIL.getInt(layoutParams);
                if (!layoutParams.LIZ && getCurrentItem() == i2) {
                    return childAt;
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        Boolean bool;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        o.LJIIIIZZ(stackTrace, "stackTrace");
        boolean z = true;
        StackTraceElement stackTraceElement = (StackTraceElement) ORY.LJJJJI(1, stackTrace);
        if (stackTraceElement != null) {
            if (!o.LJ(stackTraceElement.getClassName(), "com.google.android.material.bottomsheet.BottomSheetBehavior") || !o.LJ(stackTraceElement.getMethodName(), "findScrollingChild")) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            View childAt = super.getChildAt(i);
            o.LJIIIIZZ(childAt, "super.getChildAt(index)");
            return childAt;
        }
        View currentView = getCurrentView();
        if (currentView == null) {
            View childAt2 = super.getChildAt(i);
            o.LJIIIIZZ(childAt2, "super.getChildAt(index)");
            return childAt2;
        }
        if (i == 0) {
            return currentView;
        }
        View view = super.getChildAt(i);
        if (o.LJ(view, currentView)) {
            view = super.getChildAt(0);
        }
        o.LJIIIIZZ(view, "view");
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62048OWu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
        declaredField.setAccessible(true);
        this.LJLIL = declaredField;
        addOnPageChangeListener(new C1CZ() { // from class: X.4Bt
            @Override // X.C1CZ, X.C0C3
            public final void onPageSelected(int i) {
                C62048OWu.this.requestLayout();
            }
        });
    }
}