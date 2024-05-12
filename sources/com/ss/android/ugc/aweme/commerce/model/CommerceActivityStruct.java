package com.ss.android.ugc.aweme.commerce.model;

import X.C07670Rv;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceActivityStruct implements Serializable {

    @InterfaceC65349Pkn("act_type")
    public int actType;
    public String authorId;

    @InterfaceC65349Pkn("click_track_url_list")
    public UrlModel clickTrackUrlList;

    @InterfaceC65349Pkn("end_time")
    public long endTime;
    public String enterFrom;
    public String groupId;

    @InterfaceC65349Pkn("image")
    public UrlModel image;

    @InterfaceC65349Pkn("jump_open_url")
    public String jumpOpenUrl;

    @InterfaceC65349Pkn("jump_web_url")
    public String jumpWebUrl;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("time_range")
    public List<ActivityTimeRange> timeRange;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("track_url_list")
    public UrlModel trackUrlList;

    public CommerceActivityStruct() {
    }

    public static /* synthetic */ CommerceActivityStruct copy$default(CommerceActivityStruct commerceActivityStruct, int i, UrlModel urlModel, String str, String str2, String str3, long j, long j2, List list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6, int i2, Object obj) {
        int i3 = i;
        String str7 = str;
        UrlModel urlModel4 = urlModel;
        String str8 = str3;
        String str9 = str2;
        long j3 = j;
        long j4 = j2;
        List list2 = list;
        UrlModel urlModel5 = urlModel3;
        UrlModel urlModel6 = urlModel2;
        String str10 = str5;
        String str11 = str4;
        String str12 = str6;
        if ((i2 & 1) != 0) {
            i3 = commerceActivityStruct.actType;
        }
        if ((i2 & 2) != 0) {
            urlModel4 = commerceActivityStruct.image;
        }
        if ((i2 & 4) != 0) {
            str7 = commerceActivityStruct.jumpWebUrl;
        }
        if ((i2 & 8) != 0) {
            str9 = commerceActivityStruct.jumpOpenUrl;
        }
        if ((i2 & 16) != 0) {
            str8 = commerceActivityStruct.title;
        }
        if ((i2 & 32) != 0) {
            j3 = commerceActivityStruct.startTime;
        }
        if ((i2 & 64) != 0) {
            j4 = commerceActivityStruct.endTime;
        }
        if ((i2 & 128) != 0) {
            list2 = commerceActivityStruct.timeRange;
        }
        if ((i2 & 256) != 0) {
            urlModel6 = commerceActivityStruct.trackUrlList;
        }
        if ((i2 & 512) != 0) {
            urlModel5 = commerceActivityStruct.clickTrackUrlList;
        }
        if ((i2 & 1024) != 0) {
            str11 = commerceActivityStruct.groupId;
        }
        if ((i2 & 2048) != 0) {
            str10 = commerceActivityStruct.authorId;
        }
        if ((i2 & 4096) != 0) {
            str12 = commerceActivityStruct.enterFrom;
        }
        return commerceActivityStruct.copy(i3, urlModel4, str7, str9, str8, j3, j4, list2, urlModel6, urlModel5, str11, str10, str12);
    }

    public final CommerceActivityStruct copy(int i, UrlModel urlModel, String jumpWebUrl, String jumpOpenUrl, String title, long j, long j2, List<ActivityTimeRange> list, UrlModel urlModel2, UrlModel urlModel3, String str, String str2, String str3) {
        o.LJIIIZ(jumpWebUrl, "jumpWebUrl");
        o.LJIIIZ(jumpOpenUrl, "jumpOpenUrl");
        o.LJIIIZ(title, "title");
        return new CommerceActivityStruct(i, urlModel, jumpWebUrl, jumpOpenUrl, title, j, j2, list, urlModel2, urlModel3, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceActivityStruct)) {
            return false;
        }
        CommerceActivityStruct commerceActivityStruct = (CommerceActivityStruct) obj;
        return this.actType == commerceActivityStruct.actType && o.LJ(this.image, commerceActivityStruct.image) && o.LJ(this.jumpWebUrl, commerceActivityStruct.jumpWebUrl) && o.LJ(this.jumpOpenUrl, commerceActivityStruct.jumpOpenUrl) && o.LJ(this.title, commerceActivityStruct.title) && this.startTime == commerceActivityStruct.startTime && this.endTime == commerceActivityStruct.endTime && o.LJ(this.timeRange, commerceActivityStruct.timeRange) && o.LJ(this.trackUrlList, commerceActivityStruct.trackUrlList) && o.LJ(this.clickTrackUrlList, commerceActivityStruct.clickTrackUrlList) && o.LJ(this.groupId, commerceActivityStruct.groupId) && o.LJ(this.authorId, commerceActivityStruct.authorId) && o.LJ(this.enterFrom, commerceActivityStruct.enterFrom);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = this.actType * 31;
        UrlModel urlModel = this.image;
        int i2 = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.endTime, JBR.LIZJ(this.startTime, C79062V1e.LJ(this.title, C79062V1e.LJ(this.jumpOpenUrl, C79062V1e.LJ(this.jumpWebUrl, (i + hashCode) * 31, 31), 31), 31), 31), 31);
        List<ActivityTimeRange> list = this.timeRange;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (LIZJ + hashCode2) * 31;
        UrlModel urlModel2 = this.trackUrlList;
        if (urlModel2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = urlModel2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        UrlModel urlModel3 = this.clickTrackUrlList;
        if (urlModel3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = urlModel3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str = this.groupId;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str2 = this.authorId;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str3 = this.enterFrom;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return i7 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommerceActivityStruct(actType=");
        sb.append(this.actType);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", jumpWebUrl=");
        sb.append(this.jumpWebUrl);
        sb.append(", jumpOpenUrl=");
        sb.append(this.jumpOpenUrl);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", timeRange=");
        sb.append(this.timeRange);
        sb.append(", trackUrlList=");
        sb.append(this.trackUrlList);
        sb.append(", clickTrackUrlList=");
        sb.append(this.clickTrackUrlList);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", enterFrom=");
        return C07670Rv.LIZIZ(sb, this.enterFrom, ')');
    }

    public final int getActType() {
        return this.actType;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final String getJumpOpenUrl() {
        return this.jumpOpenUrl;
    }

    public final String getJumpWebUrl() {
        return this.jumpWebUrl;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final List<ActivityTimeRange> getTimeRange() {
        return this.timeRange;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public CommerceActivityStruct(int i, UrlModel urlModel, String str, String str2, String str3, long j, long j2, List<ActivityTimeRange> list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6) {
        HH1.LIZ(str, "jumpWebUrl", str2, "jumpOpenUrl", str3, "title");
        this.actType = i;
        this.image = urlModel;
        this.jumpWebUrl = str;
        this.jumpOpenUrl = str2;
        this.title = str3;
        this.startTime = j;
        this.endTime = j2;
        this.timeRange = list;
        this.trackUrlList = urlModel2;
        this.clickTrackUrlList = urlModel3;
        this.groupId = str4;
        this.authorId = str5;
        this.enterFrom = str6;
    }

    public /* synthetic */ CommerceActivityStruct(int i, UrlModel urlModel, String str, String str2, String str3, long j, long j2, List list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, urlModel, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) == 0 ? str3 : "", j, j2, list, urlModel2, urlModel3, str4, str5, str6);
    }
}
