package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C1NE;
import X.C279017q;
import X.C51631KOd;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Video implements Parcelable {
    public static final Parcelable.Creator<Video> CREATOR = new C51631KOd();

    @InterfaceC65349Pkn("duration")
    public final Double duration;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("media_type")
    public final String mediaType;

    @InterfaceC65349Pkn("post_url")
    public final String postUrl;

    @InterfaceC65349Pkn("video_infos")
    public final List<VideoInfo> urls;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return o.LJ(this.id, video.id) && o.LJ(this.duration, video.duration) && o.LJ(this.postUrl, video.postUrl) && o.LJ(this.mediaType, video.mediaType) && o.LJ(this.urls, video.urls);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.duration;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.postUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediaType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<VideoInfo> list = this.urls;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final Aweme LIZIZ() {
        String str;
        int i;
        int i2;
        VideoInfo videoInfo;
        Integer num;
        VideoInfo videoInfo2;
        Integer num2;
        VideoInfo videoInfo3;
        Aweme aweme = new Aweme();
        com.ss.android.ugc.aweme.feed.model.Video video = new com.ss.android.ugc.aweme.feed.model.Video();
        LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
        localVideoUrlModel.setSourceId(this.id);
        List<VideoInfo> list = this.urls;
        int i3 = 0;
        if (list != null && (videoInfo3 = (VideoInfo) ORZ.LJLLLLLL(0, list)) != null) {
            str = videoInfo3.mainUrl;
        } else {
            str = null;
        }
        localVideoUrlModel.setUri(str);
        localVideoUrlModel.setUrlList(new ArrayList());
        localVideoUrlModel.getUrlList().add(localVideoUrlModel.getUri());
        localVideoUrlModel.setUrlKey(this.id);
        video.setPlayAddr(localVideoUrlModel);
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(this.postUrl);
        urlModel.setUrlList(new ArrayList());
        urlModel.getUrlList().add(urlModel.getUri());
        video.setCover(urlModel);
        List<VideoInfo> list2 = this.urls;
        if (list2 != null && (videoInfo2 = (VideoInfo) ORZ.LJLLLLLL(0, list2)) != null && (num2 = videoInfo2.width) != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        video.setWidth(i);
        List<VideoInfo> list3 = this.urls;
        if (list3 != null && (videoInfo = (VideoInfo) ORZ.LJLLLLLL(0, list3)) != null && (num = videoInfo.height) != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        video.setHeight(i2);
        Double d = this.duration;
        if (d != null) {
            i3 = (int) d.doubleValue();
        }
        video.setVideoLength(i3);
        video.setPlayAddrBytevc1(video.getPlayAddr());
        aweme.setVideo(video);
        aweme.setAid(this.id);
        return aweme;
    }

    public final int LIZLLL() {
        VideoInfo videoInfo;
        Integer num;
        List<VideoInfo> list = this.urls;
        if (list == null || (videoInfo = (VideoInfo) ORZ.LJLLLLLL(0, list)) == null || (num = videoInfo.bitrate) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Video(id=");
        LIZ.append(this.id);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", postUrl=");
        LIZ.append(this.postUrl);
        LIZ.append(", mediaType=");
        LIZ.append(this.mediaType);
        LIZ.append(", urls=");
        return C1NE.LIZIZ(LIZ, this.urls, ')', LIZ);
    }

    public static Video LIZ(Video video, String str) {
        return new Video(video.id, video.duration, str, video.mediaType, video.urls);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        Double d = this.duration;
        if (d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d.doubleValue());
        }
        out.writeString(this.postUrl);
        out.writeString(this.mediaType);
        List<VideoInfo> list = this.urls;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((VideoInfo) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public Video(String str, Double d, String str2, String str3, List<VideoInfo> list) {
        this.id = str;
        this.duration = d;
        this.postUrl = str2;
        this.mediaType = str3;
        this.urls = list;
    }
}
