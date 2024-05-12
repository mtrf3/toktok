package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167576ht {
    public final C150145us LIZ;
    public final boolean LIZIZ;

    public C167576ht() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C167576ht)) {
            return false;
        }
        C167576ht c167576ht = (C167576ht) obj;
        return o.LJ(this.LIZ, c167576ht.LIZ) && this.LIZIZ == c167576ht.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C150145us c150145us = this.LIZ;
        int hashCode = (c150145us == null ? 0 : c150145us.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VENonTabSceneStates(enableModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", isPanelEnableState=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C167576ht(int i) {
        this(null, true);
    }

    public C167576ht(C150145us c150145us, boolean z) {
        this.LIZ = c150145us;
        this.LIZIZ = z;
    }
}
