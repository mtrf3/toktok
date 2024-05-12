package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0e7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12350e7 {
    public static final boolean LIZ(List<String> list) {
        System.currentTimeMillis();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            System.currentTimeMillis();
            synchronized (C12370e9.class) {
                List<String> list2 = C12370e9.LIZ;
                if (!((ArrayList) list2).contains(str)) {
                    try {
                        C16880lQ.LLJJJIL(str);
                        ((ArrayList) list2).add(str);
                    } catch (UnsatisfiedLinkError unused) {
                        System.mapLibraryName(str);
                        return false;
                    } catch (Throwable unused2) {
                        return false;
                    }
                }
            }
            System.currentTimeMillis();
        }
        return true;
    }
}
