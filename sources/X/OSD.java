package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import defpackage.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSD extends LinearLayout {
    public OSE LJLIL;
    public final HashMap<Integer, Integer> LJLILLLLZI;

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OSF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.LJLIL != null && (getParent() instanceof C80217Ve1)) {
            ViewParent parent = getParent();
            o.LJII(parent, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
            OSE ose = this.LJLIL;
            List<VTY> list = ((C80217Ve1) parent).LJLJLJ;
            if (list != null && ose != null) {
                ((ArrayList) list).remove(ose);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C80217Ve1 c80217Ve1;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if ((parent instanceof C80217Ve1) && (c80217Ve1 = (C80217Ve1) parent) != null) {
            if (this.LJLIL == null) {
                this.LJLIL = new OSE(this);
            }
            c80217Ve1.LIZ(this.LJLIL);
        }
    }

    public final HashMap<Integer, Integer> getChildOffsets() {
        return this.LJLILLLLZI;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new OSF();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OSF;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OSF(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OSF(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OSF(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OSF(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "ctx");
        setChildrenDrawingOrderEnabled(true);
        this.LJLILLLLZI = new HashMap<>();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OSF osf;
        super.onMeasure(i, i2);
        Iterator<Integer> it = C78842Uww.LJJ(0, getChildCount()).iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            int nextInt = ((AbstractC118224kU) it).nextInt();
            this.LJLILLLLZI.put(Integer.valueOf(nextInt), Integer.valueOf(i4));
            i4 += getChildAt(nextInt).getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = getChildAt(nextInt).getLayoutParams();
            if ((layoutParams instanceof OSF) && (osf = (OSF) layoutParams) != null && osf.LIZ) {
                i3 += getChildAt(nextInt).getMeasuredHeight();
            }
        }
        setMinimumHeight(i3);
    }
}
