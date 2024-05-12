package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32948CwS extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32948CwS() {
        this.LIZJ.LJIIIIZZ(35.0f, 3.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p.LJIIJJI(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(6.0f);
        p.LJIIJJI(6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJIIJJI(-6.0f);
        p.LJIILL(6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJIIJJI(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p.LJIILL(-6.0f);
        p.LJIIJJI(-6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p.LJIILL(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p.LJIIJJI(6.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(3.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.9f, 4.55f);
        dij.LJIIJ(0.1f, 0.21f, 0.1f, 0.49f, 0.1f, 1.05f);
        dij.LJIILL(0.8f);
        dij.LJIIJ(0.0f, 0.56f, 0.0f, 0.84f, -0.1f, 1.05f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.45f, 0.44f);
        dij.LJIIJ(-0.21f, 0.11f, -0.49f, 0.11f, -1.05f, 0.11f);
        dij.LJIIJJI(-12.0f);
        dij.LJIIIZ(34.0f, 34.0f, false, false, -2.46f, 0.05f);
        C32856Cuy.z7(dij);
        dij.LIZJ(34.0f, 34.0f, false, false, 7.0f, 12.4f);
        dij.LJIILL(28.39f);
        dij.LJIIL(3.73f, -4.14f);
        dij.LIZJ(9.5f, 9.5f, false, true, 12.46f, 35.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 1.83f, -0.81f);
        dij.LJIIIZ(9.5f, 9.5f, false, true, 2.38f, -0.19f);
        dij.LJI(36.6f);
        dij.LJIIJ(1.15f, 0.0f, 1.9f, 0.0f, 2.46f, -0.05f);
        dij.LJIIJ(0.55f, -0.04f, 0.75f, -0.12f, 0.85f, -0.17f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, 0.87f, -0.87f);
        dij.LJIIJ(0.05f, -0.1f, 0.13f, -0.3f, 0.17f, -0.85f);
        dij.LJIIJ(0.05f, -0.56f, 0.05f, -1.3f, 0.05f, -2.46f);
        C32856Cuy.LJJLL(dij);
        C32856Cuy.e3(dij);
        dij.LJIILL(5.08f);
        C32856Cuy.W9(dij);
        dij.LJI(16.85f);
        C32856Cuy.Qb(dij);
        dij.LJII(9.23f, 44.3f);
        dij.LJIIJ(-0.4f, 0.43f, -0.77f, 0.84f, -1.1f, 1.15f);
        dij.LJIIJ(-0.28f, 0.26f, -0.9f, 0.82f, -1.78f, 0.92f);
        C32856Cuy.Sf(dij);
        dij.LJ(3.0f, 43.05f, 3.0f, 42.49f, 3.0f, 41.9f);
        C32856Cuy.se(dij);
        dij.LJ(9.36f, 4.0f, 10.27f, 4.0f, 11.32f, 4.0f);
        dij.LJI(23.4f);
        C32856Cuy.fi(dij);
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
