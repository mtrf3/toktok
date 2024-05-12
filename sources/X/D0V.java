package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0V extends AbstractC39455Fe7 {
    public D0V() {
        this.LIZJ.LJIILIIL(37.0f, 39.83f);
        this.LIZJ.LJIIL(4.46f, 4.46f);
        C32856Cuy.xd(this.LIZJ);
        this.LIZJ.LJII(6.71f, 3.88f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(3.88f, 5.29f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(4.78f, 4.78f);
        this.LIZJ.LIZJ(16.45f, 16.45f, false, false, 5.0f, 22.0f);
        C32856Cuy.LJJLIIIJ(this.LIZJ);
        C32856Cuy.N8(this.LIZJ);
        C32856Cuy.u9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -2.97f, 0.93f, -5.58f, 2.5f, -7.67f);
        this.LIZJ.LJII(29.0f, 31.83f);
        C32856Cuy.M9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        p.LJIIJJI(2.0f);
        p.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-1.17f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.0f, -6.33f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.71f, 0.96f);
        this.LIZJ.LJII(39.0f, 31.17f);
        C32856Cuy.Om(this.LIZJ);
        this.LIZJ.LJIIJ(-1.87f, 0.0f, -3.66f, 0.3f, -5.29f, 0.89f);
        this.LIZJ.LJIIL(-3.05f, -3.06f);
        this.LIZJ.LIZJ(19.49f, 19.49f, false, true, 23.0f, 5.0f);
        C32856Cuy.o3(this.LIZJ);
        this.LIZJ.LIZLLL();
        C32856Cuy.Zc(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
