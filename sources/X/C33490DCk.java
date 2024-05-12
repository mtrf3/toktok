package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33490DCk extends AbstractC39455Fe7 {
    public C33490DCk() {
        this.LIZJ.LJIIIIZZ(20.67f, 2.0f);
        this.LIZJ.LJ(19.75f, 2.0f, 19.0f, 2.57f, 19.0f, 3.27f);
        this.LIZJ.LJIILL(25.46f);
        this.LIZJ.LJIIJ(0.0f, 0.7f, 0.75f, 1.27f, 1.67f, 1.27f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(6.66f);
        this.LIZJ.LJIIJ(0.92f, 0.0f, 1.67f, -0.57f, 1.67f, -1.27f);
        this.LIZJ.LJIJ(3.27f);
        this.LIZJ.LJIIJ(0.0f, -0.7f, -0.75f, -1.27f, -1.67f, -1.27f);
        this.LIZJ.LJIIJJI(-6.66f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(24.0f, 46.0f);
        C32856Cuy.Xa(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
