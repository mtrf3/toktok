package com.ss.android.ugc.aweme.poi.service;

import X.ASL;
import X.AV1;
import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.ActivityC45651qj;
import X.C00F;
import X.C025908h;
import X.C113554cx;
import X.C116484hg;
import X.C141335gf;
import X.C15070iV;
import X.C16880lQ;
import X.C184077Kh;
import X.C187127Wa;
import X.C188727au;
import X.C188977bJ;
import X.C189037bP;
import X.C189987cw;
import X.C190317dT;
import X.C190777eD;
import X.C190787eE;
import X.C190797eF;
import X.C190827eI;
import X.C191077eh;
import X.C191557fT;
import X.C191577fV;
import X.C198467qc;
import X.C199057rZ;
import X.C19N;
import X.C211848Tc;
import X.C211898Th;
import X.C214298b3;
import X.C214528bQ;
import X.C225248si;
import X.C234529Ii;
import X.C235119Kp;
import X.C27288AnM;
import X.C29S;
import X.C2U8;
import X.C2UV;
import X.C3C5;
import X.C45804HyK;
import X.C47261Igj;
import X.C51556KLg;
import X.C51733KSb;
import X.C54526Lac;
import X.C56178M3a;
import X.C58096Mr6;
import X.C61491OBj;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71419S1f;
import X.C72085SQv;
import X.C72972SkS;
import X.C75792yF;
import X.C76800UCe;
import X.C78540Us4;
import X.C78685UuP;
import X.C78926UyI;
import X.C7U3;
import X.C80612VkO;
import X.C85256Xd6;
import X.C85296Xdk;
import X.C85844Xma;
import X.C85845Xmb;
import X.C85846Xmc;
import X.C85847Xmd;
import X.C8R8;
import X.C8RH;
import X.C8RJ;
import X.C8TJ;
import X.C8TL;
import X.C8TN;
import X.C8TO;
import X.C8TX;
import X.C8TY;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.EF7;
import X.EnumC189997cx;
import X.EnumC217558gJ;
import X.EnumC54527Lad;
import X.F6B;
import X.FFL;
import X.FKM;
import X.InterfaceC211228Qs;
import X.InterfaceC211828Ta;
import X.InterfaceC224548ra;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.M3Z;
import X.OSZ;
import X.RBW;
import X.S1I;
import X.S1U;
import X.SY4;
import X.VNU;
import X.X1D;
import Y.ACListenerS29S0300000_3;
import Y.AfS52S0200000_3;
import Y.AfS55S0100000_3;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDetails;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectListFragment;
import com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiCollectBottomBarViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailPageInterceptor;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import com.ss.android.ugc.aweme.poi.experiment.PoiTypeFilter;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.map.lynxmap.LynxMapElement;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi.tag.IPoiTagService;
import com.ss.android.ugc.aweme.poi.tag.NearbyPoiTagTrigger;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishModel;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiDynamicMapSettings;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.services.publish.AVPublishPageScene;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import com.ss.android.ugc.tiktok.location_api.service.Config;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.s1;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes4.dex */
public final class PoiServiceImpl implements IPoiService, IPoiTagService, IPoiAnchorService {
    public final /* synthetic */ C72085SQv LJLIL = new C72085SQv();
    public final /* synthetic */ C61491OBj LJLILLLLZI = new C61491OBj();
    public boolean LJLJI;

    /* loaded from: classes4.dex */
    public static final class PoiCollectListFragmentData extends PowerViewPagerFragmentItem<PoiCollectListFragment> {
        public static final Parcelable.Creator<PoiCollectListFragmentData> CREATOR = new Parcelable.Creator<PoiCollectListFragmentData>() { // from class: X.7qb
            @Override // android.os.Parcelable.Creator
            public final PoiServiceImpl.PoiCollectListFragmentData createFromParcel(Parcel parcel) {
                o.LJIIIZ(parcel, "parcel");
                parcel.readInt();
                return new PoiServiceImpl.PoiCollectListFragmentData();
            }

            @Override // android.os.Parcelable.Creator
            public final PoiServiceImpl.PoiCollectListFragmentData[] newArray(int i) {
                return new PoiServiceImpl.PoiCollectListFragmentData[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final void appendPoiTagParamsIfHave(String str, HashMap<String, String> params, Aweme aweme) {
        o.LJIIIZ(params, "params");
        this.LJLIL.appendPoiTagParamsIfHave(str, params, aweme);
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final InterfaceC211228Qs getPoiTagView(Context context) {
        o.LJIIIZ(context, "context");
        return this.LJLIL.getPoiTagView(context);
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final boolean isPoiTagShow(String str, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LJLIL.isPoiTagShow(str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean shouldShowCustomFeedSingleAnchor(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LJLILLLLZI.shouldShowCustomFeedSingleAnchor(aweme);
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean shouldShowOldFeedSingleAnchor(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LJLILLLLZI.shouldShowOldFeedSingleAnchor(aweme);
    }

    public static IPoiService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IPoiService.class, false);
        if (LIZ != null) {
            return (IPoiService) LIZ;
        }
        if (C58096Mr6.Y3 == null) {
            synchronized (IPoiService.class) {
                if (C58096Mr6.Y3 == null) {
                    C58096Mr6.Y3 = new PoiServiceImpl();
                }
            }
        }
        return C58096Mr6.Y3;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final HashMap<String, C7U3> LIZ() {
        return C190777eD.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJI() {
        C189037bP.LIZ.getClass();
        return C189037bP.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final IInterceptor LJIIJ() {
        return new PoiDetailPageInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC211828Ta LJIILIIL() {
        return new InterfaceC211828Ta() { // from class: X.7sS
            @Override // X.InterfaceC211828Ta
            public final void start() {
                EventBus.LIZJ().LJIILJJIL(this);
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onCollectedStatusChange(C187127Wa event) {
                o.LJIIIZ(event, "event");
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("poi_id", event.LJLILLLLZI);
                jSONObject.put("is_collected", event.LJLIL ? 1 : 0);
                C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "poiCollectStatusChange");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJIJ() {
        boolean z = false;
        if (C00F.LIZ(31744, 1, "poi_sticker_interact_ext", false) == 2) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJII() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        if (PoiEnableExperiment.LIZIZ()) {
            C116484hg.LIZ("hit_poi_publish_rule", String.valueOf(enable() ? 1 : 0), "poi_function_on");
        }
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIJ() {
        C191077eh.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "poi_reverse_filter_test_group", false) == 0 || C00F.LIZ(31744, 0, "poi_reverse_filter_test_group", false) == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJIL() {
        if (C00F.LIZ(31744, 1, "poi_sticker_interact_ext", false) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final HashMap<String, C7U3> LJJJJI() {
        return C8TJ.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C8RJ LJJJJLI() {
        return new C8RH();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map<String, Object> LJJJJZ() {
        List<PopupSceneV2> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("poi_master_switch", Boolean.valueOf(enable()));
        C85296Xdk.LIZ.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Config[] LIZIZ = C85296Xdk.LIZIZ();
        if (LIZIZ != null) {
            for (Config config : LIZIZ) {
                String str = config.business;
                if (str != null && !ujb.o.LJJJJJL(str) && (list = config.popupSceneV2) != null && !list.isEmpty()) {
                    C85296Xdk.LIZ.getClass();
                    if (!C85296Xdk.LJI(config)) {
                        String str2 = config.business;
                        ArrayList arrayList = new ArrayList();
                        List<PopupSceneV2> list2 = config.popupSceneV2;
                        if (list2 != null) {
                            Iterator<PopupSceneV2> it = list2.iterator();
                            while (it.hasNext()) {
                                String str3 = it.next().scene;
                                if (str3 != null) {
                                    arrayList.add(str3);
                                }
                            }
                        }
                        linkedHashMap2.put(str2, arrayList);
                    }
                }
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            linkedHashMap.put("poi_popup_scenes", linkedHashMap2.toString());
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJLIIIJJI() {
        C51556KLg.LIZ.getClass();
        if (C51556KLg.LIZ().enable() && C211898Th.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final S1U LJJLIIIJLJLI() {
        return new C191557fT();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final S1I LJJLJ() {
        return new S1I() { // from class: X.8TG
            @Override // X.S1I
            public final void LIZJ(Context context) {
                o.LJIIIZ(context, "context");
            }

            @Override // X.S1I
            public final C8IM LIZIZ(Context context) {
                o.LJIIIZ(context, "context");
                return new C71417S1d(context);
            }

            @Override // X.S1I
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                o.LJIIIZ(aweme, "aweme");
                if (z) {
                    C51556KLg.LIZ.getClass();
                    if (C51556KLg.LIZ().shouldShowCustomFeedSingleAnchor(aweme)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final VideoTagCategoryProtocol getPoiTagTrigger() {
        this.LJLIL.getClass();
        return new NearbyPoiTagTrigger();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJII() {
        EF7.LIZIZ();
        AtomicBoolean atomicBoolean = C8TL.LIZIZ;
        if (atomicBoolean.get()) {
            return;
        }
        ReentrantLock reentrantLock = C8TL.LIZ;
        reentrantLock.lock();
        try {
            atomicBoolean.get();
            atomicBoolean.set(true);
            reentrantLock.unlock();
        } catch (Throwable th) {
            C8TL.LIZ.unlock();
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJIIIZ() {
        return PoiEnableExperiment.LIZ().staticMapUrl;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final float LJIL() {
        return PoiEnableExperiment.LIZ().mapSizeScale;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIIZ() {
        if (enable() && C211898Th.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIL() {
        Integer num = PoiServerConfigSettings.LIZ().publishLandingNearby;
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJJJJLL() {
        return PoiEnableExperiment.LIZ().mapKey;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJJZI() {
        Integer num = PoiServerConfigSettings.LIZ().poiConsumptionReverse;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJLIIL() {
        if (!enable()) {
            return false;
        }
        C8TO.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 1, "poi_search_page_permission_popup", false) == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean enable() {
        if (!PoiEnableExperiment.LIZIZ()) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi", "poi_config is not enable");
            return false;
        }
        if (!RBW.LJLLI.LJI()) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi", "is not login");
            return false;
        }
        if (AV1.LJIILLIIL()) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi", "isKidsMode");
            return false;
        }
        if (!C19N.LJ("enable_add_poi_compliance", false)) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi", "enable_add_poi_compliance is false");
            return false;
        }
        return true;
    }

    public static String LIZJ(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            List LJLJJL = s.LJLJJL(str, new String[]{"|"}, 0, 6);
            int i = 0;
            for (Object obj : LJLJJL) {
                int i2 = i + 1;
                if (i >= 0) {
                    List LJLJJL2 = s.LJLJJL((String) obj, new String[]{":"}, 0, 6);
                    if (LJLJJL2.size() > 1) {
                        int i3 = 0;
                        for (Object obj2 : LJLJJL2) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                String str2 = (String) obj2;
                                if (i3 % 2 == 0) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(str2);
                                    LIZ.append(':');
                                    sb.append(X1D.LIZIZ(LIZ));
                                } else {
                                    sb.append(Uri.encode(str2));
                                }
                                i3 = i4;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    } else {
                        sb.append(Uri.encode((String) ListProtector.get(LJLJJL2, 0)));
                    }
                    if (i != LJLJJL.size() - 1) {
                        sb.append(Uri.encode("|"));
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return sb.toString();
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LIZLLL(Context context) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    C16880lQ.LLLLLLLLL(packageManager, "com.google.android.apps.maps", 0);
                    return true;
                }
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                e.getMessage();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJIJJLI(String str) {
        return TiktokPoiLynxSettings.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJ(PoiData poiData) {
        String str;
        boolean z;
        boolean z2;
        if (poiData == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C225248si.LIZIZ(poiData, linkedHashMap);
        boolean LJ = o.LJ(linkedHashMap.get("is_tt_key_category"), "1");
        PoiDetails poiDetails = poiData.getPoiDetails();
        if (poiDetails == null || (str = poiDetails.getTtTypeCode()) == null) {
            str = "";
        }
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PoiTypeFilter.TypeFilter typeFilter = PoiTypeFilter.LIZ;
        PoiTypeFilter.TypeFilter typeFilter2 = (PoiTypeFilter.TypeFilter) LIZLLL.LJIIIIZZ("poi_type_filter", PoiTypeFilter.TypeFilter.class, typeFilter);
        if (typeFilter2 == null) {
            typeFilter2 = typeFilter;
        }
        List<String> list = typeFilter2.typeCodeAllow;
        if (list != null && list.contains(str)) {
            z = true;
        } else {
            z = false;
        }
        PoiTypeFilter.TypeFilter typeFilter3 = (PoiTypeFilter.TypeFilter) SettingsManager.LIZLLL().LJIIIIZZ("poi_type_filter", PoiTypeFilter.TypeFilter.class, typeFilter);
        if (typeFilter3 != null) {
            typeFilter = typeFilter3;
        }
        List<String> list2 = typeFilter.typeCodeBan;
        if (list2 != null && !list2.contains(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(LJ | z) || !z2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C15070iV<Class<?>, IAVPublishExtension<?>> LJJIFFI(AVPublishPageScene pageScene) {
        boolean z;
        o.LJIIIZ(pageScene, "pageScene");
        if (enable()) {
            if (C00F.LIZ(31744, 0, "poi_publish_page_refactor", false) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i = C211848Tc.LIZ[pageScene.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return new C15070iV<>(PoiPublishModel.class, new C85845Xmb(0));
                }
                return new C15070iV<>(PoiPublishModel.class, new C85847Xmd());
            }
            int i2 = C211848Tc.LIZ[pageScene.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return new C15070iV<>(PoiPublishModel.class, new C85844Xma(0));
            }
            return new C15070iV<>(PoiPublishModel.class, new C85846Xmc());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("poi_config_");
        LIZ.append(PoiEnableExperiment.LIZIZ() ? 1 : 0);
        LIZ.append("_add_poi_compliance_");
        SettingsManager.LIZLLL().getClass();
        LIZ.append(SettingsManager.LIZ("enable_add_poi_compliance", false) ? 1 : 0);
        LIZ.append("_login_");
        LIZ.append(RBW.LJLLI.LJI() ? 1 : 0);
        LIZ.append("_anchor_");
        LIZ.append(C211898Th.LIZ() ? 1 : 0);
        LIZ.append("_kidmode_");
        LIZ.append(AV1.LJIILLIIL() ? 1 : 0);
        LIZ.append("_reason_");
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI("poi_compliance_false_reason", "");
        o.LJIIIIZZ(LJI, "getInstance().getStringV…eFalseReason::class.java)");
        LIZ.append(LJI);
        String valueStr = X1D.LIZIZ(LIZ);
        M3Z m3z = new M3Z("add_location_filter");
        o.LJIIIZ(valueStr, "valueStr");
        m3z.LIZLLL = valueStr;
        C56178M3a.LIZ(m3z);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIIJ(C29S c29s) {
        TokenCert with;
        if (enable() && C00F.LIZ(31744, 0, "poi_enable_location_prefetch", false) == 0 && C85256Xd6.LIZIZ(c29s)) {
            if (C00F.LIZ(31744, 0, "poi_publish_locate_frequency", false) == 1) {
                with = TokenCert.Companion.with("bpea-poi_video_record_fetch_location_two_for_scene_no_cache");
                with.auth("svfi");
            } else {
                with = TokenCert.Companion.with("bpea-poi_video_record_fetch_location_two_for_scene");
                with.auth("mttu");
            }
            C51733KSb.LIZ("poi", "add_location", with, null, new C27288AnM(), 32);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJJIJIIJI(String str) {
        return C190317dT.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final AbstractC186347Ta LJJIJL(final Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        if (PoiEnableExperiment.LIZIZ()) {
            return new AbstractC186347Ta(ctx) { // from class: X.7qa
                public final FavoriteTabItemV2 LJLILLLLZI;

                @Override // X.AbstractC186347Ta
                public final FavoriteTabItemV2 LIZ() {
                    return this.LJLILLLLZI;
                }

                {
                    PoiServiceImpl.PoiCollectListFragmentData poiCollectListFragmentData = new PoiServiceImpl.PoiCollectListFragmentData();
                    String string = ctx.getString(R.string.p0m);
                    o.LJIIIIZZ(string, "ctx.getString(R.string.p…avorite_menu_title_place)");
                    this.LJLILLLLZI = new FavoriteTabItemV2(poiCollectListFragmentData, string, "places", "pois");
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onCollectedStatusChange(C187127Wa event) {
                    o.LJIIIZ(event, "event");
                    if (event.LJLIL) {
                        LIZLLL(this.LJLIL);
                    } else {
                        LIZIZ(this.LJLIL);
                    }
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final AbstractC186377Td LJJIZ(final Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        final PoiCollectListFragment poiCollectListFragment = new PoiCollectListFragment();
        if (PoiEnableExperiment.LIZIZ()) {
            return new AbstractC186377Td(ctx, poiCollectListFragment) { // from class: X.7qZ
                public final C213218Yj LJLILLLLZI;

                @Override // X.AbstractC186377Td
                public final C213218Yj LIZ() {
                    return this.LJLILLLLZI;
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onCollectedStatusChange(C187127Wa event) {
                    o.LJIIIZ(event, "event");
                    if (event.LJLIL) {
                        LJFF(this.LJLIL);
                    } else {
                        LIZIZ(this.LJLIL);
                    }
                }

                {
                    String string = ctx.getString(R.string.p0m);
                    o.LJIIIIZZ(string, "ctx.getString(R.string.p…avorite_menu_title_place)");
                    this.LJLILLLLZI = new C213218Yj(poiCollectListFragment, string, "places", "pois");
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC224548ra LJJJ(Fragment fragment) {
        C214298b3 c214298b3;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiCollectBottomBarViewModel.class);
        C9BD c9bd = C9BD.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 790);
        C198467qc c198467qc = C198467qc.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, true), C78926UyI.LJJIIJZLJL(fragment, true), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, true), C78926UyI.LJIILLIIL(fragment, true), c198467qc, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C78926UyI.LJJIIJZLJL(fragment, false), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, false), C78926UyI.LJIILLIIL(fragment, false), c198467qc, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return (InterfaceC224548ra) c214298b3.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final LynxUI<?> LJJJJ(VNU context) {
        o.LJIIIZ(context, "context");
        return new LynxMapElement(context);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final CreateAnchorInfo LJJJJJ(PoiData poiData) {
        String str = null;
        if (poiData == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("third_id", poiData.getPoiId());
        jSONObject.put("poi_id", poiData.getPoiId());
        jSONObject.put("fallback_location", poiData.getName());
        jSONObject.put("fallback_lang", IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage());
        jSONObject.put("fallback_address", poiData.getFormattedAddress());
        try {
            String details = poiData.getDetails();
            if (details != null) {
                JSONObject jSONObject2 = new JSONObject(details);
                jSONObject.put("city_code", jSONObject2.optString("city_code"));
                jSONObject.put("region_code", jSONObject2.optString("country_code"));
                jSONObject.put("poi_info_source", "google");
                str = jSONObject2.optString("city_name");
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (C78685UuP.LJJJZ(str)) {
            jSONObject.put("city_name", str);
        } else if (C78685UuP.LJJJZ(poiData.getCity())) {
            jSONObject.put("city_name", poiData.getCity());
        }
        String name = poiData.getName();
        if (name == null) {
            name = "";
        }
        String jSONObject3 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject3, "jsonObject.toString()");
        return new CreateAnchorInfo(45, name, "", "", jSONObject3, "", null, null, null, null, null, null, false, 8128, null);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJJL(Context context) {
        o.LJIIIZ(context, "context");
        return C85256Xd6.LIZIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJJLIIIIJ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct;
        boolean z;
        String str = null;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                boolean z2 = false;
                if (anchorCommonStruct2.getType() == 45) {
                    if (anchorCommonStruct2.getExtra().length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
        if (anchorCommonStruct3 == null) {
            return null;
        }
        try {
            str = ((PoiAnchorData) C75792yF.LIZIZ().LJI(anchorCommonStruct3.getExtra(), PoiAnchorData.class)).getPoiId();
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJLIIIJ(M3Z m3z) {
        C56178M3a.LIZ(m3z);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJLIIIJILLIZJL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct = null;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnchorCommonStruct next = it.next();
                AnchorCommonStruct anchorCommonStruct2 = next;
                if (anchorCommonStruct2.getType() == 45 && anchorCommonStruct2.getExtra().length() > 0) {
                    anchorCommonStruct = next;
                    break;
                }
            }
        }
        if (!PoiEnableExperiment.LIZIZ() || !e1.LIZ(31744, "poi_comment_anchor", true, false) || anchorCommonStruct == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final PoiData LJJLIIJ(InterfaceC88472Yns<? super Class<? extends Object>, ? extends Object> interfaceC88472Yns) {
        PoiPublishModel poiPublishModel;
        PoiData poiItem;
        Object invoke = interfaceC88472Yns.invoke(PoiPublishModel.class);
        if (!(invoke instanceof PoiPublishModel) || (poiPublishModel = (PoiPublishModel) invoke) == null || (poiItem = poiPublishModel.getPoiItem()) == null) {
            return null;
        }
        return PoiData.copy$default(poiItem, null, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, null, null, null, null, null, null, null, null, new PoiMobParam(null, null, null, poiPublishModel.getEnterMethod(), null, null, poiPublishModel.getSearchId(), 55, null), poiPublishModel.getLogId(), null, null, null, 950271, null);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJLJLI(Context context) {
        LocationManager locationManager;
        o.LJIIIZ(context, "context");
        if (Build.VERSION.SDK_INT >= 28) {
            Object LLILL = C16880lQ.LLILL(context, "location");
            if (!(LLILL instanceof LocationManager) || (locationManager = (LocationManager) LLILL) == null) {
                return false;
            }
            return locationManager.isLocationEnabled();
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") == 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJIIIIZZ(Context context, String str) {
        SmartRouter.buildRoute(context, str).open();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map LJIIJJI(Aweme aweme, String str) {
        boolean z;
        String str2;
        Object LIZ;
        Object opt;
        if (aweme == null) {
            return C113554cx.LJJJLIIL();
        }
        PoiAnchorData.Companion.getClass();
        PoiAnchorData LIZLLL = C190827eI.LIZLLL(aweme);
        if (LIZLLL == null) {
            return C113554cx.LJJJLIIL();
        }
        C190787eE.Companion.getClass();
        C190787eE LIZIZ = C190797eF.LIZIZ(aweme);
        C188727au c188727au = new C188727au();
        C190827eI.LIZIZ(c188727au, LIZLLL);
        C190827eI.LIZ(c188727au, LIZLLL);
        C190797eF.LIZ(c188727au, LIZIZ);
        Map<String, String> ret = c188727au.LIZ;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o.LJIIIIZZ(ret, "ret");
            return ret;
        }
        PoiAnchorData LIZJ = C190827eI.LIZJ(str);
        if (LIZJ == null) {
            o.LJIIIIZZ(ret, "ret");
            return ret;
        }
        o.LJIIIIZZ(ret, "ret");
        HashMap hashMap = (HashMap) ret;
        hashMap.put("page_poi_id", LIZJ.getPoiId());
        hashMap.put("page_poi_info_source", LIZJ.getPoiInfoSource());
        hashMap.put("page_poi_city", LIZJ.getPoiCityCode());
        hashMap.put("page_poi_region_code", LIZJ.getPoiRegionCode());
        Integer poiDeviceSameCity = LIZJ.getPoiDeviceSameCity();
        if (poiDeviceSameCity != null) {
            str2 = poiDeviceSameCity.toString();
        } else {
            str2 = null;
        }
        hashMap.put("page_poi_device_samecity", str2);
        String poiDetailTypeFromLevelType = LIZLLL.getPoiDetailTypeFromLevelType();
        if (poiDetailTypeFromLevelType == null) {
            poiDetailTypeFromLevelType = "";
        }
        hashMap.put("page_poi_detail_type", poiDetailTypeFromLevelType);
        hashMap.put("page_is_claimed", LIZLLL.isClaimedStr());
        hashMap.put("from_other_poi", String.valueOf(!o.LJ(str, LIZLLL.getPoiId()) ? 1 : 0));
        String fromGroupId = LIZJ.getFromGroupId();
        if (fromGroupId != null) {
            hashMap.put("from_group_id", fromGroupId);
        }
        String collectInfo = LIZJ.getCollectInfo();
        if (collectInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject(collectInfo);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (C78685UuP.LJJJZ(next) && (opt = jSONObject.opt(next)) != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("page_");
                        LIZ2.append(next);
                        hashMap.put(X1D.LIZIZ(LIZ2), opt.toString());
                    }
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
        return ret;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map LJIJI(String str, String str2) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2UV c2uv = (C2UV) ((LruCache) C188977bJ.LIZ.getValue()).get(str);
        linkedHashMap.put("poi_share_params_cache", c2uv);
        if (c2uv != null) {
            str3 = c2uv.LIZJ;
        } else {
            str3 = null;
        }
        boolean LJ = o.LJ(str3, "1");
        EnumC189997cx.Companion.getClass();
        linkedHashMap.put("poi_detail_type", C189987cw.LIZ(str2, LJ).getTypeName());
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJIJJ(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        if (str != null && !o.LJ(str2, str)) {
            return C00F.LIZIZ(str, ' ', str2);
        }
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIJLIJ(Aweme aweme, HashMap params) {
        String str;
        o.LJIIIZ(params, "params");
        C51556KLg.LIZ.getClass();
        IPoiService LIZ = C51556KLg.LIZ();
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        Map LJIIJJI = LJIIJJI(aweme, LIZ.LJJIJIIJI(str));
        if (!LJIIJJI.isEmpty()) {
            params.putAll(LJIIJJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJJIZL(PoiData poiData, Map<String, String> map) {
        C225248si.LIZLLL(poiData, map);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final View LJJLIL(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        if (aweme == null) {
            return null;
        }
        return new C191577fV(context, aweme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        if (r0 == null) goto L11;
     */
    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(android.os.Bundle r10, android.view.View r11, androidx.fragment.app.FragmentManager r12) {
        /*
            r9 = this;
            if (r11 == 0) goto L4
            if (r12 != 0) goto L5
        L4:
            return
        L5:
            r6 = 2131373126(0x7f0a2c46, float:1.8366334E38)
            android.view.View r0 = r11.findViewById(r6)
            java.lang.String r5 = "poi_collect_bar_fragment"
            androidx.fragment.app.Fragment r1 = r12.LJJJIL(r5)
            if (r1 == 0) goto L23
            if (r0 == 0) goto L17
            return
        L17:
            X.1B3 r0 = new X.1B3
            r0.<init>(r12)
            r0.LJJI(r1)
            r0.LJI()
            goto L25
        L23:
            if (r0 != 0) goto L46
        L25:
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r0 = r11.getContext()
            r3.<init>(r0)
            r3.setId(r6)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r0 = 58
            int r1 = X.C7MY.LIZIZ(r0)
            r0 = -1
            r2.<init>(r0, r1)
            r0 = 80
            r2.gravity = r0
            r11.addView(r3, r2)
        L46:
            if (r10 == 0) goto L4
        L49:
            java.lang.String r0 = "page_poi_id"
            java.lang.String r8 = r10.getString(r0)
            java.lang.String r0 = "poi_name"
            java.lang.String r7 = r10.getString(r0)
            java.lang.String r4 = ""
            if (r7 != 0) goto L5a
            r7 = r4
        L5a:
            java.lang.String r0 = "is_collected"
            boolean r3 = r10.getBoolean(r0)
            java.lang.String r0 = "poi_address"
            java.lang.String r0 = r10.getString(r0)
            if (r0 != 0) goto L92
        L68:
            java.lang.String r0 = "poi_collect_mob_data"
            java.io.Serializable r1 = r10.getSerializable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.collect.PoiCollectMobData"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.7eH r1 = (X.C190817eH) r1
            com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiCollectBarFragment r2 = new com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiCollectBarFragment
            r2.<init>()
            r2.LJLIL = r8
            r2.LJLILLLLZI = r7
            r2.LJLJI = r3
            r2.LJLJJI = r4
            r2.LJLJJL = r1
            X.1B3 r1 = new X.1B3
            r1.<init>(r12)
            r0 = 1
            r1.LJIIIIZZ(r6, r0, r2, r5)
            r1.LJI()
            goto L4
        L92:
            r4 = r0
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.service.PoiServiceImpl.LJIIL(android.os.Bundle, android.view.View, androidx.fragment.app.FragmentManager):void");
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIJIIJIL(int i, String str, boolean z) {
        EnumC217558gJ downloadPolicy;
        String string;
        if (i != 0) {
            if (i != 1) {
                downloadPolicy = EnumC217558gJ.KEEP;
            } else {
                downloadPolicy = EnumC217558gJ.REPLACE;
            }
        } else {
            downloadPolicy = EnumC217558gJ.KEEP;
        }
        o.LJIIIZ(downloadPolicy, "downloadPolicy");
        if (!PoiEnableExperiment.LIZIZ() || !PoiDynamicMapSettings.LIZ()) {
            return;
        }
        AwemeHostApplication LIZ = FKM.LIZ();
        String str2 = null;
        if (LIZ != null) {
            str2 = LIZ.getString(R.string.i00);
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        AwemeHostApplication LIZ2 = FKM.LIZ();
        if (LIZ2 != null && (string = LIZ2.getString(R.string.i01)) != null) {
            str3 = string;
        }
        F6B.LIZJ(z, downloadPolicy, str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJZ(String str, C8R8 c8r8, AqS153S0100000_3 aqS153S0100000_3) {
        PoiReviewsApi.LIZ.getClass();
        C78540Us4.LJJIIZ(C199057rZ.LIZ().isReviewEligible(str, 2)).LJJJLIIL(new AfS52S0200000_3(c8r8, aqS153S0100000_3, 26), new AfS55S0100000_3(aqS153S0100000_3, 78));
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final View LJJLI(Context context, Aweme aweme, String str) {
        boolean z = false;
        if (PoiEnableExperiment.LIZIZ() && e1.LIZ(31744, "poi_comment_anchor", true, false)) {
            z = true;
        }
        if (!z || aweme == null) {
            return null;
        }
        PoiAnchorData.Companion.getClass();
        if (C190827eI.LIZLLL(aweme) == null) {
            return null;
        }
        return new C71419S1f(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJI(EnumC54527Lad scene, C8TX loadStrategy, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns3) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(loadStrategy, "loadStrategy");
        InterfaceC88474Ynu interfaceC88474Ynu = (InterfaceC88474Ynu) ((LinkedHashMap) C54526Lac.LIZ).get(new OSZ(scene, loadStrategy));
        if (interfaceC88474Ynu != null) {
            interfaceC88474Ynu.invoke(scene, interfaceC88472Yns, interfaceC88472Yns2, interfaceC88472Yns3);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJLL(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        C2U8.LIZ(new C187127Wa(str, str2, z, str3, z2, str4));
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJLZIJ(Context context, Double d, Double d2, String str, String str2, Float f) {
        double d3;
        double d4;
        if (d != null) {
            d3 = d.doubleValue();
        } else {
            d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if (d2 != null) {
            d4 = d2.doubleValue();
        } else {
            d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if (LIZLLL(context)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("geo:");
            LIZ.append(d3);
            LIZ.append(',');
            LIZ.append(d4);
            StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = true;
            if (d3 != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d4 != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && f != null) {
                linkedHashMap.put("z", f.toString());
            }
            C51556KLg.LIZ.getClass();
            String LJIJJ = C51556KLg.LIZ().LJIJJ(str, str2);
            if (C78685UuP.LJJJZ(LJIJJ)) {
                String encode = URLEncoder.encode(LJIJJ, "utf-8");
                encode.toString();
                linkedHashMap.put("q", encode);
            }
            if (!linkedHashMap.isEmpty()) {
                sb.append("?");
                for (String str3 : linkedHashMap.keySet()) {
                    if (!z) {
                        sb.append("&");
                    } else {
                        z = false;
                    }
                    StringBuilder LJFF = C72972SkS.LJFF(str3, '=');
                    LJFF.append((String) linkedHashMap.get(str3));
                    sb.append(X1D.LIZIZ(LJFF));
                }
            }
            intent.setData(UriProtector.parse(sb.toString()));
            intent.setPackage("com.google.android.apps.maps");
            intent.putExtra("pns.sandbox.dataflow_id", 1207966721);
            if (context != null && intent.resolveActivity(context.getPackageManager()) != null) {
                C16880lQ.LIZJ(context, intent);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIII(Context context, Number defaultTime, String str, Boolean bool, Boolean bool2, AqS146S0200000_15 aqS146S0200000_15, AqS165S0100000_15 aqS165S0100000_15) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        o.LJIIIZ(defaultTime, "defaultTime");
        final C8TN c8tn = new C8TN();
        View inflate = View.inflate(context, R.layout.c0w, null);
        if (bool != null && bool2 != null) {
            o.LJI(context);
            c8tn.LIZIZ = new C80612VkO(context, ((Integer) defaultTime).intValue(), bool.booleanValue(), bool2.booleanValue());
        }
        c8tn.LIZ = ((Integer) defaultTime).intValue();
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.l7x);
        C80612VkO c80612VkO = c8tn.LIZIZ;
        if (c80612VkO != null) {
            viewGroup.addView(c80612VkO, new ViewGroup.LayoutParams(-1, -1));
            SY4 sy4 = (SY4) inflate.findViewById(R.id.azt);
            if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                ASL asl = new ASL();
                C235119Kp c235119Kp = new C235119Kp();
                C9KF c9kf = new C9KF();
                c9kf.LIZJ = String.valueOf(str);
                c235119Kp.LIZJ = c9kf;
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_x_mark_small;
                LIZJ.LIZIZ(new AqS150S0200000_3(inflate, aqS165S0100000_15, 58));
                c235119Kp.LIZIZ(LIZJ);
                c235119Kp.LIZLLL = true;
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLL = c235119Kp;
                tuxSheet.LJLLI = inflate;
                tuxSheet.LJZL = true;
                asl.LJI(0);
                TuxSheet tuxSheet2 = asl.LIZ;
                tuxSheet2.LJLLJ = true;
                tuxSheet2.LLD = false;
                tuxSheet2.show(supportFragmentManager, "wheelpicker");
            }
            C80612VkO c80612VkO2 = c8tn.LIZIZ;
            if (c80612VkO2 != null) {
                c80612VkO2.LJLLI = new C8TY() { // from class: X.8TM
                    @Override // X.C8TY
                    public final void LIZ(int i) {
                        C8TN.this.LIZ = i;
                    }
                };
                C16880lQ.LJJIZ(sy4, new ACListenerS29S0300000_3(inflate, aqS146S0200000_15, c8tn, 5));
                return;
            } else {
                o.LJIJI("picker");
                throw null;
            }
        }
        o.LJIJI("picker");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJJIJIL(String address, int i, int i2, String str, String str2, String str3, String str4) {
        o.LJIIIZ(address, "address");
        C51556KLg.LIZ.getClass();
        String LJJJJLL = C51556KLg.LIZ().LJJJJLL();
        if (LJJJJLL != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C51556KLg.LIZ().LJIIIZ());
            LIZ.append("?center=");
            LIZ.append(Uri.encode(address));
            LIZ.append("&size=");
            LIZ.append(i);
            LIZ.append('x');
            LIZ.append(i2);
            LIZ.append("&markers=");
            LIZ.append(LIZJ(str));
            LIZ.append("&scale=");
            if (str2 == null) {
                str2 = "";
            }
            LIZ.append(str2);
            LIZ.append("&style=");
            LIZ.append(LIZJ(str4));
            LIZ.append("&maptype=");
            if (str3 == null) {
                str3 = "";
            }
            return C025908h.LIZIZ(LIZ, str3, "&key=", LJJJJLL, LIZ);
        }
        return null;
    }
}
