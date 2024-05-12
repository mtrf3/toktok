package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33026Cxi extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33026Cxi() {
        this.LIZJ.LJIIIIZZ(17.0f, 15.0f);
        C32856Cuy.ym(this.LIZJ);
        C32856Cuy.E1(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.LJIIJJI(6.0f);
        C32856Cuy.zm(this.LIZJ);
        C32856Cuy.LJJZ(this.LIZJ);
        C32856Cuy.xm(this.LIZJ);
        C32856Cuy.W(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Tn(dij);
        dij.LJIILIIL(5.0f, -1.0f);
        C32856Cuy.V7(dij);
        dij.LJIILL(24.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij.LJI(12.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        dij.LJIJ(12.0f);
        C32856Cuy.Wl(dij);
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
