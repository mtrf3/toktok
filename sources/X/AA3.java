package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AA3 extends AbstractC238349Xa {
    public final String LIZIZ;
    public final long LIZJ;
    public final AA5 LIZLLL;
    public final EnumC25783A9z LJ;
    public final Boolean LJFF;
    public final String LJI;
    public final java.util.Map<String, String> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AA3)) {
            return false;
        }
        AA3 aa3 = (AA3) obj;
        return o.LJ(this.LIZIZ, aa3.LIZIZ) && this.LIZJ == aa3.LIZJ && this.LIZLLL == aa3.LIZLLL && this.LJ == aa3.LJ && o.LJ(this.LJFF, aa3.LJFF);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LIZLLL.hashCode() + JBR.LIZJ(this.LIZJ, this.LIZIZ.hashCode() * 31, 31)) * 31;
        EnumC25783A9z enumC25783A9z = this.LJ;
        int i = 0;
        if (enumC25783A9z == null) {
            hashCode = 0;
        } else {
            hashCode = enumC25783A9z.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Boolean bool = this.LJFF;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CloseRecPopupTracker(enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", durationMs=");
        LIZ.append(this.LIZJ);
        LIZ.append(", clickMethod=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", method=");
        LIZ.append(this.LJ);
        LIZ.append(", isNegativeFeedback=");
        return C78920UyC.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJII;
    }

    public AA3(String str, long j, AA5 clickMethod, EnumC25783A9z enumC25783A9z, Boolean bool, int i) {
        String name;
        j = (i & 2) != 0 ? 0L : j;
        clickMethod = (i & 4) != 0 ? AA5.BUTTON : clickMethod;
        String str2 = null;
        enumC25783A9z = (i & 8) != 0 ? null : enumC25783A9z;
        bool = (i & 16) != 0 ? null : bool;
        o.LJIIIZ(clickMethod, "clickMethod");
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = clickMethod;
        this.LJ = enumC25783A9z;
        this.LJFF = bool;
        this.LJI = "close_suggested_accounts_pop_up";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        String name2 = clickMethod.name();
        Locale ENGLISH = Locale.ENGLISH;
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String lowerCase = name2.toLowerCase(ENGLISH);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        c188727au.LJIIIZ("click_method", lowerCase);
        if (enumC25783A9z != null && (name = enumC25783A9z.name()) != null) {
            str2 = name.toLowerCase(ENGLISH);
            o.LJIIIIZZ(str2, "this as java.lang.String).toLowerCase(locale)");
        }
        c188727au.LJIIIZ("method", str2);
        c188727au.LJ(j, "duration");
        c188727au.LJFF(bool, "is_negative_feedback");
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…dback)\n        .builder()");
        this.LJII = map;
    }
}
