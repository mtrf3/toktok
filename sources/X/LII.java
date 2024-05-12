package X;

/* loaded from: classes10.dex */
public enum LII {
    SORT(1),
    HISTORY(2),
    HISTORY_UNVIEWED(3),
    HISTORY_VIEWED(4);

    public final int LJLIL;

    public static LII valueOf(String str) {
        return (LII) V0N.LJJJ(LII.class, str);
    }

    public final int getDataLevel() {
        return this.LJLIL;
    }

    LII(int i) {
        this.LJLIL = i;
    }
}
