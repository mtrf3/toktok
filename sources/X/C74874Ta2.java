package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ta2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74874Ta2 {
    public final CJ2 LIZ;
    public final CJ2 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74874Ta2)) {
            return false;
        }
        C74874Ta2 c74874Ta2 = (C74874Ta2) obj;
        return o.LJ(this.LIZ, c74874Ta2.LIZ) && o.LJ(this.LIZIZ, c74874Ta2.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OldUserItemsDataGuestSide(oldOnlineItems=");
        LIZ.append(this.LIZ);
        LIZ.append(", oldWaitingItems=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C74874Ta2(CJ2 oldOnlineItems, CJ2 oldWaitingItems) {
        o.LJIIIZ(oldOnlineItems, "oldOnlineItems");
        o.LJIIIZ(oldWaitingItems, "oldWaitingItems");
        this.LIZ = oldOnlineItems;
        this.LIZIZ = oldWaitingItems;
    }
}
