package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33351D7b extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33351D7b() {
        this.LIZJ.LJIIIIZZ(41.44f, 47.37f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -1.15f, -0.53f);
        this.LIZJ.LJIIIZ(13.22f, 13.22f, false, false, -20.15f, 0.0f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, true, -2.12f, 0.17f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -0.17f, -2.12f);
        this.LIZJ.LJIIIZ(16.21f, 16.21f, false, true, 24.74f, 0.0f);
        this.LIZJ.LJIIIZ(1.51f, 1.51f, false, true, -1.15f, 2.48f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(19.18f, 34.34f);
        C32856Cuy.k3(this.LIZJ);
        this.LIZJ.LJIILL(-4.59f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.5f, 1.5f, true, true, 3.0f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(4.58f);
        this.LIZJ.LJIIJ(0.0f, 0.84f, -0.66f, 1.5f, -1.5f, 1.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(39.75f, 32.83f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.5f, 1.5f, true, false, 3.0f, 0.0f);
        this.LIZJ.LJIILL(-4.58f);
        C32856Cuy.K5(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.w3(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
