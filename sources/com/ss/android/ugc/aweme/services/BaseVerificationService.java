package com.ss.android.ugc.aweme.services;

import X.C63893P5t;
import X.C76800UCe;
import X.InterfaceC63892P5s;
import X.InterfaceC65784Pro;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class BaseVerificationService implements GenericLifecycleObserver, InterfaceC63892P5s {
    public void checkUserVerifiedStatus(Activity activity, String str, Bundle bundle, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
    }

    public String getPhoneCountryCode() {
        return "";
    }

    public boolean isHighRiskPhone(String str) {
        return false;
    }

    public void notifyCheckUserComplete() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public boolean shouldAlertHighRiskPhone() {
        return false;
    }

    public void verifyCredential(C63893P5t param) {
        o.LJIIIZ(param, "param");
    }
}
