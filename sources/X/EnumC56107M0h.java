package X;

/* renamed from: X.M0h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56107M0h {
    COMMON(1000, "common"),
    DATA_NULL(1001, "response data is null"),
    LYNX_ERROR(1002, "lynx load error");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC56107M0h valueOf(String str) {
        return (EnumC56107M0h) V0N.LJJJ(EnumC56107M0h.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    public final String getMsg() {
        return this.LJLILLLLZI;
    }

    EnumC56107M0h(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
