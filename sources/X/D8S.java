package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8S extends AbstractC39455Fe7 {
    public D8S() {
        C32856Cuy.p7(this.LIZJ);
        this.LIZJ.LJIIJ(3.08f, 0.0f, 6.01f, 0.63f, 8.67f, 1.77f);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, false, false, 12.07f, 12.88f);
        this.LIZJ.LIZJ(22.0f, 22.0f, true, true, 24.0f, 2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.0f, 9.0f);
        C32856Cuy.LJLIIL(this.LIZJ);
        C32856Cuy.xb(this.LIZJ);
        C32856Cuy.Zj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(25.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.Tc(this.LIZJ);
        C32856Cuy.j4(this.LIZJ);
        this.LIZJ.LJIILIIL(18.0f, 3.25f);
        this.LIZJ.LJIIIZ(5.25f, 5.25f, true, false, 0.0f, -10.5f);
        this.LIZJ.LJIIIZ(5.25f, 5.25f, false, false, 0.0f, 10.5f);
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
