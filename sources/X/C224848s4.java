package X;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.o;

/* renamed from: X.8s4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224848s4 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final SpannableStringBuilder LJ;
    public final String LJFF;
    public final Boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C224848s4)) {
            return false;
        }
        C224848s4 c224848s4 = (C224848s4) obj;
        return o.LJ(this.LIZ, c224848s4.LIZ) && o.LJ(this.LIZIZ, c224848s4.LIZIZ) && this.LIZJ == c224848s4.LIZJ && this.LIZLLL == c224848s4.LIZLLL && o.LJ(this.LJ, c224848s4.LJ) && o.LJ(this.LJFF, c224848s4.LJFF) && o.LJ(this.LJI, c224848s4.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJ.hashCode() + ((((C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31)) * 31;
        String str = this.LJFF;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Boolean bool = this.LJI;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplaceDetail(raw=");
        LIZ.append(this.LIZ);
        LIZ.append(", text=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", start=");
        LIZ.append(this.LIZJ);
        LIZ.append(", end=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", span=");
        LIZ.append((Object) this.LJ);
        LIZ.append(", link=");
        LIZ.append(this.LJFF);
        LIZ.append(", isThirdPartyLink=");
        return C78920UyC.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C224848s4(String raw, String str, int i, int i2, SpannableStringBuilder spannableStringBuilder) {
        o.LJIIIZ(raw, "raw");
        this.LIZ = raw;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = spannableStringBuilder;
        this.LJFF = null;
        this.LJI = null;
    }
}
