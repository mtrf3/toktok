package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33457DBd extends AbstractC39455Fe7 {
    public C33457DBd() {
        this.LIZJ.LJIIIIZZ(20.55f, 6.92f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 6.9f, 0.0f);
        this.LIZJ.LJIIL(16.5f, 28.05f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, true, 40.5f, 41.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-33.0f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, -3.45f, -6.03f);
        this.LIZJ.LJIIL(16.5f, -28.05f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 8.94f);
        this.LIZJ.LJII(7.5f, 37.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(33.0f);
        this.LIZJ.LJII(24.0f, 8.94f);
        this.LIZJ.LIZLLL();
        C32856Cuy.w1(this.LIZJ);
        C32856Cuy.ug(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
