package com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DistributeAuthorSurveyInfoModel extends F9E {

    @InterfaceC65349Pkn("banner_show_max_seconds")
    public final int bannerShowMaxSeconds;

    @InterfaceC65349Pkn("frequency_control_days")
    public final int frequencyControlDays;

    @InterfaceC65349Pkn("frequency_control_version")
    public final int frequencyControlVersion;

    @InterfaceC65349Pkn("most_disappointed_set_banner_btn")
    public final String mostDisappointedSetBannerBtn;

    @InterfaceC65349Pkn("most_disappointed_set_banner_title")
    public final String mostDisappointedSetBannerTitle;

    @InterfaceC65349Pkn("most_disappointed_set_sheet_option_list")
    public final List<String> mostDisappointedSetSheetOptionList;

    @InterfaceC65349Pkn("most_disappointed_set_sheet_title")
    public final String mostDisappointedSetSheetTitle;

    @InterfaceC65349Pkn("most_wanted_set_banner_btn")
    public final String mostWantedSetBannerBtn;

    @InterfaceC65349Pkn("most_wanted_set_banner_title")
    public final String mostWantedSetBannerTitle;

    @InterfaceC65349Pkn("most_wanted_set_sheet_option_list")
    public final List<String> mostWantedSetSheetOptionList;

    @InterfaceC65349Pkn("most_wanted_set_sheet_title")
    public final String mostWantedSetSheetTitle;

    @InterfaceC65349Pkn("submit_title")
    public final String submitTitle;

    @InterfaceC65349Pkn("survey_distribution_max_show_time")
    public final int surveyDistributionMaxShowTime;

    @InterfaceC65349Pkn("survey_distribution_time_end")
    public final int surveyDistributionTimeEnd;

    @InterfaceC65349Pkn("survey_distribution_time_start")
    public final int surveyDistributionTimeStart;

    @InterfaceC65349Pkn("toast")
    public final String toast;

    public DistributeAuthorSurveyInfoModel() {
        this(0, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, 65535, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.bannerShowMaxSeconds), Integer.valueOf(this.frequencyControlDays), Integer.valueOf(this.frequencyControlVersion), this.mostDisappointedSetBannerBtn, this.mostDisappointedSetBannerTitle, this.mostDisappointedSetSheetOptionList, this.mostDisappointedSetSheetTitle, this.mostWantedSetBannerBtn, this.mostWantedSetBannerTitle, this.mostWantedSetSheetOptionList, this.mostWantedSetSheetTitle, this.submitTitle, Integer.valueOf(this.surveyDistributionTimeEnd), Integer.valueOf(this.surveyDistributionTimeStart), Integer.valueOf(this.surveyDistributionMaxShowTime), this.toast};
    }

    public DistributeAuthorSurveyInfoModel(int i, int i2, int i3, String mostDisappointedSetBannerBtn, String mostDisappointedSetBannerTitle, List<String> mostDisappointedSetSheetOptionList, String mostDisappointedSetSheetTitle, String mostWantedSetBannerBtn, String mostWantedSetBannerTitle, List<String> mostWantedSetSheetOptionList, String mostWantedSetSheetTitle, String submitTitle, int i4, int i5, int i6, String toast) {
        o.LJIIIZ(mostDisappointedSetBannerBtn, "mostDisappointedSetBannerBtn");
        o.LJIIIZ(mostDisappointedSetBannerTitle, "mostDisappointedSetBannerTitle");
        o.LJIIIZ(mostDisappointedSetSheetOptionList, "mostDisappointedSetSheetOptionList");
        o.LJIIIZ(mostDisappointedSetSheetTitle, "mostDisappointedSetSheetTitle");
        o.LJIIIZ(mostWantedSetBannerBtn, "mostWantedSetBannerBtn");
        o.LJIIIZ(mostWantedSetBannerTitle, "mostWantedSetBannerTitle");
        o.LJIIIZ(mostWantedSetSheetOptionList, "mostWantedSetSheetOptionList");
        o.LJIIIZ(mostWantedSetSheetTitle, "mostWantedSetSheetTitle");
        o.LJIIIZ(submitTitle, "submitTitle");
        o.LJIIIZ(toast, "toast");
        this.bannerShowMaxSeconds = i;
        this.frequencyControlDays = i2;
        this.frequencyControlVersion = i3;
        this.mostDisappointedSetBannerBtn = mostDisappointedSetBannerBtn;
        this.mostDisappointedSetBannerTitle = mostDisappointedSetBannerTitle;
        this.mostDisappointedSetSheetOptionList = mostDisappointedSetSheetOptionList;
        this.mostDisappointedSetSheetTitle = mostDisappointedSetSheetTitle;
        this.mostWantedSetBannerBtn = mostWantedSetBannerBtn;
        this.mostWantedSetBannerTitle = mostWantedSetBannerTitle;
        this.mostWantedSetSheetOptionList = mostWantedSetSheetOptionList;
        this.mostWantedSetSheetTitle = mostWantedSetSheetTitle;
        this.submitTitle = submitTitle;
        this.surveyDistributionTimeEnd = i4;
        this.surveyDistributionTimeStart = i5;
        this.surveyDistributionMaxShowTime = i6;
        this.toast = toast;
    }

    public DistributeAuthorSurveyInfoModel(int i, int i2, int i3, String str, String str2, List list, String str3, String str4, String str5, List list2, String str6, String str7, int i4, int i5, int i6, String str8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? "" : str, (i7 & 16) != 0 ? "" : str2, (i7 & 32) != 0 ? C61878OQg.INSTANCE : list, (i7 & 64) != 0 ? "" : str3, (i7 & 128) != 0 ? "" : str4, (i7 & 256) != 0 ? "" : str5, (i7 & 512) != 0 ? C61878OQg.INSTANCE : list2, (i7 & 1024) != 0 ? "" : str6, (i7 & 2048) != 0 ? "" : str7, (i7 & 4096) != 0 ? 0 : i4, (i7 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i5, (i7 & 16384) != 0 ? 0 : i6, (i7 & 32768) == 0 ? str8 : "");
    }
}
