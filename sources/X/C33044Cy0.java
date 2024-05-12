package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33044Cy0 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33044Cy0() {
        this.LIZJ.LJIIIIZZ(46.0f, 13.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.7f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(2.0f);
        C32856Cuy.k9(this.LIZJ);
        C32856Cuy.O5(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16595489);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(26.0f, 19.7f);
        dij.LJIILL(5.8f);
        dij.LJIIIZ(2.0f, 2.0f, true, true, -4.0f, 0.0f);
        dij.LJIILL(-5.8f);
        C32856Cuy.LJJIJIIJIL(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-49299);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(46.0f, 19.7f);
        dij2.LJIILL(17.5f);
        dij2.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        dij2.LJI(7.0f);
        dij2.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        dij2.LJIJ(19.7f);
        C32856Cuy.LJIILLIIL(dij2);
        dij2.LJIILL(5.8f);
        dij2.LJIIIZ(6.0f, 6.0f, true, false, 12.0f, 0.0f);
        dij2.LJIILL(-5.8f);
        C32856Cuy.h0(dij2);
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-49299);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
