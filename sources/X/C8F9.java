package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8F9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8F9 implements C33Q {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Integer LJLJI;
    public final Integer LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;

    public C8F9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8F9)) {
            return false;
        }
        C8F9 c8f9 = (C8F9) obj;
        return this.LJLIL == c8f9.LJLIL && this.LJLILLLLZI == c8f9.LJLILLLLZI && o.LJ(this.LJLJI, c8f9.LJLJI) && o.LJ(this.LJLJJI, c8f9.LJLJJI) && o.LJ(this.LJLJJL, c8f9.LJLJJL) && this.LJLJJLL == c8f9.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = ((this.LJLIL * 31) + this.LJLILLLLZI) * 31;
        Integer num = this.LJLJI;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJLJJI;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LJLJJL;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.LJLJJLL;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotedTagState(promotedTagVisibility=");
        LIZ.append(this.LJLIL);
        LIZ.append(", transPromotedTagView=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", bgColor=");
        LIZ.append(this.LJLJI);
        LIZ.append(", textColor=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", text=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", useTransparent=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public /* synthetic */ C8F9(int i) {
        this(8, 8, null, null, null, false);
    }

    public C8F9(int i, int i2, Integer num, Integer num2, String str, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = num;
        this.LJLJJI = num2;
        this.LJLJJL = str;
        this.LJLJJLL = z;
    }
}
