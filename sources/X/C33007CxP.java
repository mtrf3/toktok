package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33007CxP extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33007CxP() {
        this.LIZJ.LJIIIIZZ(23.66f, 19.12f);
        this.LIZJ.LJIIIZ(6.14f, 6.14f, false, true, -6.16f, 6.12f);
        this.LIZJ.LJIIIZ(6.14f, 6.14f, false, true, -6.16f, -6.12f);
        this.LIZJ.LIZJ(6.14f, 6.14f, false, true, 17.5f, 13.0f);
        this.LIZJ.LJIIJ(3.4f, 0.0f, 6.16f, 2.74f, 6.16f, 6.12f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-3.36f, 0.0f);
        this.LIZJ.LJIIIZ(2.8f, 2.8f, false, false, -2.8f, -2.78f);
        this.LIZJ.LJIIIZ(2.8f, 2.8f, false, false, -2.8f, 2.78f);
        this.LIZJ.LJIIIZ(2.8f, 2.8f, false, false, 2.8f, 2.78f);
        this.LIZJ.LJIIIZ(2.8f, 2.8f, false, false, 2.8f, -2.78f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.82f, 34.91f);
        this.LIZJ.LJIIJ(0.27f, 0.05f, 0.53f, -0.13f, 0.6f, -0.4f);
        this.LIZJ.LJIIIZ(6.04f, 6.04f, false, true, 6.08f, -4.26f);
        this.LIZJ.LJIIJ(3.87f, 0.0f, 5.57f, 2.6f, 6.07f, 4.27f);
        this.LIZJ.LJIIJ(0.08f, 0.26f, 0.34f, 0.44f, 0.61f, 0.4f);
        this.LIZJ.LJIIL(2.33f, -0.43f);
        this.LIZJ.LJIIIZ(0.47f, 0.47f, false, false, 0.38f, -0.58f);
        this.LIZJ.LJIIJ(-0.68f, -2.61f, -3.3f, -7.0f, -9.39f, -7.0f);
        this.LIZJ.LJIIIZ(9.37f, 9.37f, false, false, -9.4f, 7.0f);
        this.LIZJ.LJIIJ(-0.06f, 0.27f, 0.12f, 0.53f, 0.4f, 0.58f);
        this.LIZJ.LJIIL(2.32f, 0.42f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(29.0f, 16.0f);
        C32856Cuy.W4(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(30.0f, 22.0f);
        C32856Cuy.La(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(29.0f, 30.0f);
        C32856Cuy.h2(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p3.LJIIJJI(-5.0f);
        C32856Cuy.ck(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(39.0f, 5.0f);
        C32856Cuy.LLLLLZIL(dij);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, 6.0f);
        dij.LJIILL(26.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, 6.0f);
        C32856Cuy.LJJIII(dij);
        C32856Cuy.ch(dij);
        dij.LJIJ(11.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(9.0f, 9.0f);
        dij.LJIIJJI(30.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        dij.LJIILL(26.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        dij.LJI(9.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        dij.LJIJ(11.0f);
        dij.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
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
