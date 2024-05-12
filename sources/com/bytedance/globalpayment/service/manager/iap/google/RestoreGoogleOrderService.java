package com.bytedance.globalpayment.service.manager.iap.google;

/* loaded from: classes14.dex */
public interface RestoreGoogleOrderService {
    boolean isEnableRestoreOrder();

    void onFailedFinishedTokenUpload(String str);

    void onSuccessFinishedTokenUpload(String str);
}
