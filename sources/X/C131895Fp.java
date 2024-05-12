package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131895Fp extends FrameLayout {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131895Fp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(0, new int[]{R.attr.b3y, R.attr.b7m});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….ProfileNaviEditorLayout)");
        this.LJLIL = obtainStyledAttributes.getResourceId(1, R.id.i7z);
        this.LJLILLLLZI = obtainStyledAttributes.getResourceId(0, R.id.gxh);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            int max = Math.max(size2 / 2, size);
            this.LJLJJL = max;
            this.LJLJJLL = size2 - max;
            View view = this.LJLJJI;
            if (view != null) {
                measureChild(view, View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LJLJJLL, 1073741824));
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new Exception("Need to define exact or at most values for width and height");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view != null) {
            if (view.getId() == this.LJLIL) {
                this.LJLJI = view;
            } else {
                if (view.getId() != this.LJLILLLLZI) {
                    return;
                }
                this.LJLJJI = view;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.LJLJI;
        if (view != null) {
            int measuredHeight = (view.getMeasuredHeight() - this.LJLJJL) / 2;
            view.layout(0, -measuredHeight, view.getMeasuredWidth(), view.getMeasuredHeight() - measuredHeight);
        }
    }
}
