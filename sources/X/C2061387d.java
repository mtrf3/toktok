package X;

import kotlin.jvm.internal.o;

/* renamed from: X.87d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2061387d implements C33Q {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    public C2061387d() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2061387d)) {
            return false;
        }
        C2061387d c2061387d = (C2061387d) obj;
        return o.LJ(this.LJLIL, c2061387d.LJLIL) && this.LJLILLLLZI == c2061387d.LJLILLLLZI && this.LJLJI == c2061387d.LJLJI;
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
        return ((hashCode + i) * 31) + (this.LJLJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PostModeFavoriteState(favoriteCountText=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isFavoriteCountVisible=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isSelected=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C2061387d(int i) {
        this("", true, false);
    }

    public C2061387d(String str, boolean z, boolean z2) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    public static C2061387d LIZ(C2061387d c2061387d, String str, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            str = c2061387d.LJLIL;
        }
        if ((i & 2) != 0) {
            z2 = c2061387d.LJLILLLLZI;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z = c2061387d.LJLJI;
        }
        c2061387d.getClass();
        return new C2061387d(str, z2, z);
    }
}
