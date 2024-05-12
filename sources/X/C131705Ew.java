package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.5Ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C131705Ew implements InterfaceC131725Ey {
    public final Paint LIZ;
    public final Path LIZIZ;
    public final float LIZJ;
    public final RectF LIZLLL;
    public final float LJ;

    @Override // X.InterfaceC131725Ey
    public final void LIZIZ() {
    }

    public C131705Ew(Context context) {
        Paint paint = new Paint();
        paint.setStrokeWidth(C17N.LJIILL(1.0d));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.LIZ = paint;
        this.LIZIZ = new Path();
        C17N.LJIILL(13.0d);
        this.LIZJ = 1.0f;
        this.LIZLLL = new RectF();
        this.LJ = C17N.LJIILL(30.0d) / 1000.0f;
    }
}
