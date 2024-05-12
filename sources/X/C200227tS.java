package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7tS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200227tS implements C33Q {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

    public C200227tS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C200227tS)) {
            return false;
        }
        C200227tS c200227tS = (C200227tS) obj;
        return o.LJ(this.LJLIL, c200227tS.LJLIL) && this.LJLILLLLZI == c200227tS.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PostModeShareState(shareCountText=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isShareCountVisible=");
        return C48339Iy7.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C200227tS(int i) {
        this("", true);
    }

    public C200227tS(String str, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
    }
}
