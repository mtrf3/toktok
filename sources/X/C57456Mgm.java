package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Mgm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57456Mgm extends AbstractC238349Xa {
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

    public C57456Mgm(String enterFrom, EnumC58046MqI platform) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(platform, "platform");
        this.LIZIZ = "authorize_card_click";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("position", "");
        c188727au.LJIIIZ("did_status", C57459Mgp.LIZ(platform));
        c188727au.LJIIIZ("uid_status", "off");
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
