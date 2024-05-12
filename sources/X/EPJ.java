package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EPJ implements AttachUserData {
    public static String LIZ = "";
    public static final List<Exception> LIZIZ = new ArrayList();
    public static final List<Exception> LIZJ = new ArrayList();
    public static final List<Exception> LIZLLL = new ArrayList();
    public static final List<Exception> LJ = new ArrayList();

    public static String LIZ(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String stackTraceString = android.util.Log.getStackTraceString((Throwable) it.next());
            o.LJIIIIZZ(stackTraceString, "getStackTraceString(it)");
            String str = "\n------- new line -------\n" + stackTraceString + "\n------- new line -------\n";
            o.LJIIIIZZ(str, "result.toString()");
            sb.append(str);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "result.toString()");
        return sb2;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        String str = LIZ + LIZ(LIZIZ) + LIZ(LIZJ) + LIZ(LIZLLL) + LIZ(LJ);
        o.LJIIIIZZ(str, "result.toString()");
        return C113554cx.LJJLIIIIJ(new OSZ("hox_crash_message", str));
    }
}
