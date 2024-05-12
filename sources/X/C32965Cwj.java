package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32965Cwj extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32965Cwj() {
        C32856Cuy.gj(this.LIZJ);
        this.LIZJ.LJIIJJI(19.78f);
        this.LIZJ.LJIIIZ(10.93f, 10.93f, false, true, -1.6f, -4.0f);
        C32856Cuy.z(this.LIZJ);
        this.LIZJ.LJIILL(15.41f);
        this.LIZJ.LJIIJ(1.48f, 0.42f, 2.84f, 1.15f, 4.0f, 2.1f);
        C32856Cuy.LLFII(this.LIZJ);
        this.LIZJ.LJIILIIL(3.0f, 19.0f);
        C32856Cuy.uo(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p.LJIILL(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p.LJI(12.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.zc(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(4.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p2.LJIIJJI(-4.0f);
        C32856Cuy.ck(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -1);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(38.0f, 45.0f);
        C32856Cuy.ta(dij);
        dij.LJIILIIL(4.14f, -9.44f);
        C32856Cuy.Gk(dij);
        dij.LJIIL(-0.28f, -0.28f);
        C32856Cuy.yk(dij);
        dij.LJII(37.0f, 37.3f);
        dij.LJIIL(-1.44f, -1.44f);
        C32856Cuy.yk(dij);
        dij.LJIIL(-0.28f, 0.28f);
        C32856Cuy.Ik(dij);
        dij.LJIIL(2.43f, 2.43f);
        C32856Cuy.Dk(dij);
        dij.LJIIL(4.43f, -4.43f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-15998821);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
