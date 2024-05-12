package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33179D0l extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33179D0l() {
        this.LIZJ.LJIIIIZZ(42.45f, 1.06f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -1.83f, 1.47f);
        this.LIZJ.LJIILL(20.3f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 1.52f, 1.5f);
        this.LIZJ.LJIIJJI(18.79f);
        this.LIZJ.LJIILL(43.63f);
        this.LIZJ.LJI(11.24f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(4.04f);
        this.LIZJ.LJIIJJI(24.93f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, true, false, 0.0f, -3.0f);
        this.LIZJ.LJI(9.74f);
        this.LIZJ.LJIIJ(-0.84f, 0.0f, -1.51f, 0.66f, -1.51f, 1.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(66.93f);
        C32856Cuy.Ej(this.LIZJ);
        this.LIZJ.LJIIJJI(52.7f);
        this.LIZJ.LJIIJ(0.83f, 0.0f, 1.5f, -0.67f, 1.51f, -1.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(22.83f);
        this.LIZJ.LJIIJ(0.0f, -0.46f, -0.2f, -0.87f, -0.53f, -1.14f);
        this.LIZJ.LJII(43.28f, 1.56f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -0.83f, -0.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.2f, 5.12f);
        this.LIZJ.LJIIL(15.14f, 15.14f);
        this.LIZJ.LJI(43.65f);
        this.LIZJ.LJIJ(6.18f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(47.3f, 58.82f);
        dij.LJIIJ(-0.42f, 0.0f, -0.84f, -0.18f, -1.14f, -0.53f);
        dij.LJIIIZ(13.22f, 13.22f, false, false, -20.15f, 0.0f);
        dij.LJIIIZ(1.52f, 1.52f, false, true, -2.13f, 0.18f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, -0.17f, -2.13f);
        dij.LJIIIZ(16.21f, 16.21f, false, true, 24.74f, 0.0f);
        dij.LJIIIZ(1.51f, 1.51f, false, true, -1.14f, 2.48f);
        dij.LIZLLL();
        dij.LJIIIIZZ(25.05f, 45.8f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, -1.51f, -1.51f);
        dij.LJIJ(39.7f);
        dij.LJIIIZ(1.5f, 1.5f, true, true, 3.0f, 0.0f);
        dij.LJIILL(4.58f);
        dij.LJIIJ(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        dij.LIZLLL();
        dij.LJIIIIZZ(45.61f, 44.29f);
        dij.LJIIIZ(1.5f, 1.5f, true, false, 3.0f, 0.0f);
        dij.LJIJ(39.7f);
        C32856Cuy.K5(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
