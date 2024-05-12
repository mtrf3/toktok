package X;

/* renamed from: X.Ivw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48204Ivw {
    NONE(0),
    MOBILE(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    WIFI(4),
    MOBILE_4G(5);

    public final int LJLIL;

    public static EnumC48204Ivw valueOf(String str) {
        return (EnumC48204Ivw) V0N.LJJJ(EnumC48204Ivw.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC48204Ivw(int i) {
        this.LJLIL = i;
    }
}
