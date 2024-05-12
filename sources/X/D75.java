package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D75 extends AbstractC39455Fe7 {
    public D75() {
        this.LIZJ.LJIIIIZZ(37.33f, 8.75f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.42f, 0.28f, 0.67f, 0.75f, 0.67f, 1.25f);
        C32856Cuy.LJLLJ(this.LIZJ);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -2.04f, 1.4f);
        this.LIZJ.LJIIL(-6.02f, -2.32f);
        this.LIZJ.LJIIIZ(7.49f, 7.49f, false, true, -13.42f, -5.16f);
        this.LIZJ.LJII(12.0f, 28.18f);
        C32856Cuy.B9(this.LIZJ);
        C32856Cuy.Jc(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(17.5f);
        C32856Cuy.LLJJ(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(1.24f);
        this.LIZJ.LJII(35.92f, 8.62f);
        this.LIZJ.LJIIJ(0.46f, -0.2f, 0.99f, -0.15f, 1.4f, 0.13f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.0f, 21.99f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(2.98f);
        this.LIZJ.LJIIL(23.0f, 8.85f);
        this.LIZJ.LJIJ(12.26f);
        this.LIZJ.LJII(12.0f, 22.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.54f, 9.1f);
        this.LIZJ.LJIIIZ(4.5f, 4.5f, false, false, 7.38f, 2.83f);
        this.LIZJ.LJIIL(-7.38f, -2.84f);
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
