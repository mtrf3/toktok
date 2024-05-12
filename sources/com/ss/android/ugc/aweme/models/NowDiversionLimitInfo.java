package com.ss.android.ugc.aweme.models;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NowDiversionLimitInfo implements Serializable {

    @InterfaceC65349Pkn("history_posted_friends")
    public final List<User> historyPostedFriends;

    @InterfaceC65349Pkn("trial_days_remaining")
    public final Integer trialDaysRemaining;

    /* JADX WARN: Multi-variable type inference failed */
    public NowDiversionLimitInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NowDiversionLimitInfo copy$default(NowDiversionLimitInfo nowDiversionLimitInfo, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = nowDiversionLimitInfo.trialDaysRemaining;
        }
        if ((i & 2) != 0) {
            list = nowDiversionLimitInfo.historyPostedFriends;
        }
        return nowDiversionLimitInfo.copy(num, list);
    }

    public final NowDiversionLimitInfo copy(Integer num, List<? extends User> list) {
        return new NowDiversionLimitInfo(num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowDiversionLimitInfo)) {
            return false;
        }
        NowDiversionLimitInfo nowDiversionLimitInfo = (NowDiversionLimitInfo) obj;
        return o.LJ(this.trialDaysRemaining, nowDiversionLimitInfo.trialDaysRemaining) && o.LJ(this.historyPostedFriends, nowDiversionLimitInfo.historyPostedFriends);
    }

    public int hashCode() {
        Integer num = this.trialDaysRemaining;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<User> list = this.historyPostedFriends;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowDiversionLimitInfo(trialDaysRemaining=");
        LIZ.append(this.trialDaysRemaining);
        LIZ.append(", historyPostedFriends=");
        return C1NE.LIZIZ(LIZ, this.historyPostedFriends, ')', LIZ);
    }

    public final List<User> getHistoryPostedFriends() {
        return this.historyPostedFriends;
    }

    public final Integer getTrialDaysRemaining() {
        return this.trialDaysRemaining;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NowDiversionLimitInfo(Integer num, List<? extends User> list) {
        this.trialDaysRemaining = num;
        this.historyPostedFriends = list;
    }

    public /* synthetic */ NowDiversionLimitInfo(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
