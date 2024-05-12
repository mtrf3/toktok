package X;

import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;
import com.ss.android.ugc.aweme.net.model.ScopeEnum;
import com.ss.android.ugc.aweme.net.model.UnexpectedConfig;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class PYR {
    public static boolean LIZLLL() {
        boolean z;
        if (((Boolean) C52746Kn0.LIZ.getValue()).booleanValue()) {
            return false;
        }
        boolean LIZJ = C36583EXj.LIZJ();
        if (PY7.LIZJ) {
            z = ((Boolean) PY7.LIZ.getValue()).booleanValue();
        } else {
            z = KevaImpl.getRepo("keva_repo_native_network_monitor", 1).getBoolean("keva_key_native_network_monitor", true);
        }
        if (!z || !PPY.LIZ().enableNetworkMonitor) {
            return false;
        }
        if (!LIZJ) {
            if (C65928Pu8.LIZIZ.LIZ().networkConfig.enabled) {
                return false;
            }
        } else {
            SettingsModel LJ = KidsSettingsServiceImpl.LJIIJJI().LJ();
            if (LJ == null) {
                LJ = new SettingsModel(null, null, false, false, false, 0L, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
            }
            if (LJ.networkConfig.enabled) {
                return false;
            }
        }
        return true;
    }

    public static void LIZ(InterfaceC58286MuA monitor) {
        o.LJIIIZ(monitor, "monitor");
        synchronized (PY7.LIZIZ) {
            LJ(C16880lQ.LJLLJ(monitor.getClass()));
            PY7.LJ.add(monitor);
        }
    }

    public static List LIZIZ(UnexpectedConfig[] unexpectedConfigArr) {
        if (unexpectedConfigArr != null) {
            ArrayList arrayList = new ArrayList();
            for (UnexpectedConfig unexpectedConfig : unexpectedConfigArr) {
                C58729N3d c58729N3d = ScopeEnum.Companion;
                int scope = unexpectedConfig.getScope();
                c58729N3d.getClass();
                if (C58729N3d.LIZ(scope)) {
                    arrayList.add(unexpectedConfig);
                }
            }
            List LLJI = ORZ.LLJI(arrayList);
            if (LLJI != null) {
                return LLJI;
            }
        }
        return C61878OQg.INSTANCE;
    }

    public static boolean LIZJ(HttpURLConnection httpURLConnection) {
        if (httpURLConnection instanceof PYU) {
            return ((PYU) httpURLConnection).LIZIZ;
        }
        if (httpURLConnection instanceof PYT) {
            return ((PYT) httpURLConnection).LIZIZ;
        }
        if (httpURLConnection == null) {
            return false;
        }
        return s.LJJJLZIJ(C16880lQ.LJLLJ(httpURLConnection.getClass()), "Cronet", false);
    }

    public static void LJ(String str) {
        CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = PY7.LJ;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC58286MuA next = it.next();
            if (o.LJ(C16880lQ.LJLLJ(next.getClass()), str)) {
                arrayList.add(next);
            }
        }
        PY7.LJ.removeAll(arrayList);
    }

    public static void LJFF(String str, String str2, Exception exc) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null && !ujb.o.LJJJJJL(str)) {
                jSONObject.put("url", str);
            }
            jSONObject.put("exception_name", C16880lQ.LJLLJ(exc.getClass()));
            String message = exc.getMessage();
            if (message == null) {
                message = "unknown";
            }
            jSONObject.put("exception_message", message);
            jSONObject.put("monitor_method", str2);
            C09900aA.LJ(EnumC58731N3f.NATIVE_NETWORK_MONITOR_EXCEPTION_LOG.getLogType(), jSONObject);
        } catch (Exception unused) {
        }
    }
}
