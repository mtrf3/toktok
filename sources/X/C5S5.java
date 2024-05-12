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
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5S5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5S5 extends ProgressBar {
    public final Paint LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    public final ObjectAnimator getHideAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
        o.LJIIIIZZ(duration, "ofFloat(this, \"alpha\", a…          .setDuration(0)");
        return duration;
    }

    public final ObjectAnimator getShowAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
        o.LJIIIIZZ(duration, "ofFloat(this, \"alpha\", a…        .setDuration(150)");
        return duration;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.save();
        float progress = (int) (this.LJLJI * ((getProgress() * 1.0f) / getMax()));
        if (progress > 0.0f) {
            this.LJLIL.setColor(this.LJLJJI);
            this.LJLIL.setStrokeWidth(this.LJLILLLLZI);
            canvas.drawLine(0.0f, getHeight() / 2, progress, getHeight() / 2, this.LJLIL);
        }
        canvas.restore();
    }

    public final void setReachedBarColor(int i) {
        this.LJLJJI = i;
    }

    public final void setReachedProgressBarHeight(float f) {
        this.LJLILLLLZI = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5S5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
        this.LJLIL = new Paint();
        this.LJLILLLLZI = (int) TypedValue.applyDimension(1, 6, getResources().getDisplayMetrics());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.b7_, R.attr.b7a});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…e.VideoPlayerProgressBar)");
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
    }
}
