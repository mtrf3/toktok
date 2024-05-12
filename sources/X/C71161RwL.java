package X;

import com.google.gson.internal.b;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.RwL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71161RwL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC71173RwX step, String role, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        o.LJIIIZ(step, "step");
        o.LJIIIZ(role, "role");
        try {
            String name = step.name();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = role.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            b.LJJIJIIJIL("rd_tiktokec_live_popup_card_show", new OSZ("step", lowerCase), new OSZ("role", lowerCase2), new OSZ("room_id", str), new OSZ("product_id", str2), new OSZ("is_page_visible", Integer.valueOf(z ? 1 : 0)), new OSZ("is_keyboard_showing", Integer.valueOf(z2 ? 1 : 0)), new OSZ("has_ec_perm", Integer.valueOf(z3 ? 1 : 0)), new OSZ("is_from_message", Integer.valueOf(z4 ? 1 : 0)));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }
}
