package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ad.feed.reminder.AdNoticeApi;
import com.ss.android.ugc.aweme.ad.feed.reminder.NoticeUpdateApi;
import com.ss.android.ugc.aweme.feed.model.AdNoticeModel;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OCX {
    public C73411SrX LIZ;
    public C73411SrX LIZIZ;
    public C73411SrX LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(OCY.LJLIL);

    public OCX(ActivityC45651qj activityC45651qj) {
    }

    public final void LIZ(String uid, String str, InterfaceC64592gB<NewLiveRoomStruct> interfaceC64592gB, InterfaceC64592gB<Throwable> interfaceC64592gB2) {
        long j;
        InterfaceC92693kP interfaceC92693kP;
        C86393XvR LJJIJIL;
        o.LJIIIZ(uid, "uid");
        try {
            j = CastLongProtector.parseLong(uid);
        } catch (Exception unused) {
            j = 0;
        }
        C73411SrX c73411SrX = this.LIZIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            interfaceC92693kP = LJJIJIL.LJZL(j, str).LJJJLIIL(interfaceC64592gB, interfaceC64592gB2);
        } else {
            interfaceC92693kP = null;
        }
        this.LIZIZ = (C73411SrX) interfaceC92693kP;
    }

    public final void LIZIZ(int i, String cId, InterfaceC64592gB<AdNoticeModel> interfaceC64592gB, InterfaceC64592gB<Throwable> interfaceC64592gB2) {
        o.LJIIIZ(cId, "cId");
        C73411SrX c73411SrX = this.LIZJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LIZJ = (C73411SrX) ((AdNoticeApi) C45336Hqm.LIZIZ(AdNoticeApi.class, C42952GtQ.LIZ)).getAdNotice(i, cId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(interfaceC64592gB, interfaceC64592gB2);
    }

    public static void LIZJ(ActivityC45651qj context, String enterFrom, String liveUid, String str, NewLiveRoomStruct newStruct) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(liveUid, "liveUid");
        o.LJIIIZ(newStruct, "newStruct");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        if (o.LJ(enterFrom, "message_ad")) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterFromMerge = "message";
            roomsData.enterMethod = "countdown_sticker";
        } else {
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.enterFromMerge = "feed";
            roomsData2.enterMethod = "countdown_sticker";
        }
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        roomsData3.userId = liveUid;
        roomsData3.secUid = str;
        LiveOuterService.LJJJLL().LJIILL().LJIILLIIL(context, newStruct, enterRoomConfig);
    }

    public final void LIZLLL(int i, String str, String str2, Boolean bool, InterfaceC64592gB<AdNoticeModel> interfaceC64592gB, InterfaceC64592gB<Throwable> interfaceC64592gB2) {
        C73411SrX c73411SrX = this.LIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LIZ = (C73411SrX) ((NoticeUpdateApi) C45336Hqm.LIZ(NoticeUpdateApi.class)).postAdNotice(i, str, bool, str2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(interfaceC64592gB, interfaceC64592gB2);
    }
}
