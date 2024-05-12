package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mbz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57159Mbz {
    public final C43I<List<EnumC58046MqI>> LIZ;
    public final C43I<C76800UCe> LIZIZ;
    public final C43I<Integer> LIZJ;
    public final boolean LIZLLL;

    public C57159Mbz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57159Mbz)) {
            return false;
        }
        C57159Mbz c57159Mbz = (C57159Mbz) obj;
        return o.LJ(this.LIZ, c57159Mbz.LIZ) && o.LJ(this.LIZIZ, c57159Mbz.LIZIZ) && o.LJ(this.LIZJ, c57159Mbz.LIZJ) && this.LIZLLL == c57159Mbz.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C43I<List<EnumC58046MqI>> c43i = this.LIZ;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<C76800UCe> c43i2 = this.LIZIZ;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<Integer> c43i3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (c43i3 != null ? c43i3.hashCode() : 0)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EmptyPageUIState(refreshUserCardEvent=");
        LIZ.append(this.LIZ);
        LIZ.append(", reloadUserCardEvent=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", toastMessage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isLoading=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C57159Mbz(int i) {
        this(null, null, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57159Mbz(C43I<? extends List<? extends EnumC58046MqI>> c43i, C43I<C76800UCe> c43i2, C43I<Integer> c43i3, boolean z) {
        this.LIZ = c43i;
        this.LIZIZ = c43i2;
        this.LIZJ = c43i3;
        this.LIZLLL = z;
    }

    public static C57159Mbz LIZ(C57159Mbz c57159Mbz, C43I c43i, C43I c43i2, C43I c43i3, boolean z, int i) {
        if ((i & 1) != 0) {
            c43i = c57159Mbz.LIZ;
        }
        if ((i & 2) != 0) {
            c43i2 = c57159Mbz.LIZIZ;
        }
        if ((i & 4) != 0) {
            c43i3 = c57159Mbz.LIZJ;
        }
        if ((i & 8) != 0) {
            z = c57159Mbz.LIZLLL;
        }
        c57159Mbz.getClass();
        return new C57159Mbz(c43i, c43i2, c43i3, z);
    }
}
