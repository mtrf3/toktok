package com.ss.android.account.share.data.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public class AccountShareInfo {

    @InterfaceC65349Pkn("account_extra")
    public String accountExtra;

    @InterfaceC65349Pkn("account_type")
    public int accountType;

    @InterfaceC65349Pkn("app_id")
    public int appid;

    @InterfaceC65349Pkn("error_msg")
    public String errMsg;

    @InterfaceC65349Pkn("from_install_id")
    public String fromInstallId;

    @InterfaceC65349Pkn("is_key_mode")
    public Boolean isKidMode;

    @InterfaceC65349Pkn("account_online")
    public int isLogin;

    @InterfaceC65349Pkn("sec_user_id")
    public String secUserId;

    @InterfaceC65349Pkn("user_avatar")
    public String userAvatar;

    @InterfaceC65349Pkn("user_name")
    public String userName;

    @InterfaceC65349Pkn("user_session")
    public String userSession;

    public AccountShareInfo() {
    }

    public AccountShareInfo(String str) {
        this.errMsg = str;
    }
}
