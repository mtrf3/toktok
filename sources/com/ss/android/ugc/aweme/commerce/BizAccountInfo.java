package com.ss.android.ugc.aweme.commerce;

import X.C9N9;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public final class BizAccountInfo implements Serializable {
    public static final C9N9 Companion = new Object() { // from class: X.9N9
    };

    @InterfaceC65349Pkn("added_contact_and_link_list")
    public List<String> addedContactAndLinkList;

    @InterfaceC65349Pkn("android_download_app_link")
    public String androidDownloadAppLink;

    @InterfaceC65349Pkn("download_link_audit_status")
    public int baDownloadLinkAuditStatus;

    @InterfaceC65349Pkn("biz_contact_info")
    public BizContactInfo bizContactInfo;

    @InterfaceC65349Pkn("coupon_list")
    public List<CouponInfo> couponInfo;

    @InterfaceC65349Pkn("ios_download_app_link")
    public String iosDownloadAppLink;

    @InterfaceC65349Pkn("leads_gen")
    public LeadsGenModel leadsGenModel;

    @InterfaceC65349Pkn("permission_list")
    public List<String> permissionList;

    @InterfaceC65349Pkn("rba_user_info")
    public RBAUserInfo registeredBusiness;

    @InterfaceC65349Pkn("suggested_accounts_entrance_tip_type")
    public int suggestedAccountsEntranceTipType;

    @InterfaceC65349Pkn("suggested_accounts_lynx_schema")
    public String suggestedAccountsLynxSchema;

    public final boolean displayBusinessInfo() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("018003");
        }
        return false;
    }

    public final boolean enableActionButton() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("018001");
        }
        return false;
    }

    public final boolean enableAnalyticsNewSchema() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("012001");
        }
        return false;
    }

    public final boolean enableAutoMsg() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("001002");
        }
        return false;
    }

    public final boolean enableBrandedContent() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("006001");
        }
        return false;
    }

    public final boolean enableBrandedContentRemoveMe() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("006202");
        }
        return false;
    }

    public final boolean enableBrandedContentViewInsights() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("006201");
        }
        return false;
    }

    public final boolean enableBusinessRegistration() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("007001");
        }
        return false;
    }

    public final boolean enableCreativeHub() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("002001");
        }
        return false;
    }

    public final boolean enableDM() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("001001");
        }
        return false;
    }

    public final boolean enableEditPhone() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("015002");
        }
        return false;
    }

    public final boolean enableEditWebsite() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("007003");
        }
        return false;
    }

    public final boolean enableLeadsFrom() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("010001");
        }
        return false;
    }

    public final boolean enableLiveLinks() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("005001");
        }
        return false;
    }

    public final boolean enableNeedHelp() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("013001");
        }
        return false;
    }

    public final boolean enableProfileDisplay() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("018002");
        }
        return false;
    }

    public final boolean enableShowAndEditAddress() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("015003");
        }
        return false;
    }

    public final boolean enableShowCategory() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("007002");
        }
        return false;
    }

    public final boolean enableShowPhone() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("015001");
        }
        return false;
    }

    public final boolean enableSuggestedAccounts() {
        List<String> list = this.permissionList;
        if (list != null && list.contains("008001") && this.suggestedAccountsEntranceTipType != 0) {
            return true;
        }
        return false;
    }

    public final boolean enableSuggestedQuestion() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("001003");
        }
        return false;
    }

    public final boolean enableWebsite() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("007005");
        }
        return false;
    }

    public final List<String> getAddedContactAndLinkList() {
        return this.addedContactAndLinkList;
    }

    public final String getAndroidDownloadAppLink() {
        return this.androidDownloadAppLink;
    }

    public final int getBaDownloadLinkAuditStatus() {
        return this.baDownloadLinkAuditStatus;
    }

    public final BizContactInfo getBizContactInfo() {
        return this.bizContactInfo;
    }

    public final List<CouponInfo> getCouponInfo() {
        return this.couponInfo;
    }

    public final String getDownloadAppLinkToShowInEditProfile() {
        return this.androidDownloadAppLink;
    }

    public final int getDownloadLinkAuditStatus() {
        return this.baDownloadLinkAuditStatus;
    }

    public final String getIosDownloadAppLink() {
        return this.iosDownloadAppLink;
    }

    public final LeadsGenModel getLeadsGenModel() {
        return this.leadsGenModel;
    }

    public final List<String> getPermissionList() {
        return this.permissionList;
    }

    public final RBAUserInfo getRegisteredBusiness() {
        return this.registeredBusiness;
    }

    public final int getSuggestedAccountsEntranceTipType() {
        return this.suggestedAccountsEntranceTipType;
    }

    public final String getSuggestedAccountsLynxSchema() {
        return this.suggestedAccountsLynxSchema;
    }

    public final void setAddedContactAndLinkList(List<String> list) {
        this.addedContactAndLinkList = list;
    }

    public final void setAndroidDownloadAppLink(String str) {
        this.androidDownloadAppLink = str;
    }

    public final void setBaDownloadLinkAuditStatus(int i) {
        this.baDownloadLinkAuditStatus = i;
    }

    public final void setBizContactInfo(BizContactInfo bizContactInfo) {
        this.bizContactInfo = bizContactInfo;
    }

    public final void setCouponInfo(List<CouponInfo> list) {
        this.couponInfo = list;
    }

    public final void setIosDownloadAppLink(String str) {
        this.iosDownloadAppLink = str;
    }

    public final void setLeadsGenModel(LeadsGenModel leadsGenModel) {
        this.leadsGenModel = leadsGenModel;
    }

    public final void setPermissionList(List<String> list) {
        this.permissionList = list;
    }

    public final void setRegisteredBusiness(RBAUserInfo rBAUserInfo) {
        this.registeredBusiness = rBAUserInfo;
    }

    public final void setSuggestedAccountsEntranceTipType(int i) {
        this.suggestedAccountsEntranceTipType = i;
    }

    public final void setSuggestedAccountsLynxSchema(String str) {
        this.suggestedAccountsLynxSchema = str;
    }
}
