package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0WJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0WJ {
    public static final /* synthetic */ C0WJ LIZ = new C0WJ();
    public static final java.util.Map<String, String[]> LIZIZ = C113554cx.LJJL(new OSZ("broadcast", new String[]{"broadcast", "guest_linkmic"}), new OSZ("guest_linkmic", new String[]{"guest_linkmic", "broadcast"}));

    public static String LIZ(String str, String str2) {
        if (o.LJ(str, "broadcast") && o.LJ("liveguestbeauty", str2)) {
            String SMALL_ITEM_BEAUTY_PANEL = C0TY.LIZLLL;
            o.LJIIIIZZ(SMALL_ITEM_BEAUTY_PANEL, "SMALL_ITEM_BEAUTY_PANEL");
            return SMALL_ITEM_BEAUTY_PANEL;
        }
        if (o.LJ(str, "guest_linkmic") && o.LJ(C0TY.LIZLLL, str2)) {
            return "liveguestbeauty";
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
