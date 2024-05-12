package X;

/* loaded from: classes8.dex */
public enum GGO {
    SHOW(1),
    DISMISS(2),
    NEGATIVE_BTN(3),
    POSITIVE_BTN(4),
    NEUTRAL_BTN(5),
    CLICK_CLOSE(6);

    public final int LJLIL;

    public static GGO valueOf(String str) {
        return (GGO) V0N.LJJJ(GGO.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    GGO(int i) {
        this.LJLIL = i;
    }
}
