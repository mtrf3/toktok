package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33125CzJ extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33125CzJ() {
        this.LIZJ.LJIIIIZZ(19.0f, 32.94f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.87f);
        C32856Cuy.tj(this.LIZJ);
        this.LIZJ.LJIIJJI(13.17f);
        this.LIZJ.LJIIL(7.1f, 3.07f);
        this.LIZJ.LJIIJ(0.98f, 0.43f, 2.09f, -0.3f, 2.09f, -1.38f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(24.2f);
        C32856Cuy.qj(this.LIZJ);
        C32856Cuy.P6(this.LIZJ);
        this.LIZJ.LJIILL(6.74f);
        C32856Cuy.Xg(this.LIZJ);
        C32856Cuy.LLLLJI(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(3.0f, 9.7f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, -4.0f);
        dij.LJIIJJI(24.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 4.0f);
        dij.LJIILL(16.26f);
        C32856Cuy.nj(dij);
        dij.LJI(15.34f);
        dij.LJIIL(-9.97f, 7.07f);
        dij.LJIIJ(-1.0f, 0.7f, -2.37f, -0.01f, -2.37f, -1.23f);
        dij.LJIJ(9.7f);
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
