package X;

import android.net.http.SslError;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.NxR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61037NxR extends AbstractC61039NxT implements InterfaceC59585Na1 {
    public final List<String> LJIIIIZZ;
    public final C5H3 LJIIIZ;
    public final C5H3 LJIIJ;
    public final C5H3 LJIIJJI;
    public long LJIIL;
    public final C5H3 LJIILIIL;
    public boolean LJIILJJIL;
    public List<String> LJIILL;
    public final List<K1E> LJIILLIIL;
    public boolean LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public final java.util.Map<android.net.Uri, Long> LJIJJ;

    @Override // X.AbstractC59640Nau, X.InterfaceC59877Nej
    public final void end() {
        this.LIZJ = false;
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIIJ() {
        C59642Naw c59642Naw = C59642Naw.LIZ;
        if (((ArrayList) this.LJIILLIIL).contains(c59642Naw)) {
            return;
        }
        ((ArrayList) this.LJIILLIIL).add(c59642Naw);
    }

    public final C61038NxS LJJJ() {
        return (C61038NxS) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIIIZ() {
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null) {
            LJJJ.LIZIZ.LJIIZILJ++;
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIJJ() {
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null) {
            C61042NxW c61042NxW = LJJJ.LIZIZ;
            if (c61042NxW.LJIIJJI == 0) {
                c61042NxW.LJIIJJI = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJJIFFI() {
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null) {
            LJJJ.LIZIZ.LJIILL++;
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJJII() {
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null) {
            LJJJ.LIZIZ.LJIILJJIL++;
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJJIIJZLJL() {
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null) {
            LJJJ.LIZIZ.LJIJ++;
        }
    }

    @Override // X.F1B
    public final void onViewAttachedToWindow() {
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null) {
            LJJJ.LIZIZ.LIZJ = SystemClock.uptimeMillis();
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJII(SslError sslError) {
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null && sslError != null) {
            C61042NxW c61042NxW = LJJJ.LIZIZ;
            c61042NxW.LJIJI = -3;
            c61042NxW.LJIJJ = Integer.valueOf(sslError.getPrimaryError());
            LJJJ.LIZIZ.LJIL = sslError.getUrl();
            LJJJ.LIZIZ.LJIJJLI = sslError.toString();
            LJJJ.LIZ();
        }
        C61040NxU LJJI = LJJI();
        JSONObject LIZJ = C65232Piu.LIZJ("trigger", "on_received_ssl_error");
        if (sslError != null) {
            LIZJ.put("received_primary_error", String.valueOf(sslError.getPrimaryError()));
            LIZJ.put("failing_url", sslError.getUrl());
        }
        AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_h5_received_error", LJJI, LIZJ, null, 24);
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIILL(android.net.Uri uri) {
        if ((o.LJ(uri.getScheme(), "http") || o.LJ(uri.getScheme(), "https")) && 1 != 0) {
            C61041NxV LJJIJIIJI = LJJIJIIJI();
            LJJIJIIJI.getClass();
            LJJIJIIJI.LJLJI = new C61040NxU(uri, "page_", null, 4);
            C61038NxS LJJJ = LJJJ();
            if (LJJJ != null) {
                String url = LJJIJIIJI().LJLJI.getUrl();
                C61042NxW c61042NxW = LJJJ.LIZIZ;
                c61042NxW.LJI = url;
                if (c61042NxW.LJIIIZ == 0) {
                    c61042NxW.LJIIIZ = SystemClock.uptimeMillis();
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.LJIJJ.put(uri, Long.valueOf(currentTimeMillis));
            if (!this.LJIIZILJ) {
                C61040NxU LJJI = LJJI();
                JSONObject LJ = C47135Ieh.LJ("trigger", "navigation_start", "is_first_screen", "navigation");
                JSONObject jSONObject = new JSONObject();
                long j = this.LJIJI;
                if (j > 0 && this.LJIJ > 0) {
                    jSONObject.put("first_screen_page_load_interval", j - this.LJIJ);
                }
                jSONObject.put("event_ts", currentTimeMillis);
                AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_load_url_event", LJJI, LJ, jSONObject, 16);
            }
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIILLIIL(android.net.Uri uri) {
        Long remove;
        String str;
        if ((o.LJ(uri.getScheme(), "http") || o.LJ(uri.getScheme(), "https")) && (remove = this.LJIJJ.remove(uri)) != null) {
            long longValue = remove.longValue();
            C61038NxS LJJJ = LJJJ();
            if (LJJJ != null) {
                String url = LJJIJIIJI().LJLJI.getUrl();
                if (LJJJ.LIZIZ.LJIIJ == 0 && !C59643Nax.LIZIZ(url)) {
                    C61042NxW c61042NxW = LJJJ.LIZIZ;
                    c61042NxW.LJI = url;
                    c61042NxW.LJIIJ = SystemClock.uptimeMillis();
                    LJJJ.LIZIZ(true, false);
                }
                LJJJ.LJIIJ.removeCallbacks(LJJJ.LJIIL);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.LJIIZILJ) {
                longValue = this.LJIJ;
                this.LJIJI = currentTimeMillis;
            }
            C61040NxU LJJI = LJJI();
            JSONObject LIZJ = C65232Piu.LIZJ("trigger", "on_load");
            if (this.LJIIZILJ) {
                str = "first_screen";
            } else {
                str = "navigation";
            }
            LIZJ.put("is_first_screen", str);
            JSONObject jSONObject = new JSONObject();
            if (currentTimeMillis > 0 && longValue > 0) {
                jSONObject.put("page_load_interval", currentTimeMillis - longValue);
            }
            long j = this.LJIJI;
            if (j > 0 && this.LJIJ > 0) {
                jSONObject.put("first_screen_page_load_interval", j - this.LJIJ);
            }
            jSONObject.put("event_ts", currentTimeMillis);
            AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_load_url_event", LJJI, LIZJ, jSONObject, 16);
            this.LJIIZILJ = false;
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIJ(String str) {
        android.net.Uri parse;
        if (str != null && (parse = UriProtector.parse(str)) != null && !LJJIL(parse, "should_intercept_request")) {
            LJJIZ(parse, "should_intercept_request");
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIJI(String str) {
        android.net.Uri parse;
        if (str != null && (parse = UriProtector.parse(str)) != null && !LJJIL(parse, "should_override_url_loading")) {
            LJJIZ(parse, "should_override_url_loading");
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJJIII(boolean z) {
        this.LJIILJJIL = z;
    }

    @Override // X.InterfaceC59585Na1
    public final void LJJIIZ(List<String> list) {
        this.LJIILL = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.json.JSONObject] */
    public final void LJJJIL(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Iterator<String> keys;
        JSONObject jSONObject2;
        C61045NxZ LIZ;
        JSONObject optJSONObject3;
        JSONArray optJSONArray;
        String optString = jSONObject.optString("navigation_id");
        String optString2 = jSONObject.optString("ev_type");
        if (optString2 != null) {
            int i = 4;
            Double d = null;
            JSONObject jSONObject3 = 0;
            switch (optString2.hashCode()) {
                case -1077756671:
                    if (!optString2.equals("memory")) {
                        return;
                    }
                    AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_js_memory", LJJIJIIJI(), C65232Piu.LIZJ("navigation_id", optString), jSONObject.optJSONObject("event"), 16);
                    return;
                case -270976012:
                    if (!optString2.equals("performance_interval") || (optJSONObject = jSONObject.optJSONObject("event")) == null || (optJSONObject2 = optJSONObject.optJSONObject("navigation")) == null || (keys = optJSONObject2.keys()) == null) {
                        return;
                    }
                    while (keys.hasNext()) {
                        String eventKey = keys.next();
                        Double valueOf = Double.valueOf(optJSONObject2.optDouble(eventKey, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
                        if (valueOf.doubleValue() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && !((ArrayList) this.LJIIIIZZ).contains(eventKey)) {
                            valueOf.doubleValue();
                            List<String> list = this.LJIIIIZZ;
                            o.LJIIIIZZ(eventKey, "eventKey");
                            ((ArrayList) list).add(eventKey);
                            C61041NxV LJJIJIIJI = LJJIJIIJI();
                            JSONObject LJ = C47135Ieh.LJ("trigger", eventKey, "navigation_id", optString);
                            EnumC61054Nxi type = EnumC61054Nxi.H5_TIMING;
                            o.LJIIIZ(type, "type");
                            C61051Nxf LIZ2 = C61056Nxk.LIZ(type);
                            if (LIZ2 != null && (LIZ = LIZ2.LIZ(eventKey, optJSONObject2)) != null) {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put(LIZ.LJLIL, LIZ.LJLILLLLZI);
                            } else {
                                jSONObject2 = null;
                            }
                            AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_h5_timeline_event", LJJIJIIJI, LJ, jSONObject2, 16);
                        }
                    }
                    return;
                case 101609:
                    if (!optString2.equals("fps")) {
                        return;
                    }
                    JSONObject optJSONObject4 = jSONObject.optJSONObject("event");
                    if (optJSONObject4 != null) {
                        d = Double.valueOf(optJSONObject4.optDouble("fps"));
                    }
                    C61041NxV LJJIJIIJI2 = LJJIJIIJI();
                    JSONObject LIZJ = C65232Piu.LIZJ("navigation_id", optString);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("fps", d);
                    AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_js_fps", LJJIJIIJI2, LIZJ, jSONObject4, 16);
                    return;
                case 1669986551:
                    if (!optString2.equals("static_error")) {
                        return;
                    }
                    JSONObject optJSONObject5 = jSONObject.optJSONObject("event");
                    C61041NxV LJJIJIIJI3 = LJJIJIIJI();
                    JSONObject LIZJ2 = C65232Piu.LIZJ("navigation_id", optString);
                    if (optJSONObject5 != null) {
                        android.net.Uri parse = UriProtector.parse(optJSONObject5.optString("st_url"));
                        o.LJIIIIZZ(parse, "parse(it.optString(\"st_url\"))");
                        C78983UzD.LJJLIIIJLLLLLLLZ(LIZJ2, new C61040NxU(parse, "resource_", null, 4).getFormatData());
                    }
                    AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_load_resource_error", LJJIJIIJI3, LIZJ2, null, 24);
                    return;
                case 1837434847:
                    if (!optString2.equals("static_performance") || (optJSONObject3 = jSONObject.optJSONObject("event")) == null || (optJSONArray = optJSONObject3.optJSONArray("resources")) == null) {
                        return;
                    }
                    int length = optJSONArray.length();
                    int i2 = 0;
                    while (i2 < length) {
                        JSONObject optJSONObject6 = optJSONArray.optJSONObject(i2);
                        if (optJSONObject6 != null) {
                            String optString3 = optJSONObject6.optString("name");
                            C61041NxV LJJIJIIJI4 = LJJIJIIJI();
                            JSONObject LJ2 = C47135Ieh.LJ("trigger", "on_load", "navigation_id", optString);
                            android.net.Uri parse2 = UriProtector.parse(optString3);
                            o.LJIIIIZZ(parse2, "parse(url)");
                            C78983UzD.LJJLIIIJLLLLLLLZ(LJ2, new C61040NxU(parse2, "resource_", jSONObject3, i).getFormatData());
                            EnumC61054Nxi type2 = EnumC61054Nxi.H5_RESOURCE_TIMING;
                            o.LJIIIZ(type2, "type");
                            C61051Nxf LIZ3 = C61056Nxk.LIZ(type2);
                            if (LIZ3 != null) {
                                jSONObject3 = new JSONObject();
                                Iterator<String> keys2 = optJSONObject6.keys();
                                o.LJIIIIZZ(keys2, "metrics.keys()");
                                while (keys2.hasNext()) {
                                    String trigger = keys2.next();
                                    Long valueOf2 = Long.valueOf(optJSONObject6.optLong(trigger));
                                    if (valueOf2.longValue() != 0) {
                                        valueOf2.longValue();
                                        o.LJIIIIZZ(trigger, "trigger");
                                        C61045NxZ LIZ4 = LIZ3.LIZ(trigger, optJSONObject6);
                                        if (LIZ4 != null) {
                                            jSONObject3.put(LIZ4.LJLIL, LIZ4.LJLILLLLZI);
                                        }
                                    }
                                }
                            }
                            AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_load_resource_event", LJJIJIIJI4, LJ2, jSONObject3, 16);
                        }
                        i2++;
                        i = 4;
                        jSONObject3 = 0;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void onProgressChanged(int i) {
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null) {
            LJJJ.LIZIZ.LJII = i;
        }
    }

    @Override // X.F1B
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        JSONObject jSONObject;
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null) {
            boolean z2 = false;
            if (!C59643Nax.LIZIZ(LJJJ.LIZIZ.LJFF)) {
                SystemClock.uptimeMillis();
                LJJJ.LIZJ(LJJJ, "detailGetWebViewData");
                LJJJ.LIZIZ.LIZLLL = SystemClock.uptimeMillis();
                LJJJ.LJIIJ.removeCallbacks(LJJJ.LJIIL);
                if (!LJJJ.LIZ) {
                    LJJJ.LIZIZ(false, true);
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (C61119Nyl.LIZ(LJJJ.LIZLLL).LIZ == 1) {
                    z = true;
                } else {
                    z = false;
                }
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                C61042NxW c61042NxW = LJJJ.LIZIZ;
                c61042NxW.LIZ = z;
                c61042NxW.LIZIZ = uptimeMillis2;
                InterfaceC58236MtM interfaceC58236MtM = LJJJ.LJFF;
                if (interfaceC58236MtM != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("ttweb_isBlank", c61042NxW.LIZ);
                        jSONObject2.put("ttweb_pageFinish", c61042NxW.LJIILIIL);
                        jSONObject2.put("ttweb_originalUrl", c61042NxW.LJFF);
                        jSONObject2.put("ttweb_pageUrl", c61042NxW.LJI);
                        jSONObject2.put("ttweb_webviewType", c61042NxW.LJ);
                        jSONObject2.put("ttweb_mainFrameError", c61042NxW.LJIIL);
                        jSONObject2.put("ttweb_errUrl", c61042NxW.LJIL);
                        jSONObject2.put("ttweb_errType", c61042NxW.LJIJI);
                        jSONObject2.put("ttweb_errCode", c61042NxW.LJIJJ);
                        jSONObject2.put("ttweb_errMsg", c61042NxW.LJIJJLI);
                        jSONObject2.put("ttweb_useCache", LJJJ.LIZLLL(c61042NxW));
                        long j = C61038NxS.LJIILIIL;
                        if (j > 0) {
                            jSONObject2.put("ttweb_initToLoadUrl", c61042NxW.LJIIIIZZ - j);
                            jSONObject2.put("ttweb_initToPageStart", c61042NxW.LJIIIZ - C61038NxS.LJIILIIL);
                            jSONObject2.put("ttweb_initToPageFinish", c61042NxW.LJIIJ - C61038NxS.LJIILIIL);
                        }
                        jSONObject2.put("ttweb_detectDuration", c61042NxW.LIZIZ);
                        jSONObject2.put("ttweb_attachedWindowToLoadUrl", c61042NxW.LJIIIIZZ - c61042NxW.LIZJ);
                        jSONObject2.put("ttweb_loadUrlToAttachedWindow", c61042NxW.LIZJ - c61042NxW.LJIIIIZZ);
                        jSONObject2.put("ttweb_loadUrlToPageFinish", c61042NxW.LJIIJ - c61042NxW.LJIIIIZZ);
                        jSONObject2.put("ttweb_loadUrlToPageStart", c61042NxW.LJIIIZ - c61042NxW.LJIIIIZZ);
                        jSONObject2.put("ttweb_attachedWindowToDetachWindow", c61042NxW.LIZLLL - c61042NxW.LIZJ);
                        jSONObject2.put("ttweb_pageStartToPageFinish", c61042NxW.LJIIJ - c61042NxW.LJIIIZ);
                        jSONObject2.put("ttweb_loadUrlToDetachWindow", c61042NxW.LIZLLL - c61042NxW.LJIIIIZZ);
                        jSONObject2.put("ttweb_loadResCount", c61042NxW.LJIILJJIL);
                        jSONObject2.put("ttweb_requestResCount", c61042NxW.LJIILL);
                        jSONObject2.put("ttweb_loadResErrorCount", c61042NxW.LJIILLIIL);
                        jSONObject2.put("ttweb_ttNetResCount", c61042NxW.LJIIZILJ);
                        jSONObject2.put("ttweb_offlineResCount", c61042NxW.LJIJ);
                        jSONObject2.put("ttweb_TTWebViewData", LJJJ.LJIIJJI);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    interfaceC58236MtM.LIZ(jSONObject2);
                }
            }
            C61041NxV LJJIJIIJI = LJJIJIIJI();
            C61042NxW c61042NxW2 = LJJJ.LIZIZ;
            JSONObject jSONObject3 = null;
            if (c61042NxW2 == null) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("isBlank", Boolean.toString(c61042NxW2.LIZ));
                    jSONObject.put("pageFinish", Boolean.toString(c61042NxW2.LJIILIIL));
                    jSONObject.put("mainFrameError", Boolean.toString(c61042NxW2.LJIIL));
                    jSONObject.put("webViewType", c61042NxW2.LJ);
                    if (c61042NxW2.LJIJ > 0) {
                        z2 = true;
                    }
                    jSONObject.put("isOfflineCache", Boolean.toString(z2));
                    jSONObject.put("errUrl", c61042NxW2.LJIL);
                    jSONObject.put("errType", String.valueOf(c61042NxW2.LJIJI));
                    jSONObject.put("errCode", String.valueOf(c61042NxW2.LJIJJ));
                    jSONObject.put("errMsg", c61042NxW2.LJIJJLI);
                    jSONObject.put("useCache", Boolean.toString(LJJJ.LIZLLL(c61042NxW2)));
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            C61042NxW c61042NxW3 = LJJJ.LIZIZ;
            if (c61042NxW3 != null) {
                jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("detectDuration", c61042NxW3.LIZIZ);
                    jSONObject3.put("attachedWindowToLoadUrl", c61042NxW3.LJIIIIZZ - c61042NxW3.LIZJ);
                    jSONObject3.put("loadUrlToAttachedWindow", c61042NxW3.LIZJ - c61042NxW3.LJIIIIZZ);
                    jSONObject3.put("loadUrlToPageFinish", c61042NxW3.LJIIJ - c61042NxW3.LJIIIIZZ);
                    jSONObject3.put("loadUrlToPageStart", c61042NxW3.LJIIIZ - c61042NxW3.LJIIIIZZ);
                    jSONObject3.put("attachedWindowToDetachWindow", c61042NxW3.LIZLLL - c61042NxW3.LIZJ);
                    jSONObject3.put("pageStartToPageFinish", c61042NxW3.LJIIJ - c61042NxW3.LJIIIZ);
                    jSONObject3.put("loadUrlToDetachWindow", c61042NxW3.LIZLLL - c61042NxW3.LJIIIIZZ);
                    jSONObject3.put("loadResCount", c61042NxW3.LJIILJJIL);
                    jSONObject3.put("requestResCount", c61042NxW3.LJIILL);
                    jSONObject3.put("loadResErrorCount", c61042NxW3.LJIILLIIL);
                    jSONObject3.put("ttNetResCount", c61042NxW3.LJIIZILJ);
                    jSONObject3.put("offlineResCount", c61042NxW3.LJIJ);
                } catch (JSONException e3) {
                    C16880lQ.LLLLIIL(e3);
                }
            }
            AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_h5_blank_screen", LJJIJIIJI, jSONObject, jSONObject3, 16);
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIIJJI(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        android.net.Uri url;
        int i;
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            C61042NxW c61042NxW = LJJJ.LIZIZ;
            c61042NxW.LJIJI = -2;
            c61042NxW.LJIIL = webResourceRequest.isForMainFrame();
            LJJJ.LIZIZ.LJIL = webResourceRequest.getUrl().toString();
            C61042NxW c61042NxW2 = LJJJ.LIZIZ;
            if (webResourceResponse != null) {
                i = webResourceResponse.getStatusCode();
            } else {
                i = 0;
            }
            c61042NxW2.LJIJJ = Integer.valueOf(i);
            LJJJ.LIZ();
        }
        C61040NxU LJJI = LJJI();
        JSONObject LIZJ = C65232Piu.LIZJ("trigger", "on_received_http_error");
        if (webResourceResponse != null) {
            LIZJ.put("received_status_code", String.valueOf(webResourceResponse.getStatusCode()));
        }
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            LIZJ.put("failing_url", url.toString());
        }
        AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_h5_received_error", LJJI, LIZJ, null, 24);
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIIL(String str, String str2) {
        if (str2 == null) {
            return;
        }
        C77123UOp.LJJJJZI(str, str2, ((C60601NqP) this.LJIIJJI.getValue()).LJIIIIZZ);
    }

    public final void LJIILIIL(Integer num, JSONObject jSONObject) {
        InterfaceC58236MtM interfaceC58236MtM = (InterfaceC58236MtM) this.LJ.LIZ(InterfaceC58236MtM.class);
        if (interfaceC58236MtM != null) {
            interfaceC58236MtM.LJIILIIL(num, jSONObject);
        }
        if (o.LJ("ttmt_webview_timing_monitor_custom_service", "bd_hybrid_monitor_service_all_in_one")) {
            return;
        }
        try {
            LJJJIL(jSONObject);
            Iterator it = ((ArrayList) this.LJIILLIIL).iterator();
            while (it.hasNext()) {
                K1E k1e = (K1E) it.next();
                if (num != null) {
                    num.intValue();
                }
                k1e.LIZ("bd_hybrid_monitor_service_all_in_one", jSONObject);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIL(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        android.net.Uri url;
        android.net.Uri url2;
        int i;
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null && webResourceRequest != null && (url2 = webResourceRequest.getUrl()) != null && C59643Nax.LIZ(url2.toString())) {
            C61042NxW c61042NxW = LJJJ.LIZIZ;
            c61042NxW.LJIJI = -1;
            c61042NxW.LJIIL = webResourceRequest.isForMainFrame();
            LJJJ.LIZIZ.LJIL = url2.toString();
            C61042NxW c61042NxW2 = LJJJ.LIZIZ;
            if (webResourceError != null) {
                i = webResourceError.getErrorCode();
            } else {
                i = 0;
            }
            c61042NxW2.LJIJJ = Integer.valueOf(i);
            LJJJ.LIZ();
        }
        C61040NxU LJJI = LJJI();
        JSONObject LIZJ = C65232Piu.LIZJ("trigger", "on_received_error");
        if (webResourceError != null) {
            LIZJ.put("received_error_code", String.valueOf(webResourceError.getErrorCode()));
            LIZJ.put("received_error_desc", webResourceError.getDescription());
        }
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            LIZJ.put("failing_url", url.toString());
        }
        AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_h5_received_error", LJJI, LIZJ, null, 24);
    }

    @Override // X.AbstractC59640Nau, X.InterfaceC59877Nej
    public final void LJJ(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = true;
        this.LJIIZILJ = true;
        this.LJIJ = System.currentTimeMillis();
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null && !C59643Nax.LIZIZ(LJJI().getUrl())) {
            LJJJ.LIZJ(LJJJ, "detailClearWebViewData");
            LJJJ.LIZJ(LJJJ, "detailEnableDomData");
        }
        C61038NxS LJJJ2 = LJJJ();
        if (LJJJ2 != null) {
            String url = LJJI().getUrl();
            if (!C59643Nax.LIZIZ(url)) {
                C61042NxW c61042NxW = LJJJ2.LIZIZ;
                c61042NxW.LJFF = url;
                c61042NxW.LJ = LJJJ2.LJII;
                c61042NxW.LJI = url;
                c61042NxW.LJIIIIZZ = SystemClock.uptimeMillis();
                LJJJ2.LJIIJ.removeCallbacks(LJJJ2.LJIIL);
                LJJJ2.LJIIJ.postDelayed(LJJJ2.LJIIL, 3000L);
            }
        }
        AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_load_url_event", LJJI(), C65232Piu.LIZJ("trigger", "load_url"), null, 24);
        LJJIL(LJJI().LJLILLLLZI, "load_url");
    }

    @Override // X.F1B
    public final void LJJIIJ(EA4 ea4, ENC enc) {
        C61041NxV LJJIJIIJI = LJJIJIIJI();
        JSONObject jSONObject = new JSONObject();
        C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, ea4.getFormatData());
        if (enc == null) {
            jSONObject.put("error_type", "success");
        } else {
            C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, enc.getFormatData());
        }
        AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_fetch_api_error", LJJIJIIJI, jSONObject, null, 24);
    }

    @Override // X.InterfaceC59585Na1
    public final void LJJIIZI(int i, String str) {
        C61038NxS LJJJ = LJJJ();
        if (LJJJ != null && C59643Nax.LIZ(str)) {
            C61042NxW c61042NxW = LJJJ.LIZIZ;
            c61042NxW.LJIJI = -1;
            c61042NxW.LJIJJ = Integer.valueOf(i);
            LJJJ.LIZIZ.LJIL = str;
            LJJJ.LIZ();
        }
        C61040NxU LJJI = LJJI();
        JSONObject LIZJ = C65232Piu.LIZJ("trigger", "on_received_error");
        LIZJ.put("received_error_code", String.valueOf(i));
        if (str != null) {
            LIZJ.put("failing_url", str);
        }
        AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_h5_received_error", LJJI, LIZJ, null, 24);
    }

    public final boolean LJJIL(android.net.Uri uri, String str) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            String lowerCase = scheme.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (o.LJ(lowerCase, "file")) {
                C61041NxV LJJIJIIJI = LJJIJIIJI();
                JSONObject LIZJ = C65232Piu.LIZJ("trigger", str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resource_url", String.valueOf(uri));
                AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_file_schema_event", LJJIJIIJI, LIZJ, jSONObject, 16);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJJIZ(android.net.Uri uri, String str) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            String LIZJ = AnonymousClass028.LIZJ("getDefault()", scheme, "this as java.lang.String).toLowerCase(locale)");
            if ((o.LJ(LIZJ, "http") || o.LJ(LIZJ, "https")) && 1 != 0) {
                C61040NxU c61040NxU = new C61040NxU(uri, "resource_", null, 4);
                if (this.LJIILJJIL) {
                    if (!this.LJIILL.isEmpty()) {
                        for (String str2 : this.LJIILL) {
                            String host = uri.getHost();
                            if (host == null || !s.LJJJLZIJ(host, str2, false)) {
                            }
                        }
                        return;
                    }
                    C61041NxV LJJIJIIJI = LJJIJIIJI();
                    JSONObject LIZJ2 = C65232Piu.LIZJ("trigger", str);
                    C78983UzD.LJJLIIIJLLLLLLLZ(LIZJ2, c61040NxU.getFormatData());
                    AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_resource_load_event", LJJIJIIJI, LIZJ2, null, 24);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61037NxR(android.net.Uri uri, C59869Neb providerFactory, java.util.Map<String, String> customCategories) {
        super(uri, providerFactory, customCategories);
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(providerFactory, "providerFactory");
        o.LJIIIZ(customCategories, "customCategories");
        this.LJIIIIZZ = new ArrayList();
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJIIIZ = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 377));
        this.LJIIJ = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 376));
        this.LJIIJJI = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 378));
        this.LJIILIIL = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 379));
        this.LJIILL = C61878OQg.INSTANCE;
        this.LJIILLIIL = new ArrayList();
        this.LJIIZILJ = true;
        this.LJIJJ = new LinkedHashMap();
    }

    @Override // X.InterfaceC59585Na1
    public final void LJIIIIZZ(long j, String str, String str2, String str3) {
        C61040NxU LJJI = LJJI();
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("download_url", str);
        }
        if (str2 != null) {
            jSONObject.put("content_disposition", str2);
        }
        if (str3 != null) {
            jSONObject.put("mime_type", str3);
        }
        AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_h5_download", LJJI, jSONObject, Q7K.LIZLLL("content_length", j), 16);
    }

    @Override // X.F1B
    public final void LJIILJJIL(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C61041NxV LJJIJIIJI = LJJIJIIJI();
        JSONObject LIZJ = C65232Piu.LIZJ("trigger", str2);
        if (jSONObject != null) {
            C78983UzD.LJJLIIIJLLLLLLLZ(LIZJ, jSONObject);
        }
        LJJIJIL(LJJIJIIJI, str, LIZJ, jSONObject2, jSONObject3);
    }

    @Override // X.AbstractC61039NxT
    public final void LJJIJIL(AbstractC61044NxY identifier, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        o.LJIIIZ(identifier, "identifier");
        try {
            LJJJI(identifier, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            LJJIJLIJ(identifier.getUrl(), "h5", e);
        }
    }

    public final void LJJJI(AbstractC61044NxY abstractC61044NxY, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        Object value = this.LJIILIIL.getValue();
        o.LJIIIIZZ(value, "<get-monitorHelper>(...)");
        InterfaceC61047Nxb interfaceC61047Nxb = (InterfaceC61047Nxb) value;
        WebView webView = (WebView) this.LJIIIZ.getValue();
        String url = abstractC61044NxY.getUrl();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("type", "h5");
        if (this.LJ.LIZ(InterfaceC61046Nxa.class) == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put("is_fallback", str2);
        InterfaceC61046Nxa interfaceC61046Nxa = (InterfaceC61046Nxa) this.LJ.LIZ(InterfaceC61046Nxa.class);
        if (interfaceC61046Nxa != null) {
            interfaceC61046Nxa.LJIIZILJ();
            interfaceC61046Nxa.LJIJJLI();
        }
        C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, abstractC61044NxY.getFormatData());
        InterfaceC61046Nxa interfaceC61046Nxa2 = (InterfaceC61046Nxa) this.LJ.LIZ(InterfaceC61046Nxa.class);
        if (interfaceC61046Nxa2 != null) {
            C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, new C61040NxU(interfaceC61046Nxa2.LJJI().LJLILLLLZI, "original_", null, 4).getFormatData());
        }
        String jSONObject4 = jSONObject.toString();
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject5, jSONObject2);
        }
        String jSONObject6 = jSONObject5.toString();
        JSONObject jSONObject7 = new JSONObject();
        if (jSONObject3 != null) {
            C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject7, jSONObject3);
        }
        interfaceC61047Nxb.LJIIJJI(webView, url, str, jSONObject4, jSONObject6, jSONObject7.toString());
    }
}
