package X;

/* renamed from: X.Iso, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48010Iso {
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

    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC48010Iso valueOf(String str) {
        return (EnumC48010Iso) V0N.LJJJ(EnumC48010Iso.class, str);
    }

    EnumC48010Iso(int i) {
        this.LJLIL = i;
    }
}
