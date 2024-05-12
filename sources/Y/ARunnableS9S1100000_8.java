package Y;

import X.C10K;
import X.C16880lQ;
import X.C46539IOh;
import X.C46982IcE;
import X.C47041IdB;
import X.C47102IeA;
import X.C47448Ijk;
import X.C47455Ijr;
import X.C47480IkG;
import X.C47736IoO;
import X.C47737IoP;
import X.C47739IoR;
import X.C47750Ioc;
import X.C48111IuR;
import X.C48404IzA;
import X.C48407IzD;
import X.C48583J4x;
import X.C48612J6a;
import X.C48616J6e;
import X.C48774JCg;
import X.C49520Jc4;
import X.C49521Jc5;
import X.C50160JmO;
import X.C50279JoJ;
import X.C50605JtZ;
import X.C50863Jxj;
import X.C50963JzL;
import X.C50989Jzl;
import X.C77275UUl;
import X.C78253UnR;
import X.C78966Uyw;
import X.EnumC48779JCl;
import X.FMX;
import X.FR6;
import X.FR7;
import X.ILD;
import X.InterfaceC47447Ijj;
import X.InterfaceC50157JmL;
import X.J54;
import X.JCG;
import X.JNN;
import X.K0M;
import X.K48;
import X.X1D;
import X.Z9N;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.ml.feature.SessionComposeInfo;
import com.ss.android.ugc.aweme.ml.feature.SessionPlayInfo;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.repo.SearchMusicApi;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.MusicSugViewModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.result.PhotoSearchResultFragment;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes9.dex */
public class ARunnableS9S1100000_8 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        MusicSearchHistory[] musicSearchHistoryArr;
        Integer num;
        MusicSugViewModel musicSugViewModel = ((SearchMusicSugFragment) this.l1).LJLJI;
        if (musicSugViewModel != null) {
            String str = this.s0;
            o.LJI(str);
            musicSugViewModel.LJLILLLLZI.LIZ = Z9N.LIZIZ.LIZIZ();
            K48 k48 = musicSugViewModel.LJLILLLLZI;
            List<? extends MusicSearchHistory> list = k48.LIZ;
            if (list != null) {
                musicSearchHistoryArr = (MusicSearchHistory[]) list.toArray(new MusicSearchHistory[0]);
            } else {
                musicSearchHistoryArr = null;
            }
            if (!Arrays.equals(musicSearchHistoryArr, k48.LIZIZ)) {
                JSONArray jSONArray = new JSONArray();
                if (musicSearchHistoryArr != null) {
                    for (MusicSearchHistory musicSearchHistory : musicSearchHistoryArr) {
                        jSONArray.put(musicSearchHistory.keyword);
                    }
                }
                k48.LIZIZ = musicSearchHistoryArr;
                String encode = Uri.encode(jSONArray.toString());
                o.LJIIIIZZ(encode, "encode(historiesJsonArray.toString())");
                k48.LIZJ = encode;
            }
            String str2 = k48.LIZJ;
            if (a.LJFF().LJJJJI()) {
                num = 1;
            } else {
                num = null;
            }
            SearchMusicApi.LIZ.getClass();
            C50963JzL.LIZIZ.getSearchSugList(str, "music_create", str2, num).LJ(new AgS125S0100000_8(musicSugViewModel, 4), C10K.LJIIIIZZ, null);
        }
    }

    public final void LIZ$1() {
        EnginePreloader enginePreloader = ((C47102IeA) this.l1).LIZ;
        String str = this.s0;
        enginePreloader.getClass();
        if (!TextUtils.isEmpty(str)) {
            enginePreloader.LJIJJLI.getQOSSpeedUpService();
            String[] split = str.split(",");
            if (split == null || split.length < 4) {
                return;
            }
            String str2 = split[3];
            if (TextUtils.isEmpty(split[2]) || TextUtils.isEmpty(str2)) {
                return;
            }
            String decode = URLDecoder.decode(split[2]);
            if (TextUtils.isEmpty(decode) || !decode.startsWith("http") || !decode.startsWith("https")) {
                return;
            }
            String str3 = "";
            try {
                str3 = new URI(decode).getHost();
                if (str3.startsWith("www")) {
                    str3 = str3.substring(4);
                }
            } catch (URISyntaxException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            enginePreloader.LJIJJLI.getQOSSpeedUpService();
            enginePreloader.LJIJJLI.getQOSSpeedUpService();
        }
    }

    public final void LIZ$2() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry entry : ((Map) this.l1).entrySet()) {
                    if (entry != null && (entry.getValue() instanceof String) && entry.getKey() != null) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable unused) {
            }
            C48612J6a.LIZIZ(this.s0, jSONObject);
            J54.LIZ.LIZ(this.s0);
        } catch (Throwable unused2) {
        }
    }

    public final void LIZ$3() {
        String str;
        FR6<SessionPlayInfo> fr6 = ((C48616J6e) this.l1).LIZIZ;
        Gson gson = C48583J4x.LIZ;
        fr6.LIZJ(gson, SessionPlayInfo.class);
        try {
            SessionComposeInfo sessionComposeInfo = (SessionComposeInfo) gson.LJI(FR7.LIZIZ("f_session_compose"), SessionComposeInfo.class);
            if (sessionComposeInfo != null && (str = this.s0) != null && TextUtils.equals(sessionComposeInfo.date, str)) {
                ((C48616J6e) this.l1).LIZJ.sessionRank += sessionComposeInfo.sessionRank;
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZ$4() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parse_cost", ((C49520Jc4) this.l1).LJ);
            jSONObject.put("view_draw_cost", ((C49520Jc4) this.l1).LIZLLL);
            jSONObject.put("netLogId", ((C49520Jc4) this.l1).LIZ);
            jSONObject.put("cost", ((C49520Jc4) this.l1).LJFF);
            jSONObject.put("type", ((C49520Jc4) this.l1).LJI);
            jSONObject.put("status", ((C49520Jc4) this.l1).LJII);
            jSONObject.put("pull_count", ((C49520Jc4) this.l1).LJIIIIZZ);
            jSONObject.put("pull_cost", ((C49520Jc4) this.l1).LJIIIZ);
            jSONObject.put("hit_cache", ((C49520Jc4) this.l1).LJIIJ);
            AppLogNewUtils.onEventV3("search_bot_monitor", jSONObject);
            C49521Jc5.LIZ.remove(this.s0);
        } catch (Exception unused) {
        }
    }

    public final void LIZ$6() {
        C47455Ijr.LJ.getClass();
        C46982IcE.LIZIZ().isDebug();
        InterfaceC47447Ijj interfaceC47447Ijj = C47455Ijr.LJ;
        String str = this.s0;
        int i = ((C48111IuR) this.l1).LIZJ;
        ((C47448Ijk) interfaceC47447Ijj).LIZIZ(i, i, str);
        C47480IkG.LIZ.LIZLLL(((C48111IuR) this.l1).LIZJ, this.s0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$7() {
        /*
            r4 = this;
            java.lang.String r0 = r4.s0
            java.lang.String r3 = X.C48082Ity.LIZ(r0)
            java.lang.Object r0 = r4.l1
            X.Irb r0 = (X.C47935Irb) r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.LIZLLL
            r0.lock()
            java.lang.Object r0 = r4.l1     // Catch: java.lang.Throwable -> L88
            X.Irb r0 = (X.C47935Irb) r0     // Catch: java.lang.Throwable -> L88
            java.util.LinkedHashMap<java.lang.String, java.io.File> r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r0.get(r3)     // Catch: java.lang.Throwable -> L88
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L61
            java.lang.Object r0 = r4.l1     // Catch: java.lang.Throwable -> L88
            X.Irb r0 = (X.C47935Irb) r0     // Catch: java.lang.Throwable -> L88
            X.Irc r1 = r0.LJII     // Catch: java.lang.Throwable -> L88
            r0.getClass()     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = r2.getName()     // Catch: java.lang.Throwable -> L88
            boolean r0 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L61
            boolean r0 = X.C16880lQ.LLLZZIL(r2)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L61
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L88
            r0 = 1
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L88
            r2.add(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r4.l1     // Catch: java.lang.Throwable -> L88
            X.Irb r0 = (X.C47935Irb) r0     // Catch: java.lang.Throwable -> L88
            java.util.LinkedHashMap<java.lang.String, java.io.File> r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L88
            r0.remove(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r4.l1     // Catch: java.lang.Throwable -> L88
            X.Irb r0 = (X.C47935Irb) r0     // Catch: java.lang.Throwable -> L88
            X.Irc r1 = r0.LJII     // Catch: java.lang.Throwable -> L88
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L88
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L5c
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L5e
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L5e
            r0.remove(r3)     // Catch: java.lang.Throwable -> L5e
        L5c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            goto L62
        L5e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Throwable -> L88
        L61:
            r2 = 0
        L62:
            java.lang.Object r0 = r4.l1
            X.Irb r0 = (X.C47935Irb) r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.LIZLLL
            r0.unlock()
            if (r2 == 0) goto L87
            java.lang.Object r0 = r4.l1
            X.Irb r0 = (X.C47935Irb) r0
            java.util.Set<X.Ird> r0 = r0.LJ
            java.util.Iterator r1 = r0.iterator()
        L77:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r1.next()
            X.Ird r0 = (X.InterfaceC47937Ird) r0
            r0.LIZIZ(r2)
            goto L77
        L87:
            return
        L88:
            r1 = move-exception
            java.lang.Object r0 = r4.l1
            X.Irb r0 = (X.C47935Irb) r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.LIZLLL
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS9S1100000_8.LIZ$7():void");
    }

    public final void LIZ$8() {
        synchronized ("VideoEventLoggerV2") {
            try {
                JSONArray optJSONArray = new JSONObject(this.s0).optJSONArray("data");
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONArray optJSONArray2 = optJSONArray.getJSONObject(i).optJSONArray("downinfo");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        int i2 = 0;
                        while (i2 < optJSONArray2.length()) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                            long optLong = jSONObject.optLong("size");
                            long optLong2 = jSONObject.optLong("costTime");
                            if (optLong != j || optLong2 != -1) {
                                ((C47750Ioc) this.l1).LJLLJ += optLong;
                                j2 = Math.max(j2, optLong2);
                            }
                            i2++;
                            j = 0;
                        }
                    }
                }
                ((C47750Ioc) this.l1).LJLLL = j2;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("update multi speed size:");
                LIZ.append(((C47750Ioc) this.l1).LJLLJ);
                LIZ.append(", time:");
                LIZ.append(((C47750Ioc) this.l1).LJLLL);
                TTVideoEngineLog.d("VideoEventLoggerV2", X1D.LIZIZ(LIZ));
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("update networkspeed error ");
                LIZ2.append(e.toString());
                C78253UnR.LIZLLL("VideoEventLoggerV2", X1D.LIZIZ(LIZ2));
            }
        }
    }

    public final void LIZ$9() {
        C48407IzD c48407IzD = ((C48404IzA) this.l1).LJLIL;
        String url = this.s0;
        c48407IzD.getClass();
        o.LJIIJ(url, "url");
        c48407IzD.LIZIZ.setDataSource(url);
        c48407IzD.LIZ = 1;
        c48407IzD.LIZIZ.setVideoScalingMode(2);
        C48407IzD c48407IzD2 = ((C48404IzA) this.l1).LJLIL;
        c48407IzD2.LIZ = 3;
        c48407IzD2.LIZIZ.prepareAsync();
    }

    public final void LIZ$10() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ref_search_validate_adapter_");
        LIZ.append(this.s0);
        String LIZIZ = X1D.LIZIZ(LIZ);
        JNN.LJIILLIIL.put(LIZIZ, C77275UUl.LJ("search_id", "search_keyword", "tns_ban_type", "use_scenario"));
        FMX.LJIILJJIL(LIZIZ, (JSONObject) this.l1);
    }

    public final void LIZ$5() {
        C50160JmO c50160JmO;
        String str;
        Integer num;
        String str2;
        String str3;
        InterfaceC50157JmL LIZ = K0M.LIZ();
        String str4 = null;
        if (LIZ != null) {
            c50160JmO = LIZ.LIZJ();
        } else {
            c50160JmO = null;
        }
        SearchResultActivity LJ = C50989Jzl.LJ();
        JSONObject LJJJLIIL = C78966Uyw.LJJJLIIL(this.s0);
        if (LJJJLIIL == null || (str = LJJJLIIL.optString("search_bonus_id")) == null) {
            str = "";
        }
        if (LJ == null || (num = ((SearchStartViewModel) ViewModelProviders.of(LJ).get(SearchStartViewModel.class)).iv0().getValue()) == null) {
            num = -1;
        }
        int intValue = num.intValue();
        C50279JoJ c50279JoJ = (C50279JoJ) this.l1;
        if (c50160JmO != null) {
            str2 = c50160JmO.LIZ;
        } else {
            str2 = null;
        }
        c50279JoJ.LJIIZILJ("search_id", str2);
        if (c50160JmO != null) {
            str3 = c50160JmO.LIZ;
        } else {
            str3 = null;
        }
        c50279JoJ.LJIIZILJ("impr_id", str3);
        if (c50160JmO != null) {
            str4 = c50160JmO.LIZIZ;
        }
        c50279JoJ.LJIIZILJ("search_keyword", str4);
        c50279JoJ.LJIJI(C50605JtZ.LIZIZ(LJ));
        c50279JoJ.LJIIZILJ("search_type", C50605JtZ.LJII(intValue));
        c50279JoJ.LJIIZILJ("search_bonus_id", str);
        c50279JoJ.LJIILIIL();
    }

    public static final void run$0(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        ILD ild;
        try {
            if (o.LJ(((C48774JCg) aRunnableS9S1100000_8.l1).LJLLLL, aRunnableS9S1100000_8.s0)) {
                C48774JCg c48774JCg = (C48774JCg) aRunnableS9S1100000_8.l1;
                C47041IdB c47041IdB = c48774JCg.LJLJJLL;
                if (c47041IdB != null) {
                    ild = c47041IdB.LJ.LJLIL;
                } else {
                    ild = null;
                }
                if (ild == ILD.PREPARED) {
                    c48774JCg.LJIL().gv0(EnumC48779JCl.LOADING);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        C47739IoR c47739IoR;
        boolean z;
        try {
            C47736IoO c47736IoO = (C47736IoO) aRunnableS9S1100000_8.l1;
            String str = aRunnableS9S1100000_8.s0;
            synchronized (c47736IoO) {
                if (c47736IoO.LJI < 1) {
                    C47737IoP c47737IoP = c47736IoO.LJ.get("common");
                    c47737IoP.LJI(C16880lQ.LLLLL(c47736IoO.LIZJ));
                    try {
                        c47736IoO.LJII = c47737IoP.LIZ("fetch_interval", 0);
                        c47736IoO.LJIIIIZZ = c47737IoP.LIZJ("config_version");
                        c47736IoO.LJI = c47737IoP.LIZJ("local_cache_expire");
                        if (c47737IoP.LIZ("use_local_cache", 1) > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c47736IoO.LJFF = z;
                    } catch (Throwable th) {
                        th.toString();
                    }
                    c47736IoO.LIZ("vod");
                    c47736IoO.LIZ("mdl");
                    c47736IoO.LIZ("upload");
                }
                if (c47736IoO.LIZLLL != null) {
                    int i = c47736IoO.LJII;
                    if (i < 1) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("set fetch interval fail. interval = ");
                        LIZ2.append(i);
                        X1D.LIZIZ(LIZ2);
                    }
                    C47739IoR c47739IoR2 = c47736IoO.LIZLLL;
                    long j = c47736IoO.LJIIIIZZ;
                    if (j < 1) {
                        c47739IoR2.getClass();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("set config version fail. version = ");
                        LIZ3.append(j);
                        X1D.LIZIZ(LIZ3);
                    } else {
                        c47739IoR2.LIZJ = j;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("use cache: ");
                LIZ4.append(c47736IoO.LJFF);
                LIZ4.append(", expire = ");
                LIZ4.append(c47736IoO.LJI);
                LIZ4.append(", curTimeMs = ");
                LIZ4.append(currentTimeMillis);
                X1D.LIZIZ(LIZ4);
                if ((!c47736IoO.LJFF || c47736IoO.LJI <= currentTimeMillis) && (c47739IoR = c47736IoO.LIZLLL) != null) {
                    c47739IoR.LIZLLL = 0;
                    c47739IoR.LIZIZ(str, null);
                }
                c47736IoO.LIZJ(c47736IoO.LJII);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        C50863Jxj c50863Jxj;
        try {
            PhotoSearchViewModel photoSearchViewModel = ((PhotoSearchResultFragment) aRunnableS9S1100000_8.l1).LJLJJLL;
            if (photoSearchViewModel != null && (c50863Jxj = photoSearchViewModel.LJLJJLL) != null) {
                c50863Jxj.LIZJ(aRunnableS9S1100000_8.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS9S1100000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayPause(aRunnableS9S1100000_8.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            OnPreRenderListener onPreRenderListener = (OnPreRenderListener) aRunnableS9S1100000_8.l1;
            if (onPreRenderListener != null) {
                onPreRenderListener.onPreRenderReady(aRunnableS9S1100000_8.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            Object value = ((JCG) aRunnableS9S1100000_8.l1).LIZ.getValue();
            o.LJIIIIZZ(value, "<get-keva>(...)");
            ((Keva) value).erase(aRunnableS9S1100000_8.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            ((C46539IOh) aRunnableS9S1100000_8.l1).LIZLLL(aRunnableS9S1100000_8.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        try {
            C48612J6a.LIZIZ(aRunnableS9S1100000_8.s0, (JSONObject) aRunnableS9S1100000_8.l1);
            J54.LIZ.LIZ(aRunnableS9S1100000_8.s0);
        } catch (Throwable unused) {
        }
    }

    public static final void run$8(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS9S1100000_8 aRunnableS9S1100000_8) {
        boolean LIZ;
        try {
            aRunnableS9S1100000_8.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S1100000_8(C47736IoO c47736IoO, int i) {
        this.$t = i;
        this.l1 = c47736IoO;
        this.s0 = "all";
    }

    public ARunnableS9S1100000_8(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
