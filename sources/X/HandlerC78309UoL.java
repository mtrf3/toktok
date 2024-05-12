package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: X.UoL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class HandlerC78309UoL extends Handler {
    public HandlerC78309UoL() {
        super(C16880lQ.LLJJJJ());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 3514) {
            PaymentServiceManager.get().getIapExternalService().onOrderTimeout((OrderInfo) message.obj);
        }
    }
}
