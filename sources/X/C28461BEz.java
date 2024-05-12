package X;

import Y.ARunnableS13S0101000_9;
import Y.AfS0S1100200_5;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.rank.RankRequestOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomRequestV2;
import com.bytedance.android.livesdk.livesetting.watchlive.PackEnterRoomOptEnableSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;

/* renamed from: X.BEz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28461BEz implements WeakHandler.IHandler {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public C28158B3i LJLJI;
    public final InterfaceC28152B3c LJLJJL;
    public final long LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public long LJLLI;
    public long LJLLILLLL;
    public final String LJLLJ;
    public long LJLLL;
    public final List<Long> LJLLLL;
    public final String LJLLLLLL;
    public C28251B6x LJZL;
    public final HashMap<String, String> LL;
    public final HashMap<String, String> LLD;
    public final String LLF;
    public final Queue<BaseMessage> LJLZ = new LinkedList();
    public boolean LJZ = false;
    public boolean LJZI = false;
    public final WeakHandler LJLJJI = new WeakHandler(C16880lQ.LLJJJJ(), this);

    public final void LIZJ() {
        this.LJZI = false;
        this.LJZ = true;
        this.LJZL = null;
        this.LJLJJI.removeCallbacksAndMessages(null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterRoomController stop roomid :");
        C0RN.LJ(LIZ, this.LJLJJLL, LIZ, "PreFetchRoomInfoManager");
        ((LinkedList) this.LJLZ).clear();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String, O] */
    public final void LIZIZ(boolean z) {
        AbstractC73672Svk<BaseResponse<Room, EnterRoomExtra>> enterRoom;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterRoomController try to start roomid :");
        C0RN.LJ(LIZ, this.LJLJJLL, LIZ, "PreFetchRoomInfoManager");
        if (this.LJZI) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("EnterRoomController start roomid :");
        C0RN.LJ(LIZ2, this.LJLJJLL, LIZ2, "PreFetchRoomInfoManager");
        this.LJZ = false;
        this.LJZI = true;
        this.LJLLI = System.currentTimeMillis();
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29038BaU.class)).LIZ = this.LJLL;
        C29162BcU c29162BcU = C29162BcU.LIZJ;
        final WeakHandler weakHandler = this.LJLJJI;
        final long j = this.LJLJJLL;
        String str = this.LJLJL;
        final String str2 = this.LJLJLJ;
        String str3 = this.LJLJLLL;
        String str4 = this.LJLL;
        String str5 = this.LJLLLLLL;
        String str6 = this.LJLLJ;
        HashMap<String, String> hashMap = this.LL;
        final String str7 = this.LJLIL;
        final String str8 = this.LJLILLLLZI;
        HashMap<String, String> hashMap2 = this.LLD;
        long j2 = this.LJLLL;
        List<Long> list = this.LJLLLL;
        C39685Fhp c39685Fhp = new C39685Fhp();
        c39685Fhp.LIZJ("common_label_list", str3);
        c39685Fhp.LIZJ("enter_source", str4);
        c39685Fhp.LIZJ("request_id", str);
        c39685Fhp.LIZJ("enter_type", str2);
        c39685Fhp.LIZJ("live_reason", str5);
        c39685Fhp.LIZJ("enter_from_uid_by_shared", str6);
        HashMap<String, String> hashMap3 = (HashMap) c39685Fhp.LJLILLLLZI;
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        long j3 = 0;
        if (j2 > 0) {
            hashMap3.put("portal_id", String.valueOf(j2));
        }
        if (PackEnterRoomOptEnableSetting.INSTANCE.isEnable() && list != null && !C79004UzY.LJJIFFI(list)) {
            hashMap3.put("next_room_ids_str", new JSONArray((Collection) list).toString());
        }
        C30326BvG.LIZ.post(new ARunnableS13S0101000_9(0, c29162BcU, 6), null);
        if (((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            j3 = 1;
        }
        if (LiveEnterRoomRequestV2.INSTANCE.getValue()) {
            C65814PsI.LIZ().getClass();
            enterRoom = ((RoomRetrofitApi) ((INetworkService) CN1.LIZ(INetworkService.class)).Du0(RoomRetrofitApi.class)).enterRoom(j, 1L, j3, hashMap3);
        } else {
            enterRoom = ((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).enterRoom(j, 1L, j3, hashMap3);
        }
        C73428Sro LJJL = enterRoom.LJJL(T16.LIZ());
        final long currentTimeMillis = System.currentTimeMillis();
        LJJL.LJJJLIIL(new InterfaceC64592gB() { // from class: X.BFi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String str9;
                Object obj2;
                Handler handler = weakHandler;
                String str10 = str2;
                String str11 = str7;
                String str12 = str8;
                long j4 = j;
                long j5 = currentTimeMillis;
                BaseResponse baseResponse = (BaseResponse) obj;
                if (handler != null) {
                    C28251B6x c28251B6x = new C28251B6x();
                    Room room = (Room) baseResponse.data;
                    c28251B6x.LIZ = room;
                    if (room != null) {
                        if (room.getStreamUrl() == null) {
                            obj2 = "1";
                        } else {
                            obj2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        if (c28251B6x.LIZ.hasCommerceGoods) {
                            str9 = "1";
                        } else {
                            str9 = CardStruct.IStatusCode.DEFAULT;
                        }
                    } else {
                        str9 = CardStruct.IStatusCode.DEFAULT;
                        obj2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_room_enter_interface_duration", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
                        BZI LIZ3 = C28787BRn.LIZ("livesdk_room_enter_interface_duration");
                        LIZ3.LIZJ(str10);
                        LIZ3.LJIJJ(str11, "enter_from_merge");
                        LIZ3.LJIJJ(str12, "enter_method");
                        C06530Nl.LIZLLL(LIZ3, "1", "status", j4, "room_id");
                        LIZ3.LJIJJ(CardStruct.IStatusCode.DEFAULT, "request_without_stream");
                        LIZ3.LJIJJ(obj2, "response_without_stream");
                        LIZ3.LJIJJ(String.valueOf(currentTimeMillis2 - j5), "duration");
                        Room room2 = c28251B6x.LIZ;
                        if (room2 != null && room2.getStreamType() != null) {
                            LIZ3.LJIJ(c28251B6x.LIZ.getStreamType().logStreamingType);
                        }
                        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
                            LIZ3.LJIIZILJ();
                            LIZ3.LJJIIJZLJL();
                        } else {
                            BJM bjm = BJM.LJLIL;
                            LIZ3.LJIJJ(BJM.LJIIJJI(), "log_pb");
                            LIZ3.LJIJJ(BJM.LJIILIIL(), "request_id");
                            LIZ3.LJIJJ(bjm.LIZJ(), "live_type");
                            LIZ3.LJIJJ(BJM.LIZLLL(), "action_type");
                            LIZ3.LJJIJ();
                            LIZ3.LJJIIZI();
                        }
                    }
                    EnterRoomExtra enterRoomExtra = (EnterRoomExtra) baseResponse.extra;
                    c28251B6x.LIZIZ = enterRoomExtra;
                    Room room3 = c28251B6x.LIZ;
                    if (room3 != null) {
                        room3.nowTime = enterRoomExtra.now / 1000;
                    }
                    Message obtainMessage = handler.obtainMessage(4);
                    obtainMessage.obj = c28251B6x;
                    handler.sendMessage(obtainMessage);
                    if (baseResponse.LIZ != null) {
                        BLV blv = new BLV();
                        blv.LIZ = str10;
                        blv.LIZIZ = str11;
                        blv.LIZJ = str12;
                        blv.LIZLLL = baseResponse.LIZIZ;
                        blv.LJ = "/webcast/room/enter/";
                        blv.LJI = str9;
                        BLX.LIZ(j5, currentTimeMillis2, uptimeMillis, blv.LIZ(), baseResponse.LIZ, baseResponse.LIZJ);
                    }
                }
            }
        }, new AfS0S1100200_5(weakHandler, j, str2, currentTimeMillis, 0));
        try {
            if (RankRequestOptSetting.INSTANCE.getValue() == 2 && c29162BcU.LIZIZ != null) {
                c29162BcU.LIZIZ.LIZ(j, CastLongProtector.parseLong(hashMap3.get("anchor_id")));
            }
        } catch (Exception unused) {
        }
        ((LinkedList) this.LJLZ).clear();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String str;
        Room room;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        this.LJLLILLLL = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleMsg roomid :");
        C0RN.LJ(LIZ, this.LJLJJLL, LIZ, "PreFetchRoomInfoManager");
        int i = message.what;
        if (i == 32) {
            if (!this.LJZ) {
                if (message.obj instanceof Throwable) {
                    LIZ(0, "finish_abnormal fail", null, null);
                    return;
                } else {
                    LIZIZ(true);
                    return;
                }
            }
            return;
        }
        if (i != 4 || !this.LJZI) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) obj;
            BPE.LIZ(obj, Long.valueOf(this.LJLJJLL), this.LJLJLJ, this.LJLIL, this.LLF);
            LIZ(c29401Dk.getErrorCode(), c29401Dk.getErrorMsg(), c29401Dk.getPrompt(), c29401Dk.getExtra());
            return;
        }
        if (obj instanceof Exception) {
            BPE.LIZ(obj, Long.valueOf(this.LJLJJLL), this.LJLJLJ, this.LJLIL, this.LLF);
            LIZ(0, message.obj.toString(), null, null);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleMsg success roomid :");
        C0RN.LJ(LIZ2, this.LJLJJLL, LIZ2, "PreFetchRoomInfoManager");
        Object obj2 = message.obj;
        if (!(obj2 instanceof C28251B6x) || ((C28251B6x) obj2).LIZ == null || !Room.isValid(((C28251B6x) obj2).LIZ)) {
            Object obj3 = message.obj;
            if (!(obj3 instanceof C28251B6x)) {
                str = "response unexpected";
            } else if (((C28251B6x) obj3).LIZ == null) {
                str = "room is null";
            } else {
                str = "invalid room data";
            }
            LIZ(0, str, null, null);
            return;
        }
        C28251B6x c28251B6x = (C28251B6x) message.obj;
        this.LJZL = c28251B6x;
        this.LJZI = false;
        this.LJLJJL.LIZIZ(c28251B6x);
        if (c28251B6x == null || (room = c28251B6x.LIZ) == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) == null) {
            return;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C74838TYs.LJ().LJJI;
        if (multiLiveAnchorPanelSettings == null) {
            multiLiveAnchorPanelSettings = new MultiLiveAnchorPanelSettings();
        }
        int i2 = multiLiveUserApplyPermission.multiLiveApplyPermission;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                multiLiveAnchorPanelSettings.allowViewerReq = 4;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
                C74838TYs.LJ().LJJI = multiLiveAnchorPanelSettings;
                return;
            }
            multiLiveAnchorPanelSettings.allowViewerReq = 3;
            multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 3;
            C74838TYs.LJ().LJJI = multiLiveAnchorPanelSettings;
            return;
        }
        multiLiveAnchorPanelSettings.allowViewerReq = 3;
        multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
        C74838TYs.LJ().LJJI = multiLiveAnchorPanelSettings;
    }

    public final void LIZ(int i, String str, String str2, String str3) {
        this.LJLJI = new C28158B3i(i, str, str2);
        this.LJZI = false;
        this.LJLJJL.LIZ(i, str, str2, str3);
    }

    public C28461BEz(InterfaceC28152B3c interfaceC28152B3c, long j, List list, String str, String str2, String str3, String str4, String str5, String str6, HashMap hashMap, String str7, String str8, HashMap hashMap2, String str9) {
        this.LJLJJL = interfaceC28152B3c;
        this.LJLJJLL = j;
        this.LJLLLL = list;
        this.LJLJL = str;
        this.LJLJLJ = str2;
        this.LJLJLLL = str3;
        this.LJLL = str4;
        this.LJLLLLLL = str5;
        this.LJLLJ = str6;
        this.LL = hashMap;
        this.LJLIL = str7;
        this.LJLILLLLZI = str8;
        this.LLD = hashMap2;
        this.LLF = str9;
    }
}
