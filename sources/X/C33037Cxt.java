package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33037Cxt extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33037Cxt() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(14.0f, 7.0f);
        C32856Cuy.zn(this.LIZJ);
        C32856Cuy.Cb(this.LIZJ);
        this.LIZJ.LJIIJ(4.7f, 0.0f, 8.5f, 3.8f, 8.5f, 8.5f);
        C32856Cuy.G9(this.LIZJ);
        C32856Cuy.Jc(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(14.5f);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, false, 33.5f, 9.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(15.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.R9(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(10.5f, 12.0f);
        C32856Cuy.Hc(dij);
        dij.LIZJ(4.5f, 4.5f, false, true, 6.0f, 37.5f);
        dij.LJIILL(-21.0f);
        dij.LJIIIZ(4.5f, 4.5f, false, true, 4.5f, -4.5f);
        dij.LIZLLL();
        dij.LJIILIIL(7.78f, 8.22f);
        dij.LIZJ(1.5f, 1.5f, false, false, 16.0f, 21.5f);
        C32856Cuy.LJLIIL(dij);
        dij.LJIIIZ(1.5f, 1.5f, false, false, 2.28f, 1.28f);
        dij.LJIIL(9.0f, -5.5f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, 0.0f, -2.56f);
        dij.LJIIL(-9.0f, -5.5f);
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
