package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9X extends AbstractC39455Fe7 {
    public D9X() {
        C32856Cuy.LLJL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(10.1f);
        C32856Cuy.LLJJJ(this.LIZJ);
        this.LIZJ.LJIILL(-1.42f);
        C32856Cuy.J1(this.LIZJ);
        C32856Cuy.P6(this.LIZJ);
        C32856Cuy.mb(this.LIZJ);
        this.LIZJ.LJIILIIL(24.5f, 20.0f);
        C32856Cuy.Q6(this.LIZJ);
        C32856Cuy.zj(this.LIZJ);
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
