package X;

import java.util.List;

/* renamed from: X.Nxk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61056Nxk {
    public static final List<C61052Nxg> LIZ;
    public static final List<C61052Nxg> LIZIZ;
    public static final List<C61052Nxg> LIZJ;
    public static final C61051Nxf LIZLLL;
    public static final C61051Nxf LJ;
    public static final C61051Nxf LJFF;

    static {
        List<C61052Nxg> LJJIJIL = C47261Igj.LJJIJIL(new C61052Nxg("PageStartTime", "StartLoadTime", "rn_load_interval"), new C61052Nxg("StartLoadTime", "FirstDrawTime", "first_draw_interval"), new C61052Nxg("FirstDrawTime", "FirstScreenTime", "first_screen_interval"), new C61052Nxg("FirstDrawTime", "PageFinishTime", "page_finish_interval"));
        LIZ = LJJIJIL;
        List<C61052Nxg> LJJIJIL2 = C47261Igj.LJJIJIL(new C61052Nxg("redirectStart", "redirectEnd", "redirect_interval"), new C61052Nxg("fetchStart", "domainLookupStart", "app_cache_interval"), new C61052Nxg("domainLookupStart", "domainLookupEnd", "dns_interval"), new C61052Nxg("connectStart", "connectEnd", "tcp_interval"), new C61052Nxg("requestStart", "responseStart", "request_interval"), new C61052Nxg("responseStart", "responseEnd", "response_interval"), new C61052Nxg("domLoading", "domInteractive", "dom_load_interval"), new C61052Nxg("domContentLoadedEventStart", "domContentLoadedEventEnd", "dom_content_loaded_interval"), new C61052Nxg("domContentLoadedEventEnd", "domComplete", "dom_complete_interval"));
        LIZIZ = LJJIJIL2;
        List<C61052Nxg> LJJIJIL3 = C47261Igj.LJJIJIL(new C61052Nxg("redirectStart", "redirectEnd", "redirect_interval"), new C61052Nxg("fetchStart", "domainLookupStart", "app_cache_interval"), new C61052Nxg("domainLookupStart", "domainLookupEnd", "dns_interval"), new C61052Nxg("connectStart", "connectEnd", "tcp_interval"), new C61052Nxg("requestStart", "responseStart", "request_interval"), new C61052Nxg("responseStart", "responseEnd", "response_interval"));
        LIZJ = LJJIJIL3;
        LIZLLL = new C61051Nxf(LJJIJIL);
        LJ = new C61051Nxf(LJJIJIL2);
        LJFF = new C61051Nxf(LJJIJIL3);
    }

    public static C61051Nxf LIZ(EnumC61054Nxi enumC61054Nxi) {
        int i = C61055Nxj.LIZ[enumC61054Nxi.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LJFF;
                }
                throw new C162476Zf();
            }
            return LJ;
        }
        return LIZLLL;
    }
}
