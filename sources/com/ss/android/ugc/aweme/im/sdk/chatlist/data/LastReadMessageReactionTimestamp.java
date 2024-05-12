package com.ss.android.ugc.aweme.im.sdk.chatlist.data;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LastReadMessageReactionTimestamp {

    @InterfaceC65349Pkn("last_read_time")
    public final Long lastReadTime;

    /* JADX WARN: Multi-variable type inference failed */
    public LastReadMessageReactionTimestamp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LastReadMessageReactionTimestamp) && o.LJ(this.lastReadTime, ((LastReadMessageReactionTimestamp) obj).lastReadTime);
    }

    public final int hashCode() {
        Long l = this.lastReadTime;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LastReadMessageReactionTimestamp(lastReadTime=");
        return JBR.LJ(LIZ, this.lastReadTime, ')', LIZ);
    }

    public LastReadMessageReactionTimestamp(Long l) {
        this.lastReadTime = l;
    }

    public /* synthetic */ LastReadMessageReactionTimestamp(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }
}
