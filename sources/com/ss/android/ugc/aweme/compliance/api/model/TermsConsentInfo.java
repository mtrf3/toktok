package com.ss.android.ugc.aweme.compliance.api.model;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TermsConsentInfo implements Serializable {

    @InterfaceC65349Pkn("business")
    public final String business;

    @InterfaceC65349Pkn("button")
    public final String button;

    @InterfaceC65349Pkn("checkbox_tr_notification_subtitle")
    public final String cbNotificationSubTitle;

    @InterfaceC65349Pkn("checkbox_tr_notification_title")
    public final String cbNotificationTitle;

    @InterfaceC65349Pkn("checkbox_agree_all_terms")
    public final String checkboxAll;

    @InterfaceC65349Pkn("checkbox_privacy_policy")
    public final String checkboxPP;

    @InterfaceC65349Pkn("checkbox_terms_of_use")
    public final String checkboxTerms;

    @InterfaceC65349Pkn("desc")
    public final String description;

    @InterfaceC65349Pkn("tiktok_privacy_policy_url")
    public final String privacyPolicyUrl;

    @InterfaceC65349Pkn("tiktok_terms_of_use_url")
    public final String termsOfUseUrl;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public TermsConsentInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TermsConsentInfo copy$default(TermsConsentInfo termsConsentInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = termsConsentInfo.termsOfUseUrl;
        }
        if ((i & 2) != 0) {
            str2 = termsConsentInfo.privacyPolicyUrl;
        }
        if ((i & 4) != 0) {
            str3 = termsConsentInfo.title;
        }
        if ((i & 8) != 0) {
            str4 = termsConsentInfo.description;
        }
        if ((i & 16) != 0) {
            str5 = termsConsentInfo.checkboxAll;
        }
        if ((i & 32) != 0) {
            str6 = termsConsentInfo.checkboxTerms;
        }
        if ((i & 64) != 0) {
            str7 = termsConsentInfo.checkboxPP;
        }
        if ((i & 128) != 0) {
            str8 = termsConsentInfo.button;
        }
        if ((i & 256) != 0) {
            str9 = termsConsentInfo.business;
        }
        if ((i & 512) != 0) {
            str10 = termsConsentInfo.cbNotificationTitle;
        }
        if ((i & 1024) != 0) {
            str11 = termsConsentInfo.cbNotificationSubTitle;
        }
        return termsConsentInfo.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public final TermsConsentInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new TermsConsentInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsConsentInfo)) {
            return false;
        }
        TermsConsentInfo termsConsentInfo = (TermsConsentInfo) obj;
        return o.LJ(this.termsOfUseUrl, termsConsentInfo.termsOfUseUrl) && o.LJ(this.privacyPolicyUrl, termsConsentInfo.privacyPolicyUrl) && o.LJ(this.title, termsConsentInfo.title) && o.LJ(this.description, termsConsentInfo.description) && o.LJ(this.checkboxAll, termsConsentInfo.checkboxAll) && o.LJ(this.checkboxTerms, termsConsentInfo.checkboxTerms) && o.LJ(this.checkboxPP, termsConsentInfo.checkboxPP) && o.LJ(this.button, termsConsentInfo.button) && o.LJ(this.business, termsConsentInfo.business) && o.LJ(this.cbNotificationTitle, termsConsentInfo.cbNotificationTitle) && o.LJ(this.cbNotificationSubTitle, termsConsentInfo.cbNotificationSubTitle);
    }

    public int hashCode() {
        String str = this.termsOfUseUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.privacyPolicyUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.checkboxAll;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.checkboxTerms;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.checkboxPP;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.button;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.business;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cbNotificationTitle;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cbNotificationSubTitle;
        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TermsConsentInfo(termsOfUseUrl=");
        sb.append(this.termsOfUseUrl);
        sb.append(", privacyPolicyUrl=");
        sb.append(this.privacyPolicyUrl);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", checkboxAll=");
        sb.append(this.checkboxAll);
        sb.append(", checkboxTerms=");
        sb.append(this.checkboxTerms);
        sb.append(", checkboxPP=");
        sb.append(this.checkboxPP);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", business=");
        sb.append(this.business);
        sb.append(", cbNotificationTitle=");
        sb.append(this.cbNotificationTitle);
        sb.append(", cbNotificationSubTitle=");
        return C07670Rv.LIZIZ(sb, this.cbNotificationSubTitle, ')');
    }

    public final String getBusiness() {
        return this.business;
    }

    public final String getButton() {
        return this.button;
    }

    public final String getCbNotificationSubTitle() {
        return this.cbNotificationSubTitle;
    }

    public final String getCbNotificationTitle() {
        return this.cbNotificationTitle;
    }

    public final String getCheckboxAll() {
        return this.checkboxAll;
    }

    public final String getCheckboxPP() {
        return this.checkboxPP;
    }

    public final String getCheckboxTerms() {
        return this.checkboxTerms;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final String getTermsOfUseUrl() {
        return this.termsOfUseUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public TermsConsentInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.termsOfUseUrl = str;
        this.privacyPolicyUrl = str2;
        this.title = str3;
        this.description = str4;
        this.checkboxAll = str5;
        this.checkboxTerms = str6;
        this.checkboxPP = str7;
        this.button = str8;
        this.business = str9;
        this.cbNotificationTitle = str10;
        this.cbNotificationSubTitle = str11;
    }

    public /* synthetic */ TermsConsentInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "");
    }
}
