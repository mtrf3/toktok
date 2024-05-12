package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33055CyB extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33055CyB() {
        C32856Cuy.Tj(this.LIZJ);
        this.LIZJ.LJIIJJI(7.36f);
        C32856Cuy.sf(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(9.5f);
        p.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-1.0f);
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        p2.LJIJ(10.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        p2.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 26.0f);
        C32856Cuy.oj(dij);
        C32856Cuy.G0(dij);
        C32856Cuy.u7(dij);
        C32856Cuy.LJIIIZ(dij);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        dij.LJIJ(26.0f);
        dij.LIZLLL();
        dij.LJIILIIL(2.0f, 0.0f);
        dij.LJIILL(12.0f);
        C32856Cuy.LLZ(dij);
        C32856Cuy.G0(dij);
        dij.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        dij.LJIJ(26.0f);
        C32856Cuy.xm(dij);
        C32856Cuy.LJIIIZ(dij);
        C32856Cuy.tc(dij);
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
