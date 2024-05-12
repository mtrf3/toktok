package X;

import Y.ACallableS79S0101000_7;
import Y.ARunnableS7S0210000_8;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IVO {
    public PreloadStrategyConfig LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final IDP LJ;
    public final PreloadStrategyConfig LJFF;

    public IVO(IDP idp, PreloadStrategyConfig preloadStrategyConfig) {
        this.LJ = idp;
        this.LJFF = preloadStrategyConfig;
    }

    public final void LIZ(String str, boolean z) {
        VideoUrlModel videoUrlModel;
        String sourceId;
        Aweme aweme;
        VideoUrlModel playAddr;
        String sourceId2;
        IDP idp = this.LJ;
        if (idp != null) {
            C62822Ol8 c62822Ol8 = C35704Dzo.LJJIII;
            if (((Boolean) c62822Ol8.getValue()).booleanValue() && (aweme = idp.LLLLLLZZ) != null && (playAddr = aweme.getVideo().getPlayAddr()) != null) {
                if (!z) {
                    sourceId2 = playAddr.getBitRatedRatioUri();
                } else {
                    sourceId2 = playAddr.getSourceId();
                }
                if (TextUtils.equals(str, sourceId2)) {
                    idp.LLIIIJ(5, null, false, C35704Dzo.LJFF());
                    return;
                }
            }
            if (!((Boolean) c62822Ol8.getValue()).booleanValue() && idp.LLLLLZL != null && idp.LLLLLLZZ != null && (videoUrlModel = idp.LLLLLZ) != null) {
                if (!z) {
                    sourceId = videoUrlModel.getBitRatedRatioUri();
                } else {
                    sourceId = videoUrlModel.getSourceId();
                }
                if (TextUtils.equals(str, sourceId) && !TextUtils.equals(idp.LLLLLZ.getSourceId(), idp.LLLLLLLZIL)) {
                    idp.LLLLLLLZIL = idp.LLLLLLZZ.getAid();
                    if (((Boolean) C46293IEv.LIZ.getValue()).booleanValue() && TextUtils.equals(idp.LLLLLLLZIL, idp.LLLLLLZ)) {
                        return;
                    }
                    idp.LLIIL(idp.LLLLLLZZ, idp.LLLLLZL, true, true, idp.LLLLLZIL);
                    idp.LLLLLLZZ = null;
                    idp.LLLLLZ = null;
                    idp.LLLLLZL = null;
                    idp.LLLLLZIL = null;
                    return;
                }
            }
            IDR LJJJ = idp.LJJJ();
            if (!C35704Dzo.LJ()) {
                return;
            }
            if (C44432HcC.LJLJI) {
                if (!((Boolean) C35704Dzo.LIZLLL.getValue()).booleanValue()) {
                    return;
                }
            } else if (C00F.LIZ(31744, 1, "player_prerender_download_done_check_enable", true) != 1) {
                return;
            }
            if (LJJJ == null || LJJJ.isScrollDragging()) {
                return;
            }
            idp.LLIIIJ(3, null, false, C35704Dzo.LJFF());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(boolean z, String str, long j, long j2, AbstractC55082Lja abstractC55082Lja, int i, boolean z2) {
        Video video;
        VideoUrlModel properPlayAddr;
        String sourceId;
        int i2;
        int i3;
        if (J8V.LJIILIIL()) {
            if (j == j2) {
                if (z) {
                    LIZ(str, z);
                    return;
                } else {
                    if (j <= 0) {
                        return;
                    }
                    LIZ(str, z);
                    return;
                }
            }
            return;
        }
        if (j == j2) {
            LIZ(str, z);
        }
        Aweme item = abstractC55082Lja.getItem(i);
        if (item == null || item.getVideo() == null || (video = item.getVideo()) == null) {
            return;
        }
        if (IVQ.LIZ) {
            properPlayAddr = C51029K0z.LJJJJZ(IUA.LIZ.LIZ().getVideoPlayAddr(C51029K0z.LJJJJ(video), IXN.LIZJ.getPlayerType()));
        } else {
            properPlayAddr = video.getProperPlayAddr();
        }
        if (properPlayAddr == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            sourceId = properPlayAddr.getBitRatedRatioUri();
        } else {
            sourceId = properPlayAddr.getSourceId();
        }
        if (!TextUtils.equals(str, sourceId)) {
            return;
        }
        if (!TextUtils.equals(sourceId, this.LIZIZ)) {
            this.LIZLLL = false;
            this.LIZJ = true;
            this.LIZIZ = sourceId;
            PreloadStrategyConfig preloadStrategyConfig = this.LIZ;
            if (preloadStrategyConfig != null) {
                preloadStrategyConfig.clearFlag();
            }
        } else {
            this.LIZJ = false;
        }
        if (j2 == j && !this.LIZLLL) {
            this.LIZLLL = true;
            final String sourceId2 = properPlayAddr.getSourceId();
            if (IVP.LIZ == 1) {
                final int LIZJ = C47497IkX.LIZJ();
                final String LLJILLL = C16880lQ.LLJILLL(EF7.LIZIZ());
                final int LIZIZ = C47950Irq.LIZ(EF7.LIZIZ()).LIZIZ(EF7.LIZIZ());
                final C47152Iey[] LIZLLL = C47497IkX.LJ().LIZLLL();
                if (LIZLLL != null) {
                    C10K.LIZIZ(new Callable() { // from class: X.Iex
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C47152Iey c47152Iey;
                            C47152Iey[] c47152IeyArr = LIZLLL;
                            Object obj = sourceId2;
                            int i4 = LIZJ;
                            Object obj2 = LLJILLL;
                            int i5 = LIZIZ;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                JSONArray jSONArray = new JSONArray();
                                int length = c47152IeyArr.length;
                                while (true) {
                                    length--;
                                    if (length < 0) {
                                        break;
                                    }
                                    C47152Iey c47152Iey2 = c47152IeyArr[length];
                                    if (c47152Iey2 != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("file_size", c47152Iey2.LJLILLLLZI);
                                        jSONObject2.put("cost_time", c47152Iey2.LJLJI);
                                        if (length > 0 && (c47152Iey = c47152IeyArr[length - 1]) != null) {
                                            jSONObject2.put("interval_time", c47152Iey2.LJLJJI - c47152Iey.LJLJJI);
                                        } else {
                                            jSONObject2.put("interval_time", 0);
                                        }
                                        jSONArray.put(jSONObject2);
                                    }
                                }
                                jSONObject.put("group_id", obj);
                                jSONObject.put("speed_record", jSONArray);
                                jSONObject.put("internet_speed", i4);
                                jSONObject.put("strategy", 0);
                                jSONObject.put("access", obj2);
                                jSONObject.put("signal", i5);
                                jSONObject.put("qsize", C47497IkX.LIZJ);
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            FMX.LJIILLIIL("video_speed_monitor", jSONObject);
                            C47150Iew.LIZIZ("video_speed_monitor", jSONObject);
                            return null;
                        }
                    }, FMX.LIZIZ(), null);
                }
            }
            C47152Iey[] LIZLLL2 = C47497IkX.LJ().LIZLLL();
            if (LIZLLL2 != null) {
                C10K.LIZIZ(new ACallableS79S0101000_7(1, LIZLLL2, 0), FMX.LIZIZ(), null);
            }
        }
        if (this.LIZJ) {
            List<PreloadStrategyConfig> smartPreloadStrategyExperimentValue = SmartFeedPreloadService.instance().getSmartPreloadStrategyExperimentValue();
            if (smartPreloadStrategyExperimentValue != null && smartPreloadStrategyExperimentValue.size() > 0) {
                long min = Math.min(Math.max(Math.max(((PreloadStrategyConfig) ListProtector.get(smartPreloadStrategyExperimentValue, 0)).getNetworkLower(), 0L), C47497IkX.LIZJ()), Math.min(((PreloadStrategyConfig) DIX.LIZJ(smartPreloadStrategyExperimentValue, 1, smartPreloadStrategyExperimentValue)).getNetworkUpper(), 25000L));
                Iterator<PreloadStrategyConfig> it = smartPreloadStrategyExperimentValue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PreloadStrategyConfig next = it.next();
                    if (next != null && min >= next.getNetworkLower() && min <= next.getNetworkUpper()) {
                        this.LIZ = next;
                        break;
                    }
                }
            } else {
                this.LIZ = SmartFeedPreloadService.instance().getCurrentSmartPreloadStrategyConfig();
            }
        }
        if (this.LIZ == null) {
            this.LIZ = this.LJFF;
        }
        List<PreloadTask> emptyList = Collections.emptyList();
        for (PreloadTask preloadTask : this.LIZ.getTasks()) {
            if (!preloadTask.alreadyPreload && 100 * j2 >= preloadTask.progress * j) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(preloadTask);
                preloadTask.alreadyPreload = true;
            }
        }
        if (emptyList.isEmpty()) {
            return;
        }
        if (z2) {
            List<Aweme> Q8 = abstractC55082Lja.Q8();
            int i4 = i + 1;
            if (i4 < Q8.size() && ListProtector.get(Q8, i4) != null && IVT.LIZIZ(IVT.LIZ(((Aweme) ListProtector.get(Q8, i4)).getAid()))) {
                i3 = 1;
            } else if (i < Q8.size() && ListProtector.get(Q8, i) != null && IVT.LIZIZ(IVT.LIZ(((Aweme) ListProtector.get(Q8, i)).getAid()))) {
                i3 = 0;
            }
            Iterator it2 = emptyList.iterator();
            while (it2.hasNext()) {
                ((PreloadTask) it2.next()).offset = i3;
            }
        }
        List<Aweme> Q82 = abstractC55082Lja.Q8();
        for (PreloadTask preloadTask2 : emptyList) {
            if (preloadTask2.count > 0 && preloadTask2.offset >= 0) {
                if (C47654In4.LIZIZ() == 2) {
                    i2 = 1;
                } else {
                    i2 = preloadTask2.count;
                }
                preloadTask2.count = i2;
                int i5 = preloadTask2.offset;
                Aweme[] awemeArr = new Aweme[i2];
                int i6 = 0;
                if (z2) {
                    while (i6 < i2) {
                        int LIZIZ2 = AnonymousClass036.LIZIZ(i, 1, i6, i5);
                        if (LIZIZ2 < Q82.size()) {
                            awemeArr[i6] = ListProtector.get(Q82, LIZIZ2);
                        }
                        i6++;
                    }
                } else {
                    while (i6 < i2) {
                        int i7 = ((i - 1) - i6) - i5;
                        if (i7 >= 0 && i7 < Q82.size()) {
                            awemeArr[i6] = ListProtector.get(Q82, i7);
                        }
                        i6++;
                    }
                }
                if (C46982IcE.LIZIZ().isDebug()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < i2; i8++) {
                        YW0 yw0 = awemeArr[i8];
                        if (yw0 != 0) {
                            arrayList.add(yw0.getDesc() + "\n");
                        }
                    }
                }
                if (FN9.LJFF && C35810E3q.LJFF) {
                    C57022Lq.LIZ.LJLIL.post(new ARunnableS7S0210000_8(awemeArr, preloadTask2, 5));
                } else {
                    C46728IVo.LJIIJJI(awemeArr, preloadTask2.getVideoPreloadSize(), false);
                }
            }
        }
    }
}
