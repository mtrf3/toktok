package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareProductContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("product_picture")
    public UrlModel picture;

    @InterfaceC65349Pkn("seller_avatar")
    public UrlModel sellerAvatar;

    @InterfaceC65349Pkn("product_title")
    public String title = "";

    @InterfaceC65349Pkn("product_price")
    public String price = "";

    @InterfaceC65349Pkn("product_sales")
    public String sales = "";

    @InterfaceC65349Pkn("product_query_params")
    public String queryParams = "";

    @InterfaceC65349Pkn("seller_name")
    public String sellerName = "";

    public static final ShareProductContent fromPackage(SharePackage sharePackage) {
        return Companion.fromPackage(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("product");
        LIZ.extras.putString("product_title", this.title);
        LIZ.extras.putString("product_price", this.price);
        LIZ.extras.putString("product_sales", this.sales);
        LIZ.extras.putString("product_query_params", this.queryParams);
        LIZ.extras.putSerializable("product_picture", this.picture);
        LIZ.extras.putString("seller_name", this.sellerName);
        LIZ.extras.putSerializable("seller_avatar", this.sellerAvatar);
        return LIZ;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareProductContent fromPackage(SharePackage sharePackage) {
            UrlModel urlModel;
            o.LJIIIZ(sharePackage, "sharePackage");
            String string = sharePackage.extras.getString("product_title");
            String string2 = sharePackage.extras.getString("product_query_params");
            String string3 = sharePackage.extras.getString("product_price");
            String string4 = sharePackage.extras.getString("product_sales");
            Serializable serializable = sharePackage.extras.getSerializable("product_picture");
            UrlModel urlModel2 = null;
            if (serializable instanceof UrlModel) {
                urlModel = (UrlModel) serializable;
            } else {
                urlModel = null;
            }
            String string5 = sharePackage.extras.getString("seller_name");
            Serializable serializable2 = sharePackage.extras.getSerializable("seller_avatar");
            if (serializable2 instanceof UrlModel) {
                urlModel2 = (UrlModel) serializable2;
            }
            ShareProductContent shareProductContent = new ShareProductContent();
            if (string != null) {
                shareProductContent.setTitle(string);
            }
            if (string2 != null) {
                shareProductContent.setQueryParams(string2);
            }
            if (string3 != null) {
                shareProductContent.setPrice(string3);
            }
            if (string4 != null) {
                shareProductContent.setSales(string4);
            }
            shareProductContent.setPicture(urlModel);
            if (string5 != null) {
                shareProductContent.setSellerName(string5);
            }
            shareProductContent.setSellerAvatar(urlModel2);
            return shareProductContent;
        }
    }

    public final UrlModel getPicture() {
        return this.picture;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getQueryParams() {
        return this.queryParams;
    }

    public final String getSales() {
        return this.sales;
    }

    public final UrlModel getSellerAvatar() {
        return this.sellerAvatar;
    }

    public final String getSellerName() {
        return this.sellerName;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        o.LJIIIZ(context, "context");
        String string = EF7.LIZIZ().getResources().getString(R.string.fe6);
        o.LJIIIIZZ(string, "AppContextManager.getApp…om_sharing_product_reply)");
        return string;
    }

    public final void setPicture(UrlModel urlModel) {
        this.picture = urlModel;
    }

    public final void setPrice(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.price = str;
    }

    public final void setQueryParams(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.queryParams = str;
    }

    public final void setSales(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.sales = str;
    }

    public final void setSellerAvatar(UrlModel urlModel) {
        this.sellerAvatar = urlModel;
    }

    public final void setSellerName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.sellerName = str;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        if (z || z2) {
            return EF7.LIZIZ().getResources().getString(R.string.fe5);
        }
        return EF7.LIZIZ().getResources().getString(R.string.fe4);
    }
}
