package X;

/* renamed from: X.6T6, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C6T6 {
    CREATE(0),
    RESUME(1),
    PAUSE(2),
    DESTROY(-1);

    public final int LJLIL;

    public static C6T6 valueOf(String str) {
        return (C6T6) V0N.LJJJ(C6T6.class, str);
    }

    public final int getState() {
        return this.LJLIL;
    }

    C6T6(int i) {
        this.LJLIL = i;
    }
}
