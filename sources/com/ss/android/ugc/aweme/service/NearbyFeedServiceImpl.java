package com.ss.android.ugc.aweme.service;

import X.AbstractC53764L8e;
import X.AbstractC60811Ntn;
import X.ActivityC45651qj;
import X.C00F;
import X.C113554cx;
import X.C116694i1;
import X.C191457fJ;
import X.C222588oQ;
import X.C40060Fns;
import X.C40343FsR;
import X.C45804HyK;
import X.C45806HyM;
import X.C48795JDb;
import X.C48841JEv;
import X.C51556KLg;
import X.C53961LFt;
import X.C54036LIq;
import X.C54496La8;
import X.C54644LcW;
import X.C54646LcY;
import X.C54648Lca;
import X.C54649Lcb;
import X.C54849Lfp;
import X.C54850Lfq;
import X.C58096Mr6;
import X.C78613UtF;
import X.C78685UuP;
import X.EE1;
import X.EF7;
import X.EnumC54647LcZ;
import X.FFL;
import X.InterfaceC209388Jq;
import X.InterfaceC36571c5;
import X.InterfaceC54049LJd;
import X.InterfaceC54054LJi;
import X.InterfaceC54498LaA;
import X.InterfaceC55058LjC;
import X.LJ1;
import X.LJ5;
import X.LJ6;
import X.LJA;
import X.LQA;
import X.LTU;
import X.M26;
import X.M2K;
import X.OHI;
import X.OKG;
import X.WM7;
import X.XKX;
import X.Z9N;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.placediscovery.param.PoiDiscoveryLandingPageParams;
import com.ss.android.ugc.aweme.poi.map.service.GoogleMapServiceImpl;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.settings.FriendsTabTopExperimentWhenNearbyInBottom;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.task.InitNearbyTask;
import com.ss.android.ugc.aweme.ui.FeedNearbyFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import defpackage.t1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class NearbyFeedServiceImpl implements INearbyFeedService {
    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LIZLLL(boolean z) {
    }

    public static INearbyFeedService LJJI() {
        Object LIZ = C58096Mr6.LIZ(INearbyFeedService.class, false);
        if (LIZ != null) {
            return (INearbyFeedService) LIZ;
        }
        if (C58096Mr6.Y4 == null) {
            synchronized (INearbyFeedService.class) {
                if (C58096Mr6.Y4 == null) {
                    C58096Mr6.Y4 = new NearbyFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.Y4;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJI() {
        if (LQA.LIZIZ.LJIJI() && NearbyTabConfig.LIZIZ().showBottomTab) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final Integer LJIILIIL() {
        FriendsTabTopExperimentWhenNearbyInBottom.LIZ.getClass();
        FFL LJIIIZ = FFL.LJIIIZ();
        FriendsTabTopExperimentWhenNearbyInBottom.NearbyFriendsTabTopConfig nearbyFriendsTabTopConfig = FriendsTabTopExperimentWhenNearbyInBottom.LIZIZ;
        LJIIIZ.getClass();
        FriendsTabTopExperimentWhenNearbyInBottom.NearbyFriendsTabTopConfig nearbyFriendsTabTopConfig2 = (FriendsTabTopExperimentWhenNearbyInBottom.NearbyFriendsTabTopConfig) FFL.LJIJ(true, "nearby_tt_friends_top_tab_experiment", 31744, FriendsTabTopExperimentWhenNearbyInBottom.NearbyFriendsTabTopConfig.class, nearbyFriendsTabTopConfig);
        if (nearbyFriendsTabTopConfig2 != null) {
            return Integer.valueOf(nearbyFriendsTabTopConfig2.indexOnTop);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final EE1 LJIIZILJ() {
        if (C00F.LIZ(31744, 0, "nearby_feed_preload_exp", false) == 1) {
            return new InitNearbyTask();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final InterfaceC54049LJd LJIJ() {
        return (C54036LIq) C54036LIq.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final AbstractC53764L8e LJIJJLI() {
        return new C53961LFt();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r1 == 0) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C54039LIt LJJ() {
        /*
            r12 = this;
            X.LIt r5 = new X.LIt
            com.ss.android.ugc.aweme.settings.NearbyTabConfig$Config r0 = com.ss.android.ugc.aweme.settings.NearbyTabConfig.LIZIZ()
            boolean r4 = r0.nearbyToggleControlEnable
            android.app.Activity r1 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            java.lang.String r6 = ""
            if (r1 != 0) goto L85
            r3 = r6
        L11:
            android.app.Activity r9 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            if (r9 != 0) goto L1b
        L17:
            r5.<init>(r6, r3, r4)
            return r5
        L1b:
            kotlin.jvm.internal.AqS153S0100000_3 r8 = new kotlin.jvm.internal.AqS153S0100000_3
            r0 = 1722(0x6ba, float:2.413E-42)
            r8.<init>(r9, r0)
            com.ss.android.ugc.aweme.settings.NearbyTabConfig$Config r0 = com.ss.android.ugc.aweme.settings.NearbyTabConfig.LIZIZ()
            java.lang.String r7 = r0.learnMoreUrlIntro
            r11 = 1
            r10 = 0
            if (r7 == 0) goto L32
            int r0 = r7.length()
            if (r0 != 0) goto L83
        L32:
            r0 = 1
        L33:
            r2 = 0
            if (r0 == 0) goto L56
        L36:
            com.ss.android.ugc.aweme.settings.NearbyTabConfig$Config r0 = com.ss.android.ugc.aweme.settings.NearbyTabConfig.LIZIZ()
            java.lang.String r1 = r0.nearbyPrivacyVisibilityToggleText
            if (r1 == 0) goto L17
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            if (r2 == 0) goto L53
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r2)
        L51:
            r6 = r1
            goto L17
        L53:
            if (r1 != 0) goto L51
            goto L17
        L56:
            X.SPy r2 = new X.SPy
            r2.<init>()
            r0 = 2131842206(0x7f11549e, float:1.9317742E38)
            java.lang.String r1 = r9.getString(r0)
            java.lang.String r0 = "context.getString(R.stri…ity_entrypoint_learnmore)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.LIZIZ = r1
            r0 = 42
            r2.LIZIZ(r0)
            r2.LIZ = r10
            r2.LJ(r11)
            r2.LJ = r11
            kotlin.jvm.internal.AqS58S1200000_3 r1 = new kotlin.jvm.internal.AqS58S1200000_3
            r0 = 15
            r1.<init>(r9, r7, r8, r0)
            r2.LJFF = r1
            java.lang.CharSequence r2 = r2.LIZ(r9)
            goto L36
        L83:
            r0 = 0
            goto L33
        L85:
            r0 = 2131842209(0x7f1154a1, float:1.9317748E38)
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r0 = "context.getString(R.stri…bility_title_postsnearby)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl.LJJ():X.LIt");
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final int LIZ() {
        Context LIZIZ = EF7.LIZIZ();
        OHI.LIZ.getClass();
        return OHI.LJ(LIZIZ, "android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LIZJ() {
        ActivityC45651qj LJJIFFI;
        boolean z;
        InterfaceC54054LJi interfaceC54054LJi;
        if (!LJIJI()) {
            return false;
        }
        Activity[] activityStack = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activityStack, "getActivityStack()");
        int length = activityStack.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Activity activity = activityStack[i];
            if (activity instanceof InterfaceC55058LjC) {
                if (activity == null || (LJJIFFI = C45804HyK.LJJIFFI(activity)) == null) {
                    return false;
                }
                String nv0 = C116694i1.LIZ(LJJIFFI).nv0();
                InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(LJJIFFI).Ja("HOME");
                if ((Ja instanceof InterfaceC54054LJi) && (interfaceC54054LJi = (InterfaceC54054LJi) Ja) != null) {
                    z = interfaceC54054LJi.oc();
                } else {
                    z = false;
                }
                if (LJI()) {
                    return o.LJ(nv0, "Nearby");
                }
                if (!o.LJ(nv0, "HOME") || !z) {
                    return false;
                }
                return true;
            }
            i++;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIIL() {
        return NearbyTabConfig.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LJIILL() {
        RoamingLocationInfo LIZ = LJ6.LIZ();
        if (LIZ != null && LIZ.isManual()) {
            LJ6.LIZ.storeLong(LJ6.LIZJ("nearby_manually_selected_region_time"), System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIJI() {
        if (NearbyTabConfig.LIZIZ().showTab && t1.LJI()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final HashMap<String, String> LJIL() {
        HashMap<String, String> hashMap;
        ActivityC45651qj LJJIFFI;
        String str;
        Activity[] activities = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activities, "activities");
        int length = activities.length;
        boolean z = false;
        int i = 0;
        while (true) {
            hashMap = null;
            if (i >= length) {
                break;
            }
            Activity activity = activities[i];
            if (activity instanceof InterfaceC55058LjC) {
                if (activity != null && (LJJIFFI = C45804HyK.LJJIFFI(activity)) != null) {
                    RoamingLocationInfo LIZIZ = LJ5.LIZIZ(LJJIFFI);
                    hashMap = new HashMap<>();
                    LJ1 LJII = LJ5.LJII(LJJIFFI);
                    if (LJII != null) {
                        z = LJII.LJLJLLL;
                    }
                    String str2 = CardStruct.IStatusCode.DEFAULT;
                    if (z) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap.put("is_city_name", str);
                    if (LIZIZ != null) {
                        String manualRegion = LIZIZ.getManualRegion();
                        if (manualRegion != null) {
                            hashMap.put("city_id", manualRegion);
                        }
                        String manualRegionName = LIZIZ.getManualRegionName();
                        if (manualRegionName != null) {
                            hashMap.put("city_name", manualRegionName);
                        }
                        if (!LIZIZ.isManual()) {
                            str2 = "1";
                        }
                        hashMap.put("is_positioning", str2);
                    }
                    hashMap.put("is_top_tab", "1");
                }
            } else {
                i++;
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final InterfaceC54498LaA LJIIJJI() {
        return C54496La8.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIILJJIL() {
        return LTU.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJ(Fragment fragment) {
        return fragment instanceof FeedNearbyFragment;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJFF(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return LJ5.LJIIIIZZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final View LJIIIIZZ(Context context) {
        o.LJIIIZ(context, "context");
        return new C54849Lfp(context);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final Object LJIIIZ(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            return new C54850Lfq((C222588oQ) params);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LJIIJ(Aweme aweme) {
        String aid;
        if (aweme == null || (aid = aweme.getAid()) == null || aid.length() == 0 || o.LJ(aid, LJA.LIZJ)) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C48795JDb(aweme, aid, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final Map<String, String> LJIILLIIL(String str) {
        if (!o.LJ(str, "places_discover")) {
            return C113554cx.LJJJLIIL();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> LLIZLLLIL = Z9N.LIZIZ.LLIZLLLIL();
        if (!LLIZLLLIL.isEmpty()) {
            linkedHashMap.putAll(LLIZLLLIL);
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LJIJJ(Map<String, String> params) {
        o.LJIIIZ(params, "params");
        if (LJA.LIZIZ.get()) {
            Map<String, String> map = LJA.LIZ;
            ((HashMap) params).putAll(map);
            ((LinkedHashMap) map).clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LIZIZ(Context context, PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams, M26 m26) {
        boolean z;
        PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams2;
        int i = 0;
        if (poiDiscoveryLandingPageParams.getDiscoveryScenario() != EnumC54647LcZ.SCENE_NEARBY_TAB || C00F.LIZ(31744, 0, "nearby_place_discovery_phase", true) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!GoogleMapServiceImpl.LJFF().LIZLLL()) {
            z = false;
        }
        if (!GoogleMapServiceImpl.LJFF().LIZJ()) {
            int i2 = C54646LcY.LIZ[poiDiscoveryLandingPageParams.getDiscoveryScenario().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    C51556KLg.LIZ.getClass();
                    C191457fJ.LIZ(C51556KLg.LIZ(), "detail_landing_discovery_map", false, 6);
                }
            } else {
                C51556KLg.LIZ.getClass();
                C191457fJ.LIZ(C51556KLg.LIZ(), "nearby_discovery_map", false, 6);
            }
        } else if (z) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//nearby/discovery/map");
            buildRoute.withParam("poi_category_data", new C54644LcW(poiDiscoveryLandingPageParams));
            buildRoute.withParam("mob_params", m26);
            buildRoute.open();
            C54649Lcb.LIZ(2);
            return;
        }
        if (C78685UuP.LJJJZ(poiDiscoveryLandingPageParams.getTabSchema())) {
            SmartRouter.buildRoute(context, poiDiscoveryLandingPageParams.getTabSchema()).open();
        } else {
            if (poiDiscoveryLandingPageParams.getDiscoveryScenario() == EnumC54647LcZ.SCENE_DETAIL_REGIONAL_POI) {
                poiDiscoveryLandingPageParams2 = PoiDiscoveryLandingPageParams.copy$default(poiDiscoveryLandingPageParams, poiDiscoveryLandingPageParams.getRegionName(), null, null, null, null, null, null, null, null, null, 1022, null);
            } else {
                poiDiscoveryLandingPageParams2 = poiDiscoveryLandingPageParams;
            }
            SparkContext sparkContext = new SparkContext();
            C51556KLg.LIZ.getClass();
            String LJIJJLI = C51556KLg.LIZ().LJIJJLI("poi_discover");
            if (LJIJJLI == null) {
                LJIJJLI = "";
            }
            sparkContext.LJJIJLIJ(LJIJJLI);
            PermissionCache.LJLIL.getClass();
            sparkContext.LJJIIJZLJL("enable_location", PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION"));
            sparkContext.LJJIIJZLJL("system_is_precise", ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSystemPrecise(context));
            sparkContext.LJJIIJZLJL("inapp_is_precise", ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise());
            EnumC54647LcZ discoveryScenario = poiDiscoveryLandingPageParams.getDiscoveryScenario();
            if (discoveryScenario != null) {
                int i3 = C54648Lca.LIZ[discoveryScenario.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        i = 1;
                    }
                } else {
                    i = 6;
                }
            }
            sparkContext.LJJIFFI(i, WM7.SCENE_SERVICE);
            String poiID = poiDiscoveryLandingPageParams.getPoiID();
            if (poiID == null) {
                poiID = "";
            }
            sparkContext.LJJIIJ("poi_id", poiID);
            String enterFrom = m26.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            sparkContext.LJJIIJ("enter_from", enterFrom);
            String enterMethod = m26.getEnterMethod();
            if (enterMethod == null) {
                enterMethod = "";
            }
            sparkContext.LJJIIJ("enter_method", enterMethod);
            String previousPage = m26.getPreviousPage();
            if (previousPage == null) {
                previousPage = "";
            }
            sparkContext.LJJIIJ("previous_page", previousPage);
            Map<String, String> extraParams = m26.getExtraParams();
            if (extraParams != null) {
                for (Map.Entry<String, String> entry : extraParams.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    sparkContext.LJJIIJ(key, value);
                }
            }
            sparkContext.LJII(M2K.class, new C45806HyM(context));
            sparkContext.LJJ(new C40060Fns(poiDiscoveryLandingPageParams2));
            sparkContext.LJJI(new AbstractC60811Ntn() { // from class: X.7sR
                public InterfaceC60761Nsz LJLILLLLZI;

                @Override // X.AbstractC60673NrZ
                public final void onDestroy() {
                    this.LJLILLLLZI = null;
                    EventBus.LIZJ().LJIJ(this);
                }

                @Override // X.AbstractC60673NrZ
                public final void LJJJJJ(InterfaceC60761Nsz view) {
                    o.LJIIIZ(view, "view");
                    this.LJLILLLLZI = view;
                    EventBus.LIZJ().LJIILJJIL(this);
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onCollectedStatusChange(C187127Wa event) {
                    o.LJIIIZ(event, "event");
                    InterfaceC60761Nsz interfaceC60761Nsz = this.LJLILLLLZI;
                    if (interfaceC60761Nsz != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("poi_id", event.LJLILLLLZI);
                        jSONObject.put("is_collected", event.LJLIL ? 1 : 0);
                        interfaceC60761Nsz.LJIIIZ("poiCollectStatusChange", jSONObject);
                    }
                }
            });
            for (Map.Entry<String, String> entry2 : ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getLocationCommonParamsIfHave().entrySet()) {
                sparkContext.LJJIIJ(entry2.getKey(), entry2.getValue());
            }
            OKG.LIZLLL(C40343FsR.LJIILJJIL, context, sparkContext);
        }
        C54649Lcb.LIZ(1);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LJII(String str, HashMap<String, String> params, Aweme aweme, boolean z) {
        String eventTrack;
        o.LJIIIZ(params, "params");
        if (!o.LJ(str, "homepage_nearby")) {
            return;
        }
        Map<String, String> locationCommonParamsIfHave = LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave();
        if (!locationCommonParamsIfHave.isEmpty()) {
            params.putAll(locationCommonParamsIfHave);
        }
        if (aweme != null) {
            params.put("publish_consume_interval", String.valueOf(System.currentTimeMillis() - aweme.getCreateTime()));
            NearbyInfo nearbyInfo = aweme.nearbyInfo;
            if (nearbyInfo == null || (eventTrack = nearbyInfo.getEventTrack()) == null) {
                return;
            }
            if (eventTrack.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(eventTrack);
                    Iterator<String> iterator = jSONObject.keys();
                    o.LJIIIIZZ(iterator, "iterator");
                    while (iterator.hasNext()) {
                        String it = iterator.next();
                        Object opt = jSONObject.opt(it);
                        if (C78685UuP.LJJJZ(it) && opt != null) {
                            o.LJIIIIZZ(it, "it");
                            params.put(it, opt.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (!z || params.containsKey("log_pb") || !C78685UuP.LJJJZ(aweme.getLogPbString())) {
                return;
            }
            String logPbString = aweme.getLogPbString();
            o.LJIIIIZZ(logPbString, "aweme.logPbString");
            params.put("log_pb", logPbString);
        }
    }
}
