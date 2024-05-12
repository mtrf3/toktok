package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.5Fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131825Fi extends FrameLayout {
    public final boolean LJLIL;
    public Paint LJLILLLLZI;
    public boolean LJLJI;
    public float[] LJLJJI;
    public final RectF LJLJJL;
    public final Path LJLJJLL;

    public final void LIZ(Canvas canvas) {
        this.LJLJJL.set(0.0f, 0.0f, getWidth(), getHeight());
        this.LJLJJLL.reset();
        Path path = this.LJLJJLL;
        RectF rectF = this.LJLJJL;
        float[] fArr = this.LJLJJI;
        if (fArr != null) {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(this.LJLJJLL);
        } else {
            o.LJIJI("radiusArray");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        o.LJIIJ(canvas, "canvas");
        LIZ(canvas);
        super.dispatchDraw(canvas);
        if (this.LJLJI && this.LJLIL && (paint = this.LJLILLLLZI) != null) {
            this.LJLJJL.set(0.0f, 0.0f, getWidth(), getHeight());
            this.LJLJJLL.reset();
            Path path = this.LJLJJLL;
            RectF rectF = this.LJLJJL;
            float[] fArr = this.LJLJJI;
            if (fArr != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(this.LJLJJLL, paint);
            } else {
                o.LJIJI("radiusArray");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIJ(canvas, "canvas");
        LIZ(canvas);
        super.draw(canvas);
    }

    public final void setRadius(float f) {
        this.LJLJJI = new float[]{f, f, f, f, f, f, f, f};
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131825Fi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIJ(context, "context");
        this.LJLIL = true;
        this.LJLJJL = new RectF();
        this.LJLJJLL = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0);
        this.LJLILLLLZI = paint;
        this.LJLJI = false;
        invalidate();
    }
}
