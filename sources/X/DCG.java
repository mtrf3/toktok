package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCG extends AbstractC39455Fe7 {
    public DCG() {
        this.LIZJ.LJIIIIZZ(10.19f, 36.19f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJII(20.96f, 24.0f);
        this.LIZJ.LJII(10.19f, 13.23f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJIIL(1.62f, -1.62f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 20.96f);
        this.LIZJ.LJIIL(10.77f, -10.77f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJIIL(0.09f, 0.09f);
        this.LIZJ.LJIIL(0.01f, 0.01f);
        this.LIZJ.LJIIL(1.42f, 1.42f);
        this.LIZJ.LJIIL(0.01f, 0.01f);
        this.LIZJ.LJIIL(0.1f, 0.1f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.4f);
        this.LIZJ.LJII(27.03f, 24.0f);
        this.LIZJ.LJIIL(10.77f, 10.77f);
        C32856Cuy.wk(this.LIZJ);
        this.LIZJ.LJIIL(-0.1f, 0.1f);
        this.LIZJ.LJIIL(-1.42f, 1.42f);
        this.LIZJ.LJIIL(-0.1f, 0.1f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 27.04f);
        this.LIZJ.LJII(13.23f, 37.81f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJII(10.2f, 36.2f);
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
