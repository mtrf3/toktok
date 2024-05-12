package X;

import Y.AObjectS42S0101000_5;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NPQ {
    public static volatile NPQ LIZ;
    public static TopViewJsonManager LIZIZ;
    public static String LIZJ;

    public static NPQ LIZIZ() {
        if (LIZ == null) {
            synchronized (NPQ.class) {
                if (LIZ == null) {
                    LIZJ = C55511LqV.LIZIZ();
                    LIZIZ = new TopViewJsonManager(LIZJ);
                    LIZ = new NPQ();
                }
            }
        }
        return LIZ;
    }

    public static boolean LIZJ() {
        SharedPreferences sharedPreferences;
        TopViewJsonManager topViewJsonManager = LIZIZ;
        if (topViewJsonManager == null || (sharedPreferences = topViewJsonManager.LIZJ) == null) {
            return false;
        }
        return sharedPreferences.getBoolean("awesome_splash_filter_enable", false);
    }

    public static boolean LIZ(Aweme aweme) {
        String aid;
        final int i;
        TopViewAdEventLogger topViewAdEventLogger = new TopViewAdEventLogger(new Object[]{aweme});
        TroubleshootingLogDelegate troubleshootingLogDelegate = TroubleshootingLogDelegate.INSTANCE;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start preload TopView Aweme =");
        LIZ2.append(aweme.getAid());
        troubleshootingLogDelegate.awesomeSplashLog(X1D.LIZIZ(LIZ2));
        if (C63081OpJ.LLIIIZ(aweme)) {
            troubleshootingLogDelegate.awesomeSplashLog("past data, cancel download");
            LJ(aweme, NPR.PAST_DATA);
            return false;
        }
        NHO nho = NHO.LIZIZ;
        if (nho.LIZIZ(aweme) != null && aweme.getAwemeRawAd() != null) {
            nho.LIZLLL(aweme.getAwemeRawAd(), nho.LIZIZ(aweme).getGeckoChannel());
        }
        NHM nhm = NHM.LIZIZ;
        if (nhm.LIZ(aweme) != null) {
            nhm.LIZIZ(aweme.getAwemeRawAd(), nhm.LIZ(aweme).getGeckoChannel());
        }
        AwemeSplashInfo LJJJJZI = C63081OpJ.LJJJJZI(aweme);
        if (LJJJJZI == null) {
            troubleshootingLogDelegate.awesomeSplashLog("awemeSplashInfo is null，cancel download");
            LJ(aweme, NPR.SPLASH_INFO_NULL);
            return false;
        }
        int preloadType = LJJJJZI.getPreloadType();
        C48202Ivu c48202Ivu = C2NU.LIZ;
        if (!c48202Ivu.LIZIZ()) {
            troubleshootingLogDelegate.awesomeSplashLog("no network, cancel download");
            LJ(aweme, NPR.NO_NETWORK);
            return false;
        }
        if (!c48202Ivu.LIZJ() && preloadType == 1) {
            troubleshootingLogDelegate.awesomeSplashLog("not wifi, cancel download");
            LJ(aweme, NPR.WIFI_ONLY);
            return false;
        }
        NMP nmp = new NMP(topViewAdEventLogger, aweme);
        Video video = aweme.getVideo();
        if (video == null) {
            troubleshootingLogDelegate.awesomeSplashLog("cancel download reason: video_null");
            LJ(aweme, NPR.VIDEO_NULL);
            return false;
        }
        VideoUrlModel LIZJ2 = C55511LqV.LIZJ(video);
        if (LIZJ2 == null) {
            troubleshootingLogDelegate.awesomeSplashLog("cancel download reason: video_url_model_null");
            LJ(aweme, NPR.VIDEO_URL_MODEL_NULL);
            return false;
        }
        LIZJ2.setSourceId(aweme.getAid());
        if (C55511LqV.LJFF(LIZJ2)) {
            aid = C55511LqV.LIZLLL(aweme.getAid());
        } else {
            aid = aweme.getAid();
        }
        StringBuilder LIZ3 = X1D.LIZ();
        if (C1B6.LIZIZ(JBR.LJFF(LIZ3, LIZJ, aid, LIZ3))) {
            troubleshootingLogDelegate.awesomeSplashLog("cancel download reason: video has download, do not download again");
            LJ(aweme, NPR.VIDEO_EXISTS);
            return false;
        }
        List<String> urlList = LIZJ2.getUrlList();
        if (C79004UzY.LJJIFFI(urlList)) {
            troubleshootingLogDelegate.awesomeSplashLog("cancel download reason: video_url_list_null");
            LJ(aweme, NPR.VIDEO_URL_LIST_NULL);
            return false;
        }
        String str = (String) ListProtector.get(urlList, 0);
        if (TextUtils.isEmpty(str)) {
            troubleshootingLogDelegate.awesomeSplashLog("cancel download reason: video_url_first_null");
            LJ(aweme, NPR.VIDEO_URL_FIRST_NULL);
            return false;
        }
        ArrayList arrayList = new ArrayList(urlList);
        arrayList.remove(str);
        int LJIILIIL = C84212X3g.LJIILIIL(str, LIZJ);
        if (!NW6.LIZ().LJIIJ()) {
            NW6.LIZ().LJJ();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("error_reason", "downloader_not_init");
                FMX.LJIILJJIL("topview_error", jSONObject);
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        IDownloadService LIZLLL = NW6.LIZ().LIZLLL();
        if (LIZLLL == null) {
            LJ(aweme, NPR.DOWNLOAD_SERVICE_NULL);
            return false;
        }
        if (LIZLLL.isDownloading(LJIILIIL)) {
            LJ(aweme, NPR.IS_DOWNLOADING);
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video is downloading, not start download");
            return false;
        }
        DownloadInfo downloadInfo = LIZLLL.getDownloadInfo(LJIILIIL);
        if (downloadInfo != null) {
            i = downloadInfo.getStatus();
        } else {
            i = 100;
        }
        topViewAdEventLogger.LJ(NMA.LIZIZ, new InterfaceC88472Yns() { // from class: X.NMK
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                int i2 = i;
                NMB.LIZ.getClass();
                ((C58620MzY) obj).LJII(NMB.LIZIZ, Integer.valueOf(i2));
                return null;
            }
        });
        String fileHash = LIZJ2.getFileHash();
        X5R with = LIZLLL.with(str);
        with.LJIIIIZZ = arrayList;
        with.LJ = LIZJ;
        with.LJIIIZ = fileHash;
        with.LIZJ = aid;
        with.LJIIJJI = nmp;
        with.LJIIJ = "ad_splash_video_preload";
        with.LJFF = true;
        with.LIZLLL(N33.VIDEO);
        return true;
    }

    public static void LIZLLL(NPX npx) {
        new TopViewAdEventLogger().LJI(NMA.LJIIJJI, C63081OpJ.LJJIJ(npx));
    }

    public static void LJ(Aweme aweme, NPR npr) {
        AwemeRawAd awemeRawAd;
        TopViewAdEventLogger topViewAdEventLogger = new TopViewAdEventLogger();
        C58653N0f c58653N0f = NMA.LJ;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        topViewAdEventLogger.LJIIIZ(c58653N0f, awemeRawAd, new AObjectS42S0101000_5(3, npr, 2));
    }

    public static void LJFF(TopViewAwemeRawAd topViewAwemeRawAd, EnumC59755Ncl enumC59755Ncl) {
        new TopViewAdEventLogger().LJIIIZ(NMA.LJIIL, topViewAwemeRawAd, new AObjectS42S0101000_5(2, enumC59755Ncl, 62));
    }

    public static void LJI(final NPX npx, final boolean z, final boolean z2) {
        new TopViewAdEventLogger().LJIIIZ(NMA.LJIILIIL, C63081OpJ.LJJIJ(npx), new InterfaceC88472Yns() { // from class: X.NMH
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                String str;
                AwemeSplashInfo LJJJLIIL;
                NPX npx2 = NPX.this;
                boolean z3 = z;
                boolean z4 = z2;
                C58620MzY c58620MzY = (C58620MzY) obj;
                C56593MIz c56593MIz = NMB.LJIIZILJ;
                if (npx2 != null && (LJJJLIIL = C63081OpJ.LJJJLIIL(npx2)) != null) {
                    str = LJJJLIIL.getAwesomeSplashId();
                } else {
                    str = null;
                }
                c58620MzY.LJII(c56593MIz, str);
                c58620MzY.LJII(NMB.LJIJ, String.valueOf(z3));
                c58620MzY.LJII(NMB.LJIJI, String.valueOf(z4));
                return null;
            }
        });
    }
}
