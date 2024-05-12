package X;

/* renamed from: X.Lyq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56028Lyq {
    COMMON(1000, "common"),
    DATA_NULL(1001, "response data is null");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC56028Lyq valueOf(String str) {
        return (EnumC56028Lyq) V0N.LJJJ(EnumC56028Lyq.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    public final String getMsg() {
        return this.LJLILLLLZI;
    }

    EnumC56028Lyq(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
