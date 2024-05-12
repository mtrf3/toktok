package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141485gu extends View {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public int LJLJLJ;
    public final float LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public final Paint LJLLILLLL;
    public final RectF LJLLJ;
    public final RectF LJLLL;

    public final int getAnimDuration() {
        return this.LJLJLJ;
    }

    public final int getBackgroundColor() {
        return this.LJLJI;
    }

    public final float getMaxProgress() {
        return this.LJLJJL;
    }

    public final float getProgress() {
        return this.LJLJL;
    }

    public final int getProgressColor() {
        return this.LJLJJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJLLILLLL.setColor(this.LJLJI);
        this.LJLLJ.set(0.0f, 0.0f, this.LJLL, this.LJLLI);
        RectF rectF = this.LJLLJ;
        float f = this.LJLJLLL;
        canvas.drawRoundRect(rectF, f, f, this.LJLLILLLL);
        this.LJLLILLLL.setColor(this.LJLJJI);
        this.LJLLL.set(0.0f, 0.0f, (this.LJLL * this.LJLJJLL) / this.LJLJJL, this.LJLLI);
        RectF rectF2 = this.LJLLL;
        float f2 = this.LJLJLLL;
        canvas.drawRoundRect(rectF2, f2, f2, this.LJLLILLLL);
    }

    public final void setAnimDuration(int i) {
        this.LJLJLJ = i;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.LJLJI = i;
        invalidate();
    }

    public final void setMaxProgress(float f) {
        this.LJLJJL = f;
        invalidate();
    }

    public final void setProgress(float f) {
        this.LJLJL = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.LJLJJLL, f);
        ofFloat.setDuration(this.LJLJLJ);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 66));
        ofFloat.start();
    }

    public final void setProgressColor(int i) {
        this.LJLJJI = i;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141485gu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        int parseColor = ColorProtector.parseColor("#3F51B5");
        this.LJLIL = parseColor;
        int parseColor2 = ColorProtector.parseColor("#FF4081");
        this.LJLILLLLZI = parseColor2;
        this.LJLJI = parseColor;
        this.LJLJJI = parseColor2;
        this.LJLJJL = 100.0f;
        this.LJLJLJ = 300;
        Integer num = 4;
        o.LJIIIZ(num, "<this>");
        this.LJLJLLL = (Resources.getSystem().getDisplayMetrics().densityDpi / 160) * num.floatValue();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LJLLILLLL = paint;
        this.LJLLJ = new RectF();
        this.LJLLL = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.vz, R.attr.x9, R.attr.b0g, R.attr.b5r, R.attr.b5y, R.attr.b6a});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…le.HorizontalProgressBar)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.LJLJI = obtainStyledAttributes.getColor(index, this.LJLIL);
            } else if (index == 4) {
                this.LJLJJI = obtainStyledAttributes.getColor(index, this.LJLILLLLZI);
            } else if (index == 2) {
                this.LJLJJL = obtainStyledAttributes.getInt(index, 100);
            } else if (index == 3) {
                float f = obtainStyledAttributes.getInt(index, 0);
                this.LJLJL = f;
                float f2 = this.LJLJJL;
                if (f > f2) {
                    this.LJLJL = f2;
                }
                this.LJLJJLL = this.LJLJL;
            } else if (index == 0) {
                this.LJLJLJ = obtainStyledAttributes.getInt(index, 300);
            } else if (index == 5) {
                this.LJLJLLL = obtainStyledAttributes.getFloat(index, this.LJLJLLL);
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        if (C16310kV.LIZLLL(this) != 1) {
            z = false;
        }
        if (mode != 1073741824) {
            size2 = 8;
        }
        this.LJLLI = size2;
        this.LJLL = size;
        setMeasuredDimension(size, size2);
        if (z) {
            setScaleX(-1.0f);
        }
    }
}
