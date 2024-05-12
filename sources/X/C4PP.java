package X;

/* renamed from: X.4PP, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C4PP {
    SHOW(0),
    CLICK(1);

    public final int LJLIL;

    public static C4PP valueOf(String str) {
        return (C4PP) V0N.LJJJ(C4PP.class, str);
    }

    public final int getAction() {
        return this.LJLIL;
    }

    C4PP(int i) {
        this.LJLIL = i;
    }
}
