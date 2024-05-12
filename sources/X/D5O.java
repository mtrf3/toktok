package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5O extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5O() {
        this.LIZJ.LJIIIIZZ(9.0f, 14.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        p.LJIIJJI(29.0f);
        p.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        C32856Cuy.E1(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        p2.LJIIJJI(-29.0f);
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        C32856Cuy.h1(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(9.5f, 28.0f);
        C32856Cuy.y7(this.LIZJ);
        this.LIZJ.LJIIIIZZ(12.0f, 28.5f);
        C32856Cuy.jc(this.LIZJ);
        this.LIZJ.LJIIIIZZ(15.5f, 28.0f);
        C32856Cuy.y7(this.LIZJ);
        this.LIZJ.LJIIIIZZ(18.0f, 28.5f);
        C32856Cuy.jc(this.LIZJ);
        this.LIZJ.LJIIIIZZ(21.5f, 28.0f);
        C32856Cuy.y7(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.a(dij);
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
