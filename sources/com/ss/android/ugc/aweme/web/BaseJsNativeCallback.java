package com.ss.android.ugc.aweme.web;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.web.IJsCallback;

/* loaded from: classes2.dex */
public abstract class BaseJsNativeCallback<CALLBACK extends IJsCallback> extends BaseLifeCycleObserver {
    @Override // com.ss.android.ugc.aweme.web.BaseLifeCycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
        throw null;
    }

    /* renamed from: com.ss.android.ugc.aweme.web.BaseJsNativeCallback$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 extends ResultReceiver {
        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            throw null;
        }
    }
}
