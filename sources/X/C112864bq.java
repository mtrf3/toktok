package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112864bq implements InterfaceC113014c5 {
    public final String LIZ;
    public final InterfaceC112844bo LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112864bq)) {
            return false;
        }
        C112864bq c112864bq = (C112864bq) obj;
        return o.LJ(this.LIZ, c112864bq.LIZ) && o.LJ(this.LIZIZ, c112864bq.LIZIZ) && o.LJ(this.LIZJ, c112864bq.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ErrorState(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", icon=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", action=");
        return C06540Nm.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C112864bq(String text, InterfaceC112844bo interfaceC112844bo, InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(action, "action");
        this.LIZ = text;
        this.LIZIZ = interfaceC112844bo;
        this.LIZJ = action;
    }
}
