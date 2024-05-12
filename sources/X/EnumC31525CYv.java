package X;

/* renamed from: X.CYv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC31525CYv {
    UNKNOWN(-1),
    SUCCESS(1),
    LOADING(2),
    ERROR(3);

    public final int LJLIL;

    public static EnumC31525CYv valueOf(String str) {
        return (EnumC31525CYv) V0N.LJJJ(EnumC31525CYv.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC31525CYv(int i) {
        this.LJLIL = i;
    }
}
