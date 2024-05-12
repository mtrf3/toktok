package com.ss.android.ugc.profile.platform.business.header.business.bio.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* loaded from: classes5.dex */
public final class BioContactData extends BizBaseData {

    @InterfaceC65349Pkn("biz_phone")
    public String bizPhone;

    @InterfaceC65349Pkn("biz_phone_enable_call")
    public Boolean bizPhoneEnableCall;

    @InterfaceC65349Pkn("biz_phone_enable_text")
    public Boolean bizPhoneEnableText;

    @InterfaceC65349Pkn("biz_phone_show_pattern")
    public String type;

    public final String getBizPhone() {
        return this.bizPhone;
    }

    public final Boolean getBizPhoneEnableCall() {
        return this.bizPhoneEnableCall;
    }

    public final Boolean getBizPhoneEnableText() {
        return this.bizPhoneEnableText;
    }

    public final String getType() {
        return this.type;
    }

    public final void setBizPhone(String str) {
        this.bizPhone = str;
    }

    public final void setBizPhoneEnableCall(Boolean bool) {
        this.bizPhoneEnableCall = bool;
    }

    public final void setBizPhoneEnableText(Boolean bool) {
        this.bizPhoneEnableText = bool;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
