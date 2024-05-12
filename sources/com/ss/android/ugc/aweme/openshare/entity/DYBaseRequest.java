package com.ss.android.ugc.aweme.openshare.entity;

import X.AbstractC45338Hqo;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class DYBaseRequest extends AbstractC45338Hqo {
    public Bundle extras;
    public String mCallerPackage;
    public String mCallerSDKVersion;
    public String mClientKey;
    public String mState;

    @Override // X.AbstractC45338Hqo
    public abstract int getType();

    @Override // X.AbstractC45338Hqo
    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    @Override // X.AbstractC45338Hqo
    public String getCallerPackage() {
        return this.mCallerPackage;
    }

    @Override // X.AbstractC45338Hqo
    public String getCallerVersion() {
        return this.mCallerSDKVersion;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getMCallerPackage() {
        return this.mCallerPackage;
    }

    public final String getMCallerSDKVersion() {
        return this.mCallerSDKVersion;
    }

    public final String getMClientKey() {
        return this.mClientKey;
    }

    public final String getMState() {
        return this.mState;
    }

    @Override // X.AbstractC45338Hqo
    public void fromBundle(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.mCallerSDKVersion = bundle.getString("_aweme_open_sdk_params_caller_sdk_version");
        this.extras = bundle.getBundle("_bytedance_params_extra");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
    }

    public final void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    public final void setMCallerPackage(String str) {
        this.mCallerPackage = str;
    }

    public final void setMCallerSDKVersion(String str) {
        this.mCallerSDKVersion = str;
    }

    public final void setMClientKey(String str) {
        this.mClientKey = str;
    }

    public final void setMState(String str) {
        this.mState = str;
    }

    @Override // X.AbstractC45338Hqo
    public void toBundle(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
        bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_params_client_key", this.mClientKey);
        bundle.putString("_aweme_open_sdk_params_caller_sdk_version", this.mCallerSDKVersion);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.mCallerPackage);
        bundle.putString("_aweme_open_sdk_params_state", this.mState);
    }
}
