package com.ss.android.ugc.aweme.commercialize.adsetting;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AdSettingsData {

    @InterfaceC65349Pkn("code_status")
    public final Integer codeStatus;

    @InterfaceC65349Pkn("dark_post_source")
    public final Integer darkPostSource;

    @InterfaceC65349Pkn("dark_post_status")
    public final Integer darkPostStatus;

    @InterfaceC65349Pkn("end_time")
    public final Long endTime;

    @InterfaceC65349Pkn("promotable")
    public final Boolean promotable;

    @InterfaceC65349Pkn("start_time")
    public final Long startTime;

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    @InterfaceC65349Pkn("video_code")
    public final String videoCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSettingsData)) {
            return false;
        }
        AdSettingsData adSettingsData = (AdSettingsData) obj;
        return o.LJ(this.statusCode, adSettingsData.statusCode) && o.LJ(this.statusMsg, adSettingsData.statusMsg) && o.LJ(this.promotable, adSettingsData.promotable) && o.LJ(this.darkPostStatus, adSettingsData.darkPostStatus) && o.LJ(this.darkPostSource, adSettingsData.darkPostSource) && o.LJ(this.videoCode, adSettingsData.videoCode) && o.LJ(this.codeStatus, adSettingsData.codeStatus) && o.LJ(this.startTime, adSettingsData.startTime) && o.LJ(this.endTime, adSettingsData.endTime);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.promotable;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.darkPostStatus;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.darkPostSource;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.videoCode;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.codeStatus;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l = this.startTime;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        return hashCode8 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdSettingsData(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", promotable=");
        LIZ.append(this.promotable);
        LIZ.append(", darkPostStatus=");
        LIZ.append(this.darkPostStatus);
        LIZ.append(", darkPostSource=");
        LIZ.append(this.darkPostSource);
        LIZ.append(", videoCode=");
        LIZ.append(this.videoCode);
        LIZ.append(", codeStatus=");
        LIZ.append(this.codeStatus);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        return JBR.LJ(LIZ, this.endTime, ')', LIZ);
    }

    public AdSettingsData(Integer num, String str, Boolean bool, Integer num2, Integer num3, String str2, Integer num4, Long l, Long l2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.promotable = bool;
        this.darkPostStatus = num2;
        this.darkPostSource = num3;
        this.videoCode = str2;
        this.codeStatus = num4;
        this.startTime = l;
        this.endTime = l2;
    }
}
