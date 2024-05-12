package X;

import Y.IDComparatorS38S0000000_10;
import com.bytedance.im.core.proto.Response;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.OwP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63521OwP {
    public static C63521OwP LIZIZ;
    public final C63526OwU LIZ;

    public static C63521OwP LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C63521OwP.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C63521OwP();
                }
            }
        }
        return LIZIZ;
    }

    public C63521OwP() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("config:");
        LIZ.append(C63308Osy.LJI().LIZLLL().LJJJJLL);
        C63522OwQ c63522OwQ = null;
        C63322OtC.LJI("RequestManagerFactory", X1D.LIZIZ(LIZ), null);
        C63526OwU c63526OwU = new C63526OwU();
        C63308Osy.LJI().LIZLLL().LJJJJLL.getClass();
        c63526OwU.add(new C63523OwR(new C63587OxT()));
        c63526OwU.add(new C63525OwT(new C63602Oxi()));
        if (!((HashSet) C63308Osy.LJI().LIZLLL().LJJJJLL.LIZ).isEmpty()) {
            C63308Osy.LJI().LIZLLL().LJJJJLL.getClass();
            C63308Osy.LJI().LIZLLL().LJJJJLL.getClass();
            c63522OwQ = new C63522OwQ(new C63528OwW());
        }
        c63526OwU.add(c63522OwQ);
        Collections.sort(c63526OwU, new IDComparatorS38S0000000_10(17));
        this.LIZ = c63526OwU;
    }

    public final void LIZJ(Long l) {
        Iterator<InterfaceC63520OwO> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ().LIZIZ(l);
        }
    }

    public final void LIZ(Response response, EP1 ep1) {
        if (response == null) {
            C63322OtC.LJII("receive response is null!");
            return;
        }
        C63383OuB LJFF = C63308Osy.LJI().LJFF();
        LJFF.getClass();
        XKX.LIZLLL(LJFF.LJIIL, null, null, new C117584jS(LJFF, response, null), 3);
        if (ep1 == null) {
            ep1 = new EP1();
        }
        Iterator<InterfaceC63520OwO> it = this.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC63520OwO next = it.next();
            if (next.LIZJ(response)) {
                next.LIZIZ().LJFF(response, ep1);
                return;
            }
        }
    }
}
