package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33029Cxl extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33029Cxl() {
        this.LIZJ.LJIILIIL(45.41f, 11.59f);
        this.LIZJ.LJIIL(-7.29f, -7.3f);
        C32856Cuy.ln(this.LIZJ);
        this.LIZJ.LJII(39.17f, 11.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-5.14f);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, false, false, -7.93f, 4.73f);
        this.LIZJ.LJIIL(-6.46f, 12.01f);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, false, true, -8.8f, 5.26f);
        C32856Cuy.LLLII(this.LIZJ);
        this.LIZJ.LJIIJJI(7.83f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, false, false, 12.33f, -7.36f);
        this.LIZJ.LJIIL(6.47f, -12.01f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, 4.4f, -2.63f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(5.14f);
        C32856Cuy.zh(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(7.3f, -7.3f);
        C32856Cuy.P5(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(10.98f, 11.0f);
        dij.LJIIIZ(14.0f, 14.0f, false, true, 11.23f, 5.64f);
        dij.LJIIL(-2.19f, 4.06f);
        dij.LJIIL(-0.23f, -0.44f);
        dij.LJIIIZ(10.0f, 10.0f, false, false, -8.8f, -5.26f);
        C32856Cuy.af(dij);
        C32856Cuy.Gb(dij);
        dij.LIZLLL();
        dij.LJIIIIZZ(26.26f, 32.27f);
        dij.LJIIL(-0.56f, -1.03f);
        dij.LJIIIZ(18.0f, 18.0f, false, false, 0.1f, -0.18f);
        dij.LJIIL(2.18f, -4.04f);
        dij.LJIIL(1.8f, 3.35f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, 4.4f, 2.63f);
        C32856Cuy.D0(dij);
        dij.LJIIL(-3.89f, -3.88f);
        C32856Cuy.We(dij);
        dij.LJIIL(7.3f, 7.3f);
        C32856Cuy.LLLILZJ(dij);
        dij.LJIIL(-7.3f, 7.3f);
        C32856Cuy.Ji(dij);
        dij.LJII(39.17f, 37.0f);
        dij.LJIIJJI(-4.99f);
        dij.LJIIIZ(9.0f, 9.0f, false, true, -7.92f, -4.73f);
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
