package X;

/* renamed from: X.V6i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC79196V6i {
    PRIMARY(0),
    SECONDARY(1),
    CONST_SECONDARY(2),
    GHOST(4);

    public final int LJLIL;

    public static EnumC79196V6i valueOf(String str) {
        return (EnumC79196V6i) V0N.LJJJ(EnumC79196V6i.class, str);
    }

    public final int getVariant() {
        return this.LJLIL;
    }

    EnumC79196V6i(int i) {
        this.LJLIL = i;
    }
}
