package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DonationNotice {

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    @InterfaceC65349Pkn("from_user")
    public final User user;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonationNotice)) {
            return false;
        }
        DonationNotice donationNotice = (DonationNotice) obj;
        return o.LJ(this.aweme, donationNotice.aweme) && o.LJ(this.user, donationNotice.user);
    }

    public final int hashCode() {
        Aweme aweme = this.aweme;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        User user = this.user;
        return hashCode + (user != null ? user.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DonationNotice(aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", user=");
        LIZ.append(this.user);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DonationNotice(Aweme aweme, User user) {
        this.aweme = aweme;
        this.user = user;
    }
}
