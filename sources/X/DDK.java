package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDK extends AbstractC39455Fe7 {
    public DDK() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(13.0f, 4.0f);
        C32856Cuy.mi(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(32.8f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 3.26f, 1.55f);
        this.LIZJ.LJIIL(12.1f, -9.84f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.27f, 0.0f);
        this.LIZJ.LJIIL(12.1f, 9.84f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 40.0f, 41.8f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(9.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        C32856Cuy.LLLLIILLL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
