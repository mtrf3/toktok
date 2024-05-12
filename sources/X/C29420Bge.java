package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Bge, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29420Bge {
    public final C77446UaQ LIZ;
    public boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29420Bge)) {
            return false;
        }
        C29420Bge c29420Bge = (C29420Bge) obj;
        return o.LJ(this.LIZ, c29420Bge.LIZ) && this.LIZIZ == c29420Bge.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConsumableLiveGlobalChargeEvent(event=");
        LIZ.append(this.LIZ);
        LIZ.append(", isConsumed=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C29420Bge(C77446UaQ event) {
        o.LJIIIZ(event, "event");
        this.LIZ = event;
        this.LIZIZ = false;
    }
}
