package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33136CzU extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33136CzU() {
        C32856Cuy.LLL(this.LIZJ);
        C32856Cuy.Rd(this.LIZJ);
        C32856Cuy.uj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(9.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJIIJJI(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(7.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p2.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 26.0f);
        C32856Cuy.ji(dij);
        C32856Cuy.LJIIJJI(dij);
        C32856Cuy.c2(dij);
        C32856Cuy.F6(dij);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        dij.LJIJ(26.0f);
        dij.LIZLLL();
        C32856Cuy.Kn(dij);
        dij.LJIILL(15.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        dij.LJIIJJI(10.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.LLLLZIL(dij);
        C32856Cuy.F6(dij);
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
