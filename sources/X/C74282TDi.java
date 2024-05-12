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

/* renamed from: X.TDi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74282TDi extends View {
    public Paint LJLIL;
    public Paint LJLILLLLZI;
    public Paint LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public final RectF LJLLJ;

    public void LIZ() {
        setBgPaint(new Paint());
        getBgPaint().setAntiAlias(true);
        getBgPaint().setStyle(Paint.Style.STROKE);
        setProgressPaint(new Paint(getBgPaint()));
        getProgressPaint().setStrokeCap(Paint.Cap.ROUND);
        setBorderPaint(new Paint());
    }

    public final Paint getBgPaint() {
        Paint paint = this.LJLIL;
        if (paint != null) {
            return paint;
        }
        o.LJIJI("bgPaint");
        throw null;
    }

    public final Paint getBorderPaint() {
        Paint paint = this.LJLJI;
        if (paint != null) {
            return paint;
        }
        o.LJIJI("borderPaint");
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
        return this.LJLLILLLL;
    }

    public final float getCircleRadius() {
        return this.LJLLI;
    }

    public final int getHeight$liveui_release() {
        return this.LJLJJL;
    }

    public final boolean getUseCenter() {
        return this.LJLL;
    }

    public final int getWidth$liveui_release() {
        return this.LJLJJI;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.LJLLI;
        if (f > 0.0f) {
            RectF rectF = this.LJLLJ;
            int i = this.LJLJJI;
            rectF.set((i / 2) - f, (this.LJLJJL / 2) - f, (i / 2) + f, (i / 2) + f);
        } else {
            RectF rectF2 = this.LJLLJ;
            int i2 = this.LJLJLLL;
            rectF2.set(i2, i2, this.LJLJJI - i2, this.LJLJJL - i2);
        }
        canvas.drawArc(this.LJLLJ, this.LJLJLJ - 90, ((this.LJLJJLL * 1.0f) / this.LJLJL) * 360, this.LJLL, getProgressPaint());
    }

    public final void setBgCircleColor(int i) {
        getBgPaint().setColor(i);
    }

    public final void setBgCircleWidth(int i) {
        this.LJLJLLL = i / 2;
        getBgPaint().setStrokeWidth(i);
    }

    public final void setBgPaint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LJLIL = paint;
    }

    public final void setBorderPaint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LJLJI = paint;
    }

    public final void setBorderRadius(float f) {
        this.LJLLILLLL = f;
    }

    public void setCircleRadius(int i) {
        this.LJLLI = i;
    }

    public final void setCircleWidth(int i) {
        getProgressPaint().setStrokeWidth(i);
    }

    public final void setHeight$liveui_release(int i) {
        this.LJLJJL = i;
    }

    public final void setMaxProgress(int i) {
        this.LJLJL = i;
    }

    public final void setProgress(int i) {
        this.LJLJJLL = i;
        invalidate();
    }

    public final void setProgressColor(int i) {
        getProgressPaint().setColor(i);
    }

    public final void setProgressPaint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LJLILLLLZI = paint;
    }

    public final void setStartAngle(int i) {
        this.LJLJLJ = i;
    }

    public void setStrokeWidth(int i) {
        getBorderPaint().setStrokeWidth(i);
    }

    public final void setUseCenter(boolean z) {
        this.LJLL = z;
    }

    public final void setWidth$liveui_release(int i) {
        this.LJLJJI = i;
    }

    public final void setCircleRadius(float f) {
        this.LJLLI = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74282TDi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJL = 100;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b5r, R.attr.bln, R.attr.blo});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.CircleProgressView)");
            this.LJLLI = obtainStyledAttributes.getDimension(2, 0.0f);
            this.LJLLILLLL = obtainStyledAttributes.getDimension(1, 0.0f);
            this.LJLJJLL = obtainStyledAttributes.getInteger(0, 0);
            obtainStyledAttributes.recycle();
        }
        LIZ();
        this.LJLLJ = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJJI = View.MeasureSpec.getSize(i);
        this.LJLJJL = View.MeasureSpec.getSize(i2);
    }
}
