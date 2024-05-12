package com.ss.ugc.aweme.creation.base;

import X.C1FJ;
import X.C1FL;
import X.C64484PSm;
import X.EnumC61992bz;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class UploadConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<UploadConfigModel> CREATOR = new C64484PSm();

    @InterfaceC65349Pkn("enable_bottom_switch_mode_button")
    public Boolean enableBottomSwitchModeButton;

    @InterfaceC65349Pkn("enable_bottom_view")
    public boolean enableBottomView;

    @InterfaceC65349Pkn("enable_multi_select")
    public boolean enableMultiSelect;

    @InterfaceC65349Pkn("enable_preview")
    public boolean enablePreview;

    @InterfaceC65349Pkn("max_photo_count")
    public Integer maxPhotoCount;

    @InterfaceC65349Pkn("max_total_selection_count")
    public Integer maxTotalSelectionCount;

    @InterfaceC65349Pkn("max_video_count")
    public Integer maxVideoCount;

    @InterfaceC65349Pkn("max_video_seconds")
    public Integer maxVideoSeconds;

    @InterfaceC65349Pkn("min_video_seconds")
    public Integer minVideoSeconds;

    @InterfaceC65349Pkn("tabs")
    public String tabs;

    @InterfaceC65349Pkn("vc_type")
    public Integer vcType;

    @InterfaceC65349Pkn("video_adjust_time_range_bar_style_in_preview")
    public EnumC61992bz videoAdjustTimeRangeBarStyleInPreview;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UploadConfigModel() {
        /*
            r15 = this;
            r1 = 0
            r8 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r9 = r8
            r10 = r1
            r11 = r8
            r12 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.aweme.creation.base.UploadConfigModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Boolean getEnableBottomSwitchModeButton() {
        return this.enableBottomSwitchModeButton;
    }

    public final boolean getEnableBottomView() {
        return this.enableBottomView;
    }

    public final boolean getEnableMultiSelect() {
        return this.enableMultiSelect;
    }

    public final boolean getEnablePreview() {
        return this.enablePreview;
    }

    public final Integer getMaxPhotoCount() {
        return this.maxPhotoCount;
    }

    public final Integer getMaxTotalSelectionCount() {
        return this.maxTotalSelectionCount;
    }

    public final Integer getMaxVideoCount() {
        return this.maxVideoCount;
    }

    public final Integer getMaxVideoSeconds() {
        return this.maxVideoSeconds;
    }

    public final Integer getMinVideoSeconds() {
        return this.minVideoSeconds;
    }

    public final String getTabs() {
        return this.tabs;
    }

    public final Integer getVcType() {
        return this.vcType;
    }

    public final EnumC61992bz getVideoAdjustTimeRangeBarStyleInPreview() {
        return this.videoAdjustTimeRangeBarStyleInPreview;
    }

    public final void setEnableBottomSwitchModeButton(Boolean bool) {
        this.enableBottomSwitchModeButton = bool;
    }

    public final void setEnableBottomView(boolean z) {
        this.enableBottomView = z;
    }

    public final void setEnableMultiSelect(boolean z) {
        this.enableMultiSelect = z;
    }

    public final void setEnablePreview(boolean z) {
        this.enablePreview = z;
    }

    public final void setMaxPhotoCount(Integer num) {
        this.maxPhotoCount = num;
    }

    public final void setMaxTotalSelectionCount(Integer num) {
        this.maxTotalSelectionCount = num;
    }

    public final void setMaxVideoCount(Integer num) {
        this.maxVideoCount = num;
    }

    public final void setMaxVideoSeconds(Integer num) {
        this.maxVideoSeconds = num;
    }

    public final void setMinVideoSeconds(Integer num) {
        this.minVideoSeconds = num;
    }

    public final void setTabs(String str) {
        this.tabs = str;
    }

    public final void setVcType(Integer num) {
        this.vcType = num;
    }

    public final void setVideoAdjustTimeRangeBarStyleInPreview(EnumC61992bz enumC61992bz) {
        this.videoAdjustTimeRangeBarStyleInPreview = enumC61992bz;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        Integer num = this.vcType;
        if (num != null) {
            C1FJ.LJ(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.tabs);
        Integer num2 = this.minVideoSeconds;
        if (num2 != null) {
            C1FJ.LJ(parcel, 1, num2);
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.maxVideoSeconds;
        if (num3 != null) {
            C1FJ.LJ(parcel, 1, num3);
        } else {
            parcel.writeInt(0);
        }
        Integer num4 = this.maxVideoCount;
        if (num4 != null) {
            C1FJ.LJ(parcel, 1, num4);
        } else {
            parcel.writeInt(0);
        }
        Integer num5 = this.maxPhotoCount;
        if (num5 != null) {
            C1FJ.LJ(parcel, 1, num5);
        } else {
            parcel.writeInt(0);
        }
        Integer num6 = this.maxTotalSelectionCount;
        if (num6 != null) {
            C1FJ.LJ(parcel, 1, num6);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.enableMultiSelect ? 1 : 0);
        parcel.writeInt(this.enablePreview ? 1 : 0);
        Boolean bool = this.enableBottomSwitchModeButton;
        if (bool != null) {
            C1FL.LJ(parcel, 1, bool);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.enableBottomView ? 1 : 0);
        EnumC61992bz enumC61992bz = this.videoAdjustTimeRangeBarStyleInPreview;
        if (enumC61992bz != null) {
            parcel.writeInt(1);
            parcel.writeString(enumC61992bz.name());
        } else {
            parcel.writeInt(0);
        }
    }

    public UploadConfigModel(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, boolean z, boolean z2, Boolean bool, boolean z3, EnumC61992bz enumC61992bz) {
        this.vcType = num;
        this.tabs = str;
        this.minVideoSeconds = num2;
        this.maxVideoSeconds = num3;
        this.maxVideoCount = num4;
        this.maxPhotoCount = num5;
        this.maxTotalSelectionCount = num6;
        this.enableMultiSelect = z;
        this.enablePreview = z2;
        this.enableBottomSwitchModeButton = bool;
        this.enableBottomView = z3;
        this.videoAdjustTimeRangeBarStyleInPreview = enumC61992bz;
    }

    public /* synthetic */ UploadConfigModel(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, boolean z, boolean z2, Boolean bool, boolean z3, EnumC61992bz enumC61992bz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : bool, (i & 1024) == 0 ? z3 : false, (i & 2048) == 0 ? enumC61992bz : null);
    }
}
