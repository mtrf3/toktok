package com.ss.android.ugc.aweme.dsp.subscribe.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.model.TTMLink;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class DspVipInfoResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("is_vip")
    public boolean isVip;

    @InterfaceC65349Pkn("next_schema")
    public String nextSchema;

    @InterfaceC65349Pkn("ttm_link")
    public TTMLink ttmLink;

    public final String getNextSchema() {
        return this.nextSchema;
    }

    public final TTMLink getTtmLink() {
        return this.ttmLink;
    }

    public final boolean isVip() {
        return this.isVip;
    }

    public final void setNextSchema(String str) {
        this.nextSchema = str;
    }

    public final void setTtmLink(TTMLink tTMLink) {
        this.ttmLink = tTMLink;
    }

    public final void setVip(boolean z) {
        this.isVip = z;
    }
}
