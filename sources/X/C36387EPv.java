package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.EPv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36387EPv extends AbstractC36384EPs {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36387EPv) && o.LJ(this.LIZ, ((C36387EPv) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftSaved(draftId=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C36387EPv(String draftId) {
        o.LJIIIZ(draftId, "draftId");
        this.LIZ = draftId;
    }
}
