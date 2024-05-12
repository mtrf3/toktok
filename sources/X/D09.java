package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D09 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D09() {
        this.LIZJ.LJIIIIZZ(8.64f, 38.54f);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, false, true, 0.0f, -12.73f);
        this.LIZJ.LJIIL(4.77f, -4.77f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        p.LJIIL(-1.42f, -1.42f);
        C32856Cuy.F8(this.LIZJ);
        this.LIZJ.LJII(5.8f, 23.0f);
        this.LIZJ.LJIIIZ(13.0f, 13.0f, false, false, 18.38f, 18.38f);
        this.LIZJ.LJIIL(4.78f, -4.77f);
        C32856Cuy.Q7(this.LIZJ);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJIIL(-4.78f, 4.77f);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, false, true, -12.72f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.25f, 12.2f);
        this.LIZJ.LJIIL(3.71f, -3.71f);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, false, true, 12.02f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(0.7f, 0.7f);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, false, true, 0.0f, 12.03f);
        this.LIZJ.LJIIL(-3.7f, 3.71f);
        C32856Cuy.Nh(this.LIZJ);
        C32856Cuy.Ek(this.LIZJ);
        this.LIZJ.LJIIL(3.72f, -3.71f);
        this.LIZJ.LJIIIZ(12.5f, 12.5f, false, false, 0.0f, -17.68f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-0.71f, -0.7f);
        this.LIZJ.LJIIIZ(12.5f, 12.5f, false, false, -17.68f, 0.0f);
        this.LIZJ.LJIIL(-3.71f, 3.7f);
        C32856Cuy.kd(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.7f, 28.64f);
        C32856Cuy.Ik(dij);
        dij.LJIIL(1.42f, 1.41f);
        C32856Cuy.Dk(dij);
        dij.LJII(30.9f, 19.1f);
        C32856Cuy.w8(dij);
        dij.LJII(15.71f, 28.64f);
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
