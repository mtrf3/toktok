package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DD8 extends AbstractC39455Fe7 {
    public DD8() {
        C32856Cuy.Qd(this.LIZJ);
        C32856Cuy.p7(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.76f, 1.04f);
        this.LIZJ.LJIIL(4.53f, 8.3f);
        this.LIZJ.LJIIL(9.3f, 1.75f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.08f, 3.34f);
        this.LIZJ.LJIIL(-6.5f, 6.87f);
        this.LIZJ.LJIIL(1.22f, 9.39f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -2.84f, 2.06f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJII(24.0f, 30.7f);
        this.LIZJ.LJIIL(-8.55f, 4.06f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -2.84f, -2.06f);
        this.LIZJ.LJIIL(1.22f, -9.39f);
        this.LIZJ.LJIIL(-6.5f, -6.87f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.08f, -3.34f);
        this.LIZJ.LJIIL(9.3f, -1.74f);
        this.LIZJ.LJIIL(4.53f, -8.3f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 24.0f, 2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, 6.18f);
        this.LIZJ.LJIIL(-3.23f, 5.92f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.39f, 1.0f);
        this.LIZJ.LJIIL(-6.62f, 1.25f);
        this.LIZJ.LJIIL(4.63f, 4.9f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.53f, 1.63f);
        this.LIZJ.LJIIL(-0.87f, 6.68f);
        this.LIZJ.LJIIL(6.1f, -2.89f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.7f, 0.0f);
        this.LIZJ.LJIIL(6.1f, 2.9f);
        this.LIZJ.LJIIL(-0.87f, -6.7f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.53f, -1.62f);
        this.LIZJ.LJIIL(4.63f, -4.9f);
        this.LIZJ.LJIIL(-6.62f, -1.24f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.4f, -1.01f);
        this.LIZJ.LJII(24.0f, 8.18f);
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
