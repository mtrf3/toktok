package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7B extends AbstractC39455Fe7 {
    public D7B() {
        this.LIZJ.LJIIIIZZ(8.9f, 8.0f);
        C32856Cuy.zn(this.LIZJ);
        this.LIZJ.LJIIJJI(28.2f);
        C32856Cuy.An(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.65f);
        C32856Cuy.yn(this.LIZJ);
        this.LIZJ.LJI(9.9f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p2.LJIJ(8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(4.81f, 19.17f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 3.98f, -4.4f);
        this.LIZJ.LJIIJJI(30.42f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 3.98f, 4.4f);
        this.LIZJ.LJII(41.27f, 37.4f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, -3.98f, 3.6f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(10.7f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, -3.98f, -3.6f);
        this.LIZJ.LJII(4.81f, 19.17f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.98f, -0.4f);
        this.LIZJ.LJII(10.71f, 37.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(37.3f);
        this.LIZJ.LJIIL(1.92f, -18.23f);
        this.LIZJ.LJI(8.79f);
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
