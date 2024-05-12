package X;

/* renamed from: X.MRe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56806MRe {
    LJLJJL("TOTAL_LOADING_TIME", "activities_load_total_time"),
    LJLJJLL("ROUTE_TIME", "activities_route_time"),
    LJLJL("JANUS_REQUEST_TIME", "activities_janus_request_time"),
    LJLJLJ("MULTI_REQUEST_TIME", "activities_multi_request_time"),
    LJLJLLL("RENDER_TIME", "activities_render_time"),
    LJLL("ENTER_UNREAD_COUNT", "activities_unread_show_count"),
    LJLLI("USER_CARD_HAS_DATA_WHEN_LOAD", "user_card_has_data_when_load"),
    LJLLILLLL("LOAD_OPTIMIZATION_TYPE", "load_optimization_type"),
    LJLLJ("IS_INVALID_DATA", "is_invalid_data"),
    LJLLL("IS_COLD_START", "is_cold_start");

    public final String LJLIL;
    public final int LJLILLLLZI;
    public volatile C56807MRf LJLJI = new C56807MRf();
    public volatile C56808MRg LJLJJI = new C56808MRg();

    public static EnumC56806MRe valueOf(String str) {
        return (EnumC56806MRe) V0N.LJJJ(EnumC56806MRe.class, str);
    }

    public final synchronized int LIZJ() {
        return this.LJLJJI.LIZ;
    }

    public final synchronized void LIZLLL() {
        this.LJLJI.LIZIZ = System.currentTimeMillis();
    }

    public final synchronized void LJ() {
        this.LJLJI.LIZ = System.currentTimeMillis();
    }

    public final synchronized void LJFF(int i) {
        this.LJLJJI.LIZ = i;
    }

    EnumC56806MRe(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r3;
    }
}
