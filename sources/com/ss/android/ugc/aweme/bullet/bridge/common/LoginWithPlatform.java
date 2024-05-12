package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.F3T;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LoginWithPlatform extends LoginMethod {
    @Override // com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod, X.InterfaceC38217EzF
    public final String getName() {
        return "loginWithPlatform";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginWithPlatform(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }
}
