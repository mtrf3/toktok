package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveForceLynxFallback;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* renamed from: X.Cg4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31932Cg4 extends LynxViewClient {
    public final /* synthetic */ C31954CgQ LIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        this.LIZ.LJLLLLLL = System.currentTimeMillis();
        C31954CgQ c31954CgQ = this.LIZ;
        long j = c31954CgQ.LJLLLLLL - c31954CgQ.LJLLLL;
        OSZ<String, ? extends Object>[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ<>("ev_type", "performance");
        JSONObject jSONObject = new JSONObject();
        C31954CgQ c31954CgQ2 = this.LIZ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("initStart", c31954CgQ2.LJLLL);
        jSONObject2.put("pageStart", c31954CgQ2.LJLLLL);
        jSONObject2.put("loadEnd", c31954CgQ2.LJLZ);
        jSONObject2.put("firstScreen", c31954CgQ2.LJLLLLLL);
        jSONObject.put("navigation", jSONObject2);
        LynxPerfMetric lynxPerfMetric = c31954CgQ2.LJLLJ;
        if (lynxPerfMetric != null) {
            jSONObject.put("performance", lynxPerfMetric.toJSONObject());
        }
        oszArr[1] = new OSZ<>("event", jSONObject);
        java.util.Map<String, Object> LIZ = c31954CgQ.LIZ(oszArr);
        LynxEnv.LJIIIZ().getClass();
        LIZ.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJIIL(j, 0, "ttlive_lynx_first_screen", LIZ);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        C31954CgQ c31954CgQ = this.LIZ;
        c31954CgQ.LJLLI = true;
        c31954CgQ.LJLZ = System.currentTimeMillis();
        C31954CgQ c31954CgQ2 = this.LIZ;
        InterfaceC31935Cg7 interfaceC31935Cg7 = c31954CgQ2.LJLJI;
        if (interfaceC31935Cg7 != null) {
            interfaceC31935Cg7.Xh(c31954CgQ2.LJLJJLL);
        }
        C31954CgQ c31954CgQ3 = this.LIZ;
        C31933Cg5.LJ(c31954CgQ3.LJLZ - c31954CgQ3.LJLLLL, 0, c31954CgQ3.LIZ(new OSZ[0]));
    }

    public C31932Cg4(C31954CgQ c31954CgQ) {
        this.LIZ = c31954CgQ;
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC79290V9y
    public final String LIZIZ(String str) {
        int i;
        if (!TextUtils.isEmpty(str) && str != null && o.LJJJLIIL(str, "app://", false)) {
            String substring = str.substring(6);
            kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("res:///");
            LIZ.append(substring);
            return X1D.LIZIZ(LIZ);
        }
        String str2 = null;
        if (!TextUtils.isEmpty(str) && ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).GG(null, str) != null) {
            if (str != null) {
                i = s.LJJLIIIJL(str, "tiktok_live_lynx", 0, false, 6);
            } else {
                i = -1;
            }
            String f50 = ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).f50();
            if (f50 != null && i > 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("file://");
                LIZ2.append(f50);
                LIZ2.append('/');
                if (str != null) {
                    str2 = str.substring(i + 16);
                    kotlin.jvm.internal.o.LJIIIIZZ(str2, "this as java.lang.String).substring(startIndex)");
                }
                LIZ2.append(str2);
                return X1D.LIZIZ(LIZ2);
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
        C31954CgQ c31954CgQ = this.LIZ;
        c31954CgQ.LJLLJ = lynxPerfMetric;
        c31954CgQ.S2(C113554cx.LJJL(new OSZ("perfBaseTimeStamp", String.valueOf(System.currentTimeMillis())), new OSZ("perf", lynxPerfMetric)), "perf");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ(String str) {
        this.LIZ.LJLZ = System.currentTimeMillis();
        C31954CgQ c31954CgQ = this.LIZ;
        c31954CgQ.LJLLI = true;
        InterfaceC31935Cg7 interfaceC31935Cg7 = c31954CgQ.LJLJI;
        if (interfaceC31935Cg7 != null) {
            interfaceC31935Cg7.LLLZIL();
        }
        C31954CgQ c31954CgQ2 = this.LIZ;
        C31933Cg5.LJ(c31954CgQ2.LJLZ - c31954CgQ2.LJLLLL, 1, c31954CgQ2.LIZ(new OSZ<>("err_msg", str)));
        long currentTimeMillis = System.currentTimeMillis();
        C31954CgQ c31954CgQ3 = this.LIZ;
        C31933Cg5.LIZLLL(currentTimeMillis - c31954CgQ3.LJLLLL, c31954CgQ3.LIZ(new OSZ<>("err_msg", str), new OSZ<>("type", 0)));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        if (this.LIZ.LJZL && LiveForceLynxFallback.INSTANCE.getValue()) {
            InterfaceC31935Cg7 interfaceC31935Cg7 = this.LIZ.LJLJI;
            if (interfaceC31935Cg7 != null) {
                interfaceC31935Cg7.LLLZIL();
                return;
            }
            return;
        }
        this.LIZ.LJLLLL = System.currentTimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        C31954CgQ c31954CgQ = this.LIZ;
        C31933Cg5.LJFF(currentTimeMillis - c31954CgQ.LJLLL, c31954CgQ.LIZ(new OSZ[0]));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        CXL cxl = CXL.LOAD_FAILED;
        String LIZ = lynxError.LIZ();
        if (LIZ == null) {
            LIZ = "";
        }
        C31933Cg5.LIZIZ(cxl, LIZ, this.LIZ.LJLL, lynxError.LIZ);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJI(String str) {
        java.util.Map<String, Object> LIZ = this.LIZ.LIZ(new OSZ<>("err_log", str));
        LynxEnv.LJIIIZ().getClass();
        LIZ.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJII(0, "ttlive_lynx_error", LIZ);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(LynxPerfMetric lynxPerfMetric) {
        C31954CgQ c31954CgQ = this.LIZ;
        c31954CgQ.LJLLILLLL = lynxPerfMetric;
        JSONObject jSONObject = new JSONObject();
        C31954CgQ c31954CgQ2 = this.LIZ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("initStart", c31954CgQ2.LJLLL);
        jSONObject2.put("pageStart", c31954CgQ2.LJLLLL);
        jSONObject2.put("loadEnd", c31954CgQ2.LJLZ);
        jSONObject2.put("firstScreen", c31954CgQ2.LJLLLLLL);
        jSONObject.put("navigation", jSONObject2);
        jSONObject.put("performance", lynxPerfMetric.toJSONObject());
        java.util.Map<String, Object> LIZ = c31954CgQ.LIZ(new OSZ<>("ev_type", "performance"), new OSZ<>("event", jSONObject));
        LynxEnv.LJIIIZ().getClass();
        LIZ.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJII(0, "ttlive_lynx_update_page", LIZ);
    }
}
