package X;

import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.UqI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78430UqI implements InterfaceC78437UqP {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ ConsumeIapProductListener LIZJ;
    public final /* synthetic */ C78408Upw LIZLLL;

    @Override // X.InterfaceC78437UqP
    public final void LIZIZ() {
        boolean z = this.LIZ;
        final String str = this.LIZIZ;
        ConsumeIapProductListener consumeIapProductListener = this.LIZJ;
        if (consumeIapProductListener != null) {
            ((ConcurrentHashMap) this.LIZLLL.LIZLLL).put(str, consumeIapProductListener);
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillingManager: consumeAsyncInternal , isSubscription:");
        LIZ.append(z);
        LIZ.append(" purchaseToken: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        if (z) {
            new C04780Gs();
            if (str != null) {
                C04800Gu c04800Gu = new C04800Gu();
                c04800Gu.LIZ = str;
                this.LIZLLL.LJIIJJI.LIZIZ(c04800Gu, new InterfaceC04820Gw() { // from class: X.UqG
                    @Override // X.InterfaceC04820Gw
                    public final void LIZJ(C0HE c0he) {
                        C78430UqI c78430UqI = C78430UqI.this;
                        String str2 = str;
                        ConsumeIapProductListener consumeIapProductListener2 = (ConsumeIapProductListener) ((ConcurrentHashMap) c78430UqI.LIZLLL.LIZLLL).get(str2);
                        if (consumeIapProductListener2 != null) {
                            if (c78430UqI.LIZLLL.LJ.size() == 0) {
                                C78273Unl.LJIIIZ().LJ().getClass();
                            }
                            Iterator<Purchase> it = c78430UqI.LIZLLL.LJ.iterator();
                            while (it.hasNext()) {
                                if (str2.equals(it.next().LIZLLL())) {
                                    consumeIapProductListener2.onConsumeFinished(C78897Uxp.LJIJI(c0he));
                                }
                            }
                        }
                        ((ConcurrentHashMap) c78430UqI.LIZLLL.LIZLLL).remove(str2);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }
        new C0HF();
        if (str != null) {
            C0HH c0hh = new C0HH();
            c0hh.LIZ = str;
            this.LIZLLL.LJIIJJI.LIZJ(c0hh, new C78429UqH(this));
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    @Override // X.InterfaceC78437UqP
    public final void LIZ(C78368UpI c78368UpI) {
        ConsumeIapProductListener consumeIapProductListener = this.LIZJ;
        if (consumeIapProductListener != null) {
            consumeIapProductListener.onConsumeFinished(c78368UpI);
        }
    }

    public C78430UqI(C78408Upw c78408Upw, boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        this.LIZLLL = c78408Upw;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = consumeIapProductListener;
    }
}
