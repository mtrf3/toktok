package X;

import android.animation.TypeEvaluator;

/* renamed from: X.BqL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30021BqL implements TypeEvaluator<OSZ<? extends Float, ? extends Float>> {
    public static final C30021BqL LIZ = new C30021BqL();

    @Override // android.animation.TypeEvaluator
    public final OSZ<? extends Float, ? extends Float> evaluate(float f, OSZ<? extends Float, ? extends Float> osz, OSZ<? extends Float, ? extends Float> osz2) {
        OSZ<? extends Float, ? extends Float> osz3 = osz;
        OSZ<? extends Float, ? extends Float> osz4 = osz2;
        if (osz3 == null || osz4 == null) {
            return new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        return new OSZ<>(Float.valueOf(osz3.getFirst().floatValue() + ((osz4.getFirst().floatValue() - osz3.getFirst().floatValue()) * f)), Float.valueOf(osz3.getSecond().floatValue() + ((osz4.getSecond().floatValue() - osz3.getSecond().floatValue()) * f)));
    }
}
