package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33531DDz extends AbstractC39455Fe7 {
    public C33531DDz() {
        this.LIZJ.LJIILIIL(19.71f, 36.03f);
        this.LIZJ.LJIIL(19.73f, -30.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.39f, -0.3f);
        this.LIZJ.LJIIL(2.35f, 1.53f);
        C32856Cuy.LLIIIL(this.LIZJ);
        this.LIZJ.LJII(22.01f, 41.3f);
        this.LIZJ.LJIIIZ(2.4f, 2.4f, false, true, -3.83f, 0.28f);
        this.LIZJ.LJII(4.85f, 26.33f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 0.1f, -1.4f);
        this.LIZJ.LJIIL(2.1f, -1.85f);
        C32856Cuy.ok(this.LIZJ);
        this.LIZJ.LJII(19.7f, 36.02f);
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
