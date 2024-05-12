package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.UC7;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HTCMissionModule implements Serializable {

    @InterfaceC65349Pkn("banner_type")
    public final Integer bannerType;

    @InterfaceC65349Pkn("description")
    public final FormattedText description;

    @InterfaceC65349Pkn("enable_popup_window")
    public final Boolean enablePopupWindow;

    @InterfaceC65349Pkn("is_eligible_user")
    public final Boolean isEligibleUser;

    @InterfaceC65349Pkn("mission_id")
    public final String missionId;

    @InterfaceC65349Pkn("mission_stage")
    public final Integer missionLabelType;

    @InterfaceC65349Pkn("open_url")
    public final String openUrl;

    @InterfaceC65349Pkn("participants_str")
    public final FormattedText participantsStr;

    @InterfaceC65349Pkn("progress_bar_text")
    public final String progressBarText;

    @InterfaceC65349Pkn("reward_consume_percent")
    public final Double rewardConsumePercent;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("text_type")
    public final Integer textType;

    public static /* synthetic */ HTCMissionModule copy$default(HTCMissionModule hTCMissionModule, String str, String str2, String str3, Boolean bool, Integer num, Double d, String str4, FormattedText formattedText, FormattedText formattedText2, Integer num2, Boolean bool2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hTCMissionModule.missionId;
        }
        if ((i & 2) != 0) {
            str2 = hTCMissionModule.text;
        }
        if ((i & 4) != 0) {
            str3 = hTCMissionModule.openUrl;
        }
        if ((i & 8) != 0) {
            bool = hTCMissionModule.isEligibleUser;
        }
        if ((i & 16) != 0) {
            num = hTCMissionModule.missionLabelType;
        }
        if ((i & 32) != 0) {
            d = hTCMissionModule.rewardConsumePercent;
        }
        if ((i & 64) != 0) {
            str4 = hTCMissionModule.progressBarText;
        }
        if ((i & 128) != 0) {
            formattedText = hTCMissionModule.participantsStr;
        }
        if ((i & 256) != 0) {
            formattedText2 = hTCMissionModule.description;
        }
        if ((i & 512) != 0) {
            num2 = hTCMissionModule.bannerType;
        }
        if ((i & 1024) != 0) {
            bool2 = hTCMissionModule.enablePopupWindow;
        }
        if ((i & 2048) != 0) {
            num3 = hTCMissionModule.textType;
        }
        return hTCMissionModule.copy(str, str2, str3, bool, num, d, str4, formattedText, formattedText2, num2, bool2, num3);
    }

    public final HTCMissionModule copy(String str, String str2, String str3, Boolean bool, Integer num, Double d, String str4, FormattedText formattedText, FormattedText formattedText2, Integer num2, Boolean bool2, Integer num3) {
        return new HTCMissionModule(str, str2, str3, bool, num, d, str4, formattedText, formattedText2, num2, bool2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTCMissionModule)) {
            return false;
        }
        HTCMissionModule hTCMissionModule = (HTCMissionModule) obj;
        return o.LJ(this.missionId, hTCMissionModule.missionId) && o.LJ(this.text, hTCMissionModule.text) && o.LJ(this.openUrl, hTCMissionModule.openUrl) && o.LJ(this.isEligibleUser, hTCMissionModule.isEligibleUser) && o.LJ(this.missionLabelType, hTCMissionModule.missionLabelType) && o.LJ(this.rewardConsumePercent, hTCMissionModule.rewardConsumePercent) && o.LJ(this.progressBarText, hTCMissionModule.progressBarText) && o.LJ(this.participantsStr, hTCMissionModule.participantsStr) && o.LJ(this.description, hTCMissionModule.description) && o.LJ(this.bannerType, hTCMissionModule.bannerType) && o.LJ(this.enablePopupWindow, hTCMissionModule.enablePopupWindow) && o.LJ(this.textType, hTCMissionModule.textType);
    }

    public int hashCode() {
        String str = this.missionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.openUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isEligibleUser;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.missionLabelType;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rewardConsumePercent;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.progressBarText;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FormattedText formattedText = this.participantsStr;
        int hashCode8 = (hashCode7 + (formattedText == null ? 0 : formattedText.hashCode())) * 31;
        FormattedText formattedText2 = this.description;
        int hashCode9 = (hashCode8 + (formattedText2 == null ? 0 : formattedText2.hashCode())) * 31;
        Integer num2 = this.bannerType;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.enablePopupWindow;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.textType;
        return hashCode11 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HTCMissionModule(missionId=");
        sb.append(this.missionId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", openUrl=");
        sb.append(this.openUrl);
        sb.append(", isEligibleUser=");
        sb.append(this.isEligibleUser);
        sb.append(", missionLabelType=");
        sb.append(this.missionLabelType);
        sb.append(", rewardConsumePercent=");
        sb.append(this.rewardConsumePercent);
        sb.append(", progressBarText=");
        sb.append(this.progressBarText);
        sb.append(", participantsStr=");
        sb.append(this.participantsStr);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", bannerType=");
        sb.append(this.bannerType);
        sb.append(", enablePopupWindow=");
        sb.append(this.enablePopupWindow);
        sb.append(", textType=");
        return UC7.LIZ(sb, this.textType, ')');
    }

    public final Integer getBannerType() {
        return this.bannerType;
    }

    public final FormattedText getDescription() {
        return this.description;
    }

    public final Boolean getEnablePopupWindow() {
        return this.enablePopupWindow;
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public final Integer getMissionLabelType() {
        return this.missionLabelType;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final FormattedText getParticipantsStr() {
        return this.participantsStr;
    }

    public final String getProgressBarText() {
        return this.progressBarText;
    }

    public final Double getRewardConsumePercent() {
        return this.rewardConsumePercent;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getTextType() {
        return this.textType;
    }

    public final Boolean isEligibleUser() {
        return this.isEligibleUser;
    }

    public HTCMissionModule(String str, String str2, String str3, Boolean bool, Integer num, Double d, String str4, FormattedText formattedText, FormattedText formattedText2, Integer num2, Boolean bool2, Integer num3) {
        this.missionId = str;
        this.text = str2;
        this.openUrl = str3;
        this.isEligibleUser = bool;
        this.missionLabelType = num;
        this.rewardConsumePercent = d;
        this.progressBarText = str4;
        this.participantsStr = formattedText;
        this.description = formattedText2;
        this.bannerType = num2;
        this.enablePopupWindow = bool2;
        this.textType = num3;
    }

    public /* synthetic */ HTCMissionModule(String str, String str2, String str3, Boolean bool, Integer num, Double d, String str4, FormattedText formattedText, FormattedText formattedText2, Integer num2, Boolean bool2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : str4, (i & 128) == 0 ? formattedText : null, formattedText2, num2, bool2, num3);
    }
}
