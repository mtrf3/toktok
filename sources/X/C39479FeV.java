package X;

import Y.ARunnableS17S0300000_6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.FeV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39479FeV implements InterfaceC39487Fed {
    public static final ConcurrentHashMap<String, List<C60682Zs>> LJI = new ConcurrentHashMap<>();
    public NavigationConfig LIZ;
    public final ILogger LIZIZ;
    public final IEventMonitor LIZJ;
    public final java.util.Map<String, InterfaceC65784Pro<Boolean>> LIZLLL;
    public final ExecutorService LJ;
    public InterfaceC65784Pro<? extends List<String>> LJFF = null;

    @Override // X.InterfaceC39487Fed
    public final WebResourceResponse LIZ(View view, WebResourceRequest webResourceRequest) {
        return null;
    }

    public static void LIZLLL(List list, JSONObject jSONObject) {
        String str;
        if (list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (C39480FeW c39480FeW : ORZ.LLIILII(list)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("caller", c39480FeW.LJLIL);
            jSONObject2.put("callee", c39480FeW.LJLILLLLZI);
            jSONObject2.put("callerComponent", c39480FeW.LJLJI);
            C39492Fei c39492Fei = c39480FeW.LJLJJL;
            String str2 = "";
            if (c39492Fei != null) {
                jSONObject2.put("url", c39492Fei.LJLILLLLZI);
                jSONObject2.put("scheme", c39492Fei.LJLJI);
                C39492Fei c39492Fei2 = c39480FeW.LJLJJL;
                if (c39492Fei2 != null && (str = c39492Fei2.LJLJJLL) != null && str.length() > 0) {
                    jSONObject2.put("path", c39492Fei.LJLJJLL);
                }
                String str3 = c39492Fei.LJLJLLL;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject2.put("secLinkScene", str3);
                LJFF(c39492Fei, jSONObject2, "query");
            }
            C39484Fea c39484Fea = c39480FeW.LJLJJLL;
            if (c39484Fea != null) {
                jSONObject2.put("bizMarkType", c39484Fea.LJLIL);
                jSONObject2.put("bizMarkKey", c39484Fea.LJLILLLLZI);
                String str4 = c39484Fea.LJLJI;
                if (str4 != null) {
                    str2 = str4;
                }
                jSONObject2.put("bizMarkValue", str2);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("pageStack", jSONArray);
    }

    public static void LJI(List list, JSONObject jSONObject) {
        if (list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (C60682Zs c60682Zs : ORZ.LLIILII(list)) {
            JSONObject jSONObject2 = new JSONObject();
            String str = c60682Zs.LIZIZ.LJLJLLL;
            if (str == null) {
                str = "";
            }
            jSONObject2.put("secLinkScene", str);
            jSONObject2.put("jumpTimes", c60682Zs.LIZ);
            jSONObject2.put("url", c60682Zs.LIZIZ.LJLILLLLZI);
            jSONObject2.put("path", c60682Zs.LIZIZ.LJLJJLL);
            LJFF(c60682Zs.LIZIZ, jSONObject2, "query");
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("preUrlInfo", jSONArray);
    }

    public static void LJII(View view, C39492Fei c39492Fei) {
        Context context;
        try {
            String str = c39492Fei.LJLJLLL;
            if (str != null && str.length() > 0) {
                return;
            }
            String str2 = null;
            if (view == null) {
                context = null;
            } else if (view.getContext() instanceof MutableContextWrapper) {
                Context context2 = view.getContext();
                if (context2 != null) {
                    context = ((MutableContextWrapper) context2).getBaseContext();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.content.MutableContextWrapper");
                }
            } else {
                context = view.getContext();
            }
            if (context instanceof Activity) {
                Intent intent = ((Activity) context).getIntent();
                if (intent != null) {
                    str2 = C16880lQ.LLJJIJIIJIL(intent, "sec_link_scene");
                }
                c39492Fei.LJLJLLL = str2;
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.InterfaceC39487Fed
    public final void LIZJ(android.net.Uri uri, View view) {
        if (view != null) {
            view.setTag(R.id.ni1, uri);
        }
    }

    public static void LJFF(C39492Fei c39492Fei, JSONObject jSONObject, String str) {
        java.util.Map<String, String> map;
        if (c39492Fei != null && (map = c39492Fei.LJLJL) != null && (!map.isEmpty())) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put(str, jSONArray);
        }
    }

    @Override // X.InterfaceC39487Fed
    public final void LIZIZ(View view, String str, String str2) {
        Object LIZ;
        C39492Fei LIZIZ;
        int i;
        int i2;
        List<String> invoke;
        List LJLJL;
        View view2;
        Object obj;
        boolean z;
        List<C60682Zs> list;
        C37039EgF LJIIIIZZ;
        if (view != null) {
            try {
                LIZIZ = C35997EAv.LIZIZ(str);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (LIZIZ != null) {
                if (o.LJ(str2, "H5")) {
                    LJII(view, LIZIZ);
                }
                String LIZ2 = C38386F4s.LIZ(view);
                Context context = view.getContext();
                if (context instanceof Activity) {
                    i = ((Activity) context).hashCode();
                } else {
                    i = C64403PPj.LIZIZ;
                }
                String valueOf = String.valueOf(i);
                JSONObject jSONObject = new JSONObject();
                Object tag = view.getTag(R.id.nhw);
                LIZ = null;
                if (!(tag instanceof Integer)) {
                    tag = null;
                }
                Integer num = (Integer) tag;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    view.setTag(R.id.nhw, 1);
                } else {
                    view.setTag(R.id.nhw, Integer.valueOf(i2 + 1));
                }
                C60682Zs c60682Zs = new C60682Zs(i2, LIZIZ);
                LJ(view, jSONObject, LIZ2, str2, c60682Zs);
                if (o.LJ(str2, "H5")) {
                    jSONObject.put("dataflowId", 0);
                    if (!(view instanceof WebView)) {
                        view2 = null;
                    } else {
                        view2 = view;
                    }
                    WebView webView = (WebView) view2;
                    if (webView == null || (LJIIIIZZ = C78540Us4.LJIIIIZZ(webView)) == null || (obj = LJIIIIZZ.LJLIL) == null) {
                        obj = EnumC37040EgG.INTERIOR;
                    }
                    if (obj == EnumC37040EgG.THIRD) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jSONObject.put("isolateContainer", z);
                    jSONObject.put("is_interior", obj);
                    NavigationConfig navigationConfig = this.LIZ;
                    if (navigationConfig != null && navigationConfig.enableUrlRecord) {
                        if (LIZ2 != null) {
                            ConcurrentHashMap<String, List<C60682Zs>> concurrentHashMap = LJI;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(LIZ2);
                            LIZ3.append(valueOf);
                            if (concurrentHashMap.containsKey(X1D.LIZIZ(LIZ3))) {
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append(LIZ2);
                                LIZ4.append(valueOf);
                                list = concurrentHashMap.get(X1D.LIZIZ(LIZ4));
                                LJI(list, jSONObject);
                                C60672Zr.LIZ(LIZ2, valueOf, c60682Zs);
                            }
                        }
                        list = null;
                        LJI(list, jSONObject);
                        C60672Zr.LIZ(LIZ2, valueOf, c60682Zs);
                    }
                }
                NavigationConfig navigationConfig2 = this.LIZ;
                if (navigationConfig2 != null && navigationConfig2.enableRouterRecord) {
                    ConcurrentLinkedQueue<C39480FeW> concurrentLinkedQueue = C39481FeX.LIZIZ;
                    if (concurrentLinkedQueue.size() >= 2) {
                        try {
                            LJLJL = ORZ.LJLJL(1, ORZ.LLILZ(4, ORZ.LLJILJILJ(concurrentLinkedQueue)));
                        } catch (Throwable th2) {
                            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                        }
                        LIZLLL(LJLJL, jSONObject);
                    }
                    LJLJL = null;
                    LIZLLL(LJLJL, jSONObject);
                }
                InterfaceC65784Pro<? extends List<String>> interfaceC65784Pro = this.LJFF;
                if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = invoke.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    jSONObject.put("btmChain", jSONArray);
                }
                C1JI.LJIIIZ(this.LIZLLL, jSONObject);
                o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
                jSONObject.put("is_background", PQ0.LJ() ? 1 : 0);
                if (i2 == 0 && o.LJ(str2, "H5")) {
                    C38351F3j.LIZ(this.LIZJ, this.LJ, LIZIZ, view, LIZ2, jSONObject);
                }
                ExecutorService executorService = this.LJ;
                if (executorService != null) {
                    executorService.execute(new ARunnableS17S0300000_6(jSONObject, this, view, 11));
                    LIZ = C76800UCe.LIZ;
                }
                C3C5.m7constructorimpl(LIZ);
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                if (m10exceptionOrNullimpl != null) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("error occur. ");
                    LIZ5.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
                    X1D.LIZIZ(LIZ5);
                }
            }
        }
    }

    public C39479FeV(NavigationConfig navigationConfig, ILogger iLogger, IEventMonitor iEventMonitor, java.util.Map map, ExecutorService executorService) {
        this.LIZ = navigationConfig;
        this.LIZIZ = iLogger;
        this.LIZJ = iEventMonitor;
        this.LIZLLL = map;
        this.LJ = executorService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d4, code lost:
    
        if (r7 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.view.View r5, org.json.JSONObject r6, java.lang.String r7, java.lang.String r8, X.C60682Zs r9) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39479FeV.LJ(android.view.View, org.json.JSONObject, java.lang.String, java.lang.String, X.2Zs):void");
    }
}
