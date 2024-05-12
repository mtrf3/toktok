package X;

import com.ss.android.ugc.aweme.anchor.service.EcommerceAnchorService;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191847fw {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(Aweme aweme) {
        String str;
        int i;
        int i2;
        Object LIZ2;
        Object opt;
        boolean z;
        if (aweme == null) {
            return C113554cx.LJJJLIIL();
        }
        PoiAnchorData.Companion.getClass();
        PoiAnchorData LIZ3 = C191867fy.LIZ(aweme);
        if (LIZ3 == null) {
            return C113554cx.LJJJLIIL();
        }
        C191857fx.Companion.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<String, Object> LJ = EcommerceAnchorService.LIZ().LJ(aweme);
        if (LJ != null) {
            linkedHashMap.putAll(LJ);
        }
        linkedHashMap.put("aweme_type", Integer.valueOf(aweme.getAwemeType()));
        NearbyInfo nearbyInfo = aweme.nearbyInfo;
        if (nearbyInfo == null || (str = nearbyInfo.getEventTrack()) == null) {
            str = "";
        }
        linkedHashMap.put("event_track", str);
        linkedHashMap.put("follow_status", String.valueOf(aweme.getFollowStatus()));
        linkedHashMap.put("publish_consume_Interval", String.valueOf(System.currentTimeMillis() - aweme.getCreateTime()));
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        boolean z2 = false;
        if (anchors != null) {
            i = anchors.size();
        } else {
            i = 0;
        }
        if (i > 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        Integer valueOf = Integer.valueOf(i2);
        String groupId = aweme.getGroupId();
        String authorUid = aweme.getAuthorUid();
        String LJIIJJI = C227768wm.LJIIJJI(aweme);
        String logPbString = aweme.getLogPbString();
        if (logPbString != null) {
            if (logPbString.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                logPbString = C3A5.LIZ.LIZIZ(aweme.getRequestId());
            }
        } else {
            logPbString = null;
        }
        C191857fx c191857fx = new C191857fx(valueOf, groupId, authorUid, LJIIJJI, logPbString, linkedHashMap);
        C188727au c188727au = new C188727au();
        c188727au.LJFF(LIZ3.getPoiDeviceSameCity(), "poi_device_samecity");
        c188727au.LJIIIZ("poi_id", LIZ3.getPoiId());
        c188727au.LJIIIZ("poi_city", LIZ3.getPoiCityCode());
        c188727au.LJIIIZ("poi_region_code", LIZ3.getPoiRegionCode());
        c188727au.LJI("poi_info_source", LIZ3.getPoiInfoSource());
        String collectInfo = LIZ3.getCollectInfo();
        if (collectInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject(collectInfo);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (C78685UuP.LJJJZ(next) && (opt = jSONObject.opt(next)) != null) {
                        c188727au.LJI(next, opt.toString());
                    }
                }
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            C3C5.m6boximpl(LIZ2);
        }
        String logPb = c191857fx.getLogPb();
        if (logPb != null) {
            if (logPb.length() > 0) {
                z2 = true;
            }
            if (z2) {
                c188727au.LJI("log_pb", logPb);
            }
        }
        java.util.Map<String, Object> extraParam = c191857fx.getExtraParam();
        if (extraParam != null) {
            for (Map.Entry<String, Object> entry : extraParam.entrySet()) {
                if (!o.LJ(entry.getKey(), "event_track") && !o.LJ(entry.getKey(), "follow_status") && !o.LJ(entry.getKey(), "publish_consume_Interval")) {
                    c188727au.LJFF(entry.getValue(), entry.getKey());
                }
            }
        }
        c188727au.LJFF(c191857fx.getMultiAnchor(), "multi_anchor");
        c188727au.LJIIIZ("author_id", c191857fx.getAuthorId());
        c188727au.LJIIIZ("group_id", c191857fx.getGroupId());
        c188727au.LJIIIZ("music_id", c191857fx.getMusicId());
        OHI ohi = OHI.LIZ;
        AwemeHostApplication LIZ4 = FKM.LIZ();
        o.LJI(LIZ4);
        ohi.getClass();
        c188727au.LIZLLL(OHI.LJ(LIZ4, "android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0, "enable_location");
        java.util.Map<String, String> ret = c188727au.LIZ;
        o.LJIIIIZZ(ret, "ret");
        return ret;
    }
}
