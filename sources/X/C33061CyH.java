package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33061CyH extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33061CyH() {
        this.LIZJ.LJIIIIZZ(21.3f, 19.7f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJIIL(-7.3f, -7.29f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, -2.82f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(7.3f, -7.3f);
        C32856Cuy.oo(this.LIZJ);
        this.LIZJ.LJIIL(-3.95f, 3.95f);
        this.LIZJ.LJIIJJI(12.49f);
        this.LIZJ.LJIIJ(1.62f, 0.0f, 2.65f, 0.0f, 3.54f, 0.12f);
        this.LIZJ.LJIIIZ(13.0f, 13.0f, false, true, 11.09f, 11.1f);
        this.LIZJ.LJIIJ(0.12f, 0.88f, 0.12f, 1.9f, 0.12f, 3.53f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(1.2f);
        this.LIZJ.LJIIJ(0.0f, 0.84f, 0.0f, 1.37f, -0.03f, 1.84f);
        this.LIZJ.LIZJ(12.99f, 12.99f, false, true, 41.0f, 36.18f);
        this.LIZJ.LJIILL(-6.12f);
        this.LIZJ.LJIIJ(0.55f, -1.06f, 0.89f, -2.24f, 0.98f, -3.49f);
        this.LIZJ.LJIIJ(0.02f, -0.3f, 0.02f, -0.68f, 0.02f, -1.64f);
        C32856Cuy.w9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -1.86f, 0.0f, -2.59f, -0.09f, -3.17f);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, false, false, -7.67f, -7.68f);
        this.LIZJ.LJIIJ(-0.58f, -0.08f, -1.31f, -0.08f, -3.17f, -0.08f);
        this.LIZJ.LJI(18.9f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(3.8f, 3.8f);
        C32856Cuy.m3(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.33f, 44.0f);
        dij.LJIJ(31.5f);
        dij.LJIIJJI(-0.17f);
        dij.LJIIL(-4.68f, 4.1f);
        dij.LJIILL(-4.94f);
        dij.LJIIL(4.2f, -3.58f);
        dij.LJIIJJI(4.97f);
        dij.LJIJ(44.0f);
        dij.LJIIJJI(-4.32f);
        dij.LIZLLL();
        dij.LJIIIIZZ(8.22f, 11.97f);
        dij.LJIIIZ(0.95f, 0.95f, false, false, -1.28f, -0.1f);
        dij.LJIIIZ(13.0f, 13.0f, false, false, -4.82f, 8.41f);
        dij.LJ(2.0f, 21.18f, 2.0f, 22.2f, 2.0f, 23.82f);
        dij.LJIILL(0.36f);
        dij.LJIIJ(0.0f, 1.62f, 0.0f, 2.65f, 0.12f, 3.54f);
        dij.LJIIIZ(13.0f, 13.0f, false, false, 11.1f, 11.09f);
        dij.LJIIJ(0.88f, 0.12f, 1.9f, 0.12f, 3.53f, 0.12f);
        dij.LJIIJJI(8.75f);
        C32856Cuy.LJJLJLI(dij);
        dij.LJIIJJI(-8.57f);
        dij.LJIIJ(-1.86f, 0.0f, -2.59f, 0.0f, -3.17f, -0.08f);
        dij.LJIIIZ(9.0f, 9.0f, false, true, -7.67f, -7.68f);
        dij.LJ(6.0f, 26.59f, 6.0f, 25.87f, 6.0f, 24.0f);
        dij.LJIIJ(0.0f, -1.86f, 0.0f, -2.59f, 0.09f, -3.17f);
        dij.LJIIIZ(9.0f, 9.0f, false, true, 3.32f, -5.82f);
        dij.LJIIJ(0.51f, -0.4f, 0.62f, -1.16f, 0.17f, -1.63f);
        dij.LJIIL(-1.36f, -1.4f);
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
