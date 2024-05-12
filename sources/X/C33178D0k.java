package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33178D0k extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33178D0k() {
        this.LIZJ.LJIIIIZZ(25.0f, 40.84f);
        this.LIZJ.LIZJ(16.84f, 16.84f, true, false, 8.52f, 20.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.45f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.78f, 1.63f);
        this.LIZJ.LJIIL(-3.97f, 4.9f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.56f, 0.0f);
        this.LIZJ.LJIIL(-3.97f, -4.9f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.78f, -1.63f);
        this.LIZJ.LJIIJJI(2.28f);
        this.LIZJ.LJIIIZ(20.0f, 20.0f, true, true, 4.56f, 16.58f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.0f, -0.63f);
        this.LIZJ.LJIIL(1.37f, -1.7f);
        this.LIZJ.LJIIJ(0.2f, -0.25f, 0.6f, -0.25f, 0.8f, 0.0f);
        this.LIZJ.LIZJ(16.8f, 16.8f, false, false, 25.0f, 40.85f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.5f, 27.0f);
        C32856Cuy.C5(dij);
        C32856Cuy.z6(dij);
        C32856Cuy.xn(dij);
        dij.LJIILL(-10.0f);
        C32856Cuy.R1(dij);
        dij.LJIILL(8.0f);
        dij.LJIIJJI(8.0f);
        C32856Cuy.LJJJJI(dij);
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
