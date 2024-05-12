package X;

/* loaded from: classes6.dex */
public enum BMU {
    Unknown(-1),
    Subscription(0),
    TaxInfoCollection(1);

    public final long LJLIL;

    public static BMU valueOf(String str) {
        return (BMU) V0N.LJJJ(BMU.class, str);
    }

    public final long getScene() {
        return this.LJLIL;
    }

    BMU(long j) {
        this.LJLIL = j;
    }
}
