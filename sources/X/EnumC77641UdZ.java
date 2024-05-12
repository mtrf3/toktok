package X;

/* renamed from: X.UdZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC77641UdZ implements InterfaceC77685UeH {
    USE(true, true),
    NON_USE(false, true),
    NON_USE_AND_NON_CACHE(false, false);

    public final boolean LJLIL;
    public final boolean LJLILLLLZI;

    public static EnumC77641UdZ valueOf(String str) {
        return (EnumC77641UdZ) V0N.LJJJ(EnumC77641UdZ.class, str);
    }

    @Override // X.InterfaceC77685UeH
    public boolean canCache() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC77685UeH
    public boolean canUse() {
        return this.LJLIL;
    }

    EnumC77641UdZ(boolean z, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }
}
