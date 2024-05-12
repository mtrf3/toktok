package X;

/* renamed from: X.Hwp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC45711Hwp {
    NOT_INFLATED("not_inflated"),
    EXPANDED("expanded"),
    COLLAPSED("collapsed");

    public final String LJLIL;

    public static EnumC45711Hwp valueOf(String str) {
        return (EnumC45711Hwp) V0N.LJJJ(EnumC45711Hwp.class, str);
    }

    public final String getState() {
        return this.LJLIL;
    }

    EnumC45711Hwp(String str) {
        this.LJLIL = str;
    }
}
