package X;

/* renamed from: X.XxI, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86508XxI {
    FROM_PULLER("FROM_PULLER"),
    FROM_FRONTIER("FROM_FRONTIER"),
    FROM_EXTERNAL("FROM_EXTERNAL"),
    FROM_LOCAL("FROM_LOCAL"),
    FROM_TEST("FROM_TEST"),
    FROM_DM("FROM_DM");

    public final String LJLIL;
    public static final C86539Xxn Companion = new C86539Xxn();
    public static final C5H3<EnumC86508XxI[]> PLATFORMS$delegate = C221108m2.LIZIZ(C86532Xxg.LJLIL);

    public static EnumC86508XxI valueOf(String str) {
        return (EnumC86508XxI) V0N.LJJJ(EnumC86508XxI.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC86508XxI(String str) {
        this.LJLIL = str;
    }
}
