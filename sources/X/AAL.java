package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AAL extends AbstractC238349Xa {
    public final String LIZIZ;
    public final java.util.Map<String, String> LIZJ;

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LIZJ;
    }

    public AAL(String enterFrom, String enterMethod, String homepageUid, String previousPage, EnumC58046MqI platform) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(homepageUid, "homepageUid");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(platform, "platform");
        this.LIZIZ = "find_friends";
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
        this.LIZJ = map;
    }
}
