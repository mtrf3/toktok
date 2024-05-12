package X;

/* loaded from: classes13.dex */
public enum T0Q {
    MINIMUM_LENGTH(1),
    KNOWN_WEAK_PASSWORD(2),
    DISTINCT_CHAR(3),
    ADJACENCY(4),
    VARIETY(5),
    LENGTH_BOOSTER(6);

    public final int LJLIL;

    public static T0Q valueOf(String str) {
        return (T0Q) V0N.LJJJ(T0Q.class, str);
    }

    public final int getOrder() {
        return this.LJLIL;
    }

    T0Q(int i) {
        this.LJLIL = i;
    }
}
