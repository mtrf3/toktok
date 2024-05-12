package X;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.core.model.Button;
import com.bytedance.touchpoint.core.model.Content;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.touchpoint.core.model.NormalPendant;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.settings.SparkWebViewOptimizeExperiment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AXr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26399AXr {
    public static final C5H3<C26399AXr> LIZIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C26403AXv.LJLIL);
    public C26402AXu LIZ = new C26402AXu(this);

    public final void LIZ(Integer num) {
        boolean z;
        int i;
        Context LJ;
        String str;
        if (C95J.LIZ == null) {
            C95J.LIZ = new C78248UnM();
            C249979rV.LJ = false;
            long LIZ = C245559kN.LIZ();
            C62822Ol8 c62822Ol8 = C249979rV.LIZ;
            if (LIZ == ((Keva) c62822Ol8.getValue()).getLong("last_record_date", 0L)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = ((Keva) c62822Ol8.getValue()).getInt("cold_boot_times", 0) + 1;
            } else {
                i = 1;
            }
            C249979rV.LIZJ = i;
            Keva keva = (Keva) c62822Ol8.getValue();
            keva.storeLong("last_record_date", LIZ);
            keva.storeInt("cold_boot_times", C249979rV.LIZJ);
            JSONObject jSONObject = new JSONObject();
            Object obj = null;
            try {
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    str = abstractC247499nV.LJIIJ();
                } else {
                    str = null;
                }
                jSONObject.put("region", str);
            } catch (JSONException unused) {
            }
            C09900aA.LJI("touchpoint_initialize_monitor", jSONObject, null, null);
            HashMap<Integer, C250209rs> hashMap = new HashMap<>();
            hashMap.put(0, new AY0());
            hashMap.put(22, new C26401AXt());
            hashMap.put(1, new C249969rU() { // from class: X.9sb
                public final C62822Ol8 LIZ = C221108m2.LIZIZ(C250669sc.LJLIL);

                @Override // X.C249969rU
                public final boolean LIZJ() {
                    try {
                        UgAwemeActivitySetting awemeActivitySetting = C2YJ.LIZIZ.LIZ.getAwemeActivitySetting();
                        if (awemeActivitySetting != null) {
                            return awemeActivitySetting.isUploadSwitch();
                        }
                        return false;
                    } catch (Exception unused2) {
                        return false;
                    }
                }

                @Override // X.C249969rU
                public final String LIZIZ() {
                    String aid;
                    Aweme LIZ2 = AU1.LIZ();
                    if (LIZ2 == null || (aid = LIZ2.getAid()) == null) {
                        return "";
                    }
                    return aid;
                }

                @Override // X.C249969rU
                public final boolean LIZLLL() {
                    Aweme LIZ2 = AU1.LIZ();
                    if ((LIZ2 == null || (!LIZ2.isAd() && (LIZ2 == null || (LIZ2.getAwemeType() != 101 && !LIZ2.isReferralFakeAweme())))) && !((FeedCommonService) this.LIZ.getValue()).LJJIII(LIZ2)) {
                        return false;
                    }
                    return true;
                }

                @Override // X.C249969rU
                public final boolean LJ() {
                    List arrayList;
                    NormalPendant normalPendant;
                    Aweme LIZ2 = AU1.LIZ();
                    if (LIZ2 != null && LIZ2.getTextExtra() != null && !LIZ2.getTextExtra().isEmpty()) {
                        C9OT c9ot = C2MW.LIZ().LJ;
                        if (c9ot == null || (normalPendant = c9ot.LJLIL) == null || (arrayList = normalPendant.promotionIds) == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator<TextExtraStruct> it = LIZ2.getTextExtra().iterator();
                            while (it.hasNext()) {
                                if (arrayList.contains(it.next().getCid())) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            });
            hashMap.put(4, new C26394AXm());
            hashMap.put(20, new C26404AXw());
            hashMap.put(6, new C250609sW() { // from class: X.9sd
                @Override // X.C250209rs
                public final boolean LIZ() {
                    C247979oH.LJLJLJ.getValue().getClass();
                    if (C86550Xxy.LIZIZ.LIZLLL(true)) {
                        return false;
                    }
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ == null || !C79004UzY.LJJIJIIJI(LJIIIIZZ)) {
                        return true;
                    }
                    return false;
                }

                @Override // X.C250609sW
                public final boolean LIZJ() {
                    return ((Boolean) C33697DKj.LIZIZ.getValue()).booleanValue();
                }

                @Override // X.C250609sW
                public final boolean LIZIZ() {
                    return C250709sg.LIZ;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C250609sW
                public final void LIZLLL(InAppPush inAppPush) {
                    int i2;
                    String str2;
                    Content content;
                    o.LJIIIZ(inAppPush, "inAppPush");
                    C250579sT.LIZ.getClass();
                    C250579sT.LIZIZ = inAppPush;
                    C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
                    String str3 = inAppPush.icon;
                    if (str3 == null) {
                        str3 = "";
                    }
                    List LJJIJ = C47261Igj.LJJIJ(str3);
                    if (C250709sg.LIZ) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                    Button button = inAppPush.button;
                    String str4 = null;
                    if (button != null && (content = button.content) != null) {
                        str2 = content.text;
                    } else {
                        str2 = null;
                    }
                    Content content2 = inAppPush.content;
                    if (content2 != null) {
                        str4 = content2.text;
                    }
                    c86550Xxy.LIZJ(new C51764KTg(23, "click_push_ug_fission", new InnerPushConfig(0L, null, 10000, 0 == true ? 1 : 0, 0, 27, 0 == true ? 1 : 0), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, LJJIJ, null, null, null, null, null, null, 32, 32, 0.0f, 0.0f, null, 0, 0, null, null, null, 0, 0, null, null, str4, null, 0, null, i2, str2, null, 0, 0, 0, 0, null, null, 0.0f, 0, null, null, null, 0, null, null, null, null, null, -268615809, 1048572, null), null, null, 204));
                }
            });
            hashMap.put(23, new C26406AXy());
            hashMap.put(8, new AY3());
            hashMap.put(11, new C26393AXl());
            hashMap.put(13, new LI6());
            hashMap.put(1000, new M93());
            hashMap.put(1003, new C247579nd() { // from class: X.9ua
                @Override // X.C247579nd
                public final java.util.Map<String, Boolean> LJ() {
                    SettingsManager LIZLLL = SettingsManager.LIZLLL();
                    java.util.Map<String, Boolean> map = C250699sf.LIZ;
                    java.util.Map<String, Boolean> map2 = (java.util.Map) LIZLLL.LJIIIIZZ("incentive_nsr_scene", java.util.Map.class, map);
                    if (map2 == null) {
                        return map;
                    }
                    return map2;
                }

                @Override // X.C247579nd
                public final boolean LIZIZ() {
                    return SparkWebViewOptimizeExperiment.LIZ().enableCommonOpt;
                }

                @Override // X.C247579nd
                public final boolean LIZJ() {
                    return SparkWebViewOptimizeExperiment.LIZ().enableWarmupSpark;
                }

                @Override // X.C247579nd
                public final boolean LIZLLL() {
                    return SparkWebViewOptimizeExperiment.LIZ().enableWarmupWebView;
                }

                @Override // X.C247579nd
                public final boolean LJFF() {
                    return SparkWebViewOptimizeExperiment.LIZ().warmupWebviewInIdle;
                }
            });
            C95J.LIZJ = hashMap;
            try {
                AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV2 != null && (LJ = abstractC247499nV2.LJ()) != null) {
                    Object LLILL = C16880lQ.LLILL(LJ, "connectivity");
                    if (LLILL instanceof ConnectivityManager) {
                        obj = LLILL;
                    }
                    ConnectivityManager connectivityManager = (ConnectivityManager) obj;
                    if (connectivityManager != null) {
                        AY2.LIZ = AY2.LIZ(LJ);
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build(), new C26400AXs(LJ));
                    }
                }
            } catch (Throwable unused2) {
            }
            if (((Boolean) C33697DKj.LIZIZ.getValue()).booleanValue()) {
                C250579sT c250579sT = C250579sT.LIZ;
                c250579sT.getClass();
                C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
                c86550Xxy.LIZ.LJIIJJI(c250579sT);
                c86550Xxy.LJIIIIZZ(c250579sT, new int[]{23});
            }
        }
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0 || o.LJ(CardStruct.IStatusCode.DEFAULT, com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(this.LIZ);
        } else {
            C247609ng.LIZIZ.getValue().getClass();
            C95I.LIZ().LIZIZ(num);
        }
    }
}
