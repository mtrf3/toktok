package X;

/* renamed from: X.M3h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56185M3h {
    SUCCESS("success"),
    EMPTY("empty"),
    INACCESSIBLE("inaccessible"),
    API_ERROR("api_error"),
    NETWORK_ERROR("network_error");

    public final String LJLIL;

    public static EnumC56185M3h valueOf(String str) {
        return (EnumC56185M3h) V0N.LJJJ(EnumC56185M3h.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC56185M3h(String str) {
        this.LJLIL = str;
    }
}
