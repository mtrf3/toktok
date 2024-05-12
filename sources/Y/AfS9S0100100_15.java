package Y;

import X.C188447aS;
import X.C43001GuD;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56178M3a;
import X.C58224MtA;
import X.C73411SrX;
import X.C78963Uyt;
import X.C86335XuV;
import X.C86343Xud;
import X.C86393XvR;
import X.FMX;
import X.InterfaceC64592gB;
import X.JF1;
import X.M3Z;
import X.ORZ;
import X.X1D;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDetailDiscoveryViewModel;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS181S0100000_15;

/* loaded from: classes16.dex */
public class AfS9S0100100_15 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS9S0100100_15 afS9S0100100_15, Object obj) {
        long j;
        ((LivePreviewGuideEnterVM) afS9S0100100_15.l0).iv0(afS9S0100100_15.j1, "join_live_show");
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) afS9S0100100_15.l0;
        C86343Xud hv0 = livePreviewGuideEnterVM.hv0();
        if (hv0 != null) {
            if (livePreviewGuideEnterVM.gv0(false)) {
                livePreviewGuideEnterVM.jv0("ad");
            } else {
                LiveRoomStruct liveRoomStruct = hv0.LIZIZ;
                if (liveRoomStruct != null) {
                    C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
                    if (C78963Uyt.LJIIIIZZ(hv0)) {
                        j = 3;
                    } else {
                        j = 1;
                    }
                    livePreviewGuideEnterVM.LJLJLLL = LJJIJIL.LJLLLL(false, j, liveRoomStruct.id, new C86335XuV(livePreviewGuideEnterVM, liveRoomStruct));
                }
            }
        }
        C73411SrX c73411SrX = ((LivePreviewGuideEnterVM) afS9S0100100_15.l0).LJLJLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        ((LivePreviewGuideEnterVM) afS9S0100100_15.l0).LJLJLJ = null;
    }

    public static final void accept$1(AfS9S0100100_15 afS9S0100100_15, Object obj) {
        String str;
        int i;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String str2;
        Context context;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        PoiDiscoveryApi.PoiCategory poiCategory;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility2;
        PoiDiscoveryApi.PoiCategory poiCategory2;
        PoiDiscoveryApi.PoiDiscoveryCardListResponse poiDiscoveryCardListResponse = (PoiDiscoveryApi.PoiDiscoveryCardListResponse) obj;
        if (poiDiscoveryCardListResponse != null && poiDiscoveryCardListResponse.status_code == 0) {
            ArrayList arrayList = new ArrayList();
            List<PoiDiscoveryApi.PoiCategory> list = poiDiscoveryCardListResponse.poiCategoryList;
            if (list != null) {
                List LJLL = ORZ.LJLL(list);
                PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel = (PoiDetailDiscoveryViewModel) afS9S0100100_15.l0;
                Iterator it = ((ArrayList) LJLL).iterator();
                while (it.hasNext()) {
                    arrayList.add(PoiDiscoveryApi.PoiCategory.LIZ((PoiDiscoveryApi.PoiCategory) it.next(), null, 0, 0, poiDetailDiscoveryViewModel.LJLJJL, 31));
                }
            }
            PoiDiscoveryApi.PoiDiscoveryCardListResponse poiDiscoveryCardListResponse2 = new PoiDiscoveryApi.PoiDiscoveryCardListResponse(arrayList, poiDiscoveryCardListResponse.poiList, poiDiscoveryCardListResponse.dynamicMapWindow, poiDiscoveryCardListResponse.inPoiRegion, poiDiscoveryCardListResponse.currentTabCode);
            List<PoiDiscoveryApi.PoiCategory> list2 = poiDiscoveryCardListResponse2.poiCategoryList;
            String str7 = null;
            if (list2 != null && (poiCategory2 = (PoiDiscoveryApi.PoiCategory) ORZ.LJLLLL(list2)) != null) {
                str = poiCategory2.tabCode;
            } else {
                str = null;
            }
            List<PoiDiscoveryApi.PoiDiscoveryCard> list3 = poiDiscoveryCardListResponse2.poiList;
            if (str != null && list3 != null && !list3.isEmpty()) {
                C58224MtA.LIZ.put(str, list3);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DiscoveryFirstLoadDataCache - onDataLoaded - put - code:");
                LIZ.append(str);
                LIZ.append(", list:");
                LIZ.append(list3);
                C188447aS.LIZ(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("module vm - update state. origin:");
            PoiDiscoveryApi.PoiDiscoveryCardListResponse poiDiscoveryCardListResponse3 = ((PoiDetailDiscoveryViewModel) afS9S0100100_15.l0).getState().LJLIL;
            if (poiDiscoveryCardListResponse3 != null) {
                i = poiDiscoveryCardListResponse3.hashCode();
            } else {
                i = 0;
            }
            LIZ2.append(i);
            LIZ2.append(", new:");
            LIZ2.append(poiDiscoveryCardListResponse2.hashCode());
            C188447aS.LIZ(X1D.LIZIZ(LIZ2));
            PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel2 = (PoiDetailDiscoveryViewModel) afS9S0100100_15.l0;
            poiDetailDiscoveryViewModel2.LJLJJL = false;
            poiDetailDiscoveryViewModel2.withState(new AqS146S0200000_15(poiDetailDiscoveryViewModel2, poiDiscoveryCardListResponse2, 22));
            PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel3 = (PoiDetailDiscoveryViewModel) afS9S0100100_15.l0;
            poiDetailDiscoveryViewModel3.getClass();
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            Fragment fragment = poiDetailDiscoveryViewModel3.LJLJI;
            if (fragment != null && (iPoiDetailInfoVAbility2 = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IPoiDetailInfoVAbility.class, null)) != null) {
                poiDetailResponse = iPoiDetailInfoVAbility2.EO();
            } else {
                poiDetailResponse = null;
            }
            List<PoiDiscoveryApi.PoiCategory> list4 = poiDiscoveryCardListResponse2.poiCategoryList;
            if (list4 != null && (poiCategory = (PoiDiscoveryApi.PoiCategory) ORZ.LJLLLL(list4)) != null) {
                str2 = poiCategory.tabCode;
            } else {
                str2 = null;
            }
            String str8 = "";
            if (str2 == null) {
                str2 = "";
            }
            String LJJ = C43001GuD.LJJ(Boolean.valueOf(LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION")));
            if (LJJ == null) {
                LJJ = "";
            }
            Fragment fragment2 = poiDetailDiscoveryViewModel3.LJLJI;
            if (fragment2 != null && (context = fragment2.getContext()) != null) {
                String LJJ2 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isSystemPrecise(context)));
                if (LJJ2 == null) {
                    LJJ2 = "";
                }
                String LJJ3 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isInAppPrecise()));
                if (LJJ3 == null) {
                    LJJ3 = "";
                }
                List<PoiDiscoveryApi.PoiCategory> list5 = poiDiscoveryCardListResponse2.poiCategoryList;
                if (list5 != null) {
                    i2 = list5.size();
                } else {
                    i2 = 0;
                }
                Fragment fragment3 = poiDetailDiscoveryViewModel3.LJLJI;
                if (fragment3 == null || (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment3, null), IPoiDetailInfoVAbility.class, null)) == null || (str3 = iPoiDetailInfoVAbility.G20()) == null) {
                    str3 = "";
                }
                if (poiDetailResponse == null || (str4 = poiDetailResponse.cityCode) == null) {
                    str4 = "";
                }
                if (poiDetailResponse == null || (str5 = poiDetailResponse.LJIIJJI()) == null) {
                    str5 = "";
                }
                if (poiDetailResponse == null || (str6 = poiDetailResponse.regionCode) == null) {
                    str6 = "";
                }
                if (poiDetailResponse != null) {
                    bool = Boolean.valueOf(poiDetailResponse.LJIIIIZZ());
                } else {
                    bool = null;
                }
                String LJJ4 = C43001GuD.LJJ(bool);
                if (LJJ4 != null) {
                    str8 = LJJ4;
                }
                if (poiDetailResponse != null) {
                    str7 = poiDetailResponse.collectInfo;
                }
                LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", "poi_detail", "tab_code", str2);
                LIZIZ.put("enable_location", LJJ);
                LIZIZ.put("system_is_precise", LJJ2);
                LIZIZ.put("inapp_is_precise", LJJ3);
                LIZIZ.put("index", String.valueOf(0));
                LIZIZ.put("total_tab_cnt", String.valueOf(i2));
                LIZIZ.put("poi_id", str3);
                LIZIZ.put("poi_city", str4);
                LIZIZ.put("poi_detail_type", str5);
                LIZIZ.put("poi_region_code", str6);
                LIZIZ.put("is_claimed", str8);
                C43001GuD.LIZJ(str7, LIZIZ);
                FMX.LJIIL("discovery_module_show", LIZIZ);
            }
            M3Z m3z = new M3Z("poi_detail");
            m3z.LIZLLL = "network_data_parse";
            m3z.LIZ(System.currentTimeMillis() - afS9S0100100_15.j1);
            m3z.LIZIZ(6L);
            C56178M3a.LIZ(m3z);
            return;
        }
        PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel4 = (PoiDetailDiscoveryViewModel) afS9S0100100_15.l0;
        poiDetailDiscoveryViewModel4.getClass();
        poiDetailDiscoveryViewModel4.withState(new AqS181S0100000_15(poiDetailDiscoveryViewModel4, 220));
    }

    public AfS9S0100100_15(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
