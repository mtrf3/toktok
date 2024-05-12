package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8V extends AbstractC39455Fe7 {
    public D8V() {
        C32856Cuy.LJZL(this.LIZJ);
        this.LIZJ.LJIIJ(3.43f, 0.0f, 6.38f, 0.78f, 8.82f, 2.05f);
        this.LIZJ.LJIIJ(-0.52f, 0.98f, -0.82f, 2.1f, -0.82f, 3.28f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(5.95f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, 4.79f, 6.64f);
        this.LIZJ.LJ(30.54f, 45.0f, 28.97f, 45.0f, 27.0f, 45.0f);
        C32856Cuy.Ok(this.LIZJ);
        this.LIZJ.LJIIIIZZ(45.7f, 24.66f);
        this.LIZJ.LJIIJ(0.0f, -1.8f, -2.22f, -2.64f, -3.41f, -1.29f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-4.84f, 5.49f);
        this.LIZJ.LJIIIZ(2.3f, 2.3f, false, true, -1.73f, 0.77f);
        C32856Cuy.L6(this.LIZJ);
        this.LIZJ.LJIIIZ(2.7f, 2.7f, false, false, -2.7f, 2.7f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(5.95f);
        this.LIZJ.LJIIJ(0.0f, 1.49f, 1.2f, 2.7f, 2.7f, 2.7f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(1.83f);
        this.LIZJ.LJIIJ(0.62f, 0.0f, 1.22f, 0.25f, 1.65f, 0.7f);
        this.LIZJ.LJIIL(4.87f, 5.05f);
        this.LIZJ.LJIIIZ(1.95f, 1.95f, false, false, 3.35f, -1.35f);
        DIK.LIZIZ(this.LIZJ, "p", 24.66f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
