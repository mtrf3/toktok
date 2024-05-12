package X;

/* renamed from: X.8EO, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C8EO {
    NICKNAME_ONLY_FLOW(1),
    AVATAR_AND_NICKNAME_FLOW(0);

    public final int LJLIL;

    public static C8EO valueOf(String str) {
        return (C8EO) V0N.LJJJ(C8EO.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C8EO(int i) {
        this.LJLIL = i;
    }
}
