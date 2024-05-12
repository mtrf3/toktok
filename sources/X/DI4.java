package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DI4 extends AbstractC39455Fe7 {
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 24;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 24;
    }

    public DI4() {
        this.LIZIZ.setStyle(Paint.Style.STROKE);
        this.LIZIZ.setStrokeWidth(1.5f);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(24.0f, 24.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
