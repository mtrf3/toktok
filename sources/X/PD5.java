package X;

/* loaded from: classes12.dex */
public enum PD5 {
    GZIP(1),
    BROTLI(2),
    ZSTD(3);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static PD5 valueOf(String str) {
        return (PD5) V0N.LJJJ(PD5.class, str);
    }

    PD5(int i) {
        this.LJLIL = i;
    }
}
