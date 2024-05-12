package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23200vc {
    public static final float LIZ = 10;

    public static final float LIZ(InterfaceC23370vt getRippleEndRadius, boolean z, long j) {
        o.LJIIIZ(getRippleEndRadius, "$this$getRippleEndRadius");
        float LIZJ = C10370av.LIZJ(C78923UyF.LIZ(C10430b1.LIZLLL(j), C10430b1.LIZIZ(j))) / 2.0f;
        if (z) {
            return LIZJ + getRippleEndRadius.LJJJJIZL(LIZ);
        }
        return LIZJ;
    }
}
