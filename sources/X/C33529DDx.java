package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33529DDx extends AbstractC39455Fe7 {
    public C33529DDx() {
        this.LIZJ.LJIIIIZZ(20.55f, 6.92f);
        this.LIZJ.LJII(4.05f, 34.97f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, false, 7.5f, 41.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(33.0f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 3.45f, -6.03f);
        this.LIZJ.LJII(27.45f, 6.92f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, -6.9f, 0.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.w1(this.LIZJ);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, true, true, 0.0f, -5.0f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 0.0f, 5.0f);
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
