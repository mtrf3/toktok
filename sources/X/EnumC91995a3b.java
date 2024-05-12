package X;

/* renamed from: X.a3b, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91995a3b {
    SUCCESS("SUCCESS"),
    PENDING("PENDING"),
    FAILED("FAILED");

    public static final C91994a3a Companion = new C91994a3a();
    public final String LJLIL;

    public static EnumC91995a3b valueOf(String str) {
        return (EnumC91995a3b) V0N.LJJJ(EnumC91995a3b.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC91995a3b(String str) {
        this.LJLIL = str;
    }
}
