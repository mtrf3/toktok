package com.ss.android.ugc.aweme.commercialize.coupon.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class CouponInfo extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("abbr_condition")
    public String abbrCondition;

    @InterfaceC65349Pkn("activity_id")
    public int activityId;

    @InterfaceC65349Pkn("can_rate")
    public int canRate;

    @InterfaceC65349Pkn("codabar_image_url")
    public String codabarImageUrl;

    @InterfaceC65349Pkn("code")
    public String code;

    @InterfaceC65349Pkn("code_id")
    public String codeId;

    @InterfaceC65349Pkn("condition")
    public String condition;

    @InterfaceC65349Pkn("coupon_id")
    public int couponId;

    @InterfaceC65349Pkn("coupon_source")
    public int couponSource;

    @InterfaceC65349Pkn("coupon_type")
    public int couponType;

    @InterfaceC65349Pkn("create_time")
    public String createTime;

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("detail_url")
    public String detailUrl;

    @InterfaceC65349Pkn("group")
    public String group;

    @InterfaceC65349Pkn("head_image_url")
    public UrlModel headImageUrl;

    @InterfaceC65349Pkn("hint_text")
    public String hintText;

    @InterfaceC65349Pkn("is_default_head_image")
    public boolean isDefaultHeadImage;

    @InterfaceC65349Pkn("logo_image_url")
    public UrlModel logoImageUrl;

    @InterfaceC65349Pkn("sec_uid")
    public String mSecUid;

    @InterfaceC65349Pkn("merchant_name")
    public String merchantName;

    @InterfaceC65349Pkn("notification")
    public String notification;

    @InterfaceC65349Pkn("object_type")
    public int objectType;

    @InterfaceC65349Pkn("pay_type")
    public int payType;

    @InterfaceC65349Pkn("qrcode_url")
    public UrlModel qrCodeUrl;

    @InterfaceC65349Pkn("service_tel")
    public String serviceTel;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("store_page_link")
    public String storePageLink;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("use_page_link")
    public String usePageLink;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    @InterfaceC65349Pkn("valid_date_text")
    public String validDateText;

    @InterfaceC65349Pkn("valid_end")
    public String validEnd;

    @InterfaceC65349Pkn("valid_start")
    public String validStart;

    public String getAbbrCondition() {
        return this.abbrCondition;
    }

    public int getActivityId() {
        return this.activityId;
    }

    public String getCodabarImageUrl() {
        return this.codabarImageUrl;
    }

    public String getCode() {
        return this.code;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getCondition() {
        return this.condition;
    }

    public int getCouponId() {
        return this.couponId;
    }

    public int getCouponSource() {
        return this.couponSource;
    }

    public int getCouponType() {
        return this.couponType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public String getGroup() {
        return this.group;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public UrlModel getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getNotification() {
        return this.notification;
    }

    public int getPayType() {
        return this.payType;
    }

    public UrlModel getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public String getServiceTel() {
        return this.serviceTel;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStorePageLink() {
        return this.storePageLink;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUsePageLink() {
        return this.usePageLink;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getValidEnd() {
        return this.validEnd;
    }

    public String getValidStart() {
        return this.validStart;
    }

    public boolean isDefaultHeadImage() {
        return this.isDefaultHeadImage;
    }

    public void setAbbrCondition(String str) {
        this.abbrCondition = str;
    }

    public void setActivityId(int i) {
        this.activityId = i;
    }

    public void setCodabarImageUrl(String str) {
        this.codabarImageUrl = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setCondition(String str) {
        this.condition = str;
    }

    public void setCouponId(int i) {
        this.couponId = i;
    }

    public void setCouponSource(int i) {
        this.couponSource = i;
    }

    public void setCouponType(int i) {
        this.couponType = i;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDefaultHeadImage(boolean z) {
        this.isDefaultHeadImage = z;
    }

    public void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setLogoImageUrl(UrlModel urlModel) {
        this.logoImageUrl = urlModel;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setNotification(String str) {
        this.notification = str;
    }

    public void setQrCodeUrl(UrlModel urlModel) {
        this.qrCodeUrl = urlModel;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setServiceTel(String str) {
        this.serviceTel = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStorePageLink(String str) {
        this.storePageLink = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUsePageLink(String str) {
        this.usePageLink = str;
    }

    public void setUserId(Long l) {
        this.userId = l;
    }

    public void setValidEnd(String str) {
        this.validEnd = str;
    }

    public void setValidStart(String str) {
        this.validStart = str;
    }
}
