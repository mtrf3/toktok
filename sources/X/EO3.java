package X;

import Y.IDxS307S0100000_6;
import com.ss.android.ugc.aweme.ecommerce.base.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PipoTokenInfo;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EO3 {
    public static Cashier LIZ;
    public static PipoTokenInfo LIZIZ;
    public static final CopyOnWriteArraySet<Integer> LIZJ = new CopyOnWriteArraySet<>();
    public static XKQ LIZLLL;

    public static void LIZIZ(Object obj) {
        o.LJIIIZ(obj, "obj");
        LIZJ.remove(Integer.valueOf(obj.hashCode()));
    }

    public static void LIZLLL(String str) {
        C22780uw.LIZ.getClass();
        if (C276216o.LJIIL.LJIIJJI) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C36150EGs(str, null), 3);
        }
    }

    public static void LIZJ(Object obj, String str) {
        o.LJIIIZ(obj, "obj");
        LIZJ.add(Integer.valueOf(obj.hashCode()));
        XKQ xkq = LIZLLL;
        if (xkq != null && xkq.isActive()) {
            return;
        }
        XKQ xkq2 = LIZLLL;
        if (xkq2 != null) {
            xkq2.LIZIZ(null);
        }
        LIZLLL = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C36151EGt(str, null), 2);
    }

    public static Object LIZ(String str, boolean z, InterfaceC67352kd interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        EO4 eo4 = PaymentApi.LIZ;
        Boolean valueOf = Boolean.valueOf(z);
        eo4.getClass();
        EO4.LIZ(valueOf, str).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LIZ(new IDxS307S0100000_6(c84654XKg, 0));
        return c84654XKg.LIZ();
    }
}
