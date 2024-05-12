package X;

/* renamed from: X.DwN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC35491DwN {
    SEARCH_PROP_RECOMMEND_LIST("search_prop_recommendation_list_shown_success_rate"),
    SEARCH_PROP("search_prop_success_rate"),
    SERVICE_RECORD_SEGMENTS_DELETE_ILLEGAL("service_creative_record_segments_delete_illegal");

    public final String LJLIL;

    public static EnumC35491DwN valueOf(String str) {
        return (EnumC35491DwN) V0N.LJJJ(EnumC35491DwN.class, str);
    }

    public final String getServiceName() {
        return this.LJLIL;
    }

    EnumC35491DwN(String str) {
        this.LJLIL = str;
    }
}
