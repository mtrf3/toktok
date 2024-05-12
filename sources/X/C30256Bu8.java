package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Bu8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30256Bu8 {
    public static EnumC30241Btt LIZ(EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        try {
            return EnumC30241Btt.valueOf(button.name());
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean LIZIZ(EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        if (LIZ(button) != null) {
            return true;
        }
        return false;
    }
}
