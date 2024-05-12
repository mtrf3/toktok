package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33087Cyh extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33087Cyh() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 8.0f);
        C32856Cuy.LJJIFFI(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p2.LJIILL(12.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJIIJJI(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIJ(9.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        p4.LJI(9.0f);
        p4.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(27.0f);
        C32856Cuy.oi(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(12.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p6.LJIILL(-2.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p6.LJI(9.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p7.LJIJ(9.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p7.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(26.0f, 30.0f);
        C32856Cuy.oj(dij);
        dij.LJIIJJI(10.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 4.0f);
        dij.LJIILL(10.0f);
        C32856Cuy.nj(dij);
        C32856Cuy.H6(dij);
        C32856Cuy.mj(dij);
        dij.LJIJ(30.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(11.0f, 22.0f);
        C32856Cuy.N8(dij);
        dij.LJIILL(-4.17f);
        dij.LJIIL(5.9f, 5.9f);
        C32856Cuy.LJZI(dij);
        dij.LJIIL(-5.9f, -5.9f);
        dij.LJI(22.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        dij.LJIILL(-2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        dij.LJI(12.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        dij.LJIILL(10.0f);
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
