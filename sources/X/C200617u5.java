package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7u5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200617u5 implements C33Q {
    public final boolean LJLIL;
    public final C200647u8 LJLILLLLZI;
    public final C43I<Boolean> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final C43I<Boolean> LJLJJL;

    public C200617u5() {
        this(false, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C200617u5)) {
            return false;
        }
        C200617u5 c200617u5 = (C200617u5) obj;
        return this.LJLIL == c200617u5.LJLIL && o.LJ(this.LJLILLLLZI, c200617u5.LJLILLLLZI) && o.LJ(this.LJLJI, c200617u5.LJLJI) && o.LJ(this.LJLJJI, c200617u5.LJLJJI) && o.LJ(this.LJLJJL, c200617u5.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C200647u8 c200647u8 = this.LJLILLLLZI;
        int hashCode = (i + (c200647u8 == null ? 0 : c200647u8.hashCode())) * 31;
        C43I<Boolean> c43i = this.LJLJI;
        int hashCode2 = (hashCode + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<Boolean> c43i2 = this.LJLJJI;
        int hashCode3 = (hashCode2 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<Boolean> c43i3 = this.LJLJJL;
        return hashCode3 + (c43i3 != null ? c43i3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoDiggState(showFestival=");
        LIZ.append(this.LJLIL);
        LIZ.append(", displayState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showClickAnim=");
        LIZ.append(this.LJLJI);
        LIZ.append(", resizeOver=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", clickEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public /* synthetic */ C200617u5(boolean z, C200647u8 c200647u8, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : c200647u8, null, null, null);
    }

    public C200617u5(boolean z, C200647u8 c200647u8, C43I<Boolean> c43i, C43I<Boolean> c43i2, C43I<Boolean> c43i3) {
        this.LJLIL = z;
        this.LJLILLLLZI = c200647u8;
        this.LJLJI = c43i;
        this.LJLJJI = c43i2;
        this.LJLJJL = c43i3;
    }

    public static C200617u5 LIZ(C200617u5 c200617u5, C200647u8 c200647u8, C43I c43i, C43I c43i2, C43I c43i3, int i) {
        boolean z;
        C43I c43i4 = c43i3;
        C43I c43i5 = c43i2;
        C200647u8 c200647u82 = c200647u8;
        C43I c43i6 = c43i;
        if ((i & 1) != 0) {
            z = c200617u5.LJLIL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            c200647u82 = c200617u5.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i6 = c200617u5.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i5 = c200617u5.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i4 = c200617u5.LJLJJL;
        }
        c200617u5.getClass();
        return new C200617u5(z, c200647u82, c43i6, c43i5, c43i4);
    }
}
