package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AA2 extends AbstractC238349Xa {
    public final String LIZIZ;
    public final EnumC25783A9z LIZJ;
    public final Long LIZLLL;
    public final Long LJ;
    public final String LJFF;
    public final java.util.Map<String, String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AA2)) {
            return false;
        }
        AA2 aa22 = (AA2) obj;
        return o.LJ(this.LIZIZ, aa22.LIZIZ) && this.LIZJ == aa22.LIZJ && o.LJ(this.LIZLLL, aa22.LIZLLL) && o.LJ(this.LJ, aa22.LJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31)) * 31;
        Long l = this.LIZLLL;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJ;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowRecPopupTracker(enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", method=");
        LIZ.append(this.LIZJ);
        LIZ.append(", lastPopupShownDuration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", lastNegativeFeedbackDuration=");
        return JBR.LJ(LIZ, this.LJ, ')', LIZ);
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJI;
    }

    public AA2(String enterFrom, EnumC25783A9z method, Long l, Long l2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(method, "method");
        this.LIZIZ = enterFrom;
        this.LIZJ = method;
        this.LIZLLL = l;
        this.LJ = l2;
        this.LJFF = "show_suggested_accounts_pop_up";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        String name = method.name();
        Locale ENGLISH = Locale.ENGLISH;
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String lowerCase = name.toLowerCase(ENGLISH);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        c188727au.LJIIIZ("method", lowerCase);
        c188727au.LJFF(l, "last_popup_shown_duration");
        c188727au.LJFF(l2, "last_negative_feedback_duration");
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…ation)\n        .builder()");
        this.LJI = map;
    }
}
