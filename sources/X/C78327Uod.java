package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: X.Uod, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78327Uod implements InterfaceC78326Uoc<ResponseEntity> {
    public final C78298UoA LIZ;
    public final /* synthetic */ C78361UpB LIZIZ;

    @Override // X.InterfaceC78326Uoc
    public final void LIZ(AbsResult absResult) {
        this.LIZ.LIZIZ(false, C78368UpI.LIZ(absResult), false);
        this.LIZIZ.LIZIZ(C78368UpI.LIZ(absResult));
    }

    @Override // X.InterfaceC78326Uoc
    public final void onSuccess(ResponseEntity responseEntity) {
        this.LIZ.LIZIZ(true, null, false);
        C78361UpB c78361UpB = this.LIZIZ;
        c78361UpB.getClass();
        AbstractC78349Uoz nextState = PaymentServiceManager.get().getIapExternalService().getNextState(c78361UpB);
        if (nextState != null) {
            nextState.LIZ(c78361UpB.LIZ);
        }
    }

    public C78327Uod(C78361UpB c78361UpB, C78298UoA c78298UoA) {
        this.LIZIZ = c78361UpB;
        this.LIZ = c78298UoA;
    }
}
