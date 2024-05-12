package X;

import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AAK extends AbstractC238349Xa {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final EnumC58046MqI LJFF;
    public final String LJI;
    public final java.util.Map<String, String> LJII;

    public final Object[] LJ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AAK) {
            return C78966Uyw.LJIIIZ(((AAK) obj).LJ(), LJ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LJ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("AuthorizeCardCloseTrack:%s,%s,%s,%s,%s", LJ());
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJII;
    }

    public AAK(String enterFrom, String enterMethod, String homepageUid, String previousPage, EnumC58046MqI platform) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(homepageUid, "homepageUid");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(platform, "platform");
        this.LIZIZ = enterFrom;
        this.LIZJ = enterMethod;
        this.LIZLLL = homepageUid;
        this.LJ = previousPage;
        this.LJFF = platform;
        this.LJI = "authorize_card_close";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", enterMethod);
        c188727au.LJIIIZ("previous_page", previousPage);
        c188727au.LJIIIZ("homepage_uid", homepageUid);
        String name = platform.name();
        Locale ENGLISH = Locale.ENGLISH;
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String lowerCase = name.toLowerCase(ENGLISH);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        c188727au.LJIIIZ("platform", lowerCase);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…LISH))\n        .builder()");
        this.LJII = map;
    }
}
