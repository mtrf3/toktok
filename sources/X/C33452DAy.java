package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33452DAy extends AbstractC39455Fe7 {
    public C33452DAy() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(41.0f, 5.0f);
        this.LIZJ.LJI(24.99f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(14.0f);
        this.LIZJ.LJIILL(13.99f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJIIJJI(2.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.01f, -1.0f);
        C32856Cuy.b1(this.LIZJ);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 41.0f, 5.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.0f, 24.01f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p4.LJIILL(14.0f);
        this.LIZJ.LJIIJJI(14.01f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p5.LJIILL(2.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 0.99f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-16.0f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 5.0f, 41.0f);
        this.LIZJ.LJIJ(25.01f);
        C32856Cuy.sk(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
