package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDY extends AbstractC39455Fe7 {
    public DDY() {
        this.LIZJ.LJIIIIZZ(21.34f, 13.58f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.03f, -0.71f);
        this.LIZJ.LJIIL(4.2f, -3.79f);
        this.LIZJ.LIZJ(15.0f, 15.0f, true, false, 38.99f, 24.5f);
        this.LIZJ.LJIIJ(0.02f, -0.28f, 0.24f, -0.5f, 0.52f, -0.5f);
        C32856Cuy.o4(this.LIZJ);
        this.LIZJ.LIZJ(17.0f, 17.0f, true, true, 25.56f, 7.07f);
        this.LIZJ.LJII(21.89f, 3.0f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.04f, -0.71f);
        this.LIZJ.LJIIL(0.74f, -0.67f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.7f, 0.04f);
        this.LIZJ.LJIIL(5.7f, 6.31f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.04f, 0.7f);
        this.LIZJ.LJIIL(-6.32f, 5.7f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.7f, -0.04f);
        this.LIZJ.LJIIL(-0.67f, -0.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
