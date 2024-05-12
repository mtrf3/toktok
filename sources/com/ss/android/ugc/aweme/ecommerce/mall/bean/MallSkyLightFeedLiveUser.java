package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallSkyLightFeedLiveUser {

    @InterfaceC65349Pkn("avatar")
    public final MallSkyLightFeedLiveUserAvatar avatar;

    @InterfaceC65349Pkn("verified_badge_url")
    public final String badgeUrl;

    @InterfaceC65349Pkn("user_id")
    public final String userId;

    @InterfaceC65349Pkn("name")
    public final String userName;

    public final MallSkyLightFeedLiveUserAvatar getAvatar() {
        return this.avatar;
    }

    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public MallSkyLightFeedLiveUser(String userName, MallSkyLightFeedLiveUserAvatar avatar, String userId, String badgeUrl) {
        o.LJIIIZ(userName, "userName");
        o.LJIIIZ(avatar, "avatar");
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(badgeUrl, "badgeUrl");
        this.userName = userName;
        this.avatar = avatar;
        this.userId = userId;
        this.badgeUrl = badgeUrl;
    }
}
