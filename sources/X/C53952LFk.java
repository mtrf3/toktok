package X;

import Y.AUListenerS97S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* renamed from: X.LFk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53952LFk extends TextView {
    public long LJLIL;
    public Paint LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public RectF LJLJJL;
    public ValueAnimator LJLJJLL;
    public double LJLJL;

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.LJLJJLL;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLJJLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.LJLJJLL = null;
        }
    }

    public C53952LFk(Context context) {
        super(context);
        int parseColor = ColorProtector.parseColor("#979797");
        this.LJLIL = 0L;
        this.LJLJJI = -1;
        this.LJLJL = 1.0d;
        if (this.LJLJI == 0) {
            this.LJLJI = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        }
        Paint paint = new Paint();
        this.LJLILLLLZI = paint;
        paint.setColor(this.LJLJJI);
        this.LJLILLLLZI.setStyle(Paint.Style.STROKE);
        this.LJLILLLLZI.setStrokeWidth(this.LJLJI);
        this.LJLILLLLZI.setAntiAlias(true);
        this.LJLILLLLZI.setDither(true);
        setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setShape(1);
        setBackground(gradientDrawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.LJLJJL;
        if (rectF != null) {
            canvas.drawArc(rectF, -90.0f, (float) (this.LJLJL * 360.0d), false, this.LJLILLLLZI);
        }
    }

    public void setBorderColor(int i) {
        this.LJLJJI = i;
        this.LJLILLLLZI.setColor(i);
    }

    public void setBorderSize(int i) {
        int max = Math.max(i, 0);
        this.LJLJI = max;
        this.LJLILLLLZI.setStrokeWidth(max);
    }

    public void setDuration(long j) {
        long max = Math.max(0L, j);
        this.LJLIL = max;
        if (max == 0) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat((float) max, 0.0f).setDuration(this.LJLIL);
        this.LJLJJLL = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.LJLJJLL.addUpdateListener(new AUListenerS97S0100000_9(this, 37));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f = this.LJLJI / 2;
            this.LJLJJL = new RectF(f, f, getMeasuredWidth() - (this.LJLJI / 2), getMeasuredHeight() - (this.LJLJI / 2));
        }
    }
}
