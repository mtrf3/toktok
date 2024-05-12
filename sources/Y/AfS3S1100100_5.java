package Y;

import X.BDB;
import X.BDS;
import X.BL6;
import X.BLG;
import X.BLU;
import X.BLV;
import X.BLX;
import X.BR4;
import X.C07670Rv;
import X.C0K2;
import X.C0NB;
import X.C16880lQ;
import X.C28238B6k;
import X.C28259B7f;
import X.C29022BaE;
import X.C29084BbE;
import X.C32537Cpp;
import X.C38354F3m;
import X.C74012vN;
import X.C780334l;
import X.CN1;
import X.InterfaceC64592gB;
import X.ORZ;
import X.X1D;
import X.XKX;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.RevenueAuthSuccessEvent;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdk.livesetting.feed.GameLiveBottomBarSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.api.envelope.RevenuePermissionResponse;

/* loaded from: classes6.dex */
public class AfS3S1100100_5 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS3S1100100_5 r7, java.lang.Object r8) {
        /*
            com.bytedance.android.live.network.response.BaseResponse r8 = (com.bytedance.android.live.network.response.BaseResponse) r8
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r1 = r0.finishType
            r0 = 4
            if (r1 != r0) goto L20
            java.lang.Object r0 = r7.l1
            com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment r0 = (com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LJIIL()
            java.lang.Class<X.BCX> r0 = X.BCX.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.live.gift.IGiftService r0 = X.C7N.LJIIIIZZ()
            r0.logBoostCardLiveEndShow()
        L20:
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L39
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r0.confirmBox
            if (r0 == 0) goto L39
            java.lang.String r2 = r0.title
            if (r2 == 0) goto L39
            java.lang.String r1 = r7.s0
            int r0 = r2.length()
            if (r0 != 0) goto L3b
            r2 = r1
            if (r1 != 0) goto L3b
        L39:
            java.lang.String r2 = r7.s0
        L3b:
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r1 = r0.finishType
            r0 = 6
            if (r1 == r0) goto L47
            r0 = 5
            if (r1 != r0) goto L6d
        L47:
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            java.lang.String r0 = "getService(T::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService r1 = (com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService) r1
            r1.Rv()
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r0 = r0.finishType
            boolean r0 = X.C28959BYd.LIZJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C29306Beo.LJIILLIIL(r0)
            if (r0 == 0) goto L6d
            java.lang.String r2 = r7.s0
        L6d:
            java.lang.Object r1 = r7.l1
            com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment r1 = (com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment) r1
            long r3 = r7.j2
            r5 = 1
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r0 = r0.finishType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r0.confirmBox
            if (r0 == 0) goto L8c
            long r7 = r0.value
        L88:
            r1.zm(r2, r3, r5, r6, r7)
            return
        L8c:
            r7 = 0
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S1100100_5.accept$0(Y.AfS3S1100100_5, java.lang.Object):void");
    }

    public static final void accept$1(AfS3S1100100_5 afS3S1100100_5, Object obj) {
        ((LiveBroadcastFragment) afS3S1100100_5.l1).zm(afS3S1100100_5.s0, afS3S1100100_5.j2, false, 0, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS3S1100100_5 afS3S1100100_5, Object obj) {
        Object obj2;
        boolean contains;
        ArrayList arrayList;
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = (MultiPlusFeedRoomListProvider) afS3S1100100_5.l1;
        long j = afS3S1100100_5.j2;
        String str = afS3S1100100_5.s0;
        BLU blu = (BLU) obj;
        multiPlusFeedRoomListProvider.getClass();
        if (blu != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long uptimeMillis = SystemClock.uptimeMillis();
            BLV blv = new BLV();
            blv.LIZ = "draw";
            blv.LIZLLL = blu.LIZLLL;
            blv.LJ = "/webcast/feed/";
            blv.LJFF = blu.LJFF;
            BLX.LIZ(j, currentTimeMillis, uptimeMillis, blv.LIZ(), blu.LIZIZ, blu.LIZJ);
            multiPlusFeedRoomListProvider.LLFII = blu.LIZLLL;
        }
        Pair pair = (Pair) blu.LIZ;
        if (pair == null || (obj2 = pair.second) == null) {
            multiPlusFeedRoomListProvider.LJLJL = false;
            return;
        }
        multiPlusFeedRoomListProvider.LJLL = (FeedExtra) obj2;
        if (str == null || !GameLiveBottomBarSetting.INSTANCE.isEnable()) {
            contains = false;
        } else {
            contains = BL6.LIZIZ.contains(str);
        }
        if (contains && !multiPlusFeedRoomListProvider.LLFF && !multiPlusFeedRoomListProvider.LJLL.hasMore) {
            multiPlusFeedRoomListProvider.LLFF = true;
        }
        List<FeedItem> list = (List) pair.first;
        FeedExtra feedExtra = (FeedExtra) pair.second;
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            for (FeedItem feedItem : list) {
                if (feedItem.item == null) {
                    try {
                        Room room = feedItem.getRoom();
                        feedItem.item = room;
                        int i = feedItem.type;
                        if ((i == 1 || i == 2) && (room instanceof Room)) {
                            room.setLog_pb(feedItem.logPb);
                            room.getOwner().setLogPb(feedItem.logPb);
                            room.setRequestId(feedItem.resId);
                            room.isFromRecommendCard = feedItem.isRecommendCard;
                            feedItem.item = room;
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                BLG blg = feedItem.item;
                if (blg instanceof Room) {
                    Room room2 = (Room) blg;
                    if (multiPlusFeedRoomListProvider.LJLLLL.longValue() == room2.getOwner().getLiveRoomId()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Remove duplicate room ");
                        C07670Rv.LJ(LIZ, multiPlusFeedRoomListProvider.LJLLLL, LIZ, "MultiPlusFeedRoomListProvider");
                    } else if (!multiPlusFeedRoomListProvider.LJZL.contains(Long.valueOf(room2.getId()))) {
                        EnterRoomConfig LIZJ = C28238B6k.LIZJ(false, room2);
                        if (C38354F3m.LJ(LIZJ.mStreamData.pullStreamData) && C38354F3m.LJ(LIZJ.mStreamData.pullStreamUrl)) {
                            z = true;
                        }
                        FlareInfo flareInfo = feedItem.flareInfo;
                        if (flareInfo != null) {
                            EnterRoomConfig.RoomsData roomsData = LIZJ.mRoomsData;
                            roomsData.isShowFlare = flareInfo.isFlare;
                            roomsData.flareTaskId = flareInfo.taskId;
                        }
                        LIZJ.mRoomsData.isFresh = feedItem.isFresh;
                        multiPlusFeedRoomListProvider.LJZL.add(Long.valueOf(room2.getId()));
                        boolean z2 = multiPlusFeedRoomListProvider.LJLLI;
                        if (z2) {
                            EnterRoomConfig.RoomsData roomsData2 = LIZJ.mRoomsData;
                            roomsData2.fromNewStyle = z2;
                            roomsData2.fromDrawerStyle = multiPlusFeedRoomListProvider.LJLLILLLL;
                            roomsData2.enterFromLiveSource = multiPlusFeedRoomListProvider.LJLLJ;
                            roomsData2.feedUrl = multiPlusFeedRoomListProvider.LJZI;
                            roomsData2.windowMode = "full_screen";
                        }
                        ((ArrayList) multiPlusFeedRoomListProvider.LJLLLLLL).add(room2);
                        ((ArrayList) multiPlusFeedRoomListProvider.LJLZ).add(LIZJ);
                        if (feedExtra != null && !TextUtils.isEmpty(feedExtra.unreadExtra)) {
                            LIZJ.mRoomsData.unreadExtra = feedExtra.unreadExtra;
                        }
                        EnterRoomConfig enterRoomConfig = multiPlusFeedRoomListProvider.LJLJJLL;
                        if (enterRoomConfig != null) {
                            LIZJ.mRoomsData.gameLiveExtra = enterRoomConfig.mRoomsData.gameLiveExtra;
                        }
                    }
                }
            }
            if (z) {
                HashMap hashMap = new HashMap();
                hashMap.put("logid", C28259B7f.LIZIZ.LIZ.get("/webcast/feed/"));
                C0K2.LJII(0, "ttlive_webcast_feed_empty_stream", hashMap);
            }
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    FeedItem feedItem2 = (FeedItem) ListProtector.get(list, i2);
                    if (feedItem2 != null && feedItem2.getRoom() != null) {
                        multiPlusFeedRoomListProvider.LJLILLLLZI.put(Long.valueOf(feedItem2.getRoom().getId()), feedItem2.debugInfo);
                    }
                }
            }
        }
        if (BL6.LIZ(multiPlusFeedRoomListProvider.LJLJJLL)) {
            EnterRoomConfig enterRoomConfig2 = multiPlusFeedRoomListProvider.LJLJJLL;
            List<Room> list2 = multiPlusFeedRoomListProvider.LJLLLLLL;
            if (enterRoomConfig2 != null && list2 != null) {
                long[] jArr = enterRoomConfig2.mRoomsData.roomIds;
                if (jArr != null) {
                    arrayList = new ArrayList(jArr.length);
                    for (long j2 : jArr) {
                        arrayList.add(Long.valueOf(j2));
                    }
                } else {
                    arrayList = new ArrayList();
                }
                Iterator it = ((ArrayList) list2).iterator();
                while (it.hasNext()) {
                    Room room3 = (Room) it.next();
                    if (!arrayList.contains(Long.valueOf(room3.getId()))) {
                        arrayList.add(Long.valueOf(room3.getId()));
                    }
                }
                enterRoomConfig2.mRoomsData.roomIds = ORZ.LLJIJIL(arrayList);
            }
        }
        multiPlusFeedRoomListProvider.LJIIJJI();
        multiPlusFeedRoomListProvider.LJLJL = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$3(Y.AfS3S1100100_5 r7, java.lang.Object r8) {
        /*
            com.bytedance.android.live.network.response.BaseResponse r8 = (com.bytedance.android.live.network.response.BaseResponse) r8
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r1 = r0.finishType
            r0 = 4
            if (r1 != r0) goto L12
            com.bytedance.android.live.gift.IGiftService r0 = X.C7N.LJIIIIZZ()
            r0.logBoostCardLiveEndShow()
        L12:
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L2b
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r0.confirmBox
            if (r0 == 0) goto L2b
            java.lang.String r2 = r0.title
            if (r2 == 0) goto L2b
            java.lang.String r1 = r7.s0
            int r0 = r2.length()
            if (r0 != 0) goto L2d
            r2 = r1
            if (r1 != 0) goto L2d
        L2b:
            java.lang.String r2 = r7.s0
        L2d:
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r1 = r0.finishType
            r0 = 6
            if (r1 == r0) goto L39
            r0 = 5
            if (r1 != r0) goto L5f
        L39:
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            java.lang.String r0 = "getService(T::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService r1 = (com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService) r1
            r1.Rv()
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r0 = r0.finishType
            boolean r0 = X.C28959BYd.LIZJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C29306Beo.LJIILLIIL(r0)
            if (r0 == 0) goto L5f
            java.lang.String r2 = r7.s0
        L5f:
            java.lang.Object r1 = r7.l1
            X.BbE r1 = (X.C29084BbE) r1
            java.lang.String r0 = "showMsg"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            long r3 = r7.j2
            r5 = 1
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r0 = r0.finishType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r0.confirmBox
            if (r0 == 0) goto L83
            long r7 = r0.value
        L7f:
            r1.LJ(r2, r3, r5, r6, r7)
            return
        L83:
            r7 = 0
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S1100100_5.accept$3(Y.AfS3S1100100_5, java.lang.Object):void");
    }

    public static final void accept$4(AfS3S1100100_5 afS3S1100100_5, Object obj) {
        C29084BbE c29084BbE = (C29084BbE) afS3S1100100_5.l1;
        String defaultMsg = afS3S1100100_5.s0;
        o.LJIIIIZZ(defaultMsg, "defaultMsg");
        c29084BbE.LJ(defaultMsg, afS3S1100100_5.j2, false, 0, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$5(Y.AfS3S1100100_5 r7, java.lang.Object r8) {
        /*
            com.bytedance.android.live.network.response.BaseResponse r8 = (com.bytedance.android.live.network.response.BaseResponse) r8
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r1 = r0.finishType
            r0 = 4
            if (r1 != r0) goto L12
            com.bytedance.android.live.gift.IGiftService r0 = X.C7N.LJIIIIZZ()
            r0.logBoostCardLiveEndShow()
        L12:
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L2b
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r0.confirmBox
            if (r0 == 0) goto L2b
            java.lang.String r2 = r0.title
            if (r2 == 0) goto L2b
            java.lang.String r1 = r7.s0
            int r0 = r2.length()
            if (r0 != 0) goto L2d
            r2 = r1
            if (r1 != 0) goto L2d
        L2b:
            java.lang.String r2 = r7.s0
        L2d:
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r1 = r0.finishType
            r0 = 6
            if (r1 == r0) goto L39
            r0 = 5
            if (r1 != r0) goto L5f
        L39:
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            java.lang.String r0 = "getService(T::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService r1 = (com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService) r1
            r1.Rv()
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r0 = r0.finishType
            boolean r0 = X.C28959BYd.LIZJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C29306Beo.LJIILLIIL(r0)
            if (r0 == 0) goto L5f
            java.lang.String r2 = r7.s0
        L5f:
            java.lang.Object r1 = r7.l1
            com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment r1 = (com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment) r1
            long r3 = r7.j2
            r5 = 1
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r0 = r0.finishType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            T r0 = r8.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r0.confirmBox
            if (r0 == 0) goto L7e
            long r7 = r0.value
        L7a:
            r1.nm(r2, r3, r5, r6, r7)
            return
        L7e:
            r7 = 0
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S1100100_5.accept$5(Y.AfS3S1100100_5, java.lang.Object):void");
    }

    public static final void accept$6(AfS3S1100100_5 afS3S1100100_5, Object obj) {
        ((VoiceChatBroadcastFragment) afS3S1100100_5.l1).nm(afS3S1100100_5.s0, afS3S1100100_5.j2, false, 0, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.Long, java.lang.Boolean>, O] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map<java.lang.Long, java.lang.Boolean>, O] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Boolean, O] */
    public static final void accept$7(AfS3S1100100_5 afS3S1100100_5, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = (DataChannel) afS3S1100100_5.l1;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(BDS.class)).LIZ = Boolean.TRUE;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        RevenuePermissionResponse.ResponseData responseData = (RevenuePermissionResponse.ResponseData) baseResponse.data;
        if (responseData != null) {
            DataChannel dataChannel2 = (DataChannel) afS3S1100100_5.l1;
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C74012vN(dataChannel2, null), 3);
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29022BaE.class)).LIZ = responseData.envelopePermission;
            if (dataChannel2 != null) {
                ((C32537Cpp) dataChannel2.gv0(BDB.class)).LIZ = responseData.goodyBagPermission;
            }
            Map<Long, Boolean> map = responseData.envelopePermission;
            if (map != null) {
                for (Long l : map.keySet()) {
                    if (o.LJ(map.get(l), Boolean.TRUE)) {
                        arrayList.add(l);
                    }
                }
            }
            Map<Long, Boolean> map2 = responseData.goodyBagPermission;
            if (map2 != null) {
                for (Long l2 : map2.keySet()) {
                    if (o.LJ(map2.get(l2), Boolean.TRUE)) {
                        arrayList2.add(l2);
                    }
                }
            }
        } else {
            C0NB.LJ("twr:RedEnvelopePermission", "err info: empty permissionMap");
        }
        BR4.LJII(Integer.valueOf(baseResponse.statusCode), arrayList, arrayList2, afS3S1100100_5.s0, baseResponse.LIZIZ, afS3S1100100_5.j2);
    }

    public static final void accept$8(AfS3S1100100_5 afS3S1100100_5, Object obj) {
        BR4.LJII(-1, new ArrayList(), new ArrayList(), afS3S1100100_5.s0, null, afS3S1100100_5.j2);
        DataChannel dataChannel = (DataChannel) afS3S1100100_5.l1;
        if (dataChannel != null) {
            dataChannel.qv0(RevenueAuthSuccessEvent.class, Boolean.FALSE);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("err stack: ");
        LIZ.append(obj);
        C0NB.LJ("twr:RedEnvelopePermission", X1D.LIZIZ(LIZ));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS3S1100100_5(long r2, com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 5: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r4
            r0.s0 = r5
            r0.j2 = r2
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.s0 = r5
            r0.l1 = r4
            r0.j2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S1100100_5.<init>(long, com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS3S1100100_5(long r2, com.bytedance.ies.sdk.datachannel.DataChannel r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 7: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r5
            r0.j2 = r2
            r0.l1 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r4
            r0.s0 = r5
            r0.j2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S1100100_5.<init>(long, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, int):void");
    }

    public AfS3S1100100_5(Object obj, String str, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.j2 = j;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS3S1100100_5(long r2, X.C29084BbE r4, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r5, java.lang.String r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            switch(r7) {
                case 3: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r4
            r0.s0 = r6
            r0.j2 = r2
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.s0 = r6
            r0.l1 = r4
            r0.j2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S1100100_5.<init>(long, X.BbE, com.bytedance.android.livesdkapi.depend.model.live.LiveMode, java.lang.String, int):void");
    }
}
