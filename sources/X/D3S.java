package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3S extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D3S() {
        this.LIZJ.LIZIZ(new RectF(4.0f, 4.1f, 44.0f, 44.1f), 8.0f, 8.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16670246);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(19.02f, 16.58f);
        dij.LJIIJ(0.56f, -0.31f, 1.24f, -0.3f, 1.78f, 0.03f);
        dij.LJIIL(10.6f, 6.47f);
        dij.LJIIIZ(1.76f, 1.76f, false, true, 0.0f, 3.01f);
        dij.LJIIL(-10.6f, 6.47f);
        dij.LJIIIZ(1.76f, 1.76f, false, true, -2.68f, -1.5f);
        dij.LJIJ(18.12f);
        dij.LJIIJ(0.0f, -0.64f, 0.34f, -1.23f, 0.9f, -1.54f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
