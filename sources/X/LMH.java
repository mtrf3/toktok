package X;

/* loaded from: classes10.dex */
public enum LMH {
    DEFAULT(true, "DEFAULT", -1),
    DARK(false, "DARK", -16777216);

    public final int LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    public static LMH valueOf(String str) {
        return (LMH) V0N.LJJJ(LMH.class, str);
    }

    public final int getColorResId() {
        return this.LJLIL;
    }

    public final int getDefaultColor() {
        return this.LJLILLLLZI;
    }

    public final boolean getHasShadow() {
        return this.LJLJI;
    }

    LMH(boolean z, String str, int i) {
        this.LJLIL = r2;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }
}
