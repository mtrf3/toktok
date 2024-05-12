package X;

import defpackage.q;
import kotlin.jvm.internal.o;
import webcast.api.room.RoomComponentsV2Response;

/* loaded from: classes6.dex */
public final class B5B {
    public final RoomComponentsV2Response LIZ = null;
    public final String LIZIZ = "Group load is not enabled";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B5B)) {
            return false;
        }
        B5B b5b = (B5B) obj;
        return o.LJ(this.LIZ, b5b.LIZ) && o.LJ(this.LIZIZ, b5b.LIZIZ);
    }

    public final int hashCode() {
        RoomComponentsV2Response roomComponentsV2Response = this.LIZ;
        int hashCode = (roomComponentsV2Response == null ? 0 : roomComponentsV2Response.hashCode()) * 31;
        String str = this.LIZIZ;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComponentsV2Info(response=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorInfo=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }
}
