package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DI6 extends AbstractC39455Fe7 {
    public DI6(int i) {
        this.LIZIZ.setColor(i);
        this.LIZJ.LJIIIIZZ(2.0f, 5.0f);
        this.LIZJ.LJII(18.0f, 2.0f);
        this.LIZJ.LJII(34.0f, 5.0f);
        this.LIZJ.LIZ.setFillType(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.STROKE);
        this.LIZIZ.setStrokeWidth(4.0f);
        this.LIZIZ.setStrokeCap(Paint.Cap.ROUND);
        this.LIZIZ.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(36.0f, 7.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
