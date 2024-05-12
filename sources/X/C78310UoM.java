package X;

import android.os.Message;
import com.amazon.device.iap.model.PurchaseResponse;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import org.json.JSONException;

/* renamed from: X.UoM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78310UoM implements InterfaceC78311UoN {
    public final C78305UoH LIZ;
    public final C78308UoK LIZIZ;
    public Message LIZJ;
    public final OrderInfo LIZLLL;
    public boolean LJ;
    public final /* synthetic */ C78307UoJ LJFF;

    @Override // X.InterfaceC78311UoN
    public final void LIZ(C78331Uoh c78331Uoh) {
        String str;
        if (this.LJ) {
            this.LJFF.LJFF.getApplication().unregisterActivityLifecycleCallbacks(this.LIZIZ);
            this.LJ = false;
        }
        if (c78331Uoh.isOrderStateSuccess()) {
            this.LIZ.LIZ(c78331Uoh.getOrderState(), null);
            C78307UoJ c78307UoJ = this.LJFF;
            c78307UoJ.LIZ.setAbsIapChannelOrderData(c78331Uoh);
            AbstractC78349Uoz nextState = PaymentServiceManager.get().getIapExternalService().getNextState(c78307UoJ);
            if (nextState != null) {
                nextState.LIZ(c78307UoJ.LIZ);
                return;
            }
            return;
        }
        C78368UpI c78368UpI = new C78368UpI();
        c78368UpI.withErrorCode(211);
        c78368UpI.withDetailCode(c78331Uoh.getOrderState());
        PurchaseResponse purchaseResponse = c78331Uoh.LIZ;
        if (purchaseResponse != null) {
            try {
                str = purchaseResponse.toJSON().toString();
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                str = "mPurchaseResponse.toJSON() occurs exception.";
            }
        } else {
            str = "amazon pay failed";
        }
        c78368UpI.withMessage(str);
        this.LIZ.LIZ(c78331Uoh.getOrderState(), c78368UpI);
        this.LJFF.LIZIZ(c78368UpI);
    }

    public C78310UoM(C78307UoJ c78307UoJ, C78305UoH c78305UoH) {
        this.LJFF = c78307UoJ;
        this.LIZ = c78305UoH;
        this.LIZLLL = new OrderInfo(c78307UoJ.LIZ);
        C78308UoK c78308UoK = new C78308UoK(this);
        this.LIZIZ = c78308UoK;
        c78307UoJ.LJFF.getApplication().registerActivityLifecycleCallbacks(c78308UoK);
        this.LJ = true;
    }
}
