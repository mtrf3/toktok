package com.ss.android.ugc.aweme.account.login.model;

import X.C68537Qv7;
import X.F9E;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TPUserInfo extends F9E {
    public static final C68537Qv7 Companion = new C68537Qv7();
    public final String avatarUrl;
    public final String userName;

    public static /* synthetic */ TPUserInfo copy$default(TPUserInfo tPUserInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tPUserInfo.userName;
        }
        if ((i & 2) != 0) {
            str2 = tPUserInfo.avatarUrl;
        }
        return tPUserInfo.copy(str, str2);
    }

    public static final TPUserInfo from(User user) {
        Companion.getClass();
        return C68537Qv7.LIZ(user);
    }

    public final TPUserInfo copy(String userName, String avatarUrl) {
        o.LJIIIZ(userName, "userName");
        o.LJIIIZ(avatarUrl, "avatarUrl");
        return new TPUserInfo(userName, avatarUrl);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.userName, this.avatarUrl};
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getUserName() {
        return this.userName;
    }

    public TPUserInfo(String userName, String avatarUrl) {
        o.LJIIIZ(userName, "userName");
        o.LJIIIZ(avatarUrl, "avatarUrl");
        this.userName = userName;
        this.avatarUrl = avatarUrl;
    }
}
