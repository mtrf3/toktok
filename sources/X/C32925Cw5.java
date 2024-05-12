package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cw5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32925Cw5 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32925Cw5() {
        this.LIZJ.LJIIIIZZ(15.0f, 6.0f);
        C32856Cuy.ec(this.LIZJ);
        C32856Cuy.Cb(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(5.5f, 5.5f, false, true, 5.5f, 5.5f);
        C32856Cuy.G9(this.LIZJ);
        C32856Cuy.I7(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(14.5f);
        this.LIZJ.LJ(42.0f, 9.8f, 38.2f, 6.0f, 33.5f, 6.0f);
        C32856Cuy.LLLLILI(this.LIZJ);
        this.LIZJ.LJIIIIZZ(16.77f, 20.2f);
        C32856Cuy.md(this.LIZJ);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 16.0f, 32.5f);
        C32856Cuy.Z0(this.LIZJ);
        C32856Cuy.q8(this.LIZJ);
        this.LIZJ.LJIIIIZZ(19.0f, 29.82f);
        this.LIZJ.LJII(23.62f, 27.0f);
        this.LIZJ.LJII(19.0f, 24.17f);
        C78269Unh.LIZJ(this.LIZJ, "p", 5.66f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(10.5f, 12.0f);
        dij.LIZJ(4.5f, 4.5f, false, false, 6.0f, 16.5f);
        C32856Cuy.kk(dij);
        C32856Cuy.c9(dij);
        dij.LJIIJJI(-21.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(9.0f, 16.5f);
        C32856Cuy.qo(dij);
        dij.LIZJ(1.5f, 1.5f, false, true, 9.0f, 37.5f);
        C32856Cuy.LJJJZ(dij);
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
