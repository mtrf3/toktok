package X;

/* loaded from: classes13.dex */
public enum SHR {
    TYPE_DUET(0),
    TYPE_STITCH(1);

    public final int LJLIL;

    public static SHR valueOf(String str) {
        return (SHR) V0N.LJJJ(SHR.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    SHR(int i) {
        this.LJLIL = i;
    }
}
