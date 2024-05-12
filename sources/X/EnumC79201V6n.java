package X;

/* renamed from: X.V6n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC79201V6n {
    ROUNDED(0),
    CAPSULE(1),
    BORDERLESS(2);

    public final int LJLIL;

    public static EnumC79201V6n valueOf(String str) {
        return (EnumC79201V6n) V0N.LJJJ(EnumC79201V6n.class, str);
    }

    public final int getShape() {
        return this.LJLIL;
    }

    EnumC79201V6n(int i) {
        this.LJLIL = i;
    }
}
