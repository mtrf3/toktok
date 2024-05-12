package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* renamed from: X.0lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17130lp {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C22N.LJLIL);

    public static long LIZ() {
        Object LIZ2;
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(C30725C4b.LIZ() / 1000);
            LIZ3.append((String) LIZ.getValue());
            LIZ2 = Long.valueOf(CastLongProtector.parseLong(X1D.LIZIZ(LIZ3)));
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C0NB.LJI("LiveGiftGuidePredictManager", m10exceptionOrNullimpl);
            LIZ2 = 0L;
        }
        return ((Number) LIZ2).longValue();
    }
}
