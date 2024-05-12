package com.bytedance.android.live.rank.impl.list.controller;

import X.B3P;
import X.B57;
import X.BJM;
import X.BZI;
import X.C221108m2;
import X.C28643BLz;
import X.C29044Baa;
import X.C31522CYs;
import X.C31526CYw;
import X.C38354F3m;
import X.C51029K0z;
import X.C62822Ol8;
import X.C73943T0h;
import X.C77935UiJ;
import X.CN1;
import X.EnumC28203B5b;
import X.EnumC31514CYk;
import X.InterfaceC36571c5;
import X.InterfaceC78041Uk1;
import X.JBR;
import X.V0N;
import X.X1D;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.livesetting.rank.AutoRefreshRankListSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class RankListController extends IChildController {
    public final C31526CYw LJLJI;
    public final Fragment LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController, com.bytedance.android.live.rank.impl.list.controller.base.IBaseController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$liverank_impl_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$liverank_impl_release();
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final RankPageViewModel LIZIZ() {
        return ((RankPageController) this.LJLILLLLZI).LJIIJ();
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LJFF() {
        InterfaceC78041Uk1 interfaceC78041Uk1;
        InterfaceC36571c5 interfaceC36571c5 = this.LJLJJI;
        if ((interfaceC36571c5 instanceof InterfaceC78041Uk1) && (interfaceC78041Uk1 = (InterfaceC78041Uk1) interfaceC36571c5) != null) {
            interfaceC78041Uk1.M2();
        }
    }

    public final RankListViewModel LJII() {
        return (RankListViewModel) this.LJLJJL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$liverank_impl_release() {
        RankTypeV2 rankTypeV2 = this.LJLJI.LIZIZ;
        LJ(rankTypeV2.type, rankTypeV2.rankPhase, this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$liverank_impl_release() {
        RankTypeV2 rankTypeV2 = this.LJLJI.LIZIZ;
        LJI(rankTypeV2.type, rankTypeV2.rankPhase, this);
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LIZLLL(long j) {
        if (LJII().LJLILLLLZI != null && (this.LJLJJI instanceof VisibilityFragment)) {
            int i = AutoRefreshRankListSetting.INSTANCE.getConfig().hourly_rank;
            if (((VisibilityFragment) this.LJLJJI).vl() && i > 0 && j % i == 0) {
                LJIIIIZZ(false, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (r4.LJLILLLLZI == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.controller.RankListController.LJIIIIZZ(boolean, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankListController(C31526CYw rankTypeAll, Fragment fragment, RankPageController rankPageController) {
        super(rankPageController);
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        o.LJIIIZ(fragment, "fragment");
        this.LJLJI = rankTypeAll;
        this.LJLJJI = fragment;
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 176));
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LIZJ(RankListV2Response.RankInfo rank, C77935UiJ c77935UiJ, long[] jArr) {
        long j;
        long j2;
        String LJJ;
        o.LJIIIZ(rank, "rank");
        RankTypeV2 rankType = c77935UiJ.LIZ.LIZIZ;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LJLJJI);
        o.LJIIIZ(rankType, "rankType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from_merge", "live_detail");
        linkedHashMap.put("enter_method", rankType.rankName);
        linkedHashMap.put("anchor_id", String.valueOf(rank.user.getId()));
        linkedHashMap.put("room_id", String.valueOf(rank.roomId));
        linkedHashMap.put("action_type", "click");
        linkedHashMap.put("is_return", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("content_type", rankType.rankName);
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        linkedHashMap.put("from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        linkedHashMap.put("from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        Long l = rank.user.followStatus;
        if (l != null) {
            linkedHashMap.put("initial_follow_status", String.valueOf(l.longValue()));
        }
        BZI LIZLLL = C31522CYs.LIZLLL("livesdk_live_show", linkedHashMap);
        LIZLLL.LJIILLIIL(LJIILIIL);
        LIZLLL.LJJIIJZLJL();
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this.LJLJJI);
        boolean z = LIZ().LJLJI;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("rank", String.valueOf(rank.rank));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        linkedHashMap2.put("anchor_id", String.valueOf(j));
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        linkedHashMap2.put("room_id", String.valueOf(j2));
        linkedHashMap2.put("enter_from", "click");
        if (z) {
            linkedHashMap2.put("user_type", "anchor");
        } else {
            linkedHashMap2.put("enter_from_merge", BJM.LJFF());
            linkedHashMap2.put("enter_method", BJM.LJIIIIZZ());
            linkedHashMap2.put("user_type", "user");
        }
        BZI LIZLLL2 = C31522CYs.LIZLLL("livesdk_live_rank_click", linkedHashMap2);
        LIZLLL2.LJIILLIIL(LJIILIIL2);
        LIZLLL2.LJJIIJZLJL();
        C28643BLz c28643BLz = B57.LIZ;
        EnterRoomLinkSession LIZ = c28643BLz.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ2, this.LJLJI.LIZIZ.rankName, "_jump_other_room", LIZ2);
        EnumC28203B5b enumC28203B5b = EnumC28203B5b.BussinessApiCall;
        LIZ.LIZIZ(new Event(LJFF, 36608, enumC28203B5b));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (c77935UiJ.LJII) {
            LJJ = c77935UiJ.LIZ.LIZIZ.rankName;
        } else {
            LJJ = V0N.LJJ(this.LJLJI);
        }
        roomsData.enterMethod = LJJ;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        roomsData2.enterFromMerge = "live_detail";
        roomsData2.enterType = "click";
        enterRoomConfig.mLogData.anchorId = String.valueOf(rank.user.getId());
        enterRoomConfig.mLogData.requestId = rank.user.getRequestId();
        C31526CYw c31526CYw = this.LJLJI;
        EnumC31514CYk enumC31514CYk = c31526CYw.LIZ;
        EnumC31514CYk enumC31514CYk2 = EnumC31514CYk.GAME_RANK;
        if (enumC31514CYk == enumC31514CYk2) {
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            o.LJIIIZ(logData, "logData");
            if (c31526CYw.LIZ == enumC31514CYk2 && !o.LJ(c31526CYw.LIZIZ, c31526CYw.LIZLLL)) {
                logData.subGameRank = c31526CYw.LIZIZ.rankName;
            }
        }
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        roomsData3.needLandInteractFragment = true;
        if (jArr != null && jArr.length != 0) {
            roomsData3.roomIds = jArr;
            EnterRoomConfig enterRoomConfig2 = c28643BLz.LIZ().mEnterRoomConfig;
            String str = "";
            if (enterRoomConfig2 != null) {
                EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig2.mRoomsData;
                if (roomsData4.fromNewStyle) {
                    String str2 = roomsData4.feedUrl;
                    if (!C38354F3m.LJ(str2)) {
                        str = str2;
                    }
                }
            }
            roomsData3.feedUrl = str;
        }
        EnterRoomLinkSession LJI = EnterRoomLinkSession.LJI(enterRoomConfig);
        StringBuilder LIZ3 = X1D.LIZ();
        LJI.LIZIZ(new Event(JBR.LJFF(LIZ3, this.LJLJI.LIZIZ.rankName, "_jump_to_live", LIZ3), 3840, enumC28203B5b));
        C73943T0h.LIZ().LIZIZ(new B3P(rank.roomId, enterRoomConfig));
    }
}
