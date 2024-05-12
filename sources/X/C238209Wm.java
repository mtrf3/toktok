package X;

import org.json.JSONObject;

/* renamed from: X.9Wm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238209Wm {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C238199Wl.LJLIL);

    public static boolean LIZJ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static void LIZLLL(boolean z) {
        if (!LIZJ()) {
            return;
        }
        FMX.LJIILJJIL("show_save_nickname_confirm_prompt", C1B8.LIZIZ("enter_from", "edit_nickname_page", "show_sync_username", z ? 1 : 0));
    }

    public static void LJ(boolean z) {
        if (!LIZJ()) {
            return;
        }
        FMX.LJIILJJIL("show_save_username_confirm_prompt", C1B8.LIZIZ("enter_from", "edit_username_page", "show_sync_nickname", z ? 1 : 0));
    }

    public static void LIZ(boolean z, boolean z2) {
        String str;
        if (!LIZJ()) {
            return;
        }
        JSONObject LIZJ = C65232Piu.LIZJ("enter_from", "edit_nickname_page");
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        LIZJ.put("click_what", str);
        LIZJ.put("allow_sync_username", z2 ? 1 : 0);
        FMX.LJIILJJIL("click_save_nickname_confirm_prompt", LIZJ);
    }

    public static void LIZIZ(boolean z, boolean z2) {
        String str;
        if (!LIZJ()) {
            return;
        }
        JSONObject LIZJ = C65232Piu.LIZJ("enter_from", "edit_username_page");
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        LIZJ.put("click_what", str);
        LIZJ.put("allow_sync_nickname", z2 ? 1 : 0);
        FMX.LJIILJJIL("click_save_username_confirm_prompt", LIZJ);
    }
}
