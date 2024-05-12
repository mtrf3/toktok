package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203577yr implements C33Q {
    public final C200647u8 LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;

    public C203577yr() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C203577yr)) {
            return false;
        }
        C203577yr c203577yr = (C203577yr) obj;
        return o.LJ(this.LJLIL, c203577yr.LJLIL) && o.LJ(this.LJLILLLLZI, c203577yr.LJLILLLLZI) && o.LJ(this.LJLJI, c203577yr.LJLJI);
    }

    public final int hashCode() {
        C200647u8 c200647u8 = this.LJLIL;
        int hashCode = (c200647u8 == null ? 0 : c200647u8.hashCode()) * 31;
        C43I<Boolean> c43i = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<C76800UCe> c43i2 = this.LJLJI;
        return hashCode2 + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoFavoriteState(displayState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showClickAnim=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showCollectionManageToast=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C203577yr(C200647u8 c200647u8, int i) {
        this((i & 1) != 0 ? null : c200647u8, null, null);
    }

    public C203577yr(C200647u8 c200647u8, C43I<Boolean> c43i, C43I<C76800UCe> c43i2) {
        this.LJLIL = c200647u8;
        this.LJLILLLLZI = c43i;
        this.LJLJI = c43i2;
    }

    public static C203577yr LIZ(C203577yr c203577yr, C200647u8 c200647u8, C43I c43i, C43I c43i2, int i) {
        if ((i & 1) != 0) {
            c200647u8 = c203577yr.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i = c203577yr.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i2 = c203577yr.LJLJI;
        }
        c203577yr.getClass();
        return new C203577yr(c200647u8, c43i, c43i2);
    }
}
