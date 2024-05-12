package X;

import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.service.provider.IapServiceProvider;
import java.util.List;

/* renamed from: X.Up6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78356Up6 implements InterfaceC78385UpZ<AbsIapProduct> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC78395Upj LIZIZ;
    public final /* synthetic */ IapServiceProvider LIZJ;

    @Override // X.InterfaceC78385UpZ
    public final void LIZ(AbsResult absResult, List<AbsIapProduct> list) {
        if (absResult.getCode() == 0) {
            C78368UpI c78368UpI = new C78368UpI(0, 0, "query success in querySubscriptionDetails.");
            c78368UpI.LIZ = this.LIZ;
            ((C78392Upg) C78379UpT.LJ().LIZJ()).LJIIJ(c78368UpI, this.LIZIZ, list);
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIILL(c78368UpI, list);
            return;
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipoPayManger: query product list details from google service has error, result: ");
        LIZ.append(absResult);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        int code = absResult.getCode();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("query product list details from google service has error, result: ");
        LIZ2.append(absResult.getMessage());
        C78368UpI c78368UpI2 = new C78368UpI(301, code, X1D.LIZIZ(LIZ2));
        c78368UpI2.LIZ = this.LIZ;
        ((C78392Upg) C78379UpT.LJ().LIZJ()).LJIIJ(c78368UpI2, this.LIZIZ, list);
        ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIILL(c78368UpI2, list);
    }

    public C78356Up6(IapServiceProvider iapServiceProvider, String str, InterfaceC78395Upj interfaceC78395Upj) {
        this.LIZJ = iapServiceProvider;
        this.LIZ = str;
        this.LIZIZ = interfaceC78395Upj;
    }
}
