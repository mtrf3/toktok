package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109774Sn implements InterfaceC87283bg {
    public final EnumC97443s4 LJLIL;
    public final AbstractC108304Mw LJLILLLLZI;
    public final boolean LJLJI;

    public C109774Sn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109774Sn)) {
            return false;
        }
        C109774Sn c109774Sn = (C109774Sn) obj;
        return this.LJLIL == c109774Sn.LJLIL && o.LJ(this.LJLILLLLZI, c109774Sn.LJLILLLLZI) && this.LJLJI == c109774Sn.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        AbstractC108304Mw abstractC108304Mw = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (abstractC108304Mw == null ? 0 : abstractC108304Mw.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageRequestConfig(requestType=");
        LIZ.append(this.LJLIL);
        LIZ.append(", model=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", tabLayoutVisible=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C109774Sn(int i) {
        this(EnumC97443s4.ALL, null, false);
    }

    public C109774Sn(EnumC97443s4 requestType, AbstractC108304Mw abstractC108304Mw, boolean z) {
        o.LJIIIZ(requestType, "requestType");
        this.LJLIL = requestType;
        this.LJLILLLLZI = abstractC108304Mw;
        this.LJLJI = z;
    }
}
