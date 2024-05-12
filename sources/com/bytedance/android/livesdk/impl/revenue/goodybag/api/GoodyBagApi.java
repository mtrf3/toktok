package com.bytedance.android.livesdk.impl.revenue.goodybag.api;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;
import webcast.api.goody_bag.GetGoodyBagWinnerListResponse;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* loaded from: classes6.dex */
public interface GoodyBagApi {
    @E8L("/webcast/goody_bag/room/")
    AbstractC73638SvC<C28467BFf<GetRoomGoodyBagResponse.ResponseData>> getGoodyBag(@InterfaceC64986Pew("room_id") String str);

    @E8M("/webcast/goody_bag/lottery/")
    AbstractC73638SvC<C28467BFf<GetGoodyBagLotteryResponse.ResponseData>> getUserIfWinner(@InterfaceC64986Pew("goody_bag_id") String str);

    @E8M("webcast/goody_bag/winner_list/")
    AbstractC73638SvC<C28467BFf<GetGoodyBagWinnerListResponse.ResponseData>> getWinnerList(@InterfaceC64986Pew("goody_bag_id") String str, @InterfaceC64986Pew("offset") long j, @InterfaceC64986Pew("limit") long j2);
}
