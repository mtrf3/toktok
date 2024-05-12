package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFC extends AbstractC39455Fe7 {
    public DFC() {
        this.LIZJ.LJIILIIL(25.0f, 2.44f);
        this.LIZJ.LJIIL(17.0f, 9.9f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, true, 1.0f, 1.74f);
        this.LIZJ.LJIILL(19.84f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.0f, 1.73f);
        this.LIZJ.LJIIL(-17.0f, 9.9f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 0.0f);
        this.LIZJ.LJIIL(-17.0f, -9.9f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.0f, -1.73f);
        this.LIZJ.LJIJ(14.08f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.0f, -1.73f);
        this.LIZJ.LJIIL(17.0f, -9.9f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.97f, 31.5f);
        this.LIZJ.LJIIIZ(7.4f, 7.4f, false, false, 7.36f, -7.43f);
        this.LIZJ.LJIIIZ(7.4f, 7.4f, false, false, -7.36f, -7.43f);
        this.LIZJ.LJIIIZ(7.4f, 7.4f, false, false, -7.37f, 7.43f);
        this.LIZJ.LJIIIZ(7.4f, 7.4f, false, false, 7.37f, 7.43f);
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
