package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.rank.impl.list.fragment.list.ECListFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.BNg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28676BNg extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ ECListFragment LJLJJL;
    public final /* synthetic */ C2A7 LJLJJLL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        Long l;
        String str;
        Room room;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL.LJLJLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        IActionHandlerService iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class);
        Context context = this.LJLJJLL.getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://ec/live_bag_list?room_id=");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LJLJJL);
        Long l2 = null;
        if (LJIILIIL != null) {
            l = Long.valueOf(C29306Beo.LJJIZ(LJIILIIL));
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append("&enter_from=sale_rank");
        iActionHandlerService.handle(context, X1D.LIZIZ(LIZ));
        BZI LIZ2 = C28787BRn.LIZ("livesdk_tiktokec_sale_rank_product_entrance_click");
        LIZ2.LJIILLIIL(C51029K0z.LJIILIIL(this.LJLJJL));
        if (C29306Beo.LJIIJ(C51029K0z.LJIILIIL(this.LJLJJL))) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str, "is_self");
        LIZ2.LJIJJ(Long.valueOf(C28652BMi.LIZ(this.LJLJJL.LJLJJI.LIZIZ.type, false)), "author_rank");
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this.LJLJJL);
        if (LJIILIIL2 != null && (room = (Room) LJIILIIL2.kv0(RoomChannel.class)) != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        }
        LIZ2.LJIJJ(l2, "author_id");
        LIZ2.LJIJJ("TEMAI", "EVENT_ORIGIN_FEATURE");
        LIZ2.LJIJJ("live", "page_name");
        LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ2.LJJIIJZLJL();
    }

    public C28676BNg(ECListFragment eCListFragment, C2A7 c2a7) {
        this.LJLJJL = eCListFragment;
        this.LJLJJLL = c2a7;
    }
}
