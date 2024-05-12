package X;

/* loaded from: classes7.dex */
public enum G3S {
    AUTO_LOGIN(0),
    ONE_CLICK_LOGIN(1);

    public static final G3T Companion = new G3T();
    public final int LJLIL;

    public static G3S valueOf(String str) {
        return (G3S) V0N.LJJJ(G3S.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    G3S(int i) {
        this.LJLIL = i;
    }
}
