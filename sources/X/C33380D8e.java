package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33380D8e extends AbstractC39455Fe7 {
    public C33380D8e() {
        this.LIZJ.LJIIIIZZ(23.05f, 7.84f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, 1.9f, 0.0f);
        this.LIZJ.LJIIL(16.1f, 13.2f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -0.95f, 2.66f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-2.33f);
        this.LIZJ.LJIIL(-1.2f, 13.03f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 34.1f, 39.0f);
        this.LIZJ.LJI(13.9f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -2.49f, -2.27f);
        this.LIZJ.LJII(10.23f, 23.7f);
        this.LIZJ.LJI(7.9f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -0.95f, -2.66f);
        this.LIZJ.LJIIL(16.1f, -13.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.95f, 3.1f);
        this.LIZJ.LJII(12.1f, 20.7f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(0.87f);
        this.LIZJ.LJIIL(1.4f, 15.3f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(8.13f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-7.69f);
        C32856Cuy.LLJJ(this.LIZJ);
        C32856Cuy.J9(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(8.13f);
        this.LIZJ.LJIIL(1.4f, -15.3f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(0.87f);
        this.LIZJ.LJII(24.0f, 10.94f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
