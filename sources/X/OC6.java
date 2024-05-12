package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes11.dex */
public final class OC6 {
    public static boolean LIZ;
    public static final List<OC8> LIZIZ = new CopyOnWriteArrayList();
    public static final OC7 LIZJ = new OC7();

    public static void LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        if (!LIZ) {
            return;
        }
        LIZ("GeckoBucketExecutor", interfaceC65784Pro.invoke());
    }

    public static void LJFF(InterfaceC65784Pro interfaceC65784Pro) {
        String str;
        if (!LIZ) {
            return;
        }
        if (interfaceC65784Pro == null) {
            str = "";
        } else {
            str = (String) interfaceC65784Pro.invoke();
        }
        LJ("GeckoBucketExecutor", str, null);
    }

    public static void LIZ(String str, Object... objArr) {
        if (!LIZ) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ;
        if (copyOnWriteArrayList.size() == 0) {
            LIZJ.LIZJ(objArr);
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((OC8) it.next()).LIZJ(objArr);
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (!LIZ) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ;
        if (copyOnWriteArrayList.size() == 0) {
            LIZJ.getClass();
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((OC8) it.next()).LIZIZ();
        }
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        if (!LIZ) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ;
        if (copyOnWriteArrayList.size() == 0) {
            LIZJ.getClass();
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((OC8) it.next()).LIZLLL();
        }
    }

    public static void LJ(String str, String str2, Throwable th) {
        if (!LIZ) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ;
        if (copyOnWriteArrayList.size() == 0) {
            LIZJ.getClass();
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((OC8) it.next()).LIZ();
        }
    }
}
