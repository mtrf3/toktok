package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PermitResult {
    public final OnLineMicInfo applicantFixedMicInfo;
    public final Map<String, byte[]> extraItems;
    public final String logId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PermitResult copy$default(PermitResult permitResult, OnLineMicInfo onLineMicInfo, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            onLineMicInfo = permitResult.applicantFixedMicInfo;
        }
        if ((i & 2) != 0) {
            map = permitResult.extraItems;
        }
        if ((i & 4) != 0) {
            str = permitResult.logId;
        }
        return permitResult.copy(onLineMicInfo, map, str);
    }

    public final OnLineMicInfo component1() {
        return this.applicantFixedMicInfo;
    }

    public final String component3() {
        return this.logId;
    }

    public final PermitResult copy(OnLineMicInfo onLineMicInfo, Map<String, byte[]> map, String logId) {
        o.LJIIIZ(logId, "logId");
        return new PermitResult(onLineMicInfo, map, logId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermitResult)) {
            return false;
        }
        PermitResult permitResult = (PermitResult) obj;
        return o.LJ(this.applicantFixedMicInfo, permitResult.applicantFixedMicInfo) && o.LJ(this.extraItems, permitResult.extraItems) && o.LJ(this.logId, permitResult.logId);
    }

    public int hashCode() {
        OnLineMicInfo onLineMicInfo = this.applicantFixedMicInfo;
        int hashCode = (onLineMicInfo == null ? 0 : onLineMicInfo.hashCode()) * 31;
        Map<String, byte[]> map = this.extraItems;
        return this.logId.hashCode() + ((hashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermitResult(applicantFixedMicInfo=");
        LIZ.append(this.applicantFixedMicInfo);
        LIZ.append(", extraItems=");
        LIZ.append(this.extraItems);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final Map<String, byte[]> getExtraItems() {
        return this.extraItems;
    }

    public PermitResult(OnLineMicInfo onLineMicInfo, Map<String, byte[]> map, String logId) {
        o.LJIIIZ(logId, "logId");
        this.applicantFixedMicInfo = onLineMicInfo;
        this.extraItems = map;
        this.logId = logId;
    }

    public /* synthetic */ PermitResult(OnLineMicInfo onLineMicInfo, Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onLineMicInfo, map, (i & 4) != 0 ? "" : str);
    }
}
