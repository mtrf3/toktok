package X;

/* renamed from: X.XqT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86085XqT {
    NONE(0),
    CLOSE(1),
    BACK(2),
    INFO(3),
    ICON(4),
    TEXT(5);

    public static final C86089XqX Companion = new C86089XqX();
    public final int LJLIL;

    public static EnumC86085XqT valueOf(String str) {
        return (EnumC86085XqT) V0N.LJJJ(EnumC86085XqT.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC86085XqT(int i) {
        this.LJLIL = i;
    }
}
