package X;

import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import Y.ARunnableS46S0100000_10;
import Y.AfS62S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.landpage.survey.AdLandPageSurveyServiceImpl;
import com.ss.android.ugc.aweme.spark.SparkWebViewTouchDelegate;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import org.greenrobot.eventbus.EventBus;
import ujb.o;

/* loaded from: classes11.dex */
public final class NVO extends AbstractC60800Ntc implements InterfaceC59237NMr, NZ1, InterfaceC60844NuK, NZ2 {
    public final NUT LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public Space LJLJJL;
    public ViewOnClickListenerC59660NbE LJLJJLL;
    public WebKitView LJLJL;
    public SparkContext LJLJLJ;
    public NP1 LJLJLLL;
    public NOV LJLL;
    public String LJLLI;
    public C59455NVb LJLLILLLL;
    public ACListenerS45S0200000_10 LJLLJ;
    public Runnable LJLLL;
    public String LJLLLL;
    public Activity LJLLLLLL;
    public boolean LJLZ;
    public List<String> LJZ;
    public boolean LJZI;
    public long LJZL;
    public String LL;
    public SparkWebViewTouchDelegate LLD;
    public C73318Sq2 LLF;
    public volatile boolean LLFF;
    public volatile boolean LLFFF;
    public volatile boolean LLFII;
    public boolean LLFZ;

    public NVO() {
        this(0);
    }

    @Override // X.NZ1
    public final ViewGroup LIZJ() {
        return null;
    }

    @Override // X.NZ1
    public final int LJJ() {
        return R.id.k8p;
    }

    @Override // X.NZ2
    public final void LLLL() {
    }

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        this.LLFFF = true;
        LLLJL();
        C73318Sq2 c73318Sq2 = this.LLF;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZLLL();
        }
        this.LLF = null;
    }

    @Override // X.NZ1
    public final ViewGroup LIZIZ() {
        ViewGroup viewGroup;
        View view = this.LJLILLLLZI;
        if (view == null || (viewGroup = (ViewGroup) view.findViewById(R.id.l_7)) == null) {
            C39836FkG.LJII.getClass();
            return new C59459NVf(C38262Ezy.LIZ().LIZIZ().getBaseContext());
        }
        return viewGroup;
    }

    @Override // X.NZ2
    public final void LJ() {
        if (this.LLFF) {
            return;
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.NZ2
    public final void LJJLI() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLIL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LIZJ();
        }
    }

    public final boolean LJJLIIIIJ() {
        String url;
        List<String> list = this.LJZ;
        if (list == null) {
            return false;
        }
        C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJIZL(ORZ.LJLIIIL(list)));
        while (c115524g8.hasNext()) {
            String str = (String) c115524g8.next();
            WebKitView webKitView = this.LJLJL;
            if (webKitView != null && (url = webKitView.getUrl()) != null && o.LJJJLIIL(url, str, false)) {
                return true;
            }
        }
        return false;
    }

    public final void LJJLIIIJ() {
        WebKitView webKitView = this.LJLJL;
        if (webKitView != null && webKitView.canGoBack()) {
            WebKitView webKitView2 = this.LJLJL;
            if (webKitView2 != null) {
                webKitView2.goBack();
                return;
            }
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJI("method", this.LL);
        FMX.LJIIL("h5_leave_detail", c188727au.LIZ);
        this.LJLLL.run();
        this.LJLLLL = "full_screen_page_click";
    }

    @Override // X.NZ2
    public final void LLLJL() {
        if (this.LLFF) {
            return;
        }
        this.LLFF = true;
        EventBus.LIZJ().LJIJ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    @Override // X.NZ2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onHide() {
        /*
            r6 = this;
            com.bytedance.lynx.hybrid.webkit.WebKitView r1 = r6.LJLJL
            r5 = 0
            if (r1 != 0) goto L15
            com.bytedance.hybrid.spark.SparkContext r0 = r6.LJLJLJ
            if (r0 == 0) goto Lbd
            X.Nsz r1 = r0.LJI()
        Ld:
            boolean r0 = r1 instanceof com.bytedance.lynx.hybrid.webkit.WebKitView
            if (r0 == 0) goto L18
            X.OM1 r1 = (X.OM1) r1
            if (r1 == 0) goto L18
        L15:
            r1.onPause()
        L18:
            r6.LJLJLJ = r5
            X.NUT r1 = r6.LJLIL
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness> r0 = com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r0 = r1.LIZ(r0)
            com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness r0 = (com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) r0
            r2 = 1
            if (r0 == 0) goto L2a
            r0.LJIILJJIL(r2)
        L2a:
            X.NUT r1 = r6.LJLIL
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness> r0 = com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r0 = r1.LIZ(r0)
            com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness r0 = (com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness) r0
            if (r0 == 0) goto L39
            r0.LJII(r2)
        L39:
            X.NUT r1 = r6.LJLIL
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.PlayableBusiness> r0 = com.ss.android.ugc.aweme.bullet.business.PlayableBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r0 = r1.LIZ(r0)
            com.ss.android.ugc.aweme.bullet.business.PlayableBusiness r0 = (com.ss.android.ugc.aweme.bullet.business.PlayableBusiness) r0
            r1 = 0
            if (r0 == 0) goto L4b
            r0.LIZIZ = r2
            r0.LIZ(r2, r1)
        L4b:
            X.NUT r0 = r6.LJLIL
            com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness r0 = X.NUW.LIZ(r0)
            if (r0 == 0) goto L60
            r0.LIZIZ = r1
            X.N5S r0 = r0.LIZ
            X.NMj r1 = r0.LIZLLL
            if (r1 == 0) goto L60
            java.lang.String r0 = "webViewDidHide"
            r1.LIZ(r0, r5)
        L60:
            android.app.Activity r0 = r6.LJLLLLLL
            java.lang.String r2 = X.C54154LNe.LIZIZ(r0)
            java.lang.String r1 = "profile_2_feed"
            android.app.Activity r0 = r6.LJLLLLLL
            java.lang.String r0 = X.C54154LNe.LIZ(r0, r1)
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L78
            java.lang.String r0 = "full_screen_system_click"
            r6.LJLLLL = r0
        L78:
            X.NOV r0 = r6.LJLL
            if (r0 == 0) goto Lbb
            X.NP0 r0 = r0.LJJJJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L8c
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L8e
        L8c:
            java.lang.String r4 = ""
        L8e:
            X.NOV r0 = r6.LJLL
            if (r0 == 0) goto Lb9
            java.lang.String r3 = r0.LJFF()
        L96:
            java.lang.String r2 = r6.LJLLLL
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto La4
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto La5
        La4:
            return
        La5:
            kotlin.jvm.internal.o.LJI(r4)
            java.lang.String r1 = "landing_ad"
            java.lang.String r0 = "close"
            X.N0h r1 = X.C58704N2e.LJ(r1, r0, r4, r3, r5)
            java.lang.String r0 = "refer"
            r1.LIZJ(r2, r0)
            r1.LJI()
            goto La4
        Lb9:
            r3 = r5
            goto L96
        Lbb:
            r4 = r5
            goto L8e
        Lbd:
            r1 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NVO.onHide():void");
    }

    @Override // X.NZ2
    public final void onPause() {
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LJLIL.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LIZLLL();
        }
    }

    @Override // X.NZ2
    public final void onResume() {
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LJLIL.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LJ();
        }
    }

    @Override // X.NZ2
    public final void onShow() {
        this.LJLLLL = "full_screen_slide";
    }

    public NVO(int i) {
        this.LJLIL = new N5S();
        this.LJLLL = new ARunnableS46S0100000_10(this, 165);
        this.LJLLLL = "full_screen_slide";
        this.LLF = new C73318Sq2();
    }

    @Override // X.NZ1
    public final View LIZLLL(Context context) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        LJJL(context);
        View view = this.LJLILLLLZI;
        kotlin.jvm.internal.o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        return view;
    }

    @Override // X.InterfaceC60844NuK
    public final View LJI(Context context) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        LJJL(context);
        View view = this.LJLJI;
        kotlin.jvm.internal.o.LJI(view);
        return view;
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIIJJI(View.OnClickListener onClickListener) {
        View findViewById;
        View view = this.LJLJI;
        if (view != null && (findViewById = view.findViewById(R.id.e95)) != null) {
            C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, onClickListener, 33), findViewById);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIILJJIL(String subTitle) {
        kotlin.jvm.internal.o.LJIIJ(subTitle, "subTitle");
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIIZILJ(EnumC60084Ni4 navBtnType) {
        kotlin.jvm.internal.o.LJIIIZ(navBtnType, "navBtnType");
        View view = this.LJLJI;
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.j2p);
        View findViewById2 = view.findViewById(R.id.ayi);
        View findViewById3 = view.findViewById(R.id.az6);
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 162), findViewById);
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 163), findViewById2);
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 164), findViewById3);
        int i = C60082Ni2.LIZIZ[navBtnType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                findViewById3.setVisibility(0);
                return;
            }
            findViewById2.setVisibility(0);
            return;
        }
        findViewById.setVisibility(0);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIJJ(boolean z) {
        if (z) {
            KL2.LJIILLIIL(0, this.LJLJI);
        } else {
            KL2.LJIILLIIL(8, this.LJLJI);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJII(ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        View findViewById;
        View view = this.LJLJI;
        if (view != null && (findViewById = view.findViewById(R.id.e96)) != null) {
            C16880lQ.LJIIJ(aCListenerS30S0100000_10, findViewById);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIII(String title) {
        kotlin.jvm.internal.o.LJIIIZ(title, "title");
        if (C59454NVa.LIZIZ(title)) {
            return;
        }
        View view = this.LJLJI;
        kotlin.jvm.internal.o.LJI(view);
        ((TextView) view.findViewById(R.id.mo6)).setText(title);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIJIIJI(int i) {
        View view = this.LJLJI;
        kotlin.jvm.internal.o.LJI(view);
        ((TextView) view.findViewById(R.id.mo6)).setTextColor(i);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIL(int i) {
        View view = this.LJLJI;
        kotlin.jvm.internal.o.LJI(view);
        view.setBackgroundColor(i);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJJ(boolean z) {
        View findViewById;
        int i;
        View view = this.LJLJI;
        if (view == null || (findViewById = view.findViewById(R.id.e96)) == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        WebView webView;
        EnumC39924Flg type;
        C59472NVs c59472NVs;
        NOV nov;
        Boolean value;
        Activity activity;
        ViewOnClickListenerC59660NbE viewOnClickListenerC59660NbE;
        int i;
        C59304NPg c59304NPg;
        Boolean value2;
        C59297NOz c59297NOz;
        Object obj;
        C59478NVy c59478NVy;
        NP1 np1;
        boolean z;
        C60606NqU c60606NqU;
        C60726NsQ c60726NsQ;
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        if (this.LLFFF) {
            return;
        }
        this.LJLZ = true;
        String str = null;
        if (!this.LLFII && (view.getHybridContext() instanceof SparkContext)) {
            C60737Nsb hybridContext = view.getHybridContext();
            kotlin.jvm.internal.o.LJII(hybridContext, "null cannot be cast to non-null type com.bytedance.hybrid.spark.SparkContext");
            SparkContext sparkContext = (SparkContext) hybridContext;
            if (!this.LLFFF) {
                this.LJLJLJ = sparkContext;
                InterfaceC60710NsA interfaceC60710NsA = sparkContext.hybridParams;
                if (interfaceC60710NsA != null && (type = interfaceC60710NsA.getType()) != null) {
                    int i2 = C60082Ni2.LIZ[type.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            Object LIZIZ = sparkContext.LIZIZ(NOY.class);
                            InterfaceC92693kP LJJJJZI = C84763XOl.LJI().LJJJJZI(new AfS62S0100000_10(view, 36));
                            C73318Sq2 c73318Sq2 = this.LLF;
                            if (c73318Sq2 != null) {
                                c73318Sq2.LIZ(LJJJJZI);
                            }
                            c59472NVs = (C59472NVs) LIZIZ;
                        }
                    } else {
                        Object LIZIZ2 = sparkContext.LIZIZ(NP1.class);
                        this.LJLJLLL = (NP1) LIZIZ2;
                        c59472NVs = (C59472NVs) LIZIZ2;
                    }
                    if (c59472NVs != null) {
                        android.net.Uri parse = UriProtector.parse(sparkContext.url);
                        Bundle bundle = (Bundle) sparkContext.LIZIZ(Bundle.class);
                        NOV nov2 = new NOV();
                        C59473NVt.LIZ(parse, bundle, nov2);
                        this.LJLL = nov2;
                        if (this.LLFZ && (c59472NVs instanceof NP1) && (np1 = (NP1) c59472NVs) != null) {
                            np1.LLIFFJFJJ = 1;
                        }
                        this.LJLIL.LJ(c59472NVs);
                        this.LJLIL.LJII(this.LJLL);
                        Activity activity2 = this.LJLLLLLL;
                        if (activity2 != null) {
                            if (this.LJLLJ == null) {
                                this.LJLLJ = new ACListenerS45S0200000_10(this, activity2, 34);
                            }
                            this.LJLLILLLL = new C59455NVb(activity2, this.LJLLJ);
                        }
                        if (TextUtils.isEmpty((CharSequence) c59472NVs.LJIIIZ.getValue())) {
                            C59478NVy c59478NVy2 = c59472NVs.LJIIIZ;
                            NP1 np12 = this.LJLJLLL;
                            if (np12 != null && (c59478NVy = np12.LJJLIL) != null) {
                                obj = c59478NVy.getValue();
                            } else {
                                obj = null;
                            }
                            c59478NVy2.LIZLLL(obj);
                        }
                        NP1 np13 = this.LJLJLLL;
                        if (np13 != null && (c59297NOz = np13.LJJJJI) != null && kotlin.jvm.internal.o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
                            c59472NVs.LJJIL.LIZLLL(Boolean.FALSE);
                        }
                        if ((((c59472NVs instanceof C59304NPg) && (c59304NPg = (C59304NPg) c59472NVs) != null && (value2 = c59304NPg.LJJLIIIJLJLI.getValue()) != null && value2.booleanValue()) || ((nov = this.LJLL) != null && (value = nov.LJJLIIIJLJLI.getValue()) != null && value.booleanValue())) && (viewOnClickListenerC59660NbE = this.LJLJJLL) != null) {
                            Context context = viewOnClickListenerC59660NbE.getContext();
                            if (context != null) {
                                i = C63081OpJ.LJJJJLI(context);
                            } else {
                                i = 0;
                            }
                            viewOnClickListenerC59660NbE.setPadding(0, i, 0, 0);
                        }
                        NP1 np14 = this.LJLJLLL;
                        if (np14 != null) {
                            C58909NAb.LIZ.getClass();
                            NH3.LIZ();
                            if (!TextUtils.isEmpty(np14.LJ())) {
                                NH3.LIZ();
                            }
                            Boolean value3 = np14.LJJLIIIJ.getValue();
                            if (value3 != null && value3.booleanValue() && (activity = this.LJLLLLLL) != null) {
                                C62905OmT c62905OmT = new C62905OmT(activity);
                                c62905OmT.LIZ(R.string.ive);
                                c62905OmT.LJII(R.string.dsn, null);
                                C279017q.LIZLLL(c62905OmT);
                            }
                        }
                        if (kotlin.jvm.internal.o.LJ(c59472NVs.LJ.getValue(), Boolean.TRUE)) {
                            KL2.LJIILLIIL(8, this.LJLJI);
                            KL2.LJIILLIIL(8, this.LJLJJL);
                        }
                    }
                }
            }
            AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LJLIL.LIZ(AdLynxStatBusiness.class);
            if (adLynxStatBusiness != null) {
                if (view instanceof C60726NsQ) {
                    c60726NsQ = (C60726NsQ) view;
                } else {
                    c60726NsQ = null;
                }
                adLynxStatBusiness.LJIIL = c60726NsQ;
            }
            AdLynxStatBusiness adLynxStatBusiness2 = (AdLynxStatBusiness) this.LJLIL.LIZ(AdLynxStatBusiness.class);
            if (adLynxStatBusiness2 != null) {
                adLynxStatBusiness2.LIZIZ();
            }
            InterfaceC60710NsA interfaceC60710NsA2 = view.getHybridContext().hybridParams;
            if ((interfaceC60710NsA2 instanceof C60606NqU) && (c60606NqU = (C60606NqU) interfaceC60710NsA2) != null) {
                c60606NqU.LJI(new NVP(this, view));
            }
            if (view instanceof WebKitView) {
                WebKitView webKitView = this.LJLJL;
                if (webKitView == null || !kotlin.jvm.internal.o.LJ(webKitView, view)) {
                    WebKitView webKitView2 = (WebKitView) view;
                    webKitView2.setBackgroundColor(0);
                    this.LJLJL = webKitView2;
                    webKitView2.resumeTimers();
                    WebKitView webKitView3 = this.LJLJL;
                    if (webKitView3 != null) {
                        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = new SparkWebViewTouchDelegate(webKitView3, this.LLFZ, 14);
                        this.LLD = sparkWebViewTouchDelegate;
                        webKitView3.setWebViewEventDelegate(sparkWebViewTouchDelegate);
                    }
                    C58909NAb.LIZ.getClass();
                    InterfaceC59440NUm LIZ = NH3.LIZ();
                    if (LIZ != null) {
                        ((NTF) LIZ).LJIL(this, this.LJLJL);
                    }
                    InterfaceC59440NUm LIZ2 = NH3.LIZ();
                    if (LIZ2 != null) {
                        ((NTF) LIZ2).LIZJ(this, this.LJLJL);
                    }
                    WebKitView webKitView4 = this.LJLJL;
                    if (webKitView4 != null) {
                        C59445NUr.LIZIZ(new AqS141S0200000_10(webKitView4, this, 49));
                        NP1 np15 = this.LJLJLLL;
                        if (np15 != null) {
                            Boolean value4 = np15.LJJIFFI.getValue();
                            if (value4 != null && value4.booleanValue()) {
                                webKitView4.setLayerType(1, null);
                            }
                            Boolean value5 = np15.LJJLIIIJJIZ.getValue();
                            if (value5 != null && value5.booleanValue()) {
                                try {
                                    WebSettings settings = webKitView4.getSettings();
                                    InterfaceC59085NGv LIZJ = NH3.LIZJ();
                                    if (LIZJ != null) {
                                        if (NU7.LJIIZILJ()) {
                                            z = true;
                                            settings.setMediaPlaybackRequiresUserGesture(!z);
                                        }
                                    }
                                    z = false;
                                    settings.setMediaPlaybackRequiresUserGesture(!z);
                                } catch (Exception e) {
                                    C78983UzD.LJIIZILJ(e);
                                    webKitView4.getSettings().setMediaPlaybackRequiresUserGesture(true);
                                }
                            }
                        }
                    }
                }
                this.LJLIL.LJFF((WebView) view);
                this.LJLIL.LJI(new C59461NVh(view));
                this.LJLIL.LIZJ(null);
            }
        }
        View LIZJ2 = view.LIZJ();
        if ((LIZJ2 instanceof WebView) && (webView = (WebView) LIZJ2) != null) {
            str = webView.getUrl();
        }
        this.LJLLI = str;
        C58909NAb.LIZ.getClass();
        NH3.LIZ();
        if (NH3.LIZ() != null) {
            NTF.LJJIJ(this, this.LJLLI);
        }
        this.LLFII = false;
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLIIL(SparkContext sparkContext) {
        NOV nov = this.LJLL;
        if (nov != null && kotlin.jvm.internal.o.LJ(nov.LJLJJL.getValue(), Boolean.TRUE)) {
            AdLandPageSurveyServiceImpl.LJI().LIZIZ();
        }
    }

    public final void LJJL(Context context) {
        LJ();
        if (context == null || this.LJLILLLLZI != null) {
            return;
        }
        synchronized (this) {
            if (this.LJLILLLLZI != null) {
                return;
            }
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            kotlin.jvm.internal.o.LJI(LJIJJ);
            this.LJLLLLLL = LJIJJ;
            View inflate = View.inflate(context, R.layout.a_m, null);
            this.LJLILLLLZI = inflate;
            this.LJLJI = inflate.findViewById(R.id.l_2);
            this.LJLJJI = inflate.findViewById(R.id.title_shadow);
            this.LJLJJL = (Space) inflate.findViewById(R.id.gwj);
            this.LJLJJLL = (ViewOnClickListenerC59660NbE) inflate.findViewById(R.id.k97);
        }
    }

    public final void LJJLIIIJILLIZJL(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[2];
        strArr[0] = "platform = ";
        if (this.LJLJLLL != null) {
            str2 = "webview";
        } else {
            str2 = "unknown";
        }
        strArr[1] = str2;
        C38349F3h.LJJIJIL(sb, strArr);
        C38349F3h.LJJIJIL(sb, "status = ", str);
        C38349F3h.LJJIJIL(sb, "url = ", this.LJLLI);
    }

    public final void LJJLIIIJJI(Activity activity) {
        kotlin.jvm.internal.o.LJIIIZ(activity, "activity");
        C73318Sq2 c73318Sq2 = this.LLF;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZLLL();
        }
        NP1 np1 = this.LJLJLLL;
        if (np1 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", np1.LJ());
            hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
            long currentTimeMillis = System.currentTimeMillis();
            new F15();
            C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(hashMap), "ad_webview_close"));
        }
    }

    public final void LJJLIIIJJIZ(Activity activity) {
        kotlin.jvm.internal.o.LJIIIZ(activity, "activity");
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NTF.LJJIIZI(this);
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLIL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIILJJIL(false);
        }
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LJLIL.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LJII(false);
        }
    }

    @Override // X.NZ2
    public final void LLLJIL(Runnable runnable) {
        this.LJLLL = runnable;
    }

    @QD3
    public final void onEvent(C40261Fr7 c40261Fr7) {
        InterfaceC60761Nsz LJI;
        SparkContext sparkContext;
        Object LIZIZ;
        InterfaceC60710NsA interfaceC60710NsA;
        SparkContext sparkContext2 = this.LJLJLJ;
        EnumC39924Flg enumC39924Flg = null;
        if (sparkContext2 != null && (interfaceC60710NsA = sparkContext2.hybridParams) != null) {
            enumC39924Flg = interfaceC60710NsA.getType();
        }
        if (enumC39924Flg == EnumC39924Flg.LYNX) {
            if (c40261Fr7 != null && c40261Fr7.LJLIL != 0 && (sparkContext = this.LJLJLJ) != null && (LIZIZ = sparkContext.LIZIZ(InterfaceC40516FvE.class)) != null && LIZIZ.hashCode() == c40261Fr7.LJLIL) {
                this.LJLLLL = "full_screen_page_click";
                this.LJLLL.run();
                return;
            }
            return;
        }
        if (c40261Fr7 != null && c40261Fr7.LJLIL != 0) {
            SparkContext sparkContext3 = this.LJLJLJ;
            if (sparkContext3 != null && (LJI = sparkContext3.LJI()) != null && (LJI instanceof WebKitView) && LJI.hashCode() == c40261Fr7.LJLIL) {
                this.LJLLLL = "full_screen_page_click";
                this.LJLLL.run();
                return;
            }
            WebKitView webKitView = this.LJLJL;
            if (webKitView != null && webKitView.hashCode() == c40261Fr7.LJLIL) {
                this.LJLLLL = "full_screen_page_click";
                this.LJLLL.run();
            }
        }
    }

    @QD3
    public final void onJsBroadcast(C59231NMl event) {
        kotlin.jvm.internal.o.LJIIIZ(event, "event");
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LLD;
        if (sparkWebViewTouchDelegate != null) {
            sparkWebViewTouchDelegate.LIZJ(event);
        }
    }

    @QD3
    public final void onEvent(C107794Kx c107794Kx) {
        String str;
        if (c107794Kx != null) {
            str = c107794Kx.LJLJJI;
        } else {
            str = null;
        }
        if (TextUtils.equals("web", str)) {
            C58909NAb.LIZ.getClass();
            if (NH3.LIZ() != null) {
                NTF.LJJIFFI(this.LJLLLLLL, this.LJLJI, c107794Kx);
            }
        }
    }

    @QD3
    public void onEvent(C59470NVq c59470NVq) {
        C58909NAb.LIZ.getClass();
        NH3.LIZ();
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        Context context;
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        C60737Nsb hybridContext = view.getHybridContext();
        kotlin.jvm.internal.o.LJII(hybridContext, "null cannot be cast to non-null type com.bytedance.hybrid.spark.SparkContext");
        this.LJLJLJ = (SparkContext) hybridContext;
        View LIZJ = view.LIZJ();
        if (LIZJ != null) {
            context = LIZJ.getContext();
        } else {
            context = null;
        }
        LJJL(context);
        this.LJLZ = false;
        this.LLFII = false;
        this.LJLLI = url;
        C58909NAb.LIZ.getClass();
        NH3.LIZ();
        if (NH3.LIZ() != null) {
            NTF.LJIILJJIL(this, this.LJLLI);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        this.LLFII = true;
    }
}
