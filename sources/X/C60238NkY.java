package X;

import Y.IDHandlerS19S0100000_6;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.bullet.service.base.web.WebChromeClientDispatcher;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS173S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NkY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60238NkY extends AbstractC60239NkZ<C59614NaU> implements NUX, InterfaceC39974FmU {
    public C60245Nkf LLI;
    public final List<InterfaceC59659NbD> LLIFFJFJJ;
    public InterfaceC48694J9e LLII;
    public final C62822Ol8 LLIIII;
    public final VMI LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final List<String> LLIIIL;
    public final List<String> LLIIIZ;
    public final List<String> LLIIJI;
    public final List<String> LLIIJLIL;
    public Boolean LLIIL;
    public String LLIILII;
    public String LLIILZL;
    public Boolean LLIIZ;
    public android.net.Uri LLIL;
    public C38182Eyg LLILII;
    public C59614NaU LLILIL;
    public final AtomicBoolean LLILL;
    public final C62822Ol8 LLILLIZIL;
    public final C62822Ol8 LLILLJJLI;
    public java.util.Map<String, String> LLILLL;
    public final C60216NkC LLILZ;
    public final java.util.Map<String, Object> LLILZIL;
    public long LLILZLL;
    public final java.util.Map<android.net.Uri, Long> LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.InterfaceC60212Nk8
    public final void LIZIZ() {
    }

    @Override // X.AbstractC60240Nka
    public final void LJFF(android.net.Uri uri, InterfaceC88472Yns reject) {
        o.LJIIJ(uri, "uri");
        o.LJIIJ(reject, "reject");
    }

    @Override // X.AbstractC60239NkZ, X.AbstractC60240Nka
    public final void LJII() {
        Context context;
        C59614NaU LIZ;
        boolean z;
        boolean z2;
        boolean z3;
        C60510Now LJFF;
        JSONObject jSONObject;
        Iterator<String> keys;
        InterfaceC60279NlD monitorHelper;
        this.LLI = null;
        this.LLIIL = null;
        this.LLIILII = null;
        this.LLIILZL = null;
        ((ArrayList) this.LLIIJI).clear();
        ((ArrayList) this.LLIIJLIL).clear();
        ((ArrayList) this.LLIIIL).clear();
        ((ArrayList) this.LLIIIZ).clear();
        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this, 109);
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            InterfaceC60282NlG interfaceC60282NlG = (InterfaceC60282NlG) it.next();
            if ((interfaceC60282NlG instanceof InterfaceC60244Nke) && interfaceC60282NlG != null) {
                aqS176S0100000_10.invoke(interfaceC60282NlG);
            }
        }
        InterfaceC60282NlG interfaceC60282NlG2 = this.LJLJJI;
        if ((interfaceC60282NlG2 instanceof InterfaceC60244Nke) && interfaceC60282NlG2 != null) {
            aqS176S0100000_10.invoke(interfaceC60282NlG2);
        }
        if (this.LJLLJ && (context = (Context) this.LLF.LIZJ(Context.class)) != null) {
            C60271Nl5 c60271Nl5 = new C60271Nl5();
            WebView LJ = LJJ().LIZ(context, null).LJ();
            OFH ofh = OFH.LIZLLL;
            String str = this.LLF.LIZ;
            ofh.getClass();
            OFH.LIZJ(str, "container_name", "bullet");
            OFH.LIZ(this.LLF.LIZ, new COL(LJ, "web"));
            if (LJ instanceof C59614NaU) {
                LIZ = (C59614NaU) LJ;
            } else if (this.LL != null) {
                LIZ = WebKitApi.LIZ(context);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.web.WebKitApi");
            }
            InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60299NlX.LIZ(this, InterfaceC60276NlA.class);
            LIZ.setMonitorHelper(this.LLIIIILZ);
            if (interfaceC60276NlA != null && (LJFF = interfaceC60276NlA.LJFF()) != null && (jSONObject = LJFF.LIZLLL) != null && (keys = jSONObject.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (opt != null && (monitorHelper = LIZ.getMonitorHelper()) != null) {
                        monitorHelper.LJIIIIZZ(LIZ, opt, next);
                    }
                }
            }
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - c60271Nl5.LIZ);
            C60203Njz c60203Njz = (C60203Njz) this.LLF.LIZJ(C60203Njz.class);
            if (c60203Njz != null) {
                c60203Njz.LJFF = Long.valueOf(millis);
                Object tag = LIZ.getTag(R.id.ni6);
                if (tag instanceof Boolean) {
                    z3 = ((Boolean) tag).booleanValue();
                } else {
                    z3 = false;
                }
                c60203Njz.LJ = z3;
            }
            this.LLILIL = LIZ;
            F3T f3t = this.LLF;
            f3t.getClass();
            f3t.LJ(WebView.class, new F26(LIZ));
            C59614NaU c59614NaU = this.LLILIL;
            if (c59614NaU != null) {
                C38182Eyg c38182Eyg = new C38182Eyg(c59614NaU);
                Boolean bool = this.LLIIL;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                c38182Eyg.LJI = z;
                String str2 = this.LLIILII;
                if (str2 == null) {
                    str2 = "ToutiaoJSBridge";
                }
                c38182Eyg.LJII = str2;
                String str3 = this.LLIILZL;
                if (str3 == null) {
                    str3 = "bytedance";
                }
                c38182Eyg.LJIIIIZZ = str3;
                List<String> safeHost = this.LLIIJI;
                o.LJIIJ(safeHost, "safeHost");
                ((ArrayList) c38182Eyg.LIZJ).addAll(safeHost);
                List<String> safeHost2 = this.LLIIJLIL;
                o.LJIIJ(safeHost2, "safeHost");
                ((ArrayList) c38182Eyg.LIZLLL).addAll(safeHost2);
                List<String> publicFunc = this.LLIIIL;
                o.LJIIJ(publicFunc, "publicFunc");
                ((ArrayList) c38182Eyg.LJ).addAll(publicFunc);
                List<String> protectedFunc = this.LLIIIZ;
                o.LJIIJ(protectedFunc, "protectedFunc");
                ((ArrayList) c38182Eyg.LJFF).addAll(protectedFunc);
                Boolean bool2 = this.LLIIZ;
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                } else {
                    z2 = false;
                }
                c38182Eyg.LJIIIZ = z2;
                C59614NaU c59614NaU2 = this.LLILIL;
                if (c59614NaU2 != null) {
                    c38182Eyg.LJIIJ = new C38208Ez6(this, c59614NaU2);
                    c38182Eyg.LIZ();
                    F3T f3t2 = this.LLF;
                    C38049EwX c38049EwX = c38182Eyg.LJIIJJI;
                    f3t2.getClass();
                    f3t2.LJ(C38049EwX.class, new F25(c38049EwX));
                    F3T f3t3 = this.LLF;
                    C38118Exe c38118Exe = c38182Eyg.LJIIL;
                    f3t3.getClass();
                    f3t3.LJ(C38118Exe.class, new F25(c38118Exe));
                    this.LLILII = c38182Eyg;
                    InterfaceC38157EyH interfaceC38157EyH = C37905EuD.LJFF;
                    if (interfaceC38157EyH != null) {
                        interfaceC38157EyH.LJIILLIIL();
                    }
                    if (C37905EuD.LJI) {
                        ((C37905EuD) this.LLILLJJLI.getValue()).LIZ(new C38001Evl(this));
                        C37905EuD c37905EuD = (C37905EuD) this.LLILLJJLI.getValue();
                        C59614NaU c59614NaU3 = this.LLILIL;
                        if (c59614NaU3 != null) {
                            c37905EuD.LIZIZ(c59614NaU3, this.LLD.LJLIL, false);
                            ((C37905EuD) this.LLILLJJLI.getValue()).LIZLLL("bullet_webJsBridge", new C38170EyU(this));
                            return;
                        } else {
                            o.LJIJI("mWebView");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("mWebView");
                throw null;
            }
            o.LJIJI("mWebView");
            throw null;
        }
    }

    @Override // X.AbstractC60240Nka
    public final void LJIIJ(List packageNames, C60251Nkl c60251Nkl) {
        o.LJIIJ(packageNames, "packageNames");
    }

    public final InterfaceC60255Nkp LJJ() {
        return (InterfaceC60255Nkp) this.LLIIII.getValue();
    }

    @Override // X.AbstractC60239NkZ
    public final void LJIILLIIL() {
        onEvent(new C78999UzT());
    }

    public final C59305NPh LJIL() {
        AbstractC59475NVv abstractC59475NVv = this.LJLLI;
        if (abstractC59475NVv != null) {
            return (C59305NPh) abstractC59475NVv;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final boolean LJJI() {
        Object LIZJ = this.LLF.LIZJ(EnumC53636L3g.class);
        if (LIZJ != null && LIZJ != EnumC53636L3g.NONE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.NUX
    public final WebView getView() {
        WebView webView;
        C60213Nk9 c60213Nk9;
        WebView webView2 = null;
        if ((!((ArrayList) this.LLFF).isEmpty()) && (c60213Nk9 = (C60213Nk9) ListProtector.get(this.LLFF, 0)) != null) {
            webView = c60213Nk9.LIZIZ;
        } else {
            webView = null;
        }
        if (webView instanceof WebView) {
            webView2 = webView;
        }
        return webView2;
    }

    @Override // X.AbstractC60239NkZ, X.AbstractC60240Nka
    public final void LJIIIZ() {
        super.LJIIIZ();
        InterfaceC60187Njj LJIJ = LJIJ();
        if (LJIJ != null) {
            LJIJ.LIZ(this.LLILZ);
        }
    }

    @Override // X.AbstractC60240Nka
    public final void LJIIJJI() {
        InterfaceC60187Njj LJIJ = LJIJ();
        if (LJIJ != null) {
            LJIJ.LJIIJJI(this.LLILZ);
        }
        this.LLF.LJI(C38049EwX.class);
        this.LLF.LJI(C38118Exe.class);
        C38182Eyg c38182Eyg = this.LLILII;
        if (c38182Eyg != null) {
            C38049EwX c38049EwX = c38182Eyg.LJIIJJI;
            if (c38049EwX != null) {
                c38049EwX.LIZ = null;
                IDHandlerS19S0100000_6 iDHandlerS19S0100000_6 = c38049EwX.LJIIJ;
                if (iDHandlerS19S0100000_6 != null) {
                    iDHandlerS19S0100000_6.removeCallbacksAndMessages(null);
                }
                c38049EwX.LJI = null;
                c38049EwX.LJFF = null;
            }
            C38113ExZ c38113ExZ = c38182Eyg.LJIILIIL;
            if (c38113ExZ != null) {
                c38113ExZ.LJ();
            }
        }
        this.LLILII = null;
        Iterator it = ((ArrayList) this.LLFF).iterator();
        while (it.hasNext()) {
            C59614NaU c59614NaU = (C59614NaU) ((C60213Nk9) it.next()).LIZIZ;
            c59614NaU.setWebChromeClient(null);
            C52300Kfo.LIZ();
            c59614NaU.setWebViewClient(null);
            try {
                c59614NaU.destroy();
            } catch (Throwable unused) {
            }
        }
        ((C37905EuD) this.LLILLJJLI.getValue()).LJ();
        LJJ().destroy();
    }

    @Override // X.AbstractC60239NkZ
    public final void LJIIZILJ() {
        if (LJJI() && this.LLILL.compareAndSet(false, true)) {
            C39973FmT.LIZIZ(this, "send pageReused event for reused view", null, null, 6);
            onEvent(new C40200Fq8(this));
        }
        onEvent(new C79043V0l());
    }

    @Override // X.NUX
    public final C38182Eyg c0() {
        return this.LLILII;
    }

    @Override // X.InterfaceC40516FvE
    public final android.net.Uri rk() {
        return this.LLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0212  */
    @Override // X.InterfaceC60212Nk8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C60213Nk9<X.C59614NaU> r9) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60238NkY.LIZJ(X.Nk9):void");
    }

    @Override // X.AbstractC60239NkZ
    public final void LJIILL(AqS141S0200000_10 aqS141S0200000_10) {
        if (this.LLF.LIZJ(Context.class) != null) {
            C59614NaU c59614NaU = this.LLILIL;
            if (c59614NaU != null) {
                aqS141S0200000_10.invoke(C47261Igj.LJJIJ(new C60213Nk9(c59614NaU)));
            } else {
                o.LJIJI("mWebView");
                throw null;
            }
        }
    }

    @Override // X.NUX
    public final void Nf(java.util.Map<String, String> map) {
        this.LLILLL = map;
    }

    @Override // X.AbstractC60239NkZ, X.AbstractC60240Nka, X.InterfaceC40516FvE
    public void onEvent(F22 event) {
        o.LJIIJ(event, "event");
        Object params = event.getParams();
        JSONObject jSONObject = null;
        if (params != null && (params instanceof JSONObject)) {
            jSONObject = (JSONObject) params;
        }
        C38182Eyg c38182Eyg = this.LLILII;
        if (c38182Eyg != null) {
            c38182Eyg.LIZLLL(event.getName(), jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [T, android.net.Uri, java.lang.Object] */
    @Override // X.AbstractC60240Nka
    public final void LJIIL(boolean z, android.net.Uri input) {
        String str;
        java.util.Map<String, Object> LIZIZ;
        android.net.Uri uri;
        T t;
        C59239NMt c59239NMt;
        android.net.Uri uri2;
        AbstractC59475NVv abstractC59475NVv;
        C59239NMt LIZ;
        java.util.Map<String, String> LJJLIL;
        Long value;
        Context context;
        o.LJIIJ(input, "input");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start to load url: ");
        LIZ2.append(input);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ2), null, null, 6);
        OFH ofh = OFH.LIZLLL;
        String str2 = this.LLF.LIZ;
        String uri3 = input.toString();
        o.LJFF(uri3, "input.toString()");
        ofh.getClass();
        OFH.LIZJ(str2, "schema", uri3);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = input;
        if (o.LJ(LJIL().LJJII.getValue(), Boolean.TRUE)) {
            ?? build = input.buildUpon().appendQueryParameter("container_id", this.LLD.LJLIL).build();
            o.LJFF(build, "input.buildUpon().append…, sessionInfo.id).build()");
            c68322mC.element = build;
        }
        if (o.LJ(LJIL().LJJJJZ.getValue(), "true") && (context = (Context) this.LLF.LIZJ(Context.class)) != null) {
            int LIZ3 = C60592NqG.LIZ(context);
            Uri.Builder buildUpon = ((android.net.Uri) c68322mC.element).buildUpon();
            float f = LIZ3 + 0.0f;
            Resources resources = context.getResources();
            o.LJFF(resources, "context.resources");
            ?? build2 = buildUpon.appendQueryParameter("status_bar_height", String.valueOf((int) ((f / resources.getDisplayMetrics().density) + 0.5f))).build();
            o.LJFF(build2, "url.buildUpon().appendQu…0.0f).toString()).build()");
            c68322mC.element = build2;
        }
        if (this.LLIL == null || (!o.LJ(r0, input))) {
            if (!this.LLILZIL.isEmpty()) {
                ((LinkedHashMap) this.LLILZIL).clear();
            }
            java.util.Map<String, Object> map = this.LLILZIL;
            map.put("bullet_version", "2.1.4-rc.37-tiktok");
            map.put("containerID", this.LLD.LJLIL);
            Iterator it = ((ArrayList) this.LJLJL).iterator();
            while (it.hasNext()) {
                InterfaceC60282NlG interfaceC60282NlG = (InterfaceC60282NlG) it.next();
                if (interfaceC60282NlG != null) {
                    java.util.Map<String, Object> LIZIZ2 = ((InterfaceC60244Nke) interfaceC60282NlG).LIZIZ(this, this.LLF);
                    if (LIZIZ2 != null) {
                        map.putAll(LIZIZ2);
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.web.IWebKitSettingsProvider");
                }
            }
            InterfaceC60282NlG interfaceC60282NlG2 = this.LJLJJI;
            if (!(interfaceC60282NlG2 instanceof InterfaceC60244Nke)) {
                interfaceC60282NlG2 = null;
            }
            InterfaceC60244Nke interfaceC60244Nke = (InterfaceC60244Nke) interfaceC60282NlG2;
            if (interfaceC60244Nke != null && (LIZIZ = interfaceC60244Nke.LIZIZ(this, this.LLF)) != null) {
                map.putAll(LIZIZ);
            }
            C60549NpZ c60549NpZ = this.LJLLLLLL;
            if (c60549NpZ != null) {
                str = c60549NpZ.LIZIZ();
            } else {
                str = "";
            }
            map.put("resolvedUrl", str);
            if (!this.LLILZIL.isEmpty()) {
                C60339NmB LIZLLL = LJJ().LIZLLL();
                LIZLLL.LIZIZ(this.LLILZIL);
                C59614NaU c59614NaU = this.LLILIL;
                if (c59614NaU != null) {
                    LIZLLL.LIZ(c59614NaU);
                }
            }
        }
        C60203Njz c60203Njz = (C60203Njz) this.LLF.LIZJ(C60203Njz.class);
        if (c60203Njz != null && c60203Njz.LIZLLL == null && c60203Njz.LIZIZ != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = c60203Njz.LIZIZ;
            if (l != null) {
                c60203Njz.LIZLLL = C0EM.LIZIZ(l, currentTimeMillis);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        this.LLILZLL = System.currentTimeMillis();
        if (o.LJ(LJIL().LJJIJL.getValue(), Boolean.TRUE) && (value = LJIL().LJJIJLIJ.getValue()) != null) {
            long longValue = value.longValue();
            if (longValue > 0) {
                Thread.sleep(longValue);
            }
        }
        boolean LJJI = LJJI();
        Iterator it2 = ((ArrayList) this.LLFF).iterator();
        while (it2.hasNext()) {
            C60213Nk9 c60213Nk9 = (C60213Nk9) it2.next();
            c60213Nk9.LIZIZ(input);
            C59614NaU c59614NaU2 = (C59614NaU) c60213Nk9.LIZIZ;
            if (z || LJJI) {
                ?? r12 = (android.net.Uri) c68322mC.element;
                if (z) {
                    C39973FmT.LIZIZ(this, "start to reload webview", null, null, 6);
                    InterfaceC60259Nkt interfaceC60259Nkt = (InterfaceC60259Nkt) this.LLF.LIZJ(InterfaceC60259Nkt.class);
                    if (interfaceC60259Nkt != null && (uri2 = this.LLIL) != null && (abstractC59475NVv = this.LJLLI) != null) {
                        interfaceC60259Nkt.LIZ(this, uri2, abstractC59475NVv);
                    }
                    android.net.Uri uri4 = this.LLIL;
                    t = r12;
                    if (uri4 != null) {
                        LJIIL(true, uri4);
                        t = r12;
                    }
                } else {
                    if (LJJI) {
                        C39973FmT.LIZIZ(this, "start to reload cached view", null, null, 6);
                        InterfaceC48694J9e interfaceC48694J9e = this.LLII;
                        if (interfaceC48694J9e != null) {
                            c59239NMt = interfaceC48694J9e.LIZ();
                        } else {
                            c59239NMt = null;
                        }
                        if (c59239NMt == null) {
                            uri = r12;
                        } else {
                            C68322mC c68322mC2 = new C68322mC();
                            c68322mC2.element = r12;
                            C59614NaU c59614NaU3 = this.LLILIL;
                            if (c59614NaU3 != null) {
                                c59239NMt.invoke(c59614NaU3, String.valueOf((Object) r12), (java.util.Map<String, String>) null, (InterfaceC88471Ynr<? super String, ? super java.util.Map<String, String>, ? extends C76800UCe>) new AqS183S0100000_1(c68322mC2, 76));
                                uri = (android.net.Uri) c68322mC2.element;
                            } else {
                                o.LJIJI("mWebView");
                                throw null;
                            }
                        }
                        this.LLIL = uri;
                        LJIIIZ();
                        C59614NaU c59614NaU4 = this.LLILIL;
                        if (c59614NaU4 != null) {
                            c59614NaU4.onResume();
                            LJIJI();
                        } else {
                            o.LJIJI("mWebView");
                            throw null;
                        }
                    } else {
                        uri = r12;
                    }
                    c60213Nk9.LIZJ(r12);
                    t = uri;
                }
                c68322mC.element = t;
            } else {
                InterfaceC48694J9e interfaceC48694J9e2 = this.LLII;
                if (interfaceC48694J9e2 != null && (LIZ = interfaceC48694J9e2.LIZ()) != null) {
                    java.util.Map<String, String> map2 = this.LLILLL;
                    if (map2 == null) {
                        LJJLIL = null;
                    } else {
                        LJJLIL = C113554cx.LJJLIL(map2);
                    }
                    LIZ.invoke(c59614NaU2, String.valueOf(c68322mC.element), LJJLIL, (InterfaceC88471Ynr<? super String, ? super java.util.Map<String, String>, ? extends C76800UCe>) new AqS173S0200000_10(c59614NaU2, c68322mC, 3));
                } else if (this.LLILLL != null) {
                    String valueOf = String.valueOf(c68322mC.element);
                    java.util.Map<String, String> map3 = this.LLILLL;
                    if (map3 != null) {
                        c59614NaU2.loadUrl(valueOf, map3);
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    c59614NaU2.loadUrl(String.valueOf(c68322mC.element));
                }
            }
        }
        this.LLIL = (android.net.Uri) c68322mC.element;
    }

    @Override // X.AbstractC60240Nka
    public final void LJIILJJIL(List<String> packageNames, InterfaceC60246Nkg kitPackageRegistryBundle) {
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(kitPackageRegistryBundle, "kitPackageRegistryBundle");
        super.LJIILJJIL(packageNames, kitPackageRegistryBundle);
        LJJ().LIZJ().LIZ.clear();
        LJJ().LIZIZ().LIZ.clear();
        ((ArrayList) this.LLIFFJFJJ).clear();
        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this, 110);
        Object LIZJ = this.LLF.LIZJ(InterfaceC59659NbD.class);
        if (LIZJ != null) {
            ((ArrayList) this.LLIFFJFJJ).add(LIZJ);
        }
        C59458NVe c59458NVe = (C59458NVe) this.LLF.LIZJ(C59458NVe.class);
        if (c59458NVe != null) {
            c59458NVe.LJFF(this);
            LJJ().LIZJ().LIZ.add(c59458NVe);
        }
        C59582NZy LIZJ2 = LJJ().LIZJ();
        LIZJ2.LIZ.add(new C59623Nad(this.LLIIIILZ));
        WebChromeClientDispatcher LIZIZ = LJJ().LIZIZ();
        LIZIZ.LIZ.add(new C59826Ndu(this.LLIIIILZ));
        Iterator it = ((ArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            InterfaceC60281NlF interfaceC60281NlF = (InterfaceC60281NlF) it.next();
            if ((interfaceC60281NlF instanceof InterfaceC60257Nkr) && interfaceC60281NlF != null) {
                aqS176S0100000_10.invoke(interfaceC60281NlF);
            }
        }
        InterfaceC60281NlF interfaceC60281NlF2 = this.LJLJJL;
        if ((interfaceC60281NlF2 instanceof InterfaceC60257Nkr) && interfaceC60281NlF2 != null) {
            aqS176S0100000_10.invoke(interfaceC60281NlF2);
        }
        C38934FPu c38934FPu = this.LJLL;
        if (c38934FPu != null) {
            c38934FPu.LIZJ(new AqS188S0100000_6(this, 12));
        }
    }

    @Override // X.AbstractC60239NkZ
    public final void LJIJJ(C60213Nk9<C59614NaU> viewComponent, android.net.Uri uri) {
        o.LJIIJ(viewComponent, "viewComponent");
        o.LJIIJ(uri, "uri");
        System.currentTimeMillis();
        super.LJIJJ(viewComponent, uri);
    }

    @Override // X.AbstractC60240Nka
    public final void LJIIIIZZ(android.net.Uri input, AqS137S0200000_6 aqS137S0200000_6, InterfaceC88472Yns reject) {
        o.LJIIJ(input, "input");
        o.LJIIJ(reject, "reject");
        aqS137S0200000_6.invoke(input);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60238NkY(WebKitApi kitApi, F21 sessionInfo, List packageNames, C60251Nkl c60251Nkl, F3T providerFactory) {
        super(kitApi, sessionInfo, packageNames, c60251Nkl, providerFactory);
        String str;
        o.LJIIJ(kitApi, "kitApi");
        o.LJIIJ(sessionInfo, "sessionInfo");
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(providerFactory, "providerFactory");
        this.LLIFFJFJJ = new ArrayList();
        this.LLIIII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 428));
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60299NlX.LIZ(this, InterfaceC60276NlA.class);
        VMI vmi = null;
        if (interfaceC60276NlA != null) {
            VMI vmi2 = VMI.LJ;
            vmi2.getClass();
            C60601NqP c60601NqP = new C60601NqP();
            c60601NqP.LIZJ = new C60275Nl9(interfaceC60276NlA);
            C60510Now LJFF = interfaceC60276NlA.LJFF();
            if (LJFF != null) {
                str = LJFF.LIZIZ;
            } else {
                str = null;
            }
            c60601NqP.LJI = str;
            C60510Now LJFF2 = interfaceC60276NlA.LJFF();
            c60601NqP.LJFF = LJFF2 != null ? LJFF2.LIZ : null;
            c60601NqP.LJ = true;
            c60601NqP.LIZ = new String[]{C59614NaU.class.getName()};
            vmi2.LJIILJJIL(c60601NqP);
            vmi = vmi2;
        }
        this.LLIIIILZ = vmi;
        this.LLIIIJ = C221108m2.LIZIZ(new AqS160S0100000_10(providerFactory, 429));
        this.LLIIIL = new ArrayList();
        this.LLIIIZ = new ArrayList();
        this.LLIIJI = new ArrayList();
        this.LLIIJLIL = new ArrayList();
        this.LLILL = new AtomicBoolean(false);
        this.LLILLIZIL = C221108m2.LIZIZ(new AqS157S0200000_10(this, providerFactory, 26));
        this.LLILLJJLI = C221108m2.LIZIZ(C38009Evt.LJLIL);
        this.LLILZ = new C60216NkC(this, providerFactory);
        this.LLILZIL = new LinkedHashMap();
        this.LLIZ = new LinkedHashMap();
    }
}
