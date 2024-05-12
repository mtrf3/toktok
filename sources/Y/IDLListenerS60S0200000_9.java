package Y;

import X.C199617sT;
import X.C32151Nz;
import X.C34K;
import X.C38518F9u;
import X.C40058Fnq;
import X.C40342FsQ;
import X.C40343FsR;
import X.C44384HbQ;
import X.C54644LcW;
import X.C54650Lcc;
import X.C56158M2g;
import X.C56162M2k;
import X.C56309M8b;
import X.C56652MLg;
import X.C75792yF;
import X.C81139Vst;
import X.EnumC54647LcZ;
import X.M26;
import X.M78;
import X.M7A;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.placediscovery.param.PoiDiscoveryLandingPageParams;
import com.ss.android.ugc.aweme.placediscovery2.ui.assem.DiscoveryPoiListAssem;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS38S0100100_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDLListenerS60S0200000_9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS60S0200000_9 iDLListenerS60S0200000_9) {
        if (((View) iDLListenerS60S0200000_9.l0).getVisibility() == 0) {
            M7A state = ((C56309M8b) iDLListenerS60S0200000_9.l1).LJLJJLL.getState();
            M7A m7a = M7A.SHOWED;
            if (state != m7a) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((C56309M8b) iDLListenerS60S0200000_9.l1).LJLILLLLZI);
                LIZ.append(" change state from ");
                LIZ.append(((C56309M8b) iDLListenerS60S0200000_9.l1).LJLJJLL.getState().name());
                LIZ.append(" to SHOWED");
                C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
                M78 stateWrapper = ((C56309M8b) iDLListenerS60S0200000_9.l1).LJLJJLL.getStateWrapper();
                stateWrapper.getClass();
                stateWrapper.LIZJ(m7a);
                return;
            }
        }
        if (((View) iDLListenerS60S0200000_9.l0).getVisibility() == 0 || ((C56309M8b) iDLListenerS60S0200000_9.l1).LJLJJLL.getState() != M7A.SHOWED) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(((C56309M8b) iDLListenerS60S0200000_9.l1).LJLILLLLZI);
        LIZ2.append(" change state from ");
        LIZ2.append(((C56309M8b) iDLListenerS60S0200000_9.l1).LJLJJLL.getState().name());
        LIZ2.append(" to DISMISSED");
        C44384HbQ.LLFZ(X1D.LIZIZ(LIZ2));
        ((C56309M8b) iDLListenerS60S0200000_9.l1).LJLJJLL.getStateWrapper().LIZ();
        ((View) iDLListenerS60S0200000_9.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS60S0200000_9);
    }

    public static final void onGlobalLayout$1(IDLListenerS60S0200000_9 iDLListenerS60S0200000_9) {
        PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams;
        String str;
        String str2;
        String str3;
        Map<String, String> extraParams;
        String previousPage;
        EnumC54647LcZ discoveryScenario;
        ViewParent parent = ((DiscoveryPoiListAssem) iDLListenerS60S0200000_9.l0).getContainerView().getParent();
        o.LJII(parent, "null cannot be cast to non-null type com.ss.android.ugc.aweme.placediscovery2.ui.DragBottomSheet");
        C81139Vst c81139Vst = (C81139Vst) parent;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = ((DiscoveryPoiListAssem) iDLListenerS60S0200000_9.l0).getContext();
        if (context != null) {
            DiscoveryPoiListAssem discoveryPoiListAssem = (DiscoveryPoiListAssem) iDLListenerS60S0200000_9.l0;
            ViewGroup view = c81139Vst.getDragSheetContentContainer();
            int LJJIJIIJI = C32151Nz.LJJIJIIJI(context, c81139Vst.getDragSheetContentContainerBottomLimitHeight$nearby_release());
            int LJJIJIIJI2 = C32151Nz.LJJIJIIJI(context, c81139Vst.getDragSheetContentContainerTopLimitHeight$nearby_release());
            C54644LcW c54644LcW = ((C56158M2g) discoveryPoiListAssem.LJLILLLLZI.getValue()).LJLIL;
            if (c54644LcW != null) {
                poiDiscoveryLandingPageParams = c54644LcW.getPoiDiscoveryLandingPageParams();
            } else {
                poiDiscoveryLandingPageParams = null;
            }
            M26 m26 = ((DiscoveryLandingMapVM) discoveryPoiListAssem.LJLJI.getValue()).LJLIL;
            AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(c81139Vst, 491);
            AqS159S0100000_9 aqS159S0100000_92 = new AqS159S0100000_9(c81139Vst, 492);
            AqS38S0100100_9 aqS38S0100100_9 = new AqS38S0100100_9(discoveryPoiListAssem, currentTimeMillis, 0);
            o.LJIIIZ(view, "view");
            C199617sT c199617sT = discoveryPoiListAssem.LJLIL;
            c199617sT.getClass();
            if (poiDiscoveryLandingPageParams != null && (discoveryScenario = poiDiscoveryLandingPageParams.getDiscoveryScenario()) != null && C54650Lcc.LIZ[discoveryScenario.ordinal()] == 1) {
                poiDiscoveryLandingPageParams = PoiDiscoveryLandingPageParams.copy$default(poiDiscoveryLandingPageParams, poiDiscoveryLandingPageParams.getRegionName(), null, null, null, null, null, null, null, null, null, 1022, null);
            }
            if (poiDiscoveryLandingPageParams != null) {
                str = C75792yF.LIZJ(poiDiscoveryLandingPageParams);
            } else {
                str = null;
            }
            String str4 = "";
            if (str == null) {
                str = "";
            }
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            C38518F9u c38518F9u = new C38518F9u();
            c38518F9u.put("popupNormalHeight", (Object) Integer.valueOf(LJJIJIIJI));
            c38518F9u.put("popupExpandHeight", (Object) Integer.valueOf(LJJIJIIJI2));
            sparkContext.runtimeInfo = c38518F9u;
            PermissionCache.LJLIL.getClass();
            sparkContext.LJJIIJZLJL("enable_location", PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION"));
            sparkContext.LJJIIJZLJL("system_is_precise", ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSystemPrecise(context));
            sparkContext.LJJIIJZLJL("inapp_is_precise", ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise());
            if (m26 == null || (str2 = m26.getEnterFrom()) == null) {
                str2 = "homepage_nearby";
            }
            sparkContext.LJJIIJ("enter_from", str2);
            if (m26 == null || (str3 = m26.getEnterMethod()) == null) {
                str3 = "click_category_carousel";
            }
            sparkContext.LJJIIJ("enter_method", str3);
            if (m26 != null && (previousPage = m26.getPreviousPage()) != null) {
                str4 = previousPage;
            }
            sparkContext.LJJIIJ("previous_page", str4);
            if (m26 != null && (extraParams = m26.getExtraParams()) != null) {
                for (Map.Entry<String, String> entry : extraParams.entrySet()) {
                    String value = entry.getValue();
                    if (value != null) {
                        sparkContext.LJJIIJ(entry.getKey(), value);
                    }
                }
            }
            sparkContext.LJJI(new C56162M2k(c199617sT, aqS159S0100000_92, aqS38S0100100_9, aqS159S0100000_9));
            sparkContext.LJJ(new C40058Fnq(str));
            sparkContext.LJJIJLIJ(c199617sT.LIZIZ);
            c40342FsQ.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
            LIZ.LIZIZ();
            view.addView(LIZ, new ViewGroup.LayoutParams(-1, -1));
            view.invalidate();
        }
        ((View) iDLListenerS60S0200000_9.l1).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS60S0200000_9);
    }

    public static final void onGlobalLayout$2(IDLListenerS60S0200000_9 iDLListenerS60S0200000_9) {
        ((View) iDLListenerS60S0200000_9.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS60S0200000_9);
        if (!((C34K) iDLListenerS60S0200000_9.l1).element) {
            return;
        }
        C56652MLg.LIZIZ.LIZIZ();
        ((C34K) iDLListenerS60S0200000_9.l1).element = false;
    }

    public static final void onGlobalLayout$3(IDLListenerS60S0200000_9 iDLListenerS60S0200000_9) {
        ((View) iDLListenerS60S0200000_9.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS60S0200000_9);
        if (!((C34K) iDLListenerS60S0200000_9.l1).element) {
            return;
        }
        C56652MLg.LIZJ.LIZIZ(4);
        C56652MLg.LIZIZ.LIZIZ();
        ((C34K) iDLListenerS60S0200000_9.l1).element = false;
    }

    public static final void onGlobalLayout$4(IDLListenerS60S0200000_9 iDLListenerS60S0200000_9) {
        ((View) iDLListenerS60S0200000_9.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS60S0200000_9);
        if (!((C34K) iDLListenerS60S0200000_9.l1).element) {
            return;
        }
        C56652MLg.LIZJ.LIZIZ(4);
        C56652MLg.LIZIZ.LIZIZ();
        ((C34K) iDLListenerS60S0200000_9.l1).element = false;
    }

    public static final void onGlobalLayout$5(IDLListenerS60S0200000_9 iDLListenerS60S0200000_9) {
        ((View) iDLListenerS60S0200000_9.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS60S0200000_9);
        FissionPopupWindowHelp fissionPopupWindowHelp = ((NoticeAssem) iDLListenerS60S0200000_9.l1).LJLJLLL;
        if (fissionPopupWindowHelp == null) {
            return;
        }
        fissionPopupWindowHelp.LJLLL = true;
    }

    public IDLListenerS60S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
