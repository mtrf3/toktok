package X;

import Y.AObjectS55S0101000_10;
import Y.ARunnableS14S0101000_10;
import Y.ARunnableS5S0001000_10;
import Y.ARunnableS9S0101000_5;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Nck, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59754Nck implements NPT {
    public C59754Nck(Context context) {
    }

    public final boolean LIZ(O7E o7e, boolean z) {
        int i;
        AwemeSplashInfo splashInfo;
        boolean z2;
        AwemeSplashInfo LJJJLIIL;
        NPQ LIZIZ = NPQ.LIZIZ();
        String adId = o7e.LLIILII;
        LIZIZ.getClass();
        if (!TextUtils.isEmpty(adId)) {
            o.LJIIIZ(adId, "adId");
            Npth.addTags(C51029K0z.LJJIIZI(new OSZ("topview_pick_ad_id", adId)));
        }
        NW6.LIZ().LJII();
        boolean z3 = false;
        if (NPQ.LIZJ()) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: filter by low device");
        } else {
            TopViewJsonManager topViewJsonManager = NPQ.LIZIZ;
            topViewJsonManager.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aweme_number", ((ConcurrentHashMap) topViewJsonManager.LJFF()).size());
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
            FMX.LJIILJJIL("topview_aweme", jSONObject);
            NPX npx = (NPX) ((ConcurrentHashMap) topViewJsonManager.LJFF()).get(adId);
            if (npx == null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("show_failed_reason", "2");
                } catch (JSONException e2) {
                    C78983UzD.LJIIZILJ(e2);
                }
                FMX.LJIILJJIL("topview_show_failed", jSONObject2);
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme null");
            } else {
                AwemeSplashInfo LJJJLIIL2 = C63081OpJ.LJJJLIIL(npx);
                if (LJJJLIIL2 != null) {
                    i = LJJJLIIL2.getEndTime();
                } else {
                    i = 0;
                }
                if (i < System.currentTimeMillis() / 1000) {
                    TroubleshootingLogDelegate troubleshootingLogDelegate = TroubleshootingLogDelegate.INSTANCE;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("TopView not show reason: aweme past data");
                    LIZ.append(adId);
                    troubleshootingLogDelegate.awesomeSplashLog(X1D.LIZIZ(LIZ));
                    NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.EXPIRED);
                    NPW.LIZIZ(false, npx, "5");
                    NPQ.LJI(npx, false, z);
                } else if (!NW6.LIZ().LJIILLIIL(npx)) {
                    TroubleshootingLogDelegate troubleshootingLogDelegate2 = TroubleshootingLogDelegate.INSTANCE;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("TopView not show reason: aweme not vaild");
                    LIZ2.append(adId);
                    troubleshootingLogDelegate2.awesomeSplashLog(X1D.LIZIZ(LIZ2));
                    NPQ.LIZLLL(npx);
                    NPQ.LJI(npx, false, z);
                } else if (FR4.LIZIZ) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: open from push");
                    NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.NOT_RIGHT_SCENE);
                    NPQ.LJI(npx, false, z);
                    NPW.LIZIZ(false, npx, "2");
                } else if (!C55511LqV.LIZIZ && npx.LJZ() && (LJJJLIIL = C63081OpJ.LJJJLIIL(npx)) != null && LJJJLIIL.isDisableHotStartShow()) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: disable hot start");
                    NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.DISABLE_HOT_START);
                    NPQ.LJI(npx, false, z);
                    NPW.LIZIZ(false, npx, "7");
                } else if (C55511LqV.LIZIZ && !C55511LqV.LIZJ) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: not from launcher");
                    NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.NOT_RIGHT_SCENE);
                    NPQ.LJI(npx, false, z);
                    NPW.LIZIZ(false, npx, "2");
                } else if (!C55511LqV.LJI) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: main activity not on feed");
                    NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.NOT_RIGHT_SCENE);
                    NPQ.LJI(npx, false, z);
                    NPW.LIZIZ(false, npx, "2");
                } else if (!C55511LqV.LIZIZ && !NW6.LIZ().LJJIIJZLJL()) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: main activity not on top");
                    NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.NOT_RIGHT_SCENE);
                    NPQ.LJI(npx, false, z);
                    NPW.LIZIZ(false, npx, "2");
                } else {
                    AwemeSplashInfo LJJJLIIL3 = C63081OpJ.LJJJLIIL(npx);
                    if (LJJJLIIL3 == null) {
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme splash info null");
                        NPQ.LIZLLL(npx);
                        NPQ.LJI(npx, false, z);
                    } else if (LJJJLIIL3.isInvalidAd()) {
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme data invalid");
                        NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.INVALID_AWEME);
                        NPQ.LJI(npx, false, z);
                        NPW.LIZIZ(false, npx, "4");
                    } else {
                        String awesomeSplashId = LJJJLIIL3.getAwesomeSplashId();
                        C61360O6i.LIZJ().getClass();
                        List<O7E> list = O7I.LIZIZ().LIZ;
                        if (!TextUtils.isEmpty(awesomeSplashId) && !C79004UzY.LJJIFFI(list)) {
                            Iterator<O7E> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                O7E next = it.next();
                                if (awesomeSplashId.equals(next.LLIILII)) {
                                    if (next.LLJJIJIIJIL) {
                                        NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.FILTER_WITH_OVER_DELIVERY);
                                    }
                                }
                            }
                        }
                        Video video = npx.getVideo();
                        if (video == null) {
                            NPQ.LIZLLL(npx);
                        } else {
                            VideoUrlModel LIZJ = C55511LqV.LIZJ(video);
                            if (LIZJ == null || C79004UzY.LJJIFFI(LIZJ.getUrlList())) {
                                NPQ.LIZLLL(npx);
                            } else if (TextUtils.isEmpty(C55511LqV.LJI(npx.getAid(), C55511LqV.LJFF(LIZJ)))) {
                                NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.LOAD_FAIL);
                            } else if (LJJJLIIL3.getHotShowType() == 1 && C55511LqV.LJII) {
                                NPQ.LJFF(npx.LIZ(), EnumC59755Ncl.NOT_RIGHT_SCENE);
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: not right scene because comment/share/dislike panel is showing");
                                NPQ.LJI(npx, false, z);
                                NPW.LIZIZ(false, npx, "2");
                            } else {
                                NPQ.LJI(npx, true, z);
                                if (C34179DbD.LIZ()) {
                                    if (KevaImpl.getRepo(FollowFeedViewStubExperiment.REPO_NAME, 1).getInt("topview_task_new_thread", 0) == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        C16880lQ.LLLLZLLIL().submit(new ARunnableS9S0101000_5(2, adId, 13));
                                    } else if (KevaImpl.getRepo(FollowFeedViewStubExperiment.REPO_NAME, 1).getInt("topview_task_new_thread", 0) == 2) {
                                        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C62742dC(new AObjectS55S0101000_10(0, adId, 0), null), 2);
                                    } else {
                                        C38995FSd.LIZLLL().submit(new ARunnableS14S0101000_10(0, adId, 0));
                                    }
                                } else {
                                    C38995FSd.LIZLLL().submit(new ARunnableS5S0001000_10(0, 0));
                                }
                                if (z) {
                                    C55511LqV.LJIIIIZZ = adId;
                                    C55511LqV.LIZLLL = adId;
                                    if (((Boolean) C87656Yai.LIZJ.getValue()).booleanValue()) {
                                        C36093EEn.LIZ.getClass();
                                        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                                        SplashBgInflate LIZIZ2 = SplashAdServiceImpl.LJJI().LIZIZ();
                                        Objects.requireNonNull(LIZIZ2);
                                        LJIIIZ.LIZIZ(LIZIZ2, true);
                                        LJIIIZ.LIZJ();
                                    }
                                    TopViewAwemeRawAd LJJIJ = C63081OpJ.LJJIJ(npx);
                                    if (LJJIJ != null && (splashInfo = LJJIJ.getSplashInfo()) != null && splashInfo.isDisableHotStartShow()) {
                                        C55511LqV.LJ = LJJIJ.getAdId();
                                    }
                                    if (((Boolean) C35029Dov.LIZIZ.getValue()).booleanValue()) {
                                        C16970lZ.LJ(R.layout.u7, FKM.LIZIZ());
                                    }
                                }
                                NPW.LIZIZ(true, npx, null);
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView data ready");
                                z3 = true;
                                if (z) {
                                    C55511LqV.LJFF = o7e.LJLLI;
                                }
                            }
                        }
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: data not available");
                        NPQ.LJI(npx, false, z);
                    }
                }
            }
        }
        return z3;
    }
}
