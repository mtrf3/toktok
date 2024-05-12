package X;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.63r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1542763r {
    public static RectF LIZ(PointF[] pointList) {
        o.LJIIIZ(pointList, "pointList");
        PointF pointF = pointList[0];
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = f;
        float f4 = f2;
        for (PointF pointF2 : pointList) {
            float f5 = pointF2.x;
            if (f5 < f) {
                f = f5;
            }
            if (f5 > f3) {
                f3 = f5;
            }
            float f6 = pointF2.y;
            if (f6 < f2) {
                f2 = f6;
            }
            if (f6 > f4) {
                f4 = f6;
            }
        }
        return new RectF(f, f2, f3, f4);
    }
}
