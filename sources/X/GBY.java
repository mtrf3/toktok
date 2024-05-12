package X;

/* loaded from: classes8.dex */
public enum GBY {
    UNKOWN(0),
    ENABLED(1),
    DISABLED(2);

    public final int LJLIL;

    public static GBY valueOf(String str) {
        return (GBY) V0N.LJJJ(GBY.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    GBY(int i) {
        this.LJLIL = i;
    }
}
