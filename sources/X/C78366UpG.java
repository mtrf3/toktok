package X;

import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.service.provider.IapServiceProvider;

/* renamed from: X.UpG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78366UpG implements InterfaceC78390Upe {
    public final /* synthetic */ IapServiceProvider LIZ;

    public C78366UpG(IapServiceProvider iapServiceProvider) {
        this.LIZ = iapServiceProvider;
    }

    @Override // X.InterfaceC78390Upe
    public final void LIZ(C78368UpI c78368UpI) {
        if (c78368UpI != null) {
            if (c78368UpI.getCode() == 0) {
                InterfaceC78403Upr LIZLLL = C78379UpT.LJ().LIZLLL();
                IapPaymentMethod iapPaymentMethod = IapPaymentMethod.AMAZON;
                ((C78391Upf) LIZLLL).LJIIJ(iapPaymentMethod, new C78368UpI(0, 0, "init success"));
                this.LIZ.tryRestoreUnAckOrder(iapPaymentMethod);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("amazon response code is: ");
            LIZ.append(c78368UpI.getCode());
            LIZ.append(" message is : ");
            LIZ.append(c78368UpI.getMessage());
            C78368UpI c78368UpI2 = new C78368UpI(401, 4012, X1D.LIZIZ(LIZ));
            C78277Unp.LIZ(c78368UpI2);
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJ(IapPaymentMethod.AMAZON, c78368UpI2);
            return;
        }
        C78368UpI c78368UpI3 = new C78368UpI(401, 4012, "amazon init failed");
        C78277Unp.LIZ(c78368UpI3);
        ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJ(IapPaymentMethod.AMAZON, c78368UpI3);
    }
}
