package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8Q extends AbstractC39455Fe7 {
    public D8Q() {
        this.LIZJ.LJIIIIZZ(23.24f, 4.9f);
        this.LIZJ.LJII(8.4f, 22.35f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, false, 9.16f, 24.0f);
        C32856Cuy.t6(this.LIZJ);
        C32856Cuy.LJLIIIL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p.LJIIJJI(12.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.w9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(7.84f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.76f, -1.65f);
        this.LIZJ.LJII(24.76f, 4.9f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.52f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.0f, 38.0f);
        C32856Cuy.Zj(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(12.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIILL(-2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(18.0f);
        p4.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
