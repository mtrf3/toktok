package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class CouponInfo implements Serializable {

    @InterfaceC65349Pkn("coupon_code")
    public String couponCode;

    @InterfaceC65349Pkn("coupon_id")
    public Long couponId;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("discount_rate")
    public Integer discountRate;

    @InterfaceC65349Pkn("expire_time")
    public Long expireTime;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @InterfaceC65349Pkn("website")
    public String website;

    @InterfaceC65349Pkn("website_secure")
    public String websiteSecure;

    public final String getCouponCode() {
        return this.couponCode;
    }

    public final Long getCouponId() {
        return this.couponId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getDiscountRate() {
        return this.discountRate;
    }

    public final Long getExpireTime() {
        return this.expireTime;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getWebsite() {
        return this.website;
    }

    public final String getWebsiteSecure() {
        return this.websiteSecure;
    }

    public final void setCouponCode(String str) {
        this.couponCode = str;
    }

    public final void setCouponId(Long l) {
        this.couponId = l;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDiscountRate(Integer num) {
        this.discountRate = num;
    }

    public final void setExpireTime(Long l) {
        this.expireTime = l;
    }

    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    public final void setWebsite(String str) {
        this.website = str;
    }

    public final void setWebsiteSecure(String str) {
        this.websiteSecure = str;
    }
}
