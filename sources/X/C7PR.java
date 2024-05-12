package X;

/* renamed from: X.7PR, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C7PR {
    BOOK(1, "booktok", "book"),
    MOVIE(2, "movietok", "movie");

    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public static C7PR valueOf(String str) {
        return (C7PR) V0N.LJJJ(C7PR.class, str);
    }

    public final String getBusiness() {
        return this.LJLILLLLZI;
    }

    public final String getCategory() {
        return this.LJLJI;
    }

    public final int getType() {
        return this.LJLIL;
    }

    C7PR(int i, String str, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
