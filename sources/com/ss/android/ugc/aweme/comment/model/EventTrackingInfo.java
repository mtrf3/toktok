package com.ss.android.ugc.aweme.comment.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EventTrackingInfo {

    @InterfaceC65349Pkn("inserted_maf_post_id")
    public final List<String> insertMafPostId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventTrackingInfo copy$default(EventTrackingInfo eventTrackingInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eventTrackingInfo.insertMafPostId;
        }
        return eventTrackingInfo.copy(list);
    }

    public final EventTrackingInfo copy(List<String> list) {
        return new EventTrackingInfo(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventTrackingInfo) && o.LJ(this.insertMafPostId, ((EventTrackingInfo) obj).insertMafPostId);
    }

    public int hashCode() {
        List<String> list = this.insertMafPostId;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventTrackingInfo(insertMafPostId=");
        return C1NE.LIZIZ(LIZ, this.insertMafPostId, ')', LIZ);
    }

    public EventTrackingInfo(List<String> list) {
        this.insertMafPostId = list;
    }
}
