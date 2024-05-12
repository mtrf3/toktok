package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public class FixedRatioFrameLayout extends FrameLayout {
    public int LJLIL;
    public float LJLILLLLZI;

    public int getMode() {
        return this.LJLIL;
    }

    public float getWhRatio() {
        return this.LJLILLLLZI;
    }

    public void setMode(int i) {
        if (i == 0 || i == 1) {
            if (this.LJLIL != i) {
                this.LJLIL = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("mode must be either FIXED_HEIGHT or FIXED_WIDTH");
    }

    public void setWhRatio(float f) {
        if (f >= 0.0f) {
            if (this.LJLILLLLZI != f) {
                this.LJLILLLLZI = f;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("whRatio must be positive.");
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aep, R.attr.bx2}, 0, 0);
        this.LJLIL = obtainStyledAttributes.getInteger(0, 1);
        this.LJLILLLLZI = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingBottom()) - getPaddingTop();
        if (this.LJLIL == 0) {
            int i3 = (int) ((size2 * this.LJLILLLLZI) + 0.5f);
            if (i3 != size) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec((int) ((size / this.LJLILLLLZI) + 0.5f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
