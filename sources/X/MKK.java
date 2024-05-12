package X;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes10.dex */
public final class MKK implements TypeEvaluator<Float> {
    public final FloatEvaluator LIZ = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f2, Float f3) {
        float floatValue = this.LIZ.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
