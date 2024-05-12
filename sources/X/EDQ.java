package X;

/* loaded from: classes7.dex */
public enum EDQ {
    SUCCESS(0),
    NOTICE(1),
    WARNING(2),
    ERROR(3),
    CRITICAL(4);

    public final int LJLIL;

    public static EDQ valueOf(String str) {
        return (EDQ) V0N.LJJJ(EDQ.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EDQ(int i) {
        this.LJLIL = i;
    }
}
