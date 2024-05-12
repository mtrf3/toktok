package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAB extends AbstractC39455Fe7 {
    public DAB() {
        this.LIZJ.LJIIIIZZ(43.88f, 42.7f);
        C32856Cuy.Zh(this.LIZJ);
        this.LIZJ.LJII(34.44f, 27.62f);
        this.LIZJ.LJIIL(6.59f, -8.88f);
        this.LIZJ.LJIIL(2.6f, 2.6f);
        this.LIZJ.LJIIL(0.7f, -0.7f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(3.0f, 3.0f, false, false, 0.0f, -4.24f);
        p.LJII(31.62f, 3.67f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -4.25f, 0.0f);
        this.LIZJ.LJIIL(-0.7f, 0.7f);
        this.LIZJ.LJIIL(2.6f, 2.61f);
        this.LIZJ.LJIIL(-8.87f, 6.58f);
        this.LIZJ.LJII(8.12f, 1.3f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJII(5.29f, 2.71f);
        C32856Cuy.Jk(this.LIZJ);
        Q7L.LIZLLL(this.LIZJ, "p", 38.59f, 38.59f);
        this.LIZJ.LJIIIIZZ(4.8f, 15.62f);
        this.LIZJ.LJIIIZ(9.96f, 9.96f, false, true, 4.46f, -2.58f);
        this.LIZJ.LJIIL(25.7f, 25.7f);
        this.LIZJ.LJIIIZ(9.96f, 9.96f, false, true, -2.57f, 4.46f);
        this.LIZJ.LJIIIZ(3.6f, 3.6f, false, true, -5.1f, 0.0f);
        this.LIZJ.LJIIL(-9.82f, -9.83f);
        this.LIZJ.LJII(5.45f, 45.39f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, true, true, -2.83f, -2.83f);
        this.LIZJ.LJIIL(12.02f, -12.02f);
        this.LIZJ.LJII(4.8f, 20.7f);
        this.LIZJ.LJIIIZ(3.6f, 3.6f, false, true, 0.0f, -5.09f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
