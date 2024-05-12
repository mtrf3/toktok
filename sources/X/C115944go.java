package X;

import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115944go {
    public static C115944go LIZJ;
    public final java.util.Set<Object> LIZ = new CopyOnWriteArraySet();
    public final java.util.Set<String> LIZIZ = new CopyOnWriteArraySet();

    public static C115944go LIZJ() {
        if (LIZJ == null) {
            synchronized (C115944go.class) {
                if (LIZJ == null) {
                    LIZJ = new C115944go();
                }
            }
        }
        return LIZJ;
    }

    public static void LIZ(String str) {
        C63291Osh.LIZ().getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LeakMsgRepairManager getLoadNewerMaxIndex no recent mode, cid:");
        LIZ.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
    }

    public static void LIZIZ(String str) {
        C63291Osh.LIZ().getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LeakMsgRepairManager getLoadOlderMinIndex no recent mode, cid:");
        LIZ.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
    }

    public final boolean LIZLLL(String str) {
        if (!TextUtils.isEmpty(str) && ((CopyOnWriteArraySet) this.LIZIZ).contains(str)) {
            return true;
        }
        return false;
    }
}
