package X;

/* renamed from: X.MPo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56764MPo {
    LJLJJL("TOTAL_TIME", "total_time"),
    LJLJJLL("ROUTER_TIME", "router_time"),
    LJLJL("FOLLOW_FETCH_TIME", "follow_fetch_time"),
    LJLJLJ("FOLLOW_SHOW_TIME", "follow_show_time"),
    LJLJLLL("RECOMMEND_READY_TIME", "recommend_ready_time"),
    LJLL("RECOMMEND_SHOW_TIME", "recommend_show_time"),
    LJLLI("HIT_CACHE", "hit_cache"),
    LJLLILLLL("ENTER_UNREAD_COUNT", "enter_unread_count"),
    LJLLJ("RECOMMEND_IS_READY", "recommend_is_ready"),
    LJLLL("IS_COLD_START", "is_cold_start");

    public final String LJLIL;
    public final int LJLILLLLZI;
    public volatile MR9 LJLJI = new MR9();
    public volatile MRB LJLJJI = new MRB();

    public static EnumC56764MPo valueOf(String str) {
        return (EnumC56764MPo) V0N.LJJJ(EnumC56764MPo.class, str);
    }

    public final synchronized void LIZJ() {
        this.LJLJI.LIZIZ = System.currentTimeMillis();
    }

    public final synchronized int LIZLLL() {
        return this.LJLJJI.LIZ;
    }

    public final synchronized void start() {
        this.LJLJI.LIZ = System.currentTimeMillis();
    }

    public final synchronized void LJ(int i) {
        this.LJLJJI.LIZ = i;
    }

    EnumC56764MPo(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r3;
    }
}
