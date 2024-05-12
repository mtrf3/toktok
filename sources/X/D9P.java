package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9P extends AbstractC39455Fe7 {
    public D9P() {
        this.LIZJ.LJIILIIL(43.77f, 22.23f);
        this.LIZJ.LJIIL(-15.3f, -15.3f);
        C32856Cuy.F8(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-2.13f, 2.13f);
        C32856Cuy.Jk(this.LIZJ);
        this.LIZJ.LJII(35.96f, 21.5f);
        C32856Cuy.V2(this.LIZJ);
        C32856Cuy.Fi(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(30.96f);
        this.LIZJ.LJII(24.94f, 37.53f);
        C32856Cuy.C8(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(2.12f, 2.13f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        p4.LJIIL(15.3f, -15.3f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 0.0f, -3.53f);
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
