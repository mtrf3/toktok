package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33456DBc extends AbstractC39455Fe7 {
    public C33456DBc() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 13.0f);
        C32856Cuy.R0(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(0.0f, 10.0f);
        C32856Cuy.R0(this.LIZJ);
        this.LIZJ.LJIILIIL(0.94f, 9.0f);
        this.LIZJ.LJIIJ(-0.52f, 0.0f, -0.94f, 0.45f, -0.94f, 1.0f);
        C32856Cuy.A1(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.55f, 0.42f, 1.0f, 0.94f, 1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(28.12f);
        this.LIZJ.LJIIJ(0.52f, 0.0f, 0.94f, -0.45f, 0.94f, -1.0f);
        C32856Cuy.LJJLIL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.55f, -0.42f, -1.0f, -0.94f, -1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(9.94f);
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
