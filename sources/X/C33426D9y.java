package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33426D9y extends AbstractC39455Fe7 {
    public C33426D9y() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 7.0f);
        C32856Cuy.Oa(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(34.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, -5.0f);
        p3.LJIJ(12.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        C32856Cuy.V6(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILIIL(-1.0f, 5.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(34.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(24.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(7.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p7.LJIJ(12.0f);
        p7.LIZLLL();
        this.LIZJ.LJIILIIL(6.52f, 6.38f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.4f, 1.35f);
        this.LIZJ.LJIIL(10.6f, 5.79f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.96f, 0.0f);
        this.LIZJ.LJIIL(10.6f, -5.79f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.4f, -1.35f);
        this.LIZJ.LJIIL(-0.96f, -1.76f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.36f, -0.4f);
        this.LIZJ.LJIIL(-9.16f, 5.0f);
        this.LIZJ.LJIIL(-9.16f, -5.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.36f, 0.4f);
        this.LIZJ.LJIIL(-0.96f, 1.76f);
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
