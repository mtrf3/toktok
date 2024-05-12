package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7Q extends AbstractC39455Fe7 {
    public D7Q() {
        this.LIZJ.LJIIIIZZ(5.7f, 12.81f);
        this.LIZJ.LJIIJ(-0.37f, 0.55f, 0.1f, 1.19f, 0.77f, 1.19f);
        this.LIZJ.LJIIJJI(35.02f);
        this.LIZJ.LJIIJ(0.67f, 0.0f, 1.15f, -0.66f, 0.76f, -1.2f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, -1.03f, -0.99f);
        C32856Cuy.v4(this.LIZJ);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, -1.0f, 1.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.0f, 43.0f);
        C32856Cuy.mj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(18.6f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p2.LJIIJJI(36.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.M9(this.LIZJ);
        C32856Cuy.tg(this.LIZJ);
        this.LIZJ.LJIILIIL(13.38f, -9.05f);
        this.LIZJ.LJIIL(-2.8f, -2.8f);
        C32856Cuy.G4(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
