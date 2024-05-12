package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33424D9w extends AbstractC39455Fe7 {
    public C33424D9w() {
        this.LIZJ.LJIIIIZZ(8.5f, 7.77f);
        this.LIZJ.LIZJ(4.8f, 4.8f, false, true, 13.34f, 3.0f);
        this.LIZJ.LJIIJJI(21.32f);
        this.LIZJ.LJIIIZ(4.8f, 4.8f, false, true, 4.84f, 4.77f);
        this.LIZJ.LJIILL(32.46f);
        this.LIZJ.LIZJ(4.8f, 4.8f, false, true, 34.66f, 45.0f);
        this.LIZJ.LJI(13.34f);
        this.LIZJ.LJIIIZ(4.8f, 4.8f, false, true, -4.84f, -4.77f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(7.77f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.69f, 2.18f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(2.1f);
        this.LIZJ.LJIIJ(0.0f, 0.52f, 0.43f, 0.95f, 0.97f, 0.95f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(9.68f);
        this.LIZJ.LJIIJ(0.54f, 0.0f, 0.97f, -0.43f, 0.97f, -0.95f);
        C32856Cuy.LJJJLL(this.LIZJ);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, false, -0.97f, -0.95f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-9.68f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, false, -0.97f, 0.95f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 38.32f);
        this.LIZJ.LJIIJ(1.6f, 0.0f, 2.9f, -1.28f, 2.9f, -2.87f);
        this.LIZJ.LJIIJ(0.0f, -1.58f, -1.3f, -2.86f, -2.9f, -2.86f);
        this.LIZJ.LJIIJ(-1.6f, 0.0f, -2.9f, 1.28f, -2.9f, 2.86f);
        this.LIZJ.LJIIJ(0.0f, 1.59f, 1.3f, 2.87f, 2.9f, 2.87f);
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
