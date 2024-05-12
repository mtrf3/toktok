package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Dwt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35523Dwt implements InterfaceC35522Dws {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35523Dwt) && o.LJ(this.LIZ, ((C35523Dwt) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FinishedState(url=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C35523Dwt(String str) {
        this.LIZ = str;
    }
}
