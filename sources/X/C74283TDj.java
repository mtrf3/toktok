package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.TDj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74283TDj extends C74282TDi {
    public Paint LJLLL;
    public final RectF LJLLLL;

    @Override // X.C74282TDi
    public final void LIZ() {
        super.LIZ();
        setUseCenter(true);
        Paint bgPaint = getBgPaint();
        bgPaint.setStyle(Paint.Style.FILL);
        setProgressPaint(new Paint(bgPaint));
        getProgressPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        getBorderPaint().setAntiAlias(true);
        getBorderPaint().setStyle(Paint.Style.STROKE);
        getBorderPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint = new Paint();
        this.LJLLL = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LJLLL;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
            Paint paint3 = this.LJLLL;
            if (paint3 != null) {
                paint3.setColor(C04330Ez.LIZIZ(getContext(), R.color.a06));
                return;
            } else {
                o.LJIJI("backgroundPaint");
                throw null;
            }
        }
        o.LJIJI("backgroundPaint");
        throw null;
    }

    @Override // X.C74282TDi, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        setWillNotDraw(false);
        setLayerType(1, null);
        this.LJLLLL.set(0.0f, 0.0f, getWidth$liveui_release(), getHeight$liveui_release());
        RectF rectF = this.LJLLLL;
        float borderRadius = getBorderRadius();
        float borderRadius2 = getBorderRadius();
        Paint paint = this.LJLLL;
        if (paint != null) {
            canvas.drawRoundRect(rectF, borderRadius, borderRadius2, paint);
            canvas.drawCircle(getWidth$liveui_release() / 2, getHeight$liveui_release() / 2, getCircleRadius(), getBorderPaint());
            super.onDraw(canvas);
            return;
        }
        o.LJIJI("backgroundPaint");
        throw null;
    }

    @Override // X.C74282TDi
    public void setCircleRadius(int i) {
        super.setCircleRadius(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74283TDj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLLLL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
