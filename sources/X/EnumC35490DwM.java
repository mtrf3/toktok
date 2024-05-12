package X;

/* renamed from: X.DwM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC35490DwM {
    ApiFail("ApiRequest"),
    ApiResultError("ApiResultError"),
    Other("other");

    public final String LJLIL;

    public String getType() {
        return this.LJLIL;
    }

    public static EnumC35490DwM valueOf(String str) {
        return (EnumC35490DwM) V0N.LJJJ(EnumC35490DwM.class, str);
    }

    EnumC35490DwM(String str) {
        this.LJLIL = str;
    }
}
