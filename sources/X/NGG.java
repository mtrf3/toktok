package X;

/* loaded from: classes11.dex */
public enum NGG implements InterfaceC58699N1z<String> {
    DATA_LOAD_FAIL("data_load_fail"),
    LOAD_TIME_OUT("load_timeout"),
    COMMENT_BLOCK("comment_block"),
    SHARE_BLOCK("share_block");

    public final String LJLIL;

    public static NGG valueOf(String str) {
        return (NGG) V0N.LJJJ(NGG.class, str);
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }

    NGG(String str) {
        this.LJLIL = str;
    }
}
