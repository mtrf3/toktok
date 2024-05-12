package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5S7, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5S7 extends ProgressBar {
    public final Paint LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (int) (this.LJLJI * ((getProgress() * 1.0f) / getMax()));
        if (progress > 0.0f) {
            this.LJLIL.setColor(this.LJLJJI);
            this.LJLIL.setStrokeWidth(this.LJLILLLLZI);
            float height = getHeight() / 2.0f;
            if (this.LJLJJL) {
                int i = this.LJLJI;
                canvas.drawLine(i, height, i - progress, height, this.LJLIL);
            } else {
                canvas.drawLine(0.0f, height, progress, height, this.LJLIL);
            }
        }
        canvas.restore();
    }

    public void setReachedBarColor(int i) {
        this.LJLJJI = i;
    }

    public void setReachedProgressBarHeight(float f) {
        this.LJLILLLLZI = f;
    }

    public C5S7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new Paint();
        this.LJLILLLLZI = (int) TypedValue.applyDimension(1, 6, getResources().getDisplayMetrics());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.b7_, R.attr.b7a});
        this.LJLJJI = obtainStyledAttributes.getColor(0, -261935);
        this.LJLILLLLZI = obtainStyledAttributes.getDimension(1, this.LJLILLLLZI);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            int max = (int) (Math.max(this.LJLILLLLZI, Math.abs(this.LJLIL.descent() - this.LJLIL.ascent())) + getPaddingBottom() + getPaddingTop());
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(max, size2);
            } else {
                size2 = max;
            }
        }
        setMeasuredDimension(size, size2);
        this.LJLJI = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
        boolean z = true;
        if (C16310kV.LIZLLL(this) != 1) {
            z = false;
        }
        this.LJLJJL = z;
    }
}
