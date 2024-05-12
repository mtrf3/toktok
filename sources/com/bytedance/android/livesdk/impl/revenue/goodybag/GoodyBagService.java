package com.bytedance.android.livesdk.impl.revenue.goodybag;

import X.B80;
import X.B83;
import X.BDB;
import X.BR8;
import X.BRB;
import X.BZI;
import X.C0K2;
import X.C28773BQz;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C65814PsI;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.Q4K;
import X.T16;
import X.T28;
import X.UFE;
import Y.AfS25S0110000_5;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.impl.revenue.goodybag.api.GoodyBagApi;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagFeatureAnchorSetting;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagFeatureAudienceSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.AgeRestrictedConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.api.goody_bag.GetRoomGoodyBagRequest;

/* loaded from: classes6.dex */
public class GoodyBagService implements IGoodyBagService {
    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final Class<? extends LiveRecyclableWidget> SG() {
        return GoodyBagWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    static {
        new BR8();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final BRB eQ() {
        return new BRB();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final GoodyBagWidget qh0() {
        return new GoodyBagWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final boolean Ce(String str) {
        GoodyBagBaseInfo goodyBagBaseInfo;
        GoodyBagCommonDetail goodyBagCommonDetail;
        GoodyBagCommonDetail goodyBagCommonDetail2;
        if (str == null || (goodyBagBaseInfo = C28773BQz.LIZ) == null || (goodyBagCommonDetail = goodyBagBaseInfo.commonDetail) == null || goodyBagCommonDetail.participateMethod != 1 || goodyBagBaseInfo == null || (goodyBagCommonDetail2 = goodyBagBaseInfo.commonDetail) == null || !o.LJ(goodyBagCommonDetail2.participateMethodContent, str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final boolean V60(DataChannel dataChannel) {
        Map map;
        boolean z;
        if (dataChannel != null) {
            map = (Map) dataChannel.kv0(BDB.class);
        } else {
            map = null;
        }
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (longValue == 1) {
                    z = o.LJ(map.get(Long.valueOf(longValue)), Boolean.TRUE);
                    break;
                }
            }
        }
        z = false;
        if (dataChannel != null && o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            if (!GoodyBagFeatureAnchorSetting.INSTANCE.getValue() || AgeRestrictedConfig.INSTANCE.isLimit() || !z) {
                return false;
            }
            return true;
        }
        if (!GoodyBagFeatureAudienceSetting.INSTANCE.getValue() || AgeRestrictedConfig.INSTANCE.isLimit() || !z) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final void Tm0(DataChannel dataChannel, String str) {
        boolean z;
        String str2;
        FollowInfo followInfo;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        GetRoomGoodyBagRequest getRoomGoodyBagRequest = new GetRoomGoodyBagRequest();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        getRoomGoodyBagRequest.roomId = str;
        if (dataChannel != null) {
            z = C29306Beo.LJIIJ(dataChannel);
        } else {
            z = false;
        }
        HashMap hashMap = new HashMap();
        B83 LIZ = B83.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        if (z) {
            str3 = "1";
        }
        hashMap.put("is_anchor", str3);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str2 = Q4K.LIZJ(followInfo)) == null) {
                str2 = "";
            }
            hashMap.put("follow_status", str2);
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_goody_bag_room_request");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIL("other");
        LIZ2.LJIIIZ("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZI();
        }
        C0K2.LJII(0, "ttlive_goody_bag_room_request", hashMap);
        C65814PsI.LIZ().getClass();
        T28.LIZLLL(((GoodyBagApi) C65814PsI.LIZJ(GoodyBagApi.class)).getGoodyBag(getRoomGoodyBagRequest.roomId)).LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ()).LJJII(new AfS25S0110000_5(dataChannel, z, 0), new B80(z));
    }
}
