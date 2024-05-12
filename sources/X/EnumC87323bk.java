package X;

/* renamed from: X.3bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC87323bk {
    UNKNOWN(0),
    HIDDEN(1),
    IN_STORE(2),
    DELETED(3);

    public final int LJLIL;

    public static EnumC87323bk valueOf(String str) {
        return (EnumC87323bk) V0N.LJJJ(EnumC87323bk.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC87323bk(int i) {
        this.LJLIL = i;
    }
}
