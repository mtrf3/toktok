package X;

/* loaded from: classes15.dex */
public enum WHB {
    NONE(0),
    LINEAR(1);

    public static final WHG Companion = new WHG();
    public final int LJLIL;

    public static WHB valueOf(String str) {
        return (WHB) V0N.LJJJ(WHB.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    WHB(int i) {
        this.LJLIL = i;
    }
}
