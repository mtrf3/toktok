package X;

/* renamed from: X.KzT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC53519KzT implements L4O {
    IS_ACTIVE("is_active"),
    IS_INACTIVE("is_inactive");

    public final String LJLIL;

    public static EnumC53519KzT valueOf(String str) {
        return (EnumC53519KzT) V0N.LJJJ(EnumC53519KzT.class, str);
    }

    @Override // X.L4O
    public String getString() {
        return this.LJLIL;
    }

    EnumC53519KzT(String str) {
        this.LJLIL = str;
    }
}
