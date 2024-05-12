package X;

import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.service.provider.IapServiceProvider;
import java.util.List;

/* renamed from: X.Up4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78354Up4 implements InterfaceC78385UpZ<AbsIapProduct> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ IapPaymentMethod LIZIZ;
    public final /* synthetic */ InterfaceC78395Upj LIZJ;
    public final /* synthetic */ List LIZLLL;
    public final /* synthetic */ IapServiceProvider LJ;

    @Override // X.InterfaceC78385UpZ
    public final void LIZ(AbsResult absResult, List<AbsIapProduct> list) {
        if (absResult.getCode() == 0) {
            C78368UpI c78368UpI = new C78368UpI(0, 0, "query success in queryProductDetails.");
            c78368UpI.LIZ = this.LIZ;
            InterfaceC78402Upq LIZJ = C78379UpT.LJ().LIZJ();
            C78392Upg c78392Upg = (C78392Upg) LIZJ;
            c78392Upg.LJIIIIZZ(c78368UpI, this.LIZJ, this.LIZIZ, list);
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIILIIL(this.LIZIZ, c78368UpI, list);
            C78277Unp.LIZIZ(true, this.LIZLLL, this.LIZIZ, absResult, list);
            return;
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("query product list details from channel service has error, result: ");
        LIZ.append(absResult);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        int code = absResult.getCode();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("query product list details from chanel service has error, result: ");
        LIZ2.append(absResult.getMessage());
        C78368UpI c78368UpI2 = new C78368UpI(301, code, X1D.LIZIZ(LIZ2));
        c78368UpI2.LIZ = this.LIZ;
        InterfaceC78402Upq LIZJ2 = C78379UpT.LJ().LIZJ();
        C78392Upg c78392Upg2 = (C78392Upg) LIZJ2;
        c78392Upg2.LJIIIIZZ(c78368UpI2, this.LIZJ, this.LIZIZ, list);
        ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIILIIL(this.LIZIZ, c78368UpI2, list);
        C78277Unp.LIZIZ(false, this.LIZLLL, this.LIZIZ, absResult, list);
    }

    public C78354Up4(IapServiceProvider iapServiceProvider, String str, IapPaymentMethod iapPaymentMethod, InterfaceC78395Upj interfaceC78395Upj, List list) {
        this.LJ = iapServiceProvider;
        this.LIZ = str;
        this.LIZIZ = iapPaymentMethod;
        this.LIZJ = interfaceC78395Upj;
        this.LIZLLL = list;
    }
}
