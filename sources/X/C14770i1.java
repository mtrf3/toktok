package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0i1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14770i1 {
    public final C08440Uu LIZ;
    public final InterfaceC14950iJ LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransformedText(text=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", offsetMapping=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14770i1)) {
            return false;
        }
        C14770i1 c14770i1 = (C14770i1) obj;
        if (o.LJ(this.LIZ, c14770i1.LIZ) && o.LJ(this.LIZIZ, c14770i1.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C14770i1(C08440Uu text, InterfaceC14950iJ offsetMapping) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(offsetMapping, "offsetMapping");
        this.LIZ = text;
        this.LIZIZ = offsetMapping;
    }
}
