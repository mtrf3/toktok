package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33557DEz extends AbstractC39455Fe7 {
    public C33557DEz() {
        this.LIZJ.LJIIIIZZ(13.3f, 27.3f);
        C32856Cuy.LLLLLLLLL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJII(24.0f, 20.83f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-7.88f, 7.88f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        p2.LJIIL(-1.42f, -1.42f);
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
