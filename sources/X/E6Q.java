package X;

/* loaded from: classes7.dex */
public enum E6Q {
    UNKNOWN(-1),
    UNAVAILABLE(0),
    AVAILABLE(1);

    public final int LJLIL;

    public static E6Q valueOf(String str) {
        return (E6Q) V0N.LJJJ(E6Q.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    E6Q(int i) {
        this.LJLIL = i;
    }
}
