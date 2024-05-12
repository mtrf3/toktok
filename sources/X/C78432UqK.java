package X;

import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.UqK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C78432UqK implements C0HJ {
    public final /* synthetic */ Object LIZ;

    public /* synthetic */ C78432UqK(Object obj) {
        this.LIZ = obj;
    }

    @Override // X.C0HJ
    public final void LIZ(C0HE c0he, String str) {
        C78431UqJ c78431UqJ = (C78431UqJ) this.LIZ;
        ConsumeIapProductListener consumeIapProductListener = (ConsumeIapProductListener) ((ConcurrentHashMap) c78431UqJ.LIZLLL.LIZLLL).get(str);
        if (consumeIapProductListener != null) {
            if (c78431UqJ.LIZLLL.LJ.size() == 0) {
                C78273Unl.LJIIIZ().LJ().getClass();
            }
            Iterator<Purchase> it = c78431UqJ.LIZLLL.LJ.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().LIZLLL())) {
                    consumeIapProductListener.onConsumeFinished(C78897Uxp.LJIJI(c0he));
                }
            }
        }
        ((ConcurrentHashMap) c78431UqJ.LIZLLL.LIZLLL).remove(str);
    }
}
