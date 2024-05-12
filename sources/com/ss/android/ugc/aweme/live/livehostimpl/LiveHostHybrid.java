package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C38083Ex5;
import X.C38113ExZ;
import X.C38116Exc;
import X.C38129Exp;
import X.C40101FoX;
import X.C40197Fq5;
import X.C45804HyK;
import X.C46104I7o;
import X.C60788NtQ;
import X.C66952QPk;
import X.C75252xN;
import X.F25;
import X.F26;
import X.F2E;
import X.F3T;
import X.F3U;
import X.FBJ;
import X.FBP;
import X.FBS;
import X.InterfaceC31920Cfs;
import X.InterfaceC31964Cga;
import X.InterfaceC38186Eyk;
import X.InterfaceC60187Njj;
import X.O3U;
import X.OIB;
import X.OIH;
import X.VNS;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.xelements.XElements;
import com.ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostHybrid;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class LiveHostHybrid implements IHostHybrid {
    public volatile OIB LJLIL;

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final void le() {
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final List<C40197Fq5> rS() {
        return XElements.LIZ(true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final C60788NtQ Cz() {
        return new C60788NtQ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final List<String> Iv() {
        return C38083Ex5.LIZIZ(Arrays.asList("host", "webcast"), false);
    }

    public final void LIZ() {
        if (this.LJLIL != null) {
            return;
        }
        OIB oib = new OIB(LiveHostOuterService.LIZJ().LIZ());
        OIH oih = oib.LIZ;
        if (oih != null) {
            oih.LIZIZ = true;
        }
        oib.LIZIZ(C46104I7o.LJJIIJ());
        this.LJLIL = oib;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final String f50() {
        LIZ();
        if (this.LJLIL != null) {
            String str = this.LJLIL.LIZJ;
            if (!TextUtils.isEmpty(str)) {
                return O3U.LIZLLL("offlineX", str, "tiktok_live_lynx");
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final void uZ() {
        F2E.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final void IB(String str) {
        String str2 = C75252xN.LIZJ(str).get("__spark_session_id");
        if (str2 != null) {
            C40101FoX.LIZIZ(str2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final Map<String, String> Vg0(String str) {
        return C66952QPk.LIZ(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final boolean fa(String url) {
        o.LJIIJ(url, "url");
        FBS fbs = FBJ.LIZ;
        if (fbs != null) {
            return fbs.fa(url);
        }
        o.LJIJI("hostDepend");
        throw null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final List<String> i00(String str) {
        return NetworkUtils.getShareCookie(CookieManager.getInstance(), str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final String k7(String url) {
        o.LJIIJ(url, "url");
        return (String) FBP.LIZ(url).getFirst();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final WebResourceResponse GG(WebView webView, String str) {
        WebResourceResponse LIZ;
        LIZ();
        if (this.LJLIL != null) {
            OIB oib = this.LJLIL;
            synchronized (oib) {
                LIZ = oib.LIZ(webView, str);
            }
            return LIZ;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final void prefetchSchema(String str, Context context) {
        IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIECommerceServicebyMonsterPlugin, "get().getService(IECommerceService::class.java)");
        createIECommerceServicebyMonsterPlugin.prefetchSchema(str, context);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final Object w2(Context context, C38113ExZ c38113ExZ) {
        return LiveHostOuterService.LIZJ().w2(context, c38113ExZ);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final C38113ExZ qh(C38113ExZ c38113ExZ, Context context, InterfaceC31964Cga interfaceC31964Cga, VNS vns, C38129Exp c38129Exp) {
        if (c38113ExZ instanceof C38113ExZ) {
            F3T f3t = new F3T();
            C38116Exc c38116Exc = new C38116Exc(c38113ExZ.LIZJ);
            c38116Exc.LJIILJJIL = true;
            c38116Exc.LJIIIIZZ = false;
            c38116Exc.LIZJ = c38129Exp;
            c38116Exc.LJIIJ = new F3U(f3t);
            C38113ExZ LIZ = c38116Exc.LIZ();
            f3t.LJ(Context.class, new F26(context));
            if (interfaceC31964Cga instanceof InterfaceC31964Cga) {
                f3t.LJ(InterfaceC31964Cga.class, new F26(interfaceC31964Cga));
            }
            if (vns instanceof VNS) {
                f3t.LJ(VNS.class, new F26(vns));
            }
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                f3t.LJ(InterfaceC60187Njj.class, new F25(new BulletActivityWrapper(LJIJJ)));
            }
            List<InterfaceC38186Eyk> createBridges = BulletHostProxy.LIZ().createBridges(f3t);
            for (int i = 0; i < createBridges.size(); i++) {
                final InterfaceC38186Eyk interfaceC38186Eyk = (InterfaceC38186Eyk) ListProtector.get(createBridges, i);
                LIZ.LIZJ(interfaceC38186Eyk.getName(), new InterfaceC31920Cfs() { // from class: X.FBU
                    @Override // X.InterfaceC31920Cfs
                    public final AbstractC38123Exj LIZ() {
                        LiveHostHybrid liveHostHybrid = LiveHostHybrid.this;
                        InterfaceC38186Eyk interfaceC38186Eyk2 = interfaceC38186Eyk;
                        liveHostHybrid.getClass();
                        return new FBV(interfaceC38186Eyk2);
                    }
                });
            }
            return LIZ;
        }
        return null;
    }
}
