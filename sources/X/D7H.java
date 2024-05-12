package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7H extends AbstractC39455Fe7 {
    public D7H() {
        this.LIZJ.LJIIIIZZ(7.12f, 22.0f);
        this.LIZJ.LIZJ(17.0f, 17.0f, false, true, 22.0f, 7.12f);
        C32856Cuy.kh(this.LIZJ);
        this.LIZJ.LJIILL(4.12f);
        this.LIZJ.LIZJ(17.0f, 17.0f, false, true, 40.88f, 22.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(45.0f);
        C32856Cuy.N2(this.LIZJ);
        this.LIZJ.LJIIJJI(-4.12f);
        this.LIZJ.LIZJ(17.0f, 17.0f, false, true, 26.0f, 40.88f);
        C32856Cuy.Lm(this.LIZJ);
        this.LIZJ.LJIILL(-4.12f);
        this.LIZJ.LIZJ(17.0f, 17.0f, false, true, 7.12f, 26.0f);
        C32856Cuy.af(this.LIZJ);
        this.LIZJ.LJIIJJI(4.12f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.0f, 24.0f);
        this.LIZJ.LJIIIZ(13.0f, 13.0f, true, false, 26.0f, 0.0f);
        this.LIZJ.LJIIIZ(13.0f, 13.0f, false, false, -26.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.0f, 5.0f);
        C32856Cuy.ak(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
