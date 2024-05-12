package com.bytedance.router;

import X.C113134cH;
import android.content.Intent;

/* loaded from: classes5.dex */
public abstract class AbsOpenResultCallback implements OpenResultCallback {
    @Override // com.bytedance.router.OpenResultCallback
    public void onActionResult(Object obj) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onEmpty() {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onFail(String str, String str2) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onIntercept(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMatched(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMissed(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public /* synthetic */ void onOpen(Intent intent) {
        C113134cH.LIZIZ(this, intent);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
    }
}
