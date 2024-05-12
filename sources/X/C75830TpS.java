package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusApi;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TpS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75830TpS implements InterfaceC72966SkM {
    @Override // X.InterfaceC72966SkM
    public final Object getState(InterfaceC67352kd<? super R2P<GetGuestSettingResponse.ResponseData>> interfaceC67352kd) {
        return ((DistributeStatusApi) Q7L.LIZIZ(DistributeStatusApi.class)).getState(interfaceC67352kd);
    }

    @Override // X.InterfaceC72966SkM
    public final Object LJJJJJL(int i, InterfaceC67352kd<? super R2P<UpdateGuestSettingResponse.ResponseData>> interfaceC67352kd) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("channel_id", C78886Uxe.LJJJLL(C8E.LJ()));
        String idStr = room.getIdStr();
        o.LJIIIIZZ(idStr, "room.idStr");
        linkedHashMap.put("room_id", idStr);
        linkedHashMap.put("live_id", String.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId()));
        linkedHashMap.put("flow_distribute", String.valueOf(i));
        linkedHashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        C65814PsI.LIZ().getClass();
        return ((DistributeStatusApi) C65814PsI.LIZJ(DistributeStatusApi.class)).updateGuestSettingUseMap(linkedHashMap, interfaceC67352kd);
    }
}
