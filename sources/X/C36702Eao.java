package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Eao, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36702Eao {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C33671DJj.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZIZ(long j, String str) {
        LIZ().getString("fc_cool_down_type", "");
        long j2 = LIZ().getLong("fc_cool_down_end_ms", 0L);
        long LIZ2 = UXR.LIZ() + j;
        if (LIZ2 > j2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[FC] NEW COOLDOWN STARTED: ");
            LIZ3.append(str);
            C0NB.LIZIZ("HotWordGift", X1D.LIZIZ(LIZ3));
            LIZ().storeString("fc_cool_down_type", str);
            LIZ().storeLong("fc_cool_down_end_ms", LIZ2);
        }
    }
}
