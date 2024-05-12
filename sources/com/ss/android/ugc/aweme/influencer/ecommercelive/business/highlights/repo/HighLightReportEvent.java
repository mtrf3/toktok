package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.repo;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class HighLightReportEvent {

    @InterfaceC65349Pkn("user_click_info")
    public final UserClickInfo userClickInfo;

    public static /* synthetic */ HighLightReportEvent copy$default(HighLightReportEvent highLightReportEvent, UserClickInfo userClickInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            userClickInfo = highLightReportEvent.userClickInfo;
        }
        return highLightReportEvent.copy(userClickInfo);
    }

    public final HighLightReportEvent copy(UserClickInfo userClickInfo) {
        return new HighLightReportEvent(userClickInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HighLightReportEvent) && o.LJ(this.userClickInfo, ((HighLightReportEvent) obj).userClickInfo);
    }

    public int hashCode() {
        UserClickInfo userClickInfo = this.userClickInfo;
        if (userClickInfo == null) {
            return 0;
        }
        return userClickInfo.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighLightReportEvent(userClickInfo=");
        LIZ.append(this.userClickInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final UserClickInfo getUserClickInfo() {
        return this.userClickInfo;
    }

    public HighLightReportEvent(UserClickInfo userClickInfo) {
        this.userClickInfo = userClickInfo;
    }
}
