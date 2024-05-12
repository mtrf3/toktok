package com.ss.android.ugc.aweme.services;

import com.ss.android.ugc.aweme.services.IExternalService;

/* loaded from: classes8.dex */
public abstract class SimpleServiceLoadCallback implements IExternalService.ServiceLoadCallback {
    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public void onDismiss() {
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public void onFailed() {
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public void onOK() {
        onFailed();
    }
}
