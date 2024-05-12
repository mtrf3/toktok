package X;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Etf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37871Etf implements Runnable {
    public final /* synthetic */ C35657Dz3 LJLIL;
    public final /* synthetic */ C37955Ev1 LJLILLLLZI;

    public RunnableC37871Etf(C35657Dz3 c35657Dz3, C37955Ev1 c37955Ev1) {
        this.LJLIL = c35657Dz3;
        this.LJLILLLLZI = c37955Ev1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        C3C4 c3c4;
        WebView LIZ;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bridge_name", this.LJLILLLLZI.LIZLLL);
            jSONObject.put("namespace", this.LJLILLLLZI.LJIIIIZZ);
            jSONObject.put("bridge_access", this.LJLILLLLZI.LJIILIIL);
            jSONObject.put("permission_group", this.LJLILLLLZI.LJIILJJIL);
            if (this.LJLILLLLZI.LJ.length() > 0) {
                android.net.Uri it = UriProtector.parse(this.LJLILLLLZI.LJ);
                o.LJFF(it, "it");
                jSONObject.put("host", it.getHost());
                jSONObject.put("path", it.getPath());
            } else {
                jSONObject.put("url", this.LJLILLLLZI.LJ);
            }
            for (Map.Entry<String, JSONObject> entry : this.LJLIL.LIZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<String, JSONObject> entry2 : C37876Etk.LJI.LIZ.entrySet()) {
                jSONObject.put(entry2.getKey(), entry2.getValue());
            }
            C79605VMb c79605VMb = new C79605VMb("bdx_auth_timeline_event");
            c79605VMb.LIZ = this.LJLILLLLZI.LJ;
            c79605VMb.LIZIZ = "bdxbridge_error_monitor";
            c79605VMb.LIZIZ(8);
            c79605VMb.LIZLLL = jSONObject;
            C79604VMa LIZ2 = c79605VMb.LIZ();
            InterfaceC37958Ev4 interfaceC37958Ev4 = this.LJLILLLLZI.LJJIIZI.LIZLLL;
            if (interfaceC37958Ev4 != null && (LIZ = interfaceC37958Ev4.LIZ()) != null) {
                VMI.LJ.LJIILL(LIZ, LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("report webView JSB auth fail, ");
                LIZ3.append(LIZ2);
                String msg = X1D.LIZIZ(LIZ3);
                o.LJIIJ(msg, "msg");
            } else {
                HybridMultiMonitor.getInstance().customReport(LIZ2);
            }
            C3C5.m7constructorimpl(jSONObject);
            c3c4 = jSONObject;
        } catch (Throwable th) {
            C3C4 LIZ4 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ4);
            c3c4 = LIZ4;
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c3c4);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("fail to report webView JSB auth, ");
            LIZ5.append(m10exceptionOrNullimpl.getMessage());
            C37887Etv.LIZIZ("AuthTimeEventLine", X1D.LIZIZ(LIZ5));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
