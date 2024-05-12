package X;

/* loaded from: classes11.dex */
public enum NGM {
    DATA_LOAD_FAIL("data_load_fail"),
    LOAD_TIME_OUT("load_timeout"),
    RENDER_SUCCESS("render_success");

    public final String LJLIL;

    public static NGM valueOf(String str) {
        return (NGM) V0N.LJJJ(NGM.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    NGM(String str) {
        this.LJLIL = str;
    }
}
