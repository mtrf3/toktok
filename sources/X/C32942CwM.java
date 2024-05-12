package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32942CwM extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32942CwM() {
        this.LIZJ.LJIIIIZZ(34.68f, 6.0f);
        this.LIZJ.LJI(13.32f);
        C32856Cuy.LLILII(this.LIZJ);
        this.LIZJ.LJ(5.0f, 12.36f, 5.0f, 13.27f, 5.0f, 14.32f);
        C32856Cuy.J9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(1.0f);
        p2.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, 3.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(21.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-6.0f);
        p4.LJI(9.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(14.4f);
        C32856Cuy.o8(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.1f, -0.05f, 0.3f, -0.13f, 0.85f, -0.17f);
        this.LIZJ.LIZJ(34.0f, 34.0f, false, true, 13.4f, 10.0f);
        this.LIZJ.LJIIJJI(29.24f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -2.92f, -3.35f);
        this.LIZJ.LJIIIZ(6.1f, 6.1f, false, false, -2.33f, -0.59f);
        this.LIZJ.LJ(36.64f, 6.0f, 35.73f, 6.0f, 34.68f, 6.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(48.0f, 18.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        dij.LJIIJJI(-8.0f);
        C32856Cuy.LLIIJLIL(dij);
        dij.LJIIJJI(8.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        C32856Cuy.LLZZ(dij);
        dij.LJIILIIL(-16.0f, 0.0f);
        C32856Cuy.x(dij);
        C32856Cuy.G0(dij);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        dij.LJIILL(20.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        C32856Cuy.LJIIIZ(dij);
        C32856Cuy.um(dij);
        C32856Cuy.LLZZ(dij);
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
