package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: X.U8u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76712U8u {
    public boolean LIZ;
    public final Path LIZIZ = new Path();
    public final Paint LIZJ;
    public final Paint LIZLLL;
    public final PorterDuffXfermode LJ;
    public float LJFF;
    public float LJI;
    public final Paint LJII;

    public C76712U8u() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LIZJ = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        this.LIZLLL = paint2;
        this.LJ = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(0);
        this.LJII = paint3;
    }
}
