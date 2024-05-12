package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33204D1k extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33204D1k() {
        this.LIZJ.LJIIIIZZ(11.36f, 5.96f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.13f, 1.41f);
        this.LIZJ.LJII(17.0f, 14.24f);
        C32856Cuy.i1(this.LIZJ);
        this.LIZJ.LJIIL(12.52f, 14.93f);
        this.LIZJ.LJIIL(1.89f, 2.23f);
        this.LIZJ.LJIIL(2.27f, 2.72f);
        this.LIZJ.LJIIL(3.6f, 4.3f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.42f, 0.12f);
        this.LIZJ.LJIIL(1.18f, -1.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.12f, -1.4f);
        this.LIZJ.LJIIL(-4.08f, -4.88f);
        this.LIZJ.LJIIJ(1.3f, -2.1f, 2.08f, -4.49f, 2.08f, -6.86f);
        C32856Cuy.Qm(this.LIZJ);
        this.LIZJ.LJIIJ(-0.49f, 0.0f, -0.88f, 0.4f, -0.88f, 0.87f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(3.04f);
        this.LIZJ.LJIIJ(0.0f, 1.34f, -0.36f, 2.7f, -1.0f, 4.0f);
        this.LIZJ.LJIIL(-2.52f, -3.02f);
        this.LIZJ.LJIIL(0.02f, -0.52f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(13.5f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, -13.01f, -3.6f);
        this.LIZJ.LJIIL(-4.04f, -4.8f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.4f, -0.13f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-1.2f, 1.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.0f, 24.87f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-5.1f);
        this.LIZJ.LJIIL(9.7f, 11.56f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, true, -9.7f, -6.46f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 34.94f);
        dij.LJIIJ(1.6f, 0.0f, 3.2f, -0.5f, 4.63f, -1.32f);
        dij.LJIIL(2.3f, 2.75f);
        dij.LJIIIZ(12.72f, 12.72f, false, true, -5.18f, 1.95f);
        dij.LJIILL(3.62f);
        dij.LJIIJ(0.0f, 0.48f, -0.4f, 0.87f, -0.88f, 0.87f);
        dij.LJIIJJI(-1.75f);
        dij.LJIIIZ(0.88f, 0.88f, false, true, -0.87f, -0.87f);
        dij.LJIILL(-3.62f);
        dij.LJ(15.87f, 37.5f, 10.0f, 30.91f, 10.0f, 24.42f);
        dij.LJIILL(-3.05f);
        dij.LJIIJ(0.0f, -0.48f, 0.4f, -0.87f, 0.88f, -0.87f);
        dij.LJIIJJI(1.74f);
        dij.LJIIJ(0.49f, 0.0f, 0.88f, 0.4f, 0.88f, 0.87f);
        dij.LJIILL(3.04f);
        dij.LJIIJ(0.0f, 5.03f, 5.12f, 10.53f, 10.5f, 10.53f);
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
