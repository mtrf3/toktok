package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DG2 extends AbstractC39455Fe7 {
    public DG2() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 8.5f);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, true, false, 0.0f, 17.0f);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, false, false, 0.0f, -17.0f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(0.0f, 19.0f);
        this.LIZJ.LJIIJ(-6.18f, 0.0f, -10.98f, 3.87f, -13.0f, 9.38f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, false, 1.88f, 2.66f);
        this.LIZJ.LJIIJJI(22.24f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, false, 1.87f, -2.66f);
        this.LIZJ.LJIIJ(-2.01f, -5.5f, -6.81f, -9.38f, -12.99f, -9.38f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
