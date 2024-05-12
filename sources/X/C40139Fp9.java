package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl;
import com.ss.android.ugc.aweme.hybridkit.experiment.EnableGlobalpropsDesensitizationSettings;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Fp9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40139Fp9 implements InterfaceC60703Ns3 {
    public final /* synthetic */ HybridKitConfigTask LIZ;

    public C40139Fp9(HybridKitConfigTask hybridKitConfigTask) {
        this.LIZ = hybridKitConfigTask;
    }

    public static void LIZLLL(SparkContext sparkContext, java.util.Map map, C61878OQg c61878OQg) {
        for (Map.Entry entry : map.entrySet()) {
            if (!c61878OQg.contains(entry.getKey())) {
                sparkContext.LJJIIJ((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60703Ns3
    public final void LIZIZ(C60737Nsb hybridContext, InterfaceC40155FpP interfaceC40155FpP, WebView view) {
        InterfaceC40148FpI LJ;
        java.util.Map<String, Object> map;
        InterfaceC40148FpI LJ2;
        o.LJIIIZ(hybridContext, "hybridContext");
        o.LJIIIZ(view, "view");
        if ((interfaceC40155FpP != null && interfaceC40155FpP.LIZJ()) || !(view instanceof WebKitView)) {
            return;
        }
        C40156FpQ c40156FpQ = (C40156FpQ) hybridContext.LIZIZ(C40156FpQ.class);
        if (c40156FpQ != null) {
            c40156FpQ.LIZIZ = "about:blank";
        }
        if (EnableGlobalpropsDesensitizationSettings.LIZIZ("about:blank")) {
            List<String> LIZ = EnableGlobalpropsDesensitizationSettings.LIZ("about:blank");
            if (interfaceC40155FpP == null || (LJ2 = interfaceC40155FpP.LJ()) == null) {
                return;
            }
            LJ2.LIZLLL((InterfaceC60761Nsz) view, LIZ);
            return;
        }
        if (interfaceC40155FpP == null || (LJ = interfaceC40155FpP.LJ()) == null) {
            return;
        }
        InterfaceC60761Nsz interfaceC60761Nsz = (InterfaceC60761Nsz) view;
        if (c40156FpQ != null) {
            map = c40156FpQ.LIZ;
        } else {
            map = null;
        }
        LJ.LJI(interfaceC60761Nsz, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v125, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.lang.String] */
    @Override // X.InterfaceC60703Ns3
    public final boolean LIZ(C60737Nsb hybridContext, InterfaceC40155FpP interfaceC40155FpP, WebView view, WebResourceRequest webResourceRequest) {
        boolean z;
        android.net.Uri uri;
        boolean z2;
        String str;
        boolean z3;
        android.net.Uri build;
        String str2;
        String LJJJJI;
        o.LJIIIZ(hybridContext, "hybridContext");
        o.LJIIIZ(view, "view");
        if (interfaceC40155FpP != null && interfaceC40155FpP.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        String valueOf = String.valueOf(uri);
        if (C19N.LJ("hybrid_webview_protocol_settings", false)) {
            android.net.Uri LIZ = C35546DxG.LIZ(valueOf);
            if (!ujb.o.LJJJJIZL(LIZ.getScheme(), "http", false) && !ujb.o.LJJJJIZL(LIZ.getScheme(), "https", false)) {
                return true;
            }
        }
        boolean z4 = hybridContext instanceof SparkContext;
        if (z4) {
            C36344EOe.LIZ.getClass();
            z2 = C36344EOe.LIZ((SparkContext) hybridContext, valueOf);
        } else {
            z2 = false;
        }
        if (z == z2) {
            return false;
        }
        if (z4) {
            SparkContext sparkContext = (SparkContext) hybridContext;
            sparkContext.LJIIZILJ(-1);
            java.util.Map<String, String> LIZJ = C75252xN.LIZJ(sparkContext.containerId);
            String LJIILLIIL = sparkContext.LJIILLIIL();
            if (LIZJ.get("__spark_session_id") != null) {
                LJIILLIIL = C40101FoX.LIZLLL(LIZJ.get("__spark_session_id"));
            }
            if (HybridKitTaskImpl.LJIIJJI().LIZIZ(valueOf) || HybridKitTaskImpl.LJIIJJI().LIZJ(LJIILLIIL) || HybridKitTaskImpl.LJIIJJI().LIZ(LJIILLIIL)) {
                return false;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("aweme://webview?url=");
        LIZ2.append(android.net.Uri.encode(valueOf));
        String LIZIZ = X1D.LIZIZ(LIZ2);
        java.util.Map overrideParams = new LinkedHashMap();
        String str3 = "";
        if (!z4) {
            str = "";
        } else {
            SparkContext sparkContext2 = (SparkContext) hybridContext;
            str = sparkContext2.LJIILLIIL();
            android.net.Uri LIZ3 = C35546DxG.LIZ(str);
            overrideParams = sparkContext2.defaultParams;
            C36344EOe c36344EOe = C36344EOe.LIZ;
            C61878OQg ignoreKeys = C61878OQg.INSTANCE;
            c36344EOe.getClass();
            o.LJIIIZ(overrideParams, "overrideParams");
            o.LJIIIZ(ignoreKeys, "ignoreKeys");
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(LIZ3);
            Uri.Builder clearQuery = LIZ3.buildUpon().clearQuery();
            boolean z5 = false;
            for (String param : queryParameterNames) {
                if (!ignoreKeys.contains(param)) {
                    if (o.LJ(param, "url")) {
                        z5 = true;
                        LJJJJI = valueOf;
                    } else {
                        o.LJIIIIZZ(param, "param");
                        LJJJJI = C78926UyI.LJJJJI(LIZ3, param);
                    }
                    clearQuery.appendQueryParameter(param, LJJJJI);
                }
            }
            for (Map.Entry entry : overrideParams.entrySet()) {
                if ((!ignoreKeys.contains(entry.getKey())) & (!queryParameterNames.contains(entry.getKey()))) {
                    String str4 = (String) entry.getKey();
                    if (o.LJ(entry.getKey(), "url")) {
                        z5 = true;
                        str2 = valueOf;
                    } else {
                        str2 = (String) overrideParams.get(entry.getKey());
                    }
                    clearQuery.appendQueryParameter(str4, str2);
                }
            }
            if (!z5 && !ignoreKeys.contains("url")) {
                clearQuery.appendQueryParameter("url", valueOf);
            }
            android.net.Uri build2 = clearQuery.build();
            o.LJIIIIZZ(build2, "newUri.build()");
            LIZIZ = build2.toString();
            o.LJIIIIZZ(LIZIZ, "uri.toString()");
        }
        C1JX.LJIIIIZZ("shouldOverrideUrlLoading newUrl = ", LIZIZ);
        java.util.Map<String, String> LIZJ2 = C75252xN.LIZJ(hybridContext.containerId);
        boolean z6 = !o.LJ(LIZJ2.get("show_closeall"), CardStruct.IStatusCode.DEFAULT);
        String str5 = "1";
        if (z2) {
            SparkContext sparkContext3 = new SparkContext();
            C39836FkG.LJII.getClass();
            C38262Ezy.LIZ().LIZ(hybridContext.containerId, sparkContext3.containerId);
            this.LIZ.getClass();
            sparkContext3.LJIIIZ(InterfaceC40159FpT.class);
            sparkContext3.LJIIIZ(C37944Euq.class);
            sparkContext3.LJIIIZ(F3T.class);
            sparkContext3.LJIIIZ(C31926Cfy.class);
            sparkContext3.LJIIIZ(C37942Euo.class);
            C68322mC c68322mC = new C68322mC();
            ?? r0 = LIZJ2.get("__spark_session_id");
            c68322mC.element = r0;
            CharSequence charSequence = (CharSequence) r0;
            if (charSequence == null || charSequence.length() == 0) {
                c68322mC.element = hybridContext.containerId;
            }
            C40101FoX.LIZ((String) c68322mC.element, sparkContext3.containerId);
            sparkContext3.LJJIJLIJ(LIZIZ);
            LIZLLL(sparkContext3, overrideParams, C61878OQg.INSTANCE);
            sparkContext3.LJJIIJ("skip_sec_link_first_jump", "1");
            String str6 = LIZJ2.get("need_sec_link");
            if (str6 == null) {
                str6 = "";
            }
            sparkContext3.LJJIIJ("need_sec_link", str6);
            String str7 = LIZJ2.get("sec_link_scene");
            if (str7 != null) {
                str3 = str7;
            }
            sparkContext3.LJJIIJ("sec_link_scene", str3);
            C40149FpJ c40149FpJ = new C40149FpJ();
            c40149FpJ.LIZ = new C283719l();
            sparkContext3.LJII(InterfaceC40155FpP.class, c40149FpJ);
            sparkContext3.LJII(M2K.class, C40169Fpd.LJLIL);
            sparkContext3.LJJIIJ("transition_animation", LiveGiftNewGifterBadgeSetting.DEFAULT);
            sparkContext3.LJJIIJ("__jump_from_override", "1");
            sparkContext3.LJII(InterfaceC40162FpW.class, new C40142FpC(c68322mC));
            String str8 = (String) c68322mC.element;
            if (str8 != null) {
                sparkContext3.LJJIIJ("__spark_session_id", str8);
            }
            if (z6) {
                sparkContext3.LJJIIJ("show_closeall", "1");
            }
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            if (!C35546DxG.LIZJ(context, hybridContext, sparkContext3, LIZIZ)) {
                C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "view.context");
                c40342FsQ.getClass();
                C40342FsQ.LIZ(context2, sparkContext3).LIZIZ();
            }
        } else {
            z2 = false;
            if (z4) {
                SparkContext sparkContext4 = (SparkContext) hybridContext;
                sparkContext4.LJIIZILJ(-1);
                java.util.Map<String, String> LIZJ3 = C75252xN.LIZJ(sparkContext4.containerId);
                String LJIILLIIL2 = sparkContext4.LJIILLIIL();
                if (LIZJ3.get("__spark_session_id") != null) {
                    LJIILLIIL2 = C40101FoX.LIZLLL(LIZJ3.get("__spark_session_id"));
                }
                if ((ujb.o.LJJJLIIL(valueOf, "http", false) || ujb.o.LJJJLIIL(valueOf, "https", false)) && !HybridKitTaskImpl.LJIIJJI().LJI(valueOf, LJIILLIIL2, false)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (o.LJ(LIZJ3.get("jumpToSparkByWebViewIsolation"), "1") && z3) {
                    android.net.Uri LIZ4 = C35546DxG.LIZ(sparkContext4.LJIILLIIL());
                    Uri.Builder buildUpon = C35546DxG.LIZ(valueOf).buildUpon();
                    if (!o.LJ(C78926UyI.LJJJJI(LIZ4, "show_close_all"), CardStruct.IStatusCode.DEFAULT) || !o.LJ(C78926UyI.LJJJJI(LIZ4, "show_closeall"), CardStruct.IStatusCode.DEFAULT)) {
                        buildUpon.appendQueryParameter("show_close_button", "1");
                    }
                    android.net.Uri build3 = buildUpon.appendQueryParameter("forbidden_anim", "1").build();
                    java.util.Map<String, String> LIZJ4 = C75252xN.LIZJ(sparkContext4.containerId);
                    if (LIZJ4.get("__spark_session_id") == null) {
                        build = build3.buildUpon().appendQueryParameter("__spark_session_id", sparkContext4.containerId).build();
                    } else {
                        build = build3.buildUpon().appendQueryParameter("__spark_session_id", LIZJ4.get("__spark_session_id")).build();
                    }
                    String uri2 = C44384HbQ.LLIIJI(C44384HbQ.LLIIJI(LIZ4, "url"), "use_spark").buildUpon().appendQueryParameter("url", build.buildUpon().toString()).build().toString();
                    o.LJIIIIZZ(uri2, "uri.removeUriParameter(\"…ing()).build().toString()");
                    List<String> LJJIJIIJI = C47261Igj.LJJIJIIJI("need_sec_link", "sec_link_scene");
                    android.net.Uri LIZ5 = C35546DxG.LIZ(uri2);
                    android.net.Uri LIZ6 = C35546DxG.LIZ(C78926UyI.LJJJJI(LIZ5, "url"));
                    for (String str9 : LJJIJIIJI) {
                        C44384HbQ.LLIIJI(LIZ5, str9);
                        C44384HbQ.LLIIJI(LIZ6, str9);
                    }
                    String uri3 = C44384HbQ.LLIIJI(LIZ5, "url").buildUpon().appendQueryParameter("url", LIZ6.toString()).build().toString();
                    o.LJIIIIZZ(uri3, "uri.removeUriParameter(\"…ing()).build().toString()");
                    Context context3 = view.getContext();
                    if (context3 != null) {
                        SmartRoute buildRoute = SmartRouter.buildRoute(context3, uri3);
                        buildRoute.withParam("skip_sec_link_first_jump", "1");
                        String str10 = LIZJ4.get("need_sec_link");
                        if (str10 == null) {
                            str10 = "";
                        }
                        buildRoute.withParam("need_sec_link", str10);
                        String str11 = LIZJ4.get("sec_link_scene");
                        if (str11 == null) {
                            str11 = "";
                        }
                        buildRoute.withParam("sec_link_scene", str11);
                        buildRoute.open();
                    }
                }
            }
            SparkContext sparkContext5 = new SparkContext();
            C39836FkG.LJII.getClass();
            C38262Ezy.LIZ().LIZ(hybridContext.containerId, sparkContext5.containerId);
            this.LIZ.getClass();
            sparkContext5.LJIIIZ(InterfaceC40159FpT.class);
            sparkContext5.LJIIIZ(C37944Euq.class);
            sparkContext5.LJIIIZ(F3T.class);
            sparkContext5.LJIIIZ(C31926Cfy.class);
            sparkContext5.LJIIIZ(C37942Euo.class);
            C68322mC c68322mC2 = new C68322mC();
            ?? r02 = LIZJ2.get("__spark_session_id");
            c68322mC2.element = r02;
            CharSequence charSequence2 = (CharSequence) r02;
            if (charSequence2 == null || charSequence2.length() == 0) {
                c68322mC2.element = hybridContext.containerId;
            }
            C40101FoX.LIZ((String) c68322mC2.element, sparkContext5.containerId);
            sparkContext5.LJJIJLIJ(LIZIZ);
            LIZLLL(sparkContext5, overrideParams, C61878OQg.INSTANCE);
            sparkContext5.LJJIIJ("skip_sec_link_first_jump", "1");
            String str12 = LIZJ2.get("need_sec_link");
            if (str12 == null) {
                str12 = "";
            }
            sparkContext5.LJJIIJ("need_sec_link", str12);
            String str13 = LIZJ2.get("sec_link_scene");
            if (str13 != null) {
                str3 = str13;
            }
            sparkContext5.LJJIIJ("sec_link_scene", str3);
            sparkContext5.LJII(InterfaceC40155FpP.class, new C40145FpF());
            sparkContext5.LJII(InterfaceC40162FpW.class, new C40143FpD(c68322mC2));
            sparkContext5.LJII(M2K.class, C40169Fpd.LJLIL);
            sparkContext5.LJJIIJ("transition_animation", LiveGiftNewGifterBadgeSetting.DEFAULT);
            sparkContext5.LJJIIJ("__jump_from_override", "1");
            sparkContext5.LJJIIJ("__spark_session_id", (String) c68322mC2.element);
            if (z6) {
                sparkContext5.LJJIIJ("show_closeall", "1");
            }
            Context context4 = view.getContext();
            o.LJIIIIZZ(context4, "view.context");
            if (!C35546DxG.LIZJ(context4, hybridContext, sparkContext5, LIZIZ)) {
                C40342FsQ c40342FsQ2 = C40343FsR.LJIILJJIL;
                Context context5 = view.getContext();
                o.LJIIIIZZ(context5, "view.context");
                c40342FsQ2.getClass();
                C40342FsQ.LIZ(context5, sparkContext5).LIZIZ();
            }
        }
        if (Build.VERSION.SDK_INT >= 24 && webResourceRequest != null && webResourceRequest.isRedirect()) {
            C39359FcZ c39359FcZ = SparkContext.Companion;
            String str14 = hybridContext.containerId;
            c39359FcZ.getClass();
            InterfaceC40159FpT LIZ7 = C39359FcZ.LIZ(str14);
            if (LIZ7 != null) {
                LIZ7.LLJIJIL();
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("originalUrl", str);
        c188727au.LJIIIZ("newUrl", valueOf);
        c188727au.LJIIIZ("finalNewUrl", LIZIZ);
        if (!z2) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("jumpToPure", str5);
        c188727au.LJIIIZ("jumpType", "secondJump");
        FMX.LJIIL("spark_webview_mutual_jump", c188727au.LIZ);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60703Ns3
    public final void LIZJ(C60737Nsb hybridContext, InterfaceC40155FpP interfaceC40155FpP, WebView view, String str) {
        InterfaceC40148FpI LJ;
        java.util.Map<String, Object> map;
        InterfaceC40148FpI LJ2;
        o.LJIIIZ(hybridContext, "hybridContext");
        o.LJIIIZ(view, "view");
        if ((interfaceC40155FpP != null && interfaceC40155FpP.LIZJ()) || !(view instanceof WebKitView)) {
            return;
        }
        C40156FpQ c40156FpQ = (C40156FpQ) hybridContext.LIZIZ(C40156FpQ.class);
        if (c40156FpQ != null) {
            c40156FpQ.LIZIZ = str;
        }
        if (EnableGlobalpropsDesensitizationSettings.LIZIZ(str)) {
            List<String> LIZ = EnableGlobalpropsDesensitizationSettings.LIZ(str);
            if (interfaceC40155FpP == null || (LJ2 = interfaceC40155FpP.LJ()) == null) {
                return;
            }
            LJ2.LIZLLL((InterfaceC60761Nsz) view, LIZ);
            return;
        }
        if (interfaceC40155FpP == null || (LJ = interfaceC40155FpP.LJ()) == null) {
            return;
        }
        InterfaceC60761Nsz interfaceC60761Nsz = (InterfaceC60761Nsz) view;
        if (c40156FpQ != null) {
            map = c40156FpQ.LIZ;
        } else {
            map = null;
        }
        LJ.LJI(interfaceC60761Nsz, map);
    }
}
