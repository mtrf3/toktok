package com.ss.android.ugc.aweme.compliance.api.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ComplianceSetting extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("ad_personality_settings")
    public final AdPersonalitySettings adPersonalitySettings;

    @InterfaceC65349Pkn("add_terms_consent_for_register")
    public final Boolean addTermsConsentForRegister;

    @InterfaceC65349Pkn("set_appsflyer_sharing_block")
    public final Boolean afSharingBlock;

    @InterfaceC65349Pkn("age_gate_info")
    public final AgeGateInfo ageGateInfo;

    @InterfaceC65349Pkn("age_verification_action")
    public final boolean ageVerificationAction;

    @InterfaceC65349Pkn("settings_black_menu_list")
    public final List<String> blackSetting;

    @InterfaceC65349Pkn("cmpl_enc")
    public final String complianceEncrypt;

    @InterfaceC65349Pkn("device_limit_register_expired_time")
    public final Long deviceLimitRegisterExpiredTime;

    @InterfaceC65349Pkn("enable_impressum")
    public final Integer enableImpressum;

    @InterfaceC65349Pkn("enable_terms_consent_popup")
    public final Boolean enableTermsConsentPopup;

    @InterfaceC65349Pkn("force_private_account")
    public final Boolean forcePrivateAccount;

    @InterfaceC65349Pkn("impressum_url")
    public final String impressumUrl;

    @InterfaceC65349Pkn("interface_control_settings")
    public final String interfaceControlSettingsString;

    @InterfaceC65349Pkn("mixed_age_consent_action")
    public final int isMixedAge;

    @InterfaceC65349Pkn("legal_entity_change_info")
    public final LegalEntityChangeInfo legalEntityChangeInfo;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("notify_private_account")
    public final Integer notifyPrivateAccount;

    @InterfaceC65349Pkn("policy_info_list")
    public final List<PolicyInfo> policyInfoList;

    @InterfaceC65349Pkn("preference_settings")
    public final PreferenceSettings preferenceSettings;

    @InterfaceC65349Pkn("privacy_highlights_for_teens_link")
    public final String privacyHighlightsForTeensLink;

    @InterfaceC65349Pkn("about_privacy_policy_url")
    public final String privacyPolicyUrl;

    @InterfaceC65349Pkn("private_account_prompt")
    public final int privateAccountPrompt;

    @InterfaceC65349Pkn("private_account_prompt_type")
    public final int privateAccountPromptType;

    @InterfaceC65349Pkn("terms_consent_for_register_info_new_users")
    public final TermsConsentInfo termConsentInfoNewUsers;

    @InterfaceC65349Pkn("terms_consent_for_register_info")
    public final TermsConsentInfo termsConsentInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ComplianceSetting() {
        /*
            r28 = this;
            r1 = 0
            r20 = 0
            r26 = 33554431(0x1ffffff, float:9.403954E-38)
            r0 = r28
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r1
            r21 = r20
            r22 = r20
            r23 = r1
            r24 = r20
            r25 = r1
            r27 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting.<init>():void");
    }

    public static /* synthetic */ ComplianceSetting copy$default(ComplianceSetting complianceSetting, List list, Integer num, String str, String str2, AdPersonalitySettings adPersonalitySettings, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, TermsConsentInfo termsConsentInfo, TermsConsentInfo termsConsentInfo2, String str3, AgeGateInfo ageGateInfo, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo, Boolean bool4, String str4, Long l, String str5, int i, int i2, int i3, PreferenceSettings preferenceSettings, boolean z, List list2, int i4, Object obj) {
        List list3 = list;
        Integer num3 = num;
        AgeGateInfo ageGateInfo2 = ageGateInfo;
        String str6 = str3;
        TermsConsentInfo termsConsentInfo3 = termsConsentInfo2;
        TermsConsentInfo termsConsentInfo4 = termsConsentInfo;
        Boolean bool5 = bool3;
        LogPbBean logPbBean2 = logPbBean;
        String str7 = str2;
        String str8 = str;
        AdPersonalitySettings adPersonalitySettings2 = adPersonalitySettings;
        Integer num4 = num2;
        Boolean bool6 = bool;
        Boolean bool7 = bool2;
        List list4 = list2;
        PreferenceSettings preferenceSettings2 = preferenceSettings;
        int i5 = i3;
        int i6 = i2;
        Boolean bool8 = bool4;
        boolean z2 = z;
        LegalEntityChangeInfo legalEntityChangeInfo2 = legalEntityChangeInfo;
        String str9 = str4;
        Long l2 = l;
        String str10 = str5;
        int i7 = i;
        if ((i4 & 1) != 0) {
            list3 = complianceSetting.blackSetting;
        }
        if ((i4 & 2) != 0) {
            num3 = complianceSetting.enableImpressum;
        }
        if ((i4 & 4) != 0) {
            str8 = complianceSetting.impressumUrl;
        }
        if ((i4 & 8) != 0) {
            str7 = complianceSetting.privacyPolicyUrl;
        }
        if ((i4 & 16) != 0) {
            adPersonalitySettings2 = complianceSetting.adPersonalitySettings;
        }
        if ((i4 & 32) != 0) {
            num4 = complianceSetting.notifyPrivateAccount;
        }
        if ((i4 & 64) != 0) {
            bool6 = complianceSetting.forcePrivateAccount;
        }
        if ((i4 & 128) != 0) {
            bool7 = complianceSetting.addTermsConsentForRegister;
        }
        if ((i4 & 256) != 0) {
            bool5 = complianceSetting.enableTermsConsentPopup;
        }
        if ((i4 & 512) != 0) {
            termsConsentInfo4 = complianceSetting.termsConsentInfo;
        }
        if ((i4 & 1024) != 0) {
            termsConsentInfo3 = complianceSetting.termConsentInfoNewUsers;
        }
        if ((i4 & 2048) != 0) {
            str6 = complianceSetting.complianceEncrypt;
        }
        if ((i4 & 4096) != 0) {
            ageGateInfo2 = complianceSetting.ageGateInfo;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            logPbBean2 = complianceSetting.logPb;
        }
        if ((i4 & 16384) != 0) {
            legalEntityChangeInfo2 = complianceSetting.legalEntityChangeInfo;
        }
        if ((32768 & i4) != 0) {
            bool8 = complianceSetting.afSharingBlock;
        }
        if ((65536 & i4) != 0) {
            str9 = complianceSetting.interfaceControlSettingsString;
        }
        if ((131072 & i4) != 0) {
            l2 = complianceSetting.deviceLimitRegisterExpiredTime;
        }
        if ((262144 & i4) != 0) {
            str10 = complianceSetting.privacyHighlightsForTeensLink;
        }
        if ((524288 & i4) != 0) {
            i7 = complianceSetting.privateAccountPrompt;
        }
        if ((1048576 & i4) != 0) {
            i6 = complianceSetting.privateAccountPromptType;
        }
        if ((2097152 & i4) != 0) {
            i5 = complianceSetting.isMixedAge;
        }
        if ((4194304 & i4) != 0) {
            preferenceSettings2 = complianceSetting.preferenceSettings;
        }
        if ((8388608 & i4) != 0) {
            z2 = complianceSetting.ageVerificationAction;
        }
        if ((i4 & 16777216) != 0) {
            list4 = complianceSetting.policyInfoList;
        }
        AgeGateInfo ageGateInfo3 = ageGateInfo2;
        return complianceSetting.copy(list3, num3, str8, str7, adPersonalitySettings2, num4, bool6, bool7, bool5, termsConsentInfo4, termsConsentInfo3, str6, ageGateInfo3, logPbBean2, legalEntityChangeInfo2, bool8, str9, l2, str10, i7, i6, i5, preferenceSettings2, z2, list4);
    }

    public final ComplianceSetting copy(List<String> list, Integer num, String str, String str2, AdPersonalitySettings adPersonalitySettings, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, TermsConsentInfo termsConsentInfo, TermsConsentInfo termsConsentInfo2, String str3, AgeGateInfo ageGateInfo, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo, Boolean bool4, String str4, Long l, String privacyHighlightsForTeensLink, int i, int i2, int i3, PreferenceSettings preferenceSettings, boolean z, List<PolicyInfo> list2) {
        o.LJIIIZ(privacyHighlightsForTeensLink, "privacyHighlightsForTeensLink");
        return new ComplianceSetting(list, num, str, str2, adPersonalitySettings, num2, bool, bool2, bool3, termsConsentInfo, termsConsentInfo2, str3, ageGateInfo, logPbBean, legalEntityChangeInfo, bool4, str4, l, privacyHighlightsForTeensLink, i, i2, i3, preferenceSettings, z, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplianceSetting)) {
            return false;
        }
        ComplianceSetting complianceSetting = (ComplianceSetting) obj;
        return o.LJ(this.blackSetting, complianceSetting.blackSetting) && o.LJ(this.enableImpressum, complianceSetting.enableImpressum) && o.LJ(this.impressumUrl, complianceSetting.impressumUrl) && o.LJ(this.privacyPolicyUrl, complianceSetting.privacyPolicyUrl) && o.LJ(this.adPersonalitySettings, complianceSetting.adPersonalitySettings) && o.LJ(this.notifyPrivateAccount, complianceSetting.notifyPrivateAccount) && o.LJ(this.forcePrivateAccount, complianceSetting.forcePrivateAccount) && o.LJ(this.addTermsConsentForRegister, complianceSetting.addTermsConsentForRegister) && o.LJ(this.enableTermsConsentPopup, complianceSetting.enableTermsConsentPopup) && o.LJ(this.termsConsentInfo, complianceSetting.termsConsentInfo) && o.LJ(this.termConsentInfoNewUsers, complianceSetting.termConsentInfoNewUsers) && o.LJ(this.complianceEncrypt, complianceSetting.complianceEncrypt) && o.LJ(this.ageGateInfo, complianceSetting.ageGateInfo) && o.LJ(this.logPb, complianceSetting.logPb) && o.LJ(this.legalEntityChangeInfo, complianceSetting.legalEntityChangeInfo) && o.LJ(this.afSharingBlock, complianceSetting.afSharingBlock) && o.LJ(this.interfaceControlSettingsString, complianceSetting.interfaceControlSettingsString) && o.LJ(this.deviceLimitRegisterExpiredTime, complianceSetting.deviceLimitRegisterExpiredTime) && o.LJ(this.privacyHighlightsForTeensLink, complianceSetting.privacyHighlightsForTeensLink) && this.privateAccountPrompt == complianceSetting.privateAccountPrompt && this.privateAccountPromptType == complianceSetting.privateAccountPromptType && this.isMixedAge == complianceSetting.isMixedAge && o.LJ(this.preferenceSettings, complianceSetting.preferenceSettings) && this.ageVerificationAction == complianceSetting.ageVerificationAction && o.LJ(this.policyInfoList, complianceSetting.policyInfoList);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "ComplianceSetting(blackSetting=" + this.blackSetting + ", enableImpressum=" + this.enableImpressum + ", impressumUrl=" + this.impressumUrl + ", privacyPolicyUrl=" + this.privacyPolicyUrl + ", adPersonalitySettings=" + this.adPersonalitySettings + ", notifyPrivateAccount=" + this.notifyPrivateAccount + ", forcePrivateAccount=" + this.forcePrivateAccount + ", addTermsConsentForRegister=" + this.addTermsConsentForRegister + ", enableTermsConsentPopup=" + this.enableTermsConsentPopup + ", termsConsentInfo=" + this.termsConsentInfo + ", termConsentInfoNewUsers=" + this.termConsentInfoNewUsers + ", complianceEncrypt=" + this.complianceEncrypt + ", ageGateInfo=" + this.ageGateInfo + ", logPb=" + this.logPb + ", legalEntityChangeInfo=" + this.legalEntityChangeInfo + ", afSharingBlock=" + this.afSharingBlock + ", interfaceControlSettingsString=" + this.interfaceControlSettingsString + ", deviceLimitRegisterExpiredTime=" + this.deviceLimitRegisterExpiredTime + ", privacyHighlightsForTeensLink=" + this.privacyHighlightsForTeensLink + ", privateAccountPrompt=" + this.privateAccountPrompt + ", privateAccountPromptType=" + this.privateAccountPromptType + ", isMixedAge=" + this.isMixedAge + ", preferenceSettings=" + this.preferenceSettings + ", ageVerificationAction=" + this.ageVerificationAction + ", policyInfoList=" + this.policyInfoList + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        List<String> list = this.blackSetting;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.enableImpressum;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.impressumUrl;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.privacyPolicyUrl;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        AdPersonalitySettings adPersonalitySettings = this.adPersonalitySettings;
        if (adPersonalitySettings == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = adPersonalitySettings.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num2 = this.notifyPrivateAccount;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Boolean bool = this.forcePrivateAccount;
        if (bool == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Boolean bool2 = this.addTermsConsentForRegister;
        if (bool2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool2.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Boolean bool3 = this.enableTermsConsentPopup;
        if (bool3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool3.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        TermsConsentInfo termsConsentInfo = this.termsConsentInfo;
        if (termsConsentInfo == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = termsConsentInfo.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        TermsConsentInfo termsConsentInfo2 = this.termConsentInfoNewUsers;
        if (termsConsentInfo2 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = termsConsentInfo2.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str3 = this.complianceEncrypt;
        if (str3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str3.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        AgeGateInfo ageGateInfo = this.ageGateInfo;
        if (ageGateInfo == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = ageGateInfo.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = logPbBean.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        LegalEntityChangeInfo legalEntityChangeInfo = this.legalEntityChangeInfo;
        if (legalEntityChangeInfo == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = legalEntityChangeInfo.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        Boolean bool4 = this.afSharingBlock;
        if (bool4 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool4.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        String str4 = this.interfaceControlSettingsString;
        if (str4 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str4.hashCode();
        }
        int i18 = (i17 + hashCode17) * 31;
        Long l = this.deviceLimitRegisterExpiredTime;
        if (l == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = l.hashCode();
        }
        int LJ = (((((C79062V1e.LJ(this.privacyHighlightsForTeensLink, (i18 + hashCode18) * 31, 31) + this.privateAccountPrompt) * 31) + this.privateAccountPromptType) * 31) + this.isMixedAge) * 31;
        PreferenceSettings preferenceSettings = this.preferenceSettings;
        if (preferenceSettings == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = preferenceSettings.hashCode();
        }
        int i19 = (LJ + hashCode19) * 31;
        boolean z = this.ageVerificationAction;
        int i20 = z;
        if (z != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        List<PolicyInfo> list2 = this.policyInfoList;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i21 + i;
    }

    public final AdPersonalitySettings getAdPersonalitySettings() {
        return this.adPersonalitySettings;
    }

    public final Boolean getAddTermsConsentForRegister() {
        return this.addTermsConsentForRegister;
    }

    public final Boolean getAfSharingBlock() {
        return this.afSharingBlock;
    }

    public final AgeGateInfo getAgeGateInfo() {
        return this.ageGateInfo;
    }

    public final boolean getAgeVerificationAction() {
        return this.ageVerificationAction;
    }

    public final List<String> getBlackSetting() {
        return this.blackSetting;
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final Long getDeviceLimitRegisterExpiredTime() {
        return this.deviceLimitRegisterExpiredTime;
    }

    public final Integer getEnableImpressum() {
        return this.enableImpressum;
    }

    public final Boolean getEnableTermsConsentPopup() {
        return this.enableTermsConsentPopup;
    }

    public final Boolean getForcePrivateAccount() {
        return this.forcePrivateAccount;
    }

    public final String getImpressumUrl() {
        return this.impressumUrl;
    }

    public final String getInterfaceControlSettingsString() {
        return this.interfaceControlSettingsString;
    }

    public final LegalEntityChangeInfo getLegalEntityChangeInfo() {
        return this.legalEntityChangeInfo;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Integer getNotifyPrivateAccount() {
        return this.notifyPrivateAccount;
    }

    public final List<PolicyInfo> getPolicyInfoList() {
        return this.policyInfoList;
    }

    public final PreferenceSettings getPreferenceSettings() {
        return this.preferenceSettings;
    }

    public final String getPrivacyHighlightsForTeensLink() {
        return this.privacyHighlightsForTeensLink;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final int getPrivateAccountPrompt() {
        return this.privateAccountPrompt;
    }

    public final int getPrivateAccountPromptType() {
        return this.privateAccountPromptType;
    }

    public final TermsConsentInfo getTermConsentInfoNewUsers() {
        return this.termConsentInfoNewUsers;
    }

    public final TermsConsentInfo getTermsConsentInfo() {
        return this.termsConsentInfo;
    }

    public final int isMixedAge() {
        return this.isMixedAge;
    }

    public ComplianceSetting(List<String> list, Integer num, String str, String str2, AdPersonalitySettings adPersonalitySettings, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, TermsConsentInfo termsConsentInfo, TermsConsentInfo termsConsentInfo2, String str3, AgeGateInfo ageGateInfo, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo, Boolean bool4, String str4, Long l, String privacyHighlightsForTeensLink, int i, int i2, int i3, PreferenceSettings preferenceSettings, boolean z, List<PolicyInfo> list2) {
        o.LJIIIZ(privacyHighlightsForTeensLink, "privacyHighlightsForTeensLink");
        this.blackSetting = list;
        this.enableImpressum = num;
        this.impressumUrl = str;
        this.privacyPolicyUrl = str2;
        this.adPersonalitySettings = adPersonalitySettings;
        this.notifyPrivateAccount = num2;
        this.forcePrivateAccount = bool;
        this.addTermsConsentForRegister = bool2;
        this.enableTermsConsentPopup = bool3;
        this.termsConsentInfo = termsConsentInfo;
        this.termConsentInfoNewUsers = termsConsentInfo2;
        this.complianceEncrypt = str3;
        this.ageGateInfo = ageGateInfo;
        this.logPb = logPbBean;
        this.legalEntityChangeInfo = legalEntityChangeInfo;
        this.afSharingBlock = bool4;
        this.interfaceControlSettingsString = str4;
        this.deviceLimitRegisterExpiredTime = l;
        this.privacyHighlightsForTeensLink = privacyHighlightsForTeensLink;
        this.privateAccountPrompt = i;
        this.privateAccountPromptType = i2;
        this.isMixedAge = i3;
        this.preferenceSettings = preferenceSettings;
        this.ageVerificationAction = z;
        this.policyInfoList = list2;
    }

    public /* synthetic */ ComplianceSetting(List list, Integer num, String str, String str2, AdPersonalitySettings adPersonalitySettings, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, TermsConsentInfo termsConsentInfo, TermsConsentInfo termsConsentInfo2, String str3, AgeGateInfo ageGateInfo, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo, Boolean bool4, String str4, Long l, String str5, int i, int i2, int i3, PreferenceSettings preferenceSettings, boolean z, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : list, (i4 & 2) != 0 ? 0 : num, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? null : str2, (i4 & 16) != 0 ? null : adPersonalitySettings, (i4 & 32) != 0 ? 0 : num2, (i4 & 64) != 0 ? Boolean.FALSE : bool, (i4 & 128) != 0 ? Boolean.FALSE : bool2, (i4 & 256) != 0 ? Boolean.FALSE : bool3, (i4 & 512) != 0 ? null : termsConsentInfo, (i4 & 1024) != 0 ? null : termsConsentInfo2, (i4 & 2048) != 0 ? null : str3, (i4 & 4096) != 0 ? null : ageGateInfo, (i4 & FileUtils.BUFFER_SIZE) != 0 ? null : logPbBean, (i4 & 16384) != 0 ? null : legalEntityChangeInfo, (32768 & i4) != 0 ? Boolean.FALSE : bool4, (65536 & i4) != 0 ? null : str4, (131072 & i4) != 0 ? 0L : l, (262144 & i4) != 0 ? "" : str5, (524288 & i4) != 0 ? 0 : i, (1048576 & i4) != 0 ? 0 : i2, (2097152 & i4) != 0 ? 0 : i3, (4194304 & i4) != 0 ? null : preferenceSettings, (8388608 & i4) != 0 ? false : z, (i4 & 16777216) != 0 ? null : list2);
    }
}
