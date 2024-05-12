package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5EP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EP extends View {
    public Paint LJLIL;
    public Paint LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final float LJLJLLL;

    public final int getHeight$tools_avdmtview_release() {
        return this.LJLJJI;
    }

    public final int getWidth$tools_avdmtview_release() {
        return this.LJLJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        int i = this.LJLJLJ;
        RectF rectF = new RectF(i, i, this.LJLJI - i, this.LJLJJI - i);
        if (this.LJLJLLL > 0.0f) {
            int i2 = this.LJLJI;
            float f = this.LJLJLLL;
            rectF = new RectF((i2 / 2) - f, (this.LJLJJI / 2) - f, (i2 / 2) + f, (i2 / 2) + f);
        }
        float f2 = this.LJLJL - 90;
        float f3 = ((this.LJLJJL * 1.0f) / this.LJLJJLL) * 360;
        Paint paint = this.LJLILLLLZI;
        if (paint != null) {
            canvas.drawArc(rectF, f2, f3, false, paint);
        } else {
            o.LJIJI("progressPaint");
            throw null;
        }
    }

    public final void setBgCircleColor(int i) {
        Paint paint = this.LJLIL;
        if (paint != null) {
            paint.setColor(i);
        } else {
            o.LJIJI("bgPaint");
            throw null;
        }
    }

    public final void setBgCircleWidth(int i) {
        this.LJLJLJ = i / 2;
        Paint paint = this.LJLIL;
        if (paint != null) {
            paint.setStrokeWidth(i);
        } else {
            o.LJIJI("bgPaint");
            throw null;
        }
    }

    public final void setCircleWidth(int i) {
        Paint paint = this.LJLILLLLZI;
        if (paint != null) {
            paint.setStrokeWidth(i);
        } else {
            o.LJIJI("progressPaint");
            throw null;
        }
    }

    public final void setHeight$tools_avdmtview_release(int i) {
        this.LJLJJI = i;
    }

    public final void setMaxProgress(int i) {
        this.LJLJJLL = i;
    }

    public final void setProgress(int i) {
        this.LJLJJL = i;
        invalidate();
    }

    public final void setProgressColor(int i) {
        Paint paint = this.LJLILLLLZI;
        if (paint != null) {
            paint.setColor(i);
        } else {
            o.LJIJI("progressPaint");
            throw null;
        }
    }

    public final void setStartAngle(int i) {
        this.LJLJL = i;
    }

    public final void setWidth$tools_avdmtview_release(int i) {
        this.LJLJI = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5EP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJJLL = 100;
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LJLIL;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = this.LJLIL;
            if (paint3 != null) {
                Paint paint4 = new Paint(paint3);
                this.LJLILLLLZI = paint4;
                paint4.setStrokeCap(Paint.Cap.ROUND);
                if (attributeSet != null) {
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ay1});
                    o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ble.AVCircleProgressView)");
                    this.LJLJLLL = obtainStyledAttributes.getDimension(0, 0.0f);
                    obtainStyledAttributes.recycle();
                    return;
                }
                return;
            }
            o.LJIJI("bgPaint");
            throw null;
        }
        o.LJIJI("bgPaint");
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJI = View.MeasureSpec.getSize(i);
        this.LJLJJI = View.MeasureSpec.getSize(i2);
    }
}
