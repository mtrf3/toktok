package com.ss.android.ugc.aweme.user;

import X.EF7;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SignificantUserInfo {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("app_id")
    public final long appId;

    @InterfaceC65349Pkn("avatar_url")
    public String avatarUrl;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("sec_uid")
    public final String secUid;

    @InterfaceC65349Pkn("short_id")
    public final String shortId;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    @InterfaceC65349Pkn("unique_id")
    public final String uniqueId;

    public SignificantUserInfo() {
        this(null, null, null, null, null, null, 0L, 127, null);
    }

    public final SignificantUserInfo LIZ(SignificantUserInfo significantUserInfo) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (significantUserInfo == null || !o.LJ(significantUserInfo.uid, this.uid)) {
            return this;
        }
        String str6 = this.uid;
        String str7 = this.shortId;
        if (str7 == null || str7.length() == 0) {
            str = significantUserInfo.shortId;
        } else {
            str = this.shortId;
        }
        String str8 = this.uniqueId;
        if (str8 == null || str8.length() == 0) {
            str2 = significantUserInfo.uniqueId;
        } else {
            str2 = this.uniqueId;
        }
        String str9 = this.nickname;
        if (str9 == null || str9.length() == 0) {
            str3 = significantUserInfo.nickname;
        } else {
            str3 = this.nickname;
        }
        String str10 = this.avatarUrl;
        if (str10 == null || str10.length() == 0) {
            str4 = significantUserInfo.avatarUrl;
        } else {
            str4 = this.avatarUrl;
        }
        String str11 = this.secUid;
        if (str11 == null || str11.length() == 0) {
            str5 = significantUserInfo.secUid;
        } else {
            str5 = this.secUid;
        }
        long j = this.appId;
        if (j == 0) {
            j = significantUserInfo.appId;
        }
        return new SignificantUserInfo(str6, str, str2, str3, str4, str5, j);
    }

    public SignificantUserInfo(String uid, String shortId, String uniqueId, String nickname, String avatarUrl, String secUid, long j) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(shortId, "shortId");
        o.LJIIIZ(uniqueId, "uniqueId");
        o.LJIIIZ(nickname, "nickname");
        o.LJIIIZ(avatarUrl, "avatarUrl");
        o.LJIIIZ(secUid, "secUid");
        this.uid = uid;
        this.shortId = shortId;
        this.uniqueId = uniqueId;
        this.nickname = nickname;
        this.avatarUrl = avatarUrl;
        this.secUid = secUid;
        this.appId = j;
    }

    public SignificantUserInfo(String str, String str2, String str3, String str4, String str5, String str6, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? EF7.LJIIIZ : j);
    }
}
