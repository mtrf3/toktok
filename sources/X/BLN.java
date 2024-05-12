package X;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class BLN implements BLR {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ java.util.Map LIZJ;
    public final /* synthetic */ long LIZLLL;

    @Override // X.BLR
    public final void LIZ(Throwable th) {
        BLM.LIZ = false;
        C30868C9o.LIZJ(R.string.sq8);
        C0NB.LJI("NewFeedStyleEntranceUtils", th);
    }

    @Override // X.BLR
    public final void LIZIZ(C28619BLb c28619BLb) {
        long j;
        boolean z;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Long LJJIZ;
        BLM.LIZ = false;
        String str = this.LIZ;
        long j2 = this.LIZIZ;
        java.util.Map map = this.LIZJ;
        long j3 = this.LIZLLL;
        if (c28619BLb == null || C32151Nz.LJJIIJZLJL(c28619BLb.LIZ) || ListProtector.get(c28619BLb.LIZ, 0) == null) {
            C30868C9o.LIZJ(R.string.sq8);
            return;
        }
        EnterRoomConfig LIZJ = BLM.LIZJ(c28619BLb.LIZ, c28619BLb.LIZIZ, BLM.LIZ(str), j3, map);
        LIZJ.mRoomsData.timeStamps.enterRoomStarTimeReal = j3;
        LIZJ.mLogData.toplivePosition = (String) map.get("toplive_position");
        BLM.LJ(j3, LIZJ);
        BLM.LIZLLL(c28619BLb.LIZ.size(), j2, "message");
        LIZJ.mRoomsData.roomId = ((FeedItem) ListProtector.get(c28619BLb.LIZ, 0)).item.getId();
        EnterRoomConfig.RoomsData roomsData = LIZJ.mRoomsData;
        roomsData.enterRoomScene = "outside_with_feed";
        String str2 = (String) map.get("gift_id");
        if (str2 != null && (LJJIZ = C38350F3i.LJJIZ(str2)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        roomsData.anchorGiftId = j;
        EnterRoomConfig.RoomsData roomsData2 = LIZJ.mRoomsData;
        String str3 = (String) map.get("gift_panel");
        if (str3 != null) {
            z = o.LJ(s.LJZ(str3), Boolean.TRUE);
        } else {
            z = false;
        }
        roomsData2.openGiftPanel = z;
        LIZJ.mLogData.enterGiftPanelSource = (String) map.get("enter_url_source");
        LIZJ.mLogData.enterLiveSquareSource = (String) map.get("enter_square_source");
        LIZJ.mRoomsData.openUrlLink = (String) map.get("open_url_link");
        EnterRoomConfig.LogData logData = LIZJ.mLogData;
        String str4 = (String) map.get("is_first_recharge");
        Integer num5 = null;
        if (str4 != null) {
            num = C38350F3i.LJJIL(str4);
        } else {
            num = null;
        }
        logData.isFirstRecharge = num;
        EnterRoomConfig.LogData logData2 = LIZJ.mLogData;
        String str5 = (String) map.get("recharge_package");
        if (str5 != null) {
            num2 = C38350F3i.LJJIL(str5);
        } else {
            num2 = null;
        }
        logData2.rechargePackage = num2;
        LIZJ.mLogData.rechargeType = (String) map.get("recharge_type");
        EnterRoomConfig.LogData logData3 = LIZJ.mLogData;
        String str6 = (String) map.get("balance_live_line");
        if (str6 != null) {
            num3 = C38350F3i.LJJIL(str6);
        } else {
            num3 = null;
        }
        logData3.balanceLiveLine = num3;
        EnterRoomConfig.LogData logData4 = LIZJ.mLogData;
        String str7 = (String) map.get("balance_live_position");
        if (str7 != null) {
            num4 = C38350F3i.LJJIL(str7);
        } else {
            num4 = null;
        }
        logData4.balanceLivePosition = num4;
        EnterRoomConfig.LogData logData5 = LIZJ.mLogData;
        String str8 = (String) map.get("is_consume_new_user");
        if (str8 != null) {
            num5 = C38350F3i.LJJIL(str8);
        }
        logData5.isConsumeNewUser = num5;
        FeedItem feedItem = (FeedItem) ListProtector.get(c28619BLb.LIZ, 0);
        if (feedItem != null && feedItem.getRoom() != null && feedItem.getRoom().getOwner() != null && feedItem.getRoom().getOwner().getFollowInfo() != null) {
            LIZJ.mRoomsData.followStatus = String.valueOf(feedItem.getRoom().getOwner().getFollowInfo().getFollowStatus());
        }
        ((IHostWatch) CN1.LIZ(IHostWatch.class)).watchLive(C15380j0.LIZLLL(), LIZJ);
    }

    public BLN(String str, long j, java.util.Map map, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = map;
        this.LIZLLL = j2;
    }
}
