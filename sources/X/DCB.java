package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCB extends AbstractC39455Fe7 {
    public DCB() {
        this.LIZJ.LJIILIIL(25.41f, 21.41f);
        this.LIZJ.LJIIL(9.3f, -9.29f);
        C32856Cuy.mc(this.LIZJ);
        this.LIZJ.LJII(24.0f, 17.17f);
        this.LIZJ.LJII(16.12f, 9.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, 0.0f);
        p.LJIIL(-1.42f, 1.42f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 1.41f);
        p.LJIIL(9.3f, 9.3f);
        p.LJIIIZ(2.0f, 2.0f, false, false, 2.82f, 0.0f);
        p.LIZLLL();
        this.LIZJ.LJIIIIZZ(25.41f, 26.59f);
        C32856Cuy.qc(this.LIZJ);
        this.LIZJ.LJII(24.0f, 30.83f);
        C32856Cuy.E2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
