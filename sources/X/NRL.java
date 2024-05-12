package X;

/* loaded from: classes11.dex */
public enum NRL {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    public final String LJLIL;

    NRL(String str) {
        this.LJLIL = str;
    }

    public static NRL valueOf(String str) {
        return (NRL) V0N.LJJJ(NRL.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }
}
