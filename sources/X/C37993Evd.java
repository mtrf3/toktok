package X;

import Y.ARunnableS40S0100000_4;
import android.os.Handler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.hybridkit.experiment.BdxbridgeUrlSecurityTokenSettings;
import com.ss.android.ugc.aweme.hybridkit.experiment.JsbSdkErrorBlockJsbListSettings;
import com.ss.android.ugc.aweme.hybridkit.experiment.JsbSecureAuthConfigSettings;
import com.ss.android.ugc.aweme.hybridkit.experiment.SparkLynxBridgeThreadDispatcherSettings;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS110S0300000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Evd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37993Evd {
    public static final XI8 LIZ;
    public static final XI8 LIZIZ;
    public static final XI8 LIZJ;
    public static final XI8 LIZLLL;
    public static final XI8 LJ;

    public static void LIZLLL() {
        EnumC37997Evh enumC37997Evh;
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel jsbSecureAuthConfigModel = JsbSecureAuthConfigSettings.LIZ;
        JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel jsbSecureAuthConfigModel2 = (JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel) LIZLLL2.LJIIIIZZ("jsb_secure_auth_config", JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel.class, jsbSecureAuthConfigModel);
        if (jsbSecureAuthConfigModel2 != null) {
            jsbSecureAuthConfigModel = jsbSecureAuthConfigModel2;
        }
        C37991Evb c37991Evb = new C37991Evb();
        c37991Evb.LIZ = jsbSecureAuthConfigModel.enable;
        c37991Evb.LIZIZ = jsbSecureAuthConfigModel.secureFallbackMethodList;
        ArrayList<C38000Evk> arrayList = new ArrayList<>();
        Iterator<JsbSecureAuthConfigSettings.JsbSecurePublicKeyModel> it = jsbSecureAuthConfigModel.securePublicKeyList.iterator();
        int i = 0;
        while (it.hasNext()) {
            JsbSecureAuthConfigSettings.JsbSecurePublicKeyModel next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                JsbSecureAuthConfigSettings.JsbSecurePublicKeyModel jsbSecurePublicKeyModel = next;
                String str = jsbSecurePublicKeyModel.publicKey;
                if (jsbSecurePublicKeyModel.status == 0) {
                    enumC37997Evh = EnumC37997Evh.USING;
                } else {
                    enumC37997Evh = EnumC37997Evh.DEPRECATED;
                }
                arrayList.add(new C38000Evk(str, enumC37997Evh));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        c37991Evb.LIZJ = arrayList;
        C37989EvZ.LIZIZ.getClass();
        C37989EvZ.LIZ = c37991Evb;
    }

    static {
        ExecutorService executorService = C38016Ew0.LIZ;
        o.LJIIIIZZ(executorService, "getNormalExecutor()");
        LIZ = new XI8(executorService);
        C38020Ew4 c38020Ew4 = C38016Ew0.LIZIZ;
        o.LJIIIIZZ(c38020Ew4, "getCPUThreadPool()");
        LIZIZ = new XI8(c38020Ew4);
        C38020Ew4 c38020Ew42 = C38016Ew0.LIZJ;
        o.LJIIIIZZ(c38020Ew42, "getIOThreadPool()");
        LIZJ = new XI8(c38020Ew42);
        C38020Ew4 c38020Ew43 = C38016Ew0.LJ;
        o.LJIIIIZZ(c38020Ew43, "getSerialThreadPool()");
        LIZLLL = new XI8(c38020Ew43);
        C38020Ew4 c38020Ew44 = C38016Ew0.LJFF;
        o.LJIIIIZZ(c38020Ew44, "getBackgroundThreadPool()");
        LJ = new XI8(c38020Ew44);
    }

    public static void LIZ() {
        boolean z;
        boolean z2;
        LocalTestApi localTestApi;
        C37905EuD.LJFF = new C37934Eug(new C37905EuD(), new C39132FXk(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId(), String.valueOf(EF7.LJIIIZ), String.valueOf(EF7.LJI()), String.valueOf(EF7.LJFF()), EF7.LJIILIIL, 32), C47261Igj.LJJIJ("https://mon.isnssdk.com/monitor/collect/"), C47261Igj.LJJIJ("https://mon.isnssdk.com/monitor/appmonitor/v2/settings"));
        C37877Etl.LIZ();
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("use_BDXBridgeSDK", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        C37905EuD.LJI = z;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("use_BDXBridgeSDK_lynx", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C37905EuD.LJII = z2;
        C37091Eh5 c37091Eh5 = C37090Eh4.LIZ;
        LocalTestApi localTestApi2 = c37091Eh5.LIZ;
        if (localTestApi2 != null && localTestApi2.enableBoe() && (localTestApi = c37091Eh5.LIZ) != null && localTestApi.enableBoeJsbBypass()) {
            C37876Etk.LIZLLL = false;
        }
        HybridTrafficColoringSettings.HybridTrafficColoringModel LIZ2 = HybridTrafficColoringSettings.LIZ();
        if (LIZ2.enabled && LIZ2.contextPassEnabled) {
            C37905EuD.LJIIJ = new C37996Evg();
        }
    }

    public static void LIZIZ() {
        Boolean bool = Boolean.TRUE;
        C37985EvV.LIZIZ(bool, "jsb_auth_inject_provider_init_start");
        if (!F46.LIZ("_jsmanage_tt_js_auth")) {
            C37985EvV.LIZIZ(bool, "js_config_empty");
            return;
        }
        C37905EuD.LJIILIIL = BdxbridgeUrlSecurityTokenSettings.LIZ().reportAllTokenState;
        C37905EuD.LJIIL = BdxbridgeUrlSecurityTokenSettings.LIZ().noTokenUseUrl;
        List<String> list = BdxbridgeUrlSecurityTokenSettings.LIZ().noAuthTokenPassUrlList;
        if (list != null) {
            C37905EuD.LJIILJJIL.addAll(list);
        }
        C37889Etx c37889Etx = new C37889Etx();
        F4G.LJ.put(c37889Etx.LJFF(), c37889Etx);
        C37985EvV.LIZIZ(bool, "jsb_auth_inject_provider_init_finish");
    }

    public static void LIZJ() {
        ArrayList<String> arrayList = C37905EuD.LJIILL;
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel jsbSdkErrorBlockJsbListModel = JsbSdkErrorBlockJsbListSettings.LIZ;
        JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel jsbSdkErrorBlockJsbListModel2 = (JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel) LIZLLL2.LJIIIIZZ("jsb_sdk_error_block_jsb_list", JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel.class, jsbSdkErrorBlockJsbListModel);
        if (jsbSdkErrorBlockJsbListModel2 != null) {
            jsbSdkErrorBlockJsbListModel = jsbSdkErrorBlockJsbListModel2;
        }
        arrayList.addAll(jsbSdkErrorBlockJsbListModel.methods);
    }

    public static void LJFF(AqS110S0300000_6 aqS110S0300000_6) {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS40S0100000_4(aqS110S0300000_6, 141));
    }

    public static void LJ(AqS110S0300000_6 aqS110S0300000_6, F0Z f0z) {
        int ordinal = f0z.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C62822dK(aqS110S0300000_6, null), 2);
                                return;
                            } else {
                                XKX.LIZLLL(C780334l.LJLIL, LJ, null, new C62812dJ(aqS110S0300000_6, null), 2);
                                return;
                            }
                        }
                        XKX.LIZLLL(C780334l.LJLIL, LIZLLL, null, new C62802dI(aqS110S0300000_6, null), 2);
                        return;
                    }
                    XKX.LIZLLL(C780334l.LJLIL, LIZJ, null, new C62792dH(aqS110S0300000_6, null), 2);
                    return;
                }
                XKX.LIZLLL(C780334l.LJLIL, LIZIZ, null, new C62782dG(aqS110S0300000_6, null), 2);
                return;
            }
            XKX.LIZLLL(C780334l.LJLIL, LIZ, null, new C62772dF(aqS110S0300000_6, null), 2);
            return;
        }
        aqS110S0300000_6.invoke(Boolean.FALSE);
    }

    public static void LJI(C37955Ev1 c37955Ev1, SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModel, AqS110S0300000_6 aqS110S0300000_6) {
        List<String> list;
        if (c37955Ev1.LJJIIZI.LIZIZ(c37955Ev1)) {
            if (sparkLynxBridgeThreadDispatcherModel.allowList.containsKey(c37955Ev1.LJJIIZI.LIZ()) && (list = sparkLynxBridgeThreadDispatcherModel.allowList.get(c37955Ev1.LJJIIZI.LIZ())) != null && list.contains(c37955Ev1.LIZLLL)) {
                aqS110S0300000_6.invoke(Boolean.FALSE);
                return;
            } else {
                LJFF(aqS110S0300000_6);
                return;
            }
        }
        List<String> list2 = sparkLynxBridgeThreadDispatcherModel.allowList.get("host");
        if (list2 != null && list2.contains(c37955Ev1.LIZLLL)) {
            aqS110S0300000_6.invoke(Boolean.FALSE);
        } else {
            LJFF(aqS110S0300000_6);
        }
    }
}
