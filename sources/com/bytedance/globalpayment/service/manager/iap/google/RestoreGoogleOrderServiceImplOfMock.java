package com.bytedance.globalpayment.service.manager.iap.google;

/* loaded from: classes14.dex */
public class RestoreGoogleOrderServiceImplOfMock implements RestoreGoogleOrderService {
    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public boolean isEnableRestoreOrder() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onFailedFinishedTokenUpload(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onSuccessFinishedTokenUpload(String str) {
    }
}
