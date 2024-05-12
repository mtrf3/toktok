package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cw2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32922Cw2 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32922Cw2() {
        C32856Cuy.LLLLZLL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 1.06f, 0.23f, 2.08f, 0.65f, 3.0f);
        C32856Cuy.LLLLLLZZ(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        p.LJIILL(4.0f);
        C32856Cuy.tj(this.LIZJ);
        C32856Cuy.LJIILL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(12.0f);
        p2.LJIIJJI(4.0f);
        C32856Cuy.LJLIL(this.LIZJ);
        C32856Cuy.LJIILL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, -4.0f);
        p3.LJIILL(-4.0f);
        C32856Cuy.qj(this.LIZJ);
        this.LIZJ.LJIIJJI(-1.65f);
        this.LIZJ.LJIIJ(0.42f, -0.92f, 0.65f, -1.94f, 0.65f, -3.0f);
        this.LIZJ.LJIIJ(0.0f, -3.73f, -2.86f, -7.0f, -6.67f, -7.0f);
        this.LIZJ.LJIIJ(-3.56f, 0.0f, -6.05f, 1.77f, -7.78f, 4.06f);
        this.LIZJ.LJIIJ(-0.59f, 0.8f, -1.1f, 1.65f, -1.55f, 2.54f);
        this.LIZJ.LJIIJ(-0.45f, -0.89f, -0.96f, -1.75f, -1.55f, -2.54f);
        this.LIZJ.LJ(20.72f, 3.77f, 18.23f, 2.0f, 14.67f, 2.0f);
        this.LIZJ.LJ(10.86f, 2.0f, 8.0f, 5.27f, 8.0f, 9.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.67f, -3.0f);
        this.LIZJ.LJ(13.32f, 6.0f, 12.0f, 7.21f, 12.0f, 9.0f);
        this.LIZJ.LJIILJJIL(1.32f, 3.0f, 2.67f, 3.0f, true);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(6.48f);
        this.LIZJ.LJIIIZ(15.75f, 15.75f, false, false, -1.9f, -3.53f);
        this.LIZJ.LJ(18.08f, 6.92f, 16.67f, 6.0f, 14.67f, 6.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(36.0f, 9.0f);
        this.LIZJ.LJIIJ(0.0f, 1.79f, -1.32f, 3.0f, -2.67f, 3.0f);
        this.LIZJ.LJIIJJI(-6.48f);
        this.LIZJ.LJIIIZ(15.75f, 15.75f, false, true, 1.9f, -3.53f);
        this.LIZJ.LJ(29.92f, 6.92f, 31.33f, 6.0f, 33.33f, 6.0f);
        this.LIZJ.LJ(34.68f, 6.0f, 36.0f, 7.21f, 36.0f, 9.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(7.0f, 27.0f);
        dij.LJIILL(8.08f);
        C32856Cuy.Jb(dij);
        C32856Cuy.y6(dij);
        C32856Cuy.z9(dij);
        C32856Cuy.V6(dij);
        dij.LJIIIIZZ(26.0f, 45.0f);
        dij.LJIIJJI(5.08f);
        C32856Cuy.G5(dij);
        C32856Cuy.z9(dij);
        C32856Cuy.C6(dij);
        dij.LJIILL(18.0f);
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
