package X;

/* renamed from: X.JjI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC49968JjI {
    DEFAULT(0),
    BAN(1),
    PSA(2),
    BAN_AND_PSA(3);

    public final int LJLIL;

    public static EnumC49968JjI valueOf(String str) {
        return (EnumC49968JjI) V0N.LJJJ(EnumC49968JjI.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC49968JjI(int i) {
        this.LJLIL = i;
    }
}
