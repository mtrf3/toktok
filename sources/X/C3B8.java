package X;

/* renamed from: X.3B8, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3B8 {
    ACTIVE(0),
    INACTIVE(1);

    public final int LJLIL;

    public static C3B8 valueOf(String str) {
        return (C3B8) V0N.LJJJ(C3B8.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    C3B8(int i) {
        this.LJLIL = i;
    }
}
