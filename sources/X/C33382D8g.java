package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33382D8g extends AbstractC39455Fe7 {
    public C33382D8g() {
        C32856Cuy.ka(this.LIZJ);
        this.LIZJ.LJIILIIL(8.56f, 27.66f);
        C32856Cuy.f0(this.LIZJ);
        C32856Cuy.i(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-6.15f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(6.15f);
        C32856Cuy.i(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-1.3f);
        C32856Cuy.te(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-6.15f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-6.15f);
        C32856Cuy.te(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-1.3f);
        C32856Cuy.On(this.LIZJ);
        this.LIZJ.LJIILL(6.15f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(15.6f);
        C32856Cuy.On(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(1.3f);
        C32856Cuy.K3(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(6.15f);
        C32856Cuy.G9(this.LIZJ);
        C32856Cuy.K3(this.LIZJ);
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
