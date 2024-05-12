package com.ss.android.ugc.aweme.commerce.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SimplePromotion extends CommerceBaseResponse implements Serializable {

    @InterfaceC65349Pkn("comment_area")
    public String commentArea;

    @InterfaceC65349Pkn("elastic_images")
    public List<? extends UrlModel> elasticImages;

    @InterfaceC65349Pkn("jump_to_url")
    public boolean jumpToUrl;

    @InterfaceC65349Pkn("label")
    public List<String> labels;

    @InterfaceC65349Pkn("meta_param")
    public String metaParam;

    @InterfaceC65349Pkn("price")
    public int price;

    @InterfaceC65349Pkn("promotion_source")
    public int promotionSource;

    @InterfaceC65349Pkn("sales")
    public int sales;

    @InterfaceC65349Pkn("visitor")
    public PromotionVisitor visitor;

    @InterfaceC65349Pkn("promotion_id")
    public String promotionId = "";

    @InterfaceC65349Pkn("product_id")
    public String productId = "";

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("elastic_title")
    public String elasticTitle = "";

    @InterfaceC65349Pkn("card_url")
    public String cardUrl = "";

    public final String getLongTitle() {
        if (!TextUtils.isEmpty(this.title)) {
            return this.title;
        }
        return this.elasticTitle;
    }

    public final String getShortTitle() {
        if (TextUtils.isEmpty(this.elasticTitle)) {
            return this.title;
        }
        return this.elasticTitle;
    }

    public SimplePromotion() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.elasticImages = c61878OQg;
        this.labels = c61878OQg;
    }

    public final String getCardUrl() {
        return this.cardUrl;
    }

    public final String getCommentArea() {
        return this.commentArea;
    }

    public final List<UrlModel> getElasticImages() {
        return this.elasticImages;
    }

    public final String getElasticTitle() {
        return this.elasticTitle;
    }

    public final boolean getJumpToUrl() {
        return this.jumpToUrl;
    }

    public final List<String> getLabels() {
        return this.labels;
    }

    public final String getMetaParam() {
        return this.metaParam;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final int getPromotionSource() {
        return this.promotionSource;
    }

    public final int getSales() {
        return this.sales;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PromotionVisitor getVisitor() {
        return this.visitor;
    }

    public final void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public final void setCommentArea(String str) {
        this.commentArea = str;
    }

    public final void setElasticImages(List<? extends UrlModel> list) {
        this.elasticImages = list;
    }

    public final void setElasticTitle(String str) {
        this.elasticTitle = str;
    }

    public final void setJumpToUrl(boolean z) {
        this.jumpToUrl = z;
    }

    public final void setLabels(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.labels = list;
    }

    public final void setMetaParam(String str) {
        this.metaParam = str;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setPromotionId(String str) {
        this.promotionId = str;
    }

    public final void setPromotionSource(int i) {
        this.promotionSource = i;
    }

    public final void setSales(int i) {
        this.sales = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setVisitor(PromotionVisitor promotionVisitor) {
        this.visitor = promotionVisitor;
    }
}
