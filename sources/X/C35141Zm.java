package X;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: X.1Zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35141Zm extends C06780Ok<PointF> {
    public Path LJIILJJIL;
    public final C06780Ok<PointF> LJIILL;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        boolean z;
        T t;
        T t2 = this.LIZJ;
        if (t2 != 0 && (t = this.LIZIZ) != 0 && ((PointF) t).equals(((PointF) t2).x, ((PointF) t2).y)) {
            z = true;
        } else {
            z = false;
        }
        T t3 = this.LIZJ;
        if (t3 != 0 && !z) {
            PointF pointF = (PointF) this.LIZIZ;
            PointF pointF2 = (PointF) t3;
            C06780Ok<PointF> c06780Ok = this.LJIILL;
            PointF pointF3 = c06780Ok.LJIIL;
            PointF pointF4 = c06780Ok.LJIILIIL;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
                float f = pointF3.x + pointF.x;
                float f2 = pointF.y + pointF3.y;
                float f3 = pointF2.x;
                float f4 = f3 + pointF4.x;
                float f5 = pointF2.y;
                path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.LJIILJJIL = path;
        }
    }

    public C35141Zm(C0GY c0gy, C06780Ok<PointF> c06780Ok) {
        super(c0gy, c06780Ok.LIZIZ, c06780Ok.LIZJ, c06780Ok.LIZLLL, c06780Ok.LJ, c06780Ok.LJFF);
        this.LJIILL = c06780Ok;
        LIZLLL();
    }
}
