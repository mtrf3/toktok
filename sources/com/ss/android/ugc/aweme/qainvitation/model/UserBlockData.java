package com.ss.android.ugc.aweme.qainvitation.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserBlockData {

    @InterfaceC65349Pkn("uid")
    public final Long uid;

    @InterfaceC65349Pkn("user_blocked_results")
    public final List<UserBlockedResult> userBlockedResults;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBlockData)) {
            return false;
        }
        UserBlockData userBlockData = (UserBlockData) obj;
        return o.LJ(this.uid, userBlockData.uid) && o.LJ(this.userBlockedResults, userBlockData.userBlockedResults);
    }

    public final int hashCode() {
        Long l = this.uid;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<UserBlockedResult> list = this.userBlockedResults;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserBlockData(uid=");
        LIZ.append(this.uid);
        LIZ.append(", userBlockedResults=");
        return C1NE.LIZIZ(LIZ, this.userBlockedResults, ')', LIZ);
    }

    public UserBlockData(Long l, List<UserBlockedResult> list) {
        this.uid = l;
        this.userBlockedResults = list;
    }
}
