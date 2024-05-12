package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.feed.LiveForuTopLivesEnterOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import defpackage.i0;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BLM {
    public static boolean LIZ;
    public static C73411SrX LIZIZ;

    public static void LIZIZ() {
        C73411SrX c73411SrX = LIZIZ;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            LIZIZ.dispose();
            LIZIZ = null;
        }
    }

    public static String LIZ(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("/webcast/feed/")) {
            if ((((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) && !str.contains("&debug=true")) {
                return i0.LJFF(str, "&debug=true");
            }
            return str;
        }
        return str;
    }

    public static void LJFF(long j) {
        if (LiveForuTopLivesEnterOptSetting.INSTANCE.enable()) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.roomId = j;
            roomsData.timeStamps.enterRoomStarTimeReal = System.currentTimeMillis();
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.enterFromMerge = "live_merge";
            roomsData2.enterMethod = "live_cover";
            roomsData2.enterRoomScene = "outside_with_feed";
            ((IHostWatch) CN1.LIZ(IHostWatch.class)).watchLive(C15380j0.LIZLLL(), enterRoomConfig);
        }
    }

    public static void LJ(long j, EnterRoomConfig enterRoomConfig) {
        HashMap hashMap = new HashMap();
        if (j > 0) {
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - j));
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("anchor_id", enterRoomConfig.mLogData.anchorId);
            hashMap.put("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId));
            hashMap.put("request_id", enterRoomConfig.mLogData.requestId);
            hashMap.put("action_type", "click");
            hashMap.put("live_window_mode", "full_screen");
            hashMap.put("log_pb", enterRoomConfig.mLogData.logPb);
            hashMap.put("live_type", enterRoomConfig.mRoomsData.streamType.logStreamingType);
            AnonymousClass172.LIZ("livesdk_new_style_feed_duration", hashMap);
        }
    }

    public static void LIZLLL(int i, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_from", str);
            jSONObject.put("feed_count", i);
        } catch (JSONException unused) {
        }
        C0K2.LJIIJ(0, SystemClock.elapsedRealtime() - j, O5Y.LJJL("ttlive_toplives_query_feed_api"), jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0091, code lost:
    
        if (r5 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdkapi.session.EnterRoomConfig LIZJ(java.util.List<com.bytedance.android.livesdk.model.FeedItem> r16, com.bytedance.android.live.base.model.feed.FeedExtra r17, java.lang.String r18, long r19, java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BLM.LIZJ(java.util.List, com.bytedance.android.live.base.model.feed.FeedExtra, java.lang.String, long, java.util.Map):com.bytedance.android.livesdkapi.session.EnterRoomConfig");
    }
}
