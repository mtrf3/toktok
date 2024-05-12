package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCM extends AbstractC39455Fe7 {
    public DCM() {
        this.LIZJ.LJIILIIL(20.46f, 24.0f);
        this.LIZJ.LJIIL(-7.52f, -7.53f);
        C32856Cuy.G8(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(2.12f, -2.13f);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 20.46f);
        this.LIZJ.LJIIL(7.53f, -7.52f);
        C32856Cuy.Cf(this.LIZJ);
        this.LIZJ.LJII(27.54f, 24.0f);
        this.LIZJ.LJIIL(7.52f, 7.53f);
        C32856Cuy.LLZIL(this.LIZJ);
        this.LIZJ.LJII(24.0f, 27.54f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-7.53f, 7.52f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.4f, 0.0f);
        p2.LJIIL(-2.13f, -2.12f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.41f);
        this.LIZJ.LJII(20.46f, 24.0f);
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
