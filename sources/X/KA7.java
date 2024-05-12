package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KA7 {
    public final C50948Jz6 LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KA7)) {
            return false;
        }
        KA7 ka7 = (KA7) obj;
        return o.LJ(this.LIZ, ka7.LIZ) && o.LJ(this.LIZIZ, ka7.LIZIZ) && o.LJ(this.LIZJ, ka7.LIZJ) && o.LJ(this.LIZLLL, ka7.LIZLLL) && o.LJ(this.LJ, ka7.LJ) && this.LJFF == ka7.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C50948Jz6 c50948Jz6 = this.LIZ;
        int hashCode = (c50948Jz6 == null ? 0 : c50948Jz6.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LJ;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECSuggestImmutableData(enterParam=");
        LIZ.append(this.LIZ);
        LIZ.append(", srcMaterialId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isFromComment=");
        LIZ.append(this.LIZJ);
        LIZ.append(", feedSearchBarFlag=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", groupId=");
        LIZ.append(this.LJ);
        LIZ.append(", needLogEnterBlankPage=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public /* synthetic */ KA7(C50948Jz6 c50948Jz6, String str, String str2, Integer num, String str3) {
        this(c50948Jz6, str, str2, num, str3, true);
    }

    public KA7(C50948Jz6 c50948Jz6, String str, String str2, Integer num, String str3, boolean z) {
        this.LIZ = c50948Jz6;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num;
        this.LJ = str3;
        this.LJFF = z;
    }
}
