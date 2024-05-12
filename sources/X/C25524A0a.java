package X;

import kotlin.jvm.internal.o;

/* renamed from: X.A0a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25524A0a implements InterfaceC80653En, InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Boolean LJLJJI;
    public final boolean LJLJJL;

    public C25524A0a() {
        this(Boolean.FALSE, null, null, "", true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25524A0a)) {
            return false;
        }
        C25524A0a c25524A0a = (C25524A0a) obj;
        return o.LJ(this.LJLIL, c25524A0a.LJLIL) && o.LJ(this.LJLILLLLZI, c25524A0a.LJLILLLLZI) && o.LJ(this.LJLJI, c25524A0a.LJLJI) && o.LJ(this.LJLJJI, c25524A0a.LJLJJI) && this.LJLJJL == c25524A0a.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LJLILLLLZI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLJI, (i2 + hashCode2) * 31, 31);
        Boolean bool = this.LJLJJI;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i3 = (LJ + i) * 31;
        boolean z = this.LJLJJL;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return i3 + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ManageSeriesHierarchyData(collectionId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", entryPoint=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isNewCollection=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", shouldShowBackButton=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public C25524A0a(Boolean bool, String str, String str2, String entryPoint, boolean z) {
        o.LJIIIZ(entryPoint, "entryPoint");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = entryPoint;
        this.LJLJJI = bool;
        this.LJLJJL = z;
        C221108m2.LIZIZ(C25526A0c.LJLIL);
    }
}
