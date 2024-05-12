package X;

import kotlin.jvm.internal.o;

/* renamed from: X.L5v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53703L5v {
    public static final EnumC53701L5t LIZ(EnumC53695L5n enumC53695L5n) {
        o.LJIIIZ(enumC53695L5n, "<this>");
        int i = C53694L5m.LIZ[enumC53695L5n.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return EnumC53701L5t.NONE;
                    }
                    return EnumC53701L5t.RED_RING;
                }
                return EnumC53701L5t.PRORGRESS;
            }
            return EnumC53701L5t.GRAY_RING;
        }
        return EnumC53701L5t.BRAND_RING;
    }
}
