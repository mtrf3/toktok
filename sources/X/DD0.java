package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DD0 extends AbstractC39455Fe7 {
    public DD0() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(5.0f, 14.0f);
        C32856Cuy.tf(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(15.0f, 27.0f);
        this.LIZJ.LJ(5.35f, 27.0f, 0.0f, 34.04f, 0.0f, 39.84f);
        this.LIZJ.LJ(0.0f, 43.0f, 1.76f, 43.0f, 7.94f, 43.0f);
        this.LIZJ.LJIIJJI(14.12f);
        this.LIZJ.LJIIJ(6.18f, 0.0f, 7.94f, 0.0f, 7.94f, -3.16f);
        this.LIZJ.LJ(30.0f, 34.04f, 24.65f, 27.0f, 15.0f, 27.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.98f, 42.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(7.2f);
        this.LIZJ.LJ(45.7f, 42.0f, 47.0f, 42.0f, 47.0f, 39.63f);
        this.LIZJ.LJ(47.0f, 35.28f, 43.08f, 30.0f, 36.0f, 30.0f);
        this.LIZJ.LJIIJ(-2.0f, 0.0f, -3.74f, 0.42f, -5.22f, 1.12f);
        this.LIZJ.LIZJ(22.18f, 22.18f, false, true, 33.98f, 42.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(36.0f, 27.0f);
        C32856Cuy.ta(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
