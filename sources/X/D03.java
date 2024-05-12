package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D03 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D03() {
        C32856Cuy.y(this.LIZJ);
        this.LIZJ.LJIIIIZZ(26.3f, 44.7f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.3f, 2.3f, true, true, -4.6f, 0.0f);
        p.LJIIIZ(2.3f, 2.3f, false, true, 4.6f, 0.0f);
        p.LIZLLL();
        p.LJIIIIZZ(44.7f, 26.3f);
        p.LJIIIZ(2.3f, 2.3f, true, true, 0.0f, -4.6f);
        p.LJIIIZ(2.3f, 2.3f, false, true, 0.0f, 4.6f);
        p.LIZLLL();
        this.LIZJ.LJIIIIZZ(3.3f, 26.3f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.3f, 2.3f, true, true, 0.0f, -4.6f);
        p2.LJIIIZ(2.3f, 2.3f, false, true, 0.0f, 4.6f);
        p2.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(15.2f, 2.75f);
        p3.LIZJ(2.3f, 2.3f, true, true, 16.96f, 7.0f);
        p3.LJIIIZ(2.3f, 2.3f, false, true, -1.76f, -4.25f);
        p3.LIZLLL();
        this.LIZJ.LJIIIIZZ(32.8f, 45.25f);
        this.LIZJ.LIZJ(2.3f, 2.3f, true, true, 31.04f, 41.0f);
        this.LIZJ.LJIIIZ(2.3f, 2.3f, false, true, 1.76f, 4.25f);
        this.LIZJ.LIZLLL();
        C32856Cuy.Tl(this.LIZJ);
        C32856Cuy.uc(this.LIZJ);
        C32856Cuy.Hd(this.LIZJ);
        C32856Cuy.J2(this.LIZJ);
        this.LIZJ.LJIIIIZZ(37.01f, 37.01f);
        C32856Cuy.ca(this.LIZJ);
        this.LIZJ.LJIIIIZZ(7.74f, 7.74f);
        C32856Cuy.ca(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(34.05f, 5.76f);
        p4.LIZJ(2.3f, 2.3f, true, true, 29.8f, 4.0f);
        p4.LJIIIZ(2.3f, 2.3f, false, true, 4.25f, 1.76f);
        p4.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.2f, 45.25f);
        this.LIZJ.LIZJ(2.3f, 2.3f, true, true, 16.96f, 41.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(2.3f, 2.3f, false, true, -1.76f, 4.25f);
        p5.LIZLLL();
        C32856Cuy.Ia(this.LIZJ);
        C32856Cuy.LJJLIIIJL(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIIZZ(24.0f, 28.0f);
        C32856Cuy.Gf(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 37.5f);
        dij.LJIIIZ(13.5f, 13.5f, true, false, 0.0f, -27.0f);
        dij.LJIIIZ(13.5f, 13.5f, false, false, 0.0f, 27.0f);
        dij.LIZLLL();
        C32856Cuy.K0(dij);
        dij.LJIIIZ(9.5f, 9.5f, true, true, 0.0f, -19.0f);
        dij.LJIIIZ(9.5f, 9.5f, false, true, 0.0f, 19.0f);
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
