package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E43 {
    public static String LIZ(Exception exc) {
        if (exc == null) {
            return null;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        if (C78857UxB.LJJJIL(message) && message.length() > 200) {
            String substring = message.substring(0, 200);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return message;
    }
}
