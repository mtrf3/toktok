package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: X.UoT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78317UoT implements InterfaceC78326Uoc<CreateOrderResponseEntity> {
    public final C78294Uo6 LIZ;
    public final /* synthetic */ C78320UoW LIZIZ;

    @Override // X.InterfaceC78326Uoc
    public final void LIZ(AbsResult absResult) {
        this.LIZ.LIZIZ(false, absResult);
        if (absResult instanceof C78368UpI) {
            this.LIZIZ.LIZIZ((C78368UpI) absResult);
        }
    }

    @Override // X.InterfaceC78326Uoc
    public final void onSuccess(CreateOrderResponseEntity createOrderResponseEntity) {
        this.LIZ.LIZIZ(true, null);
        C78320UoW c78320UoW = this.LIZIZ;
        c78320UoW.getClass();
        AbstractC78349Uoz nextState = PaymentServiceManager.get().getIapExternalService().getNextState(c78320UoW);
        if (nextState != null) {
            nextState.LIZ(c78320UoW.LIZ);
        }
    }

    public C78317UoT(C78320UoW c78320UoW, C78294Uo6 c78294Uo6) {
        this.LIZIZ = c78320UoW;
        this.LIZ = c78294Uo6;
    }
}
