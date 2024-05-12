package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE8 extends AbstractC39455Fe7 {
    public DE8() {
        this.LIZJ.LJIIIIZZ(21.86f, 12.83f);
        this.LIZJ.LJIIIZ(9.16f, 9.16f, false, false, -9.05f, 9.26f);
        this.LIZJ.LJIIJ(0.0f, 5.16f, 4.1f, 9.27f, 9.05f, 9.27f);
        this.LIZJ.LJIIJ(2.4f, 0.0f, 4.58f, -0.95f, 6.2f, -2.52f);
        this.LIZJ.LJIIIZ(9.33f, 9.33f, false, false, 2.86f, -6.75f);
        this.LIZJ.LJIIJ(0.0f, -5.15f, -4.1f, -9.26f, -9.06f, -9.26f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.31f, 22.09f);
        this.LIZJ.LJIIJ(0.0f, -7.56f, 6.03f, -13.76f, 13.55f, -13.76f);
        this.LIZJ.LJIIJ(7.53f, 0.0f, 13.56f, 6.2f, 13.56f, 13.76f);
        this.LIZJ.LJIIJ(0.0f, 3.1f, -1.0f, 5.97f, -2.71f, 8.27f);
        this.LIZJ.LJIIL(6.82f, 6.82f);
        C32856Cuy.wk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.77f, 1.77f);
        C32856Cuy.nk(this.LIZJ);
        this.LIZJ.LJIIL(-6.88f, -6.88f);
        this.LIZJ.LJIIIZ(13.36f, 13.36f, false, true, -7.6f, 2.37f);
        this.LIZJ.LJIIJ(-7.53f, 0.0f, -13.56f, -6.2f, -13.56f, -13.77f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
