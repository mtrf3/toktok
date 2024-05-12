package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EhT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37115EhT {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        StringBuilder sb = new StringBuilder();
        sb.append(throwable.getClass().getName());
        sb.append(": ");
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        sb.append(message);
        sb.append('\n');
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        o.LJIIIIZZ(stackTrace, "throwable.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("at ");
            sb.append(stackTraceElement.toString());
            sb.append('\n');
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static String LIZ(String message, String str, Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        o.LJIIIZ(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(throwable.getClass().getName());
        sb.append(": ");
        sb.append(message);
        sb.append('\n');
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        o.LJIIIIZZ(stackTrace, "throwable.stackTrace");
        for (StackTraceElement it : stackTrace) {
            if (str != null && str.length() != 0) {
                o.LJIIIIZZ(it, "it");
                String className = it.getClassName();
                o.LJIIIIZZ(className, "it.className");
                if (ujb.o.LJJJLIIL(className, str, false)) {
                }
            }
            sb.append("at ");
            sb.append(it.toString());
            sb.append('\n');
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }
}
