package X;

/* renamed from: X.0IL, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0IL {
    NONE(0),
    TEA_16(1),
    TEA_32(2),
    TEA_64(3);

    public final int value;

    public static C0IL valueOf(String str) {
        return (C0IL) V0N.LJJJ(C0IL.class, str);
    }

    C0IL(int i) {
        this.value = i;
    }
}
