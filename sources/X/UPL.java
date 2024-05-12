package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UPL {
    public static final boolean LIZ(EnumC77147UPn enumC77147UPn) {
        o.LJIIIZ(enumC77147UPn, "<this>");
        int i = UPM.LIZ[enumC77147UPn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return UTK.LIZIZ.LIZLLL(EnumC77147UPn.EMAIL).LIZ();
                    }
                    throw new C162476Zf();
                }
                return UTK.LIZIZ.LIZLLL(EnumC77147UPn.MLBB).LIZ();
            }
            return UTK.LIZIZ.LJFF(EnumC58046MqI.FACEBOOK).LIZ().LIZLLL;
        }
        return UTK.LIZIZ.LJFF(EnumC58046MqI.CONTACT).LIZ().LIZLLL;
    }
}
