package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DF8 extends AbstractC39455Fe7 {
    public DF8() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 46.0f);
        p.LJIIIZ(22.0f, 22.0f, true, false, 0.0f, -44.0f);
        p.LJIIIZ(22.0f, 22.0f, false, false, 0.0f, 44.0f);
        p.LIZLLL();
        p.LJIILIIL(10.4f, -30.67f);
        this.LIZJ.LJII(32.26f, 14.0f);
        C32856Cuy.jk(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
