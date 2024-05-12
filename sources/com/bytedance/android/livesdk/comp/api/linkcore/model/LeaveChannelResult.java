package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C16880lQ;
import X.C47135Ieh;
import X.C79062V1e;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LeaveChannelResult {
    public final Map<String, byte[]> extraItems;
    public final long feedbackShowReason;
    public final String logId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeaveChannelResult copy$default(LeaveChannelResult leaveChannelResult, Map map, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            map = leaveChannelResult.extraItems;
        }
        if ((i & 2) != 0) {
            str = leaveChannelResult.logId;
        }
        if ((i & 4) != 0) {
            j = leaveChannelResult.feedbackShowReason;
        }
        return leaveChannelResult.copy(map, str, j);
    }

    public final Map<String, byte[]> component1() {
        return this.extraItems;
    }

    public final String component2() {
        return this.logId;
    }

    public final LeaveChannelResult copy(Map<String, byte[]> map, String logId, long j) {
        o.LJIIIZ(logId, "logId");
        return new LeaveChannelResult(map, logId, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveChannelResult)) {
            return false;
        }
        LeaveChannelResult leaveChannelResult = (LeaveChannelResult) obj;
        return o.LJ(this.extraItems, leaveChannelResult.extraItems) && o.LJ(this.logId, leaveChannelResult.logId) && this.feedbackShowReason == leaveChannelResult.feedbackShowReason;
    }

    public int hashCode() {
        int hashCode;
        Map<String, byte[]> map = this.extraItems;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return C16880lQ.LLJIJIL(this.feedbackShowReason) + C79062V1e.LJ(this.logId, hashCode * 31, 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LeaveChannelResult(extraItems=");
        LIZ.append(this.extraItems);
        LIZ.append(", logId=");
        LIZ.append(this.logId);
        LIZ.append(", feedbackShowReason=");
        return C47135Ieh.LIZIZ(LIZ, this.feedbackShowReason, ')', LIZ);
    }

    public final long getFeedbackShowReason() {
        return this.feedbackShowReason;
    }

    public LeaveChannelResult(Map<String, byte[]> map, String logId, long j) {
        o.LJIIIZ(logId, "logId");
        this.extraItems = map;
        this.logId = logId;
        this.feedbackShowReason = j;
    }

    public /* synthetic */ LeaveChannelResult(Map map, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 1L : j);
    }
}
