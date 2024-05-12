package X;

/* loaded from: classes8.dex */
public enum I1Q {
    Favorites(1),
    Recommended(2),
    Both(3);

    public final int LJLIL;

    public static I1Q valueOf(String str) {
        return (I1Q) V0N.LJJJ(I1Q.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    I1Q(int i) {
        this.LJLIL = i;
    }
}
