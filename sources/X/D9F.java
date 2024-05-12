package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9F extends AbstractC39455Fe7 {
    public D9F() {
        this.LIZJ.LJIIIIZZ(43.13f, 15.63f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(2.49f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.LLLFZ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(6.46f);
        this.LIZJ.LIZJ(20.68f, 20.68f, true, false, 43.0f, 32.04f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, false, -0.57f, -1.28f);
        this.LIZJ.LJIIL(-2.82f, -1.03f);
        this.LIZJ.LJIIIZ(1.05f, 1.05f, false, false, -1.31f, 0.59f);
        this.LIZJ.LJIIIZ(15.69f, 15.69f, true, true, -3.06f, -17.2f);
        this.LIZJ.LJIIJJI(-7.75f);
        C32856Cuy.ef(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(13.14f);
        C32856Cuy.ig(this.LIZJ);
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
