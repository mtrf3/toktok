package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33517DDl extends AbstractC39455Fe7 {
    public C33517DDl() {
        this.LIZJ.LJIIIIZZ(37.0f, 5.9f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.15f, -1.0f);
        this.LIZJ.LJII(24.1f, 6.37f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.85f, 0.98f);
        this.LIZJ.LJIILL(22.4f);
        this.LIZJ.LJIIJJI(-3.12f);
        this.LIZJ.LJIIIZ(7.12f, 7.12f, true, false, 7.12f, 7.13f);
        this.LIZJ.LJIILL(-23.1f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, true, 0.43f, -0.5f);
        this.LIZJ.LJIIL(8.65f, -0.99f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.8f, 0.8f, false, false, 0.68f, -0.79f);
        this.LIZJ.LJIJ(5.9f);
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
