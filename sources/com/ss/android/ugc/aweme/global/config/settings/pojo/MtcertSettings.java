package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MtcertSettings {

    @InterfaceC65349Pkn("cert_url_schema")
    public String certUrlSchema;

    @InterfaceC65349Pkn("enable_change_handle_notice")
    public Boolean enableChangeHandleNotice;

    @InterfaceC65349Pkn("enable_change_mobile_notice")
    public Boolean enableChangeMobileNotice;

    @InterfaceC65349Pkn("enable_change_nickname_notice")
    public Boolean enableChangeNicknameNotice;

    @InterfaceC65349Pkn("enable_private_account_notice")
    public Boolean enablePrivateAccountNotice;

    @InterfaceC65349Pkn("show_cert_entry")
    public Boolean showCertEntry;

    @InterfaceC65349Pkn("verification_badge_type")
    public List<VerificationBadgeType> verificationBadgeType;

    public MtcertSettings() {
        Boolean bool = Boolean.FALSE;
        this.showCertEntry = bool;
        this.enablePrivateAccountNotice = bool;
        this.enableChangeMobileNotice = bool;
        this.enableChangeHandleNotice = bool;
        this.enableChangeNicknameNotice = bool;
        this.verificationBadgeType = new ArrayList();
        this.certUrlSchema = "";
    }

    public String getCertUrlSchema() {
        return this.certUrlSchema;
    }

    public Boolean getEnableChangeHandleNotice() {
        return this.enableChangeHandleNotice;
    }

    public Boolean getEnableChangeMobileNotice() {
        return this.enableChangeMobileNotice;
    }

    public Boolean getEnableChangeNicknameNotice() {
        return this.enableChangeNicknameNotice;
    }

    public Boolean getEnablePrivateAccountNotice() {
        return this.enablePrivateAccountNotice;
    }

    public Boolean getShowCertEntry() {
        return this.showCertEntry;
    }

    public List<VerificationBadgeType> getVerificationBadgeType() {
        return this.verificationBadgeType;
    }
}
