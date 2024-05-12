package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAW extends AbstractC39455Fe7 {
    public DAW() {
        this.LIZJ.LJIIIIZZ(22.5f, 30.91f);
        C32856Cuy.LLILZLL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(1.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        this.LIZJ.LJIILL(23.91f);
        this.LIZJ.LJIIL(12.75f, -11.83f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.41f, 0.05f);
        this.LIZJ.LJIIL(0.68f, 0.74f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.05f, 1.41f);
        this.LIZJ.LJII(25.02f, 35.45f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -2.04f, 0.0f);
        this.LIZJ.LJII(7.71f, 21.28f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.05f, -1.41f);
        this.LIZJ.LJIIL(0.68f, -0.74f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.41f, -0.05f);
        this.LIZJ.LJII(22.5f, 30.91f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(15.05f, 7.59f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p2.LJIILL(1.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        this.LIZJ.LJIIJJI(-27.1f);
        C32856Cuy.G3(this.LIZJ);
        this.LIZJ.LJIIJJI(27.1f);
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
