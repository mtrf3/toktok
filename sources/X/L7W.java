package X;

/* loaded from: classes10.dex */
public enum L7W {
    LIVE(1),
    SOLD_OUT(2),
    SELLER_DEACTIVE(3),
    REGION_UNAVAILABLE(4),
    OTHER(100);

    public final int LJLIL;

    public static L7W valueOf(String str) {
        return (L7W) V0N.LJJJ(L7W.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    L7W(int i) {
        this.LJLIL = i;
    }
}
