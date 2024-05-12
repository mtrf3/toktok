package X;

/* renamed from: X.0Zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC09550Zb {
    SINGLE_PROCESS(1),
    MULTI_PROCESS(2);

    public int LJLIL;

    public static EnumC09550Zb valueOf(String str) {
        return (EnumC09550Zb) V0N.LJJJ(EnumC09550Zb.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    public final void setValue(int i) {
        this.LJLIL = i;
    }

    EnumC09550Zb(int i) {
        this.LJLIL = i;
    }
}
