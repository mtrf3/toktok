package X;

/* loaded from: classes7.dex */
public enum ELO {
    OFFLINE("offline"),
    REALTIME("realtime");

    public final String LJLIL;

    public static ELO valueOf(String str) {
        return (ELO) V0N.LJJJ(ELO.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    ELO(String str) {
        this.LJLIL = str;
    }
}
