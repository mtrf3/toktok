package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Arw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27572Arw {
    public final String LIZ;
    public final int LIZIZ;
    public final InterfaceC65784Pro<Object> LIZJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27572Arw)) {
            return false;
        }
        C27572Arw c27572Arw = (C27572Arw) obj;
        return o.LJ(this.LIZ, c27572Arw.LIZ) && this.LIZIZ == c27572Arw.LIZIZ && o.LJ(this.LIZJ, c27572Arw.LIZJ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        InterfaceC65784Pro<Object> interfaceC65784Pro = this.LIZJ;
        return hashCode + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighLightText(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", textColor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", block=");
        return C06540Nm.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C27572Arw(int i, String str) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
