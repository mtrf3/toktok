package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.EeM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36922EeM {
    public static volatile boolean LIZ;
    public static CopyOnWriteArrayList<InterfaceC36921EeL> LIZIZ;
    public static Context LIZJ;

    public static void LIZ(Exception exc) {
        LIZIZ(exc, "");
    }

    public static void LJ(String str) {
        LIZLLL(3, null, str);
    }

    public static void LJFF(Throwable th) {
        CopyOnWriteArrayList<InterfaceC36921EeL> copyOnWriteArrayList;
        if (LIZ && (copyOnWriteArrayList = LIZIZ) != null) {
            Iterator<InterfaceC36921EeL> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC36921EeL next = it.next();
                if (next != null && next.isEnable()) {
                    next.getLogTag();
                    next.LIZJ("AppLog", th);
                }
            }
        }
    }

    public static void LIZIZ(Exception exc, String str) {
        CopyOnWriteArrayList<InterfaceC36921EeL> copyOnWriteArrayList;
        if (LIZ && (copyOnWriteArrayList = LIZIZ) != null) {
            Iterator<InterfaceC36921EeL> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC36921EeL next = it.next();
                if (next != null && next.isEnable()) {
                    next.getLogTag();
                    next.LIZLLL("AppLog", str, exc);
                }
            }
        }
    }

    public static synchronized void LIZJ(Context context, List<InterfaceC36921EeL> list) {
        synchronized (C36922EeM.class) {
            if (!LIZ) {
                if (context != null) {
                    LIZJ = C16880lQ.LLLLL(context);
                    if (!((ArrayList) list).isEmpty()) {
                        LIZIZ = new CopyOnWriteArrayList<>(list);
                    }
                    CopyOnWriteArrayList<InterfaceC36921EeL> copyOnWriteArrayList = LIZIZ;
                    if (copyOnWriteArrayList != null) {
                        Iterator<InterfaceC36921EeL> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            InterfaceC36921EeL next = it.next();
                            if (next != null && next.isEnable()) {
                                next.init(LIZJ);
                            }
                        }
                    }
                    LIZ = true;
                } else {
                    throw new IllegalArgumentException("Context can't be null!");
                }
            } else {
                throw new IllegalStateException("CrashlyticsWrapper already inited!");
            }
        }
    }

    public static void LIZLLL(int i, String str, String str2) {
        CopyOnWriteArrayList<InterfaceC36921EeL> copyOnWriteArrayList;
        String str3;
        if (LIZ && (copyOnWriteArrayList = LIZIZ) != null) {
            Iterator<InterfaceC36921EeL> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC36921EeL next = it.next();
                if (next != null && next.isEnable()) {
                    if (str == null) {
                        next.getLogTag();
                        str3 = "AppLog";
                    } else {
                        str3 = str;
                    }
                    next.LIZ(i, str3, str2);
                }
            }
        }
    }

    public static void LJI(int i, String str, String str2) {
        if (C16880lQ.LLLZLL()) {
            return;
        }
        LIZLLL(i, str, str2);
    }
}
