package com.ss.ugc.aweme.creation.base;

import X.C1FJ;
import X.C1FL;
import X.C64485PSn;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class RecordConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordConfigModel> CREATOR = new C64485PSn();

    @InterfaceC65349Pkn("beauty")
    public RecordBeautyConfigModel beauty;

    @InterfaceC65349Pkn("enable_no_internet_toast")
    public Boolean enableNoInternetToast;

    @InterfaceC65349Pkn("filter")
    public RecordFilterConfigModel filter;

    @InterfaceC65349Pkn("flash")
    public RecordFlashConfigModel flash;

    @InterfaceC65349Pkn("hide_complete_button")
    public Boolean hideCompleteButton;

    @InterfaceC65349Pkn("pinned_guide_text_key")
    public String pinnedGuideTextKey;

    @InterfaceC65349Pkn("show_components")
    public List<String> showComponents;

    @InterfaceC65349Pkn("single_segment_limited")
    public Boolean singleSegmentLimited;

    @InterfaceC65349Pkn("swap")
    public RecordSwapConfigModel swap;

    @InterfaceC65349Pkn("tabs")
    public List<RecordTabConfig> tabs;

    @InterfaceC65349Pkn("upload")
    public UploadConfigModel upload;

    @InterfaceC65349Pkn("video_min_seconds")
    public Integer videoMinSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public RecordConfigModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final RecordBeautyConfigModel getBeauty() {
        return this.beauty;
    }

    public final Boolean getEnableNoInternetToast() {
        return this.enableNoInternetToast;
    }

    public final RecordFilterConfigModel getFilter() {
        return this.filter;
    }

    public final RecordFlashConfigModel getFlash() {
        return this.flash;
    }

    public final Boolean getHideCompleteButton() {
        return this.hideCompleteButton;
    }

    public final String getPinnedGuideTextKey() {
        return this.pinnedGuideTextKey;
    }

    public final List<String> getShowComponents() {
        return this.showComponents;
    }

    public final Boolean getSingleSegmentLimited() {
        return this.singleSegmentLimited;
    }

    public final RecordSwapConfigModel getSwap() {
        return this.swap;
    }

    public final List<RecordTabConfig> getTabs() {
        return this.tabs;
    }

    public final UploadConfigModel getUpload() {
        return this.upload;
    }

    public final Integer getVideoMinSeconds() {
        return this.videoMinSeconds;
    }

    public final void setBeauty(RecordBeautyConfigModel recordBeautyConfigModel) {
        this.beauty = recordBeautyConfigModel;
    }

    public final void setEnableNoInternetToast(Boolean bool) {
        this.enableNoInternetToast = bool;
    }

    public final void setFilter(RecordFilterConfigModel recordFilterConfigModel) {
        this.filter = recordFilterConfigModel;
    }

    public final void setFlash(RecordFlashConfigModel recordFlashConfigModel) {
        this.flash = recordFlashConfigModel;
    }

    public final void setHideCompleteButton(Boolean bool) {
        this.hideCompleteButton = bool;
    }

    public final void setPinnedGuideTextKey(String str) {
        this.pinnedGuideTextKey = str;
    }

    public final void setShowComponents(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.showComponents = list;
    }

    public final void setSingleSegmentLimited(Boolean bool) {
        this.singleSegmentLimited = bool;
    }

    public final void setSwap(RecordSwapConfigModel recordSwapConfigModel) {
        this.swap = recordSwapConfigModel;
    }

    public final void setTabs(List<RecordTabConfig> list) {
        o.LJIIIZ(list, "<set-?>");
        this.tabs = list;
    }

    public final void setUpload(UploadConfigModel uploadConfigModel) {
        this.upload = uploadConfigModel;
    }

    public final void setVideoMinSeconds(Integer num) {
        this.videoMinSeconds = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        List<RecordTabConfig> list = this.tabs;
        parcel.writeInt(list.size());
        Iterator<RecordTabConfig> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        Boolean bool = this.singleSegmentLimited;
        if (bool != null) {
            C1FL.LJ(parcel, 1, bool);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.showComponents);
        Integer num = this.videoMinSeconds;
        if (num != null) {
            C1FJ.LJ(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.enableNoInternetToast;
        if (bool2 != null) {
            C1FL.LJ(parcel, 1, bool2);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.pinnedGuideTextKey);
        Boolean bool3 = this.hideCompleteButton;
        if (bool3 != null) {
            C1FL.LJ(parcel, 1, bool3);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.upload, i);
        parcel.writeParcelable(this.filter, i);
        parcel.writeParcelable(this.beauty, i);
        parcel.writeParcelable(this.swap, i);
        parcel.writeParcelable(this.flash, i);
    }

    public RecordConfigModel(List<RecordTabConfig> tabs, Boolean bool, List<String> showComponents, Integer num, Boolean bool2, String str, Boolean bool3, UploadConfigModel uploadConfigModel, RecordFilterConfigModel recordFilterConfigModel, RecordBeautyConfigModel recordBeautyConfigModel, RecordSwapConfigModel recordSwapConfigModel, RecordFlashConfigModel recordFlashConfigModel) {
        o.LJIIIZ(tabs, "tabs");
        o.LJIIIZ(showComponents, "showComponents");
        this.tabs = tabs;
        this.singleSegmentLimited = bool;
        this.showComponents = showComponents;
        this.videoMinSeconds = num;
        this.enableNoInternetToast = bool2;
        this.pinnedGuideTextKey = str;
        this.hideCompleteButton = bool3;
        this.upload = uploadConfigModel;
        this.filter = recordFilterConfigModel;
        this.beauty = recordBeautyConfigModel;
        this.swap = recordSwapConfigModel;
        this.flash = recordFlashConfigModel;
    }

    public /* synthetic */ RecordConfigModel(List list, Boolean bool, List list2, Integer num, Boolean bool2, String str, Boolean bool3, UploadConfigModel uploadConfigModel, RecordFilterConfigModel recordFilterConfigModel, RecordBeautyConfigModel recordBeautyConfigModel, RecordSwapConfigModel recordSwapConfigModel, RecordFlashConfigModel recordFlashConfigModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? new ArrayList() : list2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : uploadConfigModel, (i & 256) != 0 ? null : recordFilterConfigModel, (i & 512) != 0 ? null : recordBeautyConfigModel, (i & 1024) != 0 ? null : recordSwapConfigModel, (i & 2048) == 0 ? recordFlashConfigModel : null);
    }
}
