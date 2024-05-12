package com.ss.android.ugc.aweme.poi.detail.container;

import X.A1X;
import X.AbstractC62641OiD;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C0JU;
import X.C107794Kx;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C184077Kh;
import X.C189127bY;
import X.C190187dG;
import X.C190227dK;
import X.C190487dk;
import X.C190667e2;
import X.C190677e3;
import X.C190687e4;
import X.C190697e5;
import X.C190707e6;
import X.C190717e7;
import X.C190737e9;
import X.C190747eA;
import X.C190757eB;
import X.C190787eE;
import X.C190817eH;
import X.C190827eI;
import X.C190847eK;
import X.C191557fT;
import X.C198977rR;
import X.C212418Vh;
import X.C212428Vi;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C225248si;
import X.C29S;
import X.C2K0;
import X.C2L4;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C41153GDd;
import X.C42625Go9;
import X.C43001GuD;
import X.C45804HyK;
import X.C51556KLg;
import X.C54081LKj;
import X.C54082LKk;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56178M3a;
import X.C56179M3b;
import X.C56319M8l;
import X.C56412MCa;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65777Prh;
import X.C76800UCe;
import X.C76965UIn;
import X.C78685UuP;
import X.C78920UyC;
import X.C78926UyI;
import X.C85256Xd6;
import X.C85258Xd8;
import X.C8TX;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EV9;
import X.EnumC54527Lad;
import X.FKM;
import X.FMX;
import X.HG3;
import X.InterfaceC189047bQ;
import X.InterfaceC189137bZ;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC54674Ld0;
import X.InterfaceC55235Lm3;
import X.InterfaceC55643Lsd;
import X.InterfaceC56322M8o;
import X.InterfaceC61213O0r;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.M3Z;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.QD3;
import X.RBW;
import X.RBX;
import X.TBW;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.config.PoiDetailConfig;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailFragment;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo;
import com.ss.android.ugc.aweme.poi.detail.container.ui.OnPoiOfflineAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS27S0210000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class PoiDetailFragment extends DetailBaseFragment implements KPL, InterfaceC189047bQ, InterfaceC189137bZ, InterfaceC56322M8o, RefreshAbility, C2L4 {
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public PoiAnchorData LJLJJL;
    public final C5H3 LJLJJLL;
    public long LJLJL;
    public boolean LJLJLJ;
    public Long LJLJLLL;
    public final C214378bB LJLL;
    public final C214298b3 LJLLI;
    public final C214298b3 LJLLILLLL;
    public final String LJLLJ;
    public long LJLLL;
    public long LJLLLL;
    public long LJLLLLLL;
    public Map<Integer, View> LJLZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLZ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public String lr() {
        return "poi_detail";
    }

    @Override // X.InterfaceC56322M8o
    public boolean needConflictWithParent() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return Dl(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, X.JBS
    public /* bridge */ /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public void refresh() {
    }

    @Override // X.InterfaceC189047bQ, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public PoiDetailFragment() {
        AqS60S0110000_3 LJJ;
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLILLLLZI = routeArgExtension.requiredArg(this, C190747eA.LJLIL, "poi_id", String.class);
        this.LJLJI = routeArgExtension.optionalArg(this, C190677e3.LJLIL, "poi_detail_params", C190487dk.class);
        this.LJLJJI = routeArgExtension.optionalArg(this, new AqS169S0100000_3(this, 381), "poi_data", PoiAnchorData.class);
        this.LJLJJLL = routeArgExtension.optionalArg(this, C190667e2.LJLIL, "poi_mob", C190787eE.class);
        this.LJLJL = System.currentTimeMillis();
        this.LJLJLJ = true;
        InterfaceC65784Pro<String> Hl = Hl();
        C65776Prg LIZ = C65352Pkq.LIZ(PoiVideoListSharedViewModel.class);
        C190717e7 c190717e7 = C190717e7.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        AqS60S0110000_3 LJIILLIIL = C78926UyI.LJIILLIIL(this, true);
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLL = new C214378bB(LIZ, Hl, c214528bQ, LJJII, c184077Kh, c190717e7, LJJ, LJIILLIIL);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ2, 720);
        C190697e5 c190697e5 = C190697e5.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, c214528bQ, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), c184077Kh, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c190697e5, LIZ2);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c190697e5, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLI = c214298b3;
        C65776Prg LIZ3 = C65352Pkq.LIZ(PoiCollectStatusViewModel.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ3, 721);
        C190707e6 c190707e6 = C190707e6.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, c214528bQ, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), c184077Kh, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c190707e6, LIZ3);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c190707e6, LIZ3);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLILLLL = c214298b32;
        this.LJLLJ = "poi_video_list";
    }

    private final InterfaceC65784Pro<String> Hl() {
        return new AqS153S0100000_3(this, 719);
    }

    private final PoiCollectStatusViewModel Jl() {
        return (PoiCollectStatusViewModel) this.LJLLILLLL.getValue();
    }

    private final PoiAnchorData Kl() {
        return (PoiAnchorData) this.LJLJJI.getValue();
    }

    private final PoiDetailInfoViewModel Nl() {
        return (PoiDetailInfoViewModel) this.LJLLI.getValue();
    }

    private final PoiVideoListSharedViewModel Pl() {
        return (PoiVideoListSharedViewModel) this.LJLL.getValue();
    }

    public final String G20() {
        return (String) this.LJLILLLLZI.getValue();
    }

    public List<InterfaceC55643Lsd> Il() {
        return new ArrayList();
    }

    public final PoiAnchorData Ll() {
        PoiAnchorData poiAnchorData = this.LJLJJL;
        if (poiAnchorData == null) {
            return Kl();
        }
        return poiAnchorData;
    }

    public final C190787eE Ml() {
        return (C190787eE) this.LJLJJLL.getValue();
    }

    public final C190487dk Ol() {
        return (C190487dk) this.LJLJI.getValue();
    }

    @Override // X.C2L4
    public List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(PoiDetailScope.class);
    }

    @Override // X.InterfaceC189047bQ
    public PoiVideoListSharedViewModel Qi() {
        return Pl();
    }

    @Override // X.InterfaceC189047bQ
    public String c1() {
        return G20();
    }

    @Override // X.InterfaceC55643Lsd
    public C54082LKk getPopupContext() {
        Context context = getContext();
        if (context != null) {
            return C54081LKj.LIZ(context, this);
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC189137bZ
    public C190487dk ja() {
        return Ol();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (C198977rR.LIZIZ != null && o.LJ(C198977rR.LIZ, G20())) {
            C198977rR.LIZ = null;
            C198977rR.LIZIZ = null;
        }
        C42625Go9.LIZJ(this);
        FMX.LJIIL("poi_detail_stay_time", Gl(this.LJLLLL));
        FMX.LJIIL("stay_time", Gl(System.currentTimeMillis() - this.LJLLLLLL));
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.LJLLLL = (System.currentTimeMillis() - this.LJLLL) + this.LJLLLL;
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        o.LJIIIIZZ(LJIIIZ, "get().getService(IScreenshotService::class.java)");
        LJIIIZ.LJI(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LJLLL = System.currentTimeMillis();
        ScreenShotService.LJIIIZ().LIZ("poi_detail_page", new AbstractC62641OiD() { // from class: X.7e1
            @Override // X.AbstractC62641OiD
            public final java.util.Map<String, String> mobExtalParams() {
                return C225248si.LIZ("poi_detail_page", PoiDetailFragment.this.G20(), PoiDetailFragment.this.Ll());
            }
        });
    }

    public InterfaceC55643Lsd Sl() {
        return C56319M8l.LJLIL;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @Override // X.InterfaceC55643Lsd
    public String getSceneId() {
        return this.LJLLJ;
    }

    private final Map<String, String> Gl(long j) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Map<String, String> searchParams;
        String fromPage;
        String previousPage;
        String str7;
        PoiListApi.PoiDetailResponse poiDetailResponse = Nl().LJLILLLLZI;
        LinkedHashMap LIZ = C0JU.LIZ("enter_from", "poi_detail");
        C190487dk Ol = Ol();
        if (Ol == null || (str = Ol.getEnterMethod()) == null) {
            str = "";
        }
        LIZ.put("enter_method", str);
        C190787eE Ml = Ml();
        if (Ml == null || (str2 = Ml.getGroupId()) == null) {
            str2 = "";
        }
        LIZ.put("group_id", str2);
        C190787eE Ml2 = Ml();
        if (Ml2 == null || (str3 = Ml2.getAuthorId()) == null) {
            str3 = "";
        }
        LIZ.put("author_id", str3);
        LIZ.put("duration", String.valueOf(j));
        LIZ.put("poi_id", G20());
        PoiAnchorData Ll = Ll();
        if (Ll == null || (str4 = Ll.getPoiCityCode()) == null) {
            str4 = "";
        }
        LIZ.put("poi_city", str4);
        PoiAnchorData Ll2 = Ll();
        if (Ll2 == null || (str5 = Ll2.getPoiRegionCode()) == null) {
            str5 = "";
        }
        LIZ.put("poi_region_code", str5);
        LIZ.put("poi_info_source", "google");
        if (poiDetailResponse != null) {
            LIZ.put("poi_detail_type", poiDetailResponse.LJIIJJI());
            LIZ.put("is_claimed", poiDetailResponse.LJIIIZ());
            LIZ.put("partner_data_source", poiDetailResponse.LJI());
            if (poiDetailResponse.LJII()) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.put("has_reserve", str7);
        }
        PoiAnchorData Ll3 = Ll();
        if (Ll3 != null) {
            str6 = Ll3.getCollectInfo();
        } else {
            str6 = null;
        }
        C43001GuD.LIZJ(str6, LIZ);
        C190487dk Ol2 = Ol();
        if (Ol2 != null && (previousPage = Ol2.getPreviousPage()) != null) {
            LIZ.put("previous_page", previousPage);
        }
        C190487dk Ol3 = Ol();
        if (Ol3 != null && (fromPage = Ol3.getFromPage()) != null) {
            LIZ.put("from_page", fromPage);
        }
        PoiAnchorData Ll4 = Ll();
        if (Ll4 != null && (searchParams = Ll4.getSearchParams()) != null) {
            for (Map.Entry<String, String> entry : searchParams.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                LIZ.put(key, value);
            }
        }
        LIZ.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        return LIZ;
    }

    private final void Ql(boolean z) {
        String str = null;
        Map<String, String> map = C189127bY.LIZ(this, false, null, null, 14).toMap();
        o.LJII(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
        Map<String, String> LIZJ = C65777Prh.LIZJ(map);
        C190487dk Ol = Ol();
        if (Ol != null) {
            str = Ol.getEnterMethod();
        }
        LIZJ.put("enter_method", String.valueOf(str));
        Rl(z, LIZJ);
    }

    public static final PoiCollectStatusViewModel Wl(C214298b3<C190187dG, PoiCollectStatusViewModel> c214298b3) {
        return (PoiCollectStatusViewModel) c214298b3.getValue();
    }

    public final void Vl(PoiListApi.PoiDetailResponse poiDetailResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        C214298b3 c214298b3;
        C190487dk Ol = Ol();
        if (Ol != null) {
            str = Ol.getActionFromParam();
        } else {
            str = null;
        }
        if (o.LJ(str, "collect")) {
            C190487dk Ol2 = Ol();
            if (Ol2 != null) {
                str2 = Ol2.isCollectFromParam();
            } else {
                str2 = null;
            }
            if (C78685UuP.LJJJZ(str2)) {
                C190487dk Ol3 = Ol();
                if (Ol3 != null) {
                    str3 = Ol3.isCollectFromParam();
                } else {
                    str3 = null;
                }
                if (o.LJ(str3, CardStruct.IStatusCode.DEFAULT) && poiDetailResponse.isCollected) {
                    bool = Boolean.FALSE;
                } else {
                    C190487dk Ol4 = Ol();
                    if (Ol4 != null) {
                        str4 = Ol4.isCollectFromParam();
                    } else {
                        str4 = null;
                    }
                    if (!o.LJ(str4, "1") || poiDetailResponse.isCollected) {
                        return;
                    } else {
                        bool = Boolean.TRUE;
                    }
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    IPoiDetailInfoVAbility iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), IPoiDetailInfoVAbility.class, null);
                    if (iPoiDetailInfoVAbility != null) {
                        iPoiDetailInfoVAbility.jm(booleanValue);
                    }
                    C9BE c9be = C9BE.LIZ;
                    C65776Prg LIZ = C65352Pkq.LIZ(PoiCollectStatusViewModel.class);
                    AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 722);
                    C190687e4 c190687e4 = C190687e4.INSTANCE;
                    if (o.LJ(c9be, C9BD.LIZ)) {
                        c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c190687e4, LIZ);
                    } else if (c9be == null || o.LJ(c9be, c9be)) {
                        c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c190687e4, LIZ);
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    Ql(booleanValue);
                    Wl(c214298b3).gv0(Boolean.valueOf(booleanValue), G20(), new AqS27S0210000_3(booleanValue, this, poiDetailResponse, 3));
                    PoiAnchorData Ll = Ll();
                    if (Ll != null) {
                        PoiAnchorData updatePoiDetailCollect = Ll.updatePoiDetailCollect(booleanValue);
                        PoiAnchorData.Companion.getClass();
                        C190827eI.LJ(updatePoiDetailCollect);
                        this.LJLJJL = updatePoiDetailCollect;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C41153GDd.LJLIL);
        C42625Go9.LIZIZ(this);
        this.LJLLLLLL = System.currentTimeMillis();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLJJI, "point_of_interest") && isActive()) {
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(getContext(), getView(), event);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPoiSuggestAnEditPopupEvent(C190737e9 event) {
        Context context;
        o.LJIIIZ(event, "event");
        if (isActive() && (context = getContext()) != null) {
            A1X.LIZ(context, event.LJLIL);
        }
    }

    private final void Rl(boolean z, Map<String, String> map) {
        if (z) {
            C225248si.LJIILJJIL(map);
        } else {
            C225248si.LJFF(map);
        }
    }

    @Override // X.InterfaceC189137bZ
    public void Rf(Bundle bundle, Aweme aweme) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String str;
        char c;
        boolean z;
        String str2;
        String str3;
        String str4;
        boolean z2;
        String str5;
        String str6;
        o.LJIIIZ(aweme, "aweme");
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), IPoiDetailInfoVAbility.class, null);
        if (iPoiDetailInfoVAbility != null) {
            poiDetailResponse = iPoiDetailInfoVAbility.EO();
        } else {
            poiDetailResponse = null;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://aweme/detail/");
        Bundle bundle2 = new Bundle();
        bundle2.putString("id", aweme.getAid());
        bundle2.putString("userid", ((RBX) HG3.LJIILL()).getCurUserId());
        bundle2.putString("sec_userid", ((RBX) HG3.LJIILL()).getCurSecUserId());
        bundle2.putInt("video_type", 44);
        bundle2.putString("enter_from", "poi_detail");
        C190787eE Ml = Ml();
        if (Ml == null || (str = Ml.getGroupId()) == null) {
            str = "";
        }
        bundle2.putString("from_group_id", str);
        bundle2.putString("page_poi_id", Pl().LJLJJI);
        PoiDetailConfig.PoiDetailVideoListConfig LIZ = PoiDetailConfig.LIZ(Pl().LJLJJL);
        if (LIZ == null || LIZ.poiDetailVideoTwoColumn == 0) {
            c = 3;
        } else {
            c = 2;
        }
        if (c == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bundle2.putBoolean("poi_collect_bottom_bar", false);
            bundle2.putBoolean("hide_poi_anchor", false);
        } else {
            bundle2.putBoolean("poi_collect_bottom_bar", true);
            bundle2.putBoolean("hide_poi_anchor", true);
        }
        bundle2.putString("video_from", "POI_VIDEO_LIST_ENTRANCE");
        C190487dk Ol = Ol();
        if (Ol != null) {
            str2 = Ol.getEnterFrom();
        } else {
            str2 = null;
        }
        if (o.LJ(str2, "collection_places")) {
            bundle2.putString("previous_page", "collection_places");
        } else {
            C190487dk Ol2 = Ol();
            if (Ol2 != null) {
                str3 = Ol2.getPreviousPage();
            } else {
                str3 = null;
            }
            bundle2.putString("previous_page", str3);
        }
        if (poiDetailResponse != null) {
            str4 = poiDetailResponse.name;
        } else {
            str4 = null;
        }
        bundle2.putString("poi_name", str4);
        if (poiDetailResponse != null) {
            z2 = poiDetailResponse.isCollected;
        } else {
            z2 = false;
        }
        bundle2.putBoolean("is_collected", z2);
        if (poiDetailResponse != null) {
            str5 = poiDetailResponse.address;
        } else {
            str5 = null;
        }
        bundle2.putString("poi_address", str5);
        bundle2.putString("poi_fullscreen", "1");
        if (poiDetailResponse != null) {
            str6 = poiDetailResponse.collectInfo;
        } else {
            str6 = null;
        }
        bundle2.putString("page_collect_info", str6);
        bundle2.putSerializable("poi_collect_mob_data", C189127bY.LIZ(this, true, null, aweme, 10));
        HashMap hashMap = new HashMap();
        hashMap.put("fragment_id", String.valueOf(this.LJLJL));
        bundle2.putSerializable("feed_param_extra", hashMap);
        bundle2.putSerializable("screen_shot_param", C113554cx.LJJJLZIJ(new OSZ("poi_id", G20())));
        buildRoute.withParam(bundle2);
        buildRoute.withBundleAnimation(bundle);
        buildRoute.withParam("activity_has_activity_options", true);
        buildRoute.open();
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, R> R Zl(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C212418Vh.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q> void cm(VM1 vm1, InterfaceC88472Yns<? super S1, C76800UCe> interfaceC88472Yns) {
        C212418Vh.LJIIL(vm1, interfaceC88472Yns);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        TokenCert with;
        ActivityC45651qj LJJIFFI;
        String str2;
        String str3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Pl().LJLJJI = G20();
        PoiVideoListSharedViewModel Pl = Pl();
        PoiAnchorData Ll = Ll();
        String str4 = null;
        if (Ll != null) {
            str = Ll.getTypeLevel();
        } else {
            str = null;
        }
        Pl.LJLJJL = str;
        PoiAnchorData Ll2 = Ll();
        if (Ll2 != null) {
            PoiAnchorData.Companion.getClass();
            C190827eI.LJ(Ll2);
        }
        FMX.LJIIL("poi_detail_loading", C78920UyC.LIZJ(!PoiEnableExperiment.LIZIZ() ? 1 : 0, "is_blank_page").LIZ);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, RefreshAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, RefreshAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(this);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(RefreshAbility.class.getClassLoader(), new Class[]{RefreshAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, RefreshAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshAbility");
                    }
                }
            }
        }
        Nl().LJLJJL = Ol();
        Nl().LJLJJLL = Ml();
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 380));
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(LIZLLL2, null);
            RefreshSuccessSubscriber refreshSuccessSubscriber = new RefreshSuccessSubscriber() { // from class: com.ss.android.ugc.aweme.poi.detail.container.PoiDetailFragment$onViewCreated$2
                @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
                public final void pN() {
                    IPoiDetailVisibilityAbility iPoiDetailVisibilityAbility = (IPoiDetailVisibilityAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(PoiDetailFragment.this, null), IPoiDetailVisibilityAbility.class, null);
                    if (iPoiDetailVisibilityAbility != null) {
                        iPoiDetailVisibilityAbility.y4();
                    }
                }
            };
            C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ2, RefreshSuccessSubscriber.class, null);
            if (LIZ2 == null) {
                C55096Ljo.LJIIJJI(LIZJ2, refreshSuccessSubscriber, RefreshSuccessSubscriber.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
                    if (invocationHandler2 instanceof EV9) {
                        ((EV9) invocationHandler2).LIZ.add(refreshSuccessSubscriber);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused2) {
                    EV9 ev92 = new EV9();
                    ev92.LIZ.add(refreshSuccessSubscriber);
                    ev92.LIZ.add(LIZ2);
                    Object newProxyInstance2 = Proxy.newProxyInstance(RefreshSuccessSubscriber.class.getClassLoader(), new Class[]{RefreshSuccessSubscriber.class}, ev92);
                    if (newProxyInstance2 != null) {
                        C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, RefreshSuccessSubscriber.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber");
                    }
                }
            }
        }
        Fragment LIZLLL3 = C212428Vi.LIZLLL(this);
        if (LIZLLL3 != null) {
            InterfaceC55235Lm3 LIZJ3 = C55230Lly.LIZJ(LIZLLL3, null);
            RefreshErrorSubscriber refreshErrorSubscriber = new RefreshErrorSubscriber() { // from class: com.ss.android.ugc.aweme.poi.detail.container.PoiDetailFragment$onViewCreated$3
                @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber
                public final void s6(Throwable throwable) {
                    IPoiDetailVisibilityAbility iPoiDetailVisibilityAbility;
                    o.LJIIIZ(throwable, "throwable");
                    IPoiDetailInfoVAbility iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(PoiDetailFragment.this, null), IPoiDetailInfoVAbility.class, null);
                    if ((iPoiDetailInfoVAbility == null || !iPoiDetailInfoVAbility.in0()) && (iPoiDetailVisibilityAbility = (IPoiDetailVisibilityAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(PoiDetailFragment.this, null), IPoiDetailVisibilityAbility.class, null)) != null) {
                        iPoiDetailVisibilityAbility.la();
                    }
                }
            };
            C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ3, RefreshErrorSubscriber.class, null);
            if (LIZ3 == null) {
                C55096Ljo.LJIIJJI(LIZJ3, refreshErrorSubscriber, RefreshErrorSubscriber.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler3 = Proxy.getInvocationHandler(LIZ3);
                    if (invocationHandler3 instanceof EV9) {
                        ((EV9) invocationHandler3).LIZ.add(refreshErrorSubscriber);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused3) {
                    EV9 ev93 = new EV9();
                    ev93.LIZ.add(refreshErrorSubscriber);
                    ev93.LIZ.add(LIZ3);
                    Object newProxyInstance3 = Proxy.newProxyInstance(RefreshErrorSubscriber.class.getClassLoader(), new Class[]{RefreshErrorSubscriber.class}, ev93);
                    if (newProxyInstance3 != null) {
                        C55096Ljo.LJIIJJI(LIZJ3, (C2K0) newProxyInstance3, RefreshErrorSubscriber.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber");
                    }
                }
            }
        }
        Fragment LIZLLL4 = C212428Vi.LIZLLL(this);
        if (LIZLLL4 != null) {
            InterfaceC55235Lm3 LIZJ4 = C55230Lly.LIZJ(LIZLLL4, null);
            OnPoiOfflineAbility onPoiOfflineAbility = new OnPoiOfflineAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.PoiDetailFragment$onViewCreated$4
                @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.OnPoiOfflineAbility
                public final void PH() {
                    IPoiDetailVisibilityAbility iPoiDetailVisibilityAbility = (IPoiDetailVisibilityAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(PoiDetailFragment.this, null), IPoiDetailVisibilityAbility.class, null);
                    if (iPoiDetailVisibilityAbility != null) {
                        iPoiDetailVisibilityAbility.la();
                    }
                }
            };
            C2K0 LIZ4 = C55096Ljo.LIZ(LIZJ4, OnPoiOfflineAbility.class, null);
            if (LIZ4 == null) {
                C55096Ljo.LJIIJJI(LIZJ4, onPoiOfflineAbility, OnPoiOfflineAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler4 = Proxy.getInvocationHandler(LIZ4);
                    if (invocationHandler4 instanceof EV9) {
                        ((EV9) invocationHandler4).LIZ.add(onPoiOfflineAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused4) {
                    EV9 ev94 = new EV9();
                    ev94.LIZ.add(onPoiOfflineAbility);
                    ev94.LIZ.add(LIZ4);
                    Object newProxyInstance4 = Proxy.newProxyInstance(OnPoiOfflineAbility.class.getClassLoader(), new Class[]{OnPoiOfflineAbility.class}, ev94);
                    if (newProxyInstance4 != null) {
                        C55096Ljo.LJIIJJI(LIZJ4, (C2K0) newProxyInstance4, OnPoiOfflineAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.ui.OnPoiOfflineAbility");
                    }
                }
            }
        }
        Fragment LIZLLL5 = C212428Vi.LIZLLL(this);
        if (LIZLLL5 != null) {
            InterfaceC55235Lm3 LIZJ5 = C55230Lly.LIZJ(LIZLLL5, null);
            PoiDetailInfoRefreshAbility poiDetailInfoRefreshAbility = new PoiDetailInfoRefreshAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.PoiDetailFragment$onViewCreated$5
                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void RD(PoiListApi.PoiDetailResponse poiDetailResponse, boolean z) {
                    String str5;
                    long j;
                    PoiDetailFragment poiDetailFragment;
                    PoiAnchorData Ll3;
                    String str6;
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("onPoiDetailSuccess, poi name: ");
                    PoiAnchorData poiAnchorData = null;
                    if (poiDetailResponse != null) {
                        str5 = poiDetailResponse.name;
                    } else {
                        str5 = null;
                    }
                    LIZ5.append(str5);
                    X1D.LIZIZ(LIZ5);
                    if (poiDetailResponse != null && (Ll3 = (poiDetailFragment = PoiDetailFragment.this).Ll()) != null) {
                        poiDetailFragment.LJLJJL = Ll3.updatePoiDetailData(poiDetailResponse.LJIIJJI(), poiDetailResponse.LJIIJ());
                        PoiAnchorData Ll4 = poiDetailFragment.Ll();
                        if (Ll4 != null) {
                            String str7 = poiDetailResponse.collectInfo;
                            String str8 = poiDetailResponse.cityCode;
                            String LJIIJJI = poiDetailResponse.LJIIJJI();
                            String str9 = poiDetailResponse.regionCode;
                            C190787eE Ml = poiDetailFragment.Ml();
                            if (Ml == null || (str6 = Ml.getGroupId()) == null) {
                                str6 = "";
                            }
                            PoiAnchorData updateInfoFromPoiDetail = Ll4.updateInfoFromPoiDetail(str7, str8, LJIIJJI, str9, str6);
                            if (updateInfoFromPoiDetail != null) {
                                PoiAnchorData.Companion.getClass();
                                C190827eI.LJ(updateInfoFromPoiDetail);
                                poiAnchorData = updateInfoFromPoiDetail;
                            }
                        }
                        poiDetailFragment.LJLJJL = poiAnchorData;
                    }
                    PoiDetailFragment poiDetailFragment2 = PoiDetailFragment.this;
                    if (poiDetailFragment2.LJLJLJ) {
                        if (poiDetailResponse != null) {
                            poiDetailFragment2.Vl(poiDetailResponse);
                        }
                        PoiDetailFragment.this.LJLJLJ = false;
                        long currentTimeMillis = System.currentTimeMillis();
                        M3Z m3z = new M3Z("poi_detail");
                        m3z.LIZLLL = "first_frame";
                        Long l = PoiDetailFragment.this.LJLJLLL;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        m3z.LIZ(currentTimeMillis - j);
                        C56178M3a.LIZ(m3z);
                    }
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void fr(PoiListApi.PoiDetailResponse poiDetailResponse, Exception e) {
                    String str5;
                    o.LJIIIZ(e, "e");
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("onPoiDetailFailed, poi name: ");
                    if (poiDetailResponse != null) {
                        str5 = poiDetailResponse.name;
                    } else {
                        str5 = null;
                    }
                    LIZ5.append(str5);
                    X1D.LIZIZ(LIZ5);
                }
            };
            C2K0 LIZ5 = C55096Ljo.LIZ(LIZJ5, PoiDetailInfoRefreshAbility.class, null);
            if (LIZ5 == null) {
                C55096Ljo.LJIIJJI(LIZJ5, poiDetailInfoRefreshAbility, PoiDetailInfoRefreshAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler5 = Proxy.getInvocationHandler(LIZ5);
                    if (invocationHandler5 instanceof EV9) {
                        ((EV9) invocationHandler5).LIZ.add(poiDetailInfoRefreshAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused5) {
                    EV9 ev95 = new EV9();
                    ev95.LIZ.add(poiDetailInfoRefreshAbility);
                    ev95.LIZ.add(LIZ5);
                    Object newProxyInstance5 = Proxy.newProxyInstance(PoiDetailInfoRefreshAbility.class.getClassLoader(), new Class[]{PoiDetailInfoRefreshAbility.class}, ev95);
                    if (newProxyInstance5 != null) {
                        C55096Ljo.LJIIJJI(LIZJ5, (C2K0) newProxyInstance5, PoiDetailInfoRefreshAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility");
                    }
                }
            }
        }
        Integer num = PoiServerConfigSettings.LIZ().regionPoiDiscovery;
        if ((num == null || num.intValue() <= 0) && PoiEnableExperiment.LIZIZ() && LocationServiceImpl.LJIJJ().LIZ() && !C191557fT.LJLLJ && !C190757eB.LIZ.getBoolean("clickAnchorRequestPermission", false)) {
            AwemeHostApplication LIZ6 = FKM.LIZ();
            o.LJI(LIZ6);
            if (!C85256Xd6.LIZIZ(LIZ6)) {
                C190757eB.LIZ.storeBoolean("clickAnchorRequestPermission", true);
                if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps()) {
                    with = TokenCert.Companion.with("bpea-poi_detail_auto_for_precise");
                } else {
                    with = TokenCert.Companion.with("bpea-poi_detail_auto");
                }
                Context context = getContext();
                if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
                    C56179M3b c56179M3b = C56179M3b.LIZ;
                    C190487dk Ol = Ol();
                    if (Ol != null) {
                        str2 = Ol.getEnterMethod();
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str2, "video_anchor")) {
                        str3 = "click_poi_anchor_video";
                    } else {
                        str3 = "click_poi_anchor_comment";
                    }
                    C190487dk Ol2 = Ol();
                    if (Ol2 != null) {
                        str4 = Ol2.getEnterFrom();
                    }
                    c56179M3b.LJIJI("poi", "anchor", with, LJJIFFI, new C85258Xd8("poi_detail", str3, str4, false, 248), new InterfaceC54674Ld0() { // from class: X.7e8
                        @Override // X.InterfaceC54674Ld0
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC54674Ld0
                        public final void LIZIZ(int i, String str5) {
                        }

                        @Override // X.InterfaceC54674Ld0
                        public final void LIZJ(int i) {
                        }
                    }, null);
                }
            }
        }
        C51556KLg.LIZ.getClass();
        C51556KLg.LIZ().LJJJI(EnumC54527Lad.POI_DETAIL, C8TX.FIRST_FRAME, null, null, null);
        C51556KLg.LIZ().LJJIJIIJIL(1, "POI_VIDEO_LIST", true);
    }

    public View Al(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Long l;
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setFitsSystemWindows(false);
        FrameLayout frameLayout2 = new FrameLayout(requireContext());
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout2.setId(R.id.btt);
        frameLayout.addView(frameLayout2);
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        Space space = new Space(requireContext());
        space.setId(R.id.kej);
        linearLayout.addView(space);
        FrameLayout frameLayout3 = new FrameLayout(requireContext());
        frameLayout3.setId(R.id.bul);
        linearLayout.addView(frameLayout3);
        frameLayout.addView(linearLayout);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            Intent intent = mo49getActivity.getIntent();
            if (intent != null) {
                l = Long.valueOf(intent.getLongExtra("page_start_ts", -1L));
            } else {
                l = -1L;
            }
            this.LJLJLLL = l;
            long j = 0;
            if (l != null && l.longValue() > 0) {
                M3Z m3z = new M3Z("poi_detail");
                m3z.LIZLLL = "open_page";
                long currentTimeMillis = System.currentTimeMillis();
                Long l2 = this.LJLJLLL;
                if (l2 != null) {
                    j = l2.longValue();
                }
                m3z.LIZ(currentTimeMillis - j);
                C56178M3a.LIZ(m3z);
            }
        }
        return frameLayout;
    }

    @Override // X.InterfaceC189047bQ
    public void Sc(PoiListApi.PoiDetailResponse poiDetailResponse, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        Integer num;
        Boolean bool;
        String str4;
        int i;
        C190487dk Ol = Ol();
        String str5 = null;
        if (Ol != null) {
            str = Ol.getEnterFrom();
        } else {
            str = null;
        }
        C190487dk Ol2 = Ol();
        if (Ol2 != null) {
            str2 = Ol2.getEnterMethod();
        } else {
            str2 = null;
        }
        PoiAnchorData Ll = Ll();
        C190787eE Ml = Ml();
        C190487dk Ol3 = Ol();
        if (Ol3 != null) {
            str3 = Ol3.getFromPage();
        } else {
            str3 = null;
        }
        C190487dk Ol4 = Ol();
        if (Ol4 != null) {
            num = Ol4.getHasTitle();
        } else {
            num = null;
        }
        int i2 = !PoiEnableExperiment.LIZIZ() ? 1 : 0;
        C190487dk Ol5 = Ol();
        if (Ol5 != null) {
            bool = Boolean.valueOf(Ol5.isAnchorExpand());
        } else {
            bool = null;
        }
        C190487dk Ol6 = Ol();
        if (Ol6 != null) {
            str4 = Ol6.getTrackInfo();
        } else {
            str4 = null;
        }
        boolean z3 = !z2;
        C190487dk Ol7 = Ol();
        if (Ol7 != null) {
            i = Ol7.getFromOtherPoi();
        } else {
            i = 0;
        }
        C190487dk Ol8 = Ol();
        if (Ol8 != null) {
            str5 = Ol8.getPreviousPage();
        }
        C190847eK.LIZIZ(str, str2, Ll, Ml, str3, num, i2, bool, str4, poiDetailResponse, z, z3, i, str5);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, R> R Yl(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C212418Vh.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    public static View Dl(PoiDetailFragment poiDetailFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View Al = poiDetailFragment.Al(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(Al instanceof View)) {
            Al = null;
        }
        if (Al != null) {
            try {
                ViewTreeLifecycleOwner.set(Al, poiDetailFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Al, poiDetailFragment);
                C10A.LIZIZ(Al, poiDetailFragment);
                ActivityC45651qj mo49getActivity = poiDetailFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return Al;
    }

    @Override // X.InterfaceC189137bZ
    public void Dj(String str, String str2, Aweme aweme, PoiListApi.PoiYMALModel poiYMALModel) {
        Object opt;
        Boolean bool;
        C190817eH qh = qh(false, str2, aweme, poiYMALModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    if (C78685UuP.LJJJZ(key) && (opt = jSONObject.opt(key)) != null) {
                        o.LJIIIIZZ(key, "key");
                    }
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        linkedHashMap.putAll(qh.forceToMap());
        if (o.LJ(str2, "ymal_item_click")) {
            String str3 = Pl().LJLJJI;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("ymal_poi_id", str3);
        }
        String str4 = "1";
        if (RBW.LJLLI.LJI()) {
            linkedHashMap.put("is_login", "1");
            bool = (Boolean) Zl(Jl(), C190227dK.LJLIL);
        } else {
            linkedHashMap.put("is_login", CardStruct.IStatusCode.DEFAULT);
            bool = null;
        }
        if (poiYMALModel != null) {
            PoiBasicInfo poiBasicInfo = poiYMALModel.basicInfo;
            if (poiBasicInfo == null || !o.LJ(poiBasicInfo.isCollected, Boolean.TRUE)) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_favourite", str4);
        } else if (bool != null) {
            if (!bool.booleanValue()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_favourite", str4);
        }
        C225248si.LJJIIJ(linkedHashMap);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, VM3 extends AssemViewModel<S3>, S3 extends C33Q, R> R Xl(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C212418Vh.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bb  */
    @Override // X.InterfaceC189137bZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C190817eH qh(boolean r39, java.lang.String r40, com.ss.android.ugc.aweme.feed.model.Aweme r41, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiYMALModel r42) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.PoiDetailFragment.qh(boolean, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiYMALModel):X.7eH");
    }

    @Override // X.C8YM
    public <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC189137bZ
    public void Lg(boolean z, String poiId, String str, String str2, Aweme aweme, PoiListApi.PoiYMALModel poiYMALModel) {
        Object opt;
        o.LJIIIZ(poiId, "poiId");
        C190817eH qh = qh(false, str2, aweme, poiYMALModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    if (C78685UuP.LJJJZ(key) && (opt = jSONObject.opt(key)) != null) {
                        o.LJIIIIZZ(key, "key");
                    }
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        linkedHashMap.putAll(qh.toMap());
        if (o.LJ(str2, "ymal_item_click")) {
            String str3 = Pl().LJLJJI;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("ymal_poi_id", str3);
        }
        Rl(z, linkedHashMap);
    }

    public <S extends C33Q, A, B> InterfaceC222288nw Tl(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LJI(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    public <S extends C33Q, T> InterfaceC222288nw xl(AssemViewModel<S> assemViewModel, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88471Ynr<? super C3C8, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super C3C8, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C212418Vh.LIZ(this, assemViewModel, tbw, c56412MCa, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
