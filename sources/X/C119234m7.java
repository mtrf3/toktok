package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4m7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119234m7 extends RelativeLayout {
    public int LJLIL;
    public int LJLILLLLZI;

    public final void setMaxHeight(int i) {
        this.LJLILLLLZI = i;
        requestLayout();
    }

    public final void setMaxWidth(int i) {
        this.LJLIL = i;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119234m7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.zk, R.attr.zn});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…le.BoundedRelativeLayout)");
        this.LJLIL = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.LJLILLLLZI = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.LJLIL;
        if (1 <= i3 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.LJLIL, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.LJLILLLLZI;
        if (1 <= i4 && i4 < size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.LJLILLLLZI, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
