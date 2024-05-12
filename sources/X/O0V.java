package X;

/* loaded from: classes11.dex */
public enum O0V {
    BIZ_CASE_ID("biz_case"),
    POLICY_KEY("policy_key"),
    POLICY_URL("policy_url"),
    IS_SUCCESS("is_success"),
    REQUEST_TYPE("request_type");

    public final String LJLIL;

    public static O0V valueOf(String str) {
        return (O0V) V0N.LJJJ(O0V.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    O0V(String str) {
        this.LJLIL = str;
    }
}
