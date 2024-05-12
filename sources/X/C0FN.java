package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0FN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0FN implements TypeEvaluator {
    public static final C0FN LIZ = new C0FN();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        float f3 = ((intValue >> 16) & 255) / 255.0f;
        float f4 = ((intValue >> 8) & 255) / 255.0f;
        float f5 = (intValue & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f6 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(f3, 2.2d);
        float pow2 = (float) Math.pow(f4, 2.2d);
        float pow3 = (float) Math.pow(f5, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float LIZIZ = C06420Na.LIZIZ(f6, f2, f, f2);
        float LIZIZ2 = C06420Na.LIZIZ(pow4, pow, f, pow);
        float LIZIZ3 = C06420Na.LIZIZ(pow5, pow2, f, pow2);
        float LIZIZ4 = C06420Na.LIZIZ(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(LIZIZ2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(LIZIZ3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(LIZIZ4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(LIZIZ * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
