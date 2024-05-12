package com.bytedance.android.live.programmedlive.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FollowCardResponse {

    @InterfaceC65349Pkn("follow_card")
    public final FollowCard followCard;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FollowCardResponse) && o.LJ(this.followCard, ((FollowCardResponse) obj).followCard);
    }

    public final int hashCode() {
        FollowCard followCard = this.followCard;
        if (followCard == null) {
            return 0;
        }
        return followCard.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowCardResponse(followCard=");
        LIZ.append(this.followCard);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public FollowCardResponse(FollowCard followCard) {
        this.followCard = followCard;
    }
}
