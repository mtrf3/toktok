package X;

import android.animation.TypeEvaluator;

/* loaded from: classes15.dex */
public final class WFN implements TypeEvaluator<Float> {
    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f2, Float f3) {
        if (f <= 0.5d) {
            return Float.valueOf(f);
        }
        return Float.valueOf(1 - f);
    }
}
