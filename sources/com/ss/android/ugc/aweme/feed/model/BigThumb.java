package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BigThumb extends F9E implements Serializable {

    @InterfaceC65349Pkn("duration")
    public double duration;
    public String fext;

    @InterfaceC65349Pkn("img_num")
    public long imgNum;

    @InterfaceC65349Pkn("img_uris")
    public List<String> imgUris;

    @InterfaceC65349Pkn("img_url")
    public String imgUrl;

    @InterfaceC65349Pkn("img_urls")
    public List<String> imgUrls;

    @InterfaceC65349Pkn("img_x_len")
    public long imgXLen;

    @InterfaceC65349Pkn("img_x_size")
    public long imgXSize;

    @InterfaceC65349Pkn("img_y_len")
    public long imgYLen;

    @InterfaceC65349Pkn("img_y_size")
    public long imgYSize;
    public double interval;
    public String uri;

    public BigThumb() {
    }

    public static /* synthetic */ BigThumb copy$default(BigThumb bigThumb, long j, String str, String str2, long j2, long j3, long j4, long j5, double d, double d2, String str3, List list, List list2, int i, Object obj) {
        long j6 = j;
        long j7 = j3;
        long j8 = j2;
        String str4 = str;
        String str5 = str2;
        double d3 = d;
        long j9 = j4;
        long j10 = j5;
        List list3 = list;
        List list4 = list2;
        double d4 = d2;
        String str6 = str3;
        if ((i & 1) != 0) {
            j6 = bigThumb.imgNum;
        }
        if ((i & 2) != 0) {
            str4 = bigThumb.uri;
        }
        if ((i & 4) != 0) {
            str5 = bigThumb.imgUrl;
        }
        if ((i & 8) != 0) {
            j8 = bigThumb.imgXSize;
        }
        if ((i & 16) != 0) {
            j7 = bigThumb.imgYSize;
        }
        if ((i & 32) != 0) {
            j9 = bigThumb.imgXLen;
        }
        if ((i & 64) != 0) {
            j10 = bigThumb.imgYLen;
        }
        if ((i & 128) != 0) {
            d3 = bigThumb.duration;
        }
        if ((i & 256) != 0) {
            d4 = bigThumb.interval;
        }
        if ((i & 512) != 0) {
            str6 = bigThumb.fext;
        }
        if ((i & 1024) != 0) {
            list3 = bigThumb.imgUris;
        }
        if ((i & 2048) != 0) {
            list4 = bigThumb.imgUrls;
        }
        return bigThumb.copy(j6, str4, str5, j8, j7, j9, j10, d3, d4, str6, list3, list4);
    }

    public final BigThumb copy(long j, String uri, String imgUrl, long j2, long j3, long j4, long j5, double d, double d2, String fext, List<String> imgUris, List<String> imgUrls) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(imgUrl, "imgUrl");
        o.LJIIIZ(fext, "fext");
        o.LJIIIZ(imgUris, "imgUris");
        o.LJIIIZ(imgUrls, "imgUrls");
        return new BigThumb(j, uri, imgUrl, j2, j3, j4, j5, d, d2, fext, imgUris, imgUrls);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.imgNum), this.uri, this.imgUrl, Long.valueOf(this.imgXSize), Long.valueOf(this.imgYSize), Long.valueOf(this.imgXLen), Long.valueOf(this.imgYLen), Double.valueOf(this.duration), Double.valueOf(this.interval), this.fext, this.imgUris, this.imgUrls};
    }

    public final double getDuration() {
        return this.duration;
    }

    public final String getFext() {
        return this.fext;
    }

    public final long getImgNum() {
        return this.imgNum;
    }

    public final List<String> getImgUris() {
        return this.imgUris;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final List<String> getImgUrls() {
        return this.imgUrls;
    }

    public final long getImgXLen() {
        return this.imgXLen;
    }

    public final long getImgXSize() {
        return this.imgXSize;
    }

    public final long getImgYLen() {
        return this.imgYLen;
    }

    public final long getImgYSize() {
        return this.imgYSize;
    }

    public final double getInterval() {
        return this.interval;
    }

    public final String getUri() {
        return this.uri;
    }

    public BigThumb(long j, String uri, String imgUrl, long j2, long j3, long j4, long j5, double d, double d2, String fext, List<String> imgUris, List<String> imgUrls) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(imgUrl, "imgUrl");
        o.LJIIIZ(fext, "fext");
        o.LJIIIZ(imgUris, "imgUris");
        o.LJIIIZ(imgUrls, "imgUrls");
        this.imgNum = j;
        this.uri = uri;
        this.imgUrl = imgUrl;
        this.imgXSize = j2;
        this.imgYSize = j3;
        this.imgXLen = j4;
        this.imgYLen = j5;
        this.duration = d;
        this.interval = d2;
        this.fext = fext;
        this.imgUris = imgUris;
        this.imgUrls = imgUrls;
    }
}
