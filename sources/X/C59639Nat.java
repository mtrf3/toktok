package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nat, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59639Nat {
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C59641Nav.LJLIL);
    public final Thread.UncaughtExceptionHandler LIZ;
    public final List<String> LIZIZ;
    public final java.util.Map<String, C59866NeY> LIZJ;
    public final OJD LIZLLL;
    public final C5H3 LJ;
    public final C59750Ncg LJFF;
    public final C59879Nel LJI;

    public static HybridMonitorConfig LIZLLL() {
        try {
            return C2YJ.LIZIZ.LIZ.getHybridMonitorConfig();
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public C59639Nat() {
        C59644Nay c59644Nay = new C59644Nay(this);
        this.LIZ = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(c59644Nay);
        this.LIZIZ = new ArrayList();
        this.LIZJ = new LinkedHashMap();
        new ConcurrentHashMap();
        this.LIZLLL = new OJD("Chrome/(\\d+.\\d+.\\d+.\\d+)");
        this.LJ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS159S0100000_9(this, 761));
        this.LJFF = new C59750Ncg();
        this.LJI = new C59879Nel(this);
    }

    public static String LJ(C59273NOb c59273NOb) {
        if (c59273NOb != null) {
            long j = c59273NOb.LIZ;
            int i = c59273NOb.LJJIII;
            if (j > 0) {
                if (i == 1) {
                    return "ad_floor_page";
                }
                return "ad";
            }
        }
        return null;
    }

    public final C59866NeY LIZ(boolean z) {
        C59866NeY c59866NeY = new C59866NeY(this.LJFF, this.LJI);
        c59866NeY.LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        c59866NeY.LIZIZ = z;
        c59866NeY.LIZJ = true;
        this.LIZJ.put(c59866NeY.LJJIJ(), c59866NeY);
        ((ArrayList) this.LIZIZ).add(c59866NeY.LJJIJ());
        return c59866NeY;
    }

    public final void LIZIZ(String str) {
        if (this.LIZJ.containsKey(str)) {
            C59866NeY remove = this.LIZJ.remove(str);
            if (remove != null) {
                remove.end();
            }
            ((ArrayList) this.LIZIZ).remove(str);
        }
    }

    public final String LIZJ(C59615NaV webview) {
        String str;
        o.LJIIIZ(webview, "webview");
        String userAgent = webview.getSettings().getUserAgentString();
        OJD ojd = this.LIZLLL;
        o.LJIIIIZZ(userAgent, "userAgent");
        InterfaceC59973NgH find$default = OJD.find$default(ojd, userAgent, 0, 2, null);
        if (find$default == null || find$default.LIZ().size() < 2 || (str = (String) ListProtector.get(find$default.LIZ(), 1)) == null) {
            return "not_found";
        }
        return str;
    }

    public final boolean LJFF(android.net.Uri uri) {
        try {
            if (!uri.getBooleanQueryParameter("monitor_enabled", false)) {
                String uri2 = uri.toString();
                o.LJIIIIZZ(uri2, "uri.toString()");
                Iterator it = ((List) this.LJ.getValue()).iterator();
                while (it.hasNext()) {
                    if (new OJD((String) it.next()).containsMatchIn(uri2)) {
                    }
                }
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean LJI(String url) {
        o.LJIIIZ(url, "url");
        try {
            android.net.Uri parse = UriProtector.parse(url);
            o.LJIIIIZZ(parse, "parse(url)");
            return LJFF(parse);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void LJII(C59639Nat c59639Nat, InterfaceC59585Na1 interfaceC59585Na1, String str, JSONObject jSONObject) {
        c59639Nat.getClass();
        if (interfaceC59585Na1 != null) {
            interfaceC59585Na1.LJIILJJIL("webview_safe_log", str, jSONObject, null, null);
        }
    }
}
