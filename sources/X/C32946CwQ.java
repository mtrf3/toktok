package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32946CwQ extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;

    public C32946CwQ() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.52f, 0.23f);
        this.LIZJ.LJIIJ(0.9f, -0.3f, 1.73f, 1.08f, 2.77f, 2.8f);
        this.LIZJ.LJIIJ(1.16f, 1.9f, 2.57f, 4.24f, 4.62f, 5.29f);
        this.LIZJ.LJIIJ(2.05f, 1.04f, 4.77f, 0.81f, 6.98f, 0.63f);
        this.LIZJ.LJIIJ(2.02f, -0.17f, 3.62f, -0.3f, 3.9f, 0.6f);
        this.LIZJ.LJIIJ(0.3f, 0.9f, -1.07f, 1.72f, -2.8f, 2.77f);
        this.LIZJ.LJIIJ(-1.9f, 1.15f, -4.23f, 2.57f, -5.27f, 4.62f);
        this.LIZJ.LJIIJ(-1.05f, 2.05f, -0.82f, 4.77f, -0.64f, 6.99f);
        this.LIZJ.LJIIJ(0.17f, 2.01f, 0.3f, 3.6f, -0.6f, 3.9f);
        this.LIZJ.LJIIJ(-0.9f, 0.3f, -1.73f, -1.08f, -2.78f, -2.82f);
        this.LIZJ.LJIIJ(-1.15f, -1.9f, -2.56f, -4.22f, -4.61f, -5.26f);
        this.LIZJ.LJIIJ(-2.05f, -1.05f, -4.77f, -0.82f, -6.99f, -0.64f);
        this.LIZJ.LJIIJ(-2.01f, 0.17f, -3.61f, 0.3f, -3.9f, -0.6f);
        this.LIZJ.LJIIJ(-0.3f, -0.9f, 1.08f, -1.73f, 2.82f, -2.78f);
        this.LIZJ.LJIIJ(1.9f, -1.15f, 4.22f, -2.57f, 5.27f, -4.61f);
        this.LIZJ.LJIIJ(1.04f, -2.05f, 0.82f, -4.77f, 0.63f, -6.98f);
        this.LIZJ.LJIIJ(-0.17f, -2.02f, -0.3f, -3.62f, 0.6f, -3.91f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJFF = LIZ;
        DIJ dij = new DIJ();
        this.LJI = dij;
        C32856Cuy.m5(dij);
        C32856Cuy.LJLILLLLZI(dij);
        C32856Cuy.LJII(dij);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        dij.LJIILL(3.0f);
        C32856Cuy.LJ(dij);
        C32856Cuy.rj(dij);
        C32856Cuy.E1(dij);
        C32856Cuy.ro(dij);
        dij.LJIIJ(2.03f, 1.03f, 3.21f, 3.0f, 4.3f, 4.84f);
        dij.LJIIJ(1.6f, 2.69f, 3.04f, 5.09f, 6.72f, 3.9f);
        dij.LJIIJ(3.68f, -1.2f, 3.42f, -3.99f, 3.14f, -7.1f);
        dij.LJIIJ(-0.2f, -2.13f, -0.4f, -4.42f, 0.64f, -6.45f);
        dij.LJIIJ(1.04f, -2.04f, 3.0f, -3.21f, 4.85f, -4.31f);
        dij.LJIIJ(2.68f, -1.6f, 5.08f, -3.04f, 3.89f, -6.71f);
        C32856Cuy.y4(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJII = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(37.0f, 31.0f);
        C32856Cuy.Mm(dij2);
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
    }
}
