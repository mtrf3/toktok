package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZsQ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91302ZsQ {
    public final EnumC91312Zsa LIZ;
    public final InterfaceC91296ZsK LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91302ZsQ)) {
            return false;
        }
        C91302ZsQ c91302ZsQ = (C91302ZsQ) obj;
        return this.LIZ == c91302ZsQ.LIZ && o.LJ(this.LIZIZ, c91302ZsQ.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC91296ZsK interfaceC91296ZsK = this.LIZIZ;
        return hashCode + (interfaceC91296ZsK == null ? 0 : interfaceC91296ZsK.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StartPlayResp(result=");
        LIZ.append(this.LIZ);
        LIZ.append(", playable=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91302ZsQ(EnumC91312Zsa result, InterfaceC91296ZsK interfaceC91296ZsK) {
        o.LJIIIZ(result, "result");
        this.LIZ = result;
        this.LIZIZ = interfaceC91296ZsK;
    }
}
