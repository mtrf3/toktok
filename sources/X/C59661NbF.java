package X;

import Y.ARunnableS8S0301000_7;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.list.MultiRoomIdListProvider;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NbF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C59661NbF implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        T t;
        String str;
        String str2;
        boolean z = true;
        switch (this.LJLIL) {
            case 0:
                MultiRoomIdListProvider multiRoomIdListProvider = (MultiRoomIdListProvider) this.LJLILLLLZI;
                List list = (List) this.LJLJI;
                BaseResponse baseResponse = (BaseResponse) obj;
                multiRoomIdListProvider.getClass();
                if (baseResponse != null && (t = baseResponse.data) != 0) {
                    java.util.Map map = (java.util.Map) t;
                    ArrayList arrayList = new ArrayList();
                    EnterRoomConfig enterRoomConfig = multiRoomIdListProvider.LJLJJL;
                    if (enterRoomConfig != null) {
                        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                        str = logData.requestId;
                        str2 = logData.logPb;
                    } else {
                        str = "";
                        str2 = "";
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            RoomInfo roomInfo = (RoomInfo) it.next();
                            if (roomInfo != null && map.containsKey(String.valueOf(roomInfo.getRoomId()))) {
                                arrayList.add(map.get(String.valueOf(roomInfo.getRoomId())));
                            }
                        } else {
                            z = false;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Room room = (Room) it2.next();
                        room.setLog_pb(str2);
                        room.setRequestId(str);
                    }
                    if (!z) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        multiRoomIdListProvider.LJLJI = arrayList2;
                        ((ArrayList) multiRoomIdListProvider.LJLJJI).clear();
                        if (C32151Nz.LJJIIJZLJL(arrayList2)) {
                            return;
                        }
                        for (int i = 0; i < arrayList2.size(); i++) {
                            EnterRoomConfig LIZJ = C28238B6k.LIZJ(false, (Room) ListProtector.get(arrayList2, i));
                            if (i == 0) {
                                EnterRoomConfig.RoomsData roomsData = LIZJ.mRoomsData;
                                long j = roomsData.roomId;
                                EnterRoomConfig.RoomsData roomsData2 = multiRoomIdListProvider.LJLJJL.mRoomsData;
                                if (j == roomsData2.roomId) {
                                    roomsData.enterRoomScene = roomsData2.enterRoomScene;
                                }
                            }
                            ((ArrayList) multiRoomIdListProvider.LJLJJI).add(LIZJ);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NO4 no4 = (NO4) this.LJLILLLLZI;
                Aweme aweme = (Aweme) this.LJLJI;
                if (!((Boolean) obj).booleanValue() && no4 != null) {
                    no4.LIZ(aweme.getAwemeRawAd().getCreativeIdStr(), aweme.getAwemeRawAd().getLogExtra(), NNT.LIZ(Integer.valueOf(JHI.LIZ().LJIIIIZZ)), aweme.getAwemeRawAd().getWebUrl());
                    return;
                }
                return;
            default:
                C45498HtO c45498HtO = (C45498HtO) this.LJLILLLLZI;
                List<MyMediaModel> list2 = (List) this.LJLJI;
                C03150Al c03150Al = (C03150Al) obj;
                c45498HtO.getClass();
                if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
                    c03150Al.LIZIZ(new C44978Hl0(c45498HtO, c45498HtO.LJZ));
                    c45498HtO.LJZI = list2;
                    c45498HtO.LLIIIZ = true;
                    c45498HtO.LJLLLLLL();
                    return;
                }
                C5OG.LIZIZ(new ARunnableS8S0301000_7(1, c45498HtO, c03150Al, list2, 1));
                return;
        }
    }

    public /* synthetic */ C59661NbF(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
