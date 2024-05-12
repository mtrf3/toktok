package X;

import android.animation.TypeEvaluator;
import kotlin.jvm.internal.o;

/* renamed from: X.UxS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78874UxS implements TypeEvaluator<float[]> {
    public final float[] LIZ;

    public C78874UxS(float[] fArr) {
        this.LIZ = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] startValue = fArr;
        float[] endValue = fArr2;
        o.LJIIIZ(startValue, "startValue");
        o.LJIIIZ(endValue, "endValue");
        float[] fArr3 = this.LIZ;
        if (fArr3 == null) {
            fArr3 = new float[startValue.length];
        }
        int length = fArr3.length;
        for (int i = 0; i < length; i++) {
            float f2 = startValue[i];
            fArr3[i] = C06420Na.LIZIZ(endValue[i], f2, f, f2);
        }
        return fArr3;
    }
}
