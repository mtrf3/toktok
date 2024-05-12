package X;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.aPX, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public class C93355aPX {
    public final java.util.Set<O> LIZ = new LinkedHashSet();
    public final /* synthetic */ AbstractC93356aPY LIZIZ;

    public final void LIZ() {
        for (Object obj : this.LIZ) {
            this.LIZIZ.getClass();
            R0A r0a = (R0A) obj;
            r0a.getClass();
            try {
                r0a.LIZ.LJIILLIIL();
                ((HashMap) this.LIZIZ.LIZIZ).remove(obj);
            } catch (RemoteException e) {
                throw new C68463Qtv(e);
            }
        }
        this.LIZ.clear();
    }

    public C93355aPX(AbstractC93356aPY abstractC93356aPY) {
        this.LIZIZ = abstractC93356aPY;
    }
}
