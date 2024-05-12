package com.ss.android.ugc.aweme.account.login.trusted;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TrustedEnvUser {

    @InterfaceC65349Pkn("avatar_url")
    public final String avatarUrl;

    @InterfaceC65349Pkn("cached_at")
    public long cachedAtMillis;

    @InterfaceC65349Pkn("last_login_time")
    public final Long lastLoginTimeInSeconds;

    @InterfaceC65349Pkn("login_info")
    public final LoginInfo login_info;

    @InterfaceC65349Pkn("nick_name")
    public final String nickname;

    @InterfaceC65349Pkn("screen_name")
    public final String screenName;

    @InterfaceC65349Pkn("sec_user_id")
    public final String secUid;

    /* JADX WARN: Multi-variable type inference failed */
    public TrustedEnvUser() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedEnvUser)) {
            return false;
        }
        TrustedEnvUser trustedEnvUser = (TrustedEnvUser) obj;
        return o.LJ(this.secUid, trustedEnvUser.secUid) && o.LJ(this.lastLoginTimeInSeconds, trustedEnvUser.lastLoginTimeInSeconds) && o.LJ(this.screenName, trustedEnvUser.screenName) && o.LJ(this.nickname, trustedEnvUser.nickname) && o.LJ(this.login_info, trustedEnvUser.login_info) && o.LJ(this.avatarUrl, trustedEnvUser.avatarUrl);
    }

    public final int hashCode() {
        String str = this.secUid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.lastLoginTimeInSeconds;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.screenName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LoginInfo loginInfo = this.login_info;
        int hashCode5 = (hashCode4 + (loginInfo == null ? 0 : loginInfo.hashCode())) * 31;
        String str4 = this.avatarUrl;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrustedEnvUser(secUid=");
        LIZ.append(this.secUid);
        LIZ.append(", lastLoginTimeInSeconds=");
        LIZ.append(this.lastLoginTimeInSeconds);
        LIZ.append(", screenName=");
        LIZ.append(this.screenName);
        LIZ.append(", nickname=");
        LIZ.append(this.nickname);
        LIZ.append(", login_info=");
        LIZ.append(this.login_info);
        LIZ.append(", avatarUrl=");
        return q.LIZIZ(LIZ, this.avatarUrl, ')', LIZ);
    }

    public TrustedEnvUser(String str, Long l, String str2, String str3, LoginInfo loginInfo, String str4) {
        this.secUid = str;
        this.lastLoginTimeInSeconds = l;
        this.screenName = str2;
        this.nickname = str3;
        this.login_info = loginInfo;
        this.avatarUrl = str4;
    }

    public /* synthetic */ TrustedEnvUser(String str, Long l, String str2, String str3, LoginInfo loginInfo, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : loginInfo, (i & 32) == 0 ? str4 : null);
    }
}
