package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33497DCr extends AbstractC39455Fe7 {
    public C33497DCr() {
        this.LIZJ.LJIIIIZZ(42.0f, 8.9f);
        this.LIZJ.LJIILL(20.27f);
        this.LIZJ.LJIIJ(0.0f, 0.7f, -0.4f, 1.34f, -1.02f, 1.65f);
        this.LIZJ.LJIIJ(-5.35f, 2.68f, -12.44f, 3.51f, -17.55f, -0.15f);
        this.LIZJ.LJIIJ(-3.68f, -2.63f, -8.5f, -1.84f, -12.43f, -0.29f);
        C32856Cuy.LLJLL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(8.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        this.LIZJ.LJIJ(8.9f);
        this.LIZJ.LJIIJ(0.0f, -0.7f, 0.4f, -1.34f, 1.02f, -1.66f);
        this.LIZJ.LJIIJ(5.29f, -2.6f, 12.41f, -3.52f, 17.55f, 0.15f);
        this.LIZJ.LJIIJ(4.02f, 2.87f, 9.61f, 1.87f, 13.76f, -0.15f);
        this.LIZJ.LJIIJ(1.2f, -0.6f, 2.67f, 0.3f, 2.67f, 1.65f);
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
