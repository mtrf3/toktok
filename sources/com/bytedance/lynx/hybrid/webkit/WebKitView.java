package com.bytedance.lynx.hybrid.webkit;

import X.AbstractC60673NrZ;
import X.C0EM;
import X.C113554cx;
import X.C16610kz;
import X.C31999Ch9;
import X.C37692Eqm;
import X.C37953Euz;
import X.C38192Eyq;
import X.C38262Ezy;
import X.C39048FUe;
import X.C39836FkG;
import X.C39858Fkc;
import X.C39862Fkg;
import X.C51029K0z;
import X.C59240NMu;
import X.C59312NPo;
import X.C59678NbW;
import X.C60327Nlz;
import X.C60334Nm6;
import X.C60595NqJ;
import X.C60607NqV;
import X.C60616Nqe;
import X.C60618Nqg;
import X.C60620Nqi;
import X.C60728NsS;
import X.C60737Nsb;
import X.C60748Nsm;
import X.C61845OOz;
import X.C79607VMd;
import X.C89542ZCg;
import X.EnumC39866Fkk;
import X.FD5;
import X.InterfaceC16600ky;
import X.InterfaceC25962AGw;
import X.InterfaceC40148FpI;
import X.InterfaceC40155FpP;
import X.InterfaceC40178Fpm;
import X.InterfaceC59238NMs;
import X.InterfaceC60012Ngu;
import X.InterfaceC60614Nqc;
import X.InterfaceC60615Nqd;
import X.InterfaceC60703Ns3;
import X.InterfaceC60710NsA;
import X.InterfaceC60761Nsz;
import X.InterfaceC61488OBg;
import X.InterfaceC65784Pro;
import X.OM1;
import X.ORZ;
import X.OSZ;
import X.RunnableC60612Nqa;
import X.VMI;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebSettings;
import com.bytedance.crash.Npth;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class WebKitView extends OM1 implements InterfaceC60761Nsz, InterfaceC16600ky {
    public String LJLJJL;
    public C60607NqV LJLJJLL;
    public InterfaceC61488OBg LJLJL;
    public InterfaceC65784Pro<? extends InterfaceC61488OBg> LJLJLJ;
    public InterfaceC60703Ns3 LJLJLLL;
    public AbstractC60673NrZ LJLL;
    public C37953Euz LJLLI;
    public InterfaceC60614Nqc LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public C60728NsS LJLLLL;
    public volatile boolean LJLLLLLL;
    public InterfaceC40155FpP LJLZ;
    public final C59678NbW LJZ;
    public final int LJZI;
    public final long LJZL;
    public long LL;
    public long LLD;
    public boolean LLF;
    public long LLFF;
    public InterfaceC59238NMs LLFFF;
    public InterfaceC25962AGw LLFII;
    public InterfaceC60615Nqd LLFZ;
    public C60737Nsb LLI;

    @Override // X.InterfaceC60761Nsz
    public final View LIZJ() {
        return this;
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJIIJJI(SparkSchemaParam sparkSchemaParam) {
    }

    @Override // X.InterfaceC60761Nsz
    public final void onHide() {
        C60748Nsm.LIZIZ(getHybridContext());
    }

    @Override // X.InterfaceC60761Nsz
    public final void onShow() {
        C60748Nsm.LIZJ(getHybridContext());
    }

    @Override // X.InterfaceC60761Nsz
    public final void updateData(Map<String, ? extends Object> map) {
    }

    @Override // X.InterfaceC60761Nsz
    public final void LIZIZ() {
        C60728NsS c60728NsS = this.LJLLLL;
        if (c60728NsS != null) {
            c60728NsS.LJIIIZ = Long.valueOf(System.currentTimeMillis());
        }
        if (!TextUtils.isEmpty(this.LJLJJL)) {
            String str = this.LJLJJL;
            if (str != null) {
                load(str);
                return;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, "please set url at WebKitInitParam(url=\"\")", EnumC39866Fkk.E, null, 4);
    }

    public final boolean LJLLL() {
        InterfaceC60615Nqd interfaceC60615Nqd = this.LLFZ;
        if (interfaceC60615Nqd != null) {
            try {
                return interfaceC60615Nqd.LIZIZ();
            } catch (C59240NMu unused) {
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LLD;
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, C61845OOz.LIZ("ClickInTimeInterval:", currentTimeMillis), null, null, 6);
        long j = this.LLFF;
        if (j <= 0) {
            j = this.LJZL;
        }
        if (currentTimeMillis < j) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60761Nsz
    public Map<String, Object> getGlobalProps() {
        C60607NqV c60607NqV = this.LJLJJLL;
        if (c60607NqV != null) {
            return c60607NqV.LJI();
        }
        return null;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        C59678NbW c59678NbW = this.LJZ;
        if (c59678NbW != null) {
            return ((C16610kz) c59678NbW.LIZLLL).LJIIIZ(0);
        }
        return super.hasNestedScrollingParent();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        C59678NbW c59678NbW = this.LJZ;
        if (c59678NbW != null) {
            return ((C16610kz) c59678NbW.LIZLLL).LIZLLL;
        }
        return super.isNestedScrollingEnabled();
    }

    @Override // X.OM1, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        VMI.LJ.LJI(this);
        super.onAttachedToWindow();
    }

    @Override // X.OM1, android.webkit.WebView
    public final void reload() {
        InterfaceC40148FpI LJ;
        Map<String, Object> map;
        InterfaceC40155FpP interfaceC40155FpP = this.LJLZ;
        if (interfaceC40155FpP != null && (LJ = interfaceC40155FpP.LJ()) != null) {
            C60607NqV c60607NqV = this.LJLJJLL;
            if (c60607NqV != null) {
                map = c60607NqV.LJI();
            } else {
                map = null;
            }
            LJ.LJFF(this, map);
        }
        AbstractC60673NrZ abstractC60673NrZ = this.LJLL;
        if (abstractC60673NrZ != null) {
            String str = this.LJLJJL;
            if (str == null) {
                str = "";
            }
            abstractC60673NrZ.LJJJJJL(this, str);
        }
        getHybridContext().LJIILIIL(System.currentTimeMillis());
        VMI.LJ.LJIILIIL(this);
        super.reload();
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        C59678NbW c59678NbW = this.LJZ;
        if (c59678NbW != null) {
            ((C16610kz) c59678NbW.LIZLLL).LJIIL(0);
        } else {
            super.stopNestedScroll();
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final boolean canGoBack() {
        if (super.canGoBack() && C59312NPo.LIZIZ(this)) {
            return true;
        }
        return false;
    }

    @Override // X.OM1, android.webkit.WebView
    public final void goBack() {
        if (C59312NPo.LJ(this)) {
            return;
        }
        VMI.LJ.LJ(this);
        super.goBack();
    }

    @Override // X.InterfaceC60761Nsz
    public final boolean LJFF() {
        return this.LJLLLLLL;
    }

    public final InterfaceC60614Nqc getBridgeService$hybrid_web_release() {
        return this.LJLLILLLL;
    }

    public final boolean getCanTouch() {
        return this.LLF;
    }

    @Override // X.InterfaceC60761Nsz
    public C60737Nsb getHybridContext() {
        return this.LLI;
    }

    public final InterfaceC40155FpP getHybridRuntime$hybrid_web_release() {
        return this.LJLZ;
    }

    public final C60607NqV getInitParams$hybrid_web_release() {
        return this.LJLJJLL;
    }

    public final InterfaceC60703Ns3 getNavigationServiceProtocol$hybrid_web_release() {
        return this.LJLJLLL;
    }

    public final InterfaceC61488OBg getResource$hybrid_web_release() {
        return this.LJLJL;
    }

    public final InterfaceC65784Pro<InterfaceC61488OBg> getResourceDynamic$hybrid_web_release() {
        return this.LJLJLJ;
    }

    public final long getTimeInterval() {
        return this.LLFF;
    }

    public final AbstractC60673NrZ getWebKitLifeCycle$hybrid_web_release() {
        return this.LJLL;
    }

    public final String getWebUrl$hybrid_web_release() {
        return this.LJLJJL;
    }

    public WebKitView(Context context) {
        this(context, C60618Nqg.LIZ);
    }

    @Override // X.InterfaceC60761Nsz
    public final void LIZ(Map<String, ? extends Object> map) {
        InterfaceC40148FpI LJ;
        InterfaceC40155FpP interfaceC40155FpP = this.LJLZ;
        if (interfaceC40155FpP != null && (LJ = interfaceC40155FpP.LJ()) != null) {
            LJ.LJI(this, C113554cx.LJJLIL(map));
        }
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJI(boolean z) {
        C60748Nsm.LIZ(getHybridContext());
        new Handler().postDelayed(new RunnableC60612Nqa(this, z), 100L);
        VMI.LJ.LJIIL(this);
        destroy();
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJII(Context context) {
        o.LJIIJ(context, "context");
        InterfaceC60614Nqc interfaceC60614Nqc = this.LJLLILLLL;
        if (interfaceC60614Nqc != null) {
            interfaceC60614Nqc.LJIJ(context);
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        InterfaceC60615Nqd interfaceC60615Nqd = this.LLFZ;
        if (interfaceC60615Nqd != null) {
            try {
                return interfaceC60615Nqd.LIZ(super.canScrollVertically(i));
            } catch (C59240NMu unused) {
            }
        }
        return super.canScrollVertically(i);
    }

    @Override // X.InterfaceC60761Nsz
    public final void load(String originUrl) {
        Boolean bool;
        boolean z;
        InterfaceC40148FpI LJ;
        C60607NqV c60607NqV;
        Uri uri;
        Uri uri2;
        String applyAppendCommonParamsUrl;
        String applyGlobalLoadUrl;
        o.LJIIJ(originUrl, "originUrl");
        C39836FkG.LJII.getClass();
        C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
        if (c39858Fkc != null && (applyGlobalLoadUrl = c39858Fkc.applyGlobalLoadUrl(originUrl)) != null) {
            originUrl = applyGlobalLoadUrl;
        }
        C60607NqV c60607NqV2 = this.LJLJJLL;
        Map<String, Object> map = null;
        if (c60607NqV2 != null) {
            bool = c60607NqV2.LJIILIIL;
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            long currentTimeMillis = System.currentTimeMillis();
            C39858Fkc c39858Fkc2 = C38262Ezy.LIZ().LIZLLL;
            if (c39858Fkc2 != null && (applyAppendCommonParamsUrl = c39858Fkc2.applyAppendCommonParamsUrl(originUrl)) != null) {
                originUrl = applyAppendCommonParamsUrl;
            }
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("appendCommonParamsDuration = ");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis);
            C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
        }
        try {
            C60607NqV c60607NqV3 = this.LJLJJLL;
            if (c60607NqV3 != null) {
                uri = c60607NqV3.LJIILJJIL;
            } else {
                uri = null;
            }
            Npth.addTag("last_web_url", String.valueOf(uri));
            ArrayList arrayList = new ArrayList();
            C31999Ch9.LIZJ.getClass();
            Iterator it = ((LinkedHashMap) C31999Ch9.LIZIZ).entrySet().iterator();
            while (it.hasNext()) {
                Object obj = ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (obj != null) {
                    C60607NqV c60607NqV4 = ((WebKitView) obj).LJLJJLL;
                    if (c60607NqV4 != null) {
                        uri2 = c60607NqV4.LJIILJJIL;
                    } else {
                        uri2 = null;
                    }
                    arrayList.add(String.valueOf(uri2));
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.webkit.WebKitView");
                }
            }
            Npth.addTag("recent_web_url_list", arrayList.toString());
            Npth.addTag("web_instance_num", String.valueOf(arrayList.size()));
            WebSettings settings = getSettings();
            o.LJFF(settings, "this@WebKitView.settings");
            Npth.addTag("web_ua", settings.getUserAgentString());
            C38192Eyq.LIZIZ(new C79607VMd(FD5.LJFF(originUrl), originUrl));
        } catch (Throwable th) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, String.valueOf(th.getMessage()), EnumC39866Fkk.E, null, 4);
        }
        AbstractC60673NrZ abstractC60673NrZ = this.LJLL;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJJL(this, originUrl);
        }
        this.LJLJJL = originUrl;
        String str = getHybridContext().initData;
        if (str != null && (c60607NqV = this.LJLJJLL) != null) {
            c60607NqV.LIZ(C51029K0z.LJJIIZI(new OSZ("initData", new JSONObject(str))));
        }
        InterfaceC40155FpP interfaceC40155FpP = this.LJLZ;
        if (interfaceC40155FpP != null && (LJ = interfaceC40155FpP.LJ()) != null) {
            C60607NqV c60607NqV5 = this.LJLJJLL;
            if (c60607NqV5 != null) {
                map = c60607NqV5.LJI();
            }
            LJ.LJFF(this, map);
        }
        Object tag = getTag(R.id.e8q);
        if (tag instanceof Boolean) {
            z = ((Boolean) tag).booleanValue();
        } else {
            z = false;
        }
        if (z) {
            LIZ(C113554cx.LJJLIIIIJ(new OSZ("usePreCreate", "1")));
        }
        C60607NqV c60607NqV6 = this.LJLJJLL;
        if (c60607NqV6 != null) {
            InterfaceC60012Ngu interfaceC60012Ngu = c60607NqV6.LJIIJ;
            if (interfaceC60012Ngu != null) {
                C60595NqJ LIZ2 = interfaceC60012Ngu.LIZ(new C60595NqJ(originUrl, c60607NqV6.LJIIIZ));
                if (LIZ2 != null) {
                    Map map2 = (Map) LIZ2.LJLJI;
                    if (map2 == null || map2.isEmpty()) {
                        loadUrl((String) LIZ2.LJLILLLLZI);
                        return;
                    }
                    String str2 = (String) LIZ2.LJLILLLLZI;
                    Map map3 = (Map) LIZ2.LJLJI;
                    C60334Nm6 c60334Nm6 = C60327Nlz.LIZ;
                    c60334Nm6.get().LIZ.push(new C89542ZCg[0]);
                    loadUrl(str2, map3);
                    c60334Nm6.get().LIZ.pop();
                    return;
                }
                return;
            }
            loadUrl(originUrl);
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void loadUrl(String str) {
        InterfaceC40148FpI LJ;
        Map<String, Object> map;
        String LIZLLL = C59312NPo.LIZ.LIZLLL(this, str);
        if (!TextUtils.isEmpty(LIZLLL)) {
            str = LIZLLL;
        }
        String str2 = getHybridContext().containerId;
        if (str2 == null) {
            str2 = "";
        }
        FD5.LIZJ(System.currentTimeMillis(), str2, "prepare_engine_load_start");
        InterfaceC40155FpP interfaceC40155FpP = this.LJLZ;
        if (interfaceC40155FpP != null && (LJ = interfaceC40155FpP.LJ()) != null) {
            C60607NqV c60607NqV = this.LJLJJLL;
            if (c60607NqV != null) {
                map = c60607NqV.LJI();
            } else {
                map = null;
            }
            LJ.LJFF(this, map);
        }
        VMI.LJ.LIZLLL(this, str);
        C60728NsS c60728NsS = this.LJLLLL;
        if (c60728NsS != null && c60728NsS.LJ == null && c60728NsS.LIZJ != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = c60728NsS.LIZJ;
            if (l != null) {
                c60728NsS.LJ = C0EM.LIZIZ(l, currentTimeMillis);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        super.loadUrl(str);
    }

    @Override // X.OM1, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        boolean onTouchEvent;
        Boolean LIZ;
        o.LJIIJ(event, "event");
        InterfaceC60615Nqd interfaceC60615Nqd = this.LLFZ;
        if (interfaceC60615Nqd != null) {
            try {
                interfaceC60615Nqd.LJIIIIZZ(event);
                return true;
            } catch (C59240NMu unused) {
            }
        }
        if (this.LLF) {
            int action = event.getAction();
            if (action != 0) {
                if (action == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - this.LL;
                    C39048FUe c39048FUe = C39048FUe.LIZIZ;
                    C39048FUe.LIZIZ(c39048FUe, C61845OOz.LIZ("clickDuration", currentTimeMillis), null, null, 6);
                    if (currentTimeMillis < this.LJZI) {
                        this.LLD = System.currentTimeMillis();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("lastCickTime:");
                        LIZ2.append(this.LLD);
                        LIZ2.append("TapTimeout():");
                        LIZ2.append(ViewConfiguration.getTapTimeout());
                        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ2), null, null, 6);
                    }
                }
            } else {
                this.LL = System.currentTimeMillis();
                C39048FUe c39048FUe2 = C39048FUe.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("startClickTime");
                LIZ3.append(this.LL);
                C39048FUe.LIZIZ(c39048FUe2, X1D.LIZIZ(LIZ3), null, null, 6);
            }
            try {
                C59678NbW c59678NbW = this.LJZ;
                if (c59678NbW != null && (LIZ = c59678NbW.LIZ(event)) != null) {
                    onTouchEvent = LIZ.booleanValue();
                } else {
                    onTouchEvent = super.onTouchEvent(event);
                }
                return onTouchEvent;
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    public final void setBridgeService$hybrid_web_release(InterfaceC60614Nqc interfaceC60614Nqc) {
        this.LJLLILLLL = interfaceC60614Nqc;
    }

    public final void setCanTouch(boolean z) {
        this.LLF = z;
    }

    public void setHybridContext(C60737Nsb c60737Nsb) {
        o.LJIIJ(c60737Nsb, "<set-?>");
        this.LLI = c60737Nsb;
    }

    public final void setHybridRuntime$hybrid_web_release(InterfaceC40155FpP interfaceC40155FpP) {
        this.LJLZ = interfaceC40155FpP;
    }

    public final void setInitParams$hybrid_web_release(C60607NqV c60607NqV) {
        this.LJLJJLL = c60607NqV;
    }

    public final void setJsBridgeOnKitViewProvided(Context context) {
        InterfaceC60614Nqc interfaceC60614Nqc;
        InterfaceC60614Nqc interfaceC60614Nqc2;
        InterfaceC40178Fpm LIZIZ;
        o.LJIIJ(context, "context");
        if (this.LJLLILLLL == null) {
            InterfaceC40155FpP interfaceC40155FpP = this.LJLZ;
            if (interfaceC40155FpP != null && (LIZIZ = interfaceC40155FpP.LIZIZ()) != null) {
                interfaceC60614Nqc2 = LIZIZ.LIZIZ(getHybridContext());
            } else {
                interfaceC60614Nqc2 = null;
            }
            this.LJLLILLLL = interfaceC60614Nqc2;
        }
        if (!this.LJLLL && (interfaceC60614Nqc = this.LJLLILLLL) != null) {
            this.LJLLL = true;
            interfaceC60614Nqc.LJ(context, this);
        }
    }

    public final void setNavigationServiceProtocol$hybrid_web_release(InterfaceC60703Ns3 interfaceC60703Ns3) {
        this.LJLJLLL = interfaceC60703Ns3;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C59678NbW c59678NbW = this.LJZ;
        if (c59678NbW != null) {
            ((C16610kz) c59678NbW.LIZLLL).LJIIJ(z);
        } else {
            super.setNestedScrollingEnabled(z);
        }
    }

    public final void setReadyToSendEvent$hybrid_web_release(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setResource$hybrid_web_release(InterfaceC61488OBg interfaceC61488OBg) {
        this.LJLJL = interfaceC61488OBg;
    }

    public final void setResourceDynamic$hybrid_web_release(InterfaceC65784Pro<? extends InterfaceC61488OBg> interfaceC65784Pro) {
        o.LJIIJ(interfaceC65784Pro, "<set-?>");
        this.LJLJLJ = interfaceC65784Pro;
    }

    public final void setTimeInterval(long j) {
        this.LLFF = j;
    }

    public final void setWebKitLifeCycle$hybrid_web_release(AbstractC60673NrZ abstractC60673NrZ) {
        this.LJLL = abstractC60673NrZ;
    }

    public final void setWebOverScrollByListener(InterfaceC25962AGw interfaceC25962AGw) {
        this.LLFII = interfaceC25962AGw;
    }

    public final void setWebScrollListener(InterfaceC59238NMs interfaceC59238NMs) {
        this.LLFFF = interfaceC59238NMs;
    }

    public final void setWebUrl$hybrid_web_release(String str) {
        this.LJLJJL = str;
    }

    public final void setWebViewEventDelegate(InterfaceC60615Nqd delegate) {
        o.LJIIJ(delegate, "delegate");
        this.LLFZ = delegate;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        C59678NbW c59678NbW = this.LJZ;
        if (c59678NbW != null) {
            return ((C16610kz) c59678NbW.LIZLLL).LJIIJJI(i, 0);
        }
        return super.startNestedScroll(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebKitView(Context context, C60737Nsb hybridContext) {
        super(context);
        HybridSchemaParam LIZLLL;
        o.LJIIJ(context, "context");
        o.LJIIJ(hybridContext, "hybridContext");
        this.LLI = hybridContext;
        this.LJLJLJ = C60616Nqe.LJLIL;
        this.LJZI = 100;
        this.LJZL = 500L;
        this.LLF = true;
        this.LLFF = 500L;
        C39862Fkg.LIZJ = true;
        InterfaceC60710NsA interfaceC60710NsA = getHybridContext().hybridParams;
        if (interfaceC60710NsA != null && (LIZLLL = interfaceC60710NsA.LIZLLL()) != null && LIZLLL.getEnableScrollWebView()) {
            this.LJZ = new C59678NbW(this);
        }
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJ(String eventName, Map<String, ? extends Object> map) {
        o.LJIIJ(eventName, "eventName");
        C60620Nqi.LIZJ(this, eventName, map);
        InterfaceC60614Nqc interfaceC60614Nqc = this.LJLLILLLL;
        if (interfaceC60614Nqc != null) {
            interfaceC60614Nqc.LJFF(eventName);
        }
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJIIIZ(String eventName, JSONObject jSONObject) {
        o.LJIIJ(eventName, "eventName");
        C60620Nqi.LIZIZ(this, eventName, jSONObject);
        InterfaceC60614Nqc interfaceC60614Nqc = this.LJLLILLLL;
        if (interfaceC60614Nqc != null) {
            interfaceC60614Nqc.LIZ(eventName, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60761Nsz
    public final void LJIIJ(String eventName, List<? extends Object> list) {
        Object LJLLLL;
        o.LJIIJ(eventName, "eventName");
        C60620Nqi.LIZ(this, eventName, list);
        JSONObject jSONObject = null;
        if (list != null && (LJLLLL = ORZ.LJLLLL(list)) != 0) {
            if (LJLLLL instanceof JSONObject) {
                jSONObject = LJLLLL;
            }
            jSONObject = jSONObject;
        }
        LJIIIZ(eventName, jSONObject);
    }

    public final void LJLLLL(Context context, C60737Nsb hybridContext) {
        InterfaceC60614Nqc interfaceC60614Nqc;
        InterfaceC60614Nqc interfaceC60614Nqc2;
        InterfaceC40178Fpm LIZIZ;
        o.LJIIJ(hybridContext, "hybridContext");
        if (this.LJLLILLLL == null) {
            InterfaceC40155FpP interfaceC40155FpP = this.LJLZ;
            if (interfaceC40155FpP != null && (LIZIZ = interfaceC40155FpP.LIZIZ()) != null) {
                interfaceC60614Nqc2 = LIZIZ.LIZIZ(hybridContext);
            } else {
                interfaceC60614Nqc2 = null;
            }
            this.LJLLILLLL = interfaceC60614Nqc2;
        }
        if (!this.LJLLJ && (interfaceC60614Nqc = this.LJLLILLLL) != null) {
            this.LJLLJ = true;
            interfaceC60614Nqc.LJI(context, this, this.LJLLI);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        C59678NbW c59678NbW = this.LJZ;
        if (c59678NbW != null) {
            return ((C16610kz) c59678NbW.LIZLLL).LIZIZ(f, f2);
        }
        return super.dispatchNestedPreFling(f, f2);
    }

    @Override // X.OM1, android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        InterfaceC40148FpI LJ;
        Map<String, Object> map2;
        String LIZLLL = C59312NPo.LIZ.LIZLLL(this, str);
        if (!TextUtils.isEmpty(LIZLLL)) {
            str = LIZLLL;
        }
        InterfaceC40155FpP interfaceC40155FpP = this.LJLZ;
        if (interfaceC40155FpP != null && (LJ = interfaceC40155FpP.LJ()) != null) {
            C60607NqV c60607NqV = this.LJLJJLL;
            if (c60607NqV != null) {
                map2 = c60607NqV.LJI();
            } else {
                map2 = null;
            }
            LJ.LJFF(this, map2);
        }
        VMI.LJ.LIZLLL(this, str);
        C60728NsS c60728NsS = this.LJLLLL;
        if (c60728NsS != null && c60728NsS.LJ == null && c60728NsS.LIZJ != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = c60728NsS.LIZJ;
            if (l != null) {
                c60728NsS.LJ = C0EM.LIZIZ(l, currentTimeMillis);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        super.loadUrl(str, map);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        C59678NbW c59678NbW = this.LJZ;
        if (c59678NbW != null) {
            return ((C16610kz) c59678NbW.LIZLLL).LIZ(f, f2, z);
        }
        return super.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        C59678NbW c59678NbW = this.LJZ;
        if (c59678NbW != null) {
            return ((C16610kz) c59678NbW.LIZLLL).LIZLLL(i, i2, iArr, iArr2);
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // X.OM1, android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC59238NMs interfaceC59238NMs = this.LLFFF;
        if (interfaceC59238NMs != null) {
            interfaceC59238NMs.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        C59678NbW c59678NbW = this.LJZ;
        if (c59678NbW != null) {
            return ((C16610kz) c59678NbW.LIZLLL).LJFF(i, i2, i3, i4, iArr);
        }
        return super.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // X.OM1, android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        InterfaceC25962AGw interfaceC25962AGw = this.LLFII;
        if (interfaceC25962AGw != null) {
            interfaceC25962AGw.LIZ(i, i2);
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
