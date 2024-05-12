package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEV extends AbstractC39455Fe7 {
    public DEV() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 42.0f);
        this.LIZJ.LJIIJ(4.98f, 0.0f, 9.49f, -2.02f, 12.75f, -5.3f);
        this.LIZJ.LIZJ(18.0f, 18.0f, true, false, 24.0f, 42.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(22.0f, -18.0f);
        this.LIZJ.LJIIJ(0.0f, 6.06f, -2.45f, 11.55f, -6.42f, 15.53f);
        this.LIZJ.LIZJ(22.0f, 22.0f, true, true, 46.0f, 24.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-10.8f, -8.6f);
        this.LIZJ.LJIIL(-5.34f, 13.34f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.1f, 1.1f);
        this.LIZJ.LJII(15.12f, 35.5f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -2.61f, -2.62f);
        this.LIZJ.LJIIL(5.64f, -13.64f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.1f, -1.1f);
        this.LIZJ.LJIIL(13.36f, -5.35f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 2.6f, 2.6f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.06f, 29.94f);
        this.LIZJ.LJIIL(6.42f, -2.65f);
        this.LIZJ.LJIIL(-3.77f, -3.77f);
        this.LIZJ.LJIIL(-2.65f, 6.42f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(5.5f, -9.22f);
        this.LIZJ.LJIIL(3.72f, 3.71f);
        this.LIZJ.LJIIL(2.49f, -6.2f);
        this.LIZJ.LJIIL(-6.2f, 2.49f);
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
