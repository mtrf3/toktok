package X;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.QhT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67691QhT {
    public static C67691QhT LIZIZ;
    public final C67690QhS LIZ;

    public final synchronized void LIZIZ() {
        C67690QhS c67690QhS = this.LIZ;
        ((ReentrantLock) c67690QhS.LIZ).lock();
        try {
            c67690QhS.LIZIZ.edit().clear().apply();
        } finally {
            ((ReentrantLock) c67690QhS.LIZ).unlock();
        }
    }

    public C67691QhT(Context context) {
        C67690QhS LIZ = C67690QhS.LIZ(context);
        this.LIZ = LIZ;
        LIZ.LIZIZ();
        LIZ.LIZJ();
    }

    public static synchronized C67691QhT LIZ(Context context) {
        C67691QhT LIZJ;
        synchronized (C67691QhT.class) {
            LIZJ = LIZJ(C16880lQ.LLLLL(context));
        }
        return LIZJ;
    }

    public static synchronized C67691QhT LIZJ(Context context) {
        synchronized (C67691QhT.class) {
            C67691QhT c67691QhT = LIZIZ;
            if (c67691QhT != null) {
                return c67691QhT;
            }
            C67691QhT c67691QhT2 = new C67691QhT(context);
            LIZIZ = c67691QhT2;
            return c67691QhT2;
        }
    }
}
