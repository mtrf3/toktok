package X;

/* loaded from: classes7.dex */
public enum EHW {
    APPLICATION_BEFORE_ATTACH("app_before_attach"),
    APPLICATION_AFTER_ATTACH("app_after_attach"),
    APPLICATION_BEFORE_CREATE("app_before_create"),
    APPLICATION_AFTER_CREATE("app_after_create"),
    MAIN_CREATE("main_create");

    public final String LJLIL;

    public static EHW valueOf(String str) {
        return (EHW) V0N.LJJJ(EHW.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EHW(String str) {
        this.LJLIL = str;
    }
}
