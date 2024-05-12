package X;

/* renamed from: X.0II, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0II {
    NONE(0),
    ZLIB(1),
    ZSTD(2);

    public final int value;

    public static C0II valueOf(String str) {
        return (C0II) V0N.LJJJ(C0II.class, str);
    }

    C0II(int i) {
        this.value = i;
    }
}
