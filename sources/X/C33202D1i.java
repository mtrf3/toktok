package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33202D1i extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33202D1i() {
        C32856Cuy.X5(this.LIZJ);
        this.LIZJ.LJIILIIL(36.0f, 4.0f);
        C32856Cuy.LJLLJ(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(6.0f);
        p.LJIJ(11.0f);
        C32856Cuy.LJJIIZ(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(14.54f, 31.84f);
        dij.LJIIJJI(3.4f);
        dij.LJIJ(18.92f);
        dij.LJIIJJI(4.23f);
        dij.LJIILL(-2.76f);
        dij.LJI(10.29f);
        dij.LJIILL(2.76f);
        dij.LJIIJJI(4.25f);
        dij.LJIILL(12.92f);
        dij.LIZLLL();
        dij.LJIIIIZZ(28.21f, 31.84f);
        dij.LJIIJJI(4.72f);
        dij.LJIIL(4.78f, -15.68f);
        C32856Cuy.L6(dij);
        dij.LJIIL(-3.37f, 13.39f);
        dij.LJIIJJI(-0.14f);
        dij.LJIIL(-3.38f, -13.4f);
        dij.LJIIJJI(-3.7f);
        dij.LJIIL(4.79f, 15.7f);
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
