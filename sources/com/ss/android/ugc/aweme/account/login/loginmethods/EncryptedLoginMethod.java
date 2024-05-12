package com.ss.android.ugc.aweme.account.login.loginmethods;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class EncryptedLoginMethod {

    @InterfaceC65349Pkn("a")
    public final String avatarUrl;

    @InterfaceC65349Pkn("l")
    public final Long lastActiveTime;

    @InterfaceC65349Pkn("m")
    public final LoginMethodName loginMethodName;

    @InterfaceC65349Pkn("t")
    public final String oneClickLoginToken;

    @InterfaceC65349Pkn("p")
    public final String platform;

    @InterfaceC65349Pkn("u")
    public final String uid;

    @InterfaceC65349Pkn("n")
    public final String userName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedLoginMethod)) {
            return false;
        }
        EncryptedLoginMethod encryptedLoginMethod = (EncryptedLoginMethod) obj;
        return o.LJ(this.uid, encryptedLoginMethod.uid) && this.loginMethodName == encryptedLoginMethod.loginMethodName && o.LJ(this.userName, encryptedLoginMethod.userName) && o.LJ(this.avatarUrl, encryptedLoginMethod.avatarUrl) && o.LJ(this.lastActiveTime, encryptedLoginMethod.lastActiveTime) && o.LJ(this.oneClickLoginToken, encryptedLoginMethod.oneClickLoginToken) && o.LJ(this.platform, encryptedLoginMethod.platform);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.avatarUrl, C79062V1e.LJ(this.userName, (this.loginMethodName.hashCode() + (this.uid.hashCode() * 31)) * 31, 31), 31);
        Long l = this.lastActiveTime;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.oneClickLoginToken, (LJ + hashCode) * 31, 31);
        String str = this.platform;
        if (str != null) {
            i = str.hashCode();
        }
        return LJ2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EncryptedLoginMethod(uid=");
        LIZ.append(this.uid);
        LIZ.append(", loginMethodName=");
        LIZ.append(this.loginMethodName);
        LIZ.append(", userName=");
        LIZ.append(this.userName);
        LIZ.append(", avatarUrl=");
        LIZ.append(this.avatarUrl);
        LIZ.append(", lastActiveTime=");
        LIZ.append(this.lastActiveTime);
        LIZ.append(", oneClickLoginToken=");
        LIZ.append(this.oneClickLoginToken);
        LIZ.append(", platform=");
        return q.LIZIZ(LIZ, this.platform, ')', LIZ);
    }

    public EncryptedLoginMethod(String uid, LoginMethodName loginMethodName, String userName, String avatarUrl, Long l, String oneClickLoginToken, String str) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(userName, "userName");
        o.LJIIIZ(avatarUrl, "avatarUrl");
        o.LJIIIZ(oneClickLoginToken, "oneClickLoginToken");
        this.uid = uid;
        this.loginMethodName = loginMethodName;
        this.userName = userName;
        this.avatarUrl = avatarUrl;
        this.lastActiveTime = l;
        this.oneClickLoginToken = oneClickLoginToken;
        this.platform = str;
    }
}
