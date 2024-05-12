package X;

import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RandomGiftPanelBanner;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.Bmy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29812Bmy extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C32507CpL LJLIL;
    public final /* synthetic */ C32500CpE LJLILLLLZI;
    public final /* synthetic */ RandomGiftPanelBanner LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29812Bmy(C32507CpL c32507CpL, C32500CpE c32500CpE, RandomGiftPanelBanner randomGiftPanelBanner, long j) {
        super(0);
        this.LJLIL = c32507CpL;
        this.LJLILLLLZI = c32500CpE;
        this.LJLJI = randomGiftPanelBanner;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Long l;
        DataChannel dataChannel;
        Room room;
        long j = this.LJLIL.LJFF;
        BZI LIZ = C28787BRn.LIZ("travel_gift_entrance_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Integer.valueOf(C29823Bn9.LIZ()), "is_anchor");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) TTL.LIZJ(LIZ, C32129CjF.LIZ.LIZ, "guide_from")).getCurrentUserId()), "user_id");
        LIZ.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ.LJJIIJZLJL();
        GiftLeafRootViewModel LJJIIJ = this.LJLILLLLZI.LJJIIJ();
        Long l2 = null;
        if (LJJIIJ != null && (dataChannel = LJJIIJ.LJLIL) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room.getOwnerUserId());
            l2 = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLJI.schemaUrl);
        LIZ2.append("&gift_id=");
        LIZ2.append(this.LJLJJI);
        LIZ2.append("&anchor_id=");
        LIZ2.append(l);
        LIZ2.append("&room_id=");
        LIZ2.append(l2);
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLILLLLZI.LJLIL, UriProtector.parse(new C32364Cn2(X1D.LIZIZ(LIZ2)).LIZLLL()));
        return C76800UCe.LIZ;
    }
}
