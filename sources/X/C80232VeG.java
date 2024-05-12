package X;

import Y.ARunnableS50S0100000_14;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.VeG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80232VeG extends View {
    public C16800lI LJLIL;
    public final boolean LJLILLLLZI;
    public Drawable LJLJI;
    public final ARunnableS50S0100000_14 LJLJJI;

    public Drawable getNavigationBarBackgroundDrawable() {
        return this.LJLJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C16800lI c16800lI;
        int LIZIZ;
        super.onDraw(canvas);
        if (this.LJLILLLLZI && this.LJLJI != null && (c16800lI = this.LJLIL) != null && (LIZIZ = c16800lI.LIZIZ()) > 0) {
            this.LJLJI.setBounds(0, getHeight() - LIZIZ, getWidth(), getHeight());
            this.LJLJI.draw(canvas);
        }
    }

    public void setNavigationBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C04270Et.LIZIZ(getContext(), i);
        } else {
            drawable = null;
        }
        this.LJLJI = drawable;
        invalidate();
    }

    public void setNavigationBarBackgroundColor(int i) {
        this.LJLJI = new ColorDrawable(i);
        invalidate();
    }

    public void setNavigationBarBackground(Drawable drawable) {
        this.LJLJI = drawable;
        invalidate();
    }

    public C80232VeG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = true;
        this.LJLJJI = new ARunnableS50S0100000_14(this, 26);
        C16360ka.LJIJJ(this, new C80233VeH(this));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.navigationBarColor});
        try {
            this.LJLJI = obtainStyledAttributes.getDrawable(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C16800lI c16800lI = this.LJLIL;
        if (c16800lI != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c16800lI.LIZIZ(), 1073741824);
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    suggestedMinimumWidth = size;
                }
            } else {
                suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
            }
            int suggestedMinimumHeight = getSuggestedMinimumHeight();
            int mode2 = View.MeasureSpec.getMode(makeMeasureSpec);
            int size2 = View.MeasureSpec.getSize(makeMeasureSpec);
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    suggestedMinimumHeight = size2;
                }
            } else {
                suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
            }
            setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
            return;
        }
        int suggestedMinimumWidth2 = getSuggestedMinimumWidth();
        int mode3 = View.MeasureSpec.getMode(i);
        int size3 = View.MeasureSpec.getSize(i);
        if (mode3 != Integer.MIN_VALUE) {
            if (mode3 == 1073741824) {
                suggestedMinimumWidth2 = size3;
            }
        } else {
            suggestedMinimumWidth2 = Math.min(suggestedMinimumWidth2, size3);
        }
        int suggestedMinimumHeight2 = getSuggestedMinimumHeight();
        int mode4 = View.MeasureSpec.getMode(i2);
        int size4 = View.MeasureSpec.getSize(i2);
        if (mode4 != Integer.MIN_VALUE) {
            if (mode4 == 1073741824) {
                suggestedMinimumHeight2 = size4;
            }
        } else {
            suggestedMinimumHeight2 = Math.min(suggestedMinimumHeight2, size4);
        }
        setMeasuredDimension(suggestedMinimumWidth2, suggestedMinimumHeight2);
    }
}