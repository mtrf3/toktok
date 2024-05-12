package X;

/* renamed from: X.Epz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC37643Epz {
    Compatible(true),
    InCompatible(false);

    public final boolean LJLIL;

    public static EnumC37643Epz valueOf(String str) {
        return (EnumC37643Epz) V0N.LJJJ(EnumC37643Epz.class, str);
    }

    public final boolean getValue() {
        return this.LJLIL;
    }

    EnumC37643Epz(boolean z) {
        this.LJLIL = z;
    }
}
