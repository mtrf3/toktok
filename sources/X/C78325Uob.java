package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: X.Uob, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78325Uob implements InterfaceC78326Uoc<ResponseEntity> {
    public final C78298UoA LIZ;
    public final /* synthetic */ C78359Up9 LIZIZ;

    @Override // X.InterfaceC78326Uoc
    public final void LIZ(AbsResult absResult) {
        this.LIZ.LIZIZ(false, C78368UpI.LIZ(absResult), true);
        this.LIZIZ.LIZIZ(C78368UpI.LIZ(absResult));
    }

    @Override // X.InterfaceC78326Uoc
    public final void onSuccess(ResponseEntity responseEntity) {
        ResponseEntity responseEntity2 = responseEntity;
        this.LIZ.LIZIZ(true, null, true);
        if (TextUtils.isEmpty(this.LIZIZ.LIZ.getOrderId())) {
            this.LIZIZ.LIZ.setOrderId(responseEntity2.getOrderId());
        }
        C78359Up9 c78359Up9 = this.LIZIZ;
        c78359Up9.getClass();
        AbstractC78349Uoz nextState = PaymentServiceManager.get().getIapExternalService().getNextState(c78359Up9);
        if (nextState != null) {
            nextState.LIZ(c78359Up9.LIZ);
        }
    }

    public C78325Uob(C78359Up9 c78359Up9, C78298UoA c78298UoA) {
        this.LIZIZ = c78359Up9;
        this.LIZ = c78298UoA;
    }
}
