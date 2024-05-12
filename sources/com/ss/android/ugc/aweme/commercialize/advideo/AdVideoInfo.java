package com.ss.android.ugc.aweme.commercialize.advideo;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AdVideoInfo implements Serializable {

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("duration")
    public final Long duration;

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("play_url")
    public final String playUrl;

    @InterfaceC65349Pkn("poster_url")
    public final String poster_url;

    @InterfaceC65349Pkn("width")
    public final Integer width;

    public static /* synthetic */ AdVideoInfo copy$default(AdVideoInfo adVideoInfo, String str, String str2, Long l, String str3, Integer num, Integer num2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adVideoInfo.desc;
        }
        if ((i & 2) != 0) {
            str2 = adVideoInfo.playUrl;
        }
        if ((i & 4) != 0) {
            l = adVideoInfo.duration;
        }
        if ((i & 8) != 0) {
            str3 = adVideoInfo.poster_url;
        }
        if ((i & 16) != 0) {
            num = adVideoInfo.height;
        }
        if ((i & 32) != 0) {
            num2 = adVideoInfo.width;
        }
        if ((i & 64) != 0) {
            j = adVideoInfo.createTime;
        }
        return adVideoInfo.copy(str, str2, l, str3, num, num2, j);
    }

    public final AdVideoInfo copy(String str, String str2, Long l, String str3, Integer num, Integer num2, long j) {
        return new AdVideoInfo(str, str2, l, str3, num, num2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdVideoInfo)) {
            return false;
        }
        AdVideoInfo adVideoInfo = (AdVideoInfo) obj;
        return o.LJ(this.desc, adVideoInfo.desc) && o.LJ(this.playUrl, adVideoInfo.playUrl) && o.LJ(this.duration, adVideoInfo.duration) && o.LJ(this.poster_url, adVideoInfo.poster_url) && o.LJ(this.height, adVideoInfo.height) && o.LJ(this.width, adVideoInfo.width) && this.createTime == adVideoInfo.createTime;
    }

    public int hashCode() {
        String str = this.desc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.playUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.duration;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.poster_url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.height;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        return C16880lQ.LLJIJIL(this.createTime) + ((hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdVideoInfo(desc=");
        LIZ.append(this.desc);
        LIZ.append(", playUrl=");
        LIZ.append(this.playUrl);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", poster_url=");
        LIZ.append(this.poster_url);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", createTime=");
        return C47135Ieh.LIZIZ(LIZ, this.createTime, ')', LIZ);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getPlayUrl() {
        return this.playUrl;
    }

    public final String getPoster_url() {
        return this.poster_url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public AdVideoInfo(String str, String str2, Long l, String str3, Integer num, Integer num2, long j) {
        this.desc = str;
        this.playUrl = str2;
        this.duration = l;
        this.poster_url = str3;
        this.height = num;
        this.width = num2;
        this.createTime = j;
    }
}
