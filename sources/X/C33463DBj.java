package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33463DBj extends AbstractC39455Fe7 {
    public C33463DBj() {
        this.LIZJ.LJIIIIZZ(31.54f, 7.26f);
        this.LIZJ.LJIIJ(0.22f, 0.15f, 0.22f, 0.47f, 0.0f, 0.62f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-7.32f, 4.88f);
        this.LIZJ.LJIIIZ(0.37f, 0.37f, false, true, -0.58f, -0.31f);
        C32856Cuy.g(this.LIZJ);
        this.LIZJ.LIZJ(15.0f, 15.0f, true, false, 39.0f, 24.0f);
        C32856Cuy.Ml(this.LIZJ);
        this.LIZJ.LIZJ(18.0f, 18.0f, true, true, 23.64f, 6.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(2.7f);
        this.LIZJ.LJIIJ(0.0f, -0.3f, 0.33f, -0.48f, 0.58f, -0.32f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(7.32f, 4.88f);
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
