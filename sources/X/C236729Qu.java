package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9Qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C236729Qu implements InterfaceC198557ql {
    public final String LIZ;
    public final C43I<Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C236729Qu)) {
            return false;
        }
        C236729Qu c236729Qu = (C236729Qu) obj;
        return o.LJ(this.LIZ, c236729Qu.LIZ) && o.LJ(this.LIZIZ, c236729Qu.LIZIZ);
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

    public C236729Qu(C43I c43i, String str) {
        this.LIZ = str;
        this.LIZIZ = c43i;
    }
}
