package X;

import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxPerfMetric;
import org.json.JSONObject;

/* renamed from: X.CgQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31954CgQ implements CO7 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public InterfaceC31935Cg7 LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final VNS LJLJJLL;
    public final C29265Be9 LJLJL;
    public final C31886CfK LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public boolean LJLLI;
    public LynxPerfMetric LJLLILLLL;
    public LynxPerfMetric LJLLJ;
    public long LJLLL;
    public long LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public final C31958CgU LJZ;
    public InterfaceC31964Cga LJZI;
    public final boolean LJZL;

    @Override // X.CO7
    public final void reload() {
    }

    static {
        C61590OFe.LIZ(C31959CgV.LIZ);
    }

    @Override // X.CO7
    public final void release() {
        this.LJLJL.getClass();
        InterfaceC31964Cga interfaceC31964Cga = this.LJZI;
        if (interfaceC31964Cga != null) {
            interfaceC31964Cga.destroy();
        }
        this.LJLJLJ.release();
        Object obj = null;
        this.LJLJI = null;
        int i = !this.LJLLI ? 1 : 0;
        OSZ<String, ? extends Object>[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ<>("ev_type", "performance");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("initStart", this.LJLLL);
        jSONObject2.put("pageStart", this.LJLLLL);
        jSONObject2.put("loadEnd", this.LJLZ);
        jSONObject2.put("firstScreen", this.LJLLLLLL);
        jSONObject.put("navigation", jSONObject2);
        LynxPerfMetric lynxPerfMetric = this.LJLLILLLL;
        if (lynxPerfMetric != null) {
            obj = lynxPerfMetric.toJSONObject();
        }
        jSONObject.put("performance", obj);
        oszArr[1] = new OSZ<>("event", jSONObject);
        java.util.Map<String, Object> LIZ = LIZ(oszArr);
        LynxEnv.LJIIIZ().getClass();
        LIZ.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJII(i, "ttlive_lynx_overview_service", LIZ);
    }

    @Override // X.CO7
    public final /* bridge */ /* synthetic */ C31886CfK F4() {
        return this.LJLJLJ;
    }

    @Override // X.CO7
    public final /* bridge */ /* synthetic */ VNS G1() {
        return this.LJLJJLL;
    }

    @Override // X.CO7
    public final View re() {
        return this.LJLJJLL;
    }

    public final java.util.Map<String, Object> LIZ(OSZ<String, ? extends Object>... oszArr) {
        OSZ[] oszArr2 = new OSZ[5];
        boolean z = false;
        oszArr2[0] = new OSZ("ts", Long.valueOf(System.currentTimeMillis()));
        if (this.LJLJJL < 2) {
            z = true;
        }
        oszArr2[1] = new OSZ("isFirstTime", Boolean.valueOf(z));
        oszArr2[2] = new OSZ("offline", Integer.valueOf(this.LJLJJI));
        oszArr2[3] = new OSZ("template_url", this.LJLL);
        oszArr2[4] = new OSZ("path", this.LJLJLLL);
        java.util.Map<String, Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr2);
        C113554cx.LJJLIIIJL(LJJLIIIIJ, oszArr);
        return LJJLIIIIJ;
    }

    public final void LIZIZ(String str) {
        this.LJLLL = System.currentTimeMillis();
        if (str.length() > 0) {
            LIZJ(str);
            this.LJLJJL++;
            InterfaceC31964Cga interfaceC31964Cga = this.LJZI;
            if (interfaceC31964Cga != null) {
                interfaceC31964Cga.load(str);
            }
        }
    }

    public final void LIZJ(String str) {
        Object LIZ;
        this.LJLL = str;
        try {
            LIZ = UriProtector.parse(str).getPath();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str2 = (String) LIZ;
        if (str2 == null) {
            str2 = "";
        }
        this.LJLJLLL = str2;
    }

    @Override // X.CO7
    public final void loadUrl(String str) {
        LIZIZ(str);
    }

    @Override // X.COJ
    public final void S2(Object obj, String str) {
        C38113ExZ c38113ExZ = this.LJLJLJ.LJLILLLLZI;
        if (c38113ExZ.LJFF) {
            IllegalStateException illegalStateException = new IllegalStateException("JsBridge2 is already released!!!");
            if (C1A7.LJLIL) {
                throw illegalStateException;
            }
        }
        c38113ExZ.LIZ.LJIILL(obj, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:1|(1:3)|4|(1:6)|7|(1:9)|10|(1:12)|13|(1:15)|16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)(1:91)|28|(1:90)(1:30)|31|(4:33|(1:35)(1:86)|36|(20:38|39|(2:41|(1:84))(1:85)|45|(1:47)(1:83)|48|(1:50)|51|52|53|(1:80)(1:59)|60|61|(1:65)|66|(1:68)(1:78)|69|(1:71)|72|(2:74|75)(1:77)))|87|39|(0)(0)|45|(0)(0)|48|(0)|51|52|53|(1:55)|80|60|61|(2:63|65)|66|(0)(0)|69|(0)|72|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ed, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C31954CgQ(X.ActivityC45651qj r12, java.lang.String r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, X.InterfaceC31935Cg7 r17, boolean r18, java.lang.String r19, int r20) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31954CgQ.<init>(X.1qj, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, X.Cg7, boolean, java.lang.String, int):void");
    }
}
