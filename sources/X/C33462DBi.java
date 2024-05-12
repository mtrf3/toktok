package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33462DBi extends AbstractC39455Fe7 {
    public C33462DBi() {
        this.LIZJ.LJIIIIZZ(34.47f, 3.17f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -4.14f, 0.08f);
        this.LIZJ.LJIIL(-14.0f, 13.88f);
        this.LIZJ.LJIIJ(-4.5f, 4.46f, -6.83f, 9.93f, -9.03f, 15.72f);
        this.LIZJ.LJIIIZ(2.2f, 2.2f, false, false, 2.91f, 2.8f);
        this.LIZJ.LJIIJ(5.3f, -2.24f, 10.37f, -4.51f, 14.53f, -8.64f);
        this.LIZJ.LJIIL(14.92f, -14.8f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -0.08f, -4.34f);
        this.LIZJ.LJIIL(-5.11f, -4.7f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-15.31f, 16.8f);
        this.LIZJ.LJIIL(13.3f, -13.2f);
        this.LIZJ.LJIIL(3.64f, 3.33f);
        this.LIZJ.LJIIL(-14.18f, 14.07f);
        this.LIZJ.LJIIIZ(29.56f, 29.56f, false, true, -9.38f, 6.15f);
        this.LIZJ.LJIIIZ(28.96f, 28.96f, false, true, 6.62f, -10.35f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 40.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p2.LJIIJJI(32.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.bg(this.LIZJ);
        C32856Cuy.ck(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
