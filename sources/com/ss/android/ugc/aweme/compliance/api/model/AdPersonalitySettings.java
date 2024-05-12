package com.ss.android.ugc.aweme.compliance.api.model;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AdPersonalitySettings implements Serializable {

    @InterfaceC65349Pkn("pa_revising_switch")
    public final Boolean PARevisingSwitch;

    @InterfaceC65349Pkn("ab_test_pop_up_copy_writing")
    public final PopUpCopyWriting abCopyWriting;

    @InterfaceC65349Pkn("pop_up_copywriting_content_type")
    public final Integer contentType;

    @InterfaceC65349Pkn("pop_up_copywriting")
    public final CopyWritingInfo copyWriting;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("enable_toggle_decoupling")
    public final Boolean enableToggleDecoupling;

    @InterfaceC65349Pkn("is_follow_sys_config")
    public final Boolean isFollowSystemConfig;

    @InterfaceC65349Pkn("is_new_user")
    public final Integer isNewUser;

    @InterfaceC65349Pkn("is_np_user")
    public final Boolean isNpUser;

    @InterfaceC65349Pkn("show_advertiser_settings")
    public final Boolean isShowAdvertiserSettings;

    @InterfaceC65349Pkn("is_show_reset_entry")
    public final Boolean isShowResetEntry;

    @InterfaceC65349Pkn("is_show_settings")
    public final Boolean isShowSettings;

    @InterfaceC65349Pkn("is_teenager_mode")
    public final Integer isTeenagerMode;

    @InterfaceC65349Pkn("use_balance_prompt")
    public final Boolean isUseBalancePrompt;

    @InterfaceC65349Pkn("limit_ad_tracking")
    public final Boolean lat;

    @InterfaceC65349Pkn("mode")
    public final Integer mode;

    @InterfaceC65349Pkn("need_pop_up")
    public Boolean needPopUp;

    @InterfaceC65349Pkn("pop_up_copywriting_test_style")
    public final Integer popUpStyle;

    @InterfaceC65349Pkn("popup_check_text_style")
    public final Integer promptStyle;

    @InterfaceC65349Pkn("reset_entry_text")
    public final ResetEntryTextData reset;

    @InterfaceC65349Pkn("use_new_interests")
    public final Integer showInterestItemType;

    @InterfaceC65349Pkn("pers_ad_show_interest_label")
    public final Boolean showInterestLabel;

    @InterfaceC65349Pkn("ad_free_subscription")
    public final AdFreeSubscription subscription;

    @InterfaceC65349Pkn("pers_ad_main_mode_title")
    public final String title;

    @InterfaceC65349Pkn("unified_mode")
    public final Integer unifiedMode;

    @InterfaceC65349Pkn("unified_mode_text_data")
    public final UnifiedModeTextData unifiedModeTextData;

    /* JADX WARN: Multi-variable type inference failed */
    public AdPersonalitySettings() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 67108863, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdPersonalitySettings copy$default(AdPersonalitySettings adPersonalitySettings, Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Boolean bool4, Integer num2, Boolean bool5, Integer num3, Boolean bool6, Integer num4, Integer num5, Integer num6, Boolean bool7, UnifiedModeTextData unifiedModeTextData, Boolean bool8, ResetEntryTextData resetEntryTextData, Boolean bool9, Boolean bool10, Integer num7, Integer num8, PopUpCopyWriting popUpCopyWriting, AdFreeSubscription adFreeSubscription, Boolean bool11, int i, Object obj) {
        Integer num9 = num;
        Integer num10 = num4;
        Boolean bool12 = bool6;
        Integer num11 = num3;
        Boolean bool13 = bool5;
        Integer num12 = num2;
        Boolean bool14 = bool4;
        Boolean bool15 = bool2;
        Boolean bool16 = bool;
        String str3 = str;
        Integer num13 = num5;
        String str4 = str2;
        CopyWritingInfo copyWritingInfo2 = copyWritingInfo;
        Boolean bool17 = bool3;
        Boolean bool18 = bool11;
        PopUpCopyWriting popUpCopyWriting2 = popUpCopyWriting;
        Integer num14 = num8;
        Integer num15 = num7;
        Boolean bool19 = bool10;
        Boolean bool20 = bool7;
        AdFreeSubscription adFreeSubscription2 = adFreeSubscription;
        Integer num16 = num6;
        UnifiedModeTextData unifiedModeTextData2 = unifiedModeTextData;
        Boolean bool21 = bool8;
        ResetEntryTextData resetEntryTextData2 = resetEntryTextData;
        Boolean bool22 = bool9;
        if ((i & 1) != 0) {
            num9 = adPersonalitySettings.mode;
        }
        if ((i & 2) != 0) {
            bool16 = adPersonalitySettings.needPopUp;
        }
        if ((i & 4) != 0) {
            bool15 = adPersonalitySettings.isFollowSystemConfig;
        }
        if ((i & 8) != 0) {
            str3 = adPersonalitySettings.description;
        }
        if ((i & 16) != 0) {
            str4 = adPersonalitySettings.title;
        }
        if ((i & 32) != 0) {
            copyWritingInfo2 = adPersonalitySettings.copyWriting;
        }
        if ((i & 64) != 0) {
            bool17 = adPersonalitySettings.isShowSettings;
        }
        if ((i & 128) != 0) {
            bool14 = adPersonalitySettings.showInterestLabel;
        }
        if ((i & 256) != 0) {
            num12 = adPersonalitySettings.showInterestItemType;
        }
        if ((i & 512) != 0) {
            bool13 = adPersonalitySettings.lat;
        }
        if ((i & 1024) != 0) {
            num11 = adPersonalitySettings.promptStyle;
        }
        if ((i & 2048) != 0) {
            bool12 = adPersonalitySettings.isNpUser;
        }
        if ((i & 4096) != 0) {
            num10 = adPersonalitySettings.unifiedMode;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            num13 = adPersonalitySettings.isTeenagerMode;
        }
        if ((i & 16384) != 0) {
            num16 = adPersonalitySettings.isNewUser;
        }
        if ((32768 & i) != 0) {
            bool20 = adPersonalitySettings.PARevisingSwitch;
        }
        if ((65536 & i) != 0) {
            unifiedModeTextData2 = adPersonalitySettings.unifiedModeTextData;
        }
        if ((131072 & i) != 0) {
            bool21 = adPersonalitySettings.isShowResetEntry;
        }
        if ((262144 & i) != 0) {
            resetEntryTextData2 = adPersonalitySettings.reset;
        }
        if ((524288 & i) != 0) {
            bool22 = adPersonalitySettings.isUseBalancePrompt;
        }
        if ((1048576 & i) != 0) {
            bool19 = adPersonalitySettings.isShowAdvertiserSettings;
        }
        if ((2097152 & i) != 0) {
            num15 = adPersonalitySettings.popUpStyle;
        }
        if ((4194304 & i) != 0) {
            num14 = adPersonalitySettings.contentType;
        }
        if ((8388608 & i) != 0) {
            popUpCopyWriting2 = adPersonalitySettings.abCopyWriting;
        }
        if ((16777216 & i) != 0) {
            adFreeSubscription2 = adPersonalitySettings.subscription;
        }
        if ((i & 33554432) != 0) {
            bool18 = adPersonalitySettings.enableToggleDecoupling;
        }
        return adPersonalitySettings.copy(num9, bool16, bool15, str3, str4, copyWritingInfo2, bool17, bool14, num12, bool13, num11, bool12, num10, num13, num16, bool20, unifiedModeTextData2, bool21, resetEntryTextData2, bool22, bool19, num15, num14, popUpCopyWriting2, adFreeSubscription2, bool18);
    }

    public final AdPersonalitySettings copy(Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Boolean bool4, Integer num2, Boolean bool5, Integer num3, Boolean bool6, Integer num4, Integer num5, Integer num6, Boolean bool7, UnifiedModeTextData unifiedModeTextData, Boolean bool8, ResetEntryTextData resetEntryTextData, Boolean bool9, Boolean bool10, Integer num7, Integer num8, PopUpCopyWriting popUpCopyWriting, AdFreeSubscription adFreeSubscription, Boolean bool11) {
        return new AdPersonalitySettings(num, bool, bool2, str, str2, copyWritingInfo, bool3, bool4, num2, bool5, num3, bool6, num4, num5, num6, bool7, unifiedModeTextData, bool8, resetEntryTextData, bool9, bool10, num7, num8, popUpCopyWriting, adFreeSubscription, bool11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdPersonalitySettings)) {
            return false;
        }
        AdPersonalitySettings adPersonalitySettings = (AdPersonalitySettings) obj;
        return o.LJ(this.mode, adPersonalitySettings.mode) && o.LJ(this.needPopUp, adPersonalitySettings.needPopUp) && o.LJ(this.isFollowSystemConfig, adPersonalitySettings.isFollowSystemConfig) && o.LJ(this.description, adPersonalitySettings.description) && o.LJ(this.title, adPersonalitySettings.title) && o.LJ(this.copyWriting, adPersonalitySettings.copyWriting) && o.LJ(this.isShowSettings, adPersonalitySettings.isShowSettings) && o.LJ(this.showInterestLabel, adPersonalitySettings.showInterestLabel) && o.LJ(this.showInterestItemType, adPersonalitySettings.showInterestItemType) && o.LJ(this.lat, adPersonalitySettings.lat) && o.LJ(this.promptStyle, adPersonalitySettings.promptStyle) && o.LJ(this.isNpUser, adPersonalitySettings.isNpUser) && o.LJ(this.unifiedMode, adPersonalitySettings.unifiedMode) && o.LJ(this.isTeenagerMode, adPersonalitySettings.isTeenagerMode) && o.LJ(this.isNewUser, adPersonalitySettings.isNewUser) && o.LJ(this.PARevisingSwitch, adPersonalitySettings.PARevisingSwitch) && o.LJ(this.unifiedModeTextData, adPersonalitySettings.unifiedModeTextData) && o.LJ(this.isShowResetEntry, adPersonalitySettings.isShowResetEntry) && o.LJ(this.reset, adPersonalitySettings.reset) && o.LJ(this.isUseBalancePrompt, adPersonalitySettings.isUseBalancePrompt) && o.LJ(this.isShowAdvertiserSettings, adPersonalitySettings.isShowAdvertiserSettings) && o.LJ(this.popUpStyle, adPersonalitySettings.popUpStyle) && o.LJ(this.contentType, adPersonalitySettings.contentType) && o.LJ(this.abCopyWriting, adPersonalitySettings.abCopyWriting) && o.LJ(this.subscription, adPersonalitySettings.subscription) && o.LJ(this.enableToggleDecoupling, adPersonalitySettings.enableToggleDecoupling);
    }

    public int hashCode() {
        Integer num = this.mode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.needPopUp;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFollowSystemConfig;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.description;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CopyWritingInfo copyWritingInfo = this.copyWriting;
        int hashCode6 = (hashCode5 + (copyWritingInfo == null ? 0 : copyWritingInfo.hashCode())) * 31;
        Boolean bool3 = this.isShowSettings;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showInterestLabel;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num2 = this.showInterestItemType;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool5 = this.lat;
        int hashCode10 = (hashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.promptStyle;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool6 = this.isNpUser;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num4 = this.unifiedMode;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.isTeenagerMode;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.isNewUser;
        int hashCode15 = (hashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool7 = this.PARevisingSwitch;
        int hashCode16 = (hashCode15 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        UnifiedModeTextData unifiedModeTextData = this.unifiedModeTextData;
        int hashCode17 = (hashCode16 + (unifiedModeTextData == null ? 0 : unifiedModeTextData.hashCode())) * 31;
        Boolean bool8 = this.isShowResetEntry;
        int hashCode18 = (hashCode17 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        ResetEntryTextData resetEntryTextData = this.reset;
        int hashCode19 = (hashCode18 + (resetEntryTextData == null ? 0 : resetEntryTextData.hashCode())) * 31;
        Boolean bool9 = this.isUseBalancePrompt;
        int hashCode20 = (hashCode19 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.isShowAdvertiserSettings;
        int hashCode21 = (hashCode20 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Integer num7 = this.popUpStyle;
        int hashCode22 = (hashCode21 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.contentType;
        int hashCode23 = (hashCode22 + (num8 == null ? 0 : num8.hashCode())) * 31;
        PopUpCopyWriting popUpCopyWriting = this.abCopyWriting;
        int hashCode24 = (hashCode23 + (popUpCopyWriting == null ? 0 : popUpCopyWriting.hashCode())) * 31;
        AdFreeSubscription adFreeSubscription = this.subscription;
        int hashCode25 = (hashCode24 + (adFreeSubscription == null ? 0 : adFreeSubscription.hashCode())) * 31;
        Boolean bool11 = this.enableToggleDecoupling;
        return hashCode25 + (bool11 != null ? bool11.hashCode() : 0);
    }

    public String toString() {
        return "AdPersonalitySettings(mode=" + this.mode + ", needPopUp=" + this.needPopUp + ", isFollowSystemConfig=" + this.isFollowSystemConfig + ", description=" + this.description + ", title=" + this.title + ", copyWriting=" + this.copyWriting + ", isShowSettings=" + this.isShowSettings + ", showInterestLabel=" + this.showInterestLabel + ", showInterestItemType=" + this.showInterestItemType + ", lat=" + this.lat + ", promptStyle=" + this.promptStyle + ", isNpUser=" + this.isNpUser + ", unifiedMode=" + this.unifiedMode + ", isTeenagerMode=" + this.isTeenagerMode + ", isNewUser=" + this.isNewUser + ", PARevisingSwitch=" + this.PARevisingSwitch + ", unifiedModeTextData=" + this.unifiedModeTextData + ", isShowResetEntry=" + this.isShowResetEntry + ", reset=" + this.reset + ", isUseBalancePrompt=" + this.isUseBalancePrompt + ", isShowAdvertiserSettings=" + this.isShowAdvertiserSettings + ", popUpStyle=" + this.popUpStyle + ", contentType=" + this.contentType + ", abCopyWriting=" + this.abCopyWriting + ", subscription=" + this.subscription + ", enableToggleDecoupling=" + this.enableToggleDecoupling + ')';
    }

    public final PopUpCopyWriting getAbCopyWriting() {
        return this.abCopyWriting;
    }

    public final Integer getContentType() {
        return this.contentType;
    }

    public final CopyWritingInfo getCopyWriting() {
        return this.copyWriting;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getEnableToggleDecoupling() {
        return this.enableToggleDecoupling;
    }

    public final Boolean getLat() {
        return this.lat;
    }

    public final Integer getMode() {
        return this.mode;
    }

    public final Boolean getNeedPopUp() {
        return this.needPopUp;
    }

    public final Boolean getPARevisingSwitch() {
        return this.PARevisingSwitch;
    }

    public final Integer getPopUpStyle() {
        return this.popUpStyle;
    }

    public final Integer getPromptStyle() {
        return this.promptStyle;
    }

    public final ResetEntryTextData getReset() {
        return this.reset;
    }

    public final Integer getShowInterestItemType() {
        return this.showInterestItemType;
    }

    public final Boolean getShowInterestLabel() {
        return this.showInterestLabel;
    }

    public final AdFreeSubscription getSubscription() {
        return this.subscription;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getUnifiedMode() {
        return this.unifiedMode;
    }

    public final UnifiedModeTextData getUnifiedModeTextData() {
        return this.unifiedModeTextData;
    }

    public final Boolean isFollowSystemConfig() {
        return this.isFollowSystemConfig;
    }

    public final Integer isNewUser() {
        return this.isNewUser;
    }

    public final Boolean isNpUser() {
        return this.isNpUser;
    }

    public final Boolean isShowAdvertiserSettings() {
        return this.isShowAdvertiserSettings;
    }

    public final Boolean isShowResetEntry() {
        return this.isShowResetEntry;
    }

    public final Boolean isShowSettings() {
        return this.isShowSettings;
    }

    public final Integer isTeenagerMode() {
        return this.isTeenagerMode;
    }

    public final Boolean isUseBalancePrompt() {
        return this.isUseBalancePrompt;
    }

    public final void setNeedPopUp(Boolean bool) {
        this.needPopUp = bool;
    }

    public AdPersonalitySettings(Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Boolean bool4, Integer num2, Boolean bool5, Integer num3, Boolean bool6, Integer num4, Integer num5, Integer num6, Boolean bool7, UnifiedModeTextData unifiedModeTextData, Boolean bool8, ResetEntryTextData resetEntryTextData, Boolean bool9, Boolean bool10, Integer num7, Integer num8, PopUpCopyWriting popUpCopyWriting, AdFreeSubscription adFreeSubscription, Boolean bool11) {
        this.mode = num;
        this.needPopUp = bool;
        this.isFollowSystemConfig = bool2;
        this.description = str;
        this.title = str2;
        this.copyWriting = copyWritingInfo;
        this.isShowSettings = bool3;
        this.showInterestLabel = bool4;
        this.showInterestItemType = num2;
        this.lat = bool5;
        this.promptStyle = num3;
        this.isNpUser = bool6;
        this.unifiedMode = num4;
        this.isTeenagerMode = num5;
        this.isNewUser = num6;
        this.PARevisingSwitch = bool7;
        this.unifiedModeTextData = unifiedModeTextData;
        this.isShowResetEntry = bool8;
        this.reset = resetEntryTextData;
        this.isUseBalancePrompt = bool9;
        this.isShowAdvertiserSettings = bool10;
        this.popUpStyle = num7;
        this.contentType = num8;
        this.abCopyWriting = popUpCopyWriting;
        this.subscription = adFreeSubscription;
        this.enableToggleDecoupling = bool11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AdPersonalitySettings(java.lang.Integer r30, java.lang.Boolean r31, java.lang.Boolean r32, java.lang.String r33, java.lang.String r34, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo r35, java.lang.Boolean r36, java.lang.Boolean r37, java.lang.Integer r38, java.lang.Boolean r39, java.lang.Integer r40, java.lang.Boolean r41, java.lang.Integer r42, java.lang.Integer r43, java.lang.Integer r44, java.lang.Boolean r45, com.ss.android.ugc.aweme.compliance.api.model.UnifiedModeTextData r46, java.lang.Boolean r47, com.ss.android.ugc.aweme.compliance.api.model.ResetEntryTextData r48, java.lang.Boolean r49, java.lang.Boolean r50, java.lang.Integer r51, java.lang.Integer r52, com.ss.android.ugc.aweme.compliance.api.model.PopUpCopyWriting r53, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription r54, java.lang.Boolean r55, int r56, kotlin.jvm.internal.DefaultConstructorMarker r57) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, com.ss.android.ugc.aweme.compliance.api.model.UnifiedModeTextData, java.lang.Boolean, com.ss.android.ugc.aweme.compliance.api.model.ResetEntryTextData, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, com.ss.android.ugc.aweme.compliance.api.model.PopUpCopyWriting, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
