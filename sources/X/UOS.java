package X;

/* loaded from: classes14.dex */
public enum UOS {
    ID("id"),
    NAME("name");

    public final String LJLIL;

    public static UOS valueOf(String str) {
        return (UOS) V0N.LJJJ(UOS.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    UOS(String str) {
        this.LJLIL = str;
    }
}
