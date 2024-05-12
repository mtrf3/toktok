package com.ss.android.ugc.aweme.account.login.trusted;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LoginInfo {

    @InterfaceC65349Pkn("connect")
    public final Connect connect;

    @InterfaceC65349Pkn("email")
    public final String email;

    @InterfaceC65349Pkn("login_name")
    public final String login_name;

    @InterfaceC65349Pkn("login_type")
    public final Integer login_type;

    @InterfaceC65349Pkn("mobile")
    public final String mobile;

    @InterfaceC65349Pkn("screen_name")
    public final String screen_name;

    /* JADX WARN: Multi-variable type inference failed */
    public LoginInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) obj;
        return o.LJ(this.login_type, loginInfo.login_type) && o.LJ(this.mobile, loginInfo.mobile) && o.LJ(this.login_name, loginInfo.login_name) && o.LJ(this.email, loginInfo.email) && o.LJ(this.connect, loginInfo.connect) && o.LJ(this.screen_name, loginInfo.screen_name);
    }

    public final int hashCode() {
        Integer num = this.login_type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.mobile;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.login_name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Connect connect = this.connect;
        int hashCode5 = (hashCode4 + (connect == null ? 0 : connect.hashCode())) * 31;
        String str4 = this.screen_name;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    /* loaded from: classes12.dex */
    public static final class Connect {

        @InterfaceC65349Pkn("platform")
        public final String platform;

        @InterfaceC65349Pkn("platform_screen_name")
        public final String platform_screen_name;

        @InterfaceC65349Pkn("profile_image_url")
        public final String profile_image_url;

        /* JADX WARN: Multi-variable type inference failed */
        public Connect() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connect)) {
                return false;
            }
            Connect connect = (Connect) obj;
            return o.LJ(this.platform, connect.platform) && o.LJ(this.platform_screen_name, connect.platform_screen_name) && o.LJ(this.profile_image_url, connect.profile_image_url);
        }

        public final int hashCode() {
            String str = this.platform;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.platform_screen_name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.profile_image_url;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Connect(platform=");
            LIZ.append(this.platform);
            LIZ.append(", platform_screen_name=");
            LIZ.append(this.platform_screen_name);
            LIZ.append(", profile_image_url=");
            return q.LIZIZ(LIZ, this.profile_image_url, ')', LIZ);
        }

        public Connect(String str, String str2, String str3) {
            this.platform = str;
            this.platform_screen_name = str2;
            this.profile_image_url = str3;
        }

        public /* synthetic */ Connect(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoginInfo(login_type=");
        LIZ.append(this.login_type);
        LIZ.append(", mobile=");
        LIZ.append(this.mobile);
        LIZ.append(", login_name=");
        LIZ.append(this.login_name);
        LIZ.append(", email=");
        LIZ.append(this.email);
        LIZ.append(", connect=");
        LIZ.append(this.connect);
        LIZ.append(", screen_name=");
        return q.LIZIZ(LIZ, this.screen_name, ')', LIZ);
    }

    public LoginInfo(Integer num, String str, String str2, String str3, Connect connect, String str4) {
        this.login_type = num;
        this.mobile = str;
        this.login_name = str2;
        this.email = str3;
        this.connect = connect;
        this.screen_name = str4;
    }

    public /* synthetic */ LoginInfo(Integer num, String str, String str2, String str3, Connect connect, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : connect, (i & 32) == 0 ? str4 : null);
    }
}
