package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TDU extends View {
    public Paint LJLIL;
    public Paint LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public final RectF LJLLILLLL;

    public void LIZ() {
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
                return;
            }
            o.LJIJI("bgPaint");
            throw null;
        }
        o.LJIJI("bgPaint");
        throw null;
    }

    public final Paint getBgPaint() {
        Paint paint = this.LJLIL;
        if (paint != null) {
            return paint;
        }
        o.LJIJI("bgPaint");
        throw null;
    }

    public final Paint getProgressPaint() {
        Paint paint = this.LJLILLLLZI;
        if (paint != null) {
            return paint;
        }
        o.LJIJI("progressPaint");
        throw null;
    }

    public final float getBorderRadius() {
        return this.LJLLI;
    }

    public final float getCircularRadius() {
        return this.LJLL;
    }

    public final int getHeight$lib_runtime_release() {
        return this.LJLJJI;
    }

    public final boolean getUseCenter() {
        return this.LJLJLLL;
    }

    public final int getWidth$lib_runtime_release() {
        return this.LJLJI;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.LJLL;
        if (f > 0) {
            RectF rectF = this.LJLLILLLL;
            int i = this.LJLJI;
            rectF.set((i / 2) - f, (this.LJLJJI / 2) - f, (i / 2) + f, (i / 2) + f);
        } else {
            RectF rectF2 = this.LJLLILLLL;
            int i2 = this.LJLJLJ;
            rectF2.set(i2, i2, this.LJLJI - i2, this.LJLJJI - i2);
        }
        RectF rectF3 = this.LJLLILLLL;
        float f2 = this.LJLJL - 90;
        float f3 = ((this.LJLJJL * 1.0f) / this.LJLJJLL) * 360;
        boolean z = this.LJLJLLL;
        Paint paint = this.LJLILLLLZI;
        if (paint != null) {
            canvas.drawArc(rectF3, f2, f3, z, paint);
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

    public final void setBgPaint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LJLIL = paint;
    }

    public final void setBorderRadius(float f) {
        this.LJLLI = f;
    }

    public void setCircleRadius(float f) {
        this.LJLL = f;
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

    public final void setCircularRadius(float f) {
        this.LJLL = f;
    }

    public final void setHeight$lib_runtime_release(int i) {
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

    public final void setProgressPaint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LJLILLLLZI = paint;
    }

    public final void setStartAngle(int i) {
        this.LJLJL = i;
    }

    public final void setUseCenter(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setViewBorderRadius(float f) {
        this.LJLLI = f;
    }

    public final void setWidth$lib_runtime_release(int i) {
        this.LJLJI = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TDU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        this.LJLJJLL = 100;
        this.LJLLILLLL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bla, R.attr.blb, R.attr.blc, R.attr.bld, R.attr.ble, R.attr.blf, R.attr.blg, R.attr.blh, R.attr.bli, R.attr.blj, R.attr.blk, R.attr.bll, R.attr.blm, R.attr.bln, R.attr.blo, R.attr.blp, R.attr.blq, R.attr.blr, R.attr.bls, R.attr.blt, R.attr.blu, R.attr.blv, R.attr.blw, R.attr.blx, R.attr.bly, R.attr.blz, R.attr.bm0});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ToolsStyleView)");
            this.LJLL = obtainStyledAttributes.getDimension(14, 0.0f);
            this.LJLLI = obtainStyledAttributes.getDimension(13, 0.0f);
            obtainStyledAttributes.recycle();
        }
        LIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJI = View.MeasureSpec.getSize(i);
        this.LJLJJI = View.MeasureSpec.getSize(i2);
    }
}
