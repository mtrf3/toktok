package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.V0N;
import X.X1D;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes11.dex */
public class Banner implements InterfaceC65316PkG, Serializable {
    public static final long serialVersionUID = 1;

    @InterfaceC65349Pkn("ad_data")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public BannerAdData adData;

    @InterfaceC65349Pkn("banner_url")
    public UrlModel bannerUrl;

    @InterfaceC65349Pkn("bid")
    public String bid;

    @InterfaceC65349Pkn("height")
    public int height;
    public String requestId;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("width")
    public int width;

    public String getCategoryId() {
        if (this.schema == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(?<=");
        LIZ.append(BannerSchemaType.PLAYLIST.schemaPattern);
        LIZ.append(")[0-9]+");
        Matcher matcher = PatternProtector.compile(X1D.LIZIZ(LIZ)).matcher(this.schema);
        try {
            if (!matcher.find()) {
                return null;
            }
            return matcher.group();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public List<String> getClickTrackUrlList() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.clickTrackUrlList;
    }

    public long getCreativeId() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return 0L;
        }
        return bannerAdData.creativeId;
    }

    public String getLogExtra() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.logExtra;
    }

    public String getMusicId() {
        if (this.schema == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(?<=");
        LIZ.append(BannerSchemaType.MUSIC.schemaPattern);
        LIZ.append(")[0-9]+");
        Matcher matcher = PatternProtector.compile(X1D.LIZIZ(LIZ)).matcher(this.schema);
        try {
            if (!matcher.find()) {
                return null;
            }
            return matcher.group();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public String getPackageName() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.packageName;
    }

    public BannerSchemaType getSchemaType() {
        if (this.schema == null) {
            return BannerSchemaType.UNKNOWN;
        }
        for (BannerSchemaType bannerSchemaType : BannerSchemaType.values()) {
            if (PatternProtector.compile(bannerSchemaType.schemaPattern).matcher(this.schema).find()) {
                return bannerSchemaType;
            }
        }
        return BannerSchemaType.UNKNOWN;
    }

    public List<String> getTrackUrlList() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.trackUrlList;
    }

    public String getType() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.type;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.bid;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.title;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        UrlModel urlModel = this.bannerUrl;
        if (urlModel != null) {
            i3 = urlModel.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((((i6 + i3) * 31) + this.height) * 31) + this.width) * 31;
        String str3 = this.schema;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i7 + i4;
    }

    public boolean isAd() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData != null && bannerAdData.isAd) {
            return true;
        }
        return false;
    }

    /* loaded from: classes11.dex */
    public static class BannerAdData implements Serializable {

        @InterfaceC65349Pkn("ad_label")
        public AdLabel adLabel;

        @InterfaceC65349Pkn("click_track_url_list")
        public List<String> clickTrackUrlList;

        @InterfaceC65349Pkn("creative_id")
        public long creativeId;

        @InterfaceC65349Pkn("is_ad")
        public boolean isAd = true;

        @InterfaceC65349Pkn("log_extra")
        public String logExtra;

        @InterfaceC65349Pkn("package_name")
        public String packageName;

        @InterfaceC65349Pkn("track_url_list")
        public List<String> trackUrlList;

        @InterfaceC65349Pkn("type")
        public String type;

        public AdLabel getAdLabel() {
            return this.adLabel;
        }
    }

    public BannerAdData getAdData() {
        return this.adData;
    }

    public UrlModel getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBid() {
        return this.bid;
    }

    public int getHeight() {
        return this.height;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public int getWidth() {
        return this.width;
    }

    /* loaded from: classes11.dex */
    public enum BannerSchemaType {
        MUSIC("music/detail/", "single_song"),
        AI_RECOMMEND_PLAYLIST("assmusic/category/.*ai_recommend=1", "recommend_native_page"),
        PLAYLIST("assmusic/category/", "playlist"),
        WEB("https?://", "H5_page"),
        UNKNOWN(".*", "other");

        public final String mobValue;
        public final String schemaPattern;

        public static BannerSchemaType valueOf(String str) {
            return (BannerSchemaType) V0N.LJJJ(BannerSchemaType.class, str);
        }

        BannerSchemaType(String str, String str2) {
            this.schemaPattern = str;
            this.mobValue = str2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Banner banner = (Banner) obj;
        if (this.height != banner.height || this.width != banner.width) {
            return false;
        }
        String str = this.bid;
        if (str == null ? banner.bid != null : !str.equals(banner.bid)) {
            return false;
        }
        String str2 = this.title;
        if (str2 == null ? banner.title != null : !str2.equals(banner.title)) {
            return false;
        }
        UrlModel urlModel = this.bannerUrl;
        if (urlModel == null ? banner.bannerUrl != null : !urlModel.equals(banner.bannerUrl)) {
            return false;
        }
        String str3 = this.schema;
        String str4 = banner.schema;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public void setBannerUrl(UrlModel urlModel) {
        this.bannerUrl = urlModel;
    }

    public void setBid(String str) {
        this.bid = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
