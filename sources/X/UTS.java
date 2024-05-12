package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UTS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, int i, UTT clickAction) {
        o.LJIIIZ(clickAction, "clickAction");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "auto");
        c188727au.LJIIIZ("verify_type", "email");
        c188727au.LIZLLL(i, "show_index");
        c188727au.LJIIIZ("show_type", "contact_sync_pop_up");
        String lowerCase = clickAction.name().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("click", lowerCase);
        if (str != null) {
            c188727au.LJI("enter_from", str);
        }
        FMX.LJIIL("contact_sync_prompt_click", c188727au.LIZ);
    }
}
