package X;

/* renamed from: X.KSi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51740KSi {
    LOAD_IN_HOME_FEED("feed"),
    LOAD_IN_MALL("mall");

    public final String LJLIL;

    public static EnumC51740KSi valueOf(String str) {
        return (EnumC51740KSi) V0N.LJJJ(EnumC51740KSi.class, str);
    }

    public final String getPageName() {
        return this.LJLIL;
    }

    EnumC51740KSi(String str) {
        this.LJLIL = str;
    }
}
