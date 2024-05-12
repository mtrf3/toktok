package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import defpackage.b1;

/* renamed from: X.Up8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78358Up8 implements InterfaceC78326Uoc<ResponseEntity> {
    public final /* synthetic */ C78362UpC LIZ;

    public C78358Up8(C78362UpC c78362UpC) {
        this.LIZ = c78362UpC;
    }

    @Override // X.InterfaceC78326Uoc
    public final void LIZ(AbsResult absResult) {
        C78362UpC c78362UpC = this.LIZ;
        int i = c78362UpC.LIZJ;
        if (i >= c78362UpC.LIZLLL) {
            b1.LIZLLL();
            PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().onFailedFinishedTokenUpload(c78362UpC.LIZIZ.getOrderId());
            InterfaceC78326Uoc<ResponseEntity> interfaceC78326Uoc = c78362UpC.LJI;
            if (interfaceC78326Uoc != null) {
                interfaceC78326Uoc.LIZ(absResult);
                return;
            }
            return;
        }
        int i2 = i + 1;
        c78362UpC.LIZJ = i2;
        long min = Math.min(Math.max(i2, 1), 5);
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadTokenManager: prepare delay ");
        LIZ.append(min);
        LIZ.append("s retry upload token.");
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        c78362UpC.LJ.sendEmptyMessageDelayed(1, min * 1000);
    }

    @Override // X.InterfaceC78326Uoc
    public final void onSuccess(ResponseEntity responseEntity) {
        PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().onSuccessFinishedTokenUpload(this.LIZ.LIZIZ.getOrderId());
        InterfaceC78326Uoc<ResponseEntity> interfaceC78326Uoc = this.LIZ.LJI;
        if (interfaceC78326Uoc != null) {
            interfaceC78326Uoc.onSuccess(responseEntity);
        }
    }
}
