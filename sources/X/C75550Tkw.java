package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tkw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75550Tkw extends AbstractC75469Tjd {
    public final C62822Ol8 LIZJ;

    @InterfaceC75558Tl4(name = "LINK_LOGGER")
    public InterfaceC75555Tl1 mLinkLogger;

    public final LinkCrossRoomDataHolder LIZJ() {
        return (LinkCrossRoomDataHolder) this.LIZJ.getValue();
    }

    public final void LIZLLL() {
        LIZJ().getClass();
        LIZJ().LJII("stopRtcIfJoinChannelAdvance");
    }

    @Override // X.AbstractC75469Tjd
    public final void LIZ(java.util.Map map) {
        o.LJII(((HashMap) map).get("cancel_reason"), "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.api.LinkApi.CancelReason");
        LIZJ();
    }

    @Override // X.AbstractC75469Tjd
    public final AbstractC73638SvC<C75513TkL> LIZIZ(java.util.Map<String, Object> map) {
        HashMap hashMap = (HashMap) map;
        if (hashMap.get("reply_status") == null) {
            return null;
        }
        Object obj = hashMap.get("reply_status");
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (hashMap.get("channel_id") == null) {
            hashMap.put("channel_id", Long.valueOf(LIZJ().LJFF));
        }
        if (hashMap.get("guest_user_id") == null) {
            hashMap.put("guest_user_id", Long.valueOf(LIZJ().LJI));
        }
        if (hashMap.get("transparent_extra") == null) {
            String str = LIZJ().LJJJJI;
            if (str == null) {
                str = "";
            }
            hashMap.put("transparent_extra", str);
        }
        if (hashMap.get("guest_user_id") instanceof Long) {
            Object obj2 = hashMap.get("guest_user_id");
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.Long");
            if (((Long) obj2).longValue() > 0 && (hashMap.get("channel_id") instanceof Long)) {
                Object obj3 = hashMap.get("channel_id");
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.Long");
                if (((Long) obj3).longValue() > 0) {
                    InterfaceC75555Tl1 interfaceC75555Tl1 = this.mLinkLogger;
                    if (interfaceC75555Tl1 != null) {
                        ((C75551Tkx) interfaceC75555Tl1).LIZ(map);
                    }
                    CoHostApi coHostApi = (CoHostApi) Q7L.LIZIZ(CoHostApi.class);
                    Object obj4 = hashMap.get("channel_id");
                    o.LJII(obj4, "null cannot be cast to non-null type kotlin.Long");
                    long longValue = ((Long) obj4).longValue();
                    long j = this.LIZIZ;
                    Object obj5 = hashMap.get("guest_user_id");
                    o.LJII(obj5, "null cannot be cast to non-null type kotlin.Long");
                    long longValue2 = ((Long) obj5).longValue();
                    Object obj6 = hashMap.get("transparent_extra");
                    o.LJII(obj6, "null cannot be cast to non-null type kotlin.String");
                    return coHostApi.reply(longValue, j, intValue, longValue2, (String) obj6).LJIJI(C75552Tky.LJLIL).LJFF(new C62705OjF()).LJIIJJI(new C75549Tkv(map, this, intValue));
                }
            }
        }
        return null;
    }

    public C75550Tkw(long j, DataChannel dataChannel) {
        super(dataChannel);
        long j2;
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        c75559Tl5.LJI(B5G.LIZIZ(), null);
        c75559Tl5.LIZLLL(this);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        this.LIZIZ = j2;
        this.LIZJ = C221108m2.LIZIZ(C75553Tkz.LJLIL);
        C221108m2.LIZIZ(new AqS163S0100000_13(this, 765));
    }
}
