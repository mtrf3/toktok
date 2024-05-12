package X;

/* loaded from: classes15.dex */
public enum VJZ {
    SHARED(0),
    UNIQUE(1);

    public final int value;

    public static VJZ valueOf(String str) {
        return (VJZ) V0N.LJJJ(VJZ.class, str);
    }

    VJZ(int i) {
        this.value = i;
    }
}
