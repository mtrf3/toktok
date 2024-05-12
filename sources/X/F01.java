package X;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.web.CrossPlatformJsbProxy;
import com.ss.android.ugc.aweme.web.ICrossPlatformJsbProxy;
import defpackage.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F01 extends QZV {
    public static final F01 LIZ = new F01();

    public static C38048EwW LJIL(C37955Ev1 c37955Ev1) {
        String str;
        JSONObject jSONObject = new JSONObject(c37955Ev1.LJIIJJI);
        C38048EwW c38048EwW = new C38048EwW();
        c38048EwW.LIZJ = jSONObject.optString("func");
        c38048EwW.LIZ = JSONObjectProtectorUtils.getString(jSONObject, "__msg_type");
        c38048EwW.LIZLLL = jSONObject.optJSONObject("params");
        c38048EwW.LIZIZ = jSONObject.optString("__callback_id");
        c38048EwW.LJ = jSONObject.optInt("JSSDK");
        c38048EwW.LJFF = jSONObject.optString("namespace");
        c38048EwW.LJI = jSONObject.optString("__iframe_url");
        EnumC38003Evn enumC38003Evn = c37955Ev1.LJIILJJIL;
        if (enumC38003Evn == null || (str = enumC38003Evn.getValue()) == null) {
            str = "";
        }
        c38048EwW.LJIIIZ = str;
        c38048EwW.LJIIJ = true;
        c38048EwW.LJII = Boolean.TRUE;
        return c38048EwW;
    }

    public final C37940Eum LJIJJ(InterfaceC37947Eut interfaceC37947Eut) {
        if (interfaceC37947Eut == null) {
            interfaceC37947Eut = new F04(false, 3);
        }
        C37940Eum c37940Eum = new C37940Eum();
        c37940Eum.LJLJI = interfaceC37947Eut;
        ((ArrayList) c37940Eum.LJLJLLL).addAll(C38083Ex5.LIZ());
        ((ArrayList) c37940Eum.LJLJLJ).addAll(C38083Ex5.LIZIZ(C47261Igj.LJJIJ("host"), true));
        C38025Ew9 c38025Ew9 = new C38025Ew9();
        C37932Eue c37932Eue = c37940Eum.LJLIL.LIZ;
        c37932Eue.getClass();
        C37904EuC c37904EuC = c37932Eue.LIZ;
        c37904EuC.getClass();
        C37965EvB c37965EvB = c37904EuC.LIZJ;
        c37965EvB.getClass();
        c37965EvB.LIZ.add(c38025Ew9);
        return c37940Eum;
    }

    public static C38236EzY LJIJI(String bridgeName, InterfaceC38012Evw method, C60737Nsb hybridContext, F09 callbackCache) {
        o.LJIIIZ(bridgeName, "bridgeName");
        o.LJIIIZ(method, "method");
        o.LJIIIZ(hybridContext, "hybridContext");
        o.LJIIIZ(callbackCache, "callbackCache");
        C38236EzY c38236EzY = new C38236EzY();
        c38236EzY.LIZ = bridgeName;
        if (!C47261Igj.LJJIJIL("x.hideLoading", "x.reportAppLog").contains(bridgeName)) {
            c38236EzY.LIZIZ(EnumC38085Ex7.PROTECT);
        }
        c38236EzY.LIZLLL = new F02(method, callbackCache, bridgeName, hybridContext);
        return c38236EzY;
    }

    public static List LJIJJLI(InterfaceC60761Nsz iKitView, Context context, F09 callbackCache, boolean z) {
        android.net.Uri uri;
        ICrossPlatformJsbProxy LIZJ;
        o.LJIIIZ(iKitView, "iKitView");
        o.LJIIIZ(callbackCache, "callbackCache");
        ArrayList arrayList = new ArrayList();
        C60737Nsb hybridContext = iKitView.getHybridContext();
        if (iKitView.LIZJ() instanceof WebView) {
            View LIZJ2 = iKitView.LIZJ();
            o.LJII(LIZJ2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) LIZJ2;
            C38049EwX c38049EwX = new C38049EwX(webView);
            c38049EwX.LJIIIIZZ = new F03(callbackCache, hybridContext);
            C59639Nat LIZ2 = F0L.LIZ();
            InterfaceC60710NsA interfaceC60710NsA = iKitView.getHybridContext().hybridParams;
            if (interfaceC60710NsA != null) {
                uri = interfaceC60710NsA.LIZIZ();
            } else {
                uri = null;
            }
            C59866NeY LIZ3 = LIZ2.LIZ(LIZ2.LJI(String.valueOf(uri)));
            String str = iKitView.getHybridContext().containerId;
            o.LJIIIZ(str, "<set-?>");
            LIZ3.LIZ = str;
            F0E f0e = new F0E();
            f0e.LIZIZ(C59866NeY.class, new F0B(LIZ3));
            C38150EyA LIZ4 = C38156EyG.LIZ(webView);
            LIZ4.LJ = c38049EwX;
            LIZ4.LJIIJ = f0e;
            hybridContext.LJII(C38150EyA.class, LIZ4);
            hybridContext.LJII(F0E.class, f0e);
            hybridContext.LJII(InterfaceC40275FrL.class, new F06(iKitView));
            hybridContext.LJII(InterfaceC38277F0n.class, new C39365Fcf(iKitView));
            F1A f1a = new F1A();
            f1a.LIZ = LIZ3;
            hybridContext.LJII(F1G.class, f1a);
            if (!z && (LIZJ = CrossPlatformJsbProxy.LIZJ()) != null) {
                java.util.Map LIZIZ = LIZJ.LIZIZ(context, hybridContext);
                if (!LIZIZ.isEmpty()) {
                    String str2 = "all bridge name: \n";
                    for (Map.Entry entry : LIZIZ.entrySet()) {
                        String str3 = (String) entry.getKey();
                        InterfaceC38012Evw interfaceC38012Evw = (InterfaceC38012Evw) entry.getValue();
                        hybridContext.LIZIZ(C38150EyA.class);
                        C38236EzY LJIJI = LJIJI(str3, interfaceC38012Evw, hybridContext, callbackCache);
                        arrayList.add(LJIJI);
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append(str2);
                        str2 = q.LIZIZ(LIZ5, LJIJI.LIZ, '\n', LIZ5);
                    }
                }
            }
        }
        return arrayList;
    }
}
