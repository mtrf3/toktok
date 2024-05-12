package X;

import com.bytedance.lobby.auth.AuthResult;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class QBB {
    public static volatile QBB LIZIZ;
    public final C1HQ LIZ = new C1HQ();

    public static QBB LIZ() {
        if (LIZIZ == null) {
            synchronized (QBB.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QBB();
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(int i, AuthResult authResult, String str) {
        synchronized (this.LIZ) {
            List list = (List) this.LIZ.getOrDefault(new C15070iV(str, Integer.valueOf(i)), null);
            if (list != null && authResult != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((QBC) it.next()).onAuthResult(authResult);
                }
                list.clear();
            }
        }
    }
}
