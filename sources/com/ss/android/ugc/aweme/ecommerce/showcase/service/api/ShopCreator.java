package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShopCreator {

    @InterfaceC65349Pkn("role")
    public final int role;

    @InterfaceC65349Pkn("show_follow_button")
    public final Boolean showFollowButton;

    @InterfaceC65349Pkn("user_info")
    public final User user;

    @InterfaceC65349Pkn("user_id")
    public final long userId;

    @InterfaceC65349Pkn("user_name")
    public final String userName;

    public ShopCreator(long j, String userName, int i, User user, Boolean bool) {
        o.LJIIIZ(userName, "userName");
        this.userId = j;
        this.userName = userName;
        this.role = i;
        this.user = user;
        this.showFollowButton = bool;
    }
}
