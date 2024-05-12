package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33607DGx extends AbstractC39455Fe7 {
    public C33607DGx() {
        this.LIZJ.LJIIIIZZ(5.0f, 24.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(4.0f, 4.0f, true, true, 8.0f, 0.0f);
        p.LJIIIZ(4.0f, 4.0f, false, true, -8.0f, 0.0f);
        p.LIZLLL();
        p.LJIILIIL(15.0f, 0.0f);
        p.LJIIIZ(4.0f, 4.0f, true, true, 8.0f, 0.0f);
        p.LJIIIZ(4.0f, 4.0f, false, true, -8.0f, 0.0f);
        p.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(15.0f, 0.0f);
        p2.LJIIIZ(4.0f, 4.0f, true, true, 8.0f, 0.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, true, -8.0f, 0.0f);
        p2.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
