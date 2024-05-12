package X;

/* loaded from: classes10.dex */
public enum LOA {
    MOVE_DOWN_AND_SHOWING_ANIMATING(0),
    MOVE_DOWN_SHOWING(1),
    SHOWING_ANIMATING(2),
    SHOWING(3),
    HIDE_ANIMATING(4),
    MOVE_DOWN_AND_HIDE_ANIMATING(5),
    HIDE(6);

    public final int LJLIL;

    public static LOA valueOf(String str) {
        return (LOA) V0N.LJJJ(LOA.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    LOA(int i) {
        this.LJLIL = i;
    }
}
