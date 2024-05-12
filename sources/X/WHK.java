package X;

/* loaded from: classes15.dex */
public enum WHK {
    CENTER(0),
    START(1),
    END(2);

    public final int LJLIL;

    public static WHK valueOf(String str) {
        return (WHK) V0N.LJJJ(WHK.class, str);
    }

    public final int getGravity() {
        return this.LJLIL;
    }

    WHK(int i) {
        this.LJLIL = i;
    }
}
