package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E2D {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, String str, EnumC86167Xrn actionType) {
        o.LJIIIZ(actionType, "actionType");
        if (!z || str == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("path", lowerCase);
        String lowerCase2 = actionType.name().toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("action_type", lowerCase2);
        FMX.LJIIL("ai_avatar_post_page", c188727au.LIZ);
    }
}
