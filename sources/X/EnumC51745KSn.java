package X;

/* renamed from: X.KSn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51745KSn {
    LOAD_IN_DISK("disk"),
    LOAD_IN_MEMORY("memory");

    public final String LJLIL;

    public static EnumC51745KSn valueOf(String str) {
        return (EnumC51745KSn) V0N.LJJJ(EnumC51745KSn.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC51745KSn(String str) {
        this.LJLIL = str;
    }
}
