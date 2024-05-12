package com.ss.android.ugc.aweme.discover.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TrendingTopicsAdInfo implements Serializable {

    @InterfaceC65349Pkn("ad_id")
    public final long adId;

    @InterfaceC65349Pkn("ad_label")
    public final AdLabel adLabel;

    @InterfaceC65349Pkn("ad_position")
    public final int adPosition;

    @InterfaceC65349Pkn("click_track_url_list")
    public final UrlModel clickTrackUrlList;

    @InterfaceC65349Pkn("creative_id")
    public final long creativeId;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("image_list")
    public final List<UrlModel> imageList;

    @InterfaceC65349Pkn("is_preview")
    public final boolean isPreview;

    @InterfaceC65349Pkn("label")
    public final AwemeTextLabelModel label;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("mp_url")
    public final String mpUrl;

    @InterfaceC65349Pkn("open_url")
    public final String openUrl;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("track_url_list")
    public final UrlModel trackUrlList;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("web_title")
    public final String webTitle;

    @InterfaceC65349Pkn("web_url")
    public final String webUrl;

    public TrendingTopicsAdInfo() {
        this(0, 0L, 0L, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 262143, null);
    }

    public static /* synthetic */ TrendingTopicsAdInfo copy$default(TrendingTopicsAdInfo trendingTopicsAdInfo, int i, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel, int i2, Object obj) {
        String str10 = str2;
        String str11 = str;
        long j3 = j2;
        int i3 = i;
        long j4 = j;
        List list2 = list;
        String str12 = str4;
        String str13 = str3;
        String str14 = str5;
        String str15 = str6;
        UrlModel urlModel3 = urlModel;
        UrlModel urlModel4 = urlModel2;
        AdLabel adLabel2 = adLabel;
        String str16 = str7;
        String str17 = str9;
        AwemeTextLabelModel awemeTextLabelModel2 = awemeTextLabelModel;
        boolean z2 = z;
        String str18 = str8;
        if ((i2 & 1) != 0) {
            i3 = trendingTopicsAdInfo.adPosition;
        }
        if ((i2 & 2) != 0) {
            j4 = trendingTopicsAdInfo.adId;
        }
        if ((i2 & 4) != 0) {
            j3 = trendingTopicsAdInfo.creativeId;
        }
        if ((i2 & 8) != 0) {
            str11 = trendingTopicsAdInfo.type;
        }
        if ((i2 & 16) != 0) {
            str10 = trendingTopicsAdInfo.source;
        }
        if ((i2 & 32) != 0) {
            str13 = trendingTopicsAdInfo.logExtra;
        }
        if ((i2 & 64) != 0) {
            str12 = trendingTopicsAdInfo.webUrl;
        }
        if ((i2 & 128) != 0) {
            str14 = trendingTopicsAdInfo.title;
        }
        if ((i2 & 256) != 0) {
            str15 = trendingTopicsAdInfo.webTitle;
        }
        if ((i2 & 512) != 0) {
            urlModel3 = trendingTopicsAdInfo.clickTrackUrlList;
        }
        if ((i2 & 1024) != 0) {
            urlModel4 = trendingTopicsAdInfo.trackUrlList;
        }
        if ((i2 & 2048) != 0) {
            list2 = trendingTopicsAdInfo.imageList;
        }
        if ((i2 & 4096) != 0) {
            z2 = trendingTopicsAdInfo.isPreview;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            str16 = trendingTopicsAdInfo.openUrl;
        }
        if ((i2 & 16384) != 0) {
            str18 = trendingTopicsAdInfo.mpUrl;
        }
        if ((32768 & i2) != 0) {
            str17 = trendingTopicsAdInfo.description;
        }
        if ((65536 & i2) != 0) {
            awemeTextLabelModel2 = trendingTopicsAdInfo.label;
        }
        if ((i2 & 131072) != 0) {
            adLabel2 = trendingTopicsAdInfo.adLabel;
        }
        String str19 = str13;
        String str20 = str14;
        String str21 = str15;
        return trendingTopicsAdInfo.copy(i3, j4, j3, str11, str10, str19, str12, str20, str21, urlModel3, urlModel4, list2, z2, str16, str18, str17, awemeTextLabelModel2, adLabel2);
    }

    public final TrendingTopicsAdInfo copy(int i, long j, long j2, String type, String source, String logExtra, String webUrl, String title, String webTitle, UrlModel urlModel, UrlModel urlModel2, List<? extends UrlModel> imageList, boolean z, String openUrl, String mpUrl, String description, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(logExtra, "logExtra");
        o.LJIIIZ(webUrl, "webUrl");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(webTitle, "webTitle");
        o.LJIIIZ(imageList, "imageList");
        o.LJIIIZ(openUrl, "openUrl");
        o.LJIIIZ(mpUrl, "mpUrl");
        o.LJIIIZ(description, "description");
        return new TrendingTopicsAdInfo(i, j, j2, type, source, logExtra, webUrl, title, webTitle, urlModel, urlModel2, imageList, z, openUrl, mpUrl, description, awemeTextLabelModel, adLabel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingTopicsAdInfo)) {
            return false;
        }
        TrendingTopicsAdInfo trendingTopicsAdInfo = (TrendingTopicsAdInfo) obj;
        return this.adPosition == trendingTopicsAdInfo.adPosition && this.adId == trendingTopicsAdInfo.adId && this.creativeId == trendingTopicsAdInfo.creativeId && o.LJ(this.type, trendingTopicsAdInfo.type) && o.LJ(this.source, trendingTopicsAdInfo.source) && o.LJ(this.logExtra, trendingTopicsAdInfo.logExtra) && o.LJ(this.webUrl, trendingTopicsAdInfo.webUrl) && o.LJ(this.title, trendingTopicsAdInfo.title) && o.LJ(this.webTitle, trendingTopicsAdInfo.webTitle) && o.LJ(this.clickTrackUrlList, trendingTopicsAdInfo.clickTrackUrlList) && o.LJ(this.trackUrlList, trendingTopicsAdInfo.trackUrlList) && o.LJ(this.imageList, trendingTopicsAdInfo.imageList) && this.isPreview == trendingTopicsAdInfo.isPreview && o.LJ(this.openUrl, trendingTopicsAdInfo.openUrl) && o.LJ(this.mpUrl, trendingTopicsAdInfo.mpUrl) && o.LJ(this.description, trendingTopicsAdInfo.description) && o.LJ(this.label, trendingTopicsAdInfo.label) && o.LJ(this.adLabel, trendingTopicsAdInfo.adLabel);
    }

    public String toString() {
        return "TrendingTopicsAdInfo(adPosition=" + this.adPosition + ", adId=" + this.adId + ", creativeId=" + this.creativeId + ", type=" + this.type + ", source=" + this.source + ", logExtra=" + this.logExtra + ", webUrl=" + this.webUrl + ", title=" + this.title + ", webTitle=" + this.webTitle + ", clickTrackUrlList=" + this.clickTrackUrlList + ", trackUrlList=" + this.trackUrlList + ", imageList=" + this.imageList + ", isPreview=" + this.isPreview + ", openUrl=" + this.openUrl + ", mpUrl=" + this.mpUrl + ", description=" + this.description + ", label=" + this.label + ", adLabel=" + this.adLabel + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.webTitle, C79062V1e.LJ(this.title, C79062V1e.LJ(this.webUrl, C79062V1e.LJ(this.logExtra, C79062V1e.LJ(this.source, C79062V1e.LJ(this.type, JBR.LIZJ(this.creativeId, JBR.LIZJ(this.adId, this.adPosition * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        UrlModel urlModel = this.clickTrackUrlList;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        UrlModel urlModel2 = this.trackUrlList;
        if (urlModel2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = urlModel2.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.imageList, (i2 + hashCode2) * 31, 31);
        boolean z = this.isPreview;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.description, C79062V1e.LJ(this.mpUrl, C79062V1e.LJ(this.openUrl, (LIZIZ + i3) * 31, 31), 31), 31);
        AwemeTextLabelModel awemeTextLabelModel = this.label;
        if (awemeTextLabelModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = awemeTextLabelModel.hashCode();
        }
        int i4 = (LJ2 + hashCode3) * 31;
        AdLabel adLabel = this.adLabel;
        if (adLabel != null) {
            i = adLabel.hashCode();
        }
        return i4 + i;
    }

    public final long getAdId() {
        return this.adId;
    }

    public final AdLabel getAdLabel() {
        return this.adLabel;
    }

    public final int getAdPosition() {
        return this.adPosition;
    }

    public final UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public final long getCreativeId() {
        return this.creativeId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<UrlModel> getImageList() {
        return this.imageList;
    }

    public final AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMpUrl() {
        return this.mpUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWebTitle() {
        return this.webTitle;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTopicsAdInfo(int i, long j, long j2, String type, String source, String logExtra, String webUrl, String title, String webTitle, UrlModel urlModel, UrlModel urlModel2, List<? extends UrlModel> imageList, boolean z, String openUrl, String mpUrl, String description, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(logExtra, "logExtra");
        o.LJIIIZ(webUrl, "webUrl");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(webTitle, "webTitle");
        o.LJIIIZ(imageList, "imageList");
        o.LJIIIZ(openUrl, "openUrl");
        o.LJIIIZ(mpUrl, "mpUrl");
        o.LJIIIZ(description, "description");
        this.adPosition = i;
        this.adId = j;
        this.creativeId = j2;
        this.type = type;
        this.source = source;
        this.logExtra = logExtra;
        this.webUrl = webUrl;
        this.title = title;
        this.webTitle = webTitle;
        this.clickTrackUrlList = urlModel;
        this.trackUrlList = urlModel2;
        this.imageList = imageList;
        this.isPreview = z;
        this.openUrl = openUrl;
        this.mpUrl = mpUrl;
        this.description = description;
        this.label = awemeTextLabelModel;
        this.adLabel = adLabel;
    }

    public TrendingTopicsAdInfo(int i, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? null : urlModel, (i2 & 1024) != 0 ? null : urlModel2, (i2 & 2048) != 0 ? C61878OQg.INSTANCE : list, (i2 & 4096) != 0 ? false : z, (i2 & FileUtils.BUFFER_SIZE) != 0 ? "" : str7, (i2 & 16384) != 0 ? "" : str8, (32768 & i2) == 0 ? str9 : "", (65536 & i2) != 0 ? null : awemeTextLabelModel, (i2 & 131072) != 0 ? null : adLabel);
    }
}
