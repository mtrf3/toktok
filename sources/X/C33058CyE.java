package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33058CyE extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33058CyE() {
        this.LIZJ.LJIIIIZZ(35.9f, 7.0f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, true, 37.0f, 8.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(13.38f);
        this.LIZJ.LJIIJ(-0.65f, -0.17f, -1.32f, -0.29f, -2.0f, -0.34f);
        this.LIZJ.LJIJ(9.1f);
        this.LIZJ.LJIIL(-18.0f, 1.93f);
        C32856Cuy.I9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(6.0f, 6.0f, true, true, -6.0f, -6.0f);
        C32856Cuy.C0(this.LIZJ);
        this.LIZJ.LJIJ(10.14f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.9f, -1.0f);
        this.LIZJ.LJIIL(20.0f, -2.13f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.0f, 31.0f);
        C32856Cuy.LJFF(this.LIZJ);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, true, false, 4.0f, 4.0f);
        C32856Cuy.f1(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.0f, 26.44f);
        dij.LJIIIZ(6.26f, 6.26f, false, false, -6.26f, 6.26f);
        dij.LJIIJJI(-1.98f);
        dij.LJIIIZ(8.24f, 8.24f, false, true, 12.67f, -6.95f);
        dij.LJIIJ(0.24f, 0.15f, 0.28f, 0.46f, 0.12f, 0.68f);
        dij.LJIIL(-0.58f, 0.8f);
        dij.LJIIIZ(0.53f, 0.53f, false, true, -0.7f, 0.13f);
        dij.LJIIIZ(6.23f, 6.23f, false, false, -3.27f, -0.92f);
        dij.LIZLLL();
        dij.LJIIIIZZ(44.07f, 32.7f);
        dij.LJIIJJI(-1.83f);
        dij.LJIIIZ(8.24f, 8.24f, false, true, -12.67f, 6.95f);
        dij.LJIIIZ(0.48f, 0.48f, false, true, -0.12f, -0.69f);
        dij.LJIIL(0.58f, -0.8f);
        dij.LJIIIZ(0.53f, 0.53f, false, true, 0.7f, -0.12f);
        dij.LJIIIZ(6.26f, 6.26f, false, false, 9.52f, -5.34f);
        dij.LJIIJJI(-1.62f);
        dij.LJIIJ(-0.23f, 0.0f, -0.36f, -0.26f, -0.23f, -0.45f);
        dij.LJIIL(2.64f, -3.73f);
        dij.LJIIJ(0.16f, -0.2f, 0.46f, -0.2f, 0.61f, 0.0f);
        dij.LJIIL(2.65f, 3.73f);
        dij.LJIIJ(0.13f, 0.19f, 0.0f, 0.45f, -0.23f, 0.45f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIILIIL(23.8f, 33.15f);
        dij2.LJIIL(2.65f, 3.73f);
        dij2.LJIIJ(0.15f, 0.2f, 0.45f, 0.2f, 0.6f, 0.0f);
        dij2.LJIIL(2.65f, -3.73f);
        dij2.LJIIJ(0.13f, -0.19f, 0.0f, -0.45f, -0.23f, -0.45f);
        dij2.LJIIJJI(-5.44f);
        dij2.LJIIJ(-0.23f, 0.0f, -0.36f, 0.26f, -0.23f, 0.45f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
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
