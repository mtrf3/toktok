package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE2 extends AbstractC39455Fe7 {
    public DE2() {
        this.LIZJ.LJIIIIZZ(38.68f, 10.26f);
        C32856Cuy.LLIIIL(this.LIZJ);
        this.LIZJ.LJII(23.0f, 36.3f);
        this.LIZJ.LJIIIZ(2.4f, 2.4f, false, true, -3.82f, 0.28f);
        this.LIZJ.LJII(9.85f, 25.83f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 0.1f, -1.41f);
        this.LIZJ.LJIIL(2.1f, -1.84f);
        C32856Cuy.ok(this.LIZJ);
        this.LIZJ.LJIIL(7.25f, 8.34f);
        this.LIZJ.LJII(34.94f, 9.04f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.38f, -0.3f);
        this.LIZJ.LJIIL(2.36f, 1.52f);
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
