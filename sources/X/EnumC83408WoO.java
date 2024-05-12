package X;

/* renamed from: X.WoO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC83408WoO {
    TEMPLATE("TEMPLATE", "template"),
    TEXT("TEXT", "text"),
    MUSIC("MUSIC", "music"),
    OTHER("OTHER", "other_creation"),
    NON_CREATION("NON_CREATION", "null");

    public final String LJLIL;
    public final int LJLILLLLZI;

    public static EnumC83408WoO valueOf(String str) {
        return (EnumC83408WoO) V0N.LJJJ(EnumC83408WoO.class, str);
    }

    public final int getPriority() {
        return this.LJLILLLLZI;
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC83408WoO(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }
}
