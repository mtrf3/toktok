package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEF extends AbstractC39455Fe7 {
    public DEF() {
        C32856Cuy.Ph(this.LIZJ);
        this.LIZJ.LJIILIIL(-4.11f, 2.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(6.11f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, false, 35.78f, 0.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.K0(this.LIZJ);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, false, -35.78f, 0.0f);
        this.LIZJ.LJIIJJI(35.78f);
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
