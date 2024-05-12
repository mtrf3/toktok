package X;

import Y.ARunnableS0S0001000_5;
import com.bytedance.android.livesdk.livesetting.feed.LiveForuTopLivesEnterOptSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BLO implements BLR {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ java.util.Map LIZJ;
    public final /* synthetic */ long LIZLLL;

    @Override // X.BLR
    public final void LIZ(Throwable th) {
        if (LiveForuTopLivesEnterOptSetting.INSTANCE.enable()) {
            ((IHostAction) CN1.LIZ(IHostAction.class)).addPauseTask(new ARunnableS0S0001000_5(0, 4));
        } else {
            BLM.LIZ = false;
        }
        BLM.LJFF(-4L);
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.jv4));
        Event event = new Event("webcast_feed_api_fail", 36865, EnumC28203B5b.ServerApiCall);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("feed api request has some error, ");
        LIZ.append(th.getMessage());
        event.LIZIZ(X1D.LIZIZ(LIZ));
        B57.LIZ.LIZ().LIZIZ(event);
        C0NB.LJI("NewFeedStyleEntranceUtils", th);
        BLM.LIZIZ();
    }

    @Override // X.BLR
    public final void LIZIZ(C28619BLb c28619BLb) {
        ((IHostAction) CN1.LIZ(IHostAction.class)).addPauseTask(new ARunnableS0S0001000_5(0, 3));
        if (c28619BLb == null || C32151Nz.LJJIIJZLJL(c28619BLb.LIZ) || ListProtector.get(c28619BLb.LIZ, 0) == null) {
            BLM.LJFF(-4L);
            Event event = new Event("webcast_feed_api_fail", 36866, EnumC28203B5b.ServerApiCall);
            event.LIZIZ("feed data is empty");
            B57.LIZ.LIZ().LIZIZ(event);
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.jv4));
            return;
        }
        EnterRoomConfig LIZJ = BLM.LIZJ(c28619BLb.LIZ, c28619BLb.LIZIZ, this.LIZ, this.LIZIZ, this.LIZJ);
        EnterRoomConfig.TimeStamp timeStamp = LIZJ.mRoomsData.timeStamps;
        long j = this.LIZLLL;
        timeStamp.enterRoomStarTimeReal = j;
        BLM.LJ(j, LIZJ);
        LIZJ.mLogData.toplivePosition = (String) this.LIZJ.get("toplive_position");
        B57.LIZ.LIZ().LIZIZ(new Event("webcast_feed_api_success", 4096, EnumC28203B5b.ServerApiCall));
        EnterRoomConfig.RoomsData roomsData = LIZJ.mRoomsData;
        roomsData.enterRoomScene = "outside_with_feed";
        roomsData.roomId = ((FeedItem) ListProtector.get(c28619BLb.LIZ, 0)).item.getId();
        FeedItem feedItem = (FeedItem) ListProtector.get(c28619BLb.LIZ, 0);
        if (feedItem != null && feedItem.getRoom() != null && feedItem.getRoom().getOwner() != null && feedItem.getRoom().getOwner().getFollowInfo() != null) {
            LIZJ.mRoomsData.followStatus = String.valueOf(feedItem.getRoom().getOwner().getFollowInfo().getFollowStatus());
        }
        BLM.LIZLLL(c28619BLb.LIZ.size(), this.LIZLLL, "homepage_hot");
        ((IHostWatch) CN1.LIZ(IHostWatch.class)).watchLive(C15380j0.LIZLLL(), LIZJ);
        BLM.LIZIZ();
    }

    public BLO(String str, long j, java.util.Map map, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = map;
        this.LIZLLL = j2;
    }
}
