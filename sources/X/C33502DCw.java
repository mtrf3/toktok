package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33502DCw extends AbstractC39455Fe7 {
    public C33502DCw() {
        this.LIZJ.LJIILIIL(22.23f, 4.23f);
        this.LIZJ.LJIIL(-15.3f, 15.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 1.4f);
        p.LJIIL(2.13f, 2.13f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        this.LIZJ.LJII(21.5f, 12.04f);
        C32856Cuy.og(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(12.04f);
        this.LIZJ.LJIIL(11.03f, 11.02f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.4f, 0.0f);
        p3.LJIIL(2.13f, -2.12f);
        C32856Cuy.Hk(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-15.3f, -15.3f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(2.5f, 2.5f, false, false, -3.53f, 0.0f);
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
