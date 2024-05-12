package X;

import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.7eF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190797eF {
    public static C190787eE LIZIZ(Aweme aweme) {
        String str;
        int i;
        o.LJIIIZ(aweme, "aweme");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<String, Object> LIZJ = CommonFeedApiService.LIZ().LIZJ(aweme);
        if (LIZJ != null) {
            linkedHashMap.putAll(LIZJ);
        }
        linkedHashMap.put("aweme_type", Integer.valueOf(aweme.getAwemeType()));
        NearbyInfo nearbyInfo = aweme.nearbyInfo;
        Object obj = "";
        if (nearbyInfo == null || (str = nearbyInfo.getEventTrack()) == null) {
            str = "";
        }
        linkedHashMap.put("event_track", str);
        linkedHashMap.put("follow_status", String.valueOf(aweme.getFollowStatus()));
        linkedHashMap.put("publish_consume_Interval", String.valueOf(System.currentTimeMillis() - aweme.getCreateTime()));
        linkedHashMap.put("pic_cnt", Integer.valueOf(C227768wm.LJIILIIL(aweme)));
        FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
        if (LJJIJLIJ != null) {
            obj = Integer.valueOf(LJJIJLIJ.LJIIZILJ(C84763XOl.LJIIIIZZ(), aweme));
        }
        linkedHashMap.put("music_name", obj);
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null && anchors.size() > 1) {
            i = 1;
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        String groupId = aweme.getGroupId();
        String authorUid = aweme.getAuthorUid();
        String LJIIJJI = C227768wm.LJIIJJI(aweme);
        String logPbString = aweme.getLogPbString();
        if (logPbString != null) {
            if (logPbString.length() == 0) {
                logPbString = C3A5.LIZ.LIZIZ(aweme.getRequestId());
            }
        } else {
            logPbString = null;
        }
        return new C190787eE(valueOf, groupId, authorUid, LJIIJJI, logPbString, linkedHashMap);
    }

    public static void LIZ(C188727au c188727au, C190787eE c190787eE) {
        Integer num;
        String str;
        String str2;
        if (c190787eE != null) {
            String logPb = c190787eE.getLogPb();
            if (logPb != null && logPb.length() > 0) {
                c188727au.LJI("log_pb", logPb);
            }
            java.util.Map<String, Object> extraParam = c190787eE.getExtraParam();
            if (extraParam != null) {
                for (Map.Entry<String, Object> entry : extraParam.entrySet()) {
                    if (!o.LJ(entry.getKey(), "event_track") && !o.LJ(entry.getKey(), "follow_status") && !o.LJ(entry.getKey(), "publish_consume_Interval")) {
                        c188727au.LJFF(entry.getValue(), entry.getKey());
                    }
                }
            }
        }
        String str3 = null;
        if (c190787eE != null) {
            num = c190787eE.getMultiAnchor();
        } else {
            num = null;
        }
        c188727au.LJFF(num, "multi_anchor");
        if (c190787eE != null) {
            str = c190787eE.getAuthorId();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("author_id", str);
        if (c190787eE != null) {
            str2 = c190787eE.getGroupId();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("group_id", str2);
        if (c190787eE != null) {
            str3 = c190787eE.getMusicId();
        }
        c188727au.LJIIIZ("music_id", str3);
        c188727au.LIZLLL(C85256Xd6.LIZIZ(FKM.LIZ()) ? 1 : 0, "enable_location");
    }
}
