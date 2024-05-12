package com.ss.android.ugc.aweme.openshare.entity;

import X.AbstractC45836Hyq;
import X.C45828Hyi;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class DYBaseResp extends AbstractC45836Hyq {
    public Bundle extras;

    @Override // X.AbstractC45836Hyq
    public boolean checkArgs() {
        return true;
    }

    @Override // X.AbstractC45836Hyq
    public abstract int getType();

    @Override // X.AbstractC45836Hyq
    public boolean isSuccess() {
        if (this.errorCode == C45828Hyi.LJ.LIZ) {
            return true;
        }
        return false;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    @Override // X.AbstractC45836Hyq
    public void fromBundle(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        this.errorCode = bundle.getInt("_aweme_open_sdk_params_error_code");
        this.errorMsg = bundle.getString("_aweme_open_sdk_params_error_msg");
        this.extras = bundle.getBundle("_bytedance_params_extra");
    }

    public final void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    @Override // X.AbstractC45836Hyq
    public void toBundle(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        bundle.putInt("_aweme_open_sdk_params_error_code", this.errorCode);
        bundle.putString("_aweme_open_sdk_params_error_msg", this.errorMsg);
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
    }
}
