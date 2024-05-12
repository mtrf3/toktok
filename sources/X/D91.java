package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D91 extends AbstractC39455Fe7 {
    public D91() {
        this.LIZJ.LJIIIIZZ(8.12f, 21.0f);
        this.LIZJ.LJIIJJI(31.76f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, false, false, -31.76f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-4.09f, 0.9f);
        this.LIZJ.LJIIIZ(20.0f, 20.0f, false, true, 39.94f, 0.0f);
        this.LIZJ.LIZJ(2.96f, 2.96f, false, true, 41.0f, 25.0f);
        C32856Cuy.D6(this.LIZJ);
        C32856Cuy.LJLIIL(this.LIZJ);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, true, -15.94f, 1.0f);
        this.LIZJ.LJIIJ(-0.07f, -0.55f, 0.39f, -1.0f, 0.94f, -1.0f);
        C32856Cuy.z0(this.LIZJ);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 0.99f, 0.45f, 1.12f, 0.99f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, false, 23.0f, 36.0f);
        C32856Cuy.x9(this.LIZJ);
        C32856Cuy.LLLLLLZZ(this.LIZJ);
        this.LIZJ.LJIIIZ(2.96f, 2.96f, false, true, -2.97f, -3.1f);
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
