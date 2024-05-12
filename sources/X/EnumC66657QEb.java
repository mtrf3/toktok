package X;

/* renamed from: X.QEb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC66657QEb {
    DISABLED(0, false),
    DISK(1, true),
    DISK_NO_HTTP(1, false),
    MEMORY(2, true);

    public final int LJLIL;
    public final boolean LJLILLLLZI;

    public static EnumC66657QEb valueOf(String str) {
        return (EnumC66657QEb) V0N.LJJJ(EnumC66657QEb.class, str);
    }

    EnumC66657QEb(int i, boolean z) {
        this.LJLILLLLZI = z;
        this.LJLIL = i;
    }
}
