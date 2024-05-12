package X;

import com.bytedance.android.livesdk.livesetting.other.ReportLiveBubbleDataSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleExtra;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LogPb;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LQ2 {
    public static boolean LIZ;
    public static int LIZIZ;
    public static String LIZJ = "";
    public static long LIZLLL;
    public static String LJ;

    public static String LIZ() {
        if (LIZIZ <= 0) {
            return null;
        }
        if (LIZ) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static void LIZJ() {
        String str;
        String str2;
        Long l;
        Room roomData;
        Room roomData2;
        LogPb logPb;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_rec_toplive_bubble");
        LiveBubbleData liveBubbleData = LQM.LJI;
        if (liveBubbleData != null && liveBubbleData.getShowHead()) {
            str = "head";
        } else {
            str = "icon";
        }
        LIZ2.LJIJJ(str, "live_bubble_mode");
        LIZ2.LJIJJ(LIZ(), "is_title_run");
        LIZ2.LJIJJ(LIZJ, "click_area");
        LiveBubbleExtra liveBubbleExtra = LQM.LJII;
        Long l2 = null;
        if (liveBubbleExtra != null && (logPb = liveBubbleExtra.getLogPb()) != null) {
            str2 = logPb.getImprId();
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(str2, "request_id");
        LiveBubbleData liveBubbleData2 = LQM.LJI;
        if (liveBubbleData2 != null && (roomData2 = liveBubbleData2.getRoomData()) != null) {
            l = Long.valueOf(roomData2.getId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "room_id");
        LiveBubbleData liveBubbleData3 = LQM.LJI;
        if (liveBubbleData3 != null && (roomData = liveBubbleData3.getRoomData()) != null) {
            l2 = Long.valueOf(roomData.getOwnerUserId());
        }
        LIZ2.LJIJJ(l2, "anchor_id");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(String str) {
        String str2;
        String str3;
        Long l;
        Room roomData;
        Room roomData2;
        LogPb logPb;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_toplive_bubble_avoid");
        LiveBubbleData liveBubbleData = LQM.LJI;
        if (liveBubbleData != null && liveBubbleData.getShowHead()) {
            str2 = "head";
        } else {
            str2 = "icon";
        }
        LIZ2.LJIJJ(str2, "live_bubble_mode");
        LIZ2.LJIJJ(LIZ(), "is_title_run");
        LIZ2.LJIJJ(str, "avoid_reason");
        I9A.LIZ(System.currentTimeMillis(), LIZLLL, LIZ2, "bubble_show_duration");
        LiveBubbleExtra liveBubbleExtra = LQM.LJII;
        Long l2 = null;
        if (liveBubbleExtra != null && (logPb = liveBubbleExtra.getLogPb()) != null) {
            str3 = logPb.getImprId();
        } else {
            str3 = null;
        }
        LIZ2.LJIJJ(str3, "request_id");
        LiveBubbleData liveBubbleData2 = LQM.LJI;
        if (liveBubbleData2 != null && (roomData2 = liveBubbleData2.getRoomData()) != null) {
            l = Long.valueOf(roomData2.getId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "room_id");
        LiveBubbleData liveBubbleData3 = LQM.LJI;
        if (liveBubbleData3 != null && (roomData = liveBubbleData3.getRoomData()) != null) {
            l2 = Long.valueOf(roomData.getOwnerUserId());
        }
        LIZ2.LJIJJ(l2, "anchor_id");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(String str) {
        if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_bubble_setting_avoid") || !ReportLiveBubbleDataSetting.INSTANCE.getValue()) {
            return;
        }
        C78920UyC.LJI("livesdk_bubble_setting_avoid", str, "avoid_reason");
    }

    public static void LJ(String str) {
        Long l;
        Long l2;
        String str2;
        LogPb logPb;
        Room roomData;
        Room roomData2;
        BZI LIZ2 = C28787BRn.LIZ(str);
        LiveBubbleData liveBubbleData = LQM.LJI;
        String str3 = null;
        if (liveBubbleData != null && (roomData2 = liveBubbleData.getRoomData()) != null) {
            l = Long.valueOf(roomData2.getId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "room_id");
        LiveBubbleData liveBubbleData2 = LQM.LJI;
        if (liveBubbleData2 != null && (roomData = liveBubbleData2.getRoomData()) != null) {
            l2 = Long.valueOf(roomData.getOwnerUserId());
        } else {
            l2 = null;
        }
        LIZ2.LJIJJ(l2, "anchor_id");
        LiveBubbleData liveBubbleData3 = LQM.LJI;
        if (liveBubbleData3 != null && liveBubbleData3.getShowHead()) {
            str2 = "head";
        } else {
            str2 = "icon";
        }
        LIZ2.LJIJJ(str2, "live_bubble_mode");
        LIZ2.LJIJJ(LIZ(), "is_title_run");
        LiveBubbleExtra liveBubbleExtra = LQM.LJII;
        if (liveBubbleExtra != null && (logPb = liveBubbleExtra.getLogPb()) != null) {
            str3 = logPb.getImprId();
        }
        LIZ2.LJIJJ(str3, "request_id");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJFF(String eventName) {
        o.LJIIIZ(eventName, "eventName");
        C28733BPl.LJIILIIL().getClass();
        C0NE.LJII("ttlive_eventlog", eventName);
    }
}
