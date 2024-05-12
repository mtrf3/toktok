package X;

/* renamed from: X.3ZC, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3ZC {
    UNKNOWN(0),
    CONVERSATION(1),
    FRIENDS(2),
    MAF(3),
    FOLLOWING(4);

    public final int LJLIL;

    public static C3ZC valueOf(String str) {
        return (C3ZC) V0N.LJJJ(C3ZC.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    C3ZC(int i) {
        this.LJLIL = i;
    }
}
