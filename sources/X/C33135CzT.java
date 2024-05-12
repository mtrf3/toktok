package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33135CzT extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33135CzT() {
        this.LIZJ.LJIIIIZZ(25.0f, 28.8f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, true, false, -2.0f, 0.0f);
        C32856Cuy.G9(this.LIZJ);
        C32856Cuy.wn(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-4.2f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.0f, 16.4f);
        C32856Cuy.Lc(dij);
        C32856Cuy.p9(dij);
        dij.LJIIJJI(-2.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, 3.0f);
        dij.LJIILL(16.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, 3.0f);
        dij.LJIIJJI(22.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -3.0f);
        dij.LJIJ(21.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, -3.0f);
        C32856Cuy.LIZLLL(dij);
        dij.LJIILL(-1.6f);
        dij.LIZLLL();
        dij.LJIILIIL(-16.0f, 0.0f);
        C32856Cuy.ll(dij);
        C32856Cuy.p9(dij);
        C32856Cuy.t6(dij);
        dij.LJIILL(-1.6f);
        dij.LIZLLL();
        dij.LJIIIIZZ(12.0f, 21.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(22.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIILL(16.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.Q5(dij);
        dij.LJIJ(21.0f);
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
