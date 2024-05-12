package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33413D9l extends AbstractC39455Fe7 {
    public C33413D9l() {
        this.LIZJ.LJIILIIL(34.89f, 16.12f);
        this.LIZJ.LJIIL(-7.39f, 6.85f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(3.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-5.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        this.LIZJ.LJIILL(19.97f);
        this.LIZJ.LJIIL(-7.39f, -6.85f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.4f, 0.05f);
        this.LIZJ.LJII(8.3f, 19.83f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.05f, 1.42f);
        this.LIZJ.LJIIL(14.97f, 13.9f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.36f, 0.0f);
        this.LIZJ.LJIIL(14.97f, -13.9f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.05f, -1.42f);
        this.LIZJ.LJIIL(-3.4f, -3.66f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, -0.05f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(39.0f, 44.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p4.LJIILL(-5.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.k7(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(5.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.LJJIII(this.LIZJ);
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
