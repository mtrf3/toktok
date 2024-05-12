package com.ss.android.ugc.aweme.feed.prompt.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class InteractionImpression implements Serializable {

    @InterfaceC65349Pkn("actions")
    public List<Integer> actions;

    @InterfaceC65349Pkn("gid")
    public String gid;

    @InterfaceC65349Pkn("logid")
    public String logId;

    @InterfaceC65349Pkn("timestamp")
    public Long timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public InteractionImpression() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InteractionImpression copy$default(InteractionImpression interactionImpression, String str, List list, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interactionImpression.gid;
        }
        if ((i & 2) != 0) {
            list = interactionImpression.actions;
        }
        if ((i & 4) != 0) {
            l = interactionImpression.timestamp;
        }
        if ((i & 8) != 0) {
            str2 = interactionImpression.logId;
        }
        return interactionImpression.copy(str, list, l, str2);
    }

    public final InteractionImpression copy(String str, List<Integer> list, Long l, String str2) {
        return new InteractionImpression(str, list, l, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionImpression)) {
            return false;
        }
        InteractionImpression interactionImpression = (InteractionImpression) obj;
        return o.LJ(this.gid, interactionImpression.gid) && o.LJ(this.actions, interactionImpression.actions) && o.LJ(this.timestamp, interactionImpression.timestamp) && o.LJ(this.logId, interactionImpression.logId);
    }

    public int hashCode() {
        String str = this.gid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.actions;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.timestamp;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.logId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractionImpression(gid=");
        LIZ.append(this.gid);
        LIZ.append(", actions=");
        LIZ.append(this.actions);
        LIZ.append(", timestamp=");
        LIZ.append(this.timestamp);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final List<Integer> getActions() {
        return this.actions;
    }

    public final String getGid() {
        return this.gid;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final void setActions(List<Integer> list) {
        this.actions = list;
    }

    public final void setGid(String str) {
        this.gid = str;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public InteractionImpression(String str, List<Integer> list, Long l, String str2) {
        this.gid = str;
        this.actions = list;
        this.timestamp = l;
        this.logId = str2;
    }

    public /* synthetic */ InteractionImpression(String str, List list, Long l, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2);
    }
}
