package X;

/* loaded from: classes7.dex */
public enum ELM {
    OFFLINE("offline"),
    REALTIME("realtime");

    public final String LJLIL;

    public static ELM valueOf(String str) {
        return (ELM) V0N.LJJJ(ELM.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    ELM(String str) {
        this.LJLIL = str;
    }
}
