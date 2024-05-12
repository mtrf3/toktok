package X;

/* renamed from: X.3Lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC82443Lk {
    NULL(-1),
    ALL(0),
    PRIMARY(1),
    SECONDARY(2);

    public static final C82693Mj Companion = new C82693Mj();
    public final int LJLIL;

    public static EnumC82443Lk valueOf(String str) {
        return (EnumC82443Lk) V0N.LJJJ(EnumC82443Lk.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC82443Lk(int i) {
        this.LJLIL = i;
    }
}
