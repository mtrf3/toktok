package X;

/* loaded from: classes6.dex */
public enum CNF {
    ADD("add"),
    REMOVE("remove"),
    REFRESH("refresh");

    public final String LJLIL;

    public static CNF valueOf(String str) {
        return (CNF) V0N.LJJJ(CNF.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    CNF(String str) {
        this.LJLIL = str;
    }
}
