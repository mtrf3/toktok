package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nf8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59902Nf8 {
    public static EnumC59901Nf7 LIZ(String str) {
        for (EnumC59901Nf7 enumC59901Nf7 : EnumC59901Nf7.values()) {
            if (o.LJ(str, enumC59901Nf7.getVALUE())) {
                return enumC59901Nf7;
            }
        }
        Integer LJJIL = C38350F3i.LJJIL(str);
        if (LJJIL != null) {
            int intValue = LJJIL.intValue();
            EnumC59901Nf7.Companion.getClass();
            for (EnumC59901Nf7 enumC59901Nf72 : EnumC59901Nf7.values()) {
                if (intValue == enumC59901Nf72.getVALUE_INT()) {
                    return enumC59901Nf72;
                }
            }
        }
        return null;
    }
}
