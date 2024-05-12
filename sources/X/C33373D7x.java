package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33373D7x extends AbstractC39455Fe7 {
    public C33373D7x() {
        C32856Cuy.jo(this.LIZJ);
        this.LIZJ.LJIIIIZZ(34.0f, 24.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-3.32f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, false, -0.5f, 0.95f);
        this.LIZJ.LJIIL(5.17f, 7.15f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.8f, 0.8f, false, false, 1.3f, 0.0f);
        this.LIZJ.LJIIL(5.16f, -7.15f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, false, -0.48f, -0.95f);
        C32856Cuy.P6(this.LIZJ);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, false, false, -20.96f, -12.15f);
        this.LIZJ.LJIIJ(-0.55f, 0.31f, -0.61f, 1.05f, -0.17f, 1.49f);
        this.LIZJ.LJIIL(1.5f, 1.5f);
        this.LIZJ.LJIIJ(0.32f, 0.32f, 0.82f, 0.38f, 1.23f, 0.18f);
        this.LIZJ.LIZJ(10.0f, 10.0f, false, true, 34.0f, 24.0f);
        this.LIZJ.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILIIL(-24.0f, 0.0f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, false, false, 20.96f, 12.15f);
        this.LIZJ.LJIIJ(0.54f, -0.31f, 0.6f, -1.05f, 0.17f, -1.49f);
        this.LIZJ.LJIIL(-1.5f, -1.5f);
        this.LIZJ.LJIIIZ(1.07f, 1.07f, false, false, -1.23f, -0.18f);
        this.LIZJ.LIZJ(10.0f, 10.0f, false, true, 14.0f, 24.0f);
        C32856Cuy.Fb(this.LIZJ);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, false, 0.5f, -0.95f);
        this.LIZJ.LJIIL(-5.17f, -7.15f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(0.8f, 0.8f, false, false, -1.3f, 0.0f);
        this.LIZJ.LJIIL(-5.16f, 7.15f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, false, 0.48f, 0.95f);
        C32856Cuy.LLLLIIIILLL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
