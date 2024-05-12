package X;

/* renamed from: X.8EP, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C8EP {
    AVATAR_ONLY_FLOW(1),
    AVATAR_AND_NICKNAME_FLOW(0);

    public final int LJLIL;

    public static C8EP valueOf(String str) {
        return (C8EP) V0N.LJJJ(C8EP.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C8EP(int i) {
        this.LJLIL = i;
    }
}
