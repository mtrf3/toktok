package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33085Cyf extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33085Cyf() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(6.0f, 7.0f);
        p.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        p.LJIILL(26.0f);
        p.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(22.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p2.LJIILL(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(6.0f);
        p3.LJIJ(19.5f);
        C32856Cuy.LJJIIZ(this.LIZJ);
        C32856Cuy.v9(this.LIZJ);
        C32856Cuy.N8(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(11.0f);
        p4.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        p4.LJI(6.0f);
        p4.LIZLLL();
        p4.LJIILIIL(0.0f, 4.0f);
        p4.LJIIJJI(36.0f);
        p4.LJIILL(4.5f);
        p4.LJI(6.0f);
        p4.LJIJ(11.0f);
        p4.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.0f, 40.0f);
        C32856Cuy.xn(dij);
        C32856Cuy.B9(dij);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(10.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIILL(2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij.LJIIJJI(-4.17f);
        dij.LJIIL(5.9f, 5.9f);
        C32856Cuy.De(dij);
        dij.LJIIL(-5.9f, -5.9f);
        dij.LJIJ(39.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.T(dij);
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
