package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB4 extends AbstractC39455Fe7 {
    public DB4() {
        this.LIZJ.LJIIIIZZ(25.5f, 37.0f);
        C32856Cuy.H0(this.LIZJ);
        C32856Cuy.LLLI(this.LIZJ);
        C32856Cuy.LJIIJJI(this.LIZJ);
        this.LIZJ.LJIJ(25.12f);
        this.LIZJ.LJIIL(-2.59f, 2.59f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, true, -0.7f, 0.0f);
        p.LJIIL(-1.42f, -1.42f);
        p.LJIIIZ(0.5f, 0.5f, false, true, 0.0f, -0.7f);
        this.LIZJ.LJIIL(5.15f, -5.15f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, 2.12f, 0.0f);
        this.LIZJ.LJIIL(5.15f, 5.15f);
        C32856Cuy.t8(this.LIZJ);
        this.LIZJ.LJIIL(-2.59f, -2.59f);
        DIK.LIZIZ(this.LIZJ, "p", 37.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
