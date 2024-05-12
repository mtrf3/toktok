package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBA extends AbstractC39455Fe7 {
    public DBA() {
        this.LIZJ.LJIILIIL(4.59f, 22.59f);
        this.LIZJ.LJIIL(15.29f, -15.3f);
        C32856Cuy.oo(this.LIZJ);
        this.LIZJ.LJII(10.83f, 22.0f);
        C32856Cuy.Xn(this.LIZJ);
        C32856Cuy.Gj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(10.83f);
        this.LIZJ.LJII(22.7f, 37.88f);
        C32856Cuy.De(this.LIZJ);
        this.LIZJ.LJII(4.58f, 25.4f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, -2.82f);
        p2.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
