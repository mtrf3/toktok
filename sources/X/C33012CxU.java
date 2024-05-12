package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33012CxU extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33012CxU() {
        this.LIZJ.LJIIIIZZ(16.05f, 18.4f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(-0.47f, 0.0f, -0.85f, -0.36f, -0.85f, -0.8f);
        C32856Cuy.n9(this.LIZJ);
        C32856Cuy.W3(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(9.6f, 8.0f);
        C32856Cuy.A6(dij);
        dij.LJIIJ(0.88f, 0.0f, 1.6f, 0.72f, 1.6f, 1.6f);
        C32856Cuy.w9(dij);
        dij.LJIIJ(0.0f, 0.88f, -0.72f, 1.6f, -1.6f, 1.6f);
        C32856Cuy.LLLLLIL(dij);
        dij.LIZJ(1.6f, 1.6f, false, true, 8.0f, 24.0f);
        dij.LJIJ(9.6f);
        dij.LJ(8.0f, 8.72f, 8.72f, 8.0f, 9.6f, 8.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(24.0f, 9.6f);
        C32856Cuy.LLLLLIL(dij);
        C32856Cuy.w9(dij);
        C32856Cuy.A6(dij);
        dij.LJIJ(9.6f);
        dij.LIZLLL();
        dij.LJIIIIZZ(9.6f, 28.8f);
        dij.LJIIJJI(8.0f);
        dij.LJIIJ(0.88f, 0.0f, 1.6f, 0.72f, 1.6f, 1.6f);
        dij.LJIILL(8.0f);
        dij.LJIIJ(0.0f, 0.88f, -0.72f, 1.6f, -1.6f, 1.6f);
        dij.LJIIJJI(-8.0f);
        dij.LIZJ(1.6f, 1.6f, false, true, 8.0f, 38.4f);
        dij.LJIILL(-8.0f);
        dij.LJIIJ(0.0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f);
        dij.LIZLLL();
        dij.LJIILIIL(8.0f, 1.6f);
        dij.LJIIJJI(-8.0f);
        dij.LJIILL(8.0f);
        dij.LJIIJJI(8.0f);
        dij.LJIILL(-8.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(28.8f, 30.4f);
        dij.LJIIJ(0.0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f);
        C32856Cuy.x7(dij);
        dij.LIZLLL();
        dij.LJIILIIL(1.6f, 0.0f);
        dij.LJIILL(8.0f);
        dij.LJIIJJI(8.0f);
        dij.LJIILL(-8.0f);
        C32856Cuy.Y(dij);
        dij.LJIIIIZZ(30.4f, 8.0f);
        C32856Cuy.x7(dij);
        dij.LJIIJ(0.0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f);
        dij.LIZLLL();
        dij.LJIILIIL(8.0f, 1.6f);
        dij.LJIIJJI(-8.0f);
        dij.LJIILL(8.0f);
        dij.LJIIJJI(8.0f);
        dij.LJIILL(-8.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(23.25f, 32.0f);
        dij.LJIIJ(-0.47f, 0.0f, -0.85f, -0.36f, -0.85f, -0.8f);
        C32856Cuy.LJJJLIIL(dij);
        C32856Cuy.W3(dij);
        dij.LJIIIIZZ(28.8f, 24.8f);
        C32856Cuy.m18if(dij);
        dij.LJIIIIZZ(36.8f, 24.8f);
        C32856Cuy.m18if(dij);
        dij.LJIIIIZZ(23.25f, 39.9f);
        dij.LJIIJ(-0.47f, 0.0f, -0.85f, -0.37f, -0.85f, -0.8f);
        dij.LJIILL(-1.61f);
        C32856Cuy.W3(dij);
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
