package com.bytedance.android.livesdk.wallet;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.wallet.model.recharge.ExtraActivityInfo;
import java.util.ArrayList;
import java.util.List;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public class DiamondPackageExtra extends Extra {

    @InterfaceC65349Pkn("recommended_packet_id")
    public int RecommendedPacketId;

    @InterfaceC65349Pkn("activity_info")
    public ExtraActivityInfo activityInfo;

    @InterfaceC65349Pkn("full_list")
    public List<Diamond> fullPackageList;

    @InterfaceC65349Pkn("iap_custom_data")
    public ListResult.IapCustomData iapCustomData;

    @InterfaceC65349Pkn("insufficient_balance_ab_group_id")
    public String insufficientBalanceAbGroupId;

    @InterfaceC65349Pkn("is_new_recommend_package")
    public Boolean isNewRecommendPackage;

    @InterfaceC65349Pkn("badge_icon")
    public String mBadgeIcon;

    @InterfaceC65349Pkn("channel")
    public String mChannel;

    @InterfaceC65349Pkn("channel_id")
    public int mChannelId;

    @InterfaceC65349Pkn("currency_list")
    public List<String> mCurrencyList;

    @InterfaceC65349Pkn("default_currency")
    public String mDefaultCurrency;

    @InterfaceC65349Pkn("is_default")
    public boolean mIsDefault;

    @InterfaceC65349Pkn("is_recommend")
    public boolean mIsRecommend;

    @InterfaceC65349Pkn("need_auth")
    public int mNeedAuth;

    @InterfaceC65349Pkn("max_customized_diamond_cnt")
    public long maxCustomizedDiamond;

    @InterfaceC65349Pkn("min_customized_diamond_cnt")
    public long minCustomizedDiamond;

    @InterfaceC65349Pkn("should_display_customized_web_recharge")
    public boolean officialRecharge;

    @InterfaceC65349Pkn("recently_purchased_packet_id")
    public int recentlyPurchasedPacketId;

    @InterfaceC65349Pkn("voucher_list")
    public List<ListResult.VoucherItem> voucherList = new ArrayList();

    @InterfaceC65349Pkn("web_recharge_custom")
    public WebRechargeCustom webRechargeCustom;

    public String getBadgeIcon() {
        return this.mBadgeIcon;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public int getChannelId() {
        return this.mChannelId;
    }

    public List<String> getCurrencyList() {
        return this.mCurrencyList;
    }

    public String getDefaultCurrency() {
        return this.mDefaultCurrency;
    }

    public List<Diamond> getFullPackageList() {
        return this.fullPackageList;
    }

    public String getInsufficientBalanceAbGroupId() {
        return this.insufficientBalanceAbGroupId;
    }

    public boolean getIsDefault() {
        return this.mIsDefault;
    }

    public boolean getIsRecommend() {
        return this.mIsRecommend;
    }

    public int getNeedAuth() {
        return this.mNeedAuth;
    }

    public Boolean getNewRecommendPackage() {
        return this.isNewRecommendPackage;
    }

    public void setBadgeIcon(String str) {
        this.mBadgeIcon = str;
    }

    public void setChannel(String str) {
        this.mChannel = str;
    }

    public void setChannelId(int i) {
        this.mChannelId = i;
    }

    public void setCurrencyList(List<String> list) {
        this.mCurrencyList = list;
    }

    public void setDefaultCurrency(String str) {
        this.mDefaultCurrency = str;
    }

    public void setFullPackageList(List<Diamond> list) {
        this.fullPackageList = list;
    }

    public void setInsufficientBalanceAbGroupId(String str) {
        this.insufficientBalanceAbGroupId = str;
    }

    public void setIsDefault(boolean z) {
        this.mIsDefault = z;
    }

    public void setIsRecommend(boolean z) {
        this.mIsRecommend = z;
    }

    public void setNeedAuth(int i) {
        this.mNeedAuth = i;
    }

    public void setNewRecommendPackage(Boolean bool) {
        this.isNewRecommendPackage = bool;
    }
}
