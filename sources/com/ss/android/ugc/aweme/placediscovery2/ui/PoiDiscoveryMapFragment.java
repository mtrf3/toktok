package com.ss.android.ugc.aweme.placediscovery2.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C3C5;
import X.C41151GDb;
import X.C54644LcW;
import X.C56156M2e;
import X.C56157M2f;
import X.C56165M2n;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C81139Vst;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.FKM;
import X.FMX;
import X.GH1;
import X.InterfaceC61213O0r;
import X.JF1;
import X.M26;
import X.M28;
import X.M29;
import X.M3Z;
import X.OHI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.placediscovery.param.PoiDiscoveryLandingPageParams;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes10.dex */
public final class PoiDiscoveryMapFragment extends BaseFragment {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public ViewGroup LJLJJI;
    public ViewGroup LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public PoiDiscoveryMapFragment() {
        C214298b3 c214298b3;
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArg(this, M29.LJLIL, "poi_category_data", C54644LcW.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, M28.LJLIL, "mob_params", M26.class);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DiscoveryLandingMapVM.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 489);
        C56157M2f c56157M2f = C56157M2f.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c56157M2f, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c56157M2f, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        boolean z;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        super.onDestroy();
        DiscoveryLandingMapVM discoveryLandingMapVM = (DiscoveryLandingMapVM) this.LJLJI.getValue();
        M26 m26 = discoveryLandingMapVM.LJLIL;
        Map<String, String> map = null;
        if (m26 != null) {
            str = m26.getPreviousPage();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        boolean z2 = true;
        if (C56165M2n.LIZ("KEY_INIT_MAP") != null) {
            z = true;
        } else {
            z = false;
        }
        if (C56165M2n.LIZ("KEY_INIT_LYNX") == null) {
            z2 = false;
        }
        Integer num = discoveryLandingMapVM.LJLJLJ;
        long currentTimeMillis = System.currentTimeMillis() - discoveryLandingMapVM.LJLZ;
        String str4 = discoveryLandingMapVM.LJLLL;
        if (str4 != null) {
            str3 = str4;
        }
        OHI ohi = OHI.LIZ;
        AwemeHostApplication LIZ = FKM.LIZ();
        ohi.getClass();
        boolean LJ = OHI.LJ(LIZ, "android.permission.ACCESS_COARSE_LOCATION");
        boolean LIZ2 = C56156M2e.LIZ();
        boolean isInAppPrecise = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise();
        M26 m262 = discoveryLandingMapVM.LJLIL;
        if (m262 != null) {
            map = m262.getExtraParams();
        }
        LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", "places_discover", "previous_page", str);
        LIZIZ.put("duration", String.valueOf(currentTimeMillis));
        LIZIZ.put("tab_code", str3);
        if (num == null || (str2 = num.toString()) == null) {
            str2 = "NETWORK_ERROR";
        }
        LIZIZ.put("status_code", str2);
        String str5 = "1";
        if (LJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.put("enable_location", obj);
        if (LIZ2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.put("system_is_precise", obj2);
        if (isInAppPrecise) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.put("inapp_is_precise", obj3);
        if (z) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.put("is_map_loaded_success", obj4);
        if (!z2) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.put("is_list_loaded_success", str5);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    LIZIZ.put(entry.getKey(), value);
                }
            }
        }
        FMX.LJIIL("exit_places_discover", LIZIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long j;
        Long clickTimeMs;
        super.onCreate(bundle);
        C56165M2n.LIZJ.removeCallbacksAndMessages(null);
        ((ArrayList) C56165M2n.LIZ).clear();
        ((LinkedList) C56165M2n.LIZIZ).clear();
        DiscoveryLandingMapVM discoveryLandingMapVM = (DiscoveryLandingMapVM) this.LJLJI.getValue();
        M26 m26 = (M26) this.LJLILLLLZI.getValue();
        if (m26 != null && (clickTimeMs = m26.getClickTimeMs()) != null) {
            j = clickTimeMs.longValue();
        } else {
            j = 0;
        }
        discoveryLandingMapVM.LLI = j;
        fragmentConfiguration(C41151GDb.LJLIL);
        activityConfiguration(GH1.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        String str;
        PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams;
        Long clickTimeMs;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DiscoveryLandingMapVM discoveryLandingMapVM = (DiscoveryLandingMapVM) this.LJLJI.getValue();
        M3Z m3z = new M3Z("places_discover");
        m3z.LIZLLL = "page_open";
        long currentTimeMillis = System.currentTimeMillis();
        M26 m26 = (M26) this.LJLILLLLZI.getValue();
        if (m26 != null && (clickTimeMs = m26.getClickTimeMs()) != null) {
            j = clickTimeMs.longValue();
        } else {
            j = 0;
        }
        m3z.LIZ(currentTimeMillis - j);
        discoveryLandingMapVM.lv0(m3z);
        DiscoveryLandingMapVM discoveryLandingMapVM2 = (DiscoveryLandingMapVM) this.LJLJI.getValue();
        C54644LcW c54644LcW = (C54644LcW) this.LJLIL.getValue();
        PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams2 = null;
        if (c54644LcW != null && (poiDiscoveryLandingPageParams = c54644LcW.getPoiDiscoveryLandingPageParams()) != null) {
            str = poiDiscoveryLandingPageParams.getSelectTabCode();
        } else {
            str = null;
        }
        discoveryLandingMapVM2.LJLLL = str;
        if (c54644LcW != null) {
            poiDiscoveryLandingPageParams2 = c54644LcW.getPoiDiscoveryLandingPageParams();
        }
        discoveryLandingMapVM2.LJLILLLLZI = poiDiscoveryLandingPageParams2;
        ((DiscoveryLandingMapVM) this.LJLJI.getValue()).LJLIL = (M26) this.LJLILLLLZI.getValue();
        C81139Vst c81139Vst = (C81139Vst) view.findViewById(R.id.cb5);
        View findViewById = view.findViewById(R.id.cb4);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.discovery_map_layout)");
        this.LJLJJI = (ViewGroup) findViewById;
        this.LJLJJL = c81139Vst.getDragSheetContentContainer();
        C8VV.LIZ(this, false, new AqS140S0200000_9(this, view, 67));
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 486));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bwc, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
