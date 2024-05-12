package X;

/* renamed from: X.0NW, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0NW {
    BEGIN(1),
    END(2);

    public final int LJLIL;

    C0NW(int i) {
        this.LJLIL = i;
    }

    public static C0NW valueOf(String str) {
        return (C0NW) V0N.LJJJ(C0NW.class, str);
    }

    public int getStatus() {
        return this.LJLIL;
    }
}
