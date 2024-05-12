package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ehb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37123Ehb implements InterfaceC38613FDl, IHostLogDepend {
    @Override // X.InterfaceC38613FDl
    public void LJII(String str, EnumC38627FDz cacheType) {
        o.LJIIIZ(cacheType, "cacheType");
    }

    @Override // X.InterfaceC38613FDl
    public void LJIIJ(String layoutName) {
        o.LJIIIZ(layoutName, "layoutName");
    }

    public static void LJIJ() {
        String str;
        if (F5T.LIZLLL) {
            Keva repo = KevaImpl.getRepo("dynamic_task_triggered", 0);
            o.LJIIIIZZ(repo, "getKevaRepo()");
            java.util.Map<String, ?> all = repo.getAll();
            o.LJIIIIZZ(all, "taskTriggeredRepo\n            .all");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                C36455ESl LIZ = C36454ESk.LIZ((String) entry.getValue());
                if (LIZ != null) {
                    arrayList.add(new OSZ(key, LIZ));
                }
            }
            for (Map.Entry entry2 : C113554cx.LJJLIIIJLJLI(arrayList).entrySet()) {
                List<String> list = ((C36455ESl) entry2.getValue()).LIZ;
                if (!list.isEmpty()) {
                    String str2 = (String) entry2.getKey();
                    if (list.size() == 1 && (str = (String) ORZ.LJLLJ(list)) != null && str.startsWith("com.ss.android.ugc.aweme.dflanguage")) {
                        if (ujb.o.LJJJLIIL(str2, "df_language", false)) {
                            str2 = str2.substring(12);
                            o.LJIIIIZZ(str2, "this as java.lang.String).substring(startIndex)");
                        }
                        Locale locale = new Locale(str2);
                        if (!C37130Ehi.LJIIL(locale)) {
                            F5Q f5q = new F5Q();
                            f5q.LIZ = false;
                            f5q.LJ = true;
                            new C37130Ehi(new C37124Ehc(locale, true, true, null, new F5R(f5q))).LJIIIZ();
                        }
                    } else {
                        java.util.Set LLJJ = ORZ.LLJJ(C36976EfE.LIZ());
                        ArrayList arrayList2 = new ArrayList();
                        for (String str3 : list) {
                            if (!LLJJ.contains(str3)) {
                                arrayList2.add(str3);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            String str4 = (String) ORZ.LJLLJ(arrayList2);
                            F5Q f5q2 = new F5Q();
                            f5q2.LIZ = false;
                            f5q2.LJ = true;
                            f5q2.LJII = ORZ.LJLJJLL(arrayList2, 0);
                            new C37129Ehh(new C37122Eha(str4, true, false, true, null, new F5R(f5q2), 4)).LJIIIZ();
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC38613FDl
    public void LIZ(String layoutName) {
        o.LJIIJ(layoutName, "layoutName");
    }

    @Override // X.InterfaceC38613FDl
    public void LIZLLL(String layoutName) {
        o.LJIIJ(layoutName, "layoutName");
    }

    @Override // X.InterfaceC38613FDl
    public void LJFF(String layoutName) {
        o.LJIIJ(layoutName, "layoutName");
    }

    @Override // X.InterfaceC38613FDl
    public void LJI(C37127Ehf cacheInfo) {
        o.LJIIJ(cacheInfo, "cacheInfo");
    }

    @Override // X.InterfaceC38613FDl
    public void LJIILIIL(String layoutName) {
        o.LJIIJ(layoutName, "layoutName");
    }

    @Override // X.InterfaceC38613FDl
    public void LJIILL(C37127Ehf cacheInfo) {
        o.LJIIJ(cacheInfo, "cacheInfo");
    }

    @Override // X.InterfaceC38613FDl
    public void LJIILLIIL(String layoutName) {
        o.LJIIJ(layoutName, "layoutName");
    }

    public static void LJIIZILJ(String str, boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            jSONObject.put("name", str);
            jSONObject.put("status", i);
            FMX.LJIILLIIL("df_load_state", jSONObject);
            C09900aA.LJIIJJI("df_load_state", i, jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC38613FDl
    public void LIZJ(C37127Ehf cacheInfo, FEF reason) {
        o.LJIIJ(cacheInfo, "cacheInfo");
        o.LJIIJ(reason, "reason");
    }

    @Override // X.InterfaceC38613FDl
    public void LJ(String str, EnumC38627FDz cacheType) {
        o.LJIIJ(cacheType, "cacheType");
    }

    @Override // X.InterfaceC38613FDl
    public void LJIIIIZZ(C37127Ehf cacheInfo, FEF reason) {
        o.LJIIJ(cacheInfo, "cacheInfo");
        o.LJIIJ(reason, "reason");
    }

    @Override // X.InterfaceC38613FDl
    public void LJIIIZ(String layoutName, Throwable th) {
        o.LJIIIZ(layoutName, "layoutName");
        LJIJI(layoutName, "onRelayError", th);
    }

    @Override // X.InterfaceC38613FDl
    public void LJIIL(String layoutName, Throwable th) {
        o.LJIIIZ(layoutName, "layoutName");
        LJIJI(layoutName, "onPreloadError", th);
    }

    @Override // X.InterfaceC38613FDl
    public void LJIILJJIL(String layoutName, Throwable th) {
        o.LJIIIZ(layoutName, "layoutName");
        LJIJI(layoutName, "onAttachActivityError", th);
    }

    @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend
    public void onEventV3Map(String eventName, java.util.Map map) {
        o.LJIIIZ(eventName, "eventName");
        FMX.LJIIL(eventName, map);
    }

    public static void LJIJI(String str, String str2, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UltimateInflater-");
        LIZ.append(str2);
        LIZ.append('(');
        LIZ.append(str);
        LIZ.append(')');
        FMW.LIZLLL(X1D.LIZIZ(LIZ), "TTUltimateInflaterMonitorImpl", str2, "", th);
    }

    @Override // X.InterfaceC38613FDl
    public void LIZIZ(String str, EnumC38627FDz cacheType, Throwable th) {
        o.LJIIIZ(cacheType, "cacheType");
        LJIJI(str, "onInflateError", th);
    }

    @Override // X.InterfaceC38613FDl
    public void LJIIJJI(String str, Context activityContext, EnumC37128Ehg reason) {
        o.LJIIJ(activityContext, "activityContext");
        o.LJIIJ(reason, "reason");
    }
}
