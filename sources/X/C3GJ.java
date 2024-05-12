package X;

/* renamed from: X.3GJ, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3GJ {
    UNKNOWN(0),
    ON(1),
    OFF(2);

    public final int LJLIL;

    public static C3GJ valueOf(String str) {
        return (C3GJ) V0N.LJJJ(C3GJ.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    C3GJ(int i) {
        this.LJLIL = i;
    }
}
