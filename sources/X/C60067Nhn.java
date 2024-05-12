package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nhn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60067Nhn {
    public static EnumC60066Nhm LIZ(String str) {
        for (EnumC60066Nhm enumC60066Nhm : EnumC60066Nhm.values()) {
            if (o.LJ(str, enumC60066Nhm.getVALUE())) {
                return enumC60066Nhm;
            }
        }
        Integer LJJIL = C38350F3i.LJJIL(str);
        if (LJJIL != null) {
            int intValue = LJJIL.intValue();
            EnumC60066Nhm.Companion.getClass();
            for (EnumC60066Nhm enumC60066Nhm2 : EnumC60066Nhm.values()) {
                if (intValue == enumC60066Nhm2.getVALUE_INT()) {
                    return enumC60066Nhm2;
                }
            }
        }
        return null;
    }
}
