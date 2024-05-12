package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249159qB {
    public static final String LIZ(Exception e) {
        o.LJIIIZ(e, "e");
        StringBuilder sb = new StringBuilder();
        sb.append(e.getMessage());
        StackTraceElement[] stackTrace = e.getStackTrace();
        int i = 0;
        if (stackTrace != null && stackTrace.length != 0) {
            sb.append(" | ");
            int length = stackTrace.length;
            int length2 = stackTrace.length;
            int i2 = 0;
            while (i < length2) {
                int i3 = i2 + 1;
                sb.append(stackTrace[i]);
                if (i2 != length - 1) {
                    sb.append("\n");
                }
                i++;
                i2 = i3;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }
}
