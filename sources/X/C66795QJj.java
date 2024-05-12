package X;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.QJj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66795QJj {
    public static final QK3 LIZ = new QK3();
    public static final C66765QIf LIZIZ = new C66765QIf();

    public static C48852JFg LIZIZ() {
        C66765QIf c66765QIf = LIZIZ;
        Context LIZLLL = c66765QIf.LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        return c66765QIf.LIZLLL.LIZIZ(LIZLLL).LIZLLL();
    }

    public static void LIZLLL() {
        long j;
        C66765QIf c66765QIf = LIZIZ;
        Integer LIZJ = c66765QIf.LIZJ();
        C66799QJn LJ = c66765QIf.LJ();
        if (LIZJ != null) {
            if (LJ == null || TextUtils.isEmpty(LJ.LJLIL) || TextUtils.isEmpty(LJ.LJLILLLLZI)) {
                C66800QJo c66800QJo = c66765QIf.LIZJ;
                if (c66800QJo.LIZLLL.get() == null) {
                    synchronized (c66800QJo.LIZ) {
                        c66800QJo.LIZJ(LIZJ);
                        if (!c66800QJo.LJ) {
                            if (Looper.myLooper() == JFV.LIZJ(String.valueOf(LIZJ))) {
                                new RuntimeException("did generate at this thread,you shouldn't block this thread");
                            }
                            if (c66800QJo.LJFF) {
                                j = 4000;
                            } else {
                                j = 1500;
                            }
                            if (!c66800QJo.LIZIZ) {
                                try {
                                    c66800QJo.LIZ.wait(j);
                                } catch (InterruptedException e) {
                                    C16880lQ.LLLLIIL(e);
                                }
                            }
                            c66800QJo.LJ = true;
                        }
                    }
                }
                c66765QIf.LJ();
            }
        }
    }

    public static void LIZJ(QKO qko) {
        C66765QIf c66765QIf = LIZIZ;
        if (c66765QIf.LIZIZ()) {
            QJX qjx = c66765QIf.LJ;
            qjx.getClass();
            if (TextUtils.isEmpty("account_region")) {
                return;
            }
            int i = QKN.LIZ[qko.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                ((ConcurrentHashMap) qjx.LIZLLL).remove("account_region");
                return;
            }
            ((ConcurrentHashMap) qjx.LJ).remove("account_region");
        }
    }

    public static void LIZ(String str, String str2, QKO qko) {
        C66765QIf c66765QIf = LIZIZ;
        if (c66765QIf.LIZIZ()) {
            QJX qjx = c66765QIf.LJ;
            qjx.getClass();
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            int i = QKN.LIZ[qko.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                ((ConcurrentHashMap) qjx.LIZLLL).put(str, str2);
                return;
            }
            ((ConcurrentHashMap) qjx.LJ).put(str, str2);
        }
    }
}
