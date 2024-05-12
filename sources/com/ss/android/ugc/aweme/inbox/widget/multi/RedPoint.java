package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.InterfaceC65349Pkn;
import X.MN2;
import X.MN3;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RedPoint {

    @InterfaceC65349Pkn("type")
    public final MN2 type;

    @InterfaceC65349Pkn("unread_count")
    public final int unreadCount;

    public final int hashCode() {
        if (MN3.LIZ[this.type.ordinal()] == 1) {
            return this.type.hashCode() + this.unreadCount;
        }
        return this.type.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RedPoint(type=");
        LIZ.append(this.type);
        LIZ.append(", unreadCount=");
        return b0.LIZJ(LIZ, this.unreadCount, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RedPoint)) {
            return false;
        }
        MN2 mn2 = this.type;
        RedPoint redPoint = (RedPoint) obj;
        if (mn2 != redPoint.type) {
            return false;
        }
        if (mn2 != MN2.COUNT || this.unreadCount == redPoint.unreadCount) {
            return true;
        }
        return false;
    }

    public RedPoint(MN2 type, int i) {
        o.LJIIIZ(type, "type");
        this.type = type;
        this.unreadCount = i;
    }

    public /* synthetic */ RedPoint(MN2 mn2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(mn2, (i2 & 2) != 0 ? 0 : i);
    }
}
