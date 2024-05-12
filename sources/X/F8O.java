package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class F8O implements InterfaceC38474F8c {
    public static final List<String> LIZ;

    @Override // X.InterfaceC38474F8c
    public final void registerCondition() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        C29822Bn8.LIZJ(arrayList, "FILE_PROVIDER_PATHS", "NullPointerException", "Failed to resolve canonical path", "android.os.DeadSystemException");
        arrayList.add("Package manager has died");
    }

    @Override // X.InterfaceC38474F8c
    public final boolean LIZ(Object obj, Throwable th) {
        for (StackTraceElement stackTraceElement : C16880lQ.LLLLIIIILLL().getStackTrace()) {
            if (stackTraceElement.getMethodName().contains("installProvider") && th != null) {
                String th2 = th.toString();
                Iterator it = ((ArrayList) LIZ).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (th2.contains(str)) {
                        C1JX.LJIIIIZZ("Hint the crash ", str);
                        F8X.LIZIZ(F8W.DEBUG);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
