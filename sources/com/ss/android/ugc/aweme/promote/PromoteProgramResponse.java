package com.ss.android.ugc.aweme.promote;

import X.InterfaceC195777mH;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes8.dex */
public class PromoteProgramResponse extends BaseResponse {

    @InterfaceC195777mH
    public Boolean confirmed = Boolean.FALSE;

    public boolean isConfirmedSuccess() {
        Boolean bool = this.confirmed;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
