package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106194Et {
    public static boolean LIZ(String msgType) {
        o.LJIIIZ(msgType, "msgType");
        for (EnumC106144Eo enumC106144Eo : EnumC106144Eo.values()) {
            if (o.LJ(enumC106144Eo.getValue(), msgType)) {
                return true;
            }
        }
        return false;
    }
}
