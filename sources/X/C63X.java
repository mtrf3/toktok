package X;

/* renamed from: X.63X, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C63X {
    NONE(-1),
    POLL(1),
    COMMENT(2),
    TEXT(3),
    DONATION(4),
    QUESTION(5),
    LIVE_COUNTDOWN(10),
    CAPTION(11),
    QUESTION_AND_ANSWER(12);

    public final int LJLIL;

    public static C63X valueOf(String str) {
        return (C63X) V0N.LJJJ(C63X.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    C63X(int i) {
        this.LJLIL = i;
    }
}
