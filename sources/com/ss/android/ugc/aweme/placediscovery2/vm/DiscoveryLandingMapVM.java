package com.ss.android.ugc.aweme.placediscovery2.vm;

import X.C0M6;
import X.C16880lQ;
import X.C191707fi;
import X.C214188as;
import X.C44195HWd;
import X.C51556KLg;
import X.C53748L7o;
import X.C54649Lcb;
import X.C54878LgI;
import X.C56156M2e;
import X.C56174M2w;
import X.C56175M2x;
import X.C56176M2y;
import X.C56179M3b;
import X.C78404Ups;
import X.C78613UtF;
import X.C8DU;
import X.EF7;
import X.EnumC56160M2i;
import X.FKM;
import X.InterfaceC56168M2q;
import X.M26;
import X.M35;
import X.M36;
import X.M38;
import X.M3G;
import X.M3S;
import X.M3Z;
import X.XI8;
import X.XKQ;
import X.XKX;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.placediscovery.param.PoiDiscoveryLandingPageParams;
import com.ss.android.ugc.aweme.placediscovery2.js.JSEventCenter;
import com.ss.android.ugc.aweme.placediscovery2.map.premisson.PermissionChangeObserver;
import com.ss.android.ugc.aweme.placediscovery2.model.DiscoverMapResponse;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class DiscoveryLandingMapVM extends AssemViewModel<M38> {
    public M26 LJLIL;
    public PoiDiscoveryLandingPageParams LJLILLLLZI;
    public boolean LJLJJI;
    public M36<C191707fi> LJLJJL;
    public MapBounds LJLJJLL;
    public Integer LJLJLJ;
    public InterfaceC56168M2q LJLJLLL;
    public final JSEventCenter LJLLI;
    public C8DU LJLLILLLL;
    public boolean LJLLJ;
    public volatile String LJLLL;
    public final C56175M2x LJLLLL;
    public final C0M6<String, Map<MapBounds, DiscoverMapResponse>> LJLLLLLL;
    public final long LJLZ;
    public final C44195HWd LJZ;
    public final XI8 LJZI;
    public XKQ LJZL;
    public final M35 LL;
    public C56174M2w LLD;
    public final PermissionChangeObserver LLF;
    public long LLFF;
    public long LLFFF;
    public long LLFII;
    public long LLFZ;
    public long LLI;
    public boolean LLIFFJFJJ;
    public C53748L7o LJLJI = new C53748L7o(null, null);
    public final M3S LJLJL = new M3S();
    public final C214188as LJLL = C78404Ups.LIZJ(this, C54878LgI.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final M38 defaultState() {
        return new M38(0);
    }

    public final void iv0() {
        String str;
        String str2;
        String tabRegionName;
        M26 m26 = this.LJLIL;
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
        M26 m262 = this.LJLIL;
        if (m262 != null) {
            map = m262.getExtraParams();
        }
        String str4 = this.LJLLL;
        if (str4 == null) {
            str4 = "";
        }
        PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams = this.LJLILLLLZI;
        if (poiDiscoveryLandingPageParams == null || (str2 = poiDiscoveryLandingPageParams.getTabRegion()) == null) {
            str2 = "";
        }
        PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams2 = this.LJLILLLLZI;
        if (poiDiscoveryLandingPageParams2 != null && (tabRegionName = poiDiscoveryLandingPageParams2.getTabRegionName()) != null) {
            str3 = tabRegionName;
        }
        C54649Lcb.LIZIZ(str, map, str4, str2, str3, C56179M3b.LIZ.LJIILLIIL(0, FKM.LIZ()), C56156M2e.LIZ(), ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise(), EnumC56160M2i.CLICK_POI);
    }

    public DiscoveryLandingMapVM() {
        JSEventCenter jSEventCenter = new JSEventCenter();
        this.LJLLI = jSEventCenter;
        C56175M2x c56175M2x = new C56175M2x();
        this.LJLLLL = c56175M2x;
        this.LJLLLLLL = new C0M6<>(10);
        this.LJLZ = System.currentTimeMillis();
        this.LJZ = new C44195HWd();
        this.LJZI = new XI8(C16880lQ.LLLLZLLIL());
        this.LL = new M35();
        this.LLF = new PermissionChangeObserver(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).locationPermissions(), new AqS159S0100000_9(this, 494));
        jSEventCenter.LIZ("poiDiscoveryMarkerSelected", new AqS175S0100000_9(this, 177));
        jSEventCenter.LIZ("poiDiscoveryCategoryChanged", new AqS175S0100000_9(this, 178));
        jSEventCenter.LIZ("poiDiscoveryRetry", new AqS175S0100000_9(this, 179));
        c56175M2x.LIZJ = this;
        this.LLIFFJFJJ = true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        getLifecycle().addObserver(this.LLF);
        JSEventCenter jSEventCenter = this.LJLLI;
        Lifecycle lifecycle = getLifecycle();
        jSEventCenter.getClass();
        o.LJIIIZ(lifecycle, "lifecycle");
        lifecycle.addObserver(jSEventCenter);
    }

    public final XKQ gv0(C56174M2w c56174M2w) {
        this.LJLLJ = false;
        setState(M3G.LJLIL);
        return XKX.LIZLLL(getAssemVMScope(), C78613UtF.LIZJ, null, new C56176M2y(this, c56174M2w, null), 2);
    }

    public final void hv0(String str) {
        String str2;
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://poi/detail");
        buildRoute.withParam("poi_id", str);
        buildRoute.withParam("enter_from", "places_discover");
        M26 m26 = this.LJLIL;
        if (m26 != null) {
            str2 = m26.getPreviousPage();
        } else {
            str2 = null;
        }
        buildRoute.withParam("previous_page", str2);
        buildRoute.withParam("enter_method", "click_poi_markers");
        buildRoute.withParam("poi_data", new PoiAnchorData(str, null, null, null, null, null, null, null, null, null, null, null, 4094, null));
        buildRoute.open();
    }

    public final void jv0(DiscoverMapResponse discoverMapResponse) {
        int i;
        JSEventCenter jSEventCenter = this.LJLLI;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), discoverMapResponse));
        if (discoverMapResponse == null) {
            i = 0;
        } else {
            i = 1;
        }
        jSONObject.put("code", i);
        jSEventCenter.getClass();
        JSEventCenter.LIZIZ("poiDiscoverySetListData", jSONObject);
    }

    public final void kv0(boolean z) {
        long j;
        M3Z m3z = new M3Z("places_discover");
        m3z.LIZLLL = "locate_position";
        m3z.LIZ(System.currentTimeMillis() - this.LLFF);
        if (z) {
            j = 1;
        } else {
            j = 2;
        }
        m3z.LIZIZ(j);
        lv0(m3z);
    }

    public final void lv0(M3Z m3z) {
        String str;
        M3S m3s = this.LJLJL;
        m3s.getClass();
        Iterator it = ((Set) m3s.LIZ).iterator();
        while (true) {
            Long l = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            M3Z m3z2 = (M3Z) next;
            if (m3z2 != null) {
                str = m3z2.LIZLLL;
            } else {
                str = null;
            }
            if (o.LJ(str, m3z.LIZLLL)) {
                if (m3z2 != null) {
                    l = m3z2.LIZJ;
                }
                if (o.LJ(l, m3z.LIZJ)) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        C51556KLg.LIZ.getClass();
        C51556KLg.LIZ().LJJLIIIJ(m3z);
        ((Set) m3s.LIZ).add(m3z);
    }
}
