package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DD6 extends AbstractC39455Fe7 {
    public DD6() {
        C32856Cuy.j2(this.LIZJ);
        this.LIZJ.LJIILIIL(25.3f, -8.8f);
        this.LIZJ.LJIIIZ(3.3f, 3.3f, true, false, -6.6f, 0.0f);
        this.LIZJ.LJIIIZ(3.3f, 3.3f, false, false, 6.6f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-4.4f, 6.6f);
        this.LIZJ.LJIIJ(-0.6f, 0.0f, -1.1f, 0.5f, -1.1f, 1.1f);
        C32856Cuy.I9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 0.6f, 0.5f, 1.1f, 1.1f, 1.1f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(2.2f);
        this.LIZJ.LJIIJ(0.6f, 0.0f, 1.1f, -0.5f, 1.1f, -1.1f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(22.9f);
        this.LIZJ.LJIIJ(0.0f, -0.6f, -0.5f, -1.1f, -1.1f, -1.1f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-2.2f);
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
