package X;

/* renamed from: X.Dvt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC35461Dvt {
    ERROR_CODE_ILLEGAL_STEP(1001),
    COMPONENT_TYPE_ERROR(1002);

    public final int LJLIL;

    public static EnumC35461Dvt valueOf(String str) {
        return (EnumC35461Dvt) V0N.LJJJ(EnumC35461Dvt.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    EnumC35461Dvt(int i) {
        this.LJLIL = i;
    }
}
