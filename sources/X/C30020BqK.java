package X;

import android.animation.TypeEvaluator;

/* renamed from: X.BqK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30020BqK implements TypeEvaluator<Float> {
    public float LIZ;

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f2, Float f3) {
        return Float.valueOf((float) ((Math.pow(1.0f - f, 2.0d) * f2.floatValue()) + (2.0f * f * r5 * this.LIZ) + (f3.floatValue() * f * f)));
    }
}
