package X;

/* loaded from: classes11.dex */
public enum O0W {
    POLICY_ENTRANCE_SHOW("policy_entrance_show"),
    POLICY_ENTRANCE_CLICK("policy_entrance_click"),
    POLICY_VIEW_SHOW("policy_view_show"),
    REQUEST_POLICY_SERVICE("receive_policy_request"),
    POLICY_URL_RETRIEVE_RESULT("policy_url_retrieve_result");

    public final String LJLIL;

    public static O0W valueOf(String str) {
        return (O0W) V0N.LJJJ(O0W.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    O0W(String str) {
        this.LJLIL = str;
    }
}
