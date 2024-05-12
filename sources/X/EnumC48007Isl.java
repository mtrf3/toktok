package X;

/* renamed from: X.Isl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48007Isl {
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

    public static EnumC48007Isl valueOf(String str) {
        return (EnumC48007Isl) V0N.LJJJ(EnumC48007Isl.class, str);
    }

    EnumC48007Isl(int i) {
        this.LJLIL = i;
    }
}
