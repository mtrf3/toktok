package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33501DCv extends AbstractC39455Fe7 {
    public C33501DCv() {
        this.LIZJ.LJIIIIZZ(43.41f, 22.59f);
        this.LIZJ.LJII(28.12f, 7.29f);
        C32856Cuy.ln(this.LIZJ);
        this.LIZJ.LJII(37.17f, 22.0f);
        C32856Cuy.LJJLIIIJILLIZJL(this.LIZJ);
        this.LIZJ.LJIIJJI(32.17f);
        this.LIZJ.LJII(25.3f, 37.88f);
        C32856Cuy.Df(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(15.3f, -15.3f);
        C32856Cuy.P5(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
