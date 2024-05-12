package X;

import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Upi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78394Upi implements C0HU {
    public final /* synthetic */ InterfaceC78395Upj LIZ;

    public C78394Upi(InterfaceC78395Upj interfaceC78395Upj) {
        this.LIZ = interfaceC78395Upj;
    }

    @Override // X.C0HU
    public final void LIZIZ(C0HE c0he, List<Purchase> list) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("querying subscriptions unfinished purchases from google service finished  for queryHasSubscriptionProducts,result code is:");
        LIZ.append(c0he.LIZ);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        if (c0he.LIZ == 0) {
            ArrayList arrayList = new ArrayList();
            for (Purchase purchase : list) {
                if (purchase.LIZJ.optBoolean("acknowledged", true)) {
                    arrayList.add(C78847Ux1.LJJIIJ(purchase));
                }
            }
            C78368UpI c78368UpI = new C78368UpI(0, -1, "query has subscription success in google service");
            InterfaceC78402Upq LIZJ = C78379UpT.LJ().LIZJ();
            IapPaymentMethod iapPaymentMethod = IapPaymentMethod.GOOGLE;
            ((C78392Upg) LIZJ).LJII(c78368UpI, this.LIZ, iapPaymentMethod, arrayList);
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIL(iapPaymentMethod, c78368UpI, arrayList);
            return;
        }
        C78368UpI LJIJI = C78897Uxp.LJIJI(c0he);
        InterfaceC78402Upq LIZJ2 = C78379UpT.LJ().LIZJ();
        IapPaymentMethod iapPaymentMethod2 = IapPaymentMethod.GOOGLE;
        ((C78392Upg) LIZJ2).LJII(LJIJI, this.LIZ, iapPaymentMethod2, null);
        ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIL(iapPaymentMethod2, LJIJI, null);
    }
}
