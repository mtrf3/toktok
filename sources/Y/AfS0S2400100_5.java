package Y;

import X.BLG;
import X.BZI;
import X.C09650Zl;
import X.C0NB;
import X.C15380j0;
import X.C28238B6k;
import X.C28787BRn;
import X.C30868C9o;
import X.C31057CGv;
import X.C31058CGw;
import X.C47261Igj;
import X.C68322mC;
import X.C72242sW;
import X.C78461Uqn;
import X.C78469Uqv;
import X.CN1;
import X.InterfaceC30977CDt;
import X.InterfaceC31557Ca1;
import X.InterfaceC64592gB;
import X.ORZ;
import X.OSZ;
import android.content.Context;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* loaded from: classes6.dex */
public class AfS0S2400100_5 implements InterfaceC64592gB {
    public final int $t;
    public long j6;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S2400100_5 afS0S2400100_5, Object obj) {
        Room room;
        Room room2;
        Boolean bool;
        boolean z;
        String str;
        String str2;
        long[] jArr;
        OSZ osz = (OSZ) obj;
        Collection collection = (Collection) osz.getFirst();
        if (collection == null || collection.isEmpty()) {
            C0NB.LJ("LiveWatcherUtils", "response is null: watch fake live");
            EnterRoomConfig LIZLLL = C78469Uqv.LIZLLL(-4L, afS0S2400100_5.s0, afS0S2400100_5.s1);
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.jv4));
            ((C78461Uqn) afS0S2400100_5.l2).LJIILJJIL((Context) afS0S2400100_5.l3, LIZLLL);
            return;
        }
        List list = (List) osz.getFirst();
        Object second = osz.getSecond();
        o.LJIIIIZZ(second, "it.second");
        FeedExtra feedExtra = (FeedExtra) second;
        String str3 = (String) ((C68322mC) afS0S2400100_5.l4).element;
        long j = afS0S2400100_5.j6;
        String str4 = afS0S2400100_5.s1;
        String str5 = afS0S2400100_5.s0;
        if (list == null || list.isEmpty()) {
            return;
        }
        FeedItem feedItem = (FeedItem) ListProtector.get(list, 0);
        boolean z2 = ((FeedItem) ListProtector.get(list, 0)).isRecommendCard;
        BLG blg = feedItem.item;
        if (blg instanceof Room) {
            room = (Room) blg;
        } else {
            room = null;
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C28238B6k.LIZLLL(room, enterRoomConfig);
        BLG blg2 = feedItem.item;
        if (blg2 instanceof Room) {
            room2 = (Room) blg2;
        } else {
            room2 = null;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (roomsData != null) {
            if (room2 != null) {
                bool = Boolean.valueOf(room2.hasCommerceGoods);
            } else {
                bool = null;
            }
            roomsData.hasCommerceGoods = bool;
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (roomsData2 != null) {
            FlareInfo flareInfo = feedItem.flareInfo;
            if (flareInfo != null) {
                z = flareInfo.isFlare;
            } else {
                z = false;
            }
            roomsData2.isShowFlare = z;
            FlareInfo flareInfo2 = feedItem.flareInfo;
            if (flareInfo2 != null) {
                str = flareInfo2.taskId;
            } else {
                str = null;
            }
            roomsData2.flareTaskId = str;
            roomsData2.isFresh = feedItem.isFresh;
            roomsData2.feedUrl = str3;
            roomsData2.fromNewStyle = true;
            roomsData2.windowMode = "full_screen";
        }
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        if (logData != null) {
            logData.loadDuration = j;
        }
        if (roomsData2 != null) {
            roomsData2.enterFromMerge = str5;
            roomsData2.enterMethod = str4;
            if (z2) {
                str2 = "pop_card";
            } else {
                str2 = null;
            }
            roomsData2.enterFromMergeRecommend = str2;
            roomsData2.roomIds = new long[list.size()];
        }
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        if (roomsData3 != null) {
            roomsData3.position = 0;
        }
        HashMap<Long, String> hashMap = new HashMap<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
            if (roomsData4 != null && (jArr = roomsData4.roomIds) != null) {
                jArr[i] = ((FeedItem) ListProtector.get(list, i)).getRoom().getId();
            }
            Long valueOf = Long.valueOf(((FeedItem) ListProtector.get(list, i)).getRoom().getId());
            String str6 = ((FeedItem) ListProtector.get(list, i)).debugInfo;
            if (str6 != null) {
                hashMap.put(valueOf, str6);
            }
        }
        EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
        roomsData5.debugInfos = hashMap;
        roomsData5.hasMoreExtra = Boolean.valueOf(feedExtra.hasMore);
        EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig.mRoomsData;
        roomsData6.maxTimeExtra = feedExtra.maxTime;
        roomsData6.unReadIdExtra = feedExtra.unreadExtra;
        long j2 = afS0S2400100_5.j6;
        Map<String, String> map = (Map) afS0S2400100_5.l5;
        C78461Uqn c78461Uqn = (C78461Uqn) afS0S2400100_5.l2;
        Context context = (Context) afS0S2400100_5.l3;
        EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig.mRoomsData;
        EnterRoomConfig.TimeStamp timeStamp = roomsData7.timeStamps;
        if (timeStamp != null) {
            timeStamp.enterRoomStarTimeReal = j2;
        }
        roomsData7.enterRoomScene = "outside_with_feed";
        roomsData7.roomId = ((FeedItem) ListProtector.get((List) osz.getFirst(), 0)).item.getId();
        Object obj2 = ListProtector.get((List) osz.getFirst(), 0);
        o.LJIIIIZZ(obj2, "it.first[0]");
        FeedItem feedItem2 = (FeedItem) obj2;
        if (feedItem2.getRoom() != null && feedItem2.getRoom().getOwner() != null && feedItem2.getRoom().getOwner().getFollowInfo() != null) {
            enterRoomConfig.mRoomsData.followStatus = String.valueOf(feedItem2.getRoom().getOwner().getFollowInfo().getFollowStatus());
        }
        enterRoomConfig.mRoomsData.gameLiveExtra = map;
        c78461Uqn.LJIILJJIL(context, enterRoomConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, webcast.api.sub.TemplateInfo] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object, java.lang.String] */
    public static final void accept$1(AfS0S2400100_5 afS0S2400100_5, Object obj) {
        boolean z;
        List<TemplateInfo> list;
        BaseResponse response = (BaseResponse) obj;
        ((C72242sW) afS0S2400100_5.l2).element = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_user_temp_ts", Long.valueOf(((C72242sW) afS0S2400100_5.l2).element));
        o.LJIIIIZZ(response, "response");
        linkedHashMap.put("temp", response);
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).qk0((Context) afS0S2400100_5.l3, linkedHashMap, afS0S2400100_5.s0);
        InterfaceC31557Ca1 payManager = ((IWalletService) CN1.LIZ(IWalletService.class)).getPayManager();
        TemplateListData data = (TemplateListData) GsonProtectorUtils.fromJson(C09650Zl.LIZJ, ((j) response.data).toString(), TemplateListData.class);
        InterfaceC30977CDt interfaceC30977CDt = (InterfaceC30977CDt) afS0S2400100_5.l4;
        if (interfaceC30977CDt != null) {
            long j = ((C72242sW) afS0S2400100_5.l2).element;
            o.LJIIIIZZ(data, "data");
            interfaceC30977CDt.Dg(j, data);
        }
        long j2 = ((C72242sW) afS0S2400100_5.l2).element - afS0S2400100_5.j6;
        if (data != null && (list = data.templateList) != null && (!list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C31058CGw c31058CGw = C31058CGw.LIZ;
            int size = data.templateList.size();
            c31058CGw.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_subscription_tpl_success");
            LIZ.LJIJJ("normal_sub", "source");
            LIZ.LJIL("duration", Float.valueOf((float) j2));
            LIZ.LJIJJ(Integer.valueOf(size), "tpl_count");
            LIZ.LJJIIJZLJL();
        } else {
            C31058CGw c31058CGw2 = C31058CGw.LIZ;
            int i = response.statusCode;
            c31058CGw2.getClass();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_subscription_tpl_fail");
            LIZ2.LJIJJ("normal_sub", "source");
            LIZ2.LJIL("duration", Float.valueOf((float) j2));
            LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
            LIZ2.LJJIIJZLJL();
            if (data == null) {
                return;
            }
        }
        TemplateInfo templateInfo = (TemplateInfo) ORZ.LJLLLLLL(0, data.templateList);
        if (templateInfo != null && templateInfo.payChannel == 2) {
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = "";
            C68322mC c68322mC2 = new C68322mC();
            c68322mC2.element = "";
            C68322mC c68322mC3 = new C68322mC();
            c68322mC3.element = new HashMap();
            C68322mC c68322mC4 = new C68322mC();
            for (TemplateInfo templateInfo2 : data.templateList) {
                if (templateInfo2.tplType == 2 && ((CharSequence) c68322mC.element).length() == 0) {
                    ?? r5 = templateInfo2.iapId;
                    c68322mC.element = r5;
                    c68322mC4.element = templateInfo2;
                    OfferInfo offerInfo = templateInfo2.offerInfo;
                    if (offerInfo != null) {
                        String str = offerInfo.id;
                        if (str == null) {
                            str = "";
                        }
                        ((Map) c68322mC3.element).put(r5, str);
                    }
                } else if (templateInfo2.tplType == 1 && ((CharSequence) c68322mC2.element).length() == 0) {
                    c68322mC2.element = templateInfo2.iapId;
                }
            }
            C31057CGv c31057CGv = new C31057CGv(System.currentTimeMillis(), c68322mC4, (InterfaceC30977CDt) afS0S2400100_5.l4, c68322mC3, c68322mC, c68322mC2, (C72242sW) afS0S2400100_5.l5, (Context) afS0S2400100_5.l3, afS0S2400100_5.s1);
            payManager.LJ(C47261Igj.LJJIJ(c68322mC2.element), c31057CGv);
            payManager.LJI(C47261Igj.LJJIJ(c68322mC.element), c31057CGv);
        }
    }

    public AfS0S2400100_5(String str, C78461Uqn c78461Uqn, Context context, C68322mC c68322mC, long j, Map map, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = "live_bottom_bar";
        this.l2 = c78461Uqn;
        this.l3 = context;
        this.l4 = c68322mC;
        this.j6 = j;
        this.l5 = map;
    }

    public AfS0S2400100_5(C72242sW c72242sW, Context context, String str, InterfaceC30977CDt interfaceC30977CDt, long j, C72242sW c72242sW2, String str2, int i) {
        this.$t = i;
        this.l2 = c72242sW;
        this.l3 = context;
        this.s0 = str;
        this.l4 = interfaceC30977CDt;
        this.j6 = j;
        this.l5 = c72242sW2;
        this.s1 = str2;
    }
}
