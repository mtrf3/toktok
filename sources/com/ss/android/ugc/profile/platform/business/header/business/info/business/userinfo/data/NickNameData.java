package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* loaded from: classes5.dex */
public final class NickNameData extends BizBaseData {

    @InterfaceC65349Pkn("custom_verify")
    public String customVerify;

    @InterfaceC65349Pkn("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @InterfaceC65349Pkn("nickname_update_reminder")
    public Boolean nickNameUpdateReminder;

    @InterfaceC65349Pkn("real_user_name")
    public String realUserName;

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final Boolean getNickNameUpdateReminder() {
        return this.nickNameUpdateReminder;
    }

    public final String getRealUserName() {
        return this.realUserName;
    }

    public final void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setNickNameUpdateReminder(Boolean bool) {
        this.nickNameUpdateReminder = bool;
    }

    public final void setRealUserName(String str) {
        this.realUserName = str;
    }
}
