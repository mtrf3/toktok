package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33210D1q extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33210D1q() {
        this.LIZJ.LJIIIIZZ(8.74f, 6.2f);
        this.LIZJ.LJIIIZ(3.2f, 3.2f, false, true, 3.2f, -3.2f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(25.8f);
        this.LIZJ.LIZJ(3.2f, 3.2f, false, true, 29.0f, 6.2f);
        this.LIZJ.LJIILL(20.6f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(3.2f, 3.2f, false, true, -3.2f, 3.2f);
        this.LIZJ.LJI(11.94f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(3.2f, 3.2f, false, true, -3.2f, -3.2f);
        this.LIZJ.LJIJ(6.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.74f, 3.63f);
        C32856Cuy.LJJJIL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -1.07f, -0.87f, -1.93f, -1.93f, -1.93f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.84f, 0.0f);
        C32856Cuy.LJJJIL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -1.07f, -0.86f, -1.93f, -1.92f, -1.93f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(11.7f, 40.8f);
        C32856Cuy.G9(dij);
        dij.LJIIJJI(14.97f);
        dij.LIZJ(5.33f, 5.33f, false, false, 32.0f, 27.67f);
        dij.LJIJ(5.95f);
        dij.LJIIJJI(4.8f);
        dij.LJIIIZ(3.2f, 3.2f, false, true, 3.2f, 3.2f);
        dij.LJIJ(40.8f);
        dij.LJIIIZ(3.2f, 3.2f, false, true, -3.2f, 3.2f);
        dij.LJI(14.9f);
        dij.LJIIIZ(3.2f, 3.2f, false, true, -3.2f, -3.2f);
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
