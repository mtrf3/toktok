package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33491DCl extends AbstractC39455Fe7 {
    public C33491DCl() {
        C32856Cuy.wl(this.LIZJ);
        this.LIZJ.LJIILIIL(14.2f, 1.27f);
        this.LIZJ.LJIIL(-0.6f, -0.6f);
        this.LIZJ.LJIIJ(-0.49f, -0.5f, -1.29f, -0.5f, -1.78f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-4.06f, 4.06f);
        this.LIZJ.LJIIIZ(2.1f, 2.1f, false, false, 0.0f, 2.98f);
        this.LIZJ.LJIIL(4.06f, 4.07f);
        this.LIZJ.LJIIJ(0.5f, 0.49f, 1.29f, 0.49f, 1.78f, 0.0f);
        this.LIZJ.LJIIL(0.6f, -0.6f);
        this.LIZJ.LJIIJ(0.5f, -0.5f, 0.5f, -1.3f, 0.0f, -1.79f);
        this.LIZJ.LJIIL(-1.49f, -1.48f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(5.9f);
        this.LIZJ.LJIIIZ(3.19f, 3.19f, true, true, 0.0f, 6.38f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-3.18f);
        this.LIZJ.LJIIJ(-0.7f, 0.0f, -1.26f, 0.56f, -1.26f, 1.26f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(0.84f);
        this.LIZJ.LJIIJ(0.0f, 0.7f, 0.56f, 1.26f, 1.26f, 1.26f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(3.18f);
        this.LIZJ.LJIIIZ(6.56f, 6.56f, false, false, 0.0f, -13.12f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-5.9f);
        this.LIZJ.LJIIL(1.5f, -1.49f);
        this.LIZJ.LJIIJ(0.48f, -0.5f, 0.48f, -1.29f, 0.0f, -1.78f);
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
