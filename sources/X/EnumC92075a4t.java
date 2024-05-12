package X;

/* renamed from: X.a4t, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92075a4t {
    PASS("PASS"),
    REJECT("REJECT"),
    PENDING("PENDING"),
    ERROR("ERROR");

    public final String LJLIL;

    public static EnumC92075a4t valueOf(String str) {
        return (EnumC92075a4t) V0N.LJJJ(EnumC92075a4t.class, str);
    }

    public final String getStatus() {
        return this.LJLIL;
    }

    EnumC92075a4t(String str) {
        this.LJLIL = str;
    }
}
