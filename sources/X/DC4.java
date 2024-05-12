package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC4 extends AbstractC39455Fe7 {
    public DC4() {
        this.LIZJ.LJIIIIZZ(23.4f, 2.28f);
        this.LIZJ.LJII(6.7f, 19.08f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, 0.6f, 1.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(9.18f);
        this.LIZJ.LJIILL(14.47f);
        this.LIZJ.LJIIJ(0.0f, 0.44f, 0.35f, 0.79f, 0.79f, 0.79f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(13.46f);
        this.LIZJ.LJIIJ(0.43f, 0.0f, 0.79f, -0.35f, 0.79f, -0.79f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(20.38f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(9.18f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, 0.6f, -1.3f);
        this.LIZJ.LJII(24.6f, 2.28f);
        this.LIZJ.LJIIIZ(0.79f, 0.79f, false, false, -1.2f, 0.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.LLFF(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
