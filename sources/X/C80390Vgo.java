package X;

import android.animation.TypeEvaluator;

/* renamed from: X.Vgo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80390Vgo implements TypeEvaluator<Integer> {
    public static final C80390Vgo LIZ = new C80390Vgo();

    public static Integer LIZ(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        float f3 = ((intValue >> 16) & 255) / 255.0f;
        float f4 = ((intValue >> 8) & 255) / 255.0f;
        float f5 = (intValue & 255) / 255.0f;
        int intValue2 = num2.intValue();
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

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        return LIZ(f, num, num2);
    }
}
