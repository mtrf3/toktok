package com.bytedance.android.live.programmedlive.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FollowCard {

    @InterfaceC65349Pkn("display_duration")
    public final Long duration;

    @InterfaceC65349Pkn("follow_card_id")
    public final Long id;

    @InterfaceC65349Pkn("user")
    public final User user;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowCard)) {
            return false;
        }
        FollowCard followCard = (FollowCard) obj;
        return o.LJ(this.id, followCard.id) && o.LJ(this.user, followCard.user) && o.LJ(this.duration, followCard.duration);
    }

    public final int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        User user = this.user;
        int hashCode2 = (hashCode + (user == null ? 0 : user.hashCode())) * 31;
        Long l2 = this.duration;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowCard(id=");
        LIZ.append(this.id);
        LIZ.append(", user=");
        LIZ.append(this.user);
        LIZ.append(", duration=");
        return JBR.LJ(LIZ, this.duration, ')', LIZ);
    }

    public FollowCard(Long l, User user, Long l2) {
        this.id = l;
        this.user = user;
        this.duration = l2;
    }
}
