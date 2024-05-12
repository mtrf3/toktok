package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ph0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65114Ph0 implements InterfaceC65108Pgu {
    public static final C65114Ph0 LIZ = new C65114Ph0();

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        String str;
        if (!C19N.LJ("debug_replace_http_to_https", true)) {
            return;
        }
        Boolean cache = SharePrefCache.inst().getUseHttps().LIZ();
        o.LJIIIIZZ(cache, "cache");
        if (cache.booleanValue() && !o.LJ("vas_ad_track", c64907Pdf.LJIIIIZZ)) {
            c64907Pdf.LIZIZ.LIZ = "https";
        }
        String LIZ2 = c64907Pdf.LIZIZ.LJFF.LIZ();
        C22660uk c22660uk = c64907Pdf.LIZIZ.LJI;
        o.LJIIIIZZ(c22660uk, "request.mutableUrl.query");
        if (s.LJJJLZIJ(LIZ2, "/passport/auth/login/", false) || s.LJJJLZIJ(LIZ2, "/passport/auth/login_only/", false)) {
            String LIZJ = c22660uk.LIZJ("access_token");
            if (LIZJ == null || ujb.o.LJJJJJL(LIZJ)) {
                return;
            }
            String replaceAll = PatternProtector.compile(" ").matcher(LIZJ).replaceAll("+");
            o.LJIIIIZZ(replaceAll, "compile(\" \").matcher(token).replaceAll(\"+\")");
            c22660uk.LJ("access_token", replaceAll);
            return;
        }
        if (s.LJJJLZIJ(LIZ2, "/service/settings/v2/", false) || s.LJJJLZIJ(LIZ2, "/service/settings/v3/", false)) {
            c64907Pdf.LIZIZ.LIZLLL(EF7.LJI.LIZ);
            return;
        }
        if (s.LJJJLZIJ(LIZ2, "push/get_service_addrs", false)) {
            c64907Pdf.LIZIZ.LIZLLL(EF7.LJI.LIZ);
        }
        if (!s.LJJJLZIJ(LIZ2, "/service/settings/v2", false)) {
            return;
        }
        if (FGH.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c22660uk.LIZIZ("googleServiceEnable", str);
    }
}
