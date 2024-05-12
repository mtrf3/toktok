package X;

/* renamed from: X.Jn2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC50200Jn2 {
    COMMON("common"),
    OVERLAY("overlay");

    public static final C50204Jn6 Companion = new C50204Jn6();
    public final String LJLIL;

    public static EnumC50200Jn2 valueOf(String str) {
        return (EnumC50200Jn2) V0N.LJJJ(EnumC50200Jn2.class, str);
    }

    public final String getMobType() {
        return this.LJLIL;
    }

    EnumC50200Jn2(String str) {
        this.LJLIL = str;
    }
}
