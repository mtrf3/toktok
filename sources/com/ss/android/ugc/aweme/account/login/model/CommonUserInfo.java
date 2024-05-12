package com.ss.android.ugc.aweme.account.login.model;

import X.C68522Qus;
import X.C79062V1e;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CommonUserInfo {
    public static final C68522Qus Companion = new C68522Qus();
    public final String avatarUrl;
    public String screenName;
    public final String secUid;
    public final String userName;

    public static /* synthetic */ CommonUserInfo copy$default(CommonUserInfo commonUserInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonUserInfo.userName;
        }
        if ((i & 2) != 0) {
            str2 = commonUserInfo.avatarUrl;
        }
        if ((i & 4) != 0) {
            str3 = commonUserInfo.secUid;
        }
        if ((i & 8) != 0) {
            str4 = commonUserInfo.screenName;
        }
        return commonUserInfo.copy(str, str2, str3, str4);
    }

    public static final CommonUserInfo defaultCommonUserInfo() {
        Companion.getClass();
        return C68522Qus.LIZ();
    }

    public final CommonUserInfo copy(String userName, String avatarUrl, String str, String str2) {
        o.LJIIIZ(userName, "userName");
        o.LJIIIZ(avatarUrl, "avatarUrl");
        return new CommonUserInfo(userName, avatarUrl, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonUserInfo)) {
            return false;
        }
        CommonUserInfo commonUserInfo = (CommonUserInfo) obj;
        return o.LJ(this.userName, commonUserInfo.userName) && o.LJ(this.avatarUrl, commonUserInfo.avatarUrl) && o.LJ(this.secUid, commonUserInfo.secUid) && o.LJ(this.screenName, commonUserInfo.screenName);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.avatarUrl, this.userName.hashCode() * 31, 31);
        String str = this.secUid;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.screenName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final boolean isCommonInfoAvailable() {
        if (this.userName.length() > 0 && this.avatarUrl.length() > 0) {
            return true;
        }
        return false;
    }

    public final boolean isUsernameAvailable() {
        if (this.userName.length() > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonUserInfo(userName=");
        LIZ.append(this.userName);
        LIZ.append(", avatarUrl=");
        LIZ.append(this.avatarUrl);
        LIZ.append(", secUid=");
        LIZ.append(this.secUid);
        LIZ.append(", screenName=");
        return q.LIZIZ(LIZ, this.screenName, ')', LIZ);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void setScreenName(String str) {
        this.screenName = str;
    }

    public CommonUserInfo(String userName, String avatarUrl, String str, String str2) {
        o.LJIIIZ(userName, "userName");
        o.LJIIIZ(avatarUrl, "avatarUrl");
        this.userName = userName;
        this.avatarUrl = avatarUrl;
        this.secUid = str;
        this.screenName = str2;
    }

    public /* synthetic */ CommonUserInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
