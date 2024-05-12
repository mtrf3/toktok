package X;

/* renamed from: X.0TG, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0TG {
    UNKNOWN(-1),
    NONE(0),
    MOBILE(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    WIFI(4),
    MOBILE_4G(5),
    MOBILE_5G(6),
    WIFI_24GHZ(7),
    WIFI_5GHZ(8),
    MOBILE_3G_H(9),
    MOBILE_3G_HP(10);

    public final int LJLIL;

    public boolean is2G() {
        if (this == MOBILE || this == MOBILE_2G) {
            return true;
        }
        return false;
    }

    public boolean is3GOrHigher() {
        if (this == MOBILE_3G || this == MOBILE_3G_H || this == MOBILE_3G_HP || this == MOBILE_4G || this == MOBILE_5G) {
            return true;
        }
        return false;
    }

    public boolean is4GOrHigher() {
        if (this == MOBILE_4G || this == MOBILE_5G) {
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        if (this != UNKNOWN && this != NONE) {
            return true;
        }
        return false;
    }

    public boolean isWifi() {
        if (this == WIFI) {
            return true;
        }
        return false;
    }

    public int getValue() {
        return this.LJLIL;
    }

    public static C0TG valueOf(String str) {
        return (C0TG) V0N.LJJJ(C0TG.class, str);
    }

    C0TG(int i) {
        this.LJLIL = i;
    }
}
