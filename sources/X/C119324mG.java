package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4mG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119324mG extends LinearLayout {
    public int LJLIL;

    public final int getExpectedEmptyHeightPx() {
        return this.LJLIL;
    }

    public final void setExpectedEmptyHeightPx(int i) {
        if (this.LJLIL != i) {
            this.LJLIL = i;
            if (getMeasuredHeight() <= getPaddingBottom() + getPaddingTop() && getVisibility() != 8) {
                requestLayout();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119324mG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C278817o.LIZ(16.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ach});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.UserInfoLayout)");
        setExpectedEmptyHeightPx((int) obtainStyledAttributes.getDimension(0, 16.0f));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            if (getMeasuredHeight() <= getPaddingBottom() + getPaddingTop() && getVisibility() != 8) {
                setMeasuredDimension(getMeasuredWidth(), this.LJLIL);
            }
        }
    }
}
