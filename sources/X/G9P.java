package X;

/* loaded from: classes8.dex */
public final class G9P {
    public static boolean LIZIZ() {
        if (C00F.LIZ(31744, 0, "creation_privacy_setting_set_as_default", true) != 1 || !C1B8.LIZJ()) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ() {
        if (C00F.LIZ(31744, 0, "creation_privacy_setting_set_as_default", true) != 2 || !C1B8.LIZJ()) {
            return false;
        }
        return true;
    }

    public static boolean LIZ() {
        if (LIZJ() || LIZIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (LIZJ()) {
            return true;
        }
        if (C00F.LIZ(31744, 0, "creation_privacy_setting_set_as_default", true) == 3 && C1B8.LIZJ()) {
            return true;
        }
        return false;
    }
}
