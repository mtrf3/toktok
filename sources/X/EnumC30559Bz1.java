package X;

/* renamed from: X.Bz1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC30559Bz1 {
    EMPTY(0),
    LOW(1),
    MIDDLE(5),
    HIGH(9),
    HIGHEST(10);

    public int LJLIL;

    public static EnumC30559Bz1 valueOf(String str) {
        return (EnumC30559Bz1) V0N.LJJJ(EnumC30559Bz1.class, str);
    }

    public final int getPriorityInt() {
        return this.LJLIL;
    }

    public final void setPriorityInt(int i) {
        this.LJLIL = i;
    }

    EnumC30559Bz1(int i) {
        this.LJLIL = i;
    }
}
