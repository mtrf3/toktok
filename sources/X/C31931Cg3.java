package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveForceLynxFallback;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Cg3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31931Cg3 extends LynxViewClient {
    public final C31955CgR LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public LynxPerfMetric LJ;
    public boolean LJFF;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZJ = currentTimeMillis;
        long j = currentTimeMillis - this.LIZIZ;
        C31955CgR c31955CgR = this.LIZ;
        OSZ<String, ? extends Object>[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ<>("ev_type", "performance");
        JSONObject jSONObject = new JSONObject();
        JSONObject LIZLLL = Q7K.LIZLLL("initStart", 0L);
        LIZLLL.put("pageStart", this.LIZIZ);
        LIZLLL.put("loadEnd", this.LIZLLL);
        LIZLLL.put("firstScreen", this.LIZJ);
        jSONObject.put("navigation", LIZLLL);
        LynxPerfMetric lynxPerfMetric = this.LJ;
        if (lynxPerfMetric != null) {
            jSONObject.put("performance", lynxPerfMetric.toJSONObject());
        }
        oszArr[1] = new OSZ<>("event", jSONObject);
        java.util.Map<String, Object> LJIIIZ = c31955CgR.LJIIIZ(oszArr);
        LynxEnv.LJIIIZ().getClass();
        LJIIIZ.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJIIL(j, 0, "ttlive_lynx_first_screen", LJIIIZ);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        this.LIZLLL = System.currentTimeMillis();
        COW cow = this.LIZ.LJLJJI;
        if (cow != null) {
            cow.LJLLI();
        }
        C31934Cg6 c31934Cg6 = C31934Cg6.LIZIZ;
        C31955CgR c31955CgR = this.LIZ;
        c31934Cg6.LIZLLL(c31955CgR.LJLJL, c31955CgR.LJLILLLLZI.getOriginUri(), this.LIZ.LJLILLLLZI.getUrl(), this.LJFF);
        this.LJFF = false;
        C31933Cg5.LJ(this.LIZLLL - this.LIZIZ, 0, this.LIZ.LJIIIZ(new OSZ[0]));
    }

    public C31931Cg3(C31955CgR liveLynxComponent) {
        o.LJIIIZ(liveLynxComponent, "liveLynxComponent");
        this.LIZ = liveLynxComponent;
        this.LJFF = true;
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC79290V9y
    public final String LIZIZ(String str) {
        int i;
        if (!TextUtils.isEmpty(str) && str != null && ujb.o.LJJJLIIL(str, "app://", false)) {
            String substring = str.substring(6);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
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
                    o.LJIIIIZZ(str2, "this as java.lang.String).substring(startIndex)");
                }
                LIZ2.append(str2);
                return X1D.LIZIZ(LIZ2);
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
        this.LJ = lynxPerfMetric;
        C31955CgR c31955CgR = this.LIZ;
        java.util.Map LJJL = C113554cx.LJJL(new OSZ("perfBaseTimeStamp", String.valueOf(System.currentTimeMillis())), new OSZ("perf", lynxPerfMetric));
        C31886CfK c31886CfK = c31955CgR.LJLJJLL;
        if (c31886CfK != null) {
            C38113ExZ c38113ExZ = c31886CfK.LJLILLLLZI;
            if (c38113ExZ.LJFF) {
                IllegalStateException illegalStateException = new IllegalStateException("JsBridge2 is already released!!!");
                if (C1A7.LJLIL) {
                    throw illegalStateException;
                }
            }
            c38113ExZ.LIZ.LJIILL(LJJL, "perf");
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ(String str) {
        this.LIZLLL = System.currentTimeMillis();
        COW cow = this.LIZ.LJLJJI;
        if (cow != null) {
            cow.LJIL();
        }
        C31933Cg5.LJ(this.LIZLLL - this.LIZIZ, 1, this.LIZ.LJIIIZ(new OSZ<>("err_msg", str)));
        C31933Cg5.LIZLLL(System.currentTimeMillis() - this.LIZIZ, this.LIZ.LJIIIZ(new OSZ<>("err_msg", str), new OSZ<>("type", 0)));
        this.LJFF = false;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        if (((Boolean) COA.LIZIZ.getValue()).booleanValue() && LiveForceLynxFallback.INSTANCE.getValue()) {
            COW cow = this.LIZ.LJLJJI;
            if (cow != null) {
                cow.LJIL();
                return;
            }
            return;
        }
        COW cow2 = this.LIZ.LJLJJI;
        if (cow2 != null) {
            cow2.LLLLLLL(str);
        }
        if (str == null || str.length() == 0) {
            C31934Cg6 c31934Cg6 = C31934Cg6.LIZIZ;
            C31955CgR c31955CgR = this.LIZ;
            c31934Cg6.LIZ(c31955CgR.LJLJL, "gblhb_schema_error", COP.LIZIZ(c31934Cg6, c31934Cg6.LIZ, c31955CgR.LJLILLLLZI.getOriginUri(), -201, null, null, 24));
        } else {
            C31934Cg6 c31934Cg62 = C31934Cg6.LIZIZ;
            C31955CgR c31955CgR2 = this.LIZ;
            c31934Cg62.LIZ(c31955CgR2.LJLJL, "gblhb_container_start_load", COP.LIZIZ(c31934Cg62, c31934Cg62.LIZ, c31955CgR2.LJLILLLLZI.getOriginUri(), 0, null, str, 12));
        }
        this.LIZIZ = System.currentTimeMillis();
        C31933Cg5.LJFF(System.currentTimeMillis() - 0, this.LIZ.LJIIIZ(new OSZ[0]));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        this.LJFF = false;
        CXL cxl = CXL.LOAD_FAILED;
        String LIZ = lynxError.LIZ();
        if (LIZ == null) {
            LIZ = "";
        }
        C31933Cg5.LIZIZ(cxl, LIZ, this.LIZ.LJLILLLLZI.getUrl(), lynxError.LIZ);
        C31934Cg6 c31934Cg6 = C31934Cg6.LIZIZ;
        C31955CgR c31955CgR = this.LIZ;
        c31934Cg6.LIZJ(lynxError.LIZ, c31955CgR.LJLJL, c31955CgR.LJLILLLLZI.getOriginUri(), lynxError.LIZ());
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJI(String str) {
        java.util.Map<String, Object> LJIIIZ = this.LIZ.LJIIIZ(new OSZ<>("err_log", str));
        LynxEnv.LJIIIZ().getClass();
        LJIIIZ.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJII(0, "ttlive_lynx_error", LJIIIZ);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(LynxPerfMetric lynxPerfMetric) {
        C31955CgR c31955CgR = this.LIZ;
        JSONObject jSONObject = new JSONObject();
        JSONObject LIZLLL = Q7K.LIZLLL("initStart", 0L);
        LIZLLL.put("pageStart", this.LIZIZ);
        LIZLLL.put("loadEnd", this.LIZLLL);
        LIZLLL.put("firstScreen", this.LIZJ);
        jSONObject.put("navigation", LIZLLL);
        jSONObject.put("performance", lynxPerfMetric.toJSONObject());
        java.util.Map<String, Object> LJIIIZ = c31955CgR.LJIIIZ(new OSZ<>("ev_type", "performance"), new OSZ<>("event", jSONObject));
        LynxEnv.LJIIIZ().getClass();
        LJIIIZ.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJII(0, "ttlive_lynx_update_page", LJIIIZ);
    }
}
