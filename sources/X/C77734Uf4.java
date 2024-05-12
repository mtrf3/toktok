package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Uf4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77734Uf4 extends C77733Uf3 {
    public static final C77734Uf4 LIZJ;
    public static final java.util.Set<InterfaceC77737Uf7> LIZLLL;

    public C77734Uf4() {
        super(null);
    }

    static {
        C77734Uf4 c77734Uf4 = new C77734Uf4();
        LIZJ = c77734Uf4;
        LIZLLL = new CopyOnWriteArraySet();
        c77734Uf4.LIZIZ = false;
    }

    @Override // X.C77733Uf3, X.InterfaceC78395Upj
    public final void LIZLLL(C78368UpI c78368UpI, List<? extends AbsIapProduct> list) {
        String str;
        this.LIZIZ = false;
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator it = ((CopyOnWriteArraySet) LIZLLL).iterator();
        while (it.hasNext()) {
            InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) it.next();
            if (c78368UpI != null) {
                str = c78368UpI.LIZ;
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            interfaceC77737Uf7.LJIJJLI();
            if (C38354F3m.LIZJ(valueOf, "")) {
                LJIILL(interfaceC77737Uf7, c78368UpI, list);
            }
        }
    }

    @Override // X.C77733Uf3, X.InterfaceC78395Upj
    public final void LJFF(C78368UpI c78368UpI, OrderInfo orderInfo) {
        java.util.Map<String, String> map;
        String str;
        if (c78368UpI != null) {
            map = c78368UpI.getPerformanceLog();
        } else {
            map = null;
        }
        if (C77640UdY.LIZ) {
            if (map == null) {
                map = new HashMap<>();
            }
            C77640UdY.LJII = map;
        }
        this.LIZIZ = false;
        Iterator it = ((CopyOnWriteArraySet) LIZLLL).iterator();
        while (it.hasNext()) {
            InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) it.next();
            if (c78368UpI != null) {
                str = c78368UpI.LIZ;
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            interfaceC77737Uf7.LJIJJLI();
            if (C38354F3m.LIZJ(valueOf, "")) {
                LJIILIIL(interfaceC77737Uf7, c78368UpI, orderInfo);
            }
        }
    }

    @Override // X.C77733Uf3, X.InterfaceC78395Upj
    public final void LJII(C78368UpI c78368UpI, OrderInfo orderInfo) {
        this.LIZIZ = true;
        LJIIJ(null, c78368UpI, orderInfo);
    }

    @Override // X.C77733Uf3, X.InterfaceC78395Upj
    public final void LIZJ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List<? extends AbsIapProduct> list) {
        String str;
        this.LIZIZ = false;
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator it = ((CopyOnWriteArraySet) LIZLLL).iterator();
        while (it.hasNext()) {
            InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) it.next();
            if (c78368UpI != null) {
                str = c78368UpI.LIZ;
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            interfaceC77737Uf7.LJIJJLI();
            if (C38354F3m.LIZJ(valueOf, "")) {
                LJIILJJIL(interfaceC77737Uf7, iapPaymentMethod, c78368UpI, list);
            }
        }
    }
}
