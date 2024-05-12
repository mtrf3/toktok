package X;

/* renamed from: X.3yE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC101263yE {
    SENDING("sending"),
    SENT("sent"),
    FAILED("failed");

    public final String LJLIL;

    public static EnumC101263yE valueOf(String str) {
        return (EnumC101263yE) V0N.LJJJ(EnumC101263yE.class, str);
    }

    public final String getState() {
        return this.LJLIL;
    }

    EnumC101263yE(String str) {
        this.LJLIL = str;
    }
}
