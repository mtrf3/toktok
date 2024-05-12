package com.ss.android.ugc.aweme.poi.detail.discovery;

import X.C16950lX;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C43001GuD;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C84848XRs;
import X.C85049XZl;
import X.C85235Xcl;
import X.C85452XgG;
import X.C85453XgH;
import X.C85477Xgf;
import X.C85478Xgg;
import X.C85479Xgh;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.FMX;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.JF1;
import X.KOZ;
import X.ORZ;
import X.YE1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.category.PoiDetailDiscoveryCategoryAssem;
import com.ss.android.ugc.aweme.poi.detail.discovery.video.FocusingPageUpdateAbility;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PoiDetailDiscoveryCategoryPage extends AssemPowerCell<PoiDetailDiscoveryCategoryAssem, PoiDiscoveryApi.PoiCategory> implements KOZ {
    public final C214298b3 LJLJL;
    public final C62822Ol8 LJLJLJ;

    @Override // X.KOZ
    public final void k2() {
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final PoiDetailDiscoveryCategoryAssem L() {
        return new PoiDetailDiscoveryCategoryAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return (InterfaceC55235Lm3) this.LJLJLJ.getValue();
    }

    public PoiDetailDiscoveryCategoryPage() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailDiscoveryViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 524);
        C85235Xcl c85235Xcl = C85235Xcl.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85478Xgg.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 525), new AqS165S0100000_15((InterfaceC93923mO) this, 526), C85453XgH.INSTANCE, c85235Xcl, new AqS165S0100000_15((InterfaceC93923mO) this, 527), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85479Xgh.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 528), new AqS165S0100000_15((InterfaceC93923mO) this, 519), C85452XgG.INSTANCE, c85235Xcl, new AqS165S0100000_15((InterfaceC93923mO) this, 520), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85477Xgf.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 521), new AqS165S0100000_15((InterfaceC93923mO) this, 522), new AqS165S0100000_15((InterfaceC93923mO) this, 523), c85235Xcl, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJL = c214298b3;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 518));
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        PoiDetailDiscoveryCategoryAssem poiDetailDiscoveryCategoryAssem = new PoiDetailDiscoveryCategoryAssem();
        View LIZ = C16950lX.LIZ(parent.getContext(), R.layout.bzs, parent, false, -1);
        o.LJIIIIZZ(LIZ, "getView(parent.context, …ayoutId(), parent, false)");
        this.LJLIL = LIZ;
        M(poiDetailDiscoveryCategoryAssem, getContainerView(), this);
        return getContainerView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.KOZ
    public final void onPageSelected(int i) {
        String str;
        int i2;
        String str2;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String str3;
        int i3;
        String str4;
        String str5;
        String str6;
        String str7;
        Boolean bool;
        FocusingPageUpdateAbility focusingPageUpdateAbility;
        String str8;
        List<PoiDiscoveryApi.PoiCategory> list;
        String str9;
        PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel = (PoiDetailDiscoveryViewModel) this.LJLJL.getValue();
        PoiDiscoveryApi.PoiCategory poiCategory = (PoiDiscoveryApi.PoiCategory) getItem();
        String str10 = null;
        if (poiCategory != null) {
            str = poiCategory.tabCode;
        } else {
            str = null;
        }
        poiDetailDiscoveryViewModel.LJLILLLLZI = str;
        PoiDiscoveryApi.PoiDiscoveryCardListResponse poiDiscoveryCardListResponse = ((C84848XRs) ((AssemViewModel) this.LJLJL.getValue()).getState()).LJLIL;
        int i4 = 0;
        if (poiDiscoveryCardListResponse != null && (list = poiDiscoveryCardListResponse.poiCategoryList) != null) {
            Iterator it = ((ArrayList) ORZ.LJLL(list)).iterator();
            int i5 = 0;
            i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    PoiDiscoveryApi.PoiCategory poiCategory2 = (PoiDiscoveryApi.PoiCategory) next;
                    PoiDiscoveryApi.PoiCategory poiCategory3 = (PoiDiscoveryApi.PoiCategory) getItem();
                    if (poiCategory3 != null) {
                        str9 = poiCategory3.tabCode;
                    } else {
                        str9 = null;
                    }
                    if (o.LJ(str9, poiCategory2.tabCode)) {
                        i2 = i5;
                    }
                    i5 = i6;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else {
            i2 = 0;
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (focusingPageUpdateAbility = (FocusingPageUpdateAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), FocusingPageUpdateAbility.class, null)) != null) {
            PoiDiscoveryApi.PoiCategory poiCategory4 = (PoiDiscoveryApi.PoiCategory) getItem();
            if (poiCategory4 != null) {
                str8 = poiCategory4.tabCode;
            } else {
                str8 = null;
            }
            focusingPageUpdateAbility.mh(i2, str8, C85049XZl.LIZLLL);
        }
        PoiDiscoveryApi.PoiCategory poiCategory5 = (PoiDiscoveryApi.PoiCategory) getItem();
        if (poiCategory5 != null) {
            str2 = poiCategory5.tabCode;
        } else {
            str2 = null;
        }
        C85049XZl.LIZLLL = str2;
        getItem();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), IPoiDetailInfoVAbility.class, null);
        if (iPoiDetailInfoVAbility != null) {
            poiDetailResponse = iPoiDetailInfoVAbility.EO();
        } else {
            poiDetailResponse = null;
        }
        PoiDiscoveryApi.PoiCategory poiCategory6 = (PoiDiscoveryApi.PoiCategory) getItem();
        if (poiCategory6 != null) {
            str3 = poiCategory6.tabCode;
        } else {
            str3 = null;
        }
        String str11 = "";
        if (str3 == null) {
            str3 = "";
        }
        String LJJ = C43001GuD.LJJ(Boolean.valueOf(LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION")));
        if (LJJ == null) {
            LJJ = "";
        }
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        String LJJ2 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isSystemPrecise(context)));
        if (LJJ2 == null) {
            LJJ2 = "";
        }
        String LJJ3 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isInAppPrecise()));
        if (LJJ3 == null) {
            LJJ3 = "";
        }
        PoiDiscoveryApi.PoiCategory poiCategory7 = (PoiDiscoveryApi.PoiCategory) getItem();
        if (poiCategory7 != null) {
            i3 = poiCategory7.LJLILLLLZI;
        } else {
            i3 = 0;
        }
        PoiDiscoveryApi.PoiCategory poiCategory8 = (PoiDiscoveryApi.PoiCategory) getItem();
        if (poiCategory8 != null) {
            i4 = poiCategory8.LJLJI;
        }
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility2 = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), IPoiDetailInfoVAbility.class, null);
        if (iPoiDetailInfoVAbility2 == null || (str4 = iPoiDetailInfoVAbility2.G20()) == null) {
            str4 = "";
        }
        if (poiDetailResponse == null || (str5 = poiDetailResponse.cityCode) == null) {
            str5 = "";
        }
        if (poiDetailResponse == null || (str6 = poiDetailResponse.LJIIJJI()) == null) {
            str6 = "";
        }
        if (poiDetailResponse == null || (str7 = poiDetailResponse.regionCode) == null) {
            str7 = "";
        }
        if (poiDetailResponse != null) {
            bool = Boolean.valueOf(poiDetailResponse.LJIIIIZZ());
        } else {
            bool = null;
        }
        String LJJ4 = C43001GuD.LJJ(bool);
        if (LJJ4 != null) {
            str11 = LJJ4;
        }
        if (poiDetailResponse != null) {
            str10 = poiDetailResponse.collectInfo;
        }
        LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", "poi_detail", "tab_code", str3);
        LIZIZ.put("enable_location", LJJ);
        LIZIZ.put("system_is_precise", LJJ2);
        LIZIZ.put("inapp_is_precise", LJJ3);
        LIZIZ.put("index", String.valueOf(i3));
        LIZIZ.put("total_tab_cnt", String.valueOf(i4));
        LIZIZ.put("poi_id", str4);
        LIZIZ.put("poi_city", str5);
        LIZIZ.put("poi_detail_type", str6);
        LIZIZ.put("poi_region_code", str7);
        LIZIZ.put("is_claimed", str11);
        C43001GuD.LIZJ(str10, LIZIZ);
        FMX.LJIIL("poi_card_list_show", LIZIZ);
    }
}
