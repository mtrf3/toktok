package com.ss.android.ugc.aweme.openshare;

import android.os.Bundle;
import com.ss.android.ugc.aweme.openshare.entity.DYBaseResp;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class Share$Response extends DYBaseResp {
    public String state;
    public int subErrorCode;

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseResp, X.AbstractC45836Hyq
    public int getType() {
        return 4;
    }

    public Share$Response() {
    }

    public final String getState() {
        return this.state;
    }

    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    public Share$Response(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        fromBundle(bundle);
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseResp, X.AbstractC45836Hyq
    public void fromBundle(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        super.fromBundle(bundle);
        this.state = bundle.getString("_aweme_open_sdk_params_state");
        this.subErrorCode = bundle.getInt("_aweme_open_sdk_params_sub_error_code");
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final void setSubErrorCode(int i) {
        this.subErrorCode = i;
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseResp, X.AbstractC45836Hyq
    public void toBundle(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        super.toBundle(bundle);
        bundle.putString("_aweme_open_sdk_params_state", this.state);
        bundle.putInt("_aweme_open_sdk_params_sub_error_code", this.subErrorCode);
    }
}
