package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.ECommerceHybridServiceImpl;
import com.ss.android.ugc.aweme.fe.method.JsAppDownloadMethod;
import com.ss.android.ugc.aweme.fe.method.OpenConversationMethod;
import com.ss.android.ugc.aweme.fe.method.SendAnalyticsEventMethod;
import com.ss.android.ugc.aweme.fe.method.SendLogMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.service.IPitayaOfflineService;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.F0x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38287F0x extends AbstractC38279F0p implements InterfaceC40275FrL {
    public F10 LJLIL;
    public C59866NeY LJLILLLLZI;
    public final F1A LJLJI;

    public final C37922EuU LIZIZ() {
        return C37927EuZ.LIZ(new C37928Eua(this.mContextRef.get(), this.mIesJsBridge.LIZ, "", new C1FL()));
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler
    public final List<String> addPublicFunc() {
        return C38083Ex5.LIZ();
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler
    public final List<String> addSupportProtectedFunc() {
        super.addSupportProtectedFunc();
        this.mSupportProtectedFunc.add("userInfo");
        this.mSupportProtectedFunc.add("apiParam");
        this.mSupportProtectedFunc.add("openAweme");
        this.mSupportProtectedFunc.add("openSchema");
        this.mSupportProtectedFunc.add("openRecord");
        this.mSupportProtectedFunc.add("publishVideo");
        this.mSupportProtectedFunc.add("openBrowser");
        this.mSupportProtectedFunc.add("bindPhone");
        this.mSupportProtectedFunc.add("fetch");
        this.mSupportProtectedFunc.add("nativeStorage");
        this.mSupportProtectedFunc.add("fetchTaoCommand");
        return this.mSupportProtectedFunc;
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler
    public final String getJSAppName() {
        return EF7.LIZ();
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler
    public final boolean shouldDisablePermissionCheck() {
        if (C37091Eh5.LIZ().enableBoe() && C37091Eh5.LIZ().enableBoeJsbBypass()) {
            return true;
        }
        return false;
    }

    public C38287F0x(Context context) {
        super(context);
        F1A f1a = new F1A();
        f1a.LIZ = this.LJLILLLLZI;
        this.LJLJI = f1a;
    }

    @Override // X.InterfaceC40275FrL
    public final void LIZ(String str) {
        F10 f10 = this.LJLIL;
        if (f10 != null) {
            f10.LJIIZILJ(str);
        }
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler
    public final boolean checkMiniAppEnable(Context context) {
        return C38499F9b.LIZ.LIZIZ().checkMiniAppEnable(context);
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler
    public final boolean isSafeDomain(String str) {
        String host;
        if (!C40680Fxs.LIZIZ(str)) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT < 27) {
                int indexOf = str.indexOf(92);
                if (indexOf == -1) {
                    host = UriProtector.parse(str).getHost();
                } else {
                    host = UriProtector.parse(str.substring(0, indexOf)).getHost();
                }
            } else {
                host = UriProtector.parse(str).getHost();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (host == null) {
            return false;
        }
        if (B58.LIZ(host, "host")) {
            return true;
        }
        return super.isSafeDomain(str);
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler, X.InterfaceC38277F0n
    public final void putAdInfo(JSONObject jSONObject) {
        super.putAdInfo(jSONObject);
        if (TextUtils.equals(this.hasAdInfoJson, "1") && !TextUtils.isEmpty(this.mAdInfoJson)) {
            return;
        }
        NP6.LIZ.getClass();
    }

    public static void LIZJ(C38150EyA c38150EyA, java.util.Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c38150EyA.LIZ((String) entry.getKey(), (InterfaceC38012Evw) entry.getValue());
            }
        }
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler
    public final List<String> getSafeHost(List<String> list, boolean z) {
        List<String> LIZIZ = C38083Ex5.LIZIZ(list, z);
        this.mSafeHost = LIZIZ;
        return LIZIZ;
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler
    public final void registerJavaMethod(C38150EyA dmtJsBridge, F0E f0e) {
        int i;
        java.util.Map<String, InterfaceC38012Evw> map;
        java.util.Map LIZIZ;
        Context context = this.mContextRef.get();
        C38288F0y c38288F0y = new C38288F0y(dmtJsBridge);
        C38289F0z c38289F0z = new C38289F0z(dmtJsBridge);
        o.LJIIIZ(dmtJsBridge, "dmtJsBridge");
        o.LJIIIZ(context, "context");
        C40266FrC.LJFF(null, dmtJsBridge, context, c38288F0y, c38289F0z);
        EnumC37844EtE scope = EnumC37844EtE.ALL;
        o.LJIIJ(scope, "scope");
        C37831Et1.LIZ.LIZIZ(C58916NAi.class, scope, "AdSeperatedWebview");
        C37922EuU LIZIZ2 = LIZIZ();
        C37866Eta.LIZ(LIZIZ2, dmtJsBridge, "DEFAULT");
        C37866Eta.LIZ(LIZIZ2, dmtJsBridge, "AdSeperatedWebview");
        C55374LoI c55374LoI = C55374LoI.LIZIZ;
        dmtJsBridge.LIZ(c55374LoI.LJFF(), c55374LoI.LJI());
        LIZJ(dmtJsBridge, C40266FrC.LIZLLL(dmtJsBridge, f0e, this.mContextRef.get(), this));
        LIZJ(dmtJsBridge, C40266FrC.LIZJ(dmtJsBridge, this.mContextRef.get(), this, this.LJLJI));
        OpenConversationMethod openConversationMethod = new OpenConversationMethod(dmtJsBridge.LJ);
        openConversationMethod.attach(this.mContextRef);
        dmtJsBridge.LIZ("openConversation", openConversationMethod);
        LIZJ(dmtJsBridge, C40266FrC.LIZIZ(dmtJsBridge, this.mContextRef.get()));
        if (this.mContextRef.get() != null) {
            LIZJ(dmtJsBridge, C40266FrC.LIZ(dmtJsBridge, this.mContextRef.get()));
        }
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (LJJIJIL != null) {
            map = LJJIJIL.getLiveWalletJSB(this.mContextRef, dmtJsBridge.LJ);
            i = 5;
        } else {
            i = 4;
            map = null;
        }
        C09900aA.LJIIJJI("ttlive_wallet_to_live", i, null);
        LIZJ(dmtJsBridge, map);
        LIZJ(dmtJsBridge, HG3.LJIIJJI().getJavaMethods(this.mContextRef, dmtJsBridge.LJ));
        LIZJ(dmtJsBridge, C40266FrC.LJ(dmtJsBridge, this.mContextRef.get(), f0e));
        IPitayaOfflineService iPitayaOfflineService = (IPitayaOfflineService) ServiceManager.get().getService(IPitayaOfflineService.class);
        if (iPitayaOfflineService != null && (LIZIZ = iPitayaOfflineService.LIZIZ()) != null) {
            for (String str : LIZIZ.keySet()) {
                dmtJsBridge.LIZ(str, (InterfaceC38012Evw) LIZIZ.get(str));
            }
        }
        Z9N.LIZIZ.LLIILII(dmtJsBridge, this.mContextRef);
        LIZJ(dmtJsBridge, ECommerceHybridServiceImpl.LJIIIIZZ().LIZIZ(dmtJsBridge, this.mContextRef));
    }

    @Override // com.ss.android.sdk.webview.BaseJsMessageHandler
    public final void registerJavaMethodIn3WV(C38150EyA c38150EyA, F0E f0e) {
        EnumC37844EtE scope = EnumC37844EtE.ALL;
        o.LJIIJ(scope, "scope");
        C37831Et1.LIZ.LIZIZ(C58916NAi.class, scope, "AdSeperatedWebview");
        C37866Eta.LIZ(LIZIZ(), c38150EyA, "AdSeperatedWebview");
        Context context = this.mContextRef.get();
        o.LJIIIZ(context, "context");
        C38049EwX c38049EwX = c38150EyA.LJ;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SendLogMethod sendLogMethod = new SendLogMethod(c38049EwX, this);
        sendLogMethod.attach(weakReference);
        o.LJIIIIZZ(sendLogMethod, "SendLogMethod(iesJsBridg…Info).attach(mContextRef)");
        linkedHashMap.put("sendLog", sendLogMethod);
        LIZJ(c38150EyA, linkedHashMap);
        Context context2 = this.mContextRef.get();
        F1A callback = this.LJLJI;
        o.LJIIIZ(context2, "context");
        o.LJIIIZ(callback, "callback");
        C38049EwX c38049EwX2 = c38150EyA.LJ;
        WeakReference<Context> weakReference2 = new WeakReference<>(context2);
        new JsAppDownloadMethod(c38049EwX2).attach(weakReference2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        SendAnalyticsEventMethod sendAnalyticsEventMethod = new SendAnalyticsEventMethod(c38049EwX2);
        sendAnalyticsEventMethod.attach(weakReference2);
        o.LJIIIIZZ(sendAnalyticsEventMethod, "SendAnalyticsEventMethod…idge).attach(mContextRef)");
        linkedHashMap2.put("sendAnalyticsEvent", sendAnalyticsEventMethod);
        LIZJ(c38150EyA, linkedHashMap2);
    }
}
