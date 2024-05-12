package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoSvUserData implements Serializable {

    @InterfaceC65349Pkn("avatar_url")
    public final String avatar_url;

    @InterfaceC65349Pkn("email")
    public final String email;

    @InterfaceC65349Pkn("error_code")
    public final Integer errorCode;

    @InterfaceC65349Pkn("has_email")
    public Boolean has_email;

    @InterfaceC65349Pkn("has_mobile")
    public Boolean has_mobile;

    @InterfaceC65349Pkn("has_oauth")
    public Boolean has_oauth;

    @InterfaceC65349Pkn("has_pwd")
    public Boolean has_pwd;

    @InterfaceC65349Pkn("is_login")
    public final Boolean is_login;

    @InterfaceC65349Pkn("is_most_device")
    public final Boolean is_most_device;

    @InterfaceC65349Pkn("mobile")
    public final String mobile;

    @InterfaceC65349Pkn("nickname")
    public final String nickname;

    @InterfaceC65349Pkn("token")
    public final String token;

    public static /* synthetic */ TwoSvUserData copy$default(TwoSvUserData twoSvUserData, String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, Boolean bool6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twoSvUserData.avatar_url;
        }
        if ((i & 2) != 0) {
            str2 = twoSvUserData.nickname;
        }
        if ((i & 4) != 0) {
            str3 = twoSvUserData.email;
        }
        if ((i & 8) != 0) {
            num = twoSvUserData.errorCode;
        }
        if ((i & 16) != 0) {
            bool = twoSvUserData.has_email;
        }
        if ((i & 32) != 0) {
            bool2 = twoSvUserData.has_mobile;
        }
        if ((i & 64) != 0) {
            bool3 = twoSvUserData.has_oauth;
        }
        if ((i & 128) != 0) {
            bool4 = twoSvUserData.has_pwd;
        }
        if ((i & 256) != 0) {
            bool5 = twoSvUserData.is_most_device;
        }
        if ((i & 512) != 0) {
            str4 = twoSvUserData.mobile;
        }
        if ((i & 1024) != 0) {
            str5 = twoSvUserData.token;
        }
        if ((i & 2048) != 0) {
            bool6 = twoSvUserData.is_login;
        }
        return twoSvUserData.copy(str, str2, str3, num, bool, bool2, bool3, bool4, bool5, str4, str5, bool6);
    }

    public final TwoSvUserData copy(String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, Boolean bool6) {
        return new TwoSvUserData(str, str2, str3, num, bool, bool2, bool3, bool4, bool5, str4, str5, bool6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwoSvUserData)) {
            return false;
        }
        TwoSvUserData twoSvUserData = (TwoSvUserData) obj;
        return o.LJ(this.avatar_url, twoSvUserData.avatar_url) && o.LJ(this.nickname, twoSvUserData.nickname) && o.LJ(this.email, twoSvUserData.email) && o.LJ(this.errorCode, twoSvUserData.errorCode) && o.LJ(this.has_email, twoSvUserData.has_email) && o.LJ(this.has_mobile, twoSvUserData.has_mobile) && o.LJ(this.has_oauth, twoSvUserData.has_oauth) && o.LJ(this.has_pwd, twoSvUserData.has_pwd) && o.LJ(this.is_most_device, twoSvUserData.is_most_device) && o.LJ(this.mobile, twoSvUserData.mobile) && o.LJ(this.token, twoSvUserData.token) && o.LJ(this.is_login, twoSvUserData.is_login);
    }

    public int hashCode() {
        String str = this.avatar_url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickname;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.errorCode;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.has_email;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.has_mobile;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.has_oauth;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.has_pwd;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.is_most_device;
        int hashCode9 = (hashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str4 = this.mobile;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.token;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool6 = this.is_login;
        return hashCode11 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public String toString() {
        return "TwoSvUserData(avatar_url=" + this.avatar_url + ", nickname=" + this.nickname + ", email=" + this.email + ", errorCode=" + this.errorCode + ", has_email=" + this.has_email + ", has_mobile=" + this.has_mobile + ", has_oauth=" + this.has_oauth + ", has_pwd=" + this.has_pwd + ", is_most_device=" + this.is_most_device + ", mobile=" + this.mobile + ", token=" + this.token + ", is_login=" + this.is_login + ')';
    }

    public final String getAvatar_url() {
        return this.avatar_url;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final Boolean getHas_email() {
        return this.has_email;
    }

    public final Boolean getHas_mobile() {
        return this.has_mobile;
    }

    public final Boolean getHas_oauth() {
        return this.has_oauth;
    }

    public final Boolean getHas_pwd() {
        return this.has_pwd;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getToken() {
        return this.token;
    }

    public final Boolean is_login() {
        return this.is_login;
    }

    public final Boolean is_most_device() {
        return this.is_most_device;
    }

    public final void setHas_email(Boolean bool) {
        this.has_email = bool;
    }

    public final void setHas_mobile(Boolean bool) {
        this.has_mobile = bool;
    }

    public final void setHas_oauth(Boolean bool) {
        this.has_oauth = bool;
    }

    public final void setHas_pwd(Boolean bool) {
        this.has_pwd = bool;
    }

    public TwoSvUserData(String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, Boolean bool6) {
        this.avatar_url = str;
        this.nickname = str2;
        this.email = str3;
        this.errorCode = num;
        this.has_email = bool;
        this.has_mobile = bool2;
        this.has_oauth = bool3;
        this.has_pwd = bool4;
        this.is_most_device = bool5;
        this.mobile = str4;
        this.token = str5;
        this.is_login = bool6;
    }
}
