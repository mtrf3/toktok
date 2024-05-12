package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33468DBo extends AbstractC39455Fe7 {
    public C33468DBo() {
        this.LIZJ.LJIIIIZZ(3.5f, 22.31f);
        this.LIZJ.LJ(4.1f, 11.27f, 13.06f, 2.5f, 24.02f, 2.5f);
        this.LIZJ.LJIIJ(10.97f, 0.0f, 19.93f, 8.77f, 20.52f, 19.81f);
        this.LIZJ.LJIIIZ(3.08f, 3.08f, false, true, -3.05f, 3.26f);
        this.LIZJ.LJI(27.1f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(11.54f);
        this.LIZJ.LJIIIZ(8.3f, 8.3f, false, true, -8.22f, 8.39f);
        this.LIZJ.LJIIJ(-4.2f, 0.0f, -7.66f, -3.2f, -8.16f, -7.34f);
        this.LIZJ.LJIIIZ(0.95f, 0.95f, false, true, 0.96f, -1.05f);
        C32856Cuy.Db(this.LIZJ);
        this.LIZJ.LJIIJ(0.57f, 0.0f, 1.01f, 0.48f, 1.15f, 1.04f);
        this.LIZJ.LJIIIZ(4.13f, 4.13f, false, false, 3.99f, 3.15f);
        this.LIZJ.LJIIIZ(4.15f, 4.15f, false, false, 4.1f, -4.19f);
        this.LIZJ.LJIJ(25.57f);
        this.LIZJ.LJI(6.57f);
        this.LIZJ.LJIIIZ(3.08f, 3.08f, false, true, -3.06f, -3.26f);
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
