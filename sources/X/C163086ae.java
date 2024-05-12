package X;

import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.o;

/* renamed from: X.6ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163086ae {
    public static PointF LIZ(VESize vESize, PointF pointF) {
        if (vESize == null) {
            vESize = new VESize(C81184Vtc.LJ(C16880lQ.LLLLJI(C60903NvH.LJ)), C81184Vtc.LIZLLL(C16880lQ.LLLLJI(C60903NvH.LJ)));
        }
        return new PointF(C6BL.LJIILJJIL(pointF.x / vESize.width), C6BL.LJIILJJIL(pointF.y / vESize.height));
    }

    public static OSZ LIZIZ(VESize vESize, OSZ bound) {
        o.LJIIIZ(bound, "bound");
        OSZ osz = (OSZ) bound.getFirst();
        float floatValue = ((Number) osz.getFirst()).floatValue();
        float floatValue2 = ((Number) osz.getSecond()).floatValue();
        OSZ osz2 = (OSZ) bound.getSecond();
        RectF rectF = new RectF(floatValue, floatValue2, ((Number) osz2.getFirst()).floatValue(), ((Number) osz2.getSecond()).floatValue());
        return new OSZ(LIZ(vESize, new PointF(rectF.centerX(), rectF.centerY())), LIZ(vESize, new PointF(rectF.width(), rectF.height())));
    }

    public static OSZ LIZJ(VESize vESize, OSZ osz, OSZ osz2, float f) {
        if (vESize != null) {
            OSZ osz3 = new OSZ(Float.valueOf(vESize.width / 2.0f), Float.valueOf(vESize.height / 2.0f));
            float floatValue = ((Number) osz2.getFirst()).floatValue() * vESize.width;
            float floatValue2 = ((Number) osz2.getSecond()).floatValue() * vESize.height;
            if (osz != null) {
                return new OSZ(new OSZ(Float.valueOf((((Number) osz3.getFirst()).floatValue() + floatValue) - ((((Number) osz.getFirst()).floatValue() * f) / 2.0f)), Float.valueOf((((Number) osz3.getSecond()).floatValue() + floatValue2) - ((((Number) osz.getSecond()).floatValue() * f) / 2.0f))), new OSZ(Float.valueOf(((((Number) osz.getFirst()).floatValue() * f) / 2.0f) + ((Number) osz3.getFirst()).floatValue() + floatValue), Float.valueOf(((((Number) osz.getSecond()).floatValue() * f) / 2.0f) + ((Number) osz3.getSecond()).floatValue() + floatValue2)));
            }
        }
        return new OSZ(new OSZ(Float.valueOf(0.0f), Float.valueOf(0.0f)), new OSZ(Float.valueOf(0.0f), Float.valueOf(0.0f)));
    }
}
