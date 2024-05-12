package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D89 extends AbstractC39455Fe7 {
    public D89() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 43.0f);
        this.LIZJ.LJIIIZ(19.0f, 19.0f, true, false, -15.18f, -7.58f);
        this.LIZJ.LJII(6.23f, 37.4f);
        this.LIZJ.LIZJ(3.11f, 3.11f, false, false, 8.2f, 43.0f);
        DIL.LIZ(this.LIZJ, "p", 24.0f);
        this.LIZJ.LJIILIIL(-4.75f, -24.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(9.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.58f, 1.58f, false, true, 0.0f, 3.16f);
        C32856Cuy.xb(this.LIZJ);
        this.LIZJ.LJIIIZ(1.58f, 1.58f, true, true, 0.0f, -3.16f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-4.75f, 9.33f);
        this.LIZJ.LJIIJ(0.0f, -0.87f, 0.7f, -1.58f, 1.58f, -1.58f);
        this.LIZJ.LJIIJJI(15.84f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.58f, 1.58f, false, true, 0.0f, 3.16f);
        this.LIZJ.LJI(16.08f);
        this.LIZJ.LJIIJ(-0.87f, 0.0f, -1.58f, -0.7f, -1.58f, -1.58f);
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
