package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.Smr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73121Smr {
    public final InterfaceC73122Sms LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final RectF LJFF;
    public final float[] LJI;
    public final Path LJII;
    public final Paint LJIIIIZZ;
    public final PorterDuffXfermode LJIIIZ;

    public C73121Smr(InterfaceC73122Sms view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LJFF = new RectF();
        this.LJI = new float[8];
        this.LJII = new Path();
        this.LJIIIIZZ = new Paint(1);
        this.LJIIIZ = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    }
}
