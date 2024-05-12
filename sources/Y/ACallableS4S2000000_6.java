package Y;

import X.C141335gf;
import X.C38352F3k;
import X.C3C5;
import X.C76800UCe;
import X.F34;
import X.F37;
import X.FWC;
import X.FWF;
import X.H7B;
import X.X1D;
import X.YE1;
import android.database.sqlite.SQLiteConstraintException;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import java.io.File;
import java.net.InetAddress;
import java.net.URL;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS4S2000000_6 implements Callable {
    public final int $t;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS4S2000000_6 aCallableS4S2000000_6) {
        String LIZIZ = C38352F3k.LIZIZ(new File(aCallableS4S2000000_6.s0));
        String hostAddress = InetAddress.getByName(new URL(aCallableS4S2000000_6.s1).getHost()).getHostAddress();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedCaptionView url: ");
        YE1.LIZLLL(LIZ, aCallableS4S2000000_6.s1, " file_md5: ", LIZIZ, " ip: ");
        LIZ.append(hostAddress);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS4S2000000_6 aCallableS4S2000000_6) {
        String str = aCallableS4S2000000_6.s0;
        String str2 = aCallableS4S2000000_6.s1;
        try {
            ShowAdDataBase showAdDataBase = (ShowAdDataBase) FWC.LJFF.LIZJ();
            if (showAdDataBase != null) {
                showAdDataBase.LJIJ().LIZ(new FWF(str, str2));
                return null;
            }
            return null;
        } catch (SQLiteConstraintException | Exception unused) {
            return null;
        }
    }

    public static final Object call$2(ACallableS4S2000000_6 aCallableS4S2000000_6) {
        Object LIZ;
        String str = aCallableS4S2000000_6.s0;
        String str2 = aCallableS4S2000000_6.s1;
        try {
            String builder = UriProtector.parse(str).buildUpon().clearQuery().toString();
            o.LJIIIIZZ(builder, "parse(url).buildUpon().clearQuery().toString()");
            F37 f37 = new F37("bdx_monitor_bridge_pv");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method_name", str2);
            jSONObject.put("_full_url", str);
            f37.LIZLLL = jSONObject;
            f37.LJII = true;
            f37.LIZ = builder;
            f37.LJIIIIZZ = new F34();
            HybridMonitor.getInstance().customReport(f37.LIZ());
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        return C3C5.m6boximpl(LIZ);
    }

    public static final Object call$3(ACallableS4S2000000_6 aCallableS4S2000000_6) {
        String str;
        if (ujb.o.LJJJLIIL(aCallableS4S2000000_6.s0, "http", false)) {
            try {
                str = UriProtector.parse(aCallableS4S2000000_6.s0).buildUpon().clearQuery().toString();
                o.LJIIIIZZ(str, "parse(webUrl).buildUpon().clearQuery().toString()");
                try {
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    th = th;
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    F37 f37 = new F37("bdx_monitor_container_coverage_web_pv");
                    JSONObject jSONObject = new JSONObject();
                    String str2 = aCallableS4S2000000_6.s0;
                    String str3 = aCallableS4S2000000_6.s1;
                    jSONObject.put("web_url", str2);
                    jSONObject.put("webview_class", str3);
                    f37.LIZLLL = jSONObject;
                    f37.LIZ = str;
                    f37.LJII = true;
                    f37.LJIIIIZZ = new F34();
                    HybridMonitor.getInstance().customReport(f37.LIZ());
                    return C76800UCe.LIZ;
                }
            } catch (Throwable th2) {
                th = th2;
                str = "";
            }
            F37 f372 = new F37("bdx_monitor_container_coverage_web_pv");
            JSONObject jSONObject2 = new JSONObject();
            String str22 = aCallableS4S2000000_6.s0;
            String str32 = aCallableS4S2000000_6.s1;
            jSONObject2.put("web_url", str22);
            jSONObject2.put("webview_class", str32);
            f372.LIZLLL = jSONObject2;
            f372.LIZ = str;
            f372.LJII = true;
            f372.LJIIIIZZ = new F34();
            HybridMonitor.getInstance().customReport(f372.LIZ());
        }
        return C76800UCe.LIZ;
    }

    public ACallableS4S2000000_6(String str, String str2, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
            case 3:
                this.s0 = str;
                this.s1 = str2;
                return;
            case 1:
            default:
                this.s0 = str;
                this.s1 = str2;
                return;
        }
    }
}
