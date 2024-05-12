package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cw0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32920Cw0 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32920Cw0() {
        this.LIZJ.LJIIIIZZ(21.0f, 6.0f);
        C32856Cuy.el(this.LIZJ);
        C32856Cuy.LJIILIIL(this.LIZJ);
        C32856Cuy.fl(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(0.84f);
        this.LIZJ.LJIIL(3.15f, -2.03f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 46.0f, 6.91f);
        this.LIZJ.LJIILL(7.17f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -3.85f, 2.1f);
        this.LIZJ.LJII(39.0f, 14.17f);
        C32856Cuy.m9(this.LIZJ);
        C32856Cuy.dl(this.LIZJ);
        C32856Cuy.A6(this.LIZJ);
        C32856Cuy.i7(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(4.0f, 1.0f);
        C32856Cuy.F1(this.LIZJ);
        C32856Cuy.LJIIJJI(this.LIZJ);
        C32856Cuy.e(this.LIZJ);
        C32856Cuy.B6(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(15.7f, 3.5f);
        this.LIZJ.LJIIL(1.3f, 0.84f);
        this.LIZJ.LJIJ(9.66f);
        this.LIZJ.LJIIL(-1.3f, 0.84f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(14.53f, 6.9f);
        dij.LJIIIZ(4.9f, 4.9f, false, false, -7.34f, -0.46f);
        dij.LJIIL(-3.0f, 3.0f);
        dij.LJIIIZ(7.02f, 7.02f, false, false, -1.76f, 7.44f);
        dij.LJIIIZ(47.96f, 47.96f, false, false, 10.94f, 16.75f);
        dij.LJIIIZ(47.96f, 47.96f, false, false, 16.75f, 10.94f);
        dij.LJIIIZ(7.02f, 7.02f, false, false, 7.43f, -1.75f);
        dij.LJIIL(3.01f, -3.01f);
        dij.LJIIIZ(4.9f, 4.9f, false, false, -0.45f, -7.34f);
        dij.LJIIL(-5.62f, -4.36f);
        dij.LJIIIZ(4.9f, 4.9f, false, false, -5.53f, -0.34f);
        dij.LJIIL(-1.1f, 0.67f);
        dij.LJIIJ(-0.78f, 0.46f, -1.77f, 0.34f, -2.4f, -0.3f);
        dij.LJIIL(-6.6f, -6.6f);
        dij.LJIIIZ(1.96f, 1.96f, false, true, -0.3f, -2.4f);
        dij.LJIIL(0.67f, -1.1f);
        dij.LJIIIZ(4.9f, 4.9f, false, false, -0.34f, -5.53f);
        I9A.LIZIZ(dij, -4.36f, -5.62f, -3.16f, 2.45f);
        dij.LJIIL(4.37f, 5.61f);
        dij.LJIIJ(0.23f, 0.3f, 0.25f, 0.7f, 0.06f, 1.02f);
        dij.LJIIL(-0.67f, 1.11f);
        dij.LJIIIZ(5.96f, 5.96f, false, false, 0.9f, 7.28f);
        dij.LJIIL(6.6f, 6.6f);
        dij.LJIIIZ(5.96f, 5.96f, false, false, 7.28f, 0.9f);
        dij.LJIIL(1.1f, -0.67f);
        dij.LJIIIZ(0.9f, 0.9f, false, true, 1.03f, 0.06f);
        dij.LJIIL(5.61f, 4.37f);
        dij.LJIIIZ(0.9f, 0.9f, false, true, 0.09f, 1.35f);
        dij.LJII(34.73f, 40.0f);
        dij.LJIIJ(-0.96f, 0.95f, -2.19f, 1.22f, -3.2f, 0.84f);
        dij.LJIIJ(-3.45f, -1.3f, -9.5f, -4.2f, -15.33f, -10.03f);
        dij.LIZJ(43.96f, 43.96f, false, true, 6.17f, 15.47f);
        dij.LJIIJ(-0.38f, -1.01f, -0.11f, -2.24f, 0.84f, -3.2f);
        dij.LJIIL(3.0f, -3.0f);
        dij.LJIIIZ(0.9f, 0.9f, false, true, 1.36f, 0.08f);
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
