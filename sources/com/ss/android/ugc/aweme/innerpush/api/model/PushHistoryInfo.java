package com.ss.android.ugc.aweme.innerpush.api.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PushHistoryInfo implements Serializable {

    @InterfaceC65349Pkn("timestamp")
    public Long receiveTime;

    @InterfaceC65349Pkn("in_app_push_type")
    public int type;

    @InterfaceC65349Pkn("from_user_id")
    public long uid;

    /* JADX WARN: Multi-variable type inference failed */
    public PushHistoryInfo() {
        this(null, 0L, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PushHistoryInfo copy$default(PushHistoryInfo pushHistoryInfo, Long l, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = pushHistoryInfo.receiveTime;
        }
        if ((i2 & 2) != 0) {
            j = pushHistoryInfo.uid;
        }
        if ((i2 & 4) != 0) {
            i = pushHistoryInfo.type;
        }
        return pushHistoryInfo.copy(l, j, i);
    }

    public final PushHistoryInfo copy(Long l, long j, int i) {
        return new PushHistoryInfo(l, j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushHistoryInfo)) {
            return false;
        }
        PushHistoryInfo pushHistoryInfo = (PushHistoryInfo) obj;
        return o.LJ(this.receiveTime, pushHistoryInfo.receiveTime) && this.uid == pushHistoryInfo.uid && this.type == pushHistoryInfo.type;
    }

    public int hashCode() {
        int hashCode;
        Long l = this.receiveTime;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return JBR.LIZJ(this.uid, hashCode * 31, 31) + this.type;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushHistoryInfo(receiveTime=");
        LIZ.append(this.receiveTime);
        LIZ.append(", uid=");
        LIZ.append(this.uid);
        LIZ.append(", type=");
        return b0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public final Long getReceiveTime() {
        return this.receiveTime;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setReceiveTime(Long l) {
        this.receiveTime = l;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public PushHistoryInfo(Long l, long j, int i) {
        this.receiveTime = l;
        this.uid = j;
        this.type = i;
    }

    public /* synthetic */ PushHistoryInfo(Long l, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : l, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i);
    }
}
