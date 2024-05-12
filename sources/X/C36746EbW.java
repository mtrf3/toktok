package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EbW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36746EbW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, Object obj) {
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
            o.LJIIIIZZ(stackTraceElement, "stackTraceElement");
            String className = stackTraceElement.getClassName();
            o.LJIIIIZZ(className, "className");
            String LJLLILLLL = s.LJLLILLLL('.', className, className);
            StringBuilder sb = new StringBuilder();
            String stackTraceElement2 = stackTraceElement.toString();
            o.LJIIIIZZ(stackTraceElement2, "toString()");
            String substring = stackTraceElement2.substring(stackTraceElement.getClassName().length() + 1);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            sb.append(' ');
            if (obj instanceof Throwable) {
                obj = android.util.Log.getStackTraceString((Throwable) obj);
            } else if (obj instanceof Object[]) {
                obj = Arrays.toString((Object[]) obj);
                o.LJIIIIZZ(obj, "toString(this)");
            }
            sb.append(obj);
            android.util.Log.println(i, LJLLILLLL, sb.toString());
        }
    }
}
