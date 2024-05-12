package X;

/* renamed from: X.Uzu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC79026Uzu {
    L(1),
    M(0),
    Q(3),
    H(2);

    public static final EnumC79026Uzu[] LJLILLLLZI;
    public final int LJLIL;

    static {
        EnumC79026Uzu enumC79026Uzu = L;
        EnumC79026Uzu enumC79026Uzu2 = M;
        EnumC79026Uzu enumC79026Uzu3 = Q;
        LJLILLLLZI = new EnumC79026Uzu[]{enumC79026Uzu2, enumC79026Uzu, H, enumC79026Uzu3};
    }

    public int getBits() {
        return this.LJLIL;
    }

    public static EnumC79026Uzu forBits(int i) {
        if (i >= 0 && i < 4) {
            return LJLILLLLZI[i];
        }
        throw new IllegalArgumentException();
    }

    public static EnumC79026Uzu valueOf(String str) {
        return (EnumC79026Uzu) V0N.LJJJ(EnumC79026Uzu.class, str);
    }

    EnumC79026Uzu(int i) {
        this.LJLIL = i;
    }
}
