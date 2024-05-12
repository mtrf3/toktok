package com.ss.android.ugc.aweme.ml.common;

import X.C06490Nh;
import X.C0EH;
import X.C100883xc;
import X.C10K;
import X.C25620zW;
import X.C46249IDd;
import X.C47135Ieh;
import X.C48048ItQ;
import X.C48053ItV;
import X.C48553J3t;
import X.C48563J4d;
import X.C48580J4u;
import X.C48591J5f;
import X.C48612J6a;
import X.C48623J6l;
import X.C78983UzD;
import X.C84763XOl;
import X.FMX;
import X.FQH;
import X.IED;
import X.IWB;
import X.J3Q;
import X.J3R;
import X.J3U;
import X.J45;
import X.J46;
import X.J47;
import X.J48;
import X.J4A;
import X.J4B;
import X.J4C;
import X.J4G;
import X.J4P;
import X.J53;
import X.J5T;
import X.T1V;
import X.WM7;
import X.X1D;
import Y.ACallableS0S1300100_8;
import Y.ACallableS37S1200000_8;
import Y.ACallableS8S2200000_8;
import Y.ARunnableS9S1100000_8;
import Y.AfS60S0100000_8;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class MLCommonServiceImpl extends MLCommonService {
    public static final /* synthetic */ int LJFF = 0;
    public IED LIZ;
    public final ConcurrentHashMap<String, ArrayList<J4G>> LIZIZ = new ConcurrentHashMap<>();
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        int i;
        synchronized (this) {
            if (this.LJ) {
                return;
            }
            this.LJ = true;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                C100883xc.LIZIZ();
                PitayaFeatureCenterService.Companion.getClass();
                J5T.LIZ.checkAndInit();
                SmartCommonPreloadService.Companion.getClass();
                J45.LIZ.checkAndInit();
                SmartDataTrackerService.Companion.getClass();
                C48580J4u.LIZ.checkAndInit();
                i = 0;
            } catch (Throwable th) {
                C78983UzD.LJIJ(th, "checkAndInitNonEmergency error, please check!!");
                i = -3;
            }
            J4B.LJ = System.currentTimeMillis() - currentTimeMillis;
            J4B.LJFF = i;
            if (J53.LIZ("ml_common_service")) {
                JSONObject LJ = C47135Ieh.LJ(WM7.SCENE_SERVICE, "ml_common_service", "model_name", "common");
                LJ.put("sdk_duration", J4B.LIZ);
                LJ.put("sdk_success", J4B.LIZIZ);
                LJ.put("model_cost", (int) J4B.LIZJ);
                LJ.put("model_load_suc", J4B.LIZLLL);
                LJ.put("download_cost", (int) J4B.LJ);
                LJ.put("download_suc", J4B.LJFF);
                FMX.LJIILJJIL("ml_scene_init", LJ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void onAppLaunch() {
        LIZLLL("app_launch", null, null);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void runInMainActivityOnCreate() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void runInMainActivityOnDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final IED getAwemeAdapter() {
        return this.LIZ;
    }

    public final ArrayList<J4G> LIZIZ(String str) {
        ArrayList<J4G> arrayList = this.LIZIZ.get(str);
        if (arrayList != null && (!arrayList.isEmpty())) {
            ArrayList<J4G> arrayList2 = new ArrayList<>();
            synchronized (arrayList) {
                arrayList2.addAll(arrayList);
            }
            return arrayList2;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void checkAndInit(int i) {
        int i2;
        m LIZ;
        j LJJIJ;
        synchronized (this) {
            if (!this.LIZLLL) {
                this.LIZLLL = true;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    MLDataCenterService.Companion.getClass();
                    C48563J4d.LIZ.checkAndInit();
                    J4C.LIZ = C48623J6l.LIZ;
                    SmartPlaytimePredictService.Companion.getClass();
                    C48553J3t.LIZ.checkAndInit();
                    SmartFeedPreloadService.Companion.getClass();
                    IWB.LIZ.checkAndInit();
                    SmartFeedLoadMoreService.Companion.getClass();
                    C48048ItQ.LIZ.checkAndInit();
                    J3Q.LIZIZ.LJIIIZ();
                    SmartFeedAdUIService.Companion.getClass();
                    C48053ItV.LIZ.checkAndInit();
                    try {
                        IServerPortraitService LIZJ = ServerPortraitCollections.LIZJ();
                        if (LIZJ != null && (LIZ = LIZJ.LIZ()) != null && (LJJIJ = LIZ.LJJIJ("enter_music_detail_label")) != null && LJJIJ.LJIILJJIL() > 1) {
                            J3R.LIZIZ.LJIIIZ();
                        }
                    } catch (Throwable th) {
                        C78983UzD.LJIJ(th, "smart_music_service_init");
                    }
                    FQH fqh = C48591J5f.LIZIZ;
                    fqh.initialize();
                    fqh.startup();
                    SmartHARService.Companion.getClass();
                    J4P.LIZ.checkAndInit();
                    C84763XOl.LJI().LJJJJZI(new AfS60S0100000_8(this, 16));
                    onAppLaunch();
                    i2 = 0;
                } catch (Throwable th2) {
                    C78983UzD.LJIJ(th2, "checkAndInit error, please check!!");
                    i2 = -2;
                }
                T1V.LJLILLLLZI = true;
                J4B.LIZJ = System.currentTimeMillis() - currentTimeMillis;
                J4B.LIZLLL = i2;
            }
        }
        if (i == 2) {
            LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onBeforeLoadMore(String str) {
        ArrayList<J4G> LIZIZ;
        MLCommonService.Companion.getClass();
        if (TextUtils.equals("homepage_hot", str) && (LIZIZ = LIZIZ("before_recommend_load_more")) != null) {
            C10K.LIZJ(new ACallableS37S1200000_8(this, LIZIZ, str, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void addCommonEventListener(String type, J4G j4g) {
        o.LJIIIZ(type, "type");
        if (j4g == null) {
            return;
        }
        if (this.LIZIZ.get(type) == null) {
            this.LIZIZ.put(type, new ArrayList<>());
        }
        ArrayList<J4G> arrayList = this.LIZIZ.get(type);
        if (arrayList != null) {
            synchronized (arrayList) {
                if (!arrayList.contains(j4g)) {
                    arrayList.add(j4g);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFinishFirst(Aweme aweme, String str) {
        String str2;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onPlayFinish enterType: ", str, " aweme:");
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            LIZIZ.append(str2);
            LIZIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str3 = author.getNickname();
            }
            LIZIZ.append(str3);
            X1D.LIZIZ(LIZIZ);
        }
        LIZLLL("play_finish_first", aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFirstFrame(Aweme aweme, String str) {
        String str2;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onPlayFirstFrame enterType: ", str, " aweme:");
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            LIZIZ.append(str2);
            LIZIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str3 = author.getNickname();
            }
            LIZIZ.append(str3);
            X1D.LIZIZ(LIZIZ);
        }
        LIZLLL("play_first_frame", aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayResume(Aweme aweme, String str) {
        String str2;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onPlayResume enterType: ", str, " aweme:");
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            LIZIZ.append(str2);
            LIZIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str3 = author.getNickname();
            }
            LIZIZ.append(str3);
            X1D.LIZIZ(LIZIZ);
        }
        LIZLLL("play_resume", aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void removeCommonEventListener(String type, J4G j4g) {
        ArrayList<J4G> arrayList;
        o.LJIIIZ(type, "type");
        if (j4g != null && (arrayList = this.LIZIZ.get(type)) != null) {
            synchronized (arrayList) {
                arrayList.remove(j4g);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void traceMobClickEvent(String str, JSONObject jSONObject) {
        String LIZJ;
        if (C100883xc.LIZ && str != null && jSONObject != null && (LIZJ = C100883xc.LIZJ(str)) != null) {
            jSONObject.putOpt("ext_portraits", LIZJ);
        }
        if (!C48612J6a.LIZIZ || str == null || jSONObject == null || !C48612J6a.LIZJ.contains(str)) {
            return;
        }
        J3U.LIZIZ(new ARunnableS9S1100000_8(jSONObject, str, 7));
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void traceMobClickEventBundle(String str, Bundle bundle) {
        String LIZJ;
        if (!C100883xc.LIZ || str == null || bundle == null || (LIZJ = C100883xc.LIZJ(str)) == null) {
            return;
        }
        bundle.putString("ext_portraits", LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void traceMobClickEventMap(String str, Map<String, String> map) {
        String LIZJ;
        if (C100883xc.LIZ && str != null && map != null && (LIZJ = C100883xc.LIZJ(str)) != null) {
            map.put("ext_portraits", LIZJ);
        }
        if (!C48612J6a.LIZIZ || str == null || map == null || !C48612J6a.LIZJ.contains(str)) {
            return;
        }
        J3U.LIZIZ(new ARunnableS9S1100000_8(map, str, 8));
    }

    public static void LIZJ(String str, J4A j4a, ArrayList arrayList) {
        String str2;
        Aweme aweme;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("event call type:", str, " size:");
            LIZIZ.append(arrayList.size());
            LIZIZ.append(" aweme:");
            if (j4a != null && (aweme = j4a.LIZ) != null && (author = aweme.getAuthor()) != null) {
                str2 = author.getNickname();
            } else {
                str2 = null;
            }
            LIZIZ.append(str2);
            X1D.LIZIZ(LIZIZ);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((J4G) it.next()).LIZIZ(str, j4a);
        }
    }

    public final void LIZLLL(String str, Aweme aweme, String str2) {
        ArrayList<J4G> LIZIZ = LIZIZ(str);
        if (LIZIZ != null) {
            C10K.LIZJ(new J48(aweme, this, str2, str, LIZIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPause(Aweme aweme, String str, boolean z) {
        String str2;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPlayPause enterType: ");
            LIZ.append(str);
            LIZ.append(" isPagePaused:");
            LIZ.append(z);
            LIZ.append(" aweme:");
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            LIZ.append(str2);
            LIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str3 = author.getNickname();
            }
            LIZ.append(str3);
            LIZ.append(" isAppBackground:");
            LIZ.append(C84763XOl.LJIIJJI);
            X1D.LIZIZ(LIZ);
        }
        ArrayList<J4G> LIZIZ = LIZIZ("play_pause");
        if (LIZIZ != null) {
            C10K.LIZJ(new J47(aweme, str, z, this, LIZIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPrepare(Aweme aweme, String str, IED ied) {
        String str2;
        User author;
        this.LIZJ++;
        if (!o.LJ(ied, this.LIZ)) {
            this.LIZ = ied;
        }
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onPlayPrepare enterType: ", str, " aweme:");
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            LIZIZ.append(str2);
            LIZIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str3 = author.getNickname();
            }
            LIZIZ.append(str3);
            LIZIZ.append(" hasEmergencyInited:");
            LIZIZ.append(this.LIZLLL);
            LIZIZ.append(" prepareCount:");
            LIZIZ.append(this.LIZJ);
            X1D.LIZIZ(LIZIZ);
        }
        if (!this.LIZLLL) {
            C10K.LIZJ(new ACallableS37S1200000_8(this, aweme, str, 1));
        } else {
            LIZLLL("play_prepare", aweme, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStop(String str, Aweme aweme, String str2) {
        String str3;
        String str4;
        User author;
        Aweme LIZ;
        User author2;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPlayStop enterType: ");
            LIZ2.append(str2);
            LIZ2.append(" stopAweme:");
            LIZ2.append(str);
            LIZ2.append('-');
            String str5 = null;
            if (this.LIZ != null && (LIZ = C46249IDd.LIZ(str)) != null && (author2 = LIZ.getAuthor()) != null) {
                str3 = author2.getNickname();
            } else {
                str3 = null;
            }
            LIZ2.append(str3);
            LIZ2.append(" curAweme:");
            if (aweme != null) {
                str4 = aweme.getAid();
            } else {
                str4 = null;
            }
            LIZ2.append(str4);
            LIZ2.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str5 = author.getNickname();
            }
            LIZ2.append(str5);
            LIZ2.append("  isAppBackground:");
            LIZ2.append(C84763XOl.LJIIJJI);
            X1D.LIZIZ(LIZ2);
        }
        ArrayList<J4G> LIZIZ = LIZIZ("play_stop");
        if (LIZIZ != null) {
            C10K.LIZJ(new ACallableS8S2200000_8(aweme, this, str, str2, LIZIZ, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStopCallPlayTime(Aweme aweme, long j, String str) {
        String str2;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder LIZJ = C06490Nh.LIZJ("onPlayStopCallPlayTime enterType: ", str, " duration:", j);
            LIZJ.append(" aweme:");
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            LIZJ.append(str2);
            LIZJ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str3 = author.getNickname();
            }
            LIZJ.append(str3);
            LIZJ.append(" isAppBackground:");
            LIZJ.append(C84763XOl.LJIIJJI);
            X1D.LIZIZ(LIZJ);
        }
        ArrayList<J4G> LIZIZ = LIZIZ("play_call_playtime");
        if (LIZIZ != null) {
            C10K.LIZJ(new ACallableS0S1300100_8(aweme, str, j, this, LIZIZ, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onViewPagerSelected(Aweme aweme, String str, int i, JSONObject jSONObject) {
        String str2;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onViewPagerSelected enterType: ", str, " aweme:");
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            LIZIZ.append(str2);
            LIZIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str3 = author.getNickname();
            }
            C0EH.LIZLLL(LIZIZ, str3, " position:", i, " slideTouchInfo:");
            LIZIZ.append(jSONObject);
            X1D.LIZIZ(LIZIZ);
        }
        ArrayList<J4G> LIZIZ2 = LIZIZ("on_view_pager_selected");
        if (LIZIZ2 != null) {
            C10K.LIZJ(new J46(aweme, str, i, jSONObject, this, LIZIZ2));
        }
    }
}
