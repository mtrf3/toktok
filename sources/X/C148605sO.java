package X;

import com.bytedance.keva.Keva;

/* renamed from: X.5sO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148605sO {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C148615sP.LJLIL);

    public static Boolean LIZ() {
        boolean z;
        if (C00F.LIZ(31744, 0, "tool_hdr_strategy", true) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (LIZIZ().contains("key_enhance_status")) {
                return Boolean.valueOf(LIZIZ().getBoolean("key_enhance_status", false));
            }
            LIZIZ().storeBoolean("key_enhance_status", true);
        } else if (C00F.LIZ(31744, 0, "tool_hdr_strategy", true) == 2) {
            if (LIZIZ().contains("key_enhance_status")) {
                return Boolean.FALSE;
            }
            LIZIZ().storeBoolean("key_enhance_status", false);
        } else {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZJ(Boolean bool) {
        boolean z;
        boolean z2 = false;
        if (C00F.LIZ(31744, 0, "tool_hdr_strategy", true) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Keva LIZIZ = LIZIZ();
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            LIZIZ.storeBoolean("key_enhance_status", z2);
            return;
        }
        if (C00F.LIZ(31744, 0, "tool_hdr_strategy", true) != 2) {
            return;
        }
        LIZIZ().storeBoolean("key_enhance_status", false);
    }
}
