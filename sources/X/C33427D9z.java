package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33427D9z extends AbstractC39455Fe7 {
    public C33427D9z() {
        this.LIZJ.LJIIIIZZ(11.5f, 9.0f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 9.0f, 11.5f);
        this.LIZJ.LJIIL(-0.06f, 21.0f);
        C32856Cuy.jg(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(7.35f);
        this.LIZJ.LJIIL(3.28f, 4.0f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 3.87f, 0.0f);
        this.LIZJ.LJIIL(3.27f, -4.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(7.35f);
        C32856Cuy.ig(this.LIZJ);
        this.LIZJ.LJIIL(-0.06f, -21.0f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 36.5f, 9.0f);
        C32856Cuy.sb(this.LIZJ);
        this.LIZJ.LJIIIIZZ(29.0f, 21.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(19.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(1.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(10.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-1.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p6.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
