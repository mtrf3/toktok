package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;

/* renamed from: X.WEx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81967WEx {
    public final RectF LIZ;
    public final RectF LIZIZ;
    public final RectF LIZJ;
    public final float LIZLLL;
    public final ImageView.ScaleType LJ;

    public C81967WEx(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, PointF pointF, float f, ImageView.ScaleType scaleType) {
        RectF rectF5 = new RectF();
        this.LIZ = rectF5;
        RectF rectF6 = new RectF();
        this.LIZIZ = rectF6;
        RectF rectF7 = new RectF();
        this.LIZJ = rectF7;
        RectF rectF8 = new RectF();
        PointF pointF2 = new PointF();
        rectF5.set(rectF);
        rectF6.set(rectF2);
        rectF7.set(rectF3);
        this.LJ = scaleType;
        this.LIZLLL = f;
        rectF8.set(rectF4);
        pointF2.set(pointF);
    }
}
