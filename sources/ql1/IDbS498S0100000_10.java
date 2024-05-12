package ql1;

import X.AbstractC37353ElJ;
import X.AbstractC60811Ntn;
import X.C05630Jz;
import X.C0K2;
import X.C16880lQ;
import X.C223338pd;
import X.C252709vu;
import X.C58149Mrx;
import X.C59222NMc;
import X.C59977NgL;
import X.C60704Ns4;
import X.C60846NuM;
import X.C61152NzI;
import X.C79081V1x;
import X.EnumC61143Nz9;
import X.InterfaceC60761Nsz;
import X.InterfaceC60844NuK;
import X.KL2;
import X.OA0;
import X.OA2;
import X.OM1;
import Y.ARunnableS46S0100000_10;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.favorites.business.music.LynxRecommendedSoundsFragment;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class IDbS498S0100000_10 extends AbstractC60811Ntn {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz interfaceC60761Nsz, String str, C60704Ns4 c60704Ns4) {
        switch (this.$t) {
            case 1:
                LJJJJIZL$0(this, interfaceC60761Nsz, str, c60704Ns4);
                return;
            case 2:
                LJJJJIZL$1(this, interfaceC60761Nsz, str, c60704Ns4);
                return;
            default:
                super.LJJJJIZL(interfaceC60761Nsz, str, c60704Ns4);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz interfaceC60761Nsz) {
        switch (this.$t) {
            case 0:
                LJJJJJ$0(this, interfaceC60761Nsz);
                return;
            case 1:
            default:
                super.LJJJJJ(interfaceC60761Nsz);
                return;
            case 2:
                LJJJJJ$1(this, interfaceC60761Nsz);
                return;
            case 3:
                LJJJJJ$2(this, interfaceC60761Nsz);
                return;
            case 4:
                LJJJJJ$3(this, interfaceC60761Nsz);
                return;
            case 5:
                LJJJJJ$4(this, interfaceC60761Nsz);
                return;
            case 6:
                LJJJJJ$5(this, interfaceC60761Nsz);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz interfaceC60761Nsz, String str) {
        switch (this.$t) {
            case 2:
                LJJJJJL$0(this, interfaceC60761Nsz, str);
                return;
            case 3:
                LJJJJJL$1(this, interfaceC60761Nsz, str);
                return;
            default:
                super.LJJJJJL(interfaceC60761Nsz, str);
                return;
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJJZI(SparkContext sparkContext) {
        switch (this.$t) {
            case 3:
                LJJJJZI$0(this, sparkContext);
                return;
            default:
                super.LJJJJZI(sparkContext);
                return;
        }
    }

    public IDbS498S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJJJ$0(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        ((LynxRecommendedSoundsFragment) iDbS498S0100000_10.l0).LJLIL = view;
    }

    public static final void LJJJJJ$1(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view) {
        OA2 oa2;
        o.LJIIIZ(view, "view");
        OA0 oa0 = (OA0) iDbS498S0100000_10.l0;
        if (oa0.LJLJI && (oa2 = oa0.LJLL) != null) {
            String str = oa0.LJLJLJ;
            boolean z = oa0.LJLILLLLZI;
            if (oa2.LIZIZ == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis() - oa2.LIZ;
            long currentTimeMillis2 = System.currentTimeMillis() - oa2.LIZIZ;
            C05630Jz.LJI(jSONObject, "event_name", "resource_load_finish");
            C05630Jz.LJFF(jSONObject2, "event_duration", currentTimeMillis2);
            C05630Jz.LJFF(jSONObject2, "event_duration_all", currentTimeMillis);
            C05630Jz.LJFF(jSONObject3, "event_duration", currentTimeMillis2);
            C05630Jz.LJFF(jSONObject3, "event_duration_all", currentTimeMillis);
            C05630Jz.LIZ(z ? 1 : 0, "is_precreate", jSONObject3);
            oa2.LIZ(jSONObject3);
            if (!TextUtils.isEmpty(str)) {
                C05630Jz.LJI(jSONObject3, "lynx_url", str);
            }
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_lynx_show", jSONObject, jSONObject2, jSONObject4);
        }
    }

    public static final void LJJJJJ$2(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view) {
        String str;
        WebView webView;
        AbstractC37353ElJ abstractC37353ElJ;
        WebView webView2;
        o.LJIIIZ(view, "view");
        if ((((SparkContext) iDbS498S0100000_10.l0).LJI() instanceof WebKitView) && (abstractC37353ElJ = (AbstractC37353ElJ) ((SparkContext) iDbS498S0100000_10.l0).LIZIZ(AbstractC37353ElJ.class)) != null) {
            SparkContext sparkContext = (SparkContext) iDbS498S0100000_10.l0;
            ShareH5Service.LIZ.getClass();
            ShareH5Service LIZ = C58149Mrx.LIZ();
            Object LJI = sparkContext.LJI();
            if (LJI instanceof WebKitView) {
                webView2 = (WebView) LJI;
            } else {
                webView2 = null;
            }
            LIZ.LJIIL(abstractC37353ElJ, webView2);
        }
        View LIZJ = view.LIZJ();
        if (!(LIZJ instanceof WebView) || (webView = (WebView) LIZJ) == null || (str = webView.getUrl()) == null) {
            str = "";
        }
        C59222NMc c59222NMc = (C59222NMc) ((SparkContext) iDbS498S0100000_10.l0).LIZIZ(C59222NMc.class);
        if (c59222NMc != null) {
            SparkContext sparkContext2 = (SparkContext) iDbS498S0100000_10.l0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("first_page", String.valueOf(c59222NMc.LJIILLIIL));
            String str2 = c59222NMc.LJFF;
            if (str2 != null) {
                linkedHashMap.put("aweme_id", str2);
            }
            AwemeRawAd awemeRawAd = c59222NMc.LIZ;
            if (awemeRawAd != null) {
                linkedHashMap.put("show_report", String.valueOf(awemeRawAd.isReportEnable()));
            }
            AbstractC37353ElJ abstractC37353ElJ2 = (AbstractC37353ElJ) sparkContext2.LIZIZ(AbstractC37353ElJ.class);
            if (abstractC37353ElJ2 != null) {
                ShareH5Service.LIZ.getClass();
                C58149Mrx.LIZ().LJIJ(abstractC37353ElJ2, linkedHashMap);
            }
        }
        AbstractC37353ElJ abstractC37353ElJ3 = (AbstractC37353ElJ) ((SparkContext) iDbS498S0100000_10.l0).LIZIZ(AbstractC37353ElJ.class);
        if (abstractC37353ElJ3 != null) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJJIFFI(abstractC37353ElJ3, str);
        }
    }

    public static final void LJJJJJ$3(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C223338pd c223338pd = (C223338pd) ((TabStoreFragment) iDbS498S0100000_10.l0)._$_findCachedViewById(R.id.kfk);
        if (c223338pd != null) {
            c223338pd.LIZJ();
        }
        C223338pd c223338pd2 = (C223338pd) ((TabStoreFragment) iDbS498S0100000_10.l0)._$_findCachedViewById(R.id.kfk);
        if (c223338pd2 == null) {
            return;
        }
        c223338pd2.setVisibility(8);
    }

    public static final void LJJJJJ$4(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view) {
        o.LJIIJ(view, "view");
        if (view instanceof WebKitView) {
            if (((WebKitView) view).canGoBack()) {
                InterfaceC60844NuK interfaceC60844NuK = ((C60846NuM) iDbS498S0100000_10.l0).LIZIZ;
                if (interfaceC60844NuK != null) {
                    interfaceC60844NuK.LJJJ(true);
                    return;
                }
                return;
            }
            InterfaceC60844NuK interfaceC60844NuK2 = ((C60846NuM) iDbS498S0100000_10.l0).LIZIZ;
            if (interfaceC60844NuK2 == null) {
                return;
            }
            interfaceC60844NuK2.LJJJ(false);
            return;
        }
        InterfaceC60844NuK interfaceC60844NuK3 = ((C60846NuM) iDbS498S0100000_10.l0).LIZIZ;
        if (interfaceC60844NuK3 == null) {
            return;
        }
        interfaceC60844NuK3.LJJJ(false);
    }

    public static final void LJJJJJ$5(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        View view2 = null;
        if (view instanceof WebKitView) {
            if (((WebKitView) view).canGoBack()) {
                C252709vu c252709vu = ((C59977NgL) iDbS498S0100000_10.l0).LJ;
                if (c252709vu != null) {
                    view2 = c252709vu.LJI("close_all_btn");
                }
                KL2.LJIILLIIL(0, view2);
                return;
            }
            C252709vu c252709vu2 = ((C59977NgL) iDbS498S0100000_10.l0).LJ;
            if (c252709vu2 != null) {
                view2 = c252709vu2.LJI("close_all_btn");
            }
            KL2.LJIILLIIL(8, view2);
            return;
        }
        C252709vu c252709vu3 = ((C59977NgL) iDbS498S0100000_10.l0).LJ;
        if (c252709vu3 != null) {
            view2 = c252709vu3.LJI("close_all_btn");
        }
        KL2.LJIILLIIL(8, view2);
    }

    public static final void LJJJJZI$0(IDbS498S0100000_10 iDbS498S0100000_10, SparkContext sparkContext) {
        AbstractC37353ElJ abstractC37353ElJ;
        if (sparkContext != null) {
            Object LJI = sparkContext.LJI();
            if (!(LJI instanceof WebKitView) || (abstractC37353ElJ = (AbstractC37353ElJ) sparkContext.LIZIZ(AbstractC37353ElJ.class)) == null) {
                return;
            }
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIIL(abstractC37353ElJ, (WebView) LJI);
        }
    }

    public static final void LJJJJJL$0(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view, String url) {
        OA2 oa2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        OA0 oa0 = (OA0) iDbS498S0100000_10.l0;
        if (oa0.LJLJI && (oa2 = oa0.LJLL) != null) {
            String str = oa0.LJLJLJ;
            boolean z = oa0.LJLILLLLZI;
            if (oa2.LIZIZ > 0) {
                return;
            }
            oa2.LIZIZ = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            long j = oa2.LIZIZ;
            long j2 = j - oa2.LIZ;
            long j3 = j - oa2.LIZJ;
            C05630Jz.LJI(jSONObject, "event_name", "start_load_resource");
            C05630Jz.LJFF(jSONObject2, "event_duration", j3);
            C05630Jz.LJFF(jSONObject2, "event_duration_all", j2);
            C05630Jz.LJFF(jSONObject3, "event_duration_all", j2);
            C05630Jz.LJFF(jSONObject3, "event_duration", j3);
            oa2.LIZ(jSONObject3);
            C05630Jz.LIZ(z ? 1 : 0, "is_precreate", jSONObject3);
            if (!TextUtils.isEmpty(str)) {
                C05630Jz.LJI(jSONObject3, "lynx_url", str);
            }
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_lynx_show", jSONObject, jSONObject2, jSONObject4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJJJJL$1(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view, String url) {
        AbstractC37353ElJ abstractC37353ElJ;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        if ((view instanceof WebKitView) && (abstractC37353ElJ = (AbstractC37353ElJ) ((SparkContext) iDbS498S0100000_10.l0).LIZIZ(AbstractC37353ElJ.class)) != null) {
            ShareH5Service.LIZ.getClass();
            for (Map.Entry entry : C58149Mrx.LIZ().LJIL(abstractC37353ElJ).entrySet()) {
                ((OM1) view).addJavascriptInterface(entry.getValue(), (String) entry.getKey());
            }
        }
    }

    public static final void LJJJJIZL$0(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        C79081V1x.LJJIII(EnumC61143Nz9.STEP_LOAD, ((C61152NzI) iDbS498S0100000_10.l0).LIZIZ, false, 0L, url, String.valueOf(c60704Ns4.LIZ), String.valueOf(c60704Ns4.LIZIZ), null, 296);
    }

    public static final void LJJJJIZL$1(IDbS498S0100000_10 iDbS498S0100000_10, InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        OA0 oa0 = (OA0) iDbS498S0100000_10.l0;
        OA2 oa2 = oa0.LJLL;
        if (oa2 != null) {
            String str = oa0.LJLJLJ;
            String str2 = c60704Ns4.LIZIZ;
            if (str != null && str.length() > 0 && 1 != 0) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                long currentTimeMillis = System.currentTimeMillis() - oa2.LIZ;
                long currentTimeMillis2 = System.currentTimeMillis() - oa2.LIZIZ;
                C05630Jz.LJI(jSONObject, "event_name", "lynx_load_fail");
                C05630Jz.LJI(jSONObject3, "lynx_url", str);
                C05630Jz.LJFF(jSONObject2, "event_duration_all", currentTimeMillis);
                C05630Jz.LJFF(jSONObject2, "event_duration", currentTimeMillis2);
                C05630Jz.LJFF(jSONObject3, "event_duration_all", currentTimeMillis);
                C05630Jz.LJFF(jSONObject3, "event_duration", currentTimeMillis2);
                if (str2 == null) {
                    str2 = "";
                }
                C05630Jz.LJI(jSONObject3, "error_reason", str2);
                oa2.LIZ(jSONObject3);
                C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
                C0K2.LJI("ttlive_ranklist_lynx_show", jSONObject, null, jSONObject4);
            }
        }
        OA0 oa02 = (OA0) iDbS498S0100000_10.l0;
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10(oa02, 426);
        oa02.getClass();
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            oa02.LJLIL.post(new ARunnableS46S0100000_10(aqS160S0100000_10, 11));
        } else {
            aqS160S0100000_10.invoke();
        }
    }
}
