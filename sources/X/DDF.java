package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDF extends AbstractC39455Fe7 {
    public DDF() {
        this.LIZJ.LJIIIIZZ(36.0f, 15.0f);
        C32856Cuy.Pa(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(-5.0f, 0.0f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, true, false, -14.0f, 0.0f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, 14.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.62f, 44.07f);
        this.LIZJ.LJIIJ(0.68f, -3.1f, 4.29f, -9.07f, 13.12f, -9.07f);
        this.LIZJ.LJIIJ(9.0f, 0.0f, 12.97f, 5.7f, 13.65f, 9.07f);
        this.LIZJ.LJIIJ(0.11f, 0.54f, 0.56f, 0.99f, 1.11f, 0.99f);
        C32856Cuy.A0(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.55f, 0.0f, 1.0f, -0.45f, 0.95f, -1.0f);
        this.LIZJ.LJ(41.8f, 38.13f, 35.63f, 30.0f, 23.74f, 30.0f);
        this.LIZJ.LJ(11.86f, 30.0f, 6.19f, 38.58f, 5.56f, 44.06f);
        this.LIZJ.LJIIJ(-0.06f, 0.55f, 0.39f, 1.0f, 0.94f, 1.0f);
        C32856Cuy.A0(this.LIZJ);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 1.0f, -0.45f, 1.12f, -0.99f);
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
