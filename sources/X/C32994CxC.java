package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32994CxC extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32994CxC() {
        this.LIZJ.LJIIIIZZ(32.62f, 21.8f);
        C32856Cuy.yn(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(15.89f);
        C32856Cuy.z4(this.LIZJ);
        this.LIZJ.LJIIJJI(15.73f);
        C32856Cuy.tk(this.LIZJ);
        this.LIZJ.LJIIIIZZ(14.9f, 30.3f);
        C32856Cuy.En(this.LIZJ);
        this.LIZJ.LJIIJJI(11.78f);
        C32856Cuy.xa(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(15.89f);
        C32856Cuy.Bk(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(28.18f, 6.8f);
        dij.LJIIJJI(-8.36f);
        C32856Cuy.M2(dij);
        C32856Cuy.h5(dij);
        dij.LJIILL(-28.0f);
        C32856Cuy.qj(dij);
        dij.LJIIJJI(-3.88f);
        C32856Cuy.M2(dij);
        dij.LIZLLL();
        dij.LJIILIIL(-11.3f, 5.7f);
        C32856Cuy.Mi(dij);
        dij.LJIIJJI(8.36f);
        dij.LJIILL(0.7f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.Mi(dij);
        dij.LJIIJJI(2.94f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIILL(26.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij.LJI(12.94f);
        C32856Cuy.xn(dij);
        dij.LJIILL(-26.0f);
        C32856Cuy.zn(dij);
        dij.LJIIJJI(2.94f);
        dij.LJIILL(0.7f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
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
