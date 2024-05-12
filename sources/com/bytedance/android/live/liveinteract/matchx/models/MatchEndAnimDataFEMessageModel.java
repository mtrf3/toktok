package com.bytedance.android.live.liveinteract.matchx.models;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MatchEndAnimDataFEMessageModel {

    @InterfaceC65349Pkn("container_id")
    public final String containerId;

    @InterfaceC65349Pkn("data")
    public final EndAnimData data;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("xid")
    public final String xid;

    /* JADX WARN: Multi-variable type inference failed */
    public MatchEndAnimDataFEMessageModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchEndAnimDataFEMessageModel)) {
            return false;
        }
        MatchEndAnimDataFEMessageModel matchEndAnimDataFEMessageModel = (MatchEndAnimDataFEMessageModel) obj;
        return o.LJ(this.data, matchEndAnimDataFEMessageModel.data) && o.LJ(this.type, matchEndAnimDataFEMessageModel.type) && o.LJ(this.xid, matchEndAnimDataFEMessageModel.xid) && o.LJ(this.containerId, matchEndAnimDataFEMessageModel.containerId);
    }

    public final int hashCode() {
        int hashCode;
        EndAnimData endAnimData = this.data;
        if (endAnimData == null) {
            hashCode = 0;
        } else {
            hashCode = endAnimData.hashCode();
        }
        return this.containerId.hashCode() + C79062V1e.LJ(this.xid, C79062V1e.LJ(this.type, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchEndAnimDataFEMessageModel(data=");
        LIZ.append(this.data);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", xid=");
        LIZ.append(this.xid);
        LIZ.append(", containerId=");
        return q.LIZIZ(LIZ, this.containerId, ')', LIZ);
    }

    public MatchEndAnimDataFEMessageModel(EndAnimData endAnimData, String str, String str2, String str3) {
        HH1.LIZ(str, "type", str2, "xid", str3, "containerId");
        this.data = endAnimData;
        this.type = str;
        this.xid = str2;
        this.containerId = str3;
    }

    public /* synthetic */ MatchEndAnimDataFEMessageModel(EndAnimData endAnimData, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : endAnimData, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
