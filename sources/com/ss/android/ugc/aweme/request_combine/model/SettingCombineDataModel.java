package com.ss.android.ugc.aweme.request_combine.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.request_combine.PortraitCombineModel;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SettingCombineDataModel {

    @InterfaceC65349Pkn("/aweme/v1/abtest/param/")
    public AbTestCombineModel abTestCombineModel;

    @InterfaceC65349Pkn("/aweme/v2/activity/settings/")
    public ActivitySettingCombineModel activitySetting;

    @InterfaceC65349Pkn("/aweme/v1/settings/")
    public AwemeSettingCombineModel awemeSetting;

    @InterfaceC65349Pkn("/aweme/v1/commerce/settings/")
    public CommerceSettingCombineModel commerceSettingCombineModel;

    @InterfaceC65349Pkn("/aweme/v1/compliance/settings/")
    public ComplianceSettingCombineModel complianceSetting;

    @InterfaceC65349Pkn("/webcast/setting/")
    public LiveSettingCombineModel liveSetting;

    @InterfaceC65349Pkn("/aweme/v1/notice/count/")
    public NoticeCountCombineModel noticeCountModel;

    @InterfaceC65349Pkn("/tiktok/v1/efficiency_portrait/")
    public final PortraitCombineModel portraitCombineModel;

    @InterfaceC65349Pkn("/aweme/v1/rate/settings/")
    public RateSettingCombineModel rateSettingCombineModel;

    @InterfaceC65349Pkn("/aweme/v2/platform/share/settings/")
    public ShareSettingCombineModel shareSettingCombineModel;

    @InterfaceC65349Pkn("/service/settings/v3/")
    public UnifiedSettingCombineModel unifiedSetting;

    @InterfaceC65349Pkn("/aweme/v1/user/settings/")
    public UserSettingCombineModel userSettingCombineModel;

    public static /* synthetic */ SettingCombineDataModel copy$default(SettingCombineDataModel settingCombineDataModel, UnifiedSettingCombineModel unifiedSettingCombineModel, AwemeSettingCombineModel awemeSettingCombineModel, UserSettingCombineModel userSettingCombineModel, CommerceSettingCombineModel commerceSettingCombineModel, AbTestCombineModel abTestCombineModel, ShareSettingCombineModel shareSettingCombineModel, RateSettingCombineModel rateSettingCombineModel, NoticeCountCombineModel noticeCountCombineModel, LiveSettingCombineModel liveSettingCombineModel, ComplianceSettingCombineModel complianceSettingCombineModel, ActivitySettingCombineModel activitySettingCombineModel, PortraitCombineModel portraitCombineModel, int i, Object obj) {
        if ((i & 1) != 0) {
            unifiedSettingCombineModel = settingCombineDataModel.unifiedSetting;
        }
        if ((i & 2) != 0) {
            awemeSettingCombineModel = settingCombineDataModel.awemeSetting;
        }
        if ((i & 4) != 0) {
            userSettingCombineModel = settingCombineDataModel.userSettingCombineModel;
        }
        if ((i & 8) != 0) {
            commerceSettingCombineModel = settingCombineDataModel.commerceSettingCombineModel;
        }
        if ((i & 16) != 0) {
            abTestCombineModel = settingCombineDataModel.abTestCombineModel;
        }
        if ((i & 32) != 0) {
            shareSettingCombineModel = settingCombineDataModel.shareSettingCombineModel;
        }
        if ((i & 64) != 0) {
            rateSettingCombineModel = settingCombineDataModel.rateSettingCombineModel;
        }
        if ((i & 128) != 0) {
            noticeCountCombineModel = settingCombineDataModel.noticeCountModel;
        }
        if ((i & 256) != 0) {
            liveSettingCombineModel = settingCombineDataModel.liveSetting;
        }
        if ((i & 512) != 0) {
            complianceSettingCombineModel = settingCombineDataModel.complianceSetting;
        }
        if ((i & 1024) != 0) {
            activitySettingCombineModel = settingCombineDataModel.activitySetting;
        }
        if ((i & 2048) != 0) {
            portraitCombineModel = settingCombineDataModel.portraitCombineModel;
        }
        return settingCombineDataModel.copy(unifiedSettingCombineModel, awemeSettingCombineModel, userSettingCombineModel, commerceSettingCombineModel, abTestCombineModel, shareSettingCombineModel, rateSettingCombineModel, noticeCountCombineModel, liveSettingCombineModel, complianceSettingCombineModel, activitySettingCombineModel, portraitCombineModel);
    }

    public final SettingCombineDataModel copy(UnifiedSettingCombineModel unifiedSettingCombineModel, AwemeSettingCombineModel awemeSetting, UserSettingCombineModel userSettingCombineModel, CommerceSettingCombineModel commerceSettingCombineModel, AbTestCombineModel abTestCombineModel, ShareSettingCombineModel shareSettingCombineModel, RateSettingCombineModel rateSettingCombineModel, NoticeCountCombineModel noticeCountModel, LiveSettingCombineModel liveSetting, ComplianceSettingCombineModel complianceSetting, ActivitySettingCombineModel activitySetting, PortraitCombineModel portraitCombineModel) {
        o.LJIIIZ(awemeSetting, "awemeSetting");
        o.LJIIIZ(userSettingCombineModel, "userSettingCombineModel");
        o.LJIIIZ(commerceSettingCombineModel, "commerceSettingCombineModel");
        o.LJIIIZ(abTestCombineModel, "abTestCombineModel");
        o.LJIIIZ(shareSettingCombineModel, "shareSettingCombineModel");
        o.LJIIIZ(rateSettingCombineModel, "rateSettingCombineModel");
        o.LJIIIZ(noticeCountModel, "noticeCountModel");
        o.LJIIIZ(liveSetting, "liveSetting");
        o.LJIIIZ(complianceSetting, "complianceSetting");
        o.LJIIIZ(activitySetting, "activitySetting");
        o.LJIIIZ(portraitCombineModel, "portraitCombineModel");
        return new SettingCombineDataModel(unifiedSettingCombineModel, awemeSetting, userSettingCombineModel, commerceSettingCombineModel, abTestCombineModel, shareSettingCombineModel, rateSettingCombineModel, noticeCountModel, liveSetting, complianceSetting, activitySetting, portraitCombineModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingCombineDataModel)) {
            return false;
        }
        SettingCombineDataModel settingCombineDataModel = (SettingCombineDataModel) obj;
        return o.LJ(this.unifiedSetting, settingCombineDataModel.unifiedSetting) && o.LJ(this.awemeSetting, settingCombineDataModel.awemeSetting) && o.LJ(this.userSettingCombineModel, settingCombineDataModel.userSettingCombineModel) && o.LJ(this.commerceSettingCombineModel, settingCombineDataModel.commerceSettingCombineModel) && o.LJ(this.abTestCombineModel, settingCombineDataModel.abTestCombineModel) && o.LJ(this.shareSettingCombineModel, settingCombineDataModel.shareSettingCombineModel) && o.LJ(this.rateSettingCombineModel, settingCombineDataModel.rateSettingCombineModel) && o.LJ(this.noticeCountModel, settingCombineDataModel.noticeCountModel) && o.LJ(this.liveSetting, settingCombineDataModel.liveSetting) && o.LJ(this.complianceSetting, settingCombineDataModel.complianceSetting) && o.LJ(this.activitySetting, settingCombineDataModel.activitySetting) && o.LJ(this.portraitCombineModel, settingCombineDataModel.portraitCombineModel);
    }

    public int hashCode() {
        UnifiedSettingCombineModel unifiedSettingCombineModel = this.unifiedSetting;
        return this.portraitCombineModel.hashCode() + ((this.activitySetting.hashCode() + ((this.complianceSetting.hashCode() + ((this.liveSetting.hashCode() + ((this.noticeCountModel.hashCode() + ((this.rateSettingCombineModel.hashCode() + ((this.shareSettingCombineModel.hashCode() + ((this.abTestCombineModel.hashCode() + ((this.commerceSettingCombineModel.hashCode() + ((this.userSettingCombineModel.hashCode() + ((this.awemeSetting.hashCode() + ((unifiedSettingCombineModel == null ? 0 : unifiedSettingCombineModel.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SettingCombineDataModel(unifiedSetting=" + this.unifiedSetting + ", awemeSetting=" + this.awemeSetting + ", userSettingCombineModel=" + this.userSettingCombineModel + ", commerceSettingCombineModel=" + this.commerceSettingCombineModel + ", abTestCombineModel=" + this.abTestCombineModel + ", shareSettingCombineModel=" + this.shareSettingCombineModel + ", rateSettingCombineModel=" + this.rateSettingCombineModel + ", noticeCountModel=" + this.noticeCountModel + ", liveSetting=" + this.liveSetting + ", complianceSetting=" + this.complianceSetting + ", activitySetting=" + this.activitySetting + ", portraitCombineModel=" + this.portraitCombineModel + ')';
    }

    public final AbTestCombineModel getAbTestCombineModel() {
        return this.abTestCombineModel;
    }

    public final ActivitySettingCombineModel getActivitySetting() {
        return this.activitySetting;
    }

    public final AwemeSettingCombineModel getAwemeSetting() {
        return this.awemeSetting;
    }

    public final CommerceSettingCombineModel getCommerceSettingCombineModel() {
        return this.commerceSettingCombineModel;
    }

    public final ComplianceSettingCombineModel getComplianceSetting() {
        return this.complianceSetting;
    }

    public final LiveSettingCombineModel getLiveSetting() {
        return this.liveSetting;
    }

    public final NoticeCountCombineModel getNoticeCountModel() {
        return this.noticeCountModel;
    }

    public final PortraitCombineModel getPortraitCombineModel() {
        return this.portraitCombineModel;
    }

    public final RateSettingCombineModel getRateSettingCombineModel() {
        return this.rateSettingCombineModel;
    }

    public final ShareSettingCombineModel getShareSettingCombineModel() {
        return this.shareSettingCombineModel;
    }

    public final UnifiedSettingCombineModel getUnifiedSetting() {
        return this.unifiedSetting;
    }

    public final UserSettingCombineModel getUserSettingCombineModel() {
        return this.userSettingCombineModel;
    }

    public final void setAbTestCombineModel(AbTestCombineModel abTestCombineModel) {
        o.LJIIIZ(abTestCombineModel, "<set-?>");
        this.abTestCombineModel = abTestCombineModel;
    }

    public final void setActivitySetting(ActivitySettingCombineModel activitySettingCombineModel) {
        o.LJIIIZ(activitySettingCombineModel, "<set-?>");
        this.activitySetting = activitySettingCombineModel;
    }

    public final void setAwemeSetting(AwemeSettingCombineModel awemeSettingCombineModel) {
        o.LJIIIZ(awemeSettingCombineModel, "<set-?>");
        this.awemeSetting = awemeSettingCombineModel;
    }

    public final void setCommerceSettingCombineModel(CommerceSettingCombineModel commerceSettingCombineModel) {
        o.LJIIIZ(commerceSettingCombineModel, "<set-?>");
        this.commerceSettingCombineModel = commerceSettingCombineModel;
    }

    public final void setComplianceSetting(ComplianceSettingCombineModel complianceSettingCombineModel) {
        o.LJIIIZ(complianceSettingCombineModel, "<set-?>");
        this.complianceSetting = complianceSettingCombineModel;
    }

    public final void setLiveSetting(LiveSettingCombineModel liveSettingCombineModel) {
        o.LJIIIZ(liveSettingCombineModel, "<set-?>");
        this.liveSetting = liveSettingCombineModel;
    }

    public final void setNoticeCountModel(NoticeCountCombineModel noticeCountCombineModel) {
        o.LJIIIZ(noticeCountCombineModel, "<set-?>");
        this.noticeCountModel = noticeCountCombineModel;
    }

    public final void setRateSettingCombineModel(RateSettingCombineModel rateSettingCombineModel) {
        o.LJIIIZ(rateSettingCombineModel, "<set-?>");
        this.rateSettingCombineModel = rateSettingCombineModel;
    }

    public final void setShareSettingCombineModel(ShareSettingCombineModel shareSettingCombineModel) {
        o.LJIIIZ(shareSettingCombineModel, "<set-?>");
        this.shareSettingCombineModel = shareSettingCombineModel;
    }

    public final void setUnifiedSetting(UnifiedSettingCombineModel unifiedSettingCombineModel) {
        this.unifiedSetting = unifiedSettingCombineModel;
    }

    public final void setUserSettingCombineModel(UserSettingCombineModel userSettingCombineModel) {
        o.LJIIIZ(userSettingCombineModel, "<set-?>");
        this.userSettingCombineModel = userSettingCombineModel;
    }

    public SettingCombineDataModel(UnifiedSettingCombineModel unifiedSettingCombineModel, AwemeSettingCombineModel awemeSetting, UserSettingCombineModel userSettingCombineModel, CommerceSettingCombineModel commerceSettingCombineModel, AbTestCombineModel abTestCombineModel, ShareSettingCombineModel shareSettingCombineModel, RateSettingCombineModel rateSettingCombineModel, NoticeCountCombineModel noticeCountModel, LiveSettingCombineModel liveSetting, ComplianceSettingCombineModel complianceSetting, ActivitySettingCombineModel activitySetting, PortraitCombineModel portraitCombineModel) {
        o.LJIIIZ(awemeSetting, "awemeSetting");
        o.LJIIIZ(userSettingCombineModel, "userSettingCombineModel");
        o.LJIIIZ(commerceSettingCombineModel, "commerceSettingCombineModel");
        o.LJIIIZ(abTestCombineModel, "abTestCombineModel");
        o.LJIIIZ(shareSettingCombineModel, "shareSettingCombineModel");
        o.LJIIIZ(rateSettingCombineModel, "rateSettingCombineModel");
        o.LJIIIZ(noticeCountModel, "noticeCountModel");
        o.LJIIIZ(liveSetting, "liveSetting");
        o.LJIIIZ(complianceSetting, "complianceSetting");
        o.LJIIIZ(activitySetting, "activitySetting");
        o.LJIIIZ(portraitCombineModel, "portraitCombineModel");
        this.unifiedSetting = unifiedSettingCombineModel;
        this.awemeSetting = awemeSetting;
        this.userSettingCombineModel = userSettingCombineModel;
        this.commerceSettingCombineModel = commerceSettingCombineModel;
        this.abTestCombineModel = abTestCombineModel;
        this.shareSettingCombineModel = shareSettingCombineModel;
        this.rateSettingCombineModel = rateSettingCombineModel;
        this.noticeCountModel = noticeCountModel;
        this.liveSetting = liveSetting;
        this.complianceSetting = complianceSetting;
        this.activitySetting = activitySetting;
        this.portraitCombineModel = portraitCombineModel;
    }
}
