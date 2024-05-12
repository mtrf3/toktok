package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TDV extends TDU {
    public Paint LJLLJ;
    public Paint LJLLL;
    public final RectF LJLLLL;

    @Override // X.TDU
    public final void LIZ() {
        super.LIZ();
        setUseCenter(true);
        Paint bgPaint = getBgPaint();
        if (bgPaint != null) {
            bgPaint.setStyle(Paint.Style.FILL);
            setProgressPaint(new Paint(bgPaint));
            getProgressPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        Paint paint = new Paint();
        this.LJLLJ = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LJLLJ;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = this.LJLLJ;
            if (paint3 != null) {
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                Paint paint4 = new Paint();
                this.LJLLL = paint4;
                paint4.setAntiAlias(true);
                Paint paint5 = this.LJLLL;
                if (paint5 != null) {
                    paint5.setStyle(Paint.Style.FILL);
                    Paint paint6 = this.LJLLL;
                    if (paint6 != null) {
                        paint6.setColor(C04330Ez.LIZIZ(getContext(), R.color.ul));
                        return;
                    } else {
                        o.LJIJI("backgroundPaint");
                        throw null;
                    }
                }
                o.LJIJI("backgroundPaint");
                throw null;
            }
            o.LJIJI("borderPaint");
            throw null;
        }
        o.LJIJI("borderPaint");
        throw null;
    }

    @Override // X.TDU, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        setWillNotDraw(false);
        setLayerType(1, null);
        this.LJLLLL.set(0.0f, 0.0f, getWidth$lib_runtime_release(), getHeight$lib_runtime_release());
        RectF rectF = this.LJLLLL;
        float borderRadius = getBorderRadius();
        float borderRadius2 = getBorderRadius();
        Paint paint = this.LJLLL;
        if (paint != null) {
            canvas.drawRoundRect(rectF, borderRadius, borderRadius2, paint);
            float width$lib_runtime_release = getWidth$lib_runtime_release() / 2;
            float height$lib_runtime_release = getHeight$lib_runtime_release() / 2;
            float circularRadius = getCircularRadius();
            Paint paint2 = this.LJLLJ;
            if (paint2 != null) {
                canvas.drawCircle(width$lib_runtime_release, height$lib_runtime_release, circularRadius, paint2);
                super.onDraw(canvas);
                return;
            } else {
                o.LJIJI("borderPaint");
                throw null;
            }
        }
        o.LJIJI("backgroundPaint");
        throw null;
    }

    @Override // X.TDU
    public void setCircleRadius(float f) {
        super.setCircleRadius(f);
        Paint paint = this.LJLLJ;
        if (paint != null) {
            paint.setStrokeWidth(getCircularRadius() / 4);
        } else {
            o.LJIJI("borderPaint");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TDV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        this.LJLLLL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
