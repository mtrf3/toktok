package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZE implements InterfaceC75476Tjk {
    public final /* synthetic */ C74842TYw LIZ;
    public final /* synthetic */ TZX<LinkPlayerInfo, MultiLiveGuestInfoList> LIZIZ;
    public final /* synthetic */ List<ListByTypeResponse.ReservedUser> LIZJ;

    @Override // X.InterfaceC75476Tjk
    public final String LIZJ() {
        String LJIILL = C15380j0.LJIILL(R.string.kl_, Integer.valueOf(this.LIZJ.size()));
        o.LJIIIIZZ(LJIILL, "getString(R.string.pm_co…dedReservationUsers.size)");
        return LJIILL;
    }

    @Override // X.InterfaceC75476Tjk
    public final void LIZ() {
        Long l;
        this.LIZ.LJJJLL();
        EnumC75182Tf0 clickTime = C44432HcC.LJIIIIZZ();
        int size = this.LIZIZ.LJI().size();
        int size2 = this.LIZJ.size();
        o.LJIIIZ(clickTime, "clickTime");
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        }
        hashMap.put("room_id", String.valueOf(l2));
        hashMap.put("click_time", clickTime.getType());
        hashMap.put("reservation_guest_cnts", String.valueOf(size));
        hashMap.put("current_accept_appointment_cnts", String.valueOf(size2));
        hashMap.put("is_Reservation_sender", CardStruct.IStatusCode.DEFAULT);
        AnonymousClass172.LIZ("livesdk_connection_appointment_guide_click", hashMap);
        C74824TYe.LJIIJJI = "appointment_guide";
    }

    @Override // X.InterfaceC75476Tjk
    public final List<ImageModel> LIZIZ() {
        ImageModel avatarThumb;
        ArrayList arrayList = new ArrayList();
        Iterator<ListByTypeResponse.ReservedUser> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            User user = it.next().user;
            if (user != null && (avatarThumb = user.getAvatarThumb()) != null) {
                arrayList.add(avatarThumb);
            }
            if (arrayList.size() == 2) {
                break;
            }
        }
        return arrayList;
    }

    public TZE(C74842TYw c74842TYw, TZX<LinkPlayerInfo, MultiLiveGuestInfoList> tzx, List<ListByTypeResponse.ReservedUser> list) {
        this.LIZ = c74842TYw;
        this.LIZIZ = tzx;
        this.LIZJ = list;
    }
}
