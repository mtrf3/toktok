package X;

import android.webkit.CookieManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Pav, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64737Pav implements OCD, EZV, InterfaceC64780Pbc, InterfaceC64700PaK, InterfaceC64699PaJ {
    public static volatile C64737Pav LJLJL;
    public String LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    public static C64737Pav LJIIIZ() {
        if (LJLJL == null) {
            synchronized (C64737Pav.class) {
                if (LJLJL == null) {
                    LJLJL = new C64737Pav();
                }
            }
        }
        return LJLJL;
    }

    @Override // X.EZV
    public final boolean LIZIZ() {
        if (this.LJLJI > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC64700PaK
    public final boolean LIZJ() {
        if (C64734Pas.LLIIIL || this.LJLJJL <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC64780Pbc
    public final boolean LJ() {
        if (C64734Pas.LLIIIL) {
            C64667PZn.LIZIZ = 0;
            return false;
        }
        if (C64734Pas.LLIIJI) {
            C64667PZn.LIZIZ = 8;
            return false;
        }
        if (this.LJLJJLL > 5) {
            C64667PZn.LIZIZ = 3;
            return false;
        }
        TTNetInit.getTTNetDepend().LIZIZ();
        return true;
    }

    @Override // X.EZV
    public final boolean LJFF() {
        if (this.LJLILLLLZI > 0) {
            return true;
        }
        return false;
    }

    @Override // X.EZV
    public final boolean LJII() {
        if (this.LJLJJI > 0) {
            return true;
        }
        return false;
    }

    public C64737Pav() {
        LIZ();
    }

    public final void LIZ() {
        boolean z;
        boolean z2;
        this.LJLIL = TTNetInit.getTTNetDepend().LIZ(TTNetInit.getTTNetDepend().getContext(), "share_cookie_host_list");
        TTNetInit.getTTNetDepend().LJII(this.LJLIL);
        boolean z3 = false;
        this.LJLILLLLZI = TTNetInit.getTTNetDepend().LJI(TTNetInit.getTTNetDepend().getContext(), 0, "add_ss_queries_open");
        int LJI = TTNetInit.getTTNetDepend().LJI(TTNetInit.getTTNetDepend().getContext(), 0, "add_ss_queries_header_open");
        this.LJLJI = LJI;
        if (this.LJLILLLLZI > 0 || LJI > 0) {
            SsInterceptor.LJLIL = true;
        }
        this.LJLJJI = TTNetInit.getTTNetDepend().LJI(TTNetInit.getTTNetDepend().getContext(), 1, "add_ss_queries_plaintext_open");
        this.LJLJJL = TTNetInit.getTTNetDepend().LJI(TTNetInit.getTTNetDepend().getContext(), 0, "http_dns_enabled");
        this.LJLJJLL = TTNetInit.getTTNetDepend().LJI(TTNetInit.getTTNetDepend().getContext(), 0, "chromium_boot_failures");
        int LJI2 = TTNetInit.getTTNetDepend().LJI(TTNetInit.getTTNetDepend().getContext(), LiveLayoutPreloadThreadPriority.DEFAULT, "query_filter_enabled");
        String LIZ = TTNetInit.getTTNetDepend().LIZ(TTNetInit.getTTNetDepend().getContext(), "query_filter_actions");
        C38092ExE.LIZLLL().LJIIIIZZ(TTNetInit.getTTNetDepend().LIZ(TTNetInit.getTTNetDepend().getContext(), "L0_params"));
        if (LJI2 != Integer.MIN_VALUE) {
            C38092ExE LIZLLL = C38092ExE.LIZLLL();
            if (LJI2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            LIZLLL.LIZIZ = z2;
            C38092ExE.LIZLLL().LJ(LIZ);
        }
        if (TTNetInit.getTTNetDepend().LJI(TTNetInit.getTTNetDepend().getContext(), 1, "private_protocol_enabled") >= 1) {
            z = true;
        } else {
            z = false;
        }
        C64735Pat.LJIIZILJ = z;
        if (TTNetInit.getTTNetDepend().LJI(TTNetInit.getTTNetDepend().getContext(), 0, "new_cookie_saver_enabled") >= 1) {
            z3 = true;
        }
        C64735Pat.LJIJ = z3;
    }

    @Override // X.InterfaceC64699PaJ
    public final boolean isCronetBootFailureExpected() {
        if (TTNetInit.getTTNetDepend().LJI(TTNetInit.getTTNetDepend().getContext(), 0, "chromium_boot_failures") > 5) {
            return false;
        }
        return true;
    }

    @Override // X.OCD
    public final List<String> LIZLLL(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.LJLIL.split(",")) {
            if (!C38354F3m.LJ(str2)) {
                arrayList.add(str2);
            }
        }
        TTNetInit.getTTNetDepend().LJIIJ();
        if (!C38354F3m.LJ("") && !LJIIIIZZ("", arrayList)) {
            arrayList.add("");
        }
        if (LJIIIIZZ(str, arrayList)) {
            return arrayList;
        }
        return null;
    }

    public static boolean LJIIIIZZ(String str, List list) {
        if (C38354F3m.LJ(str) || C32151Nz.LJJIIJZLJL(list)) {
            return false;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            if (str.endsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.OCD
    public final List<String> LJI(CookieManager cookieManager, OCG ocg, java.net.URI uri) {
        String str;
        String cookie;
        if (uri != null && (cookieManager != null || ocg != null)) {
            try {
                str = uri.getHost();
            } catch (Exception unused) {
                str = null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.LJLIL.split(",")) {
                if (!C38354F3m.LJ(str2)) {
                    arrayList.add(str2);
                }
            }
            if (!C38354F3m.LJ(str) && LJIIIIZZ(str, arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                if (cookieManager != null) {
                    TTNetInit.getTTNetDepend().LJIIJ();
                    C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{""}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-8186543608478990980"));
                    if (LIZJ.LIZ) {
                        cookie = (String) LIZJ.LIZIZ;
                    } else {
                        cookie = cookieManager.getCookie("");
                    }
                    if (!C38354F3m.LJ(cookie)) {
                        arrayList2.add(cookie);
                    }
                }
                if (C32151Nz.LJJIIJZLJL(arrayList2) && ocg != null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(uri.getScheme());
                        sb.append("://");
                        TTNetInit.getTTNetDepend().LJIIJ();
                        sb.append("");
                        java.util.Map<String, List<String>> map = ocg.get(java.net.URI.create(sb.toString()), new LinkedHashMap());
                        if (map != null && !map.isEmpty()) {
                            return map.get("Cookie");
                        }
                        return arrayList2;
                    } catch (Throwable unused2) {
                        return arrayList2;
                    }
                }
                return arrayList2;
            }
        }
        return null;
    }
}
