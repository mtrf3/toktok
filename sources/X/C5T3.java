package X;

/* renamed from: X.5T3, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C5T3 {
    RATIO_1_TO_1(0, "1:1"),
    RATIO_3_TO_4(1, "3:4"),
    RATIO_9_TO_16(2, "9:16");

    public final float LJLIL;
    public final String LJLILLLLZI;

    public static C5T3 valueOf(String str) {
        return (C5T3) V0N.LJJJ(C5T3.class, str);
    }

    public final String getDescription() {
        return this.LJLILLLLZI;
    }

    public final float getRatio() {
        return this.LJLIL;
    }

    C5T3(int i, String str) {
        this.LJLIL = r1;
        this.LJLILLLLZI = str;
    }
}
