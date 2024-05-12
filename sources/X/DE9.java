package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE9 extends AbstractC39455Fe7 {
    public DE9() {
        this.LIZJ.LJIIIIZZ(42.0f, 13.88f);
        this.LIZJ.LJIIJ(-5.6f, 0.0f, -10.13f, -4.54f, -10.13f, -10.13f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-6.75f);
        this.LIZJ.LJIILL(27.56f);
        this.LIZJ.LJIIIZ(6.19f, 6.19f, true, true, -4.5f, -5.95f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-6.88f);
        this.LIZJ.LJIIIZ(12.94f, 12.94f, true, false, 11.25f, 12.83f);
        this.LIZJ.LJIJ(17.25f);
        this.LIZJ.LIZJ(16.8f, 16.8f, false, false, 42.0f, 20.63f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-6.75f);
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
