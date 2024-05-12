package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D83 extends AbstractC39455Fe7 {
    public D83() {
        C32856Cuy.qa(this.LIZJ);
        this.LIZJ.LJIIL(2.58f, 2.57f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.29f, 0.8f);
        this.LIZJ.LJIIL(-0.25f, 2.54f);
        this.LIZJ.LJIIJ(-0.28f, 2.85f, -1.86f, 4.92f, -3.56f, 7.08f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(13.52f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.7f, 0.3f);
        this.LIZJ.LJIIL(2.86f, 2.85f);
        C32856Cuy.LLLLZ(this.LIZJ);
        this.LIZJ.LJIILIIL(10.9f, 5.4f);
        this.LIZJ.LJIIIZ(9.22f, 9.22f, false, true, 17.81f, 2.3f);
        C32856Cuy.l3(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-2.43f);
        this.LIZJ.LJII(15.35f, 12.02f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.9f, 40.98f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.11f, -0.54f, -0.35f, -0.99f, -0.9f, -0.99f);
        p3.LJI(18.0f);
        p3.LJIIJ(-0.55f, 0.0f, -1.01f, 0.45f, -0.9f, 1.0f);
        p3.LJIIJ(1.28f, 6.61f, 12.52f, 6.61f, 13.8f, 0.0f);
        p3.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
