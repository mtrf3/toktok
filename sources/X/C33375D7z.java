package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33375D7z extends AbstractC39455Fe7 {
    public C33375D7z() {
        C32856Cuy.Mg(this.LIZJ);
        C32856Cuy.s7(this.LIZJ);
        this.LIZJ.LJIIIZ(9.3f, 9.3f, false, false, -9.26f, 8.35f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.88f, 8.55f);
        this.LIZJ.LJIIJ(-0.3f, 2.86f, -1.91f, 4.93f, -3.62f, 7.1f);
        this.LIZJ.LJIIJJI(27.52f);
        this.LIZJ.LJIIJ(-1.7f, -2.17f, -3.32f, -4.24f, -3.62f, -7.1f);
        this.LIZJ.LJIIL(-0.89f, -8.55f);
        this.LIZJ.LIZJ(9.3f, 9.3f, false, false, 24.0f, 8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-13.24f, 7.94f);
        this.LIZJ.LJIIIZ(13.3f, 13.3f, false, true, 26.47f, 0.0f);
        this.LIZJ.LJIIL(0.89f, 8.54f);
        this.LIZJ.LJIIJ(0.33f, 3.2f, 3.45f, 5.9f, 5.33f, 8.28f);
        C32856Cuy.Ne(this.LIZJ);
        this.LIZJ.LJIIJ(1.87f, -2.38f, 5.0f, -5.08f, 5.33f, -8.27f);
        this.LIZJ.LJIIL(0.88f, -8.55f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.0f, 40.0f);
        C32856Cuy.nd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
