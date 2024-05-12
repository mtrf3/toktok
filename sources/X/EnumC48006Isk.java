package X;

/* renamed from: X.Isk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48006Isk {
    NONE(0),
    MOBILE(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    WIFI(4),
    MOBILE_4G(5);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC48006Isk valueOf(String str) {
        return (EnumC48006Isk) V0N.LJJJ(EnumC48006Isk.class, str);
    }

    EnumC48006Isk(int i) {
        this.LJLIL = i;
    }
}
