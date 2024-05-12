package X;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Up3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78353Up3 implements InterfaceC78382UpW {
    public final /* synthetic */ RestoreOrderService LIZ;

    public C78353Up3(RestoreOrderService restoreOrderService) {
        this.LIZ = restoreOrderService;
    }

    @Override // X.InterfaceC78382UpW
    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        Object obj;
        RestoreOrderService restoreOrderService = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onQueryFinished: payResult.ResultCode is ");
        LIZ.append(absResult.getCode());
        LIZ.append(" purchases size is ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.append(obj);
        restoreOrderService.showLog(X1D.LIZIZ(LIZ));
        if (absResult.getCode() == 0 && list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list.toArray()) {
                AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj2;
                String selfOrderId = absIapChannelOrderData.getSelfOrderId();
                if (!TextUtils.isEmpty(selfOrderId)) {
                    arrayList.add(selfOrderId);
                    if (!this.LIZ.mProcessingOrders.contains(selfOrderId) && absIapChannelOrderData.getOrderState() != 2) {
                        RestoreOrderService restoreOrderService2 = this.LIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onQueryFinished: ");
                        LIZ2.append(selfOrderId);
                        LIZ2.append(" state is not pending, start extra upload token");
                        restoreOrderService2.showLog(X1D.LIZIZ(LIZ2));
                        this.LIZ.mProcessingOrders.add(selfOrderId);
                        PaymentServiceManager.get().getIapExternalService().executeUnUploadTokenOrder(IapPaymentMethod.GOOGLE, absIapChannelOrderData);
                    } else {
                        RestoreOrderService restoreOrderService3 = this.LIZ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("onQueryFinished: ");
                        LIZ3.append(selfOrderId);
                        LIZ3.append(" state is pending");
                        restoreOrderService3.showLog(X1D.LIZIZ(LIZ3));
                        if (!this.LIZ.mNeedRestoreOrderMap.containsKey(selfOrderId)) {
                            WeakHandler weakHandler = this.LIZ.mWeakHandler;
                            weakHandler.sendMessage(weakHandler.obtainMessage(103, selfOrderId));
                        }
                    }
                } else if (absIapChannelOrderData instanceof C78365UpF) {
                    RestoreOrderService restoreOrderService4 = this.LIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("onQueryFinished: selfOrderId is empty , not normal pipo order,not restore , purchase.getOriginalJson() is ");
                    LIZ4.append(absIapChannelOrderData.getOriginalJson());
                    restoreOrderService4.showLog(X1D.LIZIZ(LIZ4));
                }
            }
            HashSet hashSet = new HashSet();
            for (String str : this.LIZ.mNeedRestoreOrderMap.keySet()) {
                if (!arrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                RestoreOrderService restoreOrderService5 = this.LIZ;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("onQueryFinished: adjust mNeedRestoreOrderMap with purchases and remove ");
                LIZ5.append(str2);
                restoreOrderService5.showLog(X1D.LIZIZ(LIZ5));
                WeakHandler weakHandler2 = this.LIZ.mWeakHandler;
                weakHandler2.sendMessage(weakHandler2.obtainMessage(104, str2));
            }
        }
        RestoreOrderService restoreOrderService6 = this.LIZ;
        restoreOrderService6.mWeakHandler.sendEmptyMessageDelayed(102, restoreOrderService6.mRestoreOrderIntervalInMill);
    }
}
