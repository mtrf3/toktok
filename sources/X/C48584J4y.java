package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Preload;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment$PreloadCommentMLModel;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment$PreloadProfileMLModel;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.J4y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48584J4y {
    public static final C5H3<C48584J4y> LIZLLL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, J50.LJLIL);
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final boolean LIZ(Aweme aweme, boolean z, boolean z2, IDP idp) {
        int i;
        float f;
        float f2;
        String str;
        if (aweme == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        MLDataCenterService.Companion.getClass();
        C48585J4z feedTrackRangeInfo = C48563J4d.LIZ.getFeedTrackRangeInfo(aweme.getAid(), 5, true);
        if (feedTrackRangeInfo != null) {
            int i2 = 0;
            int i3 = 0;
            do {
                if (i3 >= 0 && i3 < feedTrackRangeInfo.LJ.size()) {
                    String LJ = KMP.LJ("play_time_", i2);
                    Object obj = ListProtector.get(feedTrackRangeInfo.LJ, i3);
                    o.LJIIIIZZ(obj, "feedPlayTrackInfo.playTimeList[playTimeListIndex]");
                    hashMap.put(LJ, obj);
                    i3++;
                } else {
                    hashMap.put(KMP.LJ("play_time_", i2), 0);
                }
                i2++;
            } while (i2 < 5);
            hashMap.put("finish_cnt", Integer.valueOf(feedTrackRangeInfo.LIZJ));
            hashMap.put("like_cnt", Integer.valueOf(feedTrackRangeInfo.LIZ));
            hashMap.put("head_cnt", Integer.valueOf(feedTrackRangeInfo.LIZLLL));
            hashMap.put("follow_cnt", Integer.valueOf(this.LIZ));
            hashMap.put("comment_cnt", Integer.valueOf(feedTrackRangeInfo.LIZIZ));
        }
        Video video = aweme.getVideo();
        if (video != null) {
            hashMap.put("v_duration", Integer.valueOf(video.getVideoLength()));
        }
        hashMap.put("is_ad", Integer.valueOf(aweme.isAd() ? 1 : 0));
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            hashMap.put("v_comments", Long.valueOf(statistics.getCommentCount()));
            hashMap.put("v_likes", Long.valueOf(statistics.getDiggCount()));
            hashMap.put("v_vvs", Long.valueOf(statistics.getPlayCount()));
            hashMap.put("v_shares", Long.valueOf(statistics.getShareCount()));
            hashMap.put("v_downloads", Long.valueOf(statistics.getDownloadCount()));
        }
        hashMap.put("follow_status", Integer.valueOf(aweme.getFollowStatus()));
        hashMap.put("cur_finish", Integer.valueOf(z ? 1 : 0));
        hashMap.put("cur_like", Integer.valueOf(aweme.isLike() ? 1 : 0));
        if (aweme.getFollowStatus() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        hashMap.put("cur_follow", Integer.valueOf(i));
        hashMap.put("cur_favorite", Integer.valueOf(aweme.isCollected() ? 1 : 0));
        if (z2) {
            hashMap.put("cur_comment", Integer.valueOf(this.LIZIZ ? 1 : 0));
        }
        String LIZ = C61651OHn.LIZ();
        o.LJIIIIZZ(LIZ, "getRegion()");
        hashMap.put("country", LIZ);
        try {
            Preload preload = aweme.getPreload();
            if (preload != null && (str = preload.predictConfig) != null) {
                new com.google.gson.o();
                m LJIIZILJ = com.google.gson.o.LIZ(str).LJIIZILJ();
                f = LJIIZILJ.LJJIJ("click_comment").LJIIJ();
                f2 = LJIIZILJ.LJJIJ("head").LJIIJ();
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (!z2) {
                f2 = f;
            }
            hashMap.put("server_prob", Float.valueOf(f2));
        } catch (Exception unused) {
        }
        if (idp != null) {
            hashMap.put("cur_playtime", Long.valueOf(idp.LJJIJIL()));
            hashMap.put("cur_playtime_total", Long.valueOf((idp.LJJIJ(null) * idp.LLILLJJLI) + idp.LJJIJIL()));
        }
        if (z2) {
            SmartPreloadProfileV2Service.Companion.getClass();
            float smartJudge = C48567J4h.LIZ.smartJudge(aweme, hashMap, hashMap2);
            SmartPreloadProfileV2Experiment$PreloadProfileMLModel LJIJI = C79004UzY.LJIJI();
            if (LJIJI == null || smartJudge < LJIJI.clientAIThreshold) {
                return false;
            }
            return true;
        }
        SmartPreloadCommentV2Service.Companion.getClass();
        float smartJudge2 = C48566J4g.LIZ.smartJudge(aweme, hashMap, hashMap2);
        SmartPreloadCommentV2Experiment$PreloadCommentMLModel LIZJ = C79012Uzg.LIZJ();
        if (LIZJ == null || smartJudge2 < LIZJ.clientAIThreshold) {
            return false;
        }
        return true;
    }
}
