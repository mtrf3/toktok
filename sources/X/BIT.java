package X;

import Y.IDCListenerS163S0200000_5;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BIT extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ BIR LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ C41071jL LJLJI;
    public final /* synthetic */ ViewGroup LJLJJI;
    public final /* synthetic */ ViewGroup LJLJJL;
    public final /* synthetic */ ViewGroup LJLJJLL;
    public final /* synthetic */ DataChannel LJLJL;
    public final /* synthetic */ Room LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BIT(BIR bir, Context context, C41071jL c41071jL, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, DataChannel dataChannel, Room room, String str) {
        super(0);
        this.LJLIL = bir;
        this.LJLILLLLZI = context;
        this.LJLJI = c41071jL;
        this.LJLJJI = viewGroup;
        this.LJLJJL = viewGroup2;
        this.LJLJJLL = viewGroup3;
        this.LJLJL = dataChannel;
        this.LJLJLJ = room;
        this.LJLJLLL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Long l;
        int i;
        User owner;
        BIR bir = this.LJLIL;
        Context context = this.LJLILLLLZI;
        C41071jL c41071jL = this.LJLJI;
        ViewGroup viewGroup = this.LJLJJI;
        ViewGroup viewGroup2 = this.LJLJJL;
        ViewGroup viewGroup3 = this.LJLJJLL;
        DataChannel dataChannel = this.LJLJL;
        Room room = this.LJLJLJ;
        String str = this.LJLJLLL;
        bir.getClass();
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LJIILLIIL(R.string.mml);
        c47071t1.LJFF(R.string.o_4);
        c47071t1.LJIIL(R.string.mmh, new BIV(bir, c41071jL, viewGroup, viewGroup2, viewGroup3, dataChannel, room, str));
        c47071t1.LJIIIZ(R.string.o_c, new BIY(c41071jL, bir, room, dataChannel, str));
        c47071t1.LJIJ = new IDCListenerS163S0200000_5(c41071jL, bir, 1);
        c47071t1.LJIILJJIL = false;
        BIR.LIZ(c47071t1.LIZ());
        BZI LIZ = C28787BRn.LIZ("livesdk_subscriber_only_live_popup_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(str, "show_entrance");
        LIZ.LJIJJ(str, "click_position");
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        if (room != null && (owner = room.getOwner()) != null && owner.isAnchorHasSubQualification()) {
            i = 1;
        } else {
            i = 0;
        }
        UFE.LIZIZ(1 ^ i, LIZ, "is_opt_in");
        bir.LJIIJJI(c41071jL, false, null);
        return C76800UCe.LIZ;
    }
}
