package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9RM, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9RM implements InterfaceC198557ql {
    public final String LIZ;
    public final C43I<Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9RM)) {
            return false;
        }
        C9RM c9rm = (C9RM) obj;
        return o.LJ(this.LIZ, c9rm.LIZ) && o.LJ(this.LIZIZ, c9rm.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return this.LIZIZ.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchBarData(keyword=");
        LIZ.append(this.LIZ);
        LIZ.append(", clearEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C9RM(C43I c43i, String str) {
        this.LIZ = str;
        this.LIZIZ = c43i;
    }
}
