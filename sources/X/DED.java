package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DED extends AbstractC39455Fe7 {
    public DED() {
        C32856Cuy.Lk(this.LIZJ);
        this.LIZJ.LJIIJ(4.11f, 0.0f, 7.6f, 1.12f, 10.32f, 3.1f);
        this.LIZJ.LJIIL(-2.92f, 2.83f);
        this.LIZJ.LJIIIZ(13.7f, 13.7f, false, false, -7.4f, -1.93f);
        C32856Cuy.ye(this.LIZJ);
        this.LIZJ.LJIIIIZZ(45.83f, 29.53f);
        this.LIZJ.LJIIL(-1.69f, -1.06f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.38f, 0.32f);
        this.LIZJ.LJIIL(-8.04f, 12.87f);
        this.LIZJ.LJIIL(-4.57f, -5.22f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, -0.1f);
        this.LIZJ.LJIIL(-1.51f, 1.32f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -0.09f, 1.41f);
        this.LIZJ.LJIIL(6.34f, 7.25f);
        this.LIZJ.LJIIIZ(1.99f, 1.99f, false, false, 3.2f, -0.26f);
        this.LIZJ.LJIIL(9.47f, -15.15f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, -0.32f, -1.38f);
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
