package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8cZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215238cZ implements C33Q {
    public String LJLIL;
    public String LJLILLLLZI;
    public OSZ<Boolean, String> LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C215238cZ)) {
            return false;
        }
        C215238cZ c215238cZ = (C215238cZ) obj;
        return o.LJ(this.LJLIL, c215238cZ.LJLIL) && o.LJ(this.LJLILLLLZI, c215238cZ.LJLILLLLZI) && o.LJ(this.LJLJI, c215238cZ.LJLJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        return this.LJLJI.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuideCardFilterState(commonStoryRead=");
        LIZ.append(this.LJLIL);
        LIZ.append(", cardSelected=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", cardUnselected=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C215238cZ(String str, String str2, OSZ<Boolean, String> osz) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = osz;
    }

    public static C215238cZ LIZ(C215238cZ c215238cZ, String str, String str2, OSZ cardUnselected, int i) {
        if ((i & 1) != 0) {
            str = c215238cZ.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c215238cZ.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            cardUnselected = c215238cZ.LJLJI;
        }
        c215238cZ.getClass();
        o.LJIIIZ(cardUnselected, "cardUnselected");
        return new C215238cZ(str, str2, cardUnselected);
    }
}
