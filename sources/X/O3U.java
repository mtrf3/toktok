package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.Common;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.utils.gecko.GeckoDownloadStrategyWhiteListSettings;
import com.ss.android.ugc.aweme.web.GeckoXClientManager;
import com.ss.android.ugc.aweme.web.IGeckoXClientManager;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O3U {
    public static Context LIZ;
    public static final C38736FIe LIZIZ;
    public static final O5X LIZJ;
    public static HashMap<String, O3Z> LIZLLL;
    public static boolean LJ;

    static {
        ((CopyOnWriteArrayList) OC6.LIZIZ).add(new C58259Mtj());
        OC6.LIZ = true;
        LIZIZ = new C38736FIe();
        LIZJ = new O5X();
    }

    public static Context LJ() {
        if (LIZ == null) {
            LIZ = EF7.LIZIZ();
        }
        return LIZ;
    }

    public static GeckoGlobalConfig.ENVType LJFF() {
        if (!TextUtils.equals(EF7.LJIILIIL, "local_test") && FCO.LIZJ) {
            return GeckoGlobalConfig.ENVType.PROD;
        }
        boolean equals = LiveWalletRechargeExchangeStrengthen.DEFAULT.equals(LJIIIIZZ());
        if (TextUtils.equals(EF7.LJIILIIL, "local_test") && !equals) {
            if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe() && "boe".equals(LJIIIIZZ())) {
                return GeckoGlobalConfig.ENVType.BOE;
            }
            return GeckoGlobalConfig.ENVType.DEV;
        }
        return GeckoGlobalConfig.ENVType.PROD;
    }

    public static String LJIIIIZZ() {
        String str;
        Keva repo = Keva.getRepo("hybrid_debug_settings");
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe()) {
            str = "boe";
        } else {
            str = "local_test";
        }
        return repo.getString("gecko_deployment", str);
    }

    public static HashMap<String, O3Z> LJIIJJI() {
        GeckoDownloadStrategyWhiteListSettings.List[] listArr;
        if (LIZLLL == null) {
            LIZLLL = new HashMap<>();
            try {
                SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
                GeckoDownloadStrategyWhiteListSettings.GeckoDownloadStrategyWhiteListModel geckoDownloadStrategyWhiteListModel = GeckoDownloadStrategyWhiteListSettings.LIZ;
                GeckoDownloadStrategyWhiteListSettings.GeckoDownloadStrategyWhiteListModel geckoDownloadStrategyWhiteListModel2 = (GeckoDownloadStrategyWhiteListSettings.GeckoDownloadStrategyWhiteListModel) LIZLLL2.LJIIIIZZ("GeckoDownloadStrategyWhiteList", GeckoDownloadStrategyWhiteListSettings.GeckoDownloadStrategyWhiteListModel.class, geckoDownloadStrategyWhiteListModel);
                if (geckoDownloadStrategyWhiteListModel2 != null) {
                    geckoDownloadStrategyWhiteListModel = geckoDownloadStrategyWhiteListModel2;
                }
                if (geckoDownloadStrategyWhiteListModel != null && (listArr = geckoDownloadStrategyWhiteListModel.list) != null && listArr.length > 0) {
                    for (GeckoDownloadStrategyWhiteListSettings.List list : listArr) {
                        O3Z o3z = new O3Z();
                        o3z.LIZ = Arrays.asList(list.groups);
                        o3z.LIZIZ = Arrays.asList(list.channels);
                        LIZLLL.put(list.ak, o3z);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return LIZLLL;
    }

    public static void LJIILLIIL() {
        GeckoGlobalConfig geckoGlobalConfig;
        C61532OCy c61532OCy = EBC.LIZ;
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        c61532OCy.LIZIZ();
        if (TextUtils.isEmpty(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId) || (geckoGlobalConfig = c61532OCy.LJ) == null) {
            return;
        }
        geckoGlobalConfig.setDeviceId(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        Common common = c61532OCy.LIZJ;
        if (common == null) {
            return;
        }
        common.deviceId = com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
    }

    public static void LIZIZ() {
        C61520OCm LJIILIIL = LJIILIIL();
        if (LJIILIIL != null) {
            String LIZIZ2 = C85999Xp5.LIZIZ();
            if (TextUtils.isEmpty(LIZIZ2)) {
                return;
            }
            String lowerCase = LIZIZ2.toLowerCase(Locale.ROOT);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setListener(new C40323Fs7());
            LJIILIIL.LIZ(lowerCase, null, optionCheckUpdateParams);
        }
    }

    public static GeckoGlobalConfig LJI() {
        O3V o3v;
        O3V[] o3vArr;
        GeckoGlobalConfig.ENVType LJFF = LJFF();
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        Context LIZIZ2 = EF7.LIZIZ();
        String idcType = U49.LIZLLL;
        GeckoGlobalConfig.Builder builder = new GeckoGlobalConfig.Builder(LIZIZ2);
        builder.netStack(new GeckoXNetImpl());
        builder.statisticMonitor(LIZIZ);
        builder.host(C38943FQd.LIZIZ());
        builder.appVersion(EF7.LIZLLL());
        builder.appId(EF7.LJIIIZ);
        builder.region(C85990Xow.LIZIZ());
        if (TextUtils.isEmpty(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
            com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = CardStruct.IStatusCode.DEFAULT;
        }
        builder.deviceId(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        builder.env(LJFF);
        o.LJIIIZ(idcType, "idcType");
        C62822Ol8 c62822Ol8 = C52865Kov.LIZ;
        int intValue = ((Number) c62822Ol8.getValue()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    o3v = O3V.ROW;
                } else {
                    int hashCode = idcType.hashCode();
                    if (hashCode != 3248) {
                        if (hashCode != 3742) {
                            if (hashCode == 113114 && idcType.equals("row")) {
                                o3v = O3V.ROW;
                            }
                            o3v = O3V.ROW;
                        } else {
                            if (idcType.equals("us")) {
                                o3v = O3V.US;
                            }
                            o3v = O3V.ROW;
                        }
                    } else {
                        if (idcType.equals("eu")) {
                            o3v = O3V.EU;
                        }
                        o3v = O3V.ROW;
                    }
                }
            } else if (o.LJ(idcType, "us")) {
                o3v = O3V.US;
            } else {
                o3v = O3V.ROW;
            }
        } else {
            o3v = O3V.ROW;
        }
        builder.rootDirectory(new File(C16880lQ.LLIIJLIL(LIZIZ2), i0.LJFF("offlineX", O3X.LIZ(o3v))));
        int intValue2 = ((Number) c62822Ol8.getValue()).intValue();
        if (intValue2 != 0) {
            if (intValue2 != 1) {
                if (intValue2 != 2) {
                    o3vArr = new O3V[]{O3V.ROW};
                } else {
                    o3vArr = O3V.values();
                }
            } else {
                o3vArr = new O3V[]{O3V.ROW, O3V.US};
            }
        } else {
            o3vArr = new O3V[]{O3V.ROW};
        }
        ArrayList arrayList = new ArrayList(o3vArr.length);
        for (O3V o3v2 : o3vArr) {
            File LLIIJLIL = C16880lQ.LLIIJLIL(LIZIZ2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("offlineX");
            LIZ2.append(O3X.LIZ(o3v2));
            arrayList.add(new File(LLIIJLIL, X1D.LIZIZ(LIZ2)));
        }
        builder.candidateRootDirectories(arrayList);
        builder.monitorConfig(LIZJ);
        return builder.build();
    }

    public static C61520OCm LJIIIZ() {
        IGeckoXClientManager LJ2;
        String LIZ2 = C38943FQd.LIZ();
        if (TextUtils.isEmpty(LIZ2) || (LJ2 = GeckoXClientManager.LJ()) == null) {
            return null;
        }
        C61520OCm LIZIZ2 = LJ2.LIZIZ(LIZ2);
        if (LIZIZ2 == null) {
            C61520OCm LJIILJJIL = LJIILJJIL(LIZ2);
            LJ2.LIZ(LIZ2, LJIILJJIL);
            return LJIILJJIL;
        }
        return LIZIZ2;
    }

    public static C61520OCm LJIILIIL() {
        String LIZ2 = C38943FQd.LIZ();
        if (TextUtils.isEmpty(LIZ2)) {
            return null;
        }
        return LJII(LIZ2);
    }

    public static C61520OCm LJII(String str) {
        IGeckoXClientManager LJ2 = GeckoXClientManager.LJ();
        if (LJ2 != null) {
            C61520OCm LIZLLL2 = LJ2.LIZLLL(str);
            if (LIZLLL2 == null) {
                C61520OCm LJIILJJIL = LJIILJJIL(str);
                LJ2.LIZJ(str, LJIILJJIL);
                return LJIILJJIL;
            }
            return LIZLLL2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C61520OCm LJIIL(java.lang.String r10) {
        /*
            java.lang.String r6 = com.ss.android.common.applog.AppLog.getServerDeviceId()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r9 = 0
            if (r0 == 0) goto Lc
            return r9
        Lc:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L13
            return r9
        L13:
            java.io.File r5 = X.C38943FQd.LIZLLL()
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r3 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            if (r3 != 0) goto L1e
            return r9
        L1e:
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r2 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r0 = X.C38943FQd.LIZ()
            r7.add(r0)
            java.lang.String r0 = "feed"
            java.lang.String r1 = r3.LJIIL(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r8 = 0
            if (r0 != 0) goto L94
            r7.add(r1)
            if (r2 == 0) goto L94
            boolean r0 = android.text.TextUtils.equals(r10, r1)
            if (r0 == 0) goto L94
            int r4 = r2.LJII(r1)
        L4a:
            java.lang.String r0 = "splash"
            java.lang.String r1 = r3.LJIIL(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L65
            r7.add(r1)
            if (r2 == 0) goto L65
            boolean r0 = android.text.TextUtils.equals(r10, r1)
            if (r0 == 0) goto L65
            int r4 = r2.LJII(r1)
        L65:
            java.lang.String r0 = "lynx_feed"
            java.lang.String r1 = r3.LJIIL(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L80
            r7.add(r1)
            if (r2 == 0) goto L80
            boolean r0 = android.text.TextUtils.equals(r10, r1)
            if (r0 == 0) goto L80
            int r4 = r2.LJII(r1)
        L80:
            java.lang.String r0 = "dynamic_ad_feed"
            java.lang.String r1 = r3.LJIIL(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L8f
            r7.add(r1)
        L8f:
            if (r4 != 0) goto L96
            r4 = 40
            goto L96
        L94:
            r4 = 0
            goto L4a
        L96:
            X.O2T r3 = new X.O2T     // Catch: java.lang.Exception -> L103
            android.content.Context r0 = LJ()     // Catch: java.lang.Exception -> L103
            r3.<init>(r0)     // Catch: java.lang.Exception -> L103
            java.lang.String r0 = X.C38943FQd.LIZIZ()     // Catch: java.lang.Exception -> L103
            r3.LJIIIZ = r0     // Catch: java.lang.Exception -> L103
            int r0 = X.EF7.LJIIIZ     // Catch: java.lang.Exception -> L103
            long r0 = (long) r0     // Catch: java.lang.Exception -> L103
            r3.LIZJ(r0)     // Catch: java.lang.Exception -> L103
            java.lang.String r0 = X.EF7.LIZLLL()     // Catch: java.lang.Exception -> L103
            r3.LJII = r0     // Catch: java.lang.Exception -> L103
            com.ss.android.ugc.aweme.gecko.GeckoXNetImpl r0 = new com.ss.android.ugc.aweme.gecko.GeckoXNetImpl     // Catch: java.lang.Exception -> L103
            LJ()     // Catch: java.lang.Exception -> L103
            r0.<init>()     // Catch: java.lang.Exception -> L103
            r3.LIZ = r0     // Catch: java.lang.Exception -> L103
            X.FIe r0 = X.O3U.LIZIZ     // Catch: java.lang.Exception -> L103
            r3.LJ = r0     // Catch: java.lang.Exception -> L103
            int r0 = r7.size()     // Catch: java.lang.Exception -> L103
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L103
            java.lang.Object[] r0 = r7.toArray(r0)     // Catch: java.lang.Exception -> L103
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Exception -> L103
            r3.LIZIZ(r0)     // Catch: java.lang.Exception -> L103
            java.lang.String r0 = X.C85990Xow.LIZIZ()     // Catch: java.lang.Exception -> L103
            r3.LJIIJJI = r0     // Catch: java.lang.Exception -> L103
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L103
            r0[r8] = r10     // Catch: java.lang.Exception -> L103
            r3.LIZ(r0)     // Catch: java.lang.Exception -> L103
            r3.LJIIIIZZ = r6     // Catch: java.lang.Exception -> L103
            r3.LJIIJ = r5     // Catch: java.lang.Exception -> L103
            if (r2 == 0) goto Le8
            boolean r0 = r2.LJIIJJI()     // Catch: java.lang.Exception -> L103
            if (r0 == 0) goto Lf9
        Le8:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L103
            r2.<init>()     // Catch: java.lang.Exception -> L103
            r2.add(r10)     // Catch: java.lang.Exception -> L103
            X.NIj r1 = new X.NIj     // Catch: java.lang.Exception -> L103
            X.NJk r0 = X.EnumC59152NJk.FIFO     // Catch: java.lang.Exception -> L103
            r1.<init>(r4, r0, r2)     // Catch: java.lang.Exception -> L103
            r3.LJFF = r1     // Catch: java.lang.Exception -> L103
        Lf9:
            X.O3c r0 = new X.O3c     // Catch: java.lang.Exception -> L103
            r0.<init>(r3)     // Catch: java.lang.Exception -> L103
            X.OCm r0 = X.C61520OCm.LIZLLL(r0)     // Catch: java.lang.Exception -> L103
            return r0
        L103:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O3U.LJIIL(java.lang.String):X.OCm");
    }

    public static C61520OCm LJIILJJIL(String str) {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        File LIZLLL2 = C38943FQd.LIZLLL();
        try {
            O2T o2t = new O2T(LJ());
            o2t.LJIIIZ = C38943FQd.LIZIZ();
            o2t.LIZJ(EF7.LJIIIZ);
            o2t.LJII = EF7.LIZLLL();
            LJ();
            o2t.LIZ = new GeckoXNetImpl();
            o2t.LJ = LIZIZ;
            o2t.LIZIZ(str);
            o2t.LIZ(str);
            o2t.LJIIJJI = C85990Xow.LIZIZ();
            o2t.LJIIIIZZ = serverDeviceId;
            o2t.LJIIJ = LIZLLL2;
            return C61520OCm.LIZLLL(new C61276O3c(o2t));
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean LJIILL(String str) {
        return LIZ(C38943FQd.LIZ(), str);
    }

    public static boolean LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            OD6.LJIIIZ(str, str2, "GeckoUtils.checkExist");
            if (LJIIJ(str, str2) != null) {
                return true;
            }
        }
        return false;
    }

    public static String LIZJ(String str, String str2) {
        return LIZLLL("offlineX", str, str2);
    }

    public static Long LJIIJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            OD6.LJIIIZ(str, str2, "GeckoUtils.getLatestChannelVersion");
            String str3 = "offlineX";
            if (TextUtils.isEmpty("offlineX")) {
                str3 = "gecko_offline_res_x";
            }
            try {
                File LLIIJLIL = C16880lQ.LLIIJLIL(LJ());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str3);
                LIZ2.append(File.separator);
                LIZ2.append(str);
                File file = new File(LLIIJLIL, X1D.LIZIZ(LIZ2));
                if (!file.exists()) {
                    return null;
                }
                File file2 = new File(file.getAbsolutePath(), str2);
                if (!file2.exists()) {
                    C61511OCd.LJIIJ(System.currentTimeMillis(), str, str2, "null", "3", "false");
                    return null;
                }
                return OAS.LIZJ(file2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String LIZLLL(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        OD6.LJIIIZ(str2, str3, "GeckoUtils.getChannelPath");
        if (TextUtils.isEmpty(str)) {
            str = "gecko_offline_res_x";
        }
        if (str3.indexOf("/") == 0) {
            str3 = str3.substring(1);
        }
        if (str3.lastIndexOf("/") == str3.length() - 1) {
            str3 = str3.substring(0, str3.lastIndexOf("/"));
        }
        new File(C16880lQ.LLIIJLIL(LJ()), str);
        return C70657RoD.LJIIIZ(str2, str3);
    }
}
