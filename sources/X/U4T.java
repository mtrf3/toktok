package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCP2PMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes14.dex */
public final class U4T extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ LinkLayerRTCP2PMessage LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4T(U66 u66, String str, LinkLayerRTCP2PMessage linkLayerRTCP2PMessage, String str2) {
        super(0);
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = linkLayerRTCP2PMessage;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Long l;
        Long l2;
        Long l3;
        Room LIZJ;
        Room LIZJ2;
        BZI LIZ = C28787BRn.LIZ("livesdk_linkmic_rtc_user_message");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "user_id");
        U66 u66 = this.LJLIL;
        String str = null;
        if (u66 != null && (LIZJ2 = u66.LIZJ()) != null) {
            l = Long.valueOf(LIZJ2.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "room_id");
        U66 u662 = this.LJLIL;
        if (u662 != null && (LIZJ = u662.LIZJ()) != null) {
            l2 = Long.valueOf(LIZJ.getOwnerUserId());
        } else {
            l2 = null;
        }
        LIZ.LJIJJ(l2, "anchor_id");
        U66 u663 = this.LJLIL;
        if (u663 != null) {
            l3 = Long.valueOf(u663.LJJLI());
        } else {
            l3 = null;
        }
        LIZ.LJIJJ(l3, "channel_id");
        U66 u664 = this.LJLIL;
        if (u664 != null) {
            str = u664.LLZLL();
        }
        LIZ.LJIJJ(str, "linkmic_id");
        LIZ.LJIJJ(this.LJLILLLLZI, "remote_linkmic_id");
        LIZ.LJIJJ(this.LJLJI.getMethod(), "message_method");
        LIZ.LJIJJ(this.LJLJJI, "type");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
