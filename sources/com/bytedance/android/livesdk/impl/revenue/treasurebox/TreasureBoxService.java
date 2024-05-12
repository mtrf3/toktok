package com.bytedance.android.livesdk.impl.revenue.treasurebox;

import X.AnonymousClass629;
import X.B83;
import X.BDI;
import X.BDJ;
import X.BZI;
import X.C0K2;
import X.C0NB;
import X.C28787BRn;
import X.C28789BRp;
import X.C29022BaE;
import X.C29044Baa;
import X.C29374Bfu;
import X.C30605Bzl;
import X.C32537Cpp;
import X.C76800UCe;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.InterfaceC88472Yns;
import X.Q7L;
import X.T16;
import X.T28;
import X.UFE;
import Y.AfS0S0300100_5;
import Y.AfS1S0200100_5;
import Y.AfS3S1100100_5;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo;
import com.bytedance.android.livesdk.impl.revenue.TreasureBoxRootWidget;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.network.ActivityTreasureBoxApi;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import com.bytedance.android.livesdk.livesetting.gift.LiveTreasureBoxContainerOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.GetTreasureBoxListOptEnablePost;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import webcast.api.envelope.RevenuePermissionRequest;

/* loaded from: classes6.dex */
public class TreasureBoxService implements ITreasureBoxService {
    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final Class<? extends LiveRecyclableWidget> Xf0() {
        return TreasureBoxRootWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final void Y7() {
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final Class<? extends LiveRecyclableWidget> qr0() {
        return ActivityTreasureBoxWidget.class;
    }

    static {
        new C28789BRp();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final ActivityTreasureBoxWidget LI() {
        return new ActivityTreasureBoxWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final TreasureBoxRootWidget sE() {
        return new TreasureBoxRootWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final boolean tg() {
        Set keySet;
        if (LiveTreasureBoxContainerOptimizeSetting.INSTANCE.getValue()) {
            Map map = (Map) DataChannelGlobal.LJLJJI.mv0(C29022BaE.class);
            if (map == null || (keySet = map.keySet()) == null) {
                return false;
            }
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (longValue != 1 && longValue != 2 && longValue != 4 && longValue != 9) {
                    return o.LJ(map.get(Long.valueOf(longValue)), Boolean.TRUE);
                }
            }
            return false;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || room.getRoomAuthStatus() == null || !room.getRoomAuthStatus().showActivityTreasureBox()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Long, O] */
    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final void Zl0(DataChannel dataChannel, String str) {
        String str2;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        if (str == null) {
            C0NB.LIZIZ("TreasureBoxService", "getEnvelopeList: roomId is null");
            return;
        }
        if (dataChannel == null) {
            C0NB.LIZIZ("TreasureBoxService", "getEnvelopeList, live data channel is null");
            return;
        }
        Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        HashMap hashMap = new HashMap(5);
        if (o.LJ(bool, Boolean.TRUE)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str2);
        B83 LIZ = B83.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_treasure_box_list_request");
        LIZ2.LJIIJJI("live_detail");
        LIZ2.LJIIL("click");
        LIZ2.LJIIIZ("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJI();
            LIZ2.LJJIIZI();
        }
        C0K2.LJII(0, "ttlive_treasure_box_list_request", new HashMap());
        long currentTimeMillis = System.currentTimeMillis();
        ((C32537Cpp) dataChannel.gv0(BDJ.class)).LIZ = Long.valueOf(currentTimeMillis);
        if (!GetTreasureBoxListOptEnablePost.INSTANCE.getValue()) {
            T28.LIZLLL(((ActivityTreasureBoxApi) Q7L.LIZIZ(ActivityTreasureBoxApi.class)).getRedEnvelopList(str)).LJJII(new AfS0S0300100_5(currentTimeMillis, (long) this, (GamePartnershipService) bool, (InterfaceC88472Yns<? super C30605Bzl, C76800UCe>) dataChannel, (DataChannel) 4), new AfS1S0200100_5(currentTimeMillis, this, bool, 16));
        } else {
            T28.LIZLLL(((ActivityTreasureBoxApi) Q7L.LIZIZ(ActivityTreasureBoxApi.class)).getRedEnvelopListV2(str)).LJJII(new AfS0S0300100_5(currentTimeMillis, (long) this, (GamePartnershipService) bool, (InterfaceC88472Yns<? super C30605Bzl, C76800UCe>) dataChannel, (DataChannel) 5), new AfS1S0200100_5(currentTimeMillis, this, bool, 17));
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Long, O] */
    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final void sf0(DataChannel dataChannel, Long l, String str) {
        long j;
        String str2 = str;
        RevenuePermissionRequest revenuePermissionRequest = new RevenuePermissionRequest();
        revenuePermissionRequest.needBizs = 3L;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        revenuePermissionRequest.roomId = j;
        if (str2 == null) {
            str2 = "";
        }
        revenuePermissionRequest.secAnchorId = str2;
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        HashMap hashMap = new HashMap(3);
        hashMap.put("uuid", LIZ);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_revenue_interact_permission_request");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIL("other");
        LIZ2.LJIIIZ("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJI();
            LIZ2.LJJIIZI();
        }
        C0K2.LJII(0, "ttlive_revenue_interact_permission_request", new HashMap());
        long currentTimeMillis = System.currentTimeMillis();
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(BDI.class)).LIZ = Long.valueOf(System.currentTimeMillis());
        }
        ActivityTreasureBoxApi activityTreasureBoxApi = (ActivityTreasureBoxApi) Q7L.LIZIZ(ActivityTreasureBoxApi.class);
        long j2 = revenuePermissionRequest.needBizs;
        long j3 = revenuePermissionRequest.roomId;
        String str3 = revenuePermissionRequest.secAnchorId;
        o.LJIIIIZZ(str3, "request.secAnchorId");
        T28.LIZLLL(activityTreasureBoxApi.getRedEnvelopePermission(j2, j3, str3)).LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ()).LJJII(new AfS3S1100100_5(currentTimeMillis, dataChannel, LIZ, 7), new AfS3S1100100_5(currentTimeMillis, dataChannel, LIZ, 8));
    }

    public static void LIZ(int i, String str, long j, List list, Boolean bool) {
        int i2;
        String str2;
        int i3;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        HashMap hashMap = new HashMap(12);
        hashMap.put("error_code", String.valueOf(i));
        if (str == null) {
            str = "";
        }
        hashMap.put("error_msg", str);
        hashMap.put("duration_from_request", String.valueOf(System.currentTimeMillis() - j));
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        hashMap.put("envelope_count", String.valueOf(i2));
        if (o.LJ(bool, Boolean.TRUE)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str2);
        B83 LIZ = B83.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RedEnvelopInfo redEnvelopInfo = (RedEnvelopInfo) it.next();
                String str3 = redEnvelopInfo.envelopeId;
                if (str3 == null) {
                    str3 = "";
                }
                Integer num = redEnvelopInfo.businessType;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                String str4 = redEnvelopInfo.sendUserId;
                if (str4 == null) {
                    str4 = "";
                }
                arrayList.add(str3);
                arrayList2.add(String.valueOf(i3));
                arrayList3.add(str4);
            }
        }
        String abstractCollection = arrayList.toString();
        o.LJIIIIZZ(abstractCollection, "envelopeIdList.toString()");
        hashMap.put("envelope_id_list", abstractCollection);
        String abstractCollection2 = arrayList2.toString();
        o.LJIIIIZZ(abstractCollection2, "businessTypeList.toString()");
        hashMap.put("business_type_list", abstractCollection2);
        String abstractCollection3 = arrayList3.toString();
        o.LJIIIIZZ(abstractCollection3, "senderUserList.toString()");
        hashMap.put("send_user_id_list", abstractCollection3);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_treasure_box_list_response");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIJJI("live_detail");
        LIZ2.LJIIL("click");
        LIZ2.LJIIIZ("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJI();
            LIZ2.LJJIIZI();
        }
        C0K2.LJII(0, "ttlive_treasure_box_list_response", hashMap);
    }
}
