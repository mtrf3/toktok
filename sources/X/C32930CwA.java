package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32930CwA extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32930CwA() {
        this.LIZJ.LJIIIIZZ(9.5f, 11.0f);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, false, 4.0f, 16.5f);
        C32856Cuy.LJLJJI(this.LIZJ);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, false, 9.5f, 37.0f);
        C32856Cuy.LJIJ(this.LIZJ);
        C32856Cuy.L0(this.LIZJ);
        C32856Cuy.LJJLIL(this.LIZJ);
        this.LIZJ.LJIIL(4.88f, 3.66f);
        this.LIZJ.LIZJ(3.2f, 3.2f, false, false, 44.0f, 30.6f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(17.4f);
        this.LIZJ.LJIIIZ(3.2f, 3.2f, false, false, -5.12f, -2.56f);
        this.LIZJ.LJII(34.0f, 18.5f);
        C32856Cuy.LJJLIL(this.LIZJ);
        C32856Cuy.M0(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", -19.0f);
        this.LIZJ.LJIILIIL(23.44f, 11.94f);
        this.LIZJ.LJIIJ(0.17f, -0.06f, 0.33f, -0.14f, 0.47f, -0.25f);
        this.LIZJ.LJII(41.0f, 17.0f);
        C32856Cuy.LJLJI(this.LIZJ);
        this.LIZJ.LJIIL(-7.59f, -5.69f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -2.41f, 1.2f);
        this.LIZJ.LJIILL(4.99f);
        C32856Cuy.eg(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-19.0f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 7.0f, 31.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-15.0f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 9.5f, 14.0f);
        C32856Cuy.LJIJ(this.LIZJ);
        C32856Cuy.gg(this.LIZJ);
        this.LIZJ.LJIILL(4.98f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 1.94f, 1.46f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 24.97f);
        dij.LJIIJ(0.75f, -0.43f, 0.75f, -1.5f, 0.0f, -1.94f);
        dij.LJIIL(-6.75f, -3.88f);
        dij.LJIIJ(-0.75f, -0.43f, -1.69f, 0.1f, -1.69f, 0.97f);
        dij.LJIILL(7.76f);
        dij.LJIIJ(0.0f, 0.86f, 0.94f, 1.4f, 1.69f, 0.97f);
        dij.LJII(24.0f, 24.97f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
