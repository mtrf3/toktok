package X;

import Y.ACallableS87S0200000_10;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NpU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60544NpU extends C60379Nmp implements InterfaceC60276NlA {
    public static final java.util.Map<String, Integer> LJLJJLL = C113554cx.LJJL(new OSZ("web", 0), new OSZ("rn", 2), new OSZ("lynx", 3), new OSZ("unknown", -1));
    public final C60545NpV LJLJI;
    public final InterfaceC60553Npd LJLJJI;
    public final C60510Now LJLJJL;

    @Override // X.InterfaceC60276NlA
    public final C60510Now LJFF() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC60276NlA
    public final void LJ(C60547NpX info) {
        o.LJIIJ(info, "info");
        C10K.LIZJ(new ACallableS87S0200000_10(info, this, 17));
    }

    @Override // X.InterfaceC60276NlA
    public final void LJJIIJZLJL(JSONObject jSONObject) {
        this.LJLJJI.LIZIZ(jSONObject);
    }

    @Override // X.C60379Nmp, X.InterfaceC60387Nmx
    public final void onRegister(String bid) {
        o.LJIIJ(bid, "bid");
        this.LJLIL = bid;
        HybridMultiMonitor.getInstance().setCustomReportMonitor(this.LJLJI);
    }

    public C60544NpU(InterfaceC60553Npd reporter, C60510Now c60510Now) {
        o.LJIIJ(reporter, "reporter");
        this.LJLJJI = reporter;
        this.LJLJJL = c60510Now;
        this.LJLJI = new C60545NpV(this);
    }

    public static JSONObject LJJIJIL(JSONObject jSONObject, JSONObject jSONObject2, Object obj) {
        JSONObject jSONObject3;
        Iterator<String> keys;
        Iterator<String> keys2;
        if (jSONObject2 != null) {
            jSONObject3 = jSONObject2;
        } else {
            jSONObject3 = new JSONObject();
        }
        if (jSONObject != null && (keys2 = jSONObject.keys()) != null) {
            while (keys2.hasNext()) {
                String next = keys2.next();
                jSONObject3.put(next, jSONObject.opt(next));
            }
        }
        if (jSONObject2 != null && (keys = jSONObject2.keys()) != null) {
            while (keys.hasNext()) {
                String next2 = keys.next();
                jSONObject3.put(next2, jSONObject2.opt(next2));
            }
        }
        if (obj != null) {
            jSONObject3.put("platform", LJLJJLL.get(obj));
        }
        return jSONObject3;
    }

    public final JSONObject LJJIJIIJIL(JSONObject jSONObject, Object obj, Object obj2) {
        String str;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("_bid", this.LJLIL);
        C60510Now c60510Now = this.LJLJJL;
        if (c60510Now != null) {
            str = c60510Now.LIZJ;
        } else {
            str = null;
        }
        jSONObject.put("_container", str);
        jSONObject.put("_bullet_sdk_version", "1.4.0-rc.2");
        jSONObject.put("hybrid_platform", obj);
        jSONObject.put("_full_url", obj2);
        C60510Now c60510Now2 = this.LJLJJL;
        if (c60510Now2 != null && (jSONObject2 = c60510Now2.LIZLLL) != null) {
            Iterator<String> keys = jSONObject2.keys();
            o.LJFF(keys, "json.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }
}
