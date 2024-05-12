package X;

import X.C93355aPX;
import Y.IDRunnableS91S0100000_34;
import android.os.Handler;
import android.os.RemoteException;
import java.util.HashMap;

/* renamed from: X.aPY, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public abstract class AbstractC93356aPY<O, C extends C93355aPX> {
    public final C68824Qzk LIZ;
    public final java.util.Map<O, C> LIZIZ;

    public AbstractC93356aPY(C68824Qzk c68824Qzk) {
        new HashMap();
        this.LIZIZ = new HashMap();
        this.LIZ = c68824Qzk;
        new Handler(C16880lQ.LLJJJJ()).post(new IDRunnableS91S0100000_34(this, 1));
    }

    public final void LJIIIIZZ(Object obj) {
        C93355aPX c93355aPX = (C93355aPX) ((HashMap) this.LIZIZ).get(obj);
        if (c93355aPX != null && c93355aPX.LIZ.remove(obj)) {
            ((HashMap) c93355aPX.LIZIZ.LIZIZ).remove(obj);
            c93355aPX.LIZIZ.getClass();
            R0A r0a = (R0A) obj;
            r0a.getClass();
            try {
                r0a.LIZ.LJIILLIIL();
            } catch (RemoteException e) {
                throw new C68463Qtv(e);
            }
        }
    }
}
