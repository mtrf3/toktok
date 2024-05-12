package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDB extends AbstractC39455Fe7 {
    public DDB() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(16.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        p2.LJIILL(25.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.58f, 0.81f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJII(24.0f, 30.35f);
        this.LIZJ.LJIIL(10.42f, 7.46f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, false, 36.0f, 37.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(12.0f);
        p4.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        C32856Cuy.LLLLJ(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
