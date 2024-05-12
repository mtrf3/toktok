package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D50 extends AbstractC39455Fe7 {
    public D50() {
        this.LIZJ.LJIIIIZZ(37.68f, 7.0f);
        C32856Cuy.G7(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(27.36f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-26.46f, 9.9f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, -2.31f, 0.88f);
        this.LIZJ.LJIIL(-2.5f, 5.5f);
        this.LIZJ.LJIIJ(-0.21f, 0.46f, -0.21f, 0.98f, 0.0f, 1.44f);
        this.LIZJ.LJIIL(2.5f, 5.5f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, 3.18f, -1.44f);
        this.LIZJ.LJII(9.92f, 24.0f);
        this.LIZJ.LJIIL(2.17f, -4.78f);
        this.LIZJ.LJIIJ(0.4f, -0.88f, 0.01f, -1.91f, -0.87f, -2.31f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(25.56f, 0.0f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, -0.87f, 2.32f);
        this.LIZJ.LJII(38.08f, 24.0f);
        this.LIZJ.LJIIL(-2.17f, 4.78f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, true, false, 3.18f, 1.44f);
        this.LIZJ.LJIIL(2.5f, -5.5f);
        this.LIZJ.LJIIJ(0.21f, -0.46f, 0.21f, -0.98f, 0.0f, -1.44f);
        this.LIZJ.LJIIL(-2.5f, -5.5f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, -2.31f, -0.87f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.5f, 11.0f);
        C32856Cuy.Xj(this.LIZJ);
        C32856Cuy.LJLL(this.LIZJ);
        C32856Cuy.Ej(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(13.0f);
        C32856Cuy.Bl(this.LIZJ);
        this.LIZJ.LJIILL(-23.0f);
        C32856Cuy.m8(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-13.0f);
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
