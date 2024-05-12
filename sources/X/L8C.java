package X;

/* loaded from: classes10.dex */
public enum L8C {
    PRELOAD("preload"),
    FIRST("first"),
    UPDATE("update");

    public final String LJLIL;

    public static L8C valueOf(String str) {
        return (L8C) V0N.LJJJ(L8C.class, str);
    }

    public final String getTypeStr() {
        return this.LJLIL;
    }

    L8C(String str) {
        this.LJLIL = str;
    }
}
