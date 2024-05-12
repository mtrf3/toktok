package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.4FZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FZ {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4FZ)) {
            return false;
        }
        C4FZ c4fz = (C4FZ) obj;
        return o.LJ(this.LIZ, c4fz.LIZ) && o.LJ(this.LIZIZ, c4fz.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractionEventTrackData(interactionType=");
        LIZ.append(this.LIZ);
        LIZ.append(", interactionName=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C4FZ(String interactionType, String interactionName) {
        o.LJIIIZ(interactionType, "interactionType");
        o.LJIIIZ(interactionName, "interactionName");
        this.LIZ = interactionType;
        this.LIZIZ = interactionName;
    }
}
