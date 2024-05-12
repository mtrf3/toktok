package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7kP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194617kP extends AbstractC194637kR {
    public final String LIZ;
    public final EnumC197497p3 LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C194617kP)) {
            return false;
        }
        C194617kP c194617kP = (C194617kP) obj;
        return o.LJ(this.LIZ, c194617kP.LIZ) && this.LIZIZ == c194617kP.LIZIZ && this.LIZJ == c194617kP.LIZJ;
    }

    public final int hashCode() {
        return ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31) + this.LIZJ;
    }

    @Override // X.AbstractC194637kR
    public final boolean LIZ() {
        if (this.LIZJ < 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelfPostUploading - ");
        LIZ.append(this.LIZ);
        LIZ.append(" - ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" - ");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public C194617kP(String publishId, EnumC197497p3 action, int i) {
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(action, "action");
        this.LIZ = publishId;
        this.LIZIZ = action;
        this.LIZJ = i;
    }
}
