package X;

/* loaded from: classes7.dex */
public enum EHX {
    APPLICATION_ATTACH("application_attach"),
    MAIN_CREATE("main_create"),
    MAIN_MEASURE("main_measure"),
    MAIN_FOCUS("main_focus"),
    BOOT_PLAY("boot_play"),
    FEED_TOTAL("feed_total");

    public final String LJLIL;

    public static EHX valueOf(String str) {
        return (EHX) V0N.LJJJ(EHX.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EHX(String str) {
        this.LJLIL = str;
    }
}
