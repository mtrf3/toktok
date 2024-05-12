package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDisableLynxKitInitAndroidSetting;
import com.bytedance.android.livesdk.lynx.ILiveLynxService;
import com.bytedance.android.livesdk.lynx.bridge.TTLiveLynxBridgeModule;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.jsbridge.LynxModule;
import com.lynx.tasm.TemplateData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.CgR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31955CgR extends CNX {
    public VNS LJLJL;
    public C29265Be9 LJLJLJ;
    public C31958CgU LJLJLLL;
    public InterfaceC31964Cga LJLL;
    public C38129Exp LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;

    @Override // X.CNX
    public final void LIZIZ() {
        String LIZIZ;
        String str;
        Object obj;
        C60537NpN c60537NpN;
        java.util.Map<? extends String, ? extends Object> map;
        java.util.Map<String, ? extends Object> map2;
        C76800UCe c76800UCe;
        String queryParameter;
        Integer LJJIL;
        VNS vns = null;
        C60541NpR c60541NpR = new C60541NpR(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bridge", new C31970Cgg((Class<? extends LynxModule>) TTLiveLynxBridgeModule.class, this.LJLLI));
        c60541NpR.LJLLILLLL = linkedHashMap;
        c60541NpR.LJLLJ = (List) C31896CfU.LIZ.getValue();
        c60541NpR.LJLJJL = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
        c60541NpR.LJLJJI = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
        String url = this.LJLILLLLZI.getUrl();
        if (!o.LJJJJJL(url)) {
            android.net.Uri parse = UriProtector.parse(url);
            if (parse == null || (LIZIZ = UriProtector.getQueryParameter(parse, "business_type")) == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unspecified-");
                LIZ.append(this.LJLJI);
                LIZIZ = X1D.LIZIZ(LIZ);
            }
        } else {
            C0K2.LJII(0, "ttlive_lynx_business_type_not_specified", C51029K0z.LJJIIZI(new OSZ("url", url)));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("unspecified-");
            LIZ2.append(this.LJLJI);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        kotlin.jvm.internal.o.LJIIIIZZ(LIZIZ, "if (url.isNotBlank()) {\n…inerId\"\n                }");
        c60541NpR.LJLIL = C60682Nri.LIZ(LIZIZ, this.LJLILLLLZI.getEnableCanvas());
        C29265Be9 c29265Be9 = this.LJLJLJ;
        if (c29265Be9 != null) {
            str = c29265Be9.LIZIZ;
        } else {
            str = null;
        }
        C31961CgX c31961CgX = new C31961CgX();
        c31961CgX.LIZ = TemplateData.LJFF(str);
        if (!TextUtils.isEmpty(this.LJLILLLLZI.getInitialData())) {
            c31961CgX.LIZ.LJI("initial_data", C75272xP.LIZ(new JSONObject(this.LJLILLLLZI.getInitialData())));
        }
        c60541NpR.LJLLL = c31961CgX;
        ((ArrayList) c60541NpR.LJLLI).add(new C31931Cg3(this));
        c60541NpR.LJLJL = new C31956CgS(this, url);
        try {
            android.net.Uri parse2 = UriProtector.parse(this.LJLILLLLZI.getOriginUri());
            if (parse2 != null && (queryParameter = UriProtector.getQueryParameter(parse2, "thread_strategy")) != null && (LJJIL = C38350F3i.LJJIL(queryParameter)) != null) {
                int intValue = LJJIL.intValue();
                C60303Nlb c60303Nlb = new C60303Nlb();
                c60303Nlb.LIZIZ = Integer.valueOf(intValue);
                c60541NpR.LJLLLL = c60303Nlb;
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        C29265Be9 c29265Be92 = this.LJLJLJ;
        if (c29265Be92 != null && (map2 = c29265Be92.LIZJ) != null) {
            obj = map2.get("__globalProps");
        } else {
            obj = null;
        }
        if ((obj instanceof java.util.Map) && (map = (java.util.Map) obj) != null) {
            c60541NpR.LJLL.putAll(map);
        }
        C31958CgU c31958CgU = this.LJLJLLL;
        if (c31958CgU != null) {
            c31958CgU.LIZ.LIZIZ(C60541NpR.class, c60541NpR);
            C31958CgU c31958CgU2 = this.LJLJLLL;
            if (c31958CgU2 != null) {
                C60308Nlg c60308Nlg = new C60308Nlg("live", c31958CgU2);
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC60316Nlo interfaceC60316Nlo = (InterfaceC60316Nlo) C60299NlX.LIZ(c60308Nlg, InterfaceC60316Nlo.class);
                if (interfaceC60316Nlo != null) {
                    c60537NpN = interfaceC60316Nlo.LJIJI(c60308Nlg);
                } else {
                    c60537NpN = null;
                }
                this.LJLL = c60537NpN;
                C31933Cg5.LIZ(currentTimeMillis);
                C38129Exp c38129Exp = this.LJLLI;
                if (c38129Exp != null) {
                    c38129Exp.LJIILIIL = this.LJLL;
                }
                InterfaceC31964Cga interfaceC31964Cga = this.LJLL;
                if (interfaceC31964Cga != null) {
                    vns = interfaceC31964Cga.LIZJ();
                }
                kotlin.jvm.internal.o.LJII(vns, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
                this.LJLJL = vns;
                OFH ofh = OFH.LIZLLL;
                String containerId = this.LJLILLLLZI.getContainerId();
                COL col = new COL(vns, "lynx");
                ofh.getClass();
                OFH.LIZ(containerId, col);
                return;
            }
            kotlin.jvm.internal.o.LJIJI("serviceContext");
            throw null;
        }
        kotlin.jvm.internal.o.LJIJI("serviceContext");
        throw null;
    }

    @Override // X.CNX
    public final C31886CfK LIZJ() {
        C38129Exp c38129Exp = new C38129Exp(new AqS155S0100000_5(this, 334));
        c38129Exp.LJIILJJIL = new AqS171S0100000_5(this, 665);
        this.LJLLI = c38129Exp;
        return C31886CfK.LJ(this.LJLIL, c38129Exp);
    }

    @Override // X.CNX
    public final void LJFF() {
        this.LJLJLJ = new C29265Be9(new AqS171S0100000_5(this, 666));
    }

    @Override // X.CNX
    public final void release() {
        InterfaceC31964Cga interfaceC31964Cga = this.LJLL;
        if (interfaceC31964Cga != null) {
            interfaceC31964Cga.destroy();
        }
        super.release();
    }

    static {
        if (!LiveDisableLynxKitInitAndroidSetting.getValue()) {
            ((ILiveLynxService) CN1.LIZ(ILiveLynxService.class)).Mn();
        }
        C61590OFe.LIZ(C31960CgW.LIZ);
    }

    @Override // X.CNX
    public final void LJ() {
        VNS vns;
        LJFF();
        C31886CfK LIZJ = LIZJ();
        this.LJLJJLL = LIZJ;
        LJII(LIZJ);
        LIZIZ();
        if (!this.LJLILLLLZI.getLandscapeAsPortrait() || this.LJLIL.getRequestedOrientation() != 0 || (vns = this.LJLJL) == null) {
            return;
        }
        vns.updateScreenMetrics(C15380j0.LJIIJJI(), C15380j0.LJIIL());
    }

    @Override // X.CNX
    public final /* bridge */ /* synthetic */ View re() {
        return this.LJLJL;
    }

    @Override // X.CNX
    public final void LJII(C31886CfK c31886CfK) {
        this.LJLJLLL = new C31958CgU(this.LJLIL, ((Boolean) COA.LIZIZ.getValue()).booleanValue());
    }

    public final java.util.Map<String, Object> LJIIIZ(OSZ<String, ? extends Object>... oszArr) {
        OSZ[] oszArr2 = new OSZ[5];
        boolean z = false;
        oszArr2[0] = new OSZ("ts", Long.valueOf(System.currentTimeMillis()));
        if (this.LJLLJ < 2) {
            z = true;
        }
        oszArr2[1] = new OSZ("isFirstTime", Boolean.valueOf(z));
        oszArr2[2] = new OSZ("offline", Integer.valueOf(this.LJLLILLLL));
        oszArr2[3] = new OSZ("template_url", this.LJLILLLLZI.getUrl());
        oszArr2[4] = new OSZ("path", UriProtector.parse(this.LJLILLLLZI.getUrl()).getPath());
        java.util.Map<String, Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr2);
        C113554cx.LJJLIIIJL(LJJLIIIIJ, oszArr);
        return LJJLIIIIJ;
    }

    @Override // X.CNX
    public final void loadUrl(String url) {
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        this.LJLLJ++;
        InterfaceC31964Cga interfaceC31964Cga = this.LJLL;
        if (interfaceC31964Cga != null) {
            interfaceC31964Cga.load(url);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31955CgR(ActivityC45651qj activityC45651qj, HybridConfig config, String containerId, COW cow) {
        super(activityC45651qj, config, containerId, cow);
        kotlin.jvm.internal.o.LJIIIZ(config, "config");
        kotlin.jvm.internal.o.LJIIIZ(containerId, "containerId");
    }
}
