package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.jvm.internal.o;

/* renamed from: X.17E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17E {
    public static final float LJIIIZ = C15380j0.LIZ(240.0f);
    public float LIZ;
    public Paint.Align LIZIZ = Paint.Align.CENTER;
    public final int LIZJ = 3;
    public C17C LIZLLL = C17B.LIZ(Paint.Align.CENTER);
    public final Paint LJ = new Paint();
    public final Paint LJFF;
    public final Paint LJI;
    public final Paint LJII;
    public int LJIIIIZZ;

    public C17E() {
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LJFF = new Paint();
        this.LJI = new Paint();
        this.LJII = new Paint();
        this.LJIIIIZZ = 2;
    }

    public final void LIZ(Paint.Align align, int i) {
        o.LJIIIZ(align, "align");
        this.LIZIZ = align;
        this.LIZLLL = C17B.LIZ(align);
        this.LJFF.setTextAlign(this.LIZIZ);
        this.LJI.setTextAlign(this.LIZIZ);
        this.LJII.setTextAlign(this.LIZIZ);
        this.LJ.setTextAlign(this.LIZIZ);
    }
}
