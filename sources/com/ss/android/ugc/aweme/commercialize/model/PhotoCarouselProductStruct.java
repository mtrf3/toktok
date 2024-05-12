package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PhotoCarouselProductStruct implements Serializable {

    @InterfaceC65349Pkn("anchor_title")
    public final String anchorTitle;

    @InterfaceC65349Pkn("native_site_custom_data")
    public final String nativeSiteCustomData;

    @InterfaceC65349Pkn("open_url")
    public final String openUrl;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("web_url")
    public final String webUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoCarouselProductStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final String getAnchorTitle() {
        return this.anchorTitle;
    }

    public final String getNativeSiteCustomData() {
        return this.nativeSiteCustomData;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public PhotoCarouselProductStruct(String webUrl, String openUrl, String anchorTitle, String productId, String nativeSiteCustomData) {
        o.LJIIIZ(webUrl, "webUrl");
        o.LJIIIZ(openUrl, "openUrl");
        o.LJIIIZ(anchorTitle, "anchorTitle");
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(nativeSiteCustomData, "nativeSiteCustomData");
        this.webUrl = webUrl;
        this.openUrl = openUrl;
        this.anchorTitle = anchorTitle;
        this.productId = productId;
        this.nativeSiteCustomData = nativeSiteCustomData;
    }

    public /* synthetic */ PhotoCarouselProductStruct(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
    }
}
