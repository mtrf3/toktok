package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE6 extends AbstractC39455Fe7 {
    public DE6() {
        this.LIZJ.LJIIIIZZ(36.01f, 13.77f);
        this.LIZJ.LJIIJ(0.47f, 0.3f, 0.6f, 0.92f, 0.3f, 1.38f);
        this.LIZJ.LJII(24.09f, 34.31f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -4.0f, 0.3f);
        this.LIZJ.LJIIL(-8.06f, -9.25f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 0.1f, -1.4f);
        this.LIZJ.LJIIL(2.26f, -1.98f);
        C32856Cuy.qk(this.LIZJ);
        this.LIZJ.LJIIL(5.87f, 6.73f);
        this.LIZJ.LJII(32.1f, 12.46f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.39f, -0.3f);
        this.LIZJ.LJII(36.0f, 13.77f);
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
