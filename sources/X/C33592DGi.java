package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33592DGi extends AbstractC39455Fe7 {
    public C33592DGi() {
        this.LIZJ.LJIIIIZZ(10.7f, 44.65f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, -0.36f, -1.37f);
        this.LIZJ.LJII(33.6f, 3.01f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.37f, -0.36f);
        this.LIZJ.LJIIL(2.08f, 1.2f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 0.37f, 1.37f);
        this.LIZJ.LJII(14.16f, 45.49f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.37f, 0.36f);
        this.LIZJ.LJIIL(-2.08f, -1.2f);
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
