package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareReward implements Serializable {

    @InterfaceC65349Pkn("highest_profit")
    public final String highestProfit;

    @InterfaceC65349Pkn("reward_consume_percent")
    public final Integer rewardConsumePercent;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareReward() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareReward copy$default(ShareReward shareReward, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shareReward.rewardConsumePercent;
        }
        if ((i & 2) != 0) {
            str = shareReward.highestProfit;
        }
        return shareReward.copy(num, str);
    }

    public final ShareReward copy(Integer num, String str) {
        return new ShareReward(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareReward)) {
            return false;
        }
        ShareReward shareReward = (ShareReward) obj;
        return o.LJ(this.rewardConsumePercent, shareReward.rewardConsumePercent) && o.LJ(this.highestProfit, shareReward.highestProfit);
    }

    public int hashCode() {
        Integer num = this.rewardConsumePercent;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.highestProfit;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareReward(rewardConsumePercent=");
        LIZ.append(this.rewardConsumePercent);
        LIZ.append(", highestProfit=");
        return q.LIZIZ(LIZ, this.highestProfit, ')', LIZ);
    }

    public final String getHighestProfit() {
        return this.highestProfit;
    }

    public final Integer getRewardConsumePercent() {
        return this.rewardConsumePercent;
    }

    public ShareReward(Integer num, String str) {
        this.rewardConsumePercent = num;
        this.highestProfit = str;
    }

    public /* synthetic */ ShareReward(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
