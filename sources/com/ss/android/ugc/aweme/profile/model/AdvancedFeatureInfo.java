package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AdvancedFeatureInfo implements Serializable {

    @InterfaceC65349Pkn("order_center_title_en")
    public final String entryName;

    @InterfaceC65349Pkn("feature_id")
    public final int featureId;

    @InterfaceC65349Pkn("order_center_icon_dark_url")
    public final String iconDarkUrl;

    @InterfaceC65349Pkn("order_center_icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("order_center_schema")
    public final String orderCenterSchema;

    @InterfaceC65349Pkn("order_center_title")
    public final String orderCenterTitle;

    @InterfaceC65349Pkn("paid_collections_schema")
    public final String paidCollectionSchema;

    @InterfaceC65349Pkn("red_dot_count")
    public final int redDotCount;

    @InterfaceC65349Pkn("shop_schema")
    public final String shopSchema;

    @InterfaceC65349Pkn("sub_info")
    public final SubscriptionInfo subInfo;

    public final String getEntryName() {
        return this.entryName;
    }

    public final int getFeatureId() {
        return this.featureId;
    }

    public final String getIconDarkUrl() {
        return this.iconDarkUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getOrderCenterSchema() {
        return this.orderCenterSchema;
    }

    public final String getOrderCenterTitle() {
        return this.orderCenterTitle;
    }

    public final String getPaidCollectionSchema() {
        return this.paidCollectionSchema;
    }

    public final int getRedDotCount() {
        return this.redDotCount;
    }

    public final String getShopSchema() {
        return this.shopSchema;
    }

    public final SubscriptionInfo getSubInfo() {
        return this.subInfo;
    }

    public AdvancedFeatureInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, SubscriptionInfo subscriptionInfo, int i2, String str7) {
        this.shopSchema = str;
        this.orderCenterSchema = str2;
        this.orderCenterTitle = str3;
        this.entryName = str4;
        this.redDotCount = i;
        this.iconUrl = str5;
        this.iconDarkUrl = str6;
        this.subInfo = subscriptionInfo;
        this.featureId = i2;
        this.paidCollectionSchema = str7;
    }

    public /* synthetic */ AdvancedFeatureInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, SubscriptionInfo subscriptionInfo, int i2, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i3 & 16) != 0 ? 0 : i, str5, str6, subscriptionInfo, (i3 & 256) != 0 ? 0 : i2, str7);
    }
}
