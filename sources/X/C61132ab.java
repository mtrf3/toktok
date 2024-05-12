package X;

import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61132ab {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final String LJI;

    public C61132ab() {
        this(null, null, null, C61878OQg.INSTANCE, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61132ab)) {
            return false;
        }
        C61132ab c61132ab = (C61132ab) obj;
        return o.LJ(this.LIZ, c61132ab.LIZ) && o.LJ(this.LIZIZ, c61132ab.LIZIZ) && o.LJ(this.LIZJ, c61132ab.LIZJ) && o.LJ(this.LIZLLL, c61132ab.LIZLLL) && o.LJ(this.LJ, c61132ab.LJ) && o.LJ(this.LJFF, c61132ab.LJFF) && o.LJ(this.LJI, c61132ab.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        List<String> list = this.LIZIZ;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LIZJ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZLLL, (i3 + hashCode3) * 31, 31);
        String str3 = this.LJ;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (LIZIZ + hashCode4) * 31;
        Integer num = this.LJFF;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str4 = this.LJI;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectZipResult(sdkVersion=");
        LIZ.append(this.LIZ);
        LIZ.append(", features=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", effectType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", requirements=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", modelNames=");
        LIZ.append(this.LJ);
        LIZ.append(", openGlEsVersion=");
        LIZ.append(this.LJFF);
        LIZ.append(", sdkExtra=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C61132ab(String str, List<String> list, String str2, List<String> requirements, String str3, Integer num, String str4) {
        o.LJIIIZ(requirements, "requirements");
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = requirements;
        this.LJ = str3;
        this.LJFF = num;
        this.LJI = str4;
    }
}
