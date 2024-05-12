package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MPt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56769MPt<DATA> {
    public final InterfaceC56756MPg<? extends MRU, DATA> LIZ;
    public final DATA LIZIZ;
    public final Throwable LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56769MPt)) {
            return false;
        }
        C56769MPt c56769MPt = (C56769MPt) obj;
        return o.LJ(this.LIZ, c56769MPt.LIZ) && o.LJ(this.LIZIZ, c56769MPt.LIZIZ) && o.LJ(this.LIZJ, c56769MPt.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        DATA data = this.LIZIZ;
        int hashCode2 = (hashCode + (data == null ? 0 : data.hashCode())) * 31;
        Throwable th = this.LIZJ;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stream(source=");
        LIZ.append(this.LIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", error=");
        return C169696lJ.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public C56769MPt(InterfaceC56756MPg<? extends MRU, DATA> source, DATA data, Throwable th) {
        o.LJIIIZ(source, "source");
        this.LIZ = source;
        this.LIZIZ = data;
        this.LIZJ = th;
    }
}
