package X;

import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.UqH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C78429UqH implements C0HJ {
    public final /* synthetic */ Object LIZ;

    public /* synthetic */ C78429UqH(Object obj) {
        this.LIZ = obj;
    }

    @Override // X.C0HJ
    public final void LIZ(C0HE c0he, String str) {
        C78430UqI c78430UqI = (C78430UqI) this.LIZ;
        ConsumeIapProductListener consumeIapProductListener = (ConsumeIapProductListener) ((ConcurrentHashMap) c78430UqI.LIZLLL.LIZLLL).get(str);
        if (consumeIapProductListener != null) {
            if (c78430UqI.LIZLLL.LJ.size() == 0) {
                C78273Unl.LJIIIZ().LJ().getClass();
            }
            Iterator<Purchase> it = c78430UqI.LIZLLL.LJ.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().LIZLLL())) {
                    consumeIapProductListener.onConsumeFinished(C78897Uxp.LJIJI(c0he));
                }
            }
        }
        ((ConcurrentHashMap) c78430UqI.LIZLLL.LIZLLL).remove(str);
    }
}
