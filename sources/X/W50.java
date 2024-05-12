package X;

/* loaded from: classes15.dex */
public enum W50 {
    FULL_FETCH(1),
    DISK_CACHE(2),
    ENCODED_MEMORY_CACHE(3),
    BITMAP_MEMORY_CACHE(4);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static W50 getMax(W50 w50, W50 w502) {
        if (w50.getValue() > w502.getValue()) {
            return w50;
        }
        return w502;
    }

    W50(int i) {
        this.LJLIL = i;
    }
}
