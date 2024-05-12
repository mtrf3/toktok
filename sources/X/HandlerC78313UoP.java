package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: X.UoP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class HandlerC78313UoP extends Handler {
    public HandlerC78313UoP() {
        super(C16880lQ.LLJJJJ());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 1435) {
            PaymentServiceManager.get().getIapExternalService().onOrderTimeout((OrderInfo) message.obj);
        }
    }
}
