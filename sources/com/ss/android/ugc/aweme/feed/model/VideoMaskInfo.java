package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoMaskInfo implements Serializable {

    @InterfaceC65349Pkn("birthday_edit_module")
    public MaskExtraModule birthdayEditModule;

    @InterfaceC65349Pkn("cancel_mask_label")
    public String cancelMaskLabel;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("mask_type")
    public Integer maskType;

    @InterfaceC65349Pkn("policy_module")
    public MaskExtraModule policyModule;

    @InterfaceC65349Pkn("pop_window")
    public MaskExtraModule popWindow;

    @InterfaceC65349Pkn("show_mask")
    public Boolean showMask;

    @InterfaceC65349Pkn("status")
    public Integer status;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoMaskInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoMaskInfo copy$default(VideoMaskInfo videoMaskInfo, Boolean bool, Integer num, Integer num2, MaskExtraModule maskExtraModule, MaskExtraModule maskExtraModule2, String str, String str2, String str3, MaskExtraModule maskExtraModule3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = videoMaskInfo.showMask;
        }
        if ((i & 2) != 0) {
            num = videoMaskInfo.maskType;
        }
        if ((i & 4) != 0) {
            num2 = videoMaskInfo.status;
        }
        if ((i & 8) != 0) {
            maskExtraModule = videoMaskInfo.birthdayEditModule;
        }
        if ((i & 16) != 0) {
            maskExtraModule2 = videoMaskInfo.policyModule;
        }
        if ((i & 32) != 0) {
            str = videoMaskInfo.title;
        }
        if ((i & 64) != 0) {
            str2 = videoMaskInfo.content;
        }
        if ((i & 128) != 0) {
            str3 = videoMaskInfo.cancelMaskLabel;
        }
        if ((i & 256) != 0) {
            maskExtraModule3 = videoMaskInfo.popWindow;
        }
        return videoMaskInfo.copy(bool, num, num2, maskExtraModule, maskExtraModule2, str, str2, str3, maskExtraModule3);
    }

    public final VideoMaskInfo copy(Boolean bool, Integer num, Integer num2, MaskExtraModule maskExtraModule, MaskExtraModule maskExtraModule2, String str, String str2, String str3, MaskExtraModule maskExtraModule3) {
        return new VideoMaskInfo(bool, num, num2, maskExtraModule, maskExtraModule2, str, str2, str3, maskExtraModule3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMaskInfo)) {
            return false;
        }
        VideoMaskInfo videoMaskInfo = (VideoMaskInfo) obj;
        return o.LJ(this.showMask, videoMaskInfo.showMask) && o.LJ(this.maskType, videoMaskInfo.maskType) && o.LJ(this.status, videoMaskInfo.status) && o.LJ(this.birthdayEditModule, videoMaskInfo.birthdayEditModule) && o.LJ(this.policyModule, videoMaskInfo.policyModule) && o.LJ(this.title, videoMaskInfo.title) && o.LJ(this.content, videoMaskInfo.content) && o.LJ(this.cancelMaskLabel, videoMaskInfo.cancelMaskLabel) && o.LJ(this.popWindow, videoMaskInfo.popWindow);
    }

    public int hashCode() {
        Boolean bool = this.showMask;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.maskType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MaskExtraModule maskExtraModule = this.birthdayEditModule;
        int hashCode4 = (hashCode3 + (maskExtraModule == null ? 0 : maskExtraModule.hashCode())) * 31;
        MaskExtraModule maskExtraModule2 = this.policyModule;
        int hashCode5 = (hashCode4 + (maskExtraModule2 == null ? 0 : maskExtraModule2.hashCode())) * 31;
        String str = this.title;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cancelMaskLabel;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MaskExtraModule maskExtraModule3 = this.popWindow;
        return hashCode8 + (maskExtraModule3 != null ? maskExtraModule3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoMaskInfo(showMask=");
        LIZ.append(this.showMask);
        LIZ.append(", maskType=");
        LIZ.append(this.maskType);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", birthdayEditModule=");
        LIZ.append(this.birthdayEditModule);
        LIZ.append(", policyModule=");
        LIZ.append(this.policyModule);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", cancelMaskLabel=");
        LIZ.append(this.cancelMaskLabel);
        LIZ.append(", popWindow=");
        LIZ.append(this.popWindow);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final MaskExtraModule getBirthdayEditModule() {
        return this.birthdayEditModule;
    }

    public final String getCancelMaskLabel() {
        return this.cancelMaskLabel;
    }

    public final String getContent() {
        return this.content;
    }

    public final Integer getMaskType() {
        return this.maskType;
    }

    public final MaskExtraModule getPolicyModule() {
        return this.policyModule;
    }

    public final MaskExtraModule getPopWindow() {
        return this.popWindow;
    }

    public final Boolean getShowMask() {
        return this.showMask;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public VideoMaskInfo(Boolean bool, Integer num, Integer num2, MaskExtraModule maskExtraModule, MaskExtraModule maskExtraModule2, String str, String str2, String str3, MaskExtraModule maskExtraModule3) {
        this.showMask = bool;
        this.maskType = num;
        this.status = num2;
        this.birthdayEditModule = maskExtraModule;
        this.policyModule = maskExtraModule2;
        this.title = str;
        this.content = str2;
        this.cancelMaskLabel = str3;
        this.popWindow = maskExtraModule3;
    }

    public /* synthetic */ VideoMaskInfo(Boolean bool, Integer num, Integer num2, MaskExtraModule maskExtraModule, MaskExtraModule maskExtraModule2, String str, String str2, String str3, MaskExtraModule maskExtraModule3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : maskExtraModule, (i & 16) != 0 ? null : maskExtraModule2, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) == 0 ? str3 : "", (i & 256) == 0 ? maskExtraModule3 : null);
    }
}
