package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7I extends AbstractC39455Fe7 {
    public D7I() {
        C32856Cuy.kl(this.LIZJ);
        this.LIZJ.LJIILIIL(16.0f, -18.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(25.75f);
        p.LJIILL(-6.0f);
        this.LIZJ.LJIIJJI(13.09f);
        this.LIZJ.LIZJ(15.96f, 15.96f, false, true, 40.0f, 24.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-14.25f, 2.0f);
        this.LIZJ.LJIIJJI(14.13f);
        this.LIZJ.LJIIIZ(15.9f, 15.9f, false, true, -2.02f, 6.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(25.75f);
        p2.LJIILL(-6.0f);
        this.LIZJ.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILIIL(0.0f, 8.0f);
        this.LIZJ.LJIIJJI(10.74f);
        this.LIZJ.LJIIIZ(15.98f, 15.98f, false, true, -10.74f, 5.9f);
        DIK.LIZIZ(this.LIZJ, "p", 34.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILIIL(-2.0f, 6.0f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, false, true, 0.0f, -32.0f);
        C78269Unh.LIZJ(this.LIZJ, "p", 32.0f);
        this.LIZJ.LJIILIIL(2.0f, -31.9f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, false, true, 12.1f, 7.9f);
        this.LIZJ.LJIIJJI(-12.1f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(8.1f);
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
