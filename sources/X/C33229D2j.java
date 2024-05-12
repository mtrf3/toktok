package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33229D2j extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33229D2j() {
        this.LIZJ.LJIIIIZZ(27.83f, 35.92f);
        this.LIZJ.LJ(29.13f, 32.97f, 30.0f, 28.76f, 30.0f, 24.0f);
        this.LIZJ.LJIILJJIL(-0.86f, -8.97f, -2.17f, -11.92f, true);
        this.LIZJ.LJIIIZ(10.16f, 10.16f, false, false, -2.1f, -3.22f);
        this.LIZJ.LJ(25.04f, 8.2f, 24.46f, 8.0f, 24.0f, 8.0f);
        this.LIZJ.LJIIJ(-0.45f, 0.0f, -1.04f, 0.2f, -1.74f, 0.86f);
        this.LIZJ.LJIIJ(-0.7f, 0.68f, -1.43f, 1.75f, -2.09f, 3.22f);
        this.LIZJ.LJ(18.87f, 15.03f, 18.0f, 19.24f, 18.0f, 24.0f);
        this.LIZJ.LJIILJJIL(0.86f, 8.97f, 2.17f, 11.92f, true);
        this.LIZJ.LJIIIZ(10.16f, 10.16f, false, false, 2.1f, 3.22f);
        this.LIZJ.LJIIJ(0.7f, 0.66f, 1.28f, 0.86f, 1.73f, 0.86f);
        this.LIZJ.LJIIJ(0.45f, 0.0f, 1.04f, -0.2f, 1.74f, -0.86f);
        this.LIZJ.LJIIJ(0.7f, -0.68f, 1.43f, -1.75f, 2.09f, -3.22f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 42.0f);
        this.LIZJ.LJIIJ(4.42f, 0.0f, 8.0f, -8.06f, 8.0f, -18.0f);
        this.LIZJ.LJIILLIIL(28.42f, 6.0f, 24.0f, 6.0f, true);
        this.LIZJ.LJIILJJIL(-8.0f, 8.06f, -8.0f, 18.0f, true);
        this.LIZJ.LJIILJJIL(3.58f, 18.0f, 8.0f, 18.0f, true);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Se(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(8.0f, 18.0f);
        C32856Cuy.ea(dij2);
        dij2.LJIIIIZZ(8.0f, 29.0f);
        C32856Cuy.ea(dij2);
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
