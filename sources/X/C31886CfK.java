package X;

import Y.IDHandlerS19S0100000_6;
import Y.IDbS382S0100000_5;
import Y.IDbS71S0000000_5;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.AppInfoMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.FileCheckMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveGiftAuthMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveGoalIndicatorVisibilityMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveGoalIndicatorWidthMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveOpenFirstRechargeDialogMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.StreamPlayerControlMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ToastMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UserInfoMethod;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.livesetting.hybrid.JsbEnablePermissionCheckSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveJsbAllowedListSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS43S0001000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CfK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31886CfK implements InterfaceC30889CAj, InterfaceC29424Bgi {
    public static List<String> LJLJL;
    public static List<String> LJLJLJ;
    public final int LJLIL;
    public final C38113ExZ LJLILLLLZI;
    public final C38118Exe LJLJI;
    public final WeakReference<Context> LJLJJI;
    public String LJLJJL;
    public final List<InterfaceC29266BeA> LJLJJLL;

    public static List<String> LJFF() {
        List<String> list = LJLJL;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        LJLJL = arrayList;
        arrayList.add("tiktokv.com");
        LJLJL.add("tiktok.com");
        LJLJL.add("s16a.tiktokcdn.com");
        String[] value = LiveJsbAllowedListSetting.INSTANCE.getValue();
        if (value.length > 0) {
            for (String str : value) {
                if (!LJLJL.contains(str)) {
                    LJLJL.add(str);
                }
            }
        }
        IHostHybrid iHostHybrid = (IHostHybrid) CN1.LIZ(IHostHybrid.class);
        if (iHostHybrid != null) {
            LJLJL.addAll(iHostHybrid.Iv());
        }
        return LJLJL;
    }

    @Override // X.InterfaceC30889CAj
    public final void release() {
        this.LJLILLLLZI.LJ();
        C38049EwX c38049EwX = this.LJLJI.LIZIZ;
        c38049EwX.LIZ = null;
        IDHandlerS19S0100000_6 iDHandlerS19S0100000_6 = c38049EwX.LJIIJ;
        if (iDHandlerS19S0100000_6 != null) {
            iDHandlerS19S0100000_6.removeCallbacksAndMessages(null);
        }
        c38049EwX.LJI = null;
        c38049EwX.LJFF = null;
        Iterator it = ((ArrayList) this.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC29266BeA) it.next()).onBridgeRelease();
        }
        ((ArrayList) this.LJLJJLL).clear();
    }

    @Override // X.InterfaceC30889CAj
    public final C38113ExZ LIZIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC30889CAj
    public final C38118Exe LIZJ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC29424Bgi
    public final String getSource() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC30889CAj
    public final void LIZ(String str) {
        this.LJLJJL = str;
    }

    public static C31886CfK LJ(Activity activity, C38129Exp c38129Exp) {
        C38141Ey1 c38141Ey1 = new C38141Ey1(c38129Exp);
        C38116Exc c38116Exc = new C38116Exc(c38141Ey1);
        c38116Exc.LJFF = activity;
        c38116Exc.LIZJ = c38129Exp;
        C38126Exm c38126Exm = new C38126Exm(new C78927UyJ());
        c38116Exc.LJ = c38126Exm;
        c38126Exm.LIZIZ = c38116Exc.LJIJ;
        c38116Exc.LJI = false;
        c38116Exc.LJII = true;
        c38116Exc.LJIIL.addAll(LJFF());
        c38116Exc.LJIIIIZZ = JsbEnablePermissionCheckSetting.INSTANCE.getValue();
        c38116Exc.LJIIJJI = "webcast";
        c38116Exc.LJIIIZ.add(new C38159EyJ(c38141Ey1));
        c38116Exc.LIZLLL = "ToutiaoJSBridge";
        if (TextUtils.equals(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel(), "local_test")) {
            c38116Exc.LJIILL = true;
        }
        C38113ExZ LIZ = c38116Exc.LIZ();
        C31886CfK c31886CfK = new C31886CfK(activity, LIZ, new C38118Exe(null, LIZ), 1);
        c31886CfK.LJLILLLLZI.LIZJ("__prefetch", C31917Cfp.LIZ);
        return c31886CfK;
    }

    public C31886CfK(Activity activity, C38113ExZ c38113ExZ, C38118Exe c38118Exe, int i) {
        Collection values;
        ArrayList arrayList = new ArrayList();
        this.LJLJJLL = arrayList;
        WeakReference<Context> weakReference = new WeakReference<>(activity);
        this.LJLJJI = weakReference;
        this.LJLILLLLZI = c38113ExZ;
        this.LJLJI = c38118Exe;
        this.LJLIL = i;
        C29421Bgf c29421Bgf = new C29421Bgf(weakReference, this);
        c38113ExZ.LJ = c38118Exe;
        c38113ExZ.LIZLLL("appInfo", new AppInfoMethod());
        c38113ExZ.LIZLLL("userInfo", new UserInfoMethod());
        c38113ExZ.LIZLLL("apiParam", new C29268BeC());
        c38113ExZ.LIZLLL("toast", new ToastMethod());
        c38113ExZ.LIZLLL("sendLogV3", new BUF());
        c38113ExZ.LIZLLL("sendMonitor", new C30601Bzh());
        c38113ExZ.LIZLLL("baseInfo", new BUE());
        c38113ExZ.LIZLLL("close", new C30937CCf(activity));
        c38113ExZ.LIZLLL("getLiveHouseRoomStatus", new BUG());
        c38113ExZ.LIZJ("sendGift", new IDbS71S0000000_5(0));
        c38113ExZ.LIZJ("iapForSubscription", new IDbS71S0000000_5(14));
        c38113ExZ.LIZJ("buyIapProduct", new IDbS71S0000000_5(15));
        c38113ExZ.LIZJ("getIapProduct", new IDbS71S0000000_5(1));
        c38113ExZ.LIZLLL("openStoreSubscribePage", new C31930Cg2());
        c38113ExZ.LIZJ("userAction", new IDbS71S0000000_5(2));
        c38113ExZ.LIZJ("fetch", new IDbS382S0100000_5(this, 16));
        c38113ExZ.LIZJ("login", new IDbS71S0000000_5(3));
        c38113ExZ.LIZJ("dialog", new IDbS71S0000000_5(4));
        c38113ExZ.LIZJ("comment", new IDbS71S0000000_5(5));
        c38113ExZ.LIZJ("downloadMediaToSystem", new IDbS71S0000000_5(6));
        c38113ExZ.LIZLLL("openFirstRechargeDialog", new LiveOpenFirstRechargeDialogMethod());
        c38113ExZ.LIZLLL("setLiveGoalIndicatorVisibility", new LiveGoalIndicatorVisibilityMethod());
        c38113ExZ.LIZLLL("getGiftSettings", new LiveGiftAuthMethod());
        c38113ExZ.LIZJ("openVideoFullScreen", new IDbS71S0000000_5(7));
        c38113ExZ.LIZLLL("setLiveGoalIndicatorSize", new LiveGoalIndicatorWidthMethod());
        c38113ExZ.LIZLLL("viewController", new CO5());
        c38113ExZ.LIZJ("liveOpenExchangeCoinsDialog", new IDbS71S0000000_5(8));
        c38113ExZ.LIZJ("openTaxDialog", new IDbS71S0000000_5(9));
        c38113ExZ.LIZJ("uploadImage", new IDbS71S0000000_5(10));
        c38113ExZ.LIZJ("openRegionListPage", new IDbS71S0000000_5(11));
        c38113ExZ.LIZLLL("getLinkMicStatus", new BUN());
        c38113ExZ.LIZLLL("prefetchSchema", new C29269BeD());
        c38113ExZ.LIZJ("queryCachedGifts", new IDbS71S0000000_5(12));
        c38113ExZ.LIZJ("linkMicWithAnchor", new IDbS71S0000000_5(13));
        c38113ExZ.LIZLLL("startVideoEdit", new C30720C3w());
        c38113ExZ.LIZLLL("openInvoiceFile", new FileCheckMethod());
        c38113ExZ.LIZLLL("disconnectMultiGuest", new C30728C4e());
        StreamPlayerControlMethod streamPlayerControlMethod = new StreamPlayerControlMethod();
        c38113ExZ.LIZLLL("streamPlayerControl", streamPlayerControlMethod);
        arrayList.add(streamPlayerControlMethod);
        ((IDebugService) CN1.LIZ(IDebugService.class)).jg0(c38113ExZ);
        o.LJIIIZ(activity, "activity");
        C31926Cfy c31926Cfy = new C31926Cfy();
        c31926Cfy.LIZJ(Context.class, activity);
        c31926Cfy.LIZIZ(InterfaceC37772Es4.class, new C31924Cfw(new C31921Cft()));
        c31926Cfy.LIZIZ(InterfaceC40311Frv.class, new C31924Cfw(new C31887CfL(c38113ExZ)));
        c31926Cfy.LIZIZ(InterfaceC37790EsM.class, new C31924Cfw(new C31899CfX(c38113ExZ)));
        IHostHybrid iHostHybrid = (IHostHybrid) CN1.LIZ(IHostHybrid.class);
        if (iHostHybrid != null) {
            iHostHybrid.uZ();
        }
        C31889CfN c31889CfN = new C31889CfN();
        java.util.Map LIZIZ = C37848EtI.LIZIZ(EnumC37847EtH.ALL, "DEFAULT");
        if (LIZIZ != null && (values = LIZIZ.values()) != null) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                InterfaceC37774Es6 interfaceC37774Es6 = (InterfaceC37774Es6) ((Class) it.next()).newInstance();
                c31889CfN.LIZ(interfaceC37774Es6.getName(), new C31895CfT(interfaceC37774Es6, c31926Cfy));
            }
        }
        for (Map.Entry entry : C113554cx.LJJLIIIJLLLLLLLZ(((C31901CfZ) c31889CfN.LIZ.getValue()).LIZ).entrySet()) {
            String str = (String) entry.getKey();
            c38113ExZ.LIZJ(str, new C31902Cfa(str, entry, i));
        }
        java.util.Map<String, Class<? extends InterfaceC37666EqM>> LIZ = C37831Et1.LIZ(EnumC37844EtE.ALL, "DEFAULT");
        C37922EuU c37922EuU = new C37922EuU();
        WebView webView = c38113ExZ.LIZIZ;
        if (c37922EuU.LIZIZ == null) {
            c37922EuU.LIZIZ = new WeakReference<>(webView);
        }
        c37922EuU.LIZLLL = c38113ExZ.toString();
        c37922EuU.LJFF(InterfaceC37930Euc.class, new C31898CfW(c38113ExZ));
        c37922EuU.LJFF(InterfaceC31922Cfu.class, new C78966Uyw());
        c37922EuU.LJI(Context.class, activity);
        c37922EuU.LJII(activity);
        if (LIZ != null) {
            for (Map.Entry<String, Class<? extends InterfaceC37666EqM>> entry2 : LIZ.entrySet()) {
                String key = entry2.getKey();
                String name = entry2.getKey();
                Class<? extends InterfaceC37666EqM> clazz = entry2.getValue();
                AqS43S0001000_5 aqS43S0001000_5 = new AqS43S0001000_5(i, 3);
                o.LJIIIZ(name, "name");
                o.LJIIIZ(clazz, "clazz");
                InterfaceC37666EqM newInstance = clazz.newInstance();
                newInstance.LIZJ(c37922EuU);
                c38113ExZ.LIZJ(key, new C31893CfR(name, newInstance, aqS43S0001000_5));
            }
        }
        Iterator it2 = ((ArrayList) C77827UgZ.LIZ).iterator();
        while (it2.hasNext()) {
            AbstractC37594EpC abstractC37594EpC = (AbstractC37594EpC) ((Class) it2.next()).newInstance();
            abstractC37594EpC.getClass();
            abstractC37594EpC.LJLIL = c37922EuU;
            String name2 = abstractC37594EpC.getName();
            AqS43S0001000_5 aqS43S0001000_52 = new AqS43S0001000_5(i, 4);
            o.LJIIIZ(name2, "name");
            c38113ExZ.LIZJ(abstractC37594EpC.getName(), new C31893CfR(name2, abstractC37594EpC, aqS43S0001000_52));
        }
        C38113ExZ c38113ExZ2 = this.LJLILLLLZI;
        c38113ExZ2.LIZLLL("setStorage", new BUP());
        c38113ExZ2.LIZLLL("getStorage", new BUO());
        c38113ExZ2.LIZLLL("removeStorage", new C29221BdR());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("openGiftPanel", new C29427Bgl());
        linkedHashMap.put("disconnectMultiGuest", new C30728C4e());
        linkedHashMap.put("openLiveNotificationSettings", new BUK());
        linkedHashMap.put("openCommentPanel", new BUI());
        linkedHashMap.put("goLive", new C29148BcG());
        linkedHashMap.put("openInvoiceFile", new FileCheckMethod());
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            this.LJLILLLLZI.LIZLLL((String) entry3.getKey(), (AbstractC38127Exn) entry3.getValue());
        }
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("isEnableSubonlyChat", C31228CNk.LIZ);
        linkedHashMap2.put("preloadGiftEffect", C31489CXl.LIZ);
        linkedHashMap2.put("isOpenLiveNotification", C31229CNl.LIZ);
        linkedHashMap2.put("downloadFileWithLoadingView", C31919Cfr.LIZ);
        linkedHashMap2.put("liveBindPhone", C31230CNm.LIZ);
        for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
            this.LJLILLLLZI.LIZJ((String) entry4.getKey(), (InterfaceC31920Cfs) entry4.getValue());
        }
        linkedHashMap2.clear();
        C38118Exe c38118Exe2 = this.LJLJI;
        c38118Exe2.LIZIZ("openHotsoon", c29421Bgf);
        c38118Exe2.LIZIZ("openLive", c29421Bgf);
        c38118Exe2.LIZIZ("liveCashVerify", new C31888CfM(this.LJLJI));
        c38118Exe2.LIZIZ("openLiveRecharge", new C32009ChJ());
        this.LJLJI.LIZIZ("oneTapGoLIVE", new C29344BfQ(this.LJLJJI));
    }

    public static C31886CfK LIZLLL(Activity activity, WebView webView, C59586Na2 c59586Na2, CO9 co9) {
        C38116Exc c38116Exc = new C38116Exc(webView);
        c38116Exc.LJFF = activity;
        C38126Exm c38126Exm = new C38126Exm(new OUP());
        c38116Exc.LJ = c38126Exm;
        c38126Exm.LIZIZ = c38116Exc.LJIJ;
        c38116Exc.LJI = false;
        c38116Exc.LJII = true;
        c38116Exc.LJIIL.addAll(LJFF());
        c38116Exc.LJIIIZ.add(new C38211Ez9(webView));
        c38116Exc.LJIIJJI = "webcast";
        c38116Exc.LIZLLL = "ToutiaoJSBridge";
        C38113ExZ LIZ = c38116Exc.LIZ();
        C38118Exe c38118Exe = new C38118Exe(webView, LIZ);
        C38049EwX c38049EwX = c38118Exe.LIZIZ;
        c38049EwX.LIZIZ = "bytedance";
        c38049EwX.LJIIJ(c59586Na2);
        WebView webView2 = c38118Exe.LIZIZ.LIZ;
        if (webView2 != null) {
            webView2.setWebChromeClient(co9);
        }
        List<String> LJFF = LJFF();
        c38118Exe.LIZIZ.LIZJ = LJFF;
        c38118Exe.LIZ.LJII.LIZIZ.LIZ.addAll(LJFF);
        List<String> list = LJLJLJ;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            LJLJLJ = arrayList;
            arrayList.add("config");
            ((ArrayList) LJLJLJ).add("login");
            ((ArrayList) LJLJLJ).add("logout");
            ((ArrayList) LJLJLJ).add("close");
            ((ArrayList) LJLJLJ).add("gallery");
            ((ArrayList) LJLJLJ).add("toggleGalleryBars");
            ((ArrayList) LJLJLJ).add("slideShow");
            ((ArrayList) LJLJLJ).add("relatedShow");
            ((ArrayList) LJLJLJ).add("toast");
            ((ArrayList) LJLJLJ).add("slideDownload");
            ((ArrayList) LJLJLJ).add("requestChangeOrientation");
            ((ArrayList) LJLJLJ).add("adInfo");
            list = LJLJLJ;
        }
        c38118Exe.LIZIZ.LIZLLL = list;
        c38118Exe.LIZ.LJII.LIZIZ.LIZIZ.addAll(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            AbstractC38134Exu abstractC38134Exu = (AbstractC38134Exu) ((LinkedHashMap) c38118Exe.LIZLLL).get(it.next());
            if (abstractC38134Exu != null) {
                abstractC38134Exu.LJLIL = EnumC38078Ex0.PUBLIC;
            }
        }
        Object w2 = ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).w2(activity, LIZ);
        if (w2 instanceof C38113ExZ) {
            LIZ.LIZIZ((C38113ExZ) w2);
        }
        C31886CfK c31886CfK = new C31886CfK(activity, LIZ, c38118Exe, 0);
        c31886CfK.LJLILLLLZI.LIZJ("__prefetch", C31917Cfp.LIZ);
        return c31886CfK;
    }
}
