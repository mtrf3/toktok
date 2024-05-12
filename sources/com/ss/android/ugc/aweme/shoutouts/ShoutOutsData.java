package com.ss.android.ugc.aweme.shoutouts;

import X.C173566rY;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ShoutOutsData implements Serializable {

    @InterfaceC65349Pkn("buyer_payment")
    public MoneyDes buyerMoneyDes;

    @InterfaceC65349Pkn("so_coins")
    public int coins;

    @InterfaceC65349Pkn("img")
    public String coverUrl;

    @InterfaceC65349Pkn("des")
    public String desc;

    @InterfaceC65349Pkn("music_id")
    public String musicId;

    @InterfaceC65349Pkn("so_order_id")
    public String orderId;

    @InterfaceC65349Pkn("post_video_path")
    public String postVideoPath;

    @InterfaceC65349Pkn("price")
    public ShoutoutPrice price;

    @InterfaceC65349Pkn("so_product_id")
    public String productId;

    @InterfaceC65349Pkn("reviewed")
    public int reviewed;

    @InterfaceC65349Pkn("shoutouts_mode")
    public String shoutOutsMode;
    public static final C173566rY Companion = new Object() { // from class: X.6rY
    };
    public static String MODE_CREATE = "1";
    public static String MODE_POST = "2";
    public static String MODE_SEND = "3";
    public static String MODE_EDIT = "4";
    public static String MOD_ORDER_ID = "order_id";
    public static String MOD_REVIEWED = "reviewed";
    public static String shootWay = "shoutouts";

    public final MoneyDes getBuyerMoneyDes() {
        return this.buyerMoneyDes;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPostVideoPath() {
        return this.postVideoPath;
    }

    public final ShoutoutPrice getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getReviewed() {
        return this.reviewed;
    }

    public final String getShoutOutsMode() {
        return this.shoutOutsMode;
    }

    public final void setBuyerMoneyDes(MoneyDes moneyDes) {
        this.buyerMoneyDes = moneyDes;
    }

    public final void setCoins(int i) {
        this.coins = i;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final void setPostVideoPath(String str) {
        this.postVideoPath = str;
    }

    public final void setPrice(ShoutoutPrice shoutoutPrice) {
        this.price = shoutoutPrice;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setReviewed(int i) {
        this.reviewed = i;
    }

    public final void setShoutOutsMode(String str) {
        this.shoutOutsMode = str;
    }
}
