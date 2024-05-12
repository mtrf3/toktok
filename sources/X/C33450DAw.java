package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33450DAw extends AbstractC39455Fe7 {
    public C33450DAw() {
        C32856Cuy.ud(this.LIZJ);
        this.LIZJ.LJIIL(2.48f, -2.47f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, -2.83f);
        C32856Cuy.S2(this.LIZJ);
        this.LIZJ.LJIIL(27.46f, -9.45f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.76f, -3.31f);
        Q7L.LIZLLL(this.LIZJ, "p", -18.0f, -18.0f);
        this.LIZJ.LJIIIIZZ(9.23f, 37.98f);
        this.LIZJ.LJIIL(7.07f, -20.55f);
        this.LIZJ.LJIIL(13.48f, 13.48f);
        this.LIZJ.LJIIL(-20.55f, 7.07f);
        this.LIZJ.LIZLLL();
        C32856Cuy.ik(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(2.13f, 2.13f);
        this.LIZJ.LJIIJ(0.2f, 0.19f, 0.5f, 0.19f, 0.7f, 0.0f);
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
