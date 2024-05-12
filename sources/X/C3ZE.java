package X;

/* renamed from: X.3ZE, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3ZE {
    UNKNOWN(-1),
    NO_RELATION(0),
    FOLLOWING(1),
    FOLLOW_EACH_OTHER(2),
    FOLLOW_REQUEST(4);

    public final int LJLIL;

    public static C3ZE valueOf(String str) {
        return (C3ZE) V0N.LJJJ(C3ZE.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    C3ZE(int i) {
        this.LJLIL = i;
    }
}
