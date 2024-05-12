package com.ss.android.ugc.aweme.friends.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserWithAweme implements Serializable, Cloneable {

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    @InterfaceC65349Pkn("user")
    public final User user;

    public final String getUid() {
        String uid = this.user.getUid();
        if (uid == null) {
            return "";
        }
        return uid;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public UserWithAweme m124clone() {
        try {
            Object clone = super.clone();
            o.LJII(clone, "null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.UserWithAweme");
            return (UserWithAweme) clone;
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return new UserWithAweme(new User(), new Aweme());
        }
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final User getUser() {
        return this.user;
    }

    public UserWithAweme(User user, Aweme aweme) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(aweme, "aweme");
        this.user = user;
        this.aweme = aweme;
    }
}
