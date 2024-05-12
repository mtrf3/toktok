package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: X.Uoe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78328Uoe implements InterfaceC78326Uoc<ResponseEntity> {
    public final C78298UoA LIZ;
    public final /* synthetic */ C78360UpA LIZIZ;

    @Override // X.InterfaceC78326Uoc
    public final void LIZ(AbsResult absResult) {
        if (absResult instanceof C78368UpI) {
            C78368UpI c78368UpI = (C78368UpI) absResult;
            this.LIZ.LIZIZ(false, c78368UpI, false);
            this.LIZIZ.LIZIZ(c78368UpI);
        }
    }

    @Override // X.InterfaceC78326Uoc
    public final void onSuccess(ResponseEntity responseEntity) {
        this.LIZ.LIZIZ(true, null, false);
        C78360UpA c78360UpA = this.LIZIZ;
        c78360UpA.getClass();
        AbstractC78349Uoz nextState = PaymentServiceManager.get().getIapExternalService().getNextState(c78360UpA);
        if (nextState != null) {
            nextState.LIZ(c78360UpA.LIZ);
        }
    }

    public C78328Uoe(C78360UpA c78360UpA, C78298UoA c78298UoA) {
        this.LIZIZ = c78360UpA;
        this.LIZ = c78298UoA;
    }
}
