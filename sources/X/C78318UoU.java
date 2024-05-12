package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: X.UoU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78318UoU implements InterfaceC78326Uoc<CreateOrderResponseEntity> {
    public final C78294Uo6 LIZ;
    public final /* synthetic */ C78319UoV LIZIZ;

    @Override // X.InterfaceC78326Uoc
    public final void LIZ(AbsResult absResult) {
        this.LIZ.LIZIZ(false, absResult);
        this.LIZIZ.LIZIZ(C78368UpI.LIZ(absResult));
    }

    @Override // X.InterfaceC78326Uoc
    public final void onSuccess(CreateOrderResponseEntity createOrderResponseEntity) {
        this.LIZ.LIZIZ(true, null);
        C78319UoV c78319UoV = this.LIZIZ;
        c78319UoV.getClass();
        AbstractC78349Uoz nextState = PaymentServiceManager.get().getIapExternalService().getNextState(c78319UoV);
        if (nextState != null) {
            nextState.LIZ(c78319UoV.LIZ);
        }
    }

    public C78318UoU(C78319UoV c78319UoV, C78294Uo6 c78294Uo6) {
        this.LIZIZ = c78319UoV;
        this.LIZ = c78294Uo6;
    }
}
