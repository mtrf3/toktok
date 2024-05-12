package X;

/* renamed from: X.3cW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC87803cW {
    STATUS_UNKNOWN(0),
    STATUS_PASS(1),
    STATUS_FAIL(2);

    public final int LJLIL;

    public static EnumC87803cW valueOf(String str) {
        return (EnumC87803cW) V0N.LJJJ(EnumC87803cW.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC87803cW(int i) {
        this.LJLIL = i;
    }
}
