package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SubscriptionStatusInfo implements Serializable {

    @InterfaceC65349Pkn("is_canceled")
    public final Boolean isCanceled;

    @InterfaceC65349Pkn("standard_info")
    public final StandardInfo standardInfo;

    @InterfaceC65349Pkn("subscription_info")
    public final SubscriptionInfo subscriptionInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionStatusInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SubscriptionStatusInfo copy$default(SubscriptionStatusInfo subscriptionStatusInfo, SubscriptionInfo subscriptionInfo, StandardInfo standardInfo, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionInfo = subscriptionStatusInfo.subscriptionInfo;
        }
        if ((i & 2) != 0) {
            standardInfo = subscriptionStatusInfo.standardInfo;
        }
        if ((i & 4) != 0) {
            bool = subscriptionStatusInfo.isCanceled;
        }
        return subscriptionStatusInfo.copy(subscriptionInfo, standardInfo, bool);
    }

    public final SubscriptionStatusInfo copy(SubscriptionInfo subscriptionInfo, StandardInfo standardInfo, Boolean bool) {
        return new SubscriptionStatusInfo(subscriptionInfo, standardInfo, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionStatusInfo)) {
            return false;
        }
        SubscriptionStatusInfo subscriptionStatusInfo = (SubscriptionStatusInfo) obj;
        return o.LJ(this.subscriptionInfo, subscriptionStatusInfo.subscriptionInfo) && o.LJ(this.standardInfo, subscriptionStatusInfo.standardInfo) && o.LJ(this.isCanceled, subscriptionStatusInfo.isCanceled);
    }

    public int hashCode() {
        SubscriptionInfo subscriptionInfo = this.subscriptionInfo;
        int hashCode = (subscriptionInfo == null ? 0 : subscriptionInfo.hashCode()) * 31;
        StandardInfo standardInfo = this.standardInfo;
        int hashCode2 = (hashCode + (standardInfo == null ? 0 : standardInfo.hashCode())) * 31;
        Boolean bool = this.isCanceled;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscriptionStatusInfo(subscriptionInfo=");
        LIZ.append(this.subscriptionInfo);
        LIZ.append(", standardInfo=");
        LIZ.append(this.standardInfo);
        LIZ.append(", isCanceled=");
        return C78920UyC.LIZIZ(LIZ, this.isCanceled, ')', LIZ);
    }

    public final StandardInfo getStandardInfo() {
        return this.standardInfo;
    }

    public final SubscriptionInfo getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    public final Boolean isCanceled() {
        return this.isCanceled;
    }

    public SubscriptionStatusInfo(SubscriptionInfo subscriptionInfo, StandardInfo standardInfo, Boolean bool) {
        this.subscriptionInfo = subscriptionInfo;
        this.standardInfo = standardInfo;
        this.isCanceled = bool;
    }

    public /* synthetic */ SubscriptionStatusInfo(SubscriptionInfo subscriptionInfo, StandardInfo standardInfo, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : subscriptionInfo, (i & 2) != 0 ? null : standardInfo, (i & 4) != 0 ? Boolean.FALSE : bool);
    }
}
