package X;

import defpackage.e1;

/* renamed from: X.KiP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52461KiP {
    public static final boolean LIZ() {
        if (e1.LIZ(31744, "enable_shoot_page_svc", true, false)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (LIZ() && !LIZLLL() && !LIZJ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        if (!LIZ() || !e1.LIZ(31744, "enable_shoot_page_svc_sample", true, false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL() {
        if (!LIZ() || !e1.LIZ(31744, "enable_shoot_page_svc_vad", true, false)) {
            return false;
        }
        return true;
    }
}
