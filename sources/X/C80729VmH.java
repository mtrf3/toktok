package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VmH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80729VmH {
    public static String LIZ(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        String hexString = Integer.toHexString(i);
        o.LJIIIIZZ(hexString, "toHexString(gravity)");
        return hexString;
    }
}
