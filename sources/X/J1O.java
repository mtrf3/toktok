package X;

/* loaded from: classes9.dex */
public enum J1O {
    STYLE_FOLD_BUTTON(0),
    STYLE_UNFOLD_CAPSULE(1),
    STYLE_NO_BUTTON(2);

    public final int LJLIL;

    public static J1O valueOf(String str) {
        return (J1O) V0N.LJJJ(J1O.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    J1O(int i) {
        this.LJLIL = i;
    }
}
