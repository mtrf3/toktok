package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCE extends AbstractC39455Fe7 {
    public DCE() {
        C32856Cuy.ud(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(2.48f, -2.48f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, -2.82f);
        C32856Cuy.S2(this.LIZJ);
        this.LIZJ.LJIIL(27.46f, -9.46f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.76f, -3.3f);
        Q7L.LIZLLL(this.LIZJ, "p", -18.0f, -18.0f);
        C32856Cuy.ik(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(2.13f, 2.12f);
        C32856Cuy.a4(this.LIZJ);
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
