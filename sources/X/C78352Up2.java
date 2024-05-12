package X;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.util.List;

/* renamed from: X.Up2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78352Up2 implements InterfaceC78382UpW {
    public final /* synthetic */ C78351Up1 LIZ;

    public C78352Up2(C78351Up1 c78351Up1) {
        this.LIZ = c78351Up1;
    }

    @Override // X.InterfaceC78382UpW
    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        C78351Up1 c78351Up1;
        WeakHandler weakHandler;
        if (absResult != null && absResult.getCode() == 0 && list != null) {
            for (Object obj : list.toArray()) {
                if (obj != null) {
                    AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
                    String selfOrderId = absIapChannelOrderData.getSelfOrderId();
                    if (!TextUtils.isEmpty(selfOrderId) && this.LIZ.LJLJJI.contains(selfOrderId) && absIapChannelOrderData.getOrderState() != 2) {
                        PaymentServiceManager.get().getIapExternalService().executeUnUploadTokenOrder(IapPaymentMethod.GOOGLE, absIapChannelOrderData);
                        C78351Up1 c78351Up12 = this.LIZ;
                        if (!c78351Up12.LIZIZ() && c78351Up12.LJLJJI.contains(absIapChannelOrderData.getSelfOrderId())) {
                            c78351Up12.LJLJJI.remove(absIapChannelOrderData.getSelfOrderId());
                            if (c78351Up12.LJLJJL == null) {
                                c78351Up12.LJLJJL = new C78293Uo5();
                            }
                            C78293Uo5 c78293Uo5 = c78351Up12.LJLJJL;
                            c78293Uo5.getClass();
                            c78293Uo5.LIZ(2, absIapChannelOrderData.getProductId(), absIapChannelOrderData.getSelfOrderId(), absIapChannelOrderData.isSubscription());
                        }
                    }
                }
            }
        }
        if (this.LIZ.LJLJJI.size() > 0 && (weakHandler = (c78351Up1 = this.LIZ).LJLIL) != null) {
            weakHandler.sendEmptyMessageDelayed(1020, c78351Up1.LJLILLLLZI);
        }
    }
}
