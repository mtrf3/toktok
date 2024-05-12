package com.ss.android.ugc.aweme.friendstab.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserNewContent extends F9E {

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    @InterfaceC65349Pkn("new_content_author")
    public final User user;

    public static /* synthetic */ UserNewContent copy$default(UserNewContent userNewContent, User user, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userNewContent.user;
        }
        if ((i & 2) != 0) {
            str = userNewContent.itemId;
        }
        return userNewContent.copy(user, str);
    }

    public final UserNewContent copy(User user, String itemId) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(itemId, "itemId");
        return new UserNewContent(user, itemId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.user, this.itemId};
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final User getUser() {
        return this.user;
    }

    public UserNewContent(User user, String itemId) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(itemId, "itemId");
        this.user = user;
        this.itemId = itemId;
    }
}
