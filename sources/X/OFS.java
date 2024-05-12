package X;

/* loaded from: classes11.dex */
public final class OFS extends AbstractC65781Prl implements InterfaceC65784Pro<C1HQ<String, String>> {
    public static final OFS LJLIL = new OFS();

    public OFS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C1HQ<String, String> invoke() {
        C1HQ<String, String> c1hq = new C1HQ<>(8);
        c1hq.put("resource_performance", "landing_page_static_resource");
        c1hq.put("perf", "landing_page_perf");
        c1hq.put("performance", "landing_page_performance");
        c1hq.put("blank", "landing_page_blank");
        c1hq.put("navigationStart", "landing_page_navigation_start");
        return c1hq;
    }
}
