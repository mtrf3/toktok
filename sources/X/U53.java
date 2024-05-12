package X;

/* loaded from: classes14.dex */
public enum U53 {
    UNKNOWN(0),
    NORMAL(1),
    ACTIVITY(2);

    public final int LJLIL;

    public static U53 valueOf(String str) {
        return (U53) V0N.LJJJ(U53.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    U53(int i) {
        this.LJLIL = i;
    }
}
