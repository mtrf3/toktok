package X;

import defpackage.q;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.AUg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26310AUg extends AbstractC238349Xa {
    public final String LIZIZ;
    public final String LIZJ;
    public final EnumC58046MqI LIZLLL;
    public final boolean LJ;
    public final EnumC57577Mij LJFF;
    public final String LJI;
    public final String LJII;
    public final java.util.Map<String, String> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26310AUg)) {
            return false;
        }
        C26310AUg c26310AUg = (C26310AUg) obj;
        return o.LJ(this.LIZIZ, c26310AUg.LIZIZ) && o.LJ(this.LIZJ, c26310AUg.LIZJ) && this.LIZLLL == c26310AUg.LIZLLL && this.LJ == c26310AUg.LJ && this.LJFF == c26310AUg.LJFF && o.LJ(this.LJI, c26310AUg.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.LIZIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZJ, hashCode * 31, 31);
        EnumC58046MqI enumC58046MqI = this.LIZLLL;
        if (enumC58046MqI == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = enumC58046MqI.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        boolean z = this.LJ;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        EnumC57577Mij enumC57577Mij = this.LJFF;
        if (enumC57577Mij == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = enumC57577Mij.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str2 = this.LJI;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReasonMonitorTracker(recType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZJ);
        LIZ.append(", platform=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", showSuccess=");
        LIZ.append(this.LJ);
        LIZ.append(", failReason=");
        LIZ.append(this.LJFF);
        LIZ.append(", position=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJIIIIZZ;
    }

    public static C26310AUg LJ(C26310AUg c26310AUg, EnumC58046MqI enumC58046MqI, boolean z, EnumC57577Mij enumC57577Mij, int i) {
        String str;
        String type;
        EnumC57577Mij enumC57577Mij2 = enumC57577Mij;
        EnumC58046MqI enumC58046MqI2 = enumC58046MqI;
        boolean z2 = z;
        String str2 = null;
        if ((i & 1) != 0) {
            str = c26310AUg.LIZIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            type = c26310AUg.LIZJ;
        } else {
            type = null;
        }
        if ((i & 4) != 0) {
            enumC58046MqI2 = c26310AUg.LIZLLL;
        }
        if ((i & 8) != 0) {
            z2 = c26310AUg.LJ;
        }
        if ((i & 16) != 0) {
            enumC57577Mij2 = c26310AUg.LJFF;
        }
        if ((i & 32) != 0) {
            str2 = c26310AUg.LJI;
        }
        o.LJIIIZ(type, "type");
        return new C26310AUg(str, type, enumC58046MqI2, z2, enumC57577Mij2, str2);
    }

    public C26310AUg(String str, String str2, EnumC58046MqI enumC58046MqI, boolean z, EnumC57577Mij enumC57577Mij, String str3) {
        String str4;
        String name;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = enumC58046MqI;
        this.LJ = z;
        this.LJFF = enumC57577Mij;
        this.LJI = str3;
        this.LJII = "external_reason_monitor";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("rec_type", str);
        c188727au.LJIIIZ("type", str2);
        c188727au.LJIIIZ("status", AbstractC238349Xa.LIZJ(z));
        if (enumC58046MqI != null && (name = enumC58046MqI.name()) != null) {
            Locale locale = Locale.ENGLISH;
            str4 = C141415gn.LIZIZ(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("platform", str4);
        c188727au.LJFF(enumC57577Mij != null ? Integer.valueOf(enumC57577Mij.getValue()) : null, "reason");
        if (str3 != null) {
            c188727au.LJI("position", str3);
        }
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…     }\n        .builder()");
        this.LJIIIIZZ = map;
    }

    public /* synthetic */ C26310AUg(String str, String str2, EnumC58046MqI enumC58046MqI, boolean z, EnumC57577Mij enumC57577Mij, int i) {
        this(str, str2, (i & 4) != 0 ? null : enumC58046MqI, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : enumC57577Mij, (String) null);
    }
}
