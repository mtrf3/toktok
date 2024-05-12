package X;

/* loaded from: classes11.dex */
public enum OS5 {
    UNDEFINED("-1"),
    HOME("1"),
    PRODUCT("2"),
    CATEGORY("3"),
    CAMPAIGN("4");

    public final String LJLIL;

    public static OS5 valueOf(String str) {
        return (OS5) V0N.LJJJ(OS5.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    OS5(String str) {
        this.LJLIL = str;
    }
}
