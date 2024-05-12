package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33023Cxf extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33023Cxf() {
        this.LIZJ.LJIIIIZZ(45.0f, 7.5f);
        C32856Cuy.LLJJIJI(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(8.0f);
        p.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, 6.0f);
        this.LIZJ.LJIILL(55.17f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 3.41f, 1.42f);
        this.LIZJ.LJII(18.0f, 57.0f);
        this.LIZJ.LJIIJJI(43.0f);
        C32856Cuy.ch(this.LIZJ);
        this.LIZJ.LJIJ(31.93f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.41f, -0.8f);
        this.LIZJ.LJIIL(-1.8f, -1.32f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.79f, 0.4f);
        this.LIZJ.LJIJ(51.0f);
        C32856Cuy.dl(this.LIZJ);
        this.LIZJ.LJI(17.17f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.7f, 0.3f);
        this.LIZJ.LJII(5.0f, 65.75f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(13.0f);
        p2.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        this.LIZJ.LJIIJJI(36.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        p3.LJIILL(-2.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(49.63f, 26.67f);
        dij.LIZJ(3.0f, 3.0f, false, true, 48.0f, 24.0f);
        C32856Cuy.d(dij);
        C32856Cuy.oj(dij);
        C32856Cuy.LJIILJJIL(dij);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 4.0f);
        dij.LJIILL(18.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, -4.74f, 2.44f);
        dij.LJII(59.0f, 21.98f);
        dij.LJIIL(-6.26f, 4.46f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, -3.11f, 0.23f);
        dij.LIZLLL();
        dij.LJIIIIZZ(51.0f, 24.0f);
        dij.LJIIL(7.42f, -5.29f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.16f, 0.0f);
        dij.LJII(67.0f, 24.0f);
        C32856Cuy.bb(dij);
        dij.LJI(52.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        dij.LJIILL(18.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
