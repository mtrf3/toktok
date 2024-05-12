package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB1 extends AbstractC39455Fe7 {
    public DB1() {
        this.LIZJ.LJIIIIZZ(24.0f, 1.6f);
        this.LIZJ.LIZJ(2.4f, 2.4f, false, false, 21.6f, 4.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(5.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(2.8f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        this.LIZJ.LJIJ(6.56f);
        this.LIZJ.LJIIIZ(17.6f, 17.6f, true, true, -15.0f, 5.15f);
        this.LIZJ.LJIIJ(0.39f, -0.4f, 0.42f, -1.03f, 0.05f, -1.43f);
        this.LIZJ.LJII(9.55f, 8.2f);
        this.LIZJ.LJIIIZ(0.97f, 0.97f, false, false, -1.4f, -0.05f);
        this.LIZJ.LIZJ(22.32f, 22.32f, false, false, 1.6f, 24.0f);
        this.LIZJ.LIZJ(22.4f, 22.4f, true, false, 24.01f, 1.6f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-3.25f, 24.65f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, true, false, 5.5f, -5.5f);
        this.LIZJ.LJIIL(-10.97f, -6.91f);
        this.LIZJ.LJIIIZ(1.04f, 1.04f, false, false, -1.44f, 1.44f);
        this.LIZJ.LJIIL(6.9f, 10.97f);
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
