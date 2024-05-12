package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.O0e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61200O0e {
    public static Application LIZIZ;
    public static C61200O0e LJI;
    public final C58590Mz4 LIZ;
    public static final LinkedHashMap<String, InterfaceC61208O0m> LIZJ = new LinkedHashMap<>();
    public static final java.util.Set<InterfaceC56420MCi> LIZLLL = new LinkedHashSet();
    public static InterfaceC39467FeJ LJ = null;
    public static boolean LJFF = false;
    public static boolean LJII = false;

    public static void LIZJ() {
        if (LJFF) {
            return;
        }
        synchronized (LIZJ) {
            Iterator<InterfaceC56420MCi> it = LIZLLL.iterator();
            while (it.hasNext()) {
                it.next().initialize();
            }
            LJFF = true;
        }
    }

    public static C61200O0e LIZLLL() {
        C61200O0e c61200O0e = LJI;
        if (c61200O0e != null) {
            return c61200O0e;
        }
        throw new RuntimeException("RouterManager need init first before use!");
    }

    public C61200O0e(AwemeHostApplication awemeHostApplication) {
        LIZIZ = awemeHostApplication;
        this.LIZ = new C58590Mz4();
    }

    public static boolean LIZIZ(InterfaceC61208O0m interfaceC61208O0m) {
        if (interfaceC61208O0m == null) {
            return false;
        }
        return true;
    }

    public final boolean LJII(String str) {
        InterfaceC61208O0m interfaceC61208O0m;
        C1A7.LJJIJIIJI(str);
        boolean[] zArr = new boolean[1];
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), str);
        buildRoute.withCallback(new C61203O0h(this, zArr));
        buildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC39467FeJ interfaceC39467FeJ = LJ;
            if (interfaceC39467FeJ != null) {
                str = interfaceC39467FeJ.LIZ(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it = LIZJ.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (C30591Hz.LJIL(next, str)) {
                        interfaceC61208O0m = LIZJ.get(next);
                        break;
                    }
                } else {
                    interfaceC61208O0m = null;
                    break;
                }
            }
            if (!LIZIZ(interfaceC61208O0m)) {
                LJ(str, false);
                return false;
            }
            zArr[0] = interfaceC61208O0m.open(str);
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }

    public static void LIZ(Class cls, String str) {
        C61199O0d c61199O0d = new C61199O0d(LIZIZ, cls, str);
        c61199O0d.LJLJJL = LJII;
        LinkedHashMap<String, InterfaceC61208O0m> linkedHashMap = LIZJ;
        if (linkedHashMap.get(str) == null) {
            linkedHashMap.put(str, c61199O0d);
        }
    }

    public static void LJ(String str, boolean z) {
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "smartrouter";
            } else {
                str2 = "all";
            }
            jSONObject.put("type", str2);
            jSONObject.put("open_url", str);
            C09900aA.LJI("in_app_router_no_matched", null, null, jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void LJFF(String str, HashMap hashMap) {
        InterfaceC61208O0m interfaceC61208O0m;
        C1A7.LJJIJIIJI(str);
        C39061g6 c39061g6 = new C39061g6(str);
        for (Map.Entry entry : hashMap.entrySet()) {
            c39061g6.LIZIZ((String) entry.getKey(), (String) entry.getValue());
        }
        String LIZJ2 = c39061g6.LIZJ();
        boolean[] zArr = new boolean[1];
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), LIZJ2);
        buildRoute.withCallback(new C61205O0j(this, zArr));
        buildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC39467FeJ interfaceC39467FeJ = LJ;
            if (interfaceC39467FeJ != null) {
                str = interfaceC39467FeJ.LIZ(str);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Iterator<String> it = LIZJ.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (C30591Hz.LJIL(next, str)) {
                        interfaceC61208O0m = LIZJ.get(next);
                        break;
                    }
                } else {
                    interfaceC61208O0m = null;
                    break;
                }
            }
            if (!LIZIZ(interfaceC61208O0m)) {
                LJ(LIZJ2, false);
                return;
            }
            zArr[0] = interfaceC61208O0m.open(LIZJ2);
        }
        if (zArr[0]) {
            return;
        }
        LJ(LIZJ2, false);
    }

    public final boolean LJI(Activity activity, String str) {
        InterfaceC61208O0m interfaceC61208O0m;
        C1A7.LJJIJIIJI(str);
        boolean[] zArr = new boolean[1];
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, str);
        buildRoute.withCallback(new C61202O0g(this, zArr));
        buildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC39467FeJ interfaceC39467FeJ = LJ;
            if (interfaceC39467FeJ != null) {
                str = interfaceC39467FeJ.LIZ(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it = LIZJ.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (C30591Hz.LJIL(next, str)) {
                        interfaceC61208O0m = LIZJ.get(next);
                        break;
                    }
                } else {
                    interfaceC61208O0m = null;
                    break;
                }
            }
            if (!LIZIZ(interfaceC61208O0m)) {
                LJ(str, false);
                return false;
            }
            zArr[0] = interfaceC61208O0m.LIZ(activity, str);
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }

    public final boolean LJIIJ(Bundle bundle, String str) {
        InterfaceC61208O0m interfaceC61208O0m;
        boolean[] zArr = new boolean[1];
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), str);
        buildRoute.withParam(bundle);
        buildRoute.withCallback(new C61204O0i(this, zArr));
        buildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC39467FeJ interfaceC39467FeJ = LJ;
            if (interfaceC39467FeJ != null) {
                str = interfaceC39467FeJ.LIZ(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it = LIZJ.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (C30591Hz.LJIL(next, str)) {
                        interfaceC61208O0m = LIZJ.get(next);
                        break;
                    }
                } else {
                    interfaceC61208O0m = null;
                    break;
                }
            }
            if (!LIZIZ(interfaceC61208O0m)) {
                LJ(str, false);
                return false;
            }
            zArr[0] = interfaceC61208O0m.open(str);
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }

    public final boolean LJIIIIZZ(int i, Activity activity, String str) {
        InterfaceC61208O0m interfaceC61208O0m;
        C1A7.LJJIJIIJI(str);
        boolean[] zArr = new boolean[1];
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, str);
        buildRoute.withCallback(new C61206O0k(this, zArr));
        buildRoute.open(i);
        if (!zArr[0]) {
            LIZJ();
            InterfaceC39467FeJ interfaceC39467FeJ = LJ;
            if (interfaceC39467FeJ != null) {
                str = interfaceC39467FeJ.LIZ(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it = LIZJ.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (C30591Hz.LJIL(next, str)) {
                        interfaceC61208O0m = LIZJ.get(next);
                        break;
                    }
                } else {
                    interfaceC61208O0m = null;
                    break;
                }
            }
            if (!LIZIZ(interfaceC61208O0m)) {
                LJ(str, false);
                return false;
            }
            if (interfaceC61208O0m instanceof C61199O0d) {
                C61199O0d c61199O0d = (C61199O0d) interfaceC61208O0m;
                C61207O0l c61207O0l = new C61207O0l();
                c61207O0l.LIZLLL = 1;
                c61207O0l.LIZ = 0;
                c61207O0l.LIZIZ = 0;
                c61207O0l.LIZJ = i;
                c61199O0d.LJLJJI = c61207O0l;
                zArr[0] = c61199O0d.LIZIZ(activity, str);
            } else {
                zArr[0] = interfaceC61208O0m.LIZ(activity, str);
            }
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }

    public final boolean LJIIIZ(Activity activity, String str, Bundle bundle) {
        InterfaceC61208O0m interfaceC61208O0m;
        boolean[] zArr = new boolean[1];
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, str);
        buildRoute.withParam(bundle);
        buildRoute.withCallback(new C61201O0f(this, zArr));
        buildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC39467FeJ interfaceC39467FeJ = LJ;
            if (interfaceC39467FeJ != null) {
                str = interfaceC39467FeJ.LIZ(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it = LIZJ.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (C30591Hz.LJIL(next, str)) {
                        interfaceC61208O0m = LIZJ.get(next);
                        break;
                    }
                } else {
                    interfaceC61208O0m = null;
                    break;
                }
            }
            if (!LIZIZ(interfaceC61208O0m)) {
                LJ(str, false);
                return false;
            }
            zArr[0] = interfaceC61208O0m.LIZ(activity, str);
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }
}
