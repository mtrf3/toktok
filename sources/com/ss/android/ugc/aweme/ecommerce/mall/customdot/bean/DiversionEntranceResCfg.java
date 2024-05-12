package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.ProductCategory;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiversionEntranceResCfg {

    @InterfaceC65349Pkn("shop_now_text")
    public final String buttonText;

    @InterfaceC65349Pkn("duration")
    public final Long duration;

    @InterfaceC65349Pkn("find_more_text")
    public final String guideText;

    @InterfaceC65349Pkn("find_more_text_en")
    public final String guideTextEn;

    @InterfaceC65349Pkn("image")
    public final DiversionImage image;

    @InterfaceC65349Pkn("pid_to_category")
    public final Map<String, ProductCategory> productCategory;

    @InterfaceC65349Pkn("fallback_reddot")
    public final CountCfg redDot;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("scroll_text")
    public final String scrollText;

    @InterfaceC65349Pkn("show_product_images")
    public final String showProductImages;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("video_product_info")
    public final ProductRelation videoProductInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiversionEntranceResCfg copy$default(DiversionEntranceResCfg diversionEntranceResCfg, String str, DiversionImage diversionImage, Long l, CountCfg countCfg, String str2, String str3, String str4, String str5, Map map, String str6, String str7, ProductRelation productRelation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diversionEntranceResCfg.text;
        }
        if ((i & 2) != 0) {
            diversionImage = diversionEntranceResCfg.image;
        }
        if ((i & 4) != 0) {
            l = diversionEntranceResCfg.duration;
        }
        if ((i & 8) != 0) {
            countCfg = diversionEntranceResCfg.redDot;
        }
        if ((i & 16) != 0) {
            str2 = diversionEntranceResCfg.guideText;
        }
        if ((i & 32) != 0) {
            str3 = diversionEntranceResCfg.guideTextEn;
        }
        if ((i & 64) != 0) {
            str4 = diversionEntranceResCfg.buttonText;
        }
        if ((i & 128) != 0) {
            str5 = diversionEntranceResCfg.scrollText;
        }
        if ((i & 256) != 0) {
            map = diversionEntranceResCfg.productCategory;
        }
        if ((i & 512) != 0) {
            str6 = diversionEntranceResCfg.schema;
        }
        if ((i & 1024) != 0) {
            str7 = diversionEntranceResCfg.showProductImages;
        }
        if ((i & 2048) != 0) {
            productRelation = diversionEntranceResCfg.videoProductInfo;
        }
        return diversionEntranceResCfg.copy(str, diversionImage, l, countCfg, str2, str3, str4, str5, map, str6, str7, productRelation);
    }

    public final DiversionEntranceResCfg copy(String str, DiversionImage diversionImage, Long l, CountCfg countCfg, String str2, String str3, String str4, String str5, Map<String, ProductCategory> map, String str6, String str7, ProductRelation productRelation) {
        return new DiversionEntranceResCfg(str, diversionImage, l, countCfg, str2, str3, str4, str5, map, str6, str7, productRelation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiversionEntranceResCfg)) {
            return false;
        }
        DiversionEntranceResCfg diversionEntranceResCfg = (DiversionEntranceResCfg) obj;
        return o.LJ(this.text, diversionEntranceResCfg.text) && o.LJ(this.image, diversionEntranceResCfg.image) && o.LJ(this.duration, diversionEntranceResCfg.duration) && o.LJ(this.redDot, diversionEntranceResCfg.redDot) && o.LJ(this.guideText, diversionEntranceResCfg.guideText) && o.LJ(this.guideTextEn, diversionEntranceResCfg.guideTextEn) && o.LJ(this.buttonText, diversionEntranceResCfg.buttonText) && o.LJ(this.scrollText, diversionEntranceResCfg.scrollText) && o.LJ(this.productCategory, diversionEntranceResCfg.productCategory) && o.LJ(this.schema, diversionEntranceResCfg.schema) && o.LJ(this.showProductImages, diversionEntranceResCfg.showProductImages) && o.LJ(this.videoProductInfo, diversionEntranceResCfg.videoProductInfo);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DiversionImage diversionImage = this.image;
        int hashCode2 = (hashCode + (diversionImage == null ? 0 : diversionImage.hashCode())) * 31;
        Long l = this.duration;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        CountCfg countCfg = this.redDot;
        int hashCode4 = (hashCode3 + (countCfg == null ? 0 : countCfg.hashCode())) * 31;
        String str2 = this.guideText;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.guideTextEn;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scrollText;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, ProductCategory> map = this.productCategory;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        String str6 = this.schema;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.showProductImages;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ProductRelation productRelation = this.videoProductInfo;
        return hashCode11 + (productRelation != null ? productRelation.hashCode() : 0);
    }

    public String toString() {
        return "DiversionEntranceResCfg(text=" + this.text + ", image=" + this.image + ", duration=" + this.duration + ", redDot=" + this.redDot + ", guideText=" + this.guideText + ", guideTextEn=" + this.guideTextEn + ", buttonText=" + this.buttonText + ", scrollText=" + this.scrollText + ", productCategory=" + this.productCategory + ", schema=" + this.schema + ", showProductImages=" + this.showProductImages + ", videoProductInfo=" + this.videoProductInfo + ')';
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getGuideText() {
        return this.guideText;
    }

    public final String getGuideTextEn() {
        return this.guideTextEn;
    }

    public final DiversionImage getImage() {
        return this.image;
    }

    public final Map<String, ProductCategory> getProductCategory() {
        return this.productCategory;
    }

    public final CountCfg getRedDot() {
        return this.redDot;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getScrollText() {
        return this.scrollText;
    }

    public final String getShowProductImages() {
        return this.showProductImages;
    }

    public final String getText() {
        return this.text;
    }

    public final ProductRelation getVideoProductInfo() {
        return this.videoProductInfo;
    }

    public DiversionEntranceResCfg(String str, DiversionImage diversionImage, Long l, CountCfg countCfg, String str2, String str3, String str4, String str5, Map<String, ProductCategory> map, String str6, String str7, ProductRelation productRelation) {
        this.text = str;
        this.image = diversionImage;
        this.duration = l;
        this.redDot = countCfg;
        this.guideText = str2;
        this.guideTextEn = str3;
        this.buttonText = str4;
        this.scrollText = str5;
        this.productCategory = map;
        this.schema = str6;
        this.showProductImages = str7;
        this.videoProductInfo = productRelation;
    }
}
