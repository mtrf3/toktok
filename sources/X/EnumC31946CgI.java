package X;

/* renamed from: X.CgI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC31946CgI {
    UNKNOWN(0),
    MULTI_ARCH(1),
    CROSS_ROOM_ARCH(2),
    OLD_ARCH(3);

    public final int LJLIL;

    public static EnumC31946CgI valueOf(String str) {
        return (EnumC31946CgI) V0N.LJJJ(EnumC31946CgI.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC31946CgI(int i) {
        this.LJLIL = i;
    }
}
