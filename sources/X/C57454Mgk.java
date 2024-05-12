package X;

import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Mgk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57454Mgk extends AbstractC238349Xa {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final EnumC58046MqI LJFF;
    public final String LJI;
    public final String LJII;
    public final java.util.Map<String, String> LJIIIIZZ;

    public final Object[] LJ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C57454Mgk) {
            return C78966Uyw.LJIIIZ(((C57454Mgk) obj).LJ(), LJ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LJ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("AuthorizeCardShowTrack:%s,%s,%s,%s,%s,%s", LJ());
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJIIIIZZ;
    }

    public C57454Mgk(String enterFrom, String enterMethod, String homepageUid, String previousPage, EnumC58046MqI platform, String position) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(homepageUid, "homepageUid");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(position, "position");
        this.LIZIZ = enterFrom;
        this.LIZJ = enterMethod;
        this.LIZLLL = homepageUid;
        this.LJ = previousPage;
        this.LJFF = platform;
        this.LJI = position;
        this.LJII = "authorize_card_show";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", enterMethod);
        c188727au.LJIIIZ("previous_page", previousPage);
        c188727au.LJIIIZ("homepage_uid", homepageUid);
        c188727au.LJIIIZ("position", position);
        c188727au.LJIIIZ("is_auth", AbstractC238349Xa.LIZJ(false));
        String name = platform.name();
        Locale ENGLISH = Locale.ENGLISH;
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String lowerCase = name.toLowerCase(ENGLISH);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        c188727au.LJIIIZ("platform", lowerCase);
        c188727au.LJIIIZ("did_status", C57459Mgp.LIZ(platform));
        c188727au.LJIIIZ("uid_status", "off");
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…e.OFF)\n        .builder()");
        this.LJIIIIZZ = map;
    }
}
