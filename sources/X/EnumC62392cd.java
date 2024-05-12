package X;

/* renamed from: X.2cd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC62392cd {
    UNKNOWN(0),
    ALLOWED(1),
    NOT_ALLOWED(2);

    public final int LJLIL;

    public static EnumC62392cd valueOf(String str) {
        return (EnumC62392cd) V0N.LJJJ(EnumC62392cd.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC62392cd(int i) {
        this.LJLIL = i;
    }
}
