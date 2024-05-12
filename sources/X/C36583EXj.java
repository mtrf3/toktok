package X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EXj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36583EXj {
    public static String LIZ;
    public static int LIZIZ = 0;
    public static final List<InterfaceC36584EXk> LIZJ = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0123 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36583EXj.LIZIZ():java.lang.String");
    }

    public static boolean LIZJ() {
        if (LIZIZ == 0) {
            if (LIZ == null) {
                LIZ = LIZIZ();
            }
            if (LIZ != null) {
                if (new File(LIZ, "child").exists()) {
                    LIZIZ = 1;
                } else {
                    LIZIZ = 2;
                }
            }
        }
        if (LIZIZ == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZ() {
        if (!F9J.LIZIZ(EF7.LIZIZ(), 0, "new_kids_mode").edit().putBoolean("key_is_new_kids_mode", false).commit()) {
            return false;
        }
        if (LIZ == null) {
            LIZ = LIZIZ();
        }
        if (LIZ == null) {
            return false;
        }
        File file = new File(LIZ, "child");
        if (file.exists()) {
            try {
                boolean LLLZZIL = C16880lQ.LLLZZIL(file);
                Iterator it = ((ArrayList) LIZJ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC36584EXk) it.next()).LIZ();
                }
                if (!LLLZZIL) {
                    return false;
                }
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        } else {
            Iterator it2 = ((ArrayList) LIZJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC36584EXk) it2.next()).LIZ();
            }
        }
        return true;
    }

    public static boolean LIZLLL() {
        if (!F9J.LIZIZ(EF7.LIZIZ(), 0, "new_kids_mode").edit().putBoolean("key_is_new_kids_mode", true).commit()) {
            return false;
        }
        if (LIZ == null) {
            LIZ = LIZIZ();
        }
        if (LIZ == null) {
            return false;
        }
        File file = new File(LIZ, "child");
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    return false;
                }
                Iterator it = ((ArrayList) LIZJ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC36584EXk) it.next()).LIZ();
                }
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        } else {
            Iterator it2 = ((ArrayList) LIZJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC36584EXk) it2.next()).LIZ();
            }
        }
        return true;
    }
}
